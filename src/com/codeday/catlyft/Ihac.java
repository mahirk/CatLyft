package com.codeday.catlyft;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ihac extends Activity {
	Button submit;
	Button files;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihac);
		Parse.initialize(this, "eiIHuYbamwa3B2z08XK62S3dVQraxnN2x96p5u1U", "EuCs6SqrKra6oi6pIFQPuNSXYHh8Khf1nVQWtN49");

		submit = (Button) findViewById(R.id.submit);
		files = (Button) findViewById(R.id.files);
		submit.setOnClickListener(new View.OnClickListener() {
		      @Override
		      public void onClick(View v) {
		         onSubmitClick();
		      }
			});
		files.setOnClickListener(new View.OnClickListener() {
		      @Override
		      public void onClick(View v) {
		         onfilesClick();
		      }
			});
		
	}
	private void onfilesClick(){
		 Toast.makeText(getApplicationContext(), "No Images Detected", Toast.LENGTH_SHORT).show();    
	}

	private void onSubmitClick(){
		EditText mEditname = (EditText)findViewById(R.id.EditText01);
		String locn = mEditname.getText().toString();
		EditText mEditemail = (EditText)findViewById(R.id.editText2);
		String loce = mEditemail.getText().toString();
		EditText mEditnumber = (EditText)findViewById(R.id.editText3);
		String locnu = mEditnumber.getText().toString();
		EditText mEditdetails = (EditText)findViewById(R.id.editText1);
		String locde = mEditemail.getText().toString();
		ParseObject testObject = new ParseObject("CatLyft User:" + locn.toString() + "" );
        testObject.put("Name", locn.toString() );
        testObject.put("Email",loce.toString() );
        testObject.put("Number", locnu.toString() );
        testObject.put("Details", locde.toString() );
        testObject.saveInBackground();
	   Toast.makeText(getApplicationContext(), "Hi " + locn.toString() + "! We will get back to you", Toast.LENGTH_SHORT).show();
      Intent intent = new Intent(this, Home.class);
      startActivity(intent);
	}
}
