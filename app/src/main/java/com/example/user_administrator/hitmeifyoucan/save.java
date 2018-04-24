package com.example.user_administrator.hitmeifyoucan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class save extends AppCompatActivity implements View.OnClickListener {

    EditText et1;
    Button but1,but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        et1=findViewById(R.id.et1);
        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.but1:
                database db = new database(this);
                Intent val = getIntent();
                String p = val.getStringExtra("P");
                    if(db.saveScore(et1.getText().toString(),p))
                    {
                        Toast.makeText(this,"Your Score Is Saved",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        database db2 = new database(this);
                        String s = db2.checkScore(et1.getText().toString());
                        if(Float.parseFloat(p)>=Float.parseFloat(s))
                        {
                            if(db2.updateScore(et1.getText().toString(),p))
                            {
                                Toast.makeText(this,"Your Score Is Updated",Toast.LENGTH_LONG).show();
                            }
                            else
                            {
                                Toast.makeText(this,"Unable To Update",Toast.LENGTH_LONG).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(this,"This Is Not Your Best Score",Toast.LENGTH_LONG).show();
                        }
                    }
                break;
            case R.id.but2:
                database db1 = new database(this);
                if("no".equals(db1.checkScore(et1.getText().toString())))
                {
                    Toast.makeText(this,"Wrong Credentials",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(this,"Your Last Score : "+db1.checkScore(et1.getText().toString()),Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
