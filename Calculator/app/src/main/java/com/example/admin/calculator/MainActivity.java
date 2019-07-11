package com.example.admin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button eql;
    private Button clear;
    private TextView info;
    private TextView res;
    private final char plus = '+';
    private final char minus = '-';
    private final char multi = '*';
    private final char division = '/';
    private final char equ = '0';
    private double x = Double.NaN;
    private double y;
    private char Action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setId();
        zero.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    info.setText(info.getText().toString()+"0");
                }
            });

        one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                info.setText(info.getText().toString()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                Action=plus;
                res.setText(String.valueOf(x)+" + ");
                info.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                Action=minus;
                res.setText(String.valueOf(x)+" - ");
                info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                Action=multi;
                res.setText(String.valueOf(x)+" * ");
                info.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                Action=division;
                res.setText(String.valueOf(x)+" / ");
                info.setText(null);
            }
        });

        eql.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                Action=equ;
                res.setText(res.getText().toString() +String.valueOf(y)+" = "+String.valueOf(x));
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(info.getText().length()>0)
                {
                    CharSequence seq=info.getText().toString();
                    info.setText(seq.subSequence(0,seq.length()));
                }
                else
                {
                    x=Double.NaN;
                    y=Double.NaN;
                    info.setText(null);
                    res.setText(null);
                }
            }
        });
        }

    private void setId()
    {
        zero=(Button)findViewById(R.id.b0);
        one=(Button)findViewById(R.id.b1);
        two=(Button)findViewById(R.id.b2);
        three=(Button)findViewById(R.id.b3);
        four=(Button)findViewById(R.id.b4);
        five=(Button)findViewById(R.id.b5);
        six=(Button)findViewById(R.id.b6);
        seven=(Button)findViewById(R.id.b7);
        eight=(Button)findViewById(R.id.b8);
        nine=(Button)findViewById(R.id.b9);
        add=(Button)findViewById(R.id.badd);
        sub=(Button)findViewById(R.id.bsub);
        mul=(Button)findViewById(R.id.bmul);
        div=(Button)findViewById(R.id.bdiv);
        eql=(Button)findViewById(R.id.beql);
        clear=(Button)findViewById(R.id.bc);
        info=(TextView)findViewById(R.id.tvControl);
        res=(TextView)findViewById(R.id.tvDisplay);

    }

    private void compute()
    {
        if(!Double.isNaN(x))
        {
            y=Double.parseDouble(info.getText().toString());
            switch(Action)
            {
                case plus:
                    x=x+y;
                    break;
                case minus:
                    x=x-y;
                    break;
                case multi:
                    x=x*y;
                    break;
                case division:
                    x=x/y;
                    break;
                case equ:
                    x=x/y;
                    break;
            }
        }
        else
        {
            x=Double.parseDouble(info.getText().toString());
        }
    }
}
