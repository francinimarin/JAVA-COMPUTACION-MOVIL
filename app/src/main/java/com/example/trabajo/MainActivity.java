package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    String _url ="https://www.instagram.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void facebook (View view){
        Intent i= new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(i);
    }

    public void franciny (View view){
        Intent i= new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
        startActivity(i);
    }


}

