package com.example.user_administrator.hitmeifyoucan;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView ed1,ed2,ed3;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    Button b21,b22,b23,b24,b25,btn1,btn2,btn3;

    boolean f1,f2;
    Handler hand = new Handler();
    Random rand = new Random();
    int t;

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

/*        b1.setOnClickListener(this);
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
        b25.setOnClickListener(this);*/

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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=true;
                Toast.makeText(MainActivity.this,"Done",Toast.LENGTH_LONG).show();
                while(f1)
                {
                    t = rand.nextInt(25)+1;
                    if(t==1)
                    {
                        b1.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b1.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==2)
                    {
                        b2.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b2.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==3)
                    {
                        b3.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b3.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==4)
                    {
                        b4.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b4.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==5)
                    {
                        b5.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b5.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==6)
                    {
                        b6.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b6.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==7)
                    {
                        b7.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b7.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==8)
                    {
                        b8.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b8.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==9)
                    {
                        b9.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b9.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==10)
                    {
                        b10.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b10.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==11)
                    {
                        b11.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b11.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==12)
                    {
                        b12.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b12.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==13)
                    {
                        b13.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b13.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==14)
                    {
                        b14.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b14.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==15)
                    {
                        b15.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b15.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==16)
                    {
                        b16.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b16.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==17)
                    {
                        b17.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b17.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==18)
                    {
                        b18.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b18.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==19)
                    {
                        b19.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b19.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==20)
                    {
                        b20.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b20.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==21)
                    {
                        b21.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b21.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==22)
                    {
                        b22.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b22.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==23)
                    {
                        b23.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b23.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==24)
                    {
                        b24.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b24.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==25)
                    {
                        b25.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b25.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=false;
            }
        });

 //       btn3.setOnClickListener(this);

        Toast.makeText(this,"End Of OnCreate",Toast.LENGTH_LONG).show();
    }

/*    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.btn1:
      //          btn1.setClickable(false);
      //          btn2.setClickable(true);
                f1=true;
                Toast.makeText(this,"Done",Toast.LENGTH_LONG).show();
                while(f1)
                {
                    t = rand.nextInt(25)+1;
                    if(t==1)
                    {
                        b1.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b1.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==2)
                    {
                        b2.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b2.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==3)
                    {
                        b3.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b3.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==4)
                    {
                        b4.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b4.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==5)
                    {
                        b5.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b5.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==6)
                    {
                        b6.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b6.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==7)
                    {
                        b7.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b7.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==8)
                    {
                        b8.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b8.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==9)
                    {
                        b9.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b9.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==10)
                    {
                        b10.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b10.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==11)
                    {
                        b11.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b11.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==12)
                    {
                        b12.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b12.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==13)
                    {
                        b13.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b13.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==14)
                    {
                        b14.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b14.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==15)
                    {
                        b15.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b15.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==16)
                    {
                        b16.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b16.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==17)
                    {
                        b17.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b17.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==18)
                    {
                        b18.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b18.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==19)
                    {
                        b19.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b19.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==20)
                    {
                        b20.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b20.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==21)
                    {
                        b21.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b21.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==22)
                    {
                        b22.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b22.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==23)
                    {
                        b23.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b23.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==24)
                    {
                        b24.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b24.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }
                    else if(t==25)
                    {
                        b25.setBackgroundColor(Color.RED);
                        hand.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                b25.setBackgroundColor(Color.BLUE);
                            }
                        },1000);
                    }

                }
                break;
            case R.id.btn2:
                f1=false;
   //             btn1.setClickable(true);
                break;

        }
    }*/



}
