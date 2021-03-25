package com.example.onlineproductsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FormInfo extends AppCompatActivity {
    EditText inputName;
    TextView etiName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_info);

        inputName = (EditText) findViewById(R.id.txtName);
    }

    public void event(View v){
        Intent i = new Intent(FormInfo.this, ProductsAll.class);
        Bundle myBundle = new Bundle();
        myBundle.putString("name",inputName.getText().toString());
        i.putExtras(myBundle);
        startActivity(i);
    }

}
