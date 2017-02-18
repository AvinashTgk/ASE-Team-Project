package com.example.karthik.medianizer;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MovieActivity extends Activity {

    public Spinner spinner1;
    ArrayAdapter<CharSequence> adapter3 ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitry_movie);

        /*Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.destinations_list, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new MyOnItemSelectedListener());*/

    }
    /*public class MyOnItemSelectedListener implements OnItemSelectedListener{


        public void onItemSelected(AdapterView<?> parent, View v, int pos,long id) {
            // TODO Auto-generated method stub
            //use the selected station and departure time to calculate the required time

            if (spinner1.getSelectedItem().equals("5")){
                adapter3 = ArrayAdapter.createFromResource(MovieActivity.this,R.array.departure_timeH5M_list, android.R.layout.simple_spinner_item);
                adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapter3);

                Log.v("spinner2","5");
            }else if(spinner1.getSelectedItem().equals("6")){

                adapter3 = ArrayAdapter.createFromResource(MovieActivity.this,R.array.departure_timeH6M_list, android.R.layout.simple_spinner_item);
                adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapter3);

                Log.v("spinner2","6");
            }

        }

        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

        }

    }
}*/
    }

    // add items into spinner dynamically



