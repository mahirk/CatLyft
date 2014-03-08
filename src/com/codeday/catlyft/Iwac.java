package com.codeday.catlyft;

import android.app.Activity;
import com.parse.ParseObject;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Iwac extends Activity{
   Button submit;

	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iwac);
	      Parse.initialize(this, "eiIHuYbamwa3B2z08XK62S3dVQraxnN2x96p5u1U", "EuCs6SqrKra6oi6pIFQPuNSXYHh8Khf1nVQWtN49");
      submit = (Button) findViewById(R.id.submit);
      submit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onSubmitClick();
      }
	});
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
		CatLyft.name2 = locn.toString();
		CatLyft.email = loce.toString();
		CatLyft.number = locnu.toString();
		ParseObject testObject = new ParseObject("CatLyft User:" + CatLyft.name2 + "" );
        testObject.put("Name", CatLyft.name2 );
        testObject.put("Email", CatLyft.email );
        testObject.put("Number", CatLyft.number );
        testObject.put("Details", locde.toString() );
        testObject.saveInBackground();
	   Toast.makeText(getApplicationContext(), "Hi " + CatLyft.name2 + "! We will get you a Cat", Toast.LENGTH_LONG).show();
      Intent intent = new Intent(this, CatCenter.class);
      startActivity(intent);
   }
}