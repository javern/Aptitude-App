package com.aptitudeguru.dashboard;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class Tquants extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_feed_layout);
		
		
		
		Button btn_q1 = (Button) findViewById(R.id.btn_q1);

		
		btn_q1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				  
	             
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec1.pdf");
	             try {
	                 in = assetManager.open("sec1.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec1.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				

			}
		});

		Button btn_q2 = (Button) findViewById(R.id.btn_q2);

		
		btn_q2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec2.pdf");
	             try {
	                 in = assetManager.open("sec2.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec2.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q4 = (Button) findViewById(R.id.btn_q4);

		 
		btn_q4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec4.pdf");
	             try {
	                 in = assetManager.open("sec4.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec4.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q5 = (Button) findViewById(R.id.btn_q5);

		 
		btn_q5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec5.pdf");
	             try {
	                 in = assetManager.open("sec5.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec5.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q6 = (Button) findViewById(R.id.btn_q6);

		 
		btn_q6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec6.pdf");
	             try {
	                 in = assetManager.open("sec6.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec6.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q7 = (Button) findViewById(R.id.btn_q7);

		 
		btn_q7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec7.pdf");
	             try {
	                 in = assetManager.open("sec7.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec7.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q8 = (Button) findViewById(R.id.btn_q8);

		 
		btn_q8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec8.pdf");
	             try {
	                 in = assetManager.open("sec8.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec8.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q10 = (Button) findViewById(R.id.btn_q10);

		 
		btn_q10.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec10.pdf");
	             try {
	                 in = assetManager.open("sec10.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec10.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q11 = (Button) findViewById(R.id.btn_q11);

		 
		btn_q11.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec11.pdf");
	             try {
	                 in = assetManager.open("sec11.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec11.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q12 = (Button) findViewById(R.id.btn_q12);

		 
		btn_q12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec12.pdf");
	             try {
	                 in = assetManager.open("sec12.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec12.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		 
		Button btn_q13 = (Button) findViewById(R.id.btn_q13);

		 
		btn_q13.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec13.pdf");
	             try {
	                 in = assetManager.open("sec13.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec13.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});

		/*Button btn_q14 = (Button) findViewById(R.id.btn_q1);

		 
		btn_q13.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec14.pdf");
	             try {
	                 in = assetManager.open("sec14.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec14.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});*/

		 
		Button btn_q15 = (Button) findViewById(R.id.btn_q15);

		 
		btn_q15.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				 
	             AssetManager assetManager = getAssets();

	             InputStream in = null;
	             OutputStream out = null;
	             File file = new File(getFilesDir(), "sec15.pdf");
	             try {
	                 in = assetManager.open("sec15.pdf");
	                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

	                 copyFile(in, out);
	                 in.close();
	                 in = null;
	                 out.flush();
	                 out.close();
	                 out = null;
	             } catch (Exception e) {
	                 Log.e("tag", e.getMessage());
	             }

	             Intent intent = new Intent(Intent.ACTION_VIEW);
	             intent.setDataAndType(
	                     Uri.parse("file://" + getFilesDir() + "/sec15.pdf"),
	                     "application/pdf");

	             startActivity(intent);
	   }
	             private void copyFile(InputStream in, OutputStream out) throws IOException {
	     	        byte[] buffer = new byte[1024];
	     	        int read;
	     	        while ((read = in.read(buffer)) != -1) {
	     	            out.write(buffer, 0, read);
	     	        }
	         
				
			}
		});
		 
		Button btn_q16 = (Button) findViewById(R.id.btn_q16);

		 
		btn_q16.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				   AssetManager assetManager = getAssets();

		             InputStream in = null;
		             OutputStream out = null;
		             File file = new File(getFilesDir(), "sec16.pdf");
		             try {
		                 in = assetManager.open("sec16.pdf");
		                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

		                 copyFile(in, out);
		                 in.close();
		                 in = null;
		                 out.flush();
		                 out.close();
		                 out = null;
		             } catch (Exception e) {
		                 Log.e("tag", e.getMessage());
		             }

		             Intent intent = new Intent(Intent.ACTION_VIEW);
		             intent.setDataAndType(
		                     Uri.parse("file://" + getFilesDir() + "/sec16.pdf"),
		                     "application/pdf");

		             startActivity(intent);
		   }
		             private void copyFile(InputStream in, OutputStream out) throws IOException {
		     	        byte[] buffer = new byte[1024];
		     	        int read;
		     	        while ((read = in.read(buffer)) != -1) {
		     	            out.write(buffer, 0, read);
		     	        }
		         
					
				}
			
		});

		 
		Button btn_q17 = (Button) findViewById(R.id.btn_q17);

		 
		btn_q17.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				   AssetManager assetManager = getAssets();

		             InputStream in = null;
		             OutputStream out = null;
		             File file = new File(getFilesDir(), "sec17.pdf");
		             try {
		                 in = assetManager.open("sec17.pdf");
		                 out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

		                 copyFile(in, out);
		                 in.close();
		                 in = null;
		                 out.flush();
		                 out.close();
		                 out = null;
		             } catch (Exception e) {
		                 Log.e("tag", e.getMessage());
		             }

		             Intent intent = new Intent(Intent.ACTION_VIEW);
		             intent.setDataAndType(
		                     Uri.parse("file://" + getFilesDir() + "/sec17.pdf"),
		                     "application/pdf");

		             startActivity(intent);
		   }
		             private void copyFile(InputStream in, OutputStream out) throws IOException {
		     	        byte[] buffer = new byte[1024];
		     	        int read;
		     	        while ((read = in.read(buffer)) != -1) {
		     	            out.write(buffer, 0, read);
		     	        }
		         
					
				
			}
		});
		Button btn_home = (Button) findViewById(R.id.btn_home);

		// Dashboard Friends button
		Button btn_fav = (Button) findViewById(R.id.btn_fav);

		// Dashboard Messages button
		Button btn_score = (Button) findViewById(R.id.btn_score);

		// Dashboard Places button
		Button btn_tutorial = (Button) findViewById(R.id.btn_soundon);

		// Dashboard Events button
		Button btn_about = (Button) findViewById(R.id.btn_about);
		Button btn_help = (Button) findViewById(R.id.btn_help);
		
		btn_help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(),
					Help.class);

				startActivity(i);
			}
		});

		/**
		 * Handling all button click events
		 * */

		// Listening to News Feed button click
		btn_home.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(),
						AndroidDashboardDesignActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		// Listening Friends button click
		btn_fav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(), FavPage.class);

				startActivity(i);
			}
		});

		// Listening Messages button click
		btn_score.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(), scoremenu.class);
				startActivity(i);
			}
		});

		 
		btn_tutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(),
						Tutorialpage.class);
				startActivity(i);
			}
		});

		// Listening to Events button click
		btn_about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(),
						AboutUs.class);
				startActivity(i);
			}
		});
		
		

		
	
			
		}

}
