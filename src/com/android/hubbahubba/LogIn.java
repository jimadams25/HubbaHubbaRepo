package com.android.hubbahubba;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LogIn extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login_layout, menu);
        return true;
    }
}
