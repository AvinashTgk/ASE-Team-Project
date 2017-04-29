package com.example.sirisha.mymedianizer;

/**
 * Created by avina on 4/19/2017.
 */

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.sirisha.mymedianizer.MainActivity2;

public class CustomOnItemSelectedListener implements OnItemSelectedListener {
    Spinner spinner1;
    String[] SPINNERVALUES = {"Movies", "Music", "Books"};
    String SpinnerValue;

    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {

        SpinnerValue = (String) spinner1.getSelectedItem();
        //Toast.makeText(parent.getContext(),
          //      "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
            //    Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}