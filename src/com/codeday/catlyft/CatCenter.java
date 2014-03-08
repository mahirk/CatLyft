package com.codeday.catlyft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class CatCenter extends Activity{
	ImageView clist;
   Button home;
   Button creview;

	protected void onCreate(Bundle savedInstanceState) {

		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ccenter);
		Toast.makeText(getApplicationContext(), "Click on the Cat!", Toast.LENGTH_SHORT).show();
      clist = (ImageView) findViewById(R.id.imageView1);
      home = (Button) findViewById(R.id.homebdn);
      creview = (Button) findViewById(R.id.creview);
   clist.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    	onClistClick();
	   }
	});
	
   home.setOnClickListener(new View.OnClickListener() {
	    @Override
	    public void onClick(View v) {
	    	onHomeClick();
	    }
	});
   
   creview.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onCreviewClick();
      }
   });
	}
   
	private void onClistClick (){
		Intent intent = new Intent(this, CatList.class);
        startActivity(intent);
	}
   
   private void onHomeClick (){
		Intent intent = new Intent(this, Home.class);
        startActivity(intent);
	}
   
   private void onCreviewClick () {
      Intent intent = new Intent(this, CatReview.class);
         startActivity(intent);
   }
}