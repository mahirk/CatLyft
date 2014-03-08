package com.codeday.catlyft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class CatList extends Activity{
   Button ccenter;
   ImageView cdetails1;
   ImageView cdetails2;
   ImageView cdetails3;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clist);
      ccenter = (Button) findViewById(R.id.home);
      cdetails1 = (ImageView) findViewById(R.id.cprofile1);
      cdetails2 = (ImageView) findViewById(R.id.cprofile2);
      cdetails3 = (ImageView) findViewById(R.id.cprofile3);

   ccenter.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onCcenterClick();
      }
	});
   
   cdetails1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onCdetails1Click();
      }
   });
   
   cdetails2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onCdetails2Click();
      }
   });
   
   cdetails3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onCdetails3Click();
      }
   });
   

   }
	
   private void onCcenterClick(){
      Intent intent = new Intent(this, CatCenter.class);
         startActivity(intent);
   }
   
   private void onCdetails1Click(){
      Intent intent = new Intent(this, CatDetails1.class);
         startActivity(intent);
   }
   
   private void onCdetails2Click(){
      Intent intent = new Intent(this, CatDetails2.class);
         startActivity(intent);
   }
   
   private void onCdetails3Click(){
      Intent intent = new Intent(this, CatDetails3.class);
         startActivity(intent);
   }
   

}