package com.android.emergencyready;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.gson.GsonFactory;
import com.googleappengine.emergencyreadybackend.entity.policelineendpoint.Policelineendpoint;
import com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.CollectionResponsePoliceLine;
import com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine;

public class PoliceLineListActivity extends ListActivity {

	private TextView tv = null;
    private ArrayList<Map<String,String>> list = null;
    private SimpleAdapter adapter = null;
    private String[] from = { "stationCity", "stationName" };
    private int[] to = { android.R.id.text1, android.R.id.text2 };
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listpolicelineactivity);
        tv = new TextView(this);
        tv.setText("List of Famous Police Line");
        tv.setGravity(Gravity.CENTER);
        getListView().addHeaderView(tv);
        new PoliceLineListAsyncTask(this).execute();
    }
    
    private class PoliceLineListAsyncTask extends AsyncTask<Void, Void, CollectionResponsePoliceLine>{
        Context context;
        private ProgressDialog pd;

        public PoliceLineListAsyncTask(Context context) {
          this.context = context;
        }
        
        protected void onPreExecute(){ 
           super.onPreExecute();
                pd = new ProgressDialog(context);
                pd.setMessage("Retrieving Police Line...");
                pd.show();    
        }

        protected CollectionResponsePoliceLine doInBackground(Void... unused) {
                CollectionResponsePoliceLine policeline = null;
          try {
                  Policelineendpoint.Builder builder = new Policelineendpoint.Builder(AndroidHttp.newCompatibleTransport(), new GsonFactory(), null);
                  Policelineendpoint service =  builder.build();
                      policeline = service.listPoliceLine().execute();
          } catch (Exception e) {
            Log.d("Could not retrieve Police Line", e.getMessage(), e);
          }
          return policeline;
        }

        protected void onPostExecute(CollectionResponsePoliceLine pl) {
                pd.dismiss();
          // Do something with the result.
                  ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
                  
                  List<PoliceLine> _list = pl.getItems();
                      for (PoliceLine record : _list) {
                              HashMap<String, String> item = new HashMap<String, String>();
                              item.put("stationCity", record.getStationCity());
                              item.put("stationName", record.getStationName());
//                              item.put("city", record.getStationCity());
//                              item.put("contact", record.getContactNumber());
                           list.add(item);
                      }
                      adapter = new SimpleAdapter(PoliceLineListActivity.this, list,android.R.layout.simple_list_item_2, from, to);
                      setListAdapter(adapter);
        }
      }
}
