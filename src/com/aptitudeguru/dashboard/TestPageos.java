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



public class TestPageos extends Activity implements OnClickListener {
	TextView t1,t2;
	RadioButton b1,b2,b3,b4;
	int count=1;
	int start=1;
	int index1=0,index=0,index3=0;
	int b[]=new int[40];
	int ans[]=new int[40];
	int ansindex=0;
	//NewsFeedActivity n=new NewsFeedActivity();
    String cat="";
	int click=0;
	int a[]=new int[40]; 
	int initial[]=new int[40];
	int initans[]=new int[40];
	int givenans[]=new int[40];
	int gotoclick[]=new int[20];
	Random r=new Random();
	int STATIC_INTEGER_VALUE=1;
	 String PUBLIC_STATIC_STRING_IDENTIFIER;
	 final Context context = this;
	 static int min=0,sec=0;
	 String time;
	 
	 
	   Button btn_next ;
      Button btn_prev ;

      private long starttime1=60*20 * 1000;
 	 private  long milifin=0;
 	 
 	 int k1=0;
	   DatabaseHandler db=new DatabaseHandler(this);

	  // String category="7777";
	   private CountDownTimer countDownTimer;
	   	 private boolean timerHasStarted = false;
	   	 private Button startB;
	   	 public TextView text;
	   	 private final long startTime = 60*20 * 1000;
	   	 private final long interval = 1 * 1000;
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
	 	 		  countDownTimer= new MyCountDownTimer(starttime1, interval);
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
        if(click==19)
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
		
		 
		 
        OSTable q=db.getOS(j2);
        //i=i+1;
        String j= q.getQues();
        t1.setText(j);
        t2.setText((j1+1)+"/20");
        String opt1=q.getOption1();
        String opt2=q.getOption2();
        String opt3=q.getOption3();
        String opt4=q.getOption4();
      
        b1.setText(opt1);
        b2.setText(opt2);
        b3.setText(opt3);
        b4.setText(opt4);
       
        
       }
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.testnohint);
	        
	      //  Bundle bundle = getIntent().getExtras();
	      //   cat = bundle.getString("cat");
	     //   start=bundle.getInt("start");
	       
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
				.setMessage("Start Test?")
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
					
						TestPageos.this.finish();
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
			
	      
	        //timer code
	        
	        
	    	
	   	
	   	 
	   	
	   	//  startB = (Button) this.findViewById(R.id.button);
	   	 // startB.setOnClickListener( this);
	   	  text = (TextView) this.findViewById(R.id.timer);
	   	  countDownTimer = new MyCountDownTimer(startTime, interval);
	   	//  text.setText(text.getText() + String.valueOf(startTime / 1000));
	   	 
	   	
	   	
	   	
	      /**
	         * Creating all buttons instances
	         * */
	        // Dashboard News feed button
	        Button btn_home = (Button) findViewById(R.id.btn_home);
	        
	        // Dashboard Friends button
	        Button btn_fav = (Button) findViewById(R.id.btn_fav);
	        
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
	    						Intent i = new Intent(getApplicationContext(), showscoreos.class);
	    						time=text.getText()+"";
		    					 
	    					    sec=sec+40;
	    					    String timetaken=min+"."+sec+"";
	    					    
	    					   
	    					    double timetak=Float.parseFloat(timetaken);
	    					    
	    					   
	    					    double tt=20.00-timetak;
	    					    
	    					  DecimalFormat df = new DecimalFormat("00.00");
	    					    String j=df.format(tt);
	    					    i.putExtra("tt", j);

	    						i.putExtra("score", ans);
	    						i.putExtra("givenans", givenans);
	    						i.putExtra("allid", a);
	    						i.putExtra("category", cat);
	          					startActivity(i);
	    						TestPageos.this.finish();
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
	        btn_fav.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					
									int val=a[click];
									OSTable q=db.getOS(val);
									String ques=q.getQues();
									String op1=q.getOption1();
									String op2=q.getOption2();
									String op3=q.getOption3();
									String op4=q.getOption4();
									String sol=q.getSol();
									db.addFav(new Favourite(ques,op1,op2,op3,op4,sol));
									
									 Toast.makeText(getApplicationContext(), "Added To Favourite",Toast.LENGTH_SHORT).show();
									
									
							
					
				}
			});
	        
	        // Listening Messages button click
	    
	        
	        // Listening to Places button click
	        btn_goto.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(),Calender.class);   
					i.putExtra("gotoclick", gotoclick);
					i.putExtra("click", click);
					startActivityForResult(i, STATIC_INTEGER_VALUE);
				}
			});
	        
	        // Listening to Events button click
	    
	        
	      
	        
	        int g=0;
	       List<OSTable> quants = db.getAllOS();       
	        for (OSTable cn : quants) {
	        	
	        	if(g==38)
	        		break;
	        	else
	        	{
	        		g++;
	        	Log.d("insidee","insidee");
	        	count=cn.getID();
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
			     initial[index3]=count;
			     initans[index3]=sol;
	          index3=index3+1;
	        	}
	        }       
	       
	        
	        //create button instances
	        count=r.nextInt(3);
	        count=count+1;
	      
	        t1=(TextView) findViewById(R.id.textView1);
	        t2=(TextView) findViewById(R.id.questrack);
	        
	        
	        btn_next = (Button) findViewById(R.id.btn_next);
	        btn_prev = (Button) findViewById(R.id.btn_prev);
	       
	    
	    
	       OSTable q=db.getOS(initial[count]);
	       
	      a[index++]=initial[count];
	       givenans[0]=initans[count];
	       t2.setText("1/20");
	        String j= q.getQues();
	        String opt1=q.getOption1();
	        String opt2=q.getOption2();
	        String opt3=q.getOption3();
	        String opt4=q.getOption4();
	        t1.setText(j);
	        b1.setText(opt1);
	        b2.setText(opt2);
	        b3.setText(opt3);
	        b4.setText(opt4);
	        btn_next.setVisibility(View.VISIBLE);
			btn_prev.setVisibility(View.INVISIBLE);
	        
	        
	      
	     for(int x=1;x<20;x++)
	      {
	    	  int  k=(count+1);
			    count=k;
			     a[index]=initial[k];
			     givenans[index]=initans[k];
			     index=index+1;
	      }
	        
  btn_next.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					if(click==19)
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
					 t2.setText((click+1)+"/20");
				  
					
					 OSTable q=db.getOS(val);
				        //i=i+1;
				        String j= q.getQues();
				        t1.setText(j);
				        
				        String opt1=q.getOption1();
				        String opt2=q.getOption2();
				        String opt3=q.getOption3();
				        String opt4=q.getOption4();
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
		     
		      OSTable q=db.getOS(val);
		        //i=i+1;
		        String j= q.getQues();
		        t1.setText(j);
		        t2.setText((click+1)+"/20");
		        String opt1=q.getOption1();
		        String opt2=q.getOption2();
		        String opt3=q.getOption3();
		        String opt4=q.getOption4();
		        t1.setText(j);
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
                    TestPageos.this).create();

              
	     
	    			
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
                		  Intent i = new Intent(getApplicationContext(), showscoreos.class);
                		  
                		  time=text.getText()+"";
	    					 
  					    sec=sec+40;
  					    String timetaken=min+"."+sec+"";
  					    
  					   
  					    double timetak=Float.parseFloat(timetaken);
  					    
  					   
  					    double tt=20.00-timetak;
  					    
  					  DecimalFormat df = new DecimalFormat("00.00");
  					    String j=df.format(tt);
  					    i.putExtra("tt", j);

  						i.putExtra("score", ans);
  						i.putExtra("givenans", givenans);
  						i.putExtra("allid", a);
						i.putExtra("category", cat);
        					startActivity(i);
  						TestPageos.this.finish();
                		  
                	  }
    });

    // Showing Alert Message
    alertDialog.show();
		   	   
		   	  }
		   	
		   	  @Override

		   	  public void onTick(long millisUntilFinished) {
		   		 int seconds = (int) (millisUntilFinished / 1000) % 60 ;
			   	    int minutes = (int) ((millisUntilFinished / (1000*60)) % 60);  
			   	 milifin=millisUntilFinished;
			   	 starttime1=milifin;
			   	
			   	 min=minutes;
			   	    sec=seconds;
			   	 //   tvTimerLabel.setVisibility(View.VISIBLE);
			   	    text.setText((minutes)+":"+(seconds)+"");      
			   	 //  text.setText("" + millisUntilFinished / 1000);
		   	  }

		   	 }


}
