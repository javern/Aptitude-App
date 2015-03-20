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
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import androidhive.dashboard.R;

public class Tquants extends Activity {


	public void pdfcommon(String temp) {
	/*	setContentView(R.layout.webview);
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

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_feed_layout);
		PDFReader.bindPDFButton(this, R.id.btn_q1, "sec1.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q2, "sec2.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q4, "sec4.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q5, "sec5.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q6, "sec6.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q7, "sec7.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q8, "sec8.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q10, "sec10.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q11, "sec11.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q12, "sec12.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q13, "sec13.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q15, "sec15.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q16, "sec16.pdf");
		PDFReader.bindPDFButton(this, R.id.btn_q17, "sec17.pdf");
		
		
		
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
