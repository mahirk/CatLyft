package com.codeday.catlyft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class Splash extends Activity {
    private long ms=0;
    private long splashTime=2000;
    private boolean splashActive = true;
    private boolean paused=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hides the titlebar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.splashscreen);

        Thread mythread = new Thread() {
            public void run() {
                try {
                    while (splashActive && ms < splashTime) {
                        if(!paused)
                            ms=ms+1000;
                        sleep(1000);
                    }
                } catch(Exception e) {System.out.print(e);}
                finally {
                	try{
                		Intent intent = new Intent(Splash.this, Home.class);
                        startActivity(intent);
                        
                	}catch(Exception e){
                		Log.d(CatLyft.TAG,"HERE IS THE ERROR");
                	}
                }
            }
        };
        mythread.start();
    }
}