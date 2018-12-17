package com.rt.t3rm;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
				
				
				Button signupBtn = findViewById(R.id.signup);
				
				
				
				
				
    }
		
		
		public void signUp(View v){
				Intent i = new Intent(this,Register.class);
				startActivity(i);
		}
}
