package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;



public class CalAllInOne extends Activity {
	String PUBLIC_STATIC_STRING_IDENTIFIER;
	int gotoclick[] = new int[20];
	int click=0;
	
	@Override
	public void onBackPressed()
	{
		String id = click + "";
		
		

		Intent intent = new Intent(getApplicationContext(),
				TestPage.class);
		intent.putExtra("ComingFrom", id);
		setResult(RESULT_OK, intent);
		finish();
		

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Bundle bundle = getIntent().getExtras();
		
		int ul = bundle.getInt("ul");
		click=bundle.getInt("click");

		Log.d("ul", ul + "");
		if (ul == 1) {
			setContentView(R.layout.cal10);
			gotoclick = bundle.getIntArray("gotoclick");
            Button btn_cal[]=new Button[10];
            
            for(int i=0;i<10;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	 Log.d("btn_id",buttonID);
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_cal[i]= (Button) findViewById(resID);
            	    Log.d("btn_scorei",btn_cal[i]+"");
            }
			for(int i=0;i<10;i++)
			{
			if (gotoclick[i] == 1)
				btn_cal[i].setBackgroundColor(Color.YELLOW);
			}
			for(int i=0;i<10;i++)
			{
				final String id = i + "";
				btn_cal[i].setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						

						Intent intent = new Intent(getApplicationContext(),
								TestPage.class);
						intent.putExtra("ComingFrom", id);
						setResult(RESULT_OK, intent);
						finish();
					}
				});
			}

		
		} else if (ul == 2) {
			setContentView(R.layout.cal20);
			gotoclick = bundle.getIntArray("gotoclick");
            Button btn_cal[]=new Button[20];
            
            for(int i=0;i<20;i++)
            {
            	 String buttonID = "score" + (i+1) ;
            	 Log.d("btn_id",buttonID);
            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
            	    btn_cal[i]= (Button) findViewById(resID);
            	    Log.d("btn_scorei",btn_cal[i]+"");
            }
			for(int i=0;i<20;i++)
			{
			if (gotoclick[i] == 1)
				btn_cal[i].setBackgroundColor(Color.YELLOW);
			}
			for(int i=0;i<20;i++)
			{
				final String id = i + "";
				btn_cal[i].setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						

						Intent intent = new Intent(getApplicationContext(),
								TestPage.class);
						intent.putExtra("ComingFrom", id);
						setResult(RESULT_OK, intent);
						finish();
					}
				});
			}
			
	}
		else if (ul == 3) {
			setContentView(R.layout.cal30);
			gotoclick = bundle.getIntArray("gotoclick");
			
			 Button btn_cal[]=new Button[30];
	            
	            for(int i=0;i<30;i++)
	            {
	            	 String buttonID = "score" + (i+1) ;
	            	 Log.d("btn_id",buttonID);
	            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
	            	    btn_cal[i]= (Button) findViewById(resID);
	            	    Log.d("btn_scorei",btn_cal[i]+"");
	            }
				for(int i=0;i<30;i++)
				{
				if (gotoclick[i] == 1)
					btn_cal[i].setBackgroundColor(Color.YELLOW);
				}
				for(int i=0;i<30;i++)
				{
					final String id = i + "";
					btn_cal[i].setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View view) {
							

							Intent intent = new Intent(getApplicationContext(),
									TestPage.class);
							intent.putExtra("ComingFrom", id);
							setResult(RESULT_OK, intent);
							finish();
						}
					});
				}
			
			
					} else if (ul == 4) {
			setContentView(R.layout.cal40);
			gotoclick = bundle.getIntArray("gotoclick");
			 Button btn_cal[]=new Button[40];
	            
	            for(int i=0;i<40;i++)
	            {
	            	 String buttonID = "score" + (i+1) ;
	            	 Log.d("btn_id",buttonID);
	            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
	            	    btn_cal[i]= (Button) findViewById(resID);
	            	    Log.d("btn_scorei",btn_cal[i]+"");
	            }
				for(int i=0;i<40;i++)
				{
				if (gotoclick[i] == 1)
					btn_cal[i].setBackgroundColor(Color.YELLOW);
				}
				for(int i=0;i<40;i++)
				{
					final String id = i + "";
					btn_cal[i].setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View view) {
							

							Intent intent = new Intent(getApplicationContext(),
									TestPage.class);
							intent.putExtra("ComingFrom", id);
							setResult(RESULT_OK, intent);
							finish();
						}
					});
				}		
				} 
					
		
		else if (ul == 5) {
			setContentView(R.layout.cal50);
			gotoclick = bundle.getIntArray("gotoclick");
			 Button btn_cal[]=new Button[50];
	            
	            for(int i=0;i<50;i++)
	            {
	            	 String buttonID = "score" + (i+1) ;
	            	 Log.d("btn_id",buttonID);
	            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
	            	    btn_cal[i]= (Button) findViewById(resID);
	            	    Log.d("btn_scorei",btn_cal[i]+"");
	            }
				for(int i=0;i<50;i++)
				{
				if (gotoclick[i] == 1)
					btn_cal[i].setBackgroundColor(Color.YELLOW);
				}
				for(int i=0;i<50;i++)
				{
					final String id = i + "";
					btn_cal[i].setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View view) {
							

							Intent intent = new Intent(getApplicationContext(),
									TestPage.class);
							intent.putExtra("ComingFrom", id);
							setResult(RESULT_OK, intent);
							finish();
						}
					});
				}		} 
		else if (ul == 6) {
			setContentView(R.layout.cal60);
			gotoclick = bundle.getIntArray("gotoclick");
			
			
			
			
			 Button btn_cal[]=new Button[60];
	            
	            for(int i=0;i<60;i++)
	            {
	            	 String buttonID = "score" + (i+1) ;
	            	 Log.d("btn_id",buttonID);
	            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
	            	    btn_cal[i]= (Button) findViewById(resID);
	            	    Log.d("btn_scorei",btn_cal[i]+"");
	            }
				for(int i=0;i<60;i++)
				{
				if (gotoclick[i] == 1)
					btn_cal[i].setBackgroundColor(Color.YELLOW);
				}
				for(int i=0;i<60;i++)
				{
					final String id = i + "";
					btn_cal[i].setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View view) {
							

							Intent intent = new Intent(getApplicationContext(),
									TestPage.class);
							intent.putExtra("ComingFrom", id);
							setResult(RESULT_OK, intent);
							finish();
						}
					});
				}
		} else if (ul == 7) {
			setContentView(R.layout.cal70);
			gotoclick = bundle.getIntArray("gotoclick");
			
			 Button btn_cal[]=new Button[70];
	            
	            for(int i=0;i<70;i++)
	            {
	            	 String buttonID = "score" + (i+1) ;
	            	 Log.d("btn_id",buttonID);
	            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
	            	    btn_cal[i]= (Button) findViewById(resID);
	            	    Log.d("btn_scorei",btn_cal[i]+"");
	            }
				for(int i=0;i<70;i++)
				{
				if (gotoclick[i] == 1)
					btn_cal[i].setBackgroundColor(Color.YELLOW);
				}
				for(int i=0;i<70;i++)
				{
					final String id = i + "";
					btn_cal[i].setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View view) {
							

							Intent intent = new Intent(getApplicationContext(),
									TestPage.class);
							intent.putExtra("ComingFrom", id);
							setResult(RESULT_OK, intent);
							finish();
						}
					});
				}
			
			
			
				} else if (ul == 8) {
			setContentView(R.layout.cal80);
			gotoclick = bundle.getIntArray("gotoclick");
			 Button btn_cal[]=new Button[80];
	            
	            for(int i=0;i<80;i++)
	            {
	            	 String buttonID = "score" + (i+1) ;
	            	 Log.d("btn_id",buttonID);
	            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
	            	    btn_cal[i]= (Button) findViewById(resID);
	            	    Log.d("btn_scorei",btn_cal[i]+"");
	            }
				for(int i=0;i<80;i++)
				{
				if (gotoclick[i] == 1)
					btn_cal[i].setBackgroundColor(Color.YELLOW);
				}
				for(int i=0;i<80;i++)
				{
					final String id = i + "";
					btn_cal[i].setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View view) {
							

							Intent intent = new Intent(getApplicationContext(),
									TestPage.class);
							intent.putExtra("ComingFrom", id);
							setResult(RESULT_OK, intent);
							finish();
						}
					});
				}	
				} else if (ul == 9) {
			setContentView(R.layout.cal90);
			gotoclick = bundle.getIntArray("gotoclick");
			 Button btn_cal[]=new Button[90];
	            
	            for(int i=0;i<90;i++)
	            {
	            	 String buttonID = "score" + (i+1) ;
	            	 Log.d("btn_id",buttonID);
	            	    int resID = getResources().getIdentifier(buttonID, "id",getPackageName());
	            	    btn_cal[i]= (Button) findViewById(resID);
	            	    Log.d("btn_scorei",btn_cal[i]+"");
	            }
				for(int i=0;i<90;i++)
				{
				if (gotoclick[i] == 1)
					btn_cal[i].setBackgroundColor(Color.YELLOW);
				}
				for(int i=0;i<90;i++)
				{
					final String id = i + "";
					btn_cal[i].setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View view) {
							

							Intent intent = new Intent(getApplicationContext(),
									TestPage.class);
							intent.putExtra("ComingFrom", id);
							setResult(RESULT_OK, intent);
							finish();
						}
					});
				
	}

				}
	}
}
