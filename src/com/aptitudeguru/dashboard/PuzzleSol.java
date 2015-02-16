package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidhive.dashboard.R;

public class PuzzleSol extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puzzlesol);
		Bundle bundle = getIntent().getExtras();
		String sol = bundle.getString("sol");
		TextView t1 = (TextView) findViewById(R.id.textViewsol);
		t1.setText(sol);
	}

}
