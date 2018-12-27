package com.rt.t3rm;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class Register extends Activity
{
		DatePickerDialog dpd;
		
		EditText bday;

		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
				// TODO: Implement this method
				super.onCreate(savedInstanceState);
				setContentView(R.layout.register);
				 bday = findViewById(R.id.bday);
				 bday.setEnabled(false);
				dpd = new DatePickerDialog(this);
				dpd.setOnDateSetListener(new DatePickerDialog.OnDateSetListener(){

								@Override
								public void onDateSet(DatePicker p1, int p2, int p3, int p4)
								{
										// TODO: Implement this method
								}


						});
				
				
				
		}
		
		public void datePick(View v){
				
				dpd.show();
		  
		}
	}	
		

