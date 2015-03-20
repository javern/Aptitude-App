package com.aptitudeguru.dashboard;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.widget.Button;
import androidhive.dashboard.R;

public class Tutorialpage extends Activity implements OnTouchListener {

	final static float STEP = 200;
	TextView mytv;
	float mRatio = 1.0f;
	int mBaseDist;
	float mBaseRatio;
	float fontsize = 13;


	public boolean onTouchEvent(MotionEvent event) {
		if (event.getPointerCount() == 2) {
			int action = event.getAction();
			int pureaction = action & MotionEvent.ACTION_MASK;
			if (pureaction == MotionEvent.ACTION_POINTER_DOWN) {
				mBaseDist = getDistance(event);
				mBaseRatio = mRatio;
			} else {
				float delta = (getDistance(event) - mBaseDist) / STEP;
				float multi = (float) Math.pow(2, delta);
				mRatio = Math.min(1024.0f, Math.max(0.1f, mBaseRatio * multi));
				mytv.setTextSize(mRatio + 13);
			}
		}
		return true;
	}

	int getDistance(MotionEvent event) {
		int dx = (int) (event.getX(0) - event.getX(1));
		int dy = (int) (event.getY(0) - event.getY(1));
		return (int) (Math.sqrt(dx * dx + dy * dy));
	}

	public boolean onTouch(View v, MotionEvent event) {
		return false;
	}


	public void pdfcommon(String temp) {
    /*setContentView(R.layout.webview);
	webView = (WebView) findViewById(R.id.webView1);
	WebSettings settings = webView.getSettings();
	settings.setJavaScriptEnabled(true);
	//    		crash on tablet and unnecessary?
	settings.setAllowFileAccessFromFileURLs(true);
	settings.setAllowUniversalAccessFromFileURLs(true);
	settings.setBuiltInZoomControls(true);
	webView.setWebChromeClient(new WebChromeClient());
	webView.loadUrl("file:///android_asset/pdfviewer/index.html?pdf=" + temp);*/
	}

	private void copyFile(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		int read;
		while ((read = in.read(buffer)) != -1) {
			out.write(buffer, 0, read);
		}
	}


	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_layout);



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
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(),
						Help.class);

				startActivity(i);
			}
		});




		btn_home.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(), AndroidDashboardDesignActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});


		btn_fav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(), FavPage.class);

				startActivity(i);
			}
		});


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


			}
		});


		btn_about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(), AboutUs.class);
				startActivity(i);
			}
		});

		Button btn_quants = (Button) findViewById(R.id.btn_score_quants);

		Button btn_c=(Button) findViewById(R.id.btn_score_c);
		Button btn_cpp = (Button) findViewById(R.id.btn_score_cpp);
		Button btn_java=(Button) findViewById(R.id.btn_score_java);
		Button btn_os = (Button) findViewById(R.id.btn_score_os);
		Button btn_dbms = (Button) findViewById(R.id.btn_score_dbms);
		Button btn_dsa = (Button) findViewById(R.id.btn_score_datastructure);
		Button btn_html = (Button) findViewById(R.id.btn_score_html);
		Button btn_interview = (Button) findViewById(R.id.btn_score_interview);

		btn_quants.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

				Intent i = new Intent(getApplicationContext(),
						Tquants.class);
				startActivity(i);
			}
		});


			PDFReader.bindPDFButton(this, R.id.btn_score_c, "ctuts.pdf");
			PDFReader.bindPDFButton(this, R.id.btn_score_c, "ctuts.pdf");
			PDFReader.bindPDFButton(this, R.id.btn_score_java, "java.pdf");
			PDFReader.bindPDFButton(this, R.id.btn_score_html, "HTML.pdf");
			PDFReader.bindPDFButton(this, R.id.btn_score_os, "OS.pdf");
			PDFReader.bindPDFButton(this, R.id.btn_score_dbms, "database.pdf");
			PDFReader.bindPDFButton(this, R.id.btn_score_datastructure, "DataStructure.pdf");
			PDFReader.bindPDFButton(this, R.id.btn_score_interview, "Interview.pdf");

	}


}
