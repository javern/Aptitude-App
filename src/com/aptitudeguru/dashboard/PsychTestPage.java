package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidhive.dashboard.R;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

import com.aptitudeguru.dashboard.TestPage.MyCountDownTimer;

public class PsychTestPage extends Activity 
{
	TextView t1, t2;
	TextView tAnswer1;
	int count = 1;
	int start = 1;
	int quesvisible = 0;
	static int min = 0, sec = 0;;
	int index1 = 0, index = 0, index3 = 0;
	int b[] = new int[40];
	int ans[] = new int[40];
	int ansindex = 0;
	// NewsFeedActivity n=new NewsFeedActivity();
	String cat = "";
	int click = 0;
	int a[] = new int[40];
	int initial[] = new int[40];
	int initans[] = new int[40];
	int givenans[] = new int[40];
	int gotoclick[] = new int[20];
	Random r = new Random();
	int STATIC_INTEGER_VALUE = 1;
	String PUBLIC_STATIC_STRING_IDENTIFIER;
	final Context context = this;
	String time;

	Button btn_next;
	Button btn_prev;

	DatabaseHandler db = new DatabaseHandler(this);
	
	public TextView text;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_psych);

		tAnswer1 = (TextView) findViewById(R.id.psychAnswerBox1);

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

		TextView title = new TextView(context);
		title.setText("Aptitude App");
		title.setBackgroundColor(Color.DKGRAY);
		title.setPadding(10, 10, 10, 10);
		title.setGravity(Gravity.CENTER);
		title.setTextColor(Color.WHITE);
		title.setTextSize(20);
		alertDialogBuilder.setCustomTitle(title);

		// set title
		// alertDialogBuilder.setTitle("Apptitude App");

		// set dialog message
		alertDialogBuilder
				.setMessage("Start Test?")
				.setCancelable(false)
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						})
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing

						PsychTestPage.this.finish();
					}
				});

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();

		/**
		 * Creating all buttons instances
		 * */
		// Dashboard News feed button
		Button btn_home = (Button) findViewById(R.id.btn_home);

		// Dashboard Friends button
		Button btn_fav = (Button) findViewById(R.id.btn_fav);

		// Dashboard Messages button
		Button btn_hint = (Button) findViewById(R.id.btn_hint);

		// Dashboard Places button
		Button btn_goto = (Button) findViewById(R.id.btn_goto);

		// Dashboard Events button
		Button btn_help = (Button) findViewById(R.id.btn_help);

		btn_help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), help1.class);

				startActivity(i);
			}
		});

		Button btn_finish = (Button) findViewById(R.id.btn_finish);

/*		// PAUSE TEST CODE
		Button btn_pause = (Button) findViewById(R.id.btn_pause);
		btn_pause.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), TestPause.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});*/

		btn_finish.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

				TextView title = new TextView(context);
				title.setText("Aptitude App");
				title.setBackgroundColor(Color.DKGRAY);
				title.setPadding(10, 10, 10, 10);
				title.setGravity(Gravity.CENTER);
				title.setTextColor(Color.WHITE);
				title.setTextSize(20);
				alertDialogBuilder.setCustomTitle(title);

				// set title
				// alertDialogBuilder.setTitle();

				// set dialog message
				alertDialogBuilder
						.setMessage("Click yes to exit!")
						.setCancelable(false)
						.setPositiveButton("Yes",
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,
											int id) {
										// if this button is clicked, close
										// current activity
										Intent i = new Intent(
												getApplicationContext(),
												ShowScore.class);
										time = text.getText() + "";

										sec = sec + 40;
										String timetaken = min + "." + sec + "";

										double timetak = Float
												.parseFloat(timetaken);

										double tt = 20.00 - timetak;

										DecimalFormat df = new DecimalFormat(
												"00.00");
										String j = df.format(tt);

										i.putExtra("score", ans);
										i.putExtra("givenans", givenans);
										i.putExtra("allid", a);
										i.putExtra("tt", j);
										i.putExtra("category", cat);

										startActivity(i);
										PsychTestPage.this.finish();
									}
								})
						.setNegativeButton("No",
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,
											int id) {
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
/*
		// Listening Messages button click
		btn_hint.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Hint.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		// Listening to Places button click
		btn_goto.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Calender.class);
				i.putExtra("gotoclick", gotoclick);
				i.putExtra("click", click);
				startActivityForResult(i, STATIC_INTEGER_VALUE);
			}
		});

		// Listening to Events button click

		int g = 0;
		List<QuantsTable> quants = db.getAllQuants(cat);
		for (QuantsTable cn : quants) {

			if (g == 38)
				break;
			else {
				g++;

				count = cn.getID();
				String sol1 = cn.getSol();
				int sol = 0;
				if (sol1.equalsIgnoreCase("a"))
					sol = 1;
				else if (sol1.equalsIgnoreCase("b"))
					sol = 2;
				else if (sol1.equalsIgnoreCase("c"))
					sol = 3;
				else
					sol = 4;
				// int j=r.nextInt(2);
				// int k=(count+j+1);
				// count=k;
				initial[index3] = count;
				initans[index3] = sol;
				index3 = index3 + 1;
			}
		}

		count = r.nextInt(3);
		count = count + 1;

		t1 = (TextView) findViewById(R.id.textView1);
		t2 = (TextView) findViewById(R.id.questrack);

		btn_next = (Button) findViewById(R.id.btn_next);
		btn_prev = (Button) findViewById(R.id.btn_prev);

		QuantsTable q = db.getQuants(initial[count], cat);

		a[index++] = initial[count];
		givenans[0] = initans[count];
		t2.setText("   " + "1/20");
		String j = q.getQues();
		String opt1 = q.getOption1();
		String opt2 = q.getOption2();
		String opt3 = q.getOption3();
		String opt4 = q.getOption4();
		t1.setText(j);
		btn_next.setVisibility(View.VISIBLE);
		btn_prev.setVisibility(View.INVISIBLE);
		for (int x = 1; x < 20; x++) {
			int k = (count + 1);
			count = k;
			a[index] = initial[k];
			givenans[index] = initans[k];
			index = index + 1;
		}*/
	}
}
