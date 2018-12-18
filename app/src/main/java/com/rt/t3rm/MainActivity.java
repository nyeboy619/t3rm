package com.rt.t3rm;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
		ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
				ab = getActionBar();
				ab.setDisplayShowHomeEnabled(true);
				ab.setTitle("T3R Mobile");
				Button signupBtn = findViewById(R.id.signup);
				
				
				
				
				
    }
		
		
		public void signUp(View v){
				Intent i = new Intent(this,Register.class);
				startActivity(i);
		}
}
