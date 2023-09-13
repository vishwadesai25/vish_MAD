package com.example.mad1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.d("lifecycle","onCreate invoked");

        b1 =  (Button)  findViewById(R.id.page1);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openNewActivity();
                    }
                }

        );
    }
    private void openNewActivity() {
        Intent i = new Intent(this,MainActivity2.class);
        startActivity(i);
    }


    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("lifecycle","onStart invoked");
//    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("lifecycle","onResume invoked");
//    }
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("lifecycle","onPause invoked");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("lifecycle","onStop invoked");
//    }
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("lifecycle","onRestart invoked");
//    }
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("lifecycle","onDestroy invoked");
//    }
