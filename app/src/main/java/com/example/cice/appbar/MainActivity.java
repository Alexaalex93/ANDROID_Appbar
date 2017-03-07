package com.example.cice.appbar;

import android.os.StrictMode;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Nuevo titulo");

        //Coger el titulo
        String title = actionBar.getTitle().toString();
        //Ocultar
        //actionBar.hide();


        //añades la flecha para navegar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Para poner logo en la action bar
       // getSupportActionBar().setDisplayShowHomeEnabled(true);
       // getSupportActionBar().setLogo(R.drawable...);
       // getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                makeToastMethod();
                break;
        }
    }

    public void makeToastMethod(){}
    /*  public void miProfileAction(MenuItem item){
        Toast.makeText(getApplicationContext(),"Menu 1", Toast.LENGTH_LONG).show();

    }
*/
/*    public void onComposeAction(MenuItem item){
        Toast.makeText(getApplicationContext(),"Menu 2", Toast.LENGTH_LONG).show();

    }*/
}
