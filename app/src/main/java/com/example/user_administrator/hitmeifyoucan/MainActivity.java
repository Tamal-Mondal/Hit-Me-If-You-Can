package com.example.user_administrator.hitmeifyoucan;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView ed1,ed2,ed3;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    Button b21,b22,b23,b24,b25,btn1,btn2,btn3,btn4;

    Random rand = new Random();
    Handler hand = new Handler();

    int i=0,s=0,h=0;
    float p=0;

    boolean f1=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b14=findViewById(R.id.b14);
        b15=findViewById(R.id.b15);
        b16=findViewById(R.id.b16);
        b17=findViewById(R.id.b17);
        b18=findViewById(R.id.b18);
        b19=findViewById(R.id.b19);
        b20=findViewById(R.id.b20);
        b21=findViewById(R.id.b21);
        b22=findViewById(R.id.b22);
        b23=findViewById(R.id.b23);
        b24=findViewById(R.id.b24);
        b25=findViewById(R.id.b25);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        btn2.setClickable(false);

        btn1.setBackgroundColor(Color.GREEN);
        btn2.setBackgroundColor(Color.GRAY);
        btn3.setBackgroundColor(Color.GREEN);
        btn4.setBackgroundColor(Color.GREEN);

        resetColor();
        setScore();
    }

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.btn1:
                btn1.setBackgroundColor(Color.GRAY);
                btn1.setClickable(false);
                btn2.setClickable(true);
                btn2.setBackgroundColor(Color.GREEN);
                startGame();
                resetColor();
                s=0;
                h=0;
                p=0;
                setScore();
                break;
            case R.id.btn2:
                hand.removeCallbacksAndMessages(null);
                btn1.setClickable(true);
                btn1.setBackgroundColor(Color.GREEN);
                btn2.setBackgroundColor(Color.GRAY);
                btn2.setClickable(false);
                resetColor();
                Toast.makeText(this,"Your Score : "+ed3.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                AlertDialog.Builder build = new AlertDialog.Builder(this);
                build.setTitle("INSTRUCTIONS")
                        .setMessage("1. Hit the active(When RED) buttons to get points. \n\n " +
                                "2. If unable to hit then 0.25 will be deducted.")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                hand.removeCallbacksAndMessages(null);
                                btn1.setClickable(true);
                                btn1.setBackgroundColor(Color.GREEN);
                                btn2.setBackgroundColor(Color.GRAY);
                                btn2.setClickable(false);
                                resetColor();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setCancelable(false);
                AlertDialog alertDialog = build.create();
                alertDialog.show();
                break;
            case R.id.btn4:
                hand.removeCallbacksAndMessages(null);
                btn1.setClickable(true);
                btn1.setBackgroundColor(Color.GREEN);
                btn2.setBackgroundColor(Color.GRAY);
                btn2.setClickable(false);
                resetColor();
                Intent intent = new Intent(this,save.class);
                intent.putExtra("P",ed3.getText().toString());
                startActivity(intent);
                break;
            case R.id.b1:
                if(i==1)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b1.setBackgroundColor(Color.YELLOW);
                    b1.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b2:
                if(i==2)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b2.setBackgroundColor(Color.YELLOW);
                    b2.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b3:
                if(i==3)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b3.setBackgroundColor(Color.YELLOW);
                    b3.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b4:
                if(i==4)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b4.setBackgroundColor(Color.YELLOW);
                    b4.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b5:
                if(i==5)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b5.setBackgroundColor(Color.YELLOW);
                    b5.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b6:
                if(i==6)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b6.setBackgroundColor(Color.YELLOW);
                    b6.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b7:
                if(i==7)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b7.setBackgroundColor(Color.YELLOW);
                    b7.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b8:
                if(i==8)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b8.setBackgroundColor(Color.YELLOW);
                    b8.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b9:
                if(i==9)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b9.setBackgroundColor(Color.YELLOW);
                    b9.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b10:
                if(i==10)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b10.setBackgroundColor(Color.YELLOW);
                    b10.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b11:
                if(i==11)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b11.setBackgroundColor(Color.YELLOW);
                    b11.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b12:
                if(i==12)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b12.setBackgroundColor(Color.YELLOW);
                    b12.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b13:
                if(i==13)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b13.setBackgroundColor(Color.YELLOW);
                    b13.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b14:
                if(i==14)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b14.setBackgroundColor(Color.YELLOW);
                    b14.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b15:
                if(i==15)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b15.setBackgroundColor(Color.YELLOW);
                    b15.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b16:
                if(i==16)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b16.setBackgroundColor(Color.YELLOW);
                    b16.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b17:
                if(i==17)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b17.setBackgroundColor(Color.YELLOW);
                    b17.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b18:
                if(i==18)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b18.setBackgroundColor(Color.YELLOW);
                    b18.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b19:
                if(i==19)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b19.setBackgroundColor(Color.YELLOW);
                    b19.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b20:
                if(i==20)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b20.setBackgroundColor(Color.YELLOW);
                    b20.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b21:
                if(i==21)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b21.setBackgroundColor(Color.YELLOW);
                    b21.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b22:
                if(i==22)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b22.setBackgroundColor(Color.YELLOW);
                    b22.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b23:
                if(i==23)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b23.setBackgroundColor(Color.YELLOW);
                    b23.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b24:
                if(i==24)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b24.setBackgroundColor(Color.YELLOW);
                    b24.setClickable(false);
                    f1=false;
                }
                break;
            case R.id.b25:
                if(i==25)
                {
                    h=h+1;
                    p=p+1;
                    setScore();
                    b25.setBackgroundColor(Color.YELLOW);
                    b25.setClickable(false);
                    f1=false;
                }
                break;
        }
    }

    public void startGame(){
        hand.postDelayed(new Runnable() {
            @Override
            public void run() {
                resetColor();
                int t = rand.nextInt(25)+1;
                i=t;
                s=s+1;
                if(f1)
                {
                    p=p-0.25f;
                }
                f1=true;
                setScore();
                clickAll();
                if(t==1)
                {
                    b1.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b1.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==2)
                {
                    b2.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b2.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==3)
                {
                    b3.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b3.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==4)
                {
                    b4.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b4.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==5)
                {
                    b5.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b5.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==6)
                {
                    b6.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b6.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==7)
                {
                    b7.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b7.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==8)
                {
                    b8.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b8.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==9)
                {
                    b9.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b9.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==10)
                {
                    b10.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b10.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==11)
                {
                    b11.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b11.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==12)
                {
                    b12.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b12.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==13)
                {
                    b13.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b13.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==14)
                {
                    b14.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b14.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==15)
                {
                    b15.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b15.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==16)
                {
                    b16.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b16.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==17)
                {
                    b17.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b17.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==18)
                {
                    b18.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b18.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==19)
                {
                    b19.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b19.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==20)
                {
                    b20.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b20.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==21)
                {
                    b21.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b21.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==22)
                {
                    b22.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b22.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==23)
                {
                    b23.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b23.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==24)
                {
                    b24.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b24.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                else if(t==25)
                {
                    b25.setBackgroundColor(Color.RED);
                    hand.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            b25.setBackgroundColor(Color.BLUE);
                        }
                    },700);
                }
                hand.postDelayed(this, 700);

            }
        },100);

    }
    public void resetColor()
    {
        b1.setBackgroundColor(Color.BLUE);
        b2.setBackgroundColor(Color.BLUE);
        b3.setBackgroundColor(Color.BLUE);
        b4.setBackgroundColor(Color.BLUE);
        b5.setBackgroundColor(Color.BLUE);
        b6.setBackgroundColor(Color.BLUE);
        b7.setBackgroundColor(Color.BLUE);
        b8.setBackgroundColor(Color.BLUE);
        b9.setBackgroundColor(Color.BLUE);
        b10.setBackgroundColor(Color.BLUE);
        b11.setBackgroundColor(Color.BLUE);
        b12.setBackgroundColor(Color.BLUE);
        b13.setBackgroundColor(Color.BLUE);
        b14.setBackgroundColor(Color.BLUE);
        b15.setBackgroundColor(Color.BLUE);
        b16.setBackgroundColor(Color.BLUE);
        b17.setBackgroundColor(Color.BLUE);
        b18.setBackgroundColor(Color.BLUE);
        b19.setBackgroundColor(Color.BLUE);
        b20.setBackgroundColor(Color.BLUE);
        b21.setBackgroundColor(Color.BLUE);
        b22.setBackgroundColor(Color.BLUE);
        b23.setBackgroundColor(Color.BLUE);
        b24.setBackgroundColor(Color.BLUE);
        b25.setBackgroundColor(Color.BLUE);
    }

    public void setScore()
    {
        ed1.setText("Total: "+String.valueOf(s));
        ed2.setText("Hit: "+String.valueOf(h));
        ed3.setText(String.valueOf(p));
    }

    public void clickAll()
    {
        b1.setClickable(true);
        b2.setClickable(true);
        b3.setClickable(true);
        b4.setClickable(true);
        b5.setClickable(true);
        b6.setClickable(true);
        b7.setClickable(true);
        b8.setClickable(true);
        b9.setClickable(true);
        b10.setClickable(true);
        b11.setClickable(true);
        b12.setClickable(true);
        b13.setClickable(true);
        b14.setClickable(true);
        b15.setClickable(true);
        b16.setClickable(true);
        b17.setClickable(true);
        b18.setClickable(true);
        b19.setClickable(true);
        b20.setClickable(true);
        b21.setClickable(true);
        b22.setClickable(true);
        b23.setClickable(true);
        b24.setClickable(true);
        b25.setClickable(true);
    }
}
