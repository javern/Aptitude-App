package com.aptitudeguru.dashboard;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import androidhive.dashboard.R;

public class TestPageallinone extends Activity implements OnClickListener {
	
 int ul=0;
	TextView t1,t2;
	RadioButton b1,b2,b3,b4;
	int count=1;
	int start=1;
	int min=0,sec=0,hours2=0;
	int index1=0,index=0,index3=0;
	int b[]=new int[200];
	int ans[]=new int[200];
	int ansindex=0;
	//NewsFeedActivity n=new NewsFeedActivity();
    String cat="";
	int click=0;
	int a[]=new int[200]; 
	int initial[]=new int[200];
	String ques[]=new String[200];
	String sol1[]=new String[200];
	String sol2[]=new String[200];
	String sol3[]=new String[200];
	
	String sol4[]=new String[200];
	int initans[]=new int[200];
	int givenans[]=new int[200];
	int gotoclick[]=new int[200];
	Random r=new Random();
	int STATIC_INTEGER_VALUE=1;
	 String PUBLIC_STATIC_STRING_IDENTIFIER;
	 final Context context = this;
	 String time;
	 
	 
	   Button btn_next ;
      Button btn_prev ;

	
	   DatabaseHandler db=new DatabaseHandler(this);

	  // String category="7777";
	   private CountDownTimer countDownTimer;
	   private CountDownTimer countDownTimer1;
	 
	   	 private boolean timerHasStarted = false;
	   	 private Button startB;
	   	 public TextView text;
	
	   	 private long starttime1=60*20 * 1000;
		 private  long milifin=0;
		 
		 int k1=0;
	
	   	 

		 	@Override
			protected void onPause() {
			    // Always call the superclass method first
		   		super.onPause();
		 
		   		countDownTimer.cancel();
		   		
			  
			    // Activity being restarted from stopped state    
			}
		   	 
		 	@Override
				protected void onResume() {
				    // Always call the superclass method first
		 	super.onResume();
			countDownTimer.cancel();
	 	
	 		if(k1==1)
	 		{
		 	timerHasStarted=false;
		 	
		 	 if (!timerHasStarted) {
			   	 //  countDownTimer.start();
		 		  countDownTimer= new MyCountDownTimer(starttime1, (1*1000));
		 		 timerHasStarted = true;
		 		
				   countDownTimer.start();
			   	   
			   	 //  startB.setText("STOP");
			   	  } else {
			   	   countDownTimer.cancel();
			   	   timerHasStarted = false;
			   	  // startB.setText("RESTART");
			   	  }
			 
		 
		 		
				    // Activity being restarted from stopped state 
	 		}
				}
			   	 
	   	@Override
		public void onBackPressed()
		{
		 Toast.makeText(getApplicationContext(), "You Cannot Exit",Toast.LENGTH_SHORT).show();
		}
	   @Override
       public void onActivityResult(int requestCode,int resultCode,Intent data)
       {
        super.onActivityResult(requestCode, resultCode, data);
        String extraData=data.getStringExtra("ComingFrom");
        int j1=Integer.parseInt(extraData);
     
        int j2=a[j1];
        click=j1;
        
       if(click==0)
       {
    	   btn_prev.setEnabled(false);
    	   btn_prev.setVisibility(View.INVISIBLE);
       }
       else
       {
    	   btn_next.setEnabled(true);
        	btn_prev.setEnabled(true);
        	btn_next.setVisibility(View.VISIBLE);
			btn_prev.setVisibility(View.VISIBLE);
       }
       if(click==((ul*10)-1))
       {
        	btn_next.setEnabled(false);
        	btn_next.setVisibility(View.INVISIBLE);
       }
       else
       {
    	   btn_prev.setEnabled(true);
    	   btn_next.setEnabled(true);
    	   btn_next.setVisibility(View.VISIBLE);
			btn_prev.setVisibility(View.VISIBLE);
       }
    	 b1.setChecked(false);
		 b2.setChecked(false);
		 b3.setChecked(false);
		 b4.setChecked(false);
		 
		 RadioGroup radiogroup=(RadioGroup)findViewById(R.id.options);
		 radiogroup.clearCheck();
			int check=b[click];
	        if(check==1)
	        	b1.setChecked(true);
	        else if(check==2)
	        	b2.setChecked(true);
	        else if (check==3)
	        	b3.setChecked(true);
	        else if (check==4)
	        	b4.setChecked(true);
	        else
	        {}
		
		 
		 
      //  QuantsTable q=db.getQuants(j2,cat);
        //i=i+1;
        String j= ques[j1];
        t1.setText(j);
        
        String opt1=sol1[j1];
        String opt2=sol2[j1];
        String opt3=sol3[j1];
        String opt4=sol4[j1];
        //t1.setText();
        b1.setText(opt1);
        b2.setText(opt2);
        b3.setText(opt3);
        b4.setText(opt4);
        t2.setText((j1+1)+"/"+(ul*10));
        
        
       }
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.all);
	        
	        Bundle bundle = getIntent().getExtras();
	         cat = bundle.getString("cat");
	      //  start=bundle.getInt("start");
	        int sel[]=bundle.getIntArray("selected");
	        
	       
	        	
	      
	        b1=(RadioButton) findViewById(R.id.option1);
	        b2=(RadioButton) findViewById(R.id.option2);
	        b3=(RadioButton) findViewById(R.id.option3);
	        b4=(RadioButton) findViewById(R.id.option4);
	        
	     
	      
	        
	        
	        
	       AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
	      
		     
			
			TextView title = new TextView(context);
           title.setText("Aptitude App");
           title.setBackgroundColor(Color.DKGRAY);
           title.setPadding(10, 10, 10, 10);
           title.setGravity(Gravity.CENTER);
           title.setTextColor(Color.WHITE);
           title.setTextSize(20);
           alertDialogBuilder.setCustomTitle(title);
			// set title
			//alertDialogBuilder.setTitle("Apptitude App");
 
			// set dialog message
			alertDialogBuilder
				.setMessage(" Start Test With Negative Marking (0.25)?")
				.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						 if (!timerHasStarted) {
						   	   countDownTimer.start();
						   	   k1=1;
						   	   timerHasStarted = true;
						   	 //  startB.setText("STOP");
						   	  } else {
						   	   countDownTimer.cancel();
						   	   timerHasStarted = false;
						   	  // startB.setText("RESTART");
						   	  }
							dialog.cancel();
					}
				  })
				.setNegativeButton("No",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
					
						TestPageallinone.this.finish();
						Intent i = new Intent(getApplicationContext(),AndroidDashboardDesignActivity.class);
						i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						//i.putExtra("cat", cat);
						startActivity(i);
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
			
	      
	        //timer code
	        
	        
	    	
	   	
	   	 
	   	
	   	//  startB = (Button) this.findViewById(R.id.button);
	   	 // startB.setOnClickListener( this);
	   
	   
	   	  
	   	  //text.setText(text.getText() + String.valueOf(startTime / 1000));
	   	 
	   	
	   	
	   	
	      /**
	         * Creating all buttons instances
	         * */
	        // Dashboard News feed button
	        Button btn_home = (Button) findViewById(R.id.btn_home);
	        
	        // Dashboard Friends button
	       
	        // Dashboard Messages button
	       
	        
	        // Dashboard Places button
	        Button btn_goto = (Button) findViewById(R.id.btn_goto);
	        
	        // Dashboard Events button
	        Button btn_help = (Button) findViewById(R.id.btn_help);
			
			btn_help.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(),
						help1.class);

					startActivity(i);
				}
			});
	        
	        Button btn_finish = (Button) findViewById(R.id.btn_finish);
	        
	        
	       
	        
	        /**
	         * Handling all button click events
	         * */
	       RadioGroup radiogroup=(RadioGroup)findViewById(R.id.options);
	      radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
			//RadioButton r1=(RadioButton)findViewById(R.id.option1);
				if(b1.isChecked())
				{
					b[click]=1;
					ans[click]=1;
					gotoclick[click]=1;
					////String j=1+"";
				//	btn_cal+j.setBackgroundColor(Color.RED);
					
				
				}
				else if(b2.isChecked())
				{
					b[click]=2;
					ans[click]=2;
					gotoclick[click]=1;
				}
				else if(b3.isChecked())
				{
					b[click]=3;
					ans[click]=3;
					gotoclick[click]=1;
				}
				else if(b4.isChecked())
				{
					b[click]=4;
					ans[click]=4;
					gotoclick[click]=1;
				}
				else
				{}
				
				
				
			}
			
		
			
		});
	        
	        
	        
	        
	        btn_finish.setOnClickListener(new OnClickListener() {
	        	 
	    		@Override
	    		public void onClick(View arg0) {
	     
	    			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
	     
	    			
	    			TextView title = new TextView(context);
		            title.setText("Aptitude App");
		            title.setBackgroundColor(Color.DKGRAY);
		            title.setPadding(10, 10, 10, 10);
		            title.setGravity(Gravity.CENTER);
		            title.setTextColor(Color.WHITE);
		            title.setTextSize(20);
		            alertDialogBuilder.setCustomTitle(title);

	    			
	    			// set title
	    		//alertDialogBuilder.setTitle();
	     
	    			// set dialog message
	    			alertDialogBuilder
	    				.setMessage("Click yes to exit!")
	    				.setCancelable(false)
	    				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
	    					public void onClick(DialogInterface dialog,int id) {
	    						// if this button is clicked, close
	    						// current activity
	    						Intent i = new Intent(getApplicationContext(), showscoreallinone.class);
	    					    time=text.getText()+"";
	    					  
	    					    sec=sec+40;
	    					    
	    					    if(hours2 == 01)
	    					    	min=min+60;
	    					    String timetaken=min+"."+sec+"";
	    					    double timetak=Float.parseFloat(timetaken);
	    					    
	    					  
	    					    double tt=(ul*10.00)-timetak;
	    					    
	    					  DecimalFormat df = new DecimalFormat("00.00");
	    					    String j=df.format(tt);
	    					   
	    					    
	    						i.putExtra("score", ans);
	    						i.putExtra("givenans", initans);
	    						i.putExtra("allid", a);
	    						i.putExtra("tt", j);
	    						i.putExtra("ul", ul);
	    						i.putExtra("ques", ques);
	    						i.putExtra("sol1", sol1);
	    					     i.putExtra("sol2", sol2);
	    						i.putExtra("sol3", sol3);
	    						i.putExtra("sol4", sol4);
	    					
	    	                
	    	                
	    						//i.putExtra("category", cat);
	    						
	          					startActivity(i);
	    						TestPageallinone.this.finish();
	    					}
	    				  })
	    				.setNegativeButton("No",new DialogInterface.OnClickListener() {
	    					public void onClick(DialogInterface dialog,int id) {
	    						// if this button is clicked, just close
	    						// the dialog box and do nothing
	    						dialog.cancel();
	    					}
	    				});
	     
	    				// create alert dialog
	    				AlertDialog alertDialog = alertDialogBuilder.create();
	     
	    				// show it
	    				alertDialog.show();
	    			}
	    		});
	    	
	        
	       // Listening Friends button click
	       
	        // Listening Messages button click
	      
	        
	        // Listening to Places button click
	        btn_goto.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(),CalAllInOne.class);   
					i.putExtra("gotoclick", gotoclick);
					i.putExtra("click",click);
					i.putExtra("ul",ul);
					startActivityForResult(i, STATIC_INTEGER_VALUE);
				}
			});
	        
	        // Listening to Events button click
	   
	        Button btn_pause = (Button) findViewById(R.id.btn_pause);
	        btn_pause.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), TestPause.class);
					i.putExtra("cat", cat);
					startActivity(i);
				}
			});
	        Log.d("outside","outside");
	        if(sel[0]==1)
	        {
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        	ul++;
	        	List<QuantsTable> quants = db.getAllQuants();
	        	int ids[]=new int[quants.size()];
	        	int index1=0;
	    		if (quants.isEmpty())
	    		{}
	    		else {
	    			for (QuantsTable cn : quants) {
                         ids[index1++]=cn.getID();
	    				
	    			}

	    		}
	        	
	        	Random r=new Random();
	        	count=r.nextInt(80);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        		int count1=r.nextInt(5);
		        	count=((count+count1)%200)+1;
	        	   
	        	QuantsTable cn=db.getQuants(ids[count]);
	        	
	        	int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			     a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }       
	        if(sel[1]==1)
	        {
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        	ul++;
	        	List<CTable> quants = db.getAllC();
	        	int ids[]=new int[quants.size()];
	        	int index1=0;
	    		if (quants.isEmpty())
	    			Log.d("empty", "empty");
	    		else {
	    			for (CTable cn : quants) {
                         ids[index1++]=cn.getID();
	    				
	    			}

	    		}
	        	Random r=new Random();
	        	count=r.nextInt(200);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        		int count1=r.nextInt(5);
		        	count=((count+count1)%200)+1;
		        	 Log.d("c count",count+"");
	        CTable cn=db.getC(ids[count]);
	        	//Log.d("insidee","insidee");
	        	int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			     a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }       
	        if(sel[2]==1)
	        {ul++;
	        
	        List<CppTable> quants = db.getAllCpp();
        	int ids[]=new int[quants.size()];
        	int index1=0;
    		if (quants.isEmpty())
    			Log.d("empty", "empty");
    		else {
    			for (CppTable cn : quants) {
                     ids[index1++]=cn.getID();
    				
    			}

    		}
	       	        	
	        	Random r=new Random();
	        	count=r.nextInt(100);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        		int count1=r.nextInt(5);
		        	count=((count+count1)%100)+1;
		        	
	        	CppTable cn=db.getCpp(ids[count]);
	     
	        	int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			     a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }       
	        if(sel[3]==1)
	        {ul++;
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        List<JavaTable> quants = db.getAllJava();
        	int ids[]=new int[quants.size()];
        	int index1=0;
    		if (quants.isEmpty())
    			Log.d("empty", "empty");
    		else {
    			for (JavaTable cn : quants) {
                     ids[index1++]=cn.getID();
    				
    			}

    		}
	        	Random r=new Random();
	        	count=r.nextInt(150);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        	  int count1=r.nextInt(5);
	        	  count=((count+count1)%100)+1;
	        	  
	        	JavaTable cn=db.getJava(ids[count]);
	        	
	        int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			     a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }       
	        if(sel[4]==1)
	        {
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        	ul++;
	        	  List<HTMLTable> quants = db.getAllHTML();
	          	int ids[]=new int[quants.size()];
	          	int index1=0;
	      		if (quants.isEmpty())
	      			Log.d("empty", "empty");
	      		else {
	      			for (HTMLTable cn : quants) {
	                       ids[index1++]=cn.getID();
	      				
	      			}

	      		}
	        	Random r=new Random();
	        	count=r.nextInt(5);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        	int count1=r.nextInt(3);
	        	count=((count1+count)%30)+1;
	        	 
	        	HTMLTable cn=db.getHTML(ids[count]);
	        	
	        	int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			     a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        } 
	        if(sel[5]==1)
	        {
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        	ul++;
	        	  List<VLTable> quants = db.getAllVL();
	          	int ids[]=new int[quants.size()];
	          	int index1=0;
	      		if (quants.isEmpty())
	      			Log.d("empty", "empty");
	      		else {
	      			for (VLTable cn : quants) {
	                       ids[index1++]=cn.getID();
	      				
	      			}

	      		}
	        	Random r=new Random();
	        	count=r.nextInt(40);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        	int count1=r.nextInt(6);
	        	count=((count1+count)%100)+1;
	        	
	        	VLTable cn=db.getVL(ids[count]);
	        	
	        	int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			   a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }  
	        if(sel[6]==1)
	        {
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        	ul++;
	        	  List<OSTable> quants = db.getAllOS();
	          	int ids[]=new int[quants.size()];
	          	int index1=0;
	      		if (quants.isEmpty())
	      			Log.d("empty", "empty");
	      		else {
	      			for(OSTable cn : quants) {
	                       ids[index1++]=cn.getID();
	      				
	      			}

	      		}
	        	Random r=new Random();
	        	count=r.nextInt(8);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        	int count1=r.nextInt(3);
	        	count=((count1+count)%30)+1;
	        	
	        	OSTable cn=db.getOS(ids[count]);
	        
	        	int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			    a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }  
	        if(sel[7]==1)
	        {
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        	ul++;
	        	  List<DBMSTable> quants = db.getAllDBMS();
	          	int ids[]=new int[quants.size()];
	          	int index1=0;
	      		if (quants.isEmpty())
	      			Log.d("empty", "empty");
	      		else {
	      			for (DBMSTable cn : quants) {
	                       ids[index1++]=cn.getID();
	      				
	      			}

	      		}
	        	Random r=new Random();
	        	count=r.nextInt(8);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        	int count1=r.nextInt(3);
	        	count=((count1+count)%30)+1;
	        	
	        	DBMSTable cn=db.getDBMS(ids[count]);
	        
	        int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			    a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }  
	        if(sel[8]==1)
	        {
	       // int g=0;
	      // List<QuantsTable> quants = db.getAllQuants(cat);       
	     //   for (QuantsTable cn : quants) {
	        	
	        	//if(g==22)
	        	//	break;
	        	//else
	        	//{
	        	//	g++;
	        	ul++;
	        	  List<DSATable> quants = db.getAllDSA();
	          	int ids[]=new int[quants.size()];
	          	int index1=0;
	      		if (quants.isEmpty())
	      			Log.d("empty", "empty");
	      		else {
	      			for (DSATable cn : quants) {
	                       ids[index1++]=cn.getID();
	      				
	      			}

	      		}
	        	Random r=new Random();
	        	count=r.nextInt(8);
	        	count=count+1;
	        	for(int i=0;i<10;i++)
	        	{
	        	int count1=r.nextInt(3);
	        	count=((count1+count)%30)+1;
	        	
	        	DSATable cn=db.getDSA(ids[count]);
	       
	        	int k=cn.getID();
	        	ques[index3]=cn.getQues();
	        	sol1[index3]=cn.getOption1();
	        	sol2[index3]=cn.getOption2();
	        	sol3[index3]=cn.getOption3();
	        	sol4[index3]=cn.getOption4();
	        	String sol1=cn.getSol();
	        	int sol=0;
	        	if(sol1.equalsIgnoreCase("a"))
	        		sol=1;
	        	else if(sol1.equalsIgnoreCase("b"))
	        		sol=2;
	        	else if(sol1.equalsIgnoreCase("c"))
	        		sol=3;
	        	else
	        		sol=4;
	        	//int j=r.nextInt(2);
	        	//int k=(count+j+1);
			   //  count=k;
			  a[index3]=k;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }  
	       final long startTime =   60*(ul*10)* 1000;
		   final long interval = 1 * 1000;
	        
	        //create button instances
			  text = (TextView) this.findViewById(R.id.timer);
		   	  countDownTimer = new MyCountDownTimer(startTime, interval);
	        count=r.nextInt(3);
	        count=count+1;
	      
	        t1=(TextView) findViewById(R.id.textView1);
	        t2=(TextView) findViewById(R.id.questrack);
	        
	        
	        btn_next = (Button) findViewById(R.id.btn_next);
	        btn_prev = (Button) findViewById(R.id.btn_prev);
	       
	    
	       // QuantsTable q=db.getQuants(initial[count],cat);
	        QuantsTable q=db.getQuants(5,"q1");
	       
	      a[index++]=initial[count];
	       givenans[0]=initans[count];
	       t2.setText("1/"+(ul*10));
	        String j= ques[0];
	        String opt1=sol1[0];
	        String opt2=sol2[0];
	        String opt3=sol3[0];
	        String opt4=sol4[0];
	        t1.setText(j);
	        b1.setText(opt1);
	        b2.setText(opt2);
	        b3.setText(opt3);
	        b4.setText(opt4);
	        btn_next.setVisibility(View.VISIBLE);
	     			btn_prev.setVisibility(View.INVISIBLE);
	        
	        for(int i=0;i<index3;i++)
	        	
	        
  btn_next.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					if(click==((ul*10)-1))
					{
						btn_next.setEnabled(false);
						btn_next.setVisibility(View.INVISIBLE);
					    
					}
					    else
					{
					    
						btn_next.setEnabled(true);
						btn_prev.setEnabled(true);
						btn_next.setVisibility(View.VISIBLE);
						btn_prev.setVisibility(View.VISIBLE);
						b1.setChecked(false);
						 b2.setChecked(false);
						 b3.setChecked(false);
						 b4.setChecked(false);
						 RadioGroup radiogroup=(RadioGroup)findViewById(R.id.options);
						 radiogroup.clearCheck();
						
						 
					
					
						
						 
						
						
					
						
					    //  radiogroup.setosetOnCheckedChangeListener(this);
					
					 click=click+1;
					
					
					 int val=a[click];
					int check=b[click];
				        if(check==1)
				        	b1.setChecked(true);
				        else if(check==2)
				        	b2.setChecked(true);
				        else if (check==3)
				        	b3.setChecked(true);
				        else if (check==4)
				        	b4.setChecked(true);
				        else
				        {}
					 t2.setText((click+1)+"/"+(ul*10));
				     
					// QuantsTable q=db.getQuants(val,cat);
				        //i=i+1;
				        String j= ques[click];
				        t1.setText(j);
				        
				        String opt1=sol1[click];
				        String opt2=sol2[click];
				        String opt3=sol3[click];
				        String opt4=sol4[click];
				        //t1.setText();
				        b1.setText(opt1);
				        b2.setText(opt2);
				        b3.setText(opt3);
				        b4.setText(opt4);
				        
				    	
					}
				        
				}
			});
  
  btn_prev.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View view) {
			if(click==0)
			{
		        btn_prev.setEnabled(false);
		        
				btn_prev.setVisibility(View.INVISIBLE);
		    
			    
			}
			    else
			{   
				
				btn_prev.setEnabled(true);
				
			     btn_next.setEnabled(true);
			     btn_next.setVisibility(View.VISIBLE);
					btn_prev.setVisibility(View.VISIBLE);
			    
				 b1.setChecked(false);
				 b2.setChecked(false);
				 b3.setChecked(false);
				 b4.setChecked(false);
				 RadioGroup radiogroup=(RadioGroup)findViewById(R.id.options);
				 radiogroup.clearCheck();
				
				 click=click-1;
		      int val=a[click];
		      int check=b[click];
		        if(check==1)
		        	b1.setChecked(true);
		        else if(check==2)
		        	b2.setChecked(true);
		        else if (check==3)
		        	b3.setChecked(true);
		        else if (check==4)
		        	b4.setChecked(true);
		        else
		        {}
		    
		      t2.setText((click+1)+"/"+(ul*10));
		      String j= ques[click];
		        t1.setText(j);
		        
		        String opt1=sol1[click];
		        String opt2=sol2[click];
		        String opt3=sol3[click];
		        String opt4=sol4[click];
		        //t1.setText();
		        b1.setText(opt1);
		        b2.setText(opt2);
		        b3.setText(opt3);
		        b4.setText(opt4);
		     
		        
		      
			} 
		}
	});
  

	        
	 }
	   public void onClick(View v) {
		   	  if (!timerHasStarted) {
		   	   countDownTimer.start();
		   	   timerHasStarted = true;
		   	//   startB.setText("STOP");
		   	  } else {
		   	   countDownTimer.cancel();
		   	   timerHasStarted = false;
		   	 //  startB.setText("RESTART");
		   	  }
		   	 }
		   	 
		   	 public class MyCountDownTimer extends CountDownTimer {
		   	  public MyCountDownTimer(long startTime, long interval) {
		   	   super(startTime, interval);
		   	  }

		   	  @Override
		   	  public void onFinish() {
		   	   text.setText("Time's up!");
		         	AlertDialog alertDialog = new AlertDialog.Builder(
                    TestPageallinone.this).create();

              
	     
	    			
	    			TextView title = new TextView(context);
		            title.setText("Aptitude App");
		            title.setBackgroundColor(Color.DKGRAY);
		            title.setPadding(10, 10, 10, 10);
		            title.setGravity(Gravity.CENTER);
		            title.setTextColor(Color.WHITE);
		            title.setTextSize(20);
		            alertDialog.setCustomTitle(title);
		         	
		            
                   // Setting Dialog Title
                 // alertDialog.setTitle("Apptitude App");

                  // Setting Dialog Message
                  alertDialog.setMessage("TIME'S UP");
                
                  // Setting Icon to Dialog
                  alertDialog.setIcon(R.drawable.about);

                  // Setting OK Button
                  alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                	  public void onClick(DialogInterface dialog, int which) {
                		  // Write your code here to execute after dialog closed
                		  Intent i = new Intent(getApplicationContext(), showscoreallinone.class);
                		  time=text.getText()+"";
	    					 
  					    sec=sec+40;
  					    String timetaken=min+"."+sec+"";
  					    
  					   
  					    double timetak=Float.parseFloat(timetaken);
  					    
  					   
  					    double tt=(ul*10.00)-timetak;
  					    
  					  DecimalFormat df = new DecimalFormat("##.##");
  					    String j=df.format(tt);
  					   // Log.d("foramted tt",tt+"");
  					  //  String j=String.format("%.2g%n",tt);
  					  //  Log.d("tt", j+"");
  					    
  					    
  						i.putExtra("score", ans);
  						i.putExtra("givenans", initans);
  						i.putExtra("allid", a);
  						i.putExtra("tt", j);
  						i.putExtra("ul", ul);
  						i.putExtra("ques", ques);
  						i.putExtra("sol1", sol1);
  					     i.putExtra("sol2", sol2);
  						i.putExtra("sol3", sol3);
  						i.putExtra("sol4", sol4);
  					
  	                
  	                
  						//i.putExtra("category", cat);
        					startActivity(i);
  						TestPageallinone.this.finish();
                		  
                	  }
    });

    // Showing Alert Message
    alertDialog.show();
		   	   
		   	  }
		   	
		   	  @Override

		   	  public void onTick(long millisUntilFinished) {
		   		 int seconds = (int) (millisUntilFinished / 1000) % 60 ;
		   	    int minutes = (int) ((millisUntilFinished / (1000*60)) % 60);
		   	  int hours = (int) ((millisUntilFinished / (1000*60*60)) % 24); 
		   	 milifin=millisUntilFinished;
		   	 starttime1=milifin;
		   	    min=minutes;
		   	    sec=seconds;
		   	   
		   	 String hours1=String.format("%02d", hours);
		   	 String minutes1=String.format("%02d", minutes);
		   	    String sec1=String.format("%02d", seconds);
		   	 hours2=Integer.parseInt(hours1);
		   	 //   tvTimerLabel.setVisibility(View.VISIBLE);
		   	    text.setText((hours1)+":"+(minutes1)+":"+(sec1)+"");      
		   	 //  text.setText("" + millisUntilFinished / 1000);
		   	
		   	  }

		   	 }


}
