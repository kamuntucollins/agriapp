package com.example.agri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;



public class Menulist extends AppCompatActivity {
Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulist);
        mybutton=findViewById(R.id.button4);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent( Menulist.this,MainActivity.class);
                startActivity(myintent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menufile,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int a=item.getItemId();
        switch (a){
            case R.id.Home:
                Intent myintent1 =new Intent(Menulist.this,MainActivity.class);
                startActivity(myintent1);
                break;
            case R.id.Chemicals:
                Intent myintent2 =new Intent(Menulist.this,chemicals.class);
                startActivity(myintent2);
                break;
            case R.id.Plants:
                Intent myintent3 =new Intent(Menulist.this,Plants.class);
                startActivity(myintent3);
                break;
            case R.id.Service:
                Toast.makeText(getApplicationContext(),"service still unavailable",Toast.LENGTH_LONG).show();
                break;


            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}
