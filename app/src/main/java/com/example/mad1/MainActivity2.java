package com.example.mad1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button b1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Log.d("lifecycle","onCreate invoked");
        View b2 = findViewById(R.id.b2);
        editText = findViewById(R.id.editText);
        b1 =  (Button)  findViewById(R.id.page2);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openNewActivity();
                    }
                }
        );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();

                if (!url.startsWith("https://") && !url.startsWith("http://"))
                    url = "https://" + url;

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        setTitle("Activity 2");

        Intent intent = getIntent();
        final int number1 = intent.getIntExtra("number1", 0);
        final int number2 = intent.getIntExtra("number2", 0);

        TextView textViewNumbers = findViewById(R.id.text_view_numbers);
        textViewNumbers.setText("Numbers: " + number1 + ", " + number2);

        Button buttonAdd = findViewById(R.id.button_add);
        Button buttonSubtract = findViewById(R.id.button_subtract);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = number1 + number2;

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = number1 - number2;

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }


    private void openNewActivity() {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
