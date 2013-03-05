package com.android.hubbahubba;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LogIn extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        
        //create back button
        Button backButton = (Button)findViewById(R.id.backButton);
        Button logInButton = (Button)findViewById(R.id.logInButton);
        		
        //back button goes back to the main page
        backButton.setOnClickListener(new View.OnClickListener() {      
        	public void onClick(View view) {
        		Intent intent = new Intent(LogIn.this, MainActivity.class);
        		startActivity(intent);
        	}

        });
        
        //login Button takes you to the map view
        logInButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view){
        		Intent intent = new Intent(LogIn.this, ViewMap.class);
        		startActivity(intent);
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login_layout, menu);
        return true;
    }
}
