package com.android.emergencyready;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button add, list, about;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);

		add = (Button) findViewById(R.id.button1);
		list = (Button) findViewById(R.id.button2);
		about = (Button) findViewById(R.id.button3);
		
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);                
                builder.setTitle("About Application");
                builder.setMessage("Emergency Ready\r\nVersion 1.0");
                builder.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                        
                        public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                        }
                });
                builder.show();
			}
		});
		
		//Event Listener for List Quotes button
        list.setOnClickListener(new OnClickListener() {
                
                @Override
                public void onClick(View v) {
                        Intent myIntent = new Intent(MainActivity.this, PoliceLineListActivity.class);
                        startActivity(myIntent);
                }
        });
        
        //Event Listener for Add Quote button
        add.setOnClickListener(new OnClickListener() {
                
                @Override
                public void onClick(View v) {
                        Intent myIntent = new Intent(MainActivity.this, PoliceLineAddActivity.class);
                        startActivity(myIntent);
                }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
