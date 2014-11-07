package com.android.emergencyready;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.gson.GsonFactory;
import com.googleappengine.emergencyreadybackend.entity.policelineendpoint.Policelineendpoint;
import com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine;

public class PoliceLineAddActivity extends Activity {

	EditText id, name, city, contact;
	Button add;
	
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.activity_addpolicelineactivity);
		
		id = (EditText) findViewById(R.id.editText1);
		name = (EditText) findViewById(R.id.editText2);
		city = (EditText) findViewById(R.id.editText3);
		contact = (EditText) findViewById(R.id.editText4);
		
		add = (Button) findViewById(R.id.button1);
		
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s_id = id.getText().toString().trim();
				String s_name = name.getText().toString().trim();
				String s_city = city.getText().toString().trim();
				String s_contact = contact.getText().toString().trim();
				
				if (s_id.length() == 0 || s_name.length() == 0 || s_city.length() == 0 || s_contact.length() == 0) {
					Toast.makeText(getApplicationContext(), "You need to provide values for all field", Toast.LENGTH_SHORT).show();
                    return;
				}
				
				//Go ahead and perform the transaction
                String[] params = {s_id,s_name, s_city, s_contact};
                new AddPoliceLineAsyncTask(PoliceLineAddActivity.this).execute(params);
			}
		});
	}
	
	private class AddPoliceLineAsyncTask extends AsyncTask<String, Void, PoliceLine>{
        Context context;
        private ProgressDialog pd;

        public AddPoliceLineAsyncTask(Context context) {
          this.context = context;
        }
        
        protected void onPreExecute(){ 
           super.onPreExecute();
                pd = new ProgressDialog(context);
                pd.setMessage("Adding the Quote...");
                pd.show();    
        }

        protected PoliceLine doInBackground(String... params) {
                PoliceLine response = null;
          try {
                  Policelineendpoint.Builder builder = new Policelineendpoint.Builder(AndroidHttp.newCompatibleTransport(), new GsonFactory(), null);
                  Policelineendpoint service =  builder.build();
                      PoliceLine policeline = new PoliceLine();
                      policeline.setStationId(Long.parseLong(params[0]));
                      policeline.setStationName(params[1]);
                      policeline.setStationCity(params[2]);
                      policeline.setContactNumber(params[3]);
                      
                      response = service.insertPoliceLine(policeline).execute();
          } catch (Exception e) {
            Log.d("Could not Add Quote", e.getMessage(), e);
          }
          return response;
        }

        protected void onPostExecute(PoliceLine quote) {
                //Clear the progress dialog and the fields
                pd.dismiss();
                id.setText("");
                name.setText("");
                city.setText("");
                contact.setText("");
                
                //Display success message to user
                Toast.makeText(getBaseContext(), "Police Line added succesfully", Toast.LENGTH_SHORT).show();
        }
      }
}
