package br.com.findfer.findfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RecordOneActivity extends AppCompatActivity {
    private EditText firstName, lastName;
    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_one);
        firstName = (EditText)findViewById(R.id.et_first_name);
        lastName = (EditText)findViewById(R.id.et_last_name);
        btNext = (Button)findViewById(R.id.bt_next);
    }

    public void nextActivityFone(View view){
        if(verifeName()){
            Toast.makeText(this, R.string.request_name_user, Toast.LENGTH_SHORT).show();
        }else{
            Intent nextFone = new Intent(this, RecordTwoActivity.class);
            nextFone.putExtra("name",setNameUser());
            startActivity(nextFone);
        }
    }

    private String setNameUser(){
        return firstName.getText().toString()+" "+lastName.getText().toString();
    }
    private boolean verifeName(){
        return firstName.getText().toString().equals("") || lastName.getText().toString().equals("")
                || firstName.getText().toString().equals(" ") || lastName.getText().toString().equals(" ");
    }
}
