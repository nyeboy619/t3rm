package com.rt.t3rm;
import android.app.*;
import android.content.*;
import android.view.*;
import android.view.View.*;
import android.os.*;
import android.widget.*;

public class DatePickDialog extends Dialog
{
		Button set;
		Button cancel;
		
		Context context;
		public DatePickDialog(Context context){
				super(context);
				this.context = context;
		}

		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
				// TODO: Implement this method
				super.onCreate(savedInstanceState);
				
				requestWindowFeature(Window.FEATURE_NO_TITLE);
				setContentView(R.layout.datepicker);
				
				DatePicker dp = findViewById(R.id.dp);
				
		}
		
		
}
