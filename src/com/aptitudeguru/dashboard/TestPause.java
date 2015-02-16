package com.aptitudeguru.dashboard;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class TestPause extends Activity
{
	String PUBLIC_STATIC_STRING_IDENTIFIER;
	int gotoclick[] = new int[20];

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pause);
		
		
		Button btn_resume = (Button) findViewById(R.id.btn_resume);
		btn_resume.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				TestPause.this.finish();
				
				
			}
		});
		

	}
	
}
