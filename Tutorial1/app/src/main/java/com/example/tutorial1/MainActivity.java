package com.example.tutorial1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tutorial1.data.Message;

public class MainActivity extends AppCompatActivity {

    EditText edtMessage;
    Button btnSend;
    Message message;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMessage = findViewById(R.id.edtMessage);
        btnSend =  findViewById(R.id.btnSend);

        message = new Message();

        edtMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                msg = editable.toString();

            }
        });

    }

    public void displayMessage(View view){

//        message.setMessage(edtMessage.getText().toString());
//        Toast.makeText(this,message.getMessage(), Toast.LENGTH_LONG).show();

        msg = edtMessage.getText().toString();
        Toast.makeText(this,message.getMessage(), Toast.LENGTH_LONG).show();

    }
}