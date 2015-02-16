package com.aptitudeguru.dashboard;

import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;
import androidhive.dashboard.R;

public class FavPage extends Activity {
	TextView t1, t2, t3, t4, t5, t6;
	Button removefav;
	String ques, op1, op2, op3, op4, sol;
	int a[] = new int[100];
	int index, current, id;
	Button btn_next, btn_prev, btn_finish;
	final Context context = this;
	DatabaseHandler db = new DatabaseHandler(this);

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		List<Favourite> f6 = db.getAllFav();
		if (f6.isEmpty()) {
			setContentView(R.layout.nofav);

			Button btn_home = (Button) findViewById(R.id.btn_home);

			Button btn_fav = (Button) findViewById(R.id.btn_fav);

			
			Button btn_score = (Button) findViewById(R.id.btn_score);

			
			Button btn_about = (Button) findViewById(R.id.btn_about);
			Button btn_soundon = (Button) findViewById(R.id.btn_soundon);
			btn_soundon.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
					
					Intent i = new Intent(getApplicationContext(),
							Tutorialpage.class);
					startActivity(i);
				}
			});

			Button btn_help = (Button) findViewById(R.id.btn_help);
			
			btn_help.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
					
					Intent i = new Intent(getApplicationContext(),
						Help.class);

					startActivity(i);
				}
			});

			btn_home.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
							AndroidDashboardDesignActivity.class);
					i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
				}
			});

			
			btn_fav.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					
				}
			});

			
			btn_score.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
							scoremenu.class);
					startActivity(i);
				}
			});

			
			btn_about.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
							AboutUs.class);
					startActivity(i);
				}
			});

		} else {
			setContentView(R.layout.fav);
			t1 = (TextView) findViewById(R.id.quest_1);
			t2 = (TextView) findViewById(R.id.op_1);
			t3 = (TextView) findViewById(R.id.op_2);
			t4 = (TextView) findViewById(R.id.op_3);
			t5 = (TextView) findViewById(R.id.op_4);
			t6 = (TextView) findViewById(R.id.solution);
			Button btn_home = (Button) findViewById(R.id.btn_home);

			
			Button btn_score = (Button) findViewById(R.id.btn_score);

			
			Button btn_help = (Button) findViewById(R.id.btn_about);
			
			btn_help.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
						Help.class);

					startActivity(i);
				}
			});

			btn_home.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
							AndroidDashboardDesignActivity.class);
					i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
				}
			});

			
			btn_score.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
							scoremenu.class);
					startActivity(i);
				}
			});

		
			

			removefav = (Button) findViewById(R.id.btn_about);

		

			

			
			List<Favourite> f = db.getAllFav();
			int count = 1;
			if (f.isEmpty())
				count = 0;
			if (count != 0) {
				for (Favourite cn : f) {
					id = cn.getID();
					a[index++] = id;
					

				}

				for (int i = 0; i < index; i++)
					
				current = 0;
				int id1 = a[current];
				
				Favourite f1 = db.getFav(id1);
				
				ques = f1.getQues();
				
				op1 = f1.getOption1();
				op2 = f1.getOption2();
				op3 = f1.getOption3();
				op4 = f1.getOption4();
				sol = f1.getSol();
				t1.setText(ques);
				t2.setText("A." + op1);
				t3.setText("B." + op2);
				t4.setText("C." + op3);
				t5.setText("D." + op4);
				t6.setText("solution :" + sol);

				btn_next = (Button) findViewById(R.id.btn_next);
				btn_prev = (Button) findViewById(R.id.btn_prev);
				btn_finish = (Button) findViewById(R.id.btn_finish);
				btn_next.setEnabled(true);
				btn_prev.setEnabled(false);

				if (current == 0) {
					btn_prev.setEnabled(false);

				}

				btn_next.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						if (current == (index - 1)) {
							btn_next.setEnabled(false);

						} else {
							btn_next.setEnabled(true);
							btn_prev.setEnabled(true);

							current = current + 1;
							int val = a[current];
							Favourite f3 = db.getFav(val);
							ques = f3.getQues();
							op1 = f3.getOption1();
							op2 = f3.getOption2();
							op3 = f3.getOption3();
							op4 = f3.getOption4();
							sol = f3.getSol();
							t1.setText(ques);
							t2.setText("A." + op1);
							t3.setText("B." + op2);
							t4.setText("C." + op3);
							t5.setText("D." + op4);
							t6.setText("solution :" + sol);

						}
					}

				});

				btn_prev.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						if (current == 0) {
							btn_prev.setEnabled(false);

						} else {
							btn_next.setEnabled(true);
							btn_prev.setEnabled(true);

							current = current - 1;
							int val = a[current];
							Favourite f3 = db.getFav(val);
							ques = f3.getQues();
							op1 = f3.getOption1();
							op2 = f3.getOption2();
							op3 = f3.getOption3();
							op4 = f3.getOption4();
							sol = f3.getSol();
							t1.setText(ques);
							t2.setText("A." + op1);
							t3.setText("B." + op2);
							t4.setText("C." + op3);
							t5.setText("D." + op4);
							t6.setText("solution :" + sol);

						}

					}
				});

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

					
						alertDialogBuilder
								.setMessage("Click yes to exit!")
								.setCancelable(false)
								.setPositiveButton("Yes",
										new DialogInterface.OnClickListener() {
											public void onClick(
													DialogInterface dialog,
													int id) {

												FavPage.this.finish();
											}
										})
								.setNegativeButton("No",
										new DialogInterface.OnClickListener() {
											public void onClick(
													DialogInterface dialog,
													int id) {
												
												dialog.cancel();
											}
										});

						
						AlertDialog alertDialog = alertDialogBuilder.create();

						alertDialog.show();
					}
				});
			} else {
				t1.setText("No Favourite Question");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");

			}

			removefav.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {

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

					
					alertDialogBuilder
							.setMessage(
									"Do you want to remove this question from favourite?")
							.setCancelable(false)
							.setPositiveButton("Yes",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int id) {
											List<Favourite> f = db.getAllFav();
											if (f.isEmpty()) {
												Toast.makeText(
														getApplicationContext(),
														"No Questions To Remove",
														Toast.LENGTH_SHORT)
														.show();
											} else {
												int val = a[current];
												
												Favourite f3 = db.getFav(val);
												db.deletefav(f3);
												
												Intent i = new Intent(
														getApplicationContext(),
														FavPage.class);
												Toast.makeText(
														getApplicationContext(),
														"Removed From Favourite",
														Toast.LENGTH_LONG)
														.show();
												i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
												startActivity(i);
												finish();

											}
											dialog.cancel();

										}
									})
							.setNegativeButton("No",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int id) {
											
											dialog.cancel();
										}
									});

					
					AlertDialog alertDialog = alertDialogBuilder.create();

					
					alertDialog.show();

					
				}

			});
		}

	}
}
