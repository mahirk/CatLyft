package com.codeday.catlyft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Home extends Activity {
	Button iwac;
	Button ihac;

	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		iwac = (Button) findViewById(R.id.iwac);
		ihac = (Button) findViewById(R.id.ihac);
	iwac.setOnClickListener(new View.OnClickListener() {
	    @Override
	    public void onClick(View v) {
	    	onIwacClick();
	    }
	});
	ihac.setOnClickListener(new View.OnClickListener() {
	    @Override
	    public void onClick(View v) {
	    	onIhacClick();
	    }
	});
	}
	
	private void onIwacClick (){
		Intent intent = new Intent(this, Iwac.class);
        startActivity(intent);
	}
	private void onIhacClick (){
		Intent intent = new Intent(this, Ihac.class);
        startActivity(intent);
	}

}

