package com.android.hubbahubba;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

public class SpinnerActivity extends Activity implements OnItemSelectedListener {
    
	Spinner spinner = (Spinner) findViewById(R.id.spotTypeSpinner);
    spinner.setOnItemSelectedListener(this);
	
    public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}