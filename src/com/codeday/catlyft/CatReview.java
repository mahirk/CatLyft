package com.codeday.catlyft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.lang.reflect.*;

public class CatReview extends Activity{
   Button ccenter;
   Button submit;
   ImageView rate01;
   ImageView rate02;
   ImageView rate03;
   ImageView rate04;
   ImageView rate05;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	 setContentView(R.layout.creview);
     ccenter = (Button) findViewById(R.id.home);
     submit = (Button) findViewById(R.id.submit);
     rate01= (ImageView) findViewById(R.id.rate01);
     rate02= (ImageView) findViewById(R.id.rate02);
     rate03= (ImageView) findViewById(R.id.rate03);
     rate04= (ImageView) findViewById(R.id.rate04);
     rate05= (ImageView) findViewById(R.id.rate05);
   ccenter.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onCcenterClick();
      }
	});
   submit.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	    	  onCsubmitClick();
	      }
		});
   rate01.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	    	  rate01.setImageResource(R.drawable.onedarkpaw);
	    	  rate02.setImageResource(R.drawable.onewhitepaw);
	    	  rate03.setImageResource(R.drawable.onewhitepaw);
	    	  rate04.setImageResource(R.drawable.onewhitepaw);
	    	  rate05.setImageResource(R.drawable.onewhitepaw);
	      }
		});

	   rate02.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	    	  rate01.setImageResource(R.drawable.onedarkpaw);
	    	  rate02.setImageResource(R.drawable.onedarkpaw);
	    	  rate03.setImageResource(R.drawable.onewhitepaw);
	    	  rate04.setImageResource(R.drawable.onewhitepaw);
	    	  rate05.setImageResource(R.drawable.onewhitepaw);
	      }
		});

	   rate03.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	    	  rate01.setImageResource(R.drawable.onedarkpaw);
	    	  rate02.setImageResource(R.drawable.onedarkpaw);
	    	  rate03.setImageResource(R.drawable.onedarkpaw);
	    	  rate04.setImageResource(R.drawable.onewhitepaw);
	    	  rate05.setImageResource(R.drawable.onewhitepaw);
	      }
		});

	   rate04.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	    	  rate01.setImageResource(R.drawable.onedarkpaw);
	    	  rate02.setImageResource(R.drawable.onedarkpaw);
	    	  rate03.setImageResource(R.drawable.onedarkpaw);
	    	  rate04.setImageResource(R.drawable.onedarkpaw);
	    	  rate05.setImageResource(R.drawable.onewhitepaw);
	    	  
	      }
		});

	   rate05.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	    	  rate01.setImageResource(R.drawable.onedarkpaw);
	    	  rate02.setImageResource(R.drawable.onedarkpaw);
	    	  rate03.setImageResource(R.drawable.onedarkpaw);
	    	  rate04.setImageResource(R.drawable.onedarkpaw);
	    	  rate05.setImageResource(R.drawable.onedarkpaw);
	      }
		});
		}

	
   private void onCcenterClick(){
      Intent intent = new Intent(this, CatCenter.class);
      startActivity(intent);
   }
   private void onCsubmitClick(){
	   Toast.makeText(getApplicationContext(), "Responses Collected!", Toast.LENGTH_SHORT).show();
	      Intent intent = new Intent(this, CatCenter.class);
	      startActivity(intent);
	   }
   
   }

