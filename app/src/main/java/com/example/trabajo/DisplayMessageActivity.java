package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id== R.id.item1){
            Toast.makeText(this,"Aún no tienes notificaciones",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item2){
            Toast.makeText(this,"Serás dirigido a la pantalla de tu perfil",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item3){
            Toast.makeText(this,"Se cerrará sesión",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


}