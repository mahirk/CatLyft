package com.codeday.catlyft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class CatDetails2 extends Activity{
   Button icanhaz;
   
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cdetails2);
      icanhaz = (Button) findViewById(R.id.icanhaz);
  
   
   icanhaz.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         onIcanhazClick();
      }
   });
   }
   
   
   private void onIcanhazClick(){
      Toast.makeText(getApplicationContext(), "Request Sent!", Toast.LENGTH_LONG).show();
      long mil = 0;
      while(mil < 5000) {
         if(true) {
            mil = mil + 1000;
         }
        
      }
      Random r = new Random();
      int displayWhich = r.nextInt(5);
      if(displayWhich < 2) {
         Toast.makeText(getApplicationContext(), "Request Rejected!", Toast.LENGTH_LONG).show();
      } else {
         Toast.makeText(getApplicationContext(), "Request Accepted!", Toast.LENGTH_LONG).show();
      }
      while(mil < 2000) {
         if(true) {
            mil = mil + 1000;
         }
               }
      Intent intent = new Intent(this, CatCenter.class);
         startActivity(intent);
   }
}
