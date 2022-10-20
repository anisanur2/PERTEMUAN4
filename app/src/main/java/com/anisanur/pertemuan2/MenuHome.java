package com.anisanur.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MenuHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,is,"Aplication On Star:,
Toast.LENGTH_SHORT).show();
}
    protected void onStop(){
        super.onRestart();
        Toast.makeText(this,is,"Aplication On onStop
                Toast.LENGTH_SHORT).show();

}
    protected void onResume(){
        super.onRestart();
        Toast.makeText(this,is,"Aplication On Resume
                Toast.LENGTH_SHORT).show();
}
    protected void onPause(){
        super.onRestart();
        Toast.makeText(this,is,"Aplication On Pause
                Toast.LENGTH_SHORT).show();
}
    protected void onDestroy(){
        super.onRestart();
        Toast.makeText(this,is,"Aplication On Destroy
                Toast.LENGTH_SHORT).show();
}