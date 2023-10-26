package edu.uef.thithuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int tvnobread = 0,tvnobread1=0,tvnohamburger=0,tvnohamburger1=0,tvnogingerbreadhouse=0,tvnogingerbreadhouse1=0,tvnocherrycheesecake=0,tvnocherrycheesecake1=0,tvnosunnysideupeggs=0,tvnosunnysideupeggs1=0 ;
    private TextView tvbread,tvbread1,tvcherrycheesecake,tvcherrycheesecake1,tvgingerbreadhouse,tvgingerbreadhouse1,tvhamburger,tvhamburger1,tvsunnysideupeggs,tvsunnysideupeggs1;
    private Button btnReset,btnOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReset = findViewById(R.id.btnReset);
        tvbread1 = findViewById(R.id.tvbread1);
        tvbread = findViewById(R.id.tvbread);
        tvcherrycheesecake = findViewById(R.id.tvcherrycheesecake);
        tvcherrycheesecake1 = findViewById(R.id.tvcherrycheesecake1);
        tvgingerbreadhouse = findViewById(R.id.tvgingerbreadhouse);
        tvgingerbreadhouse1 = findViewById(R.id.tvgingerbreadhouse1);
        tvhamburger = findViewById(R.id.tvhamburger);
        tvhamburger1 = findViewById(R.id.tvhamburger1);
        tvsunnysideupeggs = findViewById(R.id.tvsunnysideupeggs);
        tvsunnysideupeggs1 = findViewById(R.id.tvsunnysideupeggs1);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvbread1.setText("bread");
                tvbread.setText("bread");
                tvcherrycheesecake.setText("cherrycheesecake");
                tvcherrycheesecake1.setText("cherrycheesecake");
                tvgingerbreadhouse.setText("gingerbreadhouse");
                tvgingerbreadhouse1.setText("gingerbreadhouse");
                tvhamburger.setText("hamburger");
                tvhamburger1.setText("hamburger");
                tvsunnysideupeggs.setText("sunnysideupeggs");
                tvsunnysideupeggs1.setText("sunnysideupeggs");

            }
        });
        tvbread = findViewById(R.id.tvbread);
        tvbread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnobread++;
                tvbread.setText("No. of bread: " + tvnobread);
            }
        });
        tvbread1 = findViewById(R.id.tvbread1);
        tvbread1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnobread1++;
                tvbread1.setText("No. of bread: " + tvnobread1);
            }
        });
        tvcherrycheesecake = findViewById(R.id.tvcherrycheesecake);
        tvcherrycheesecake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnocherrycheesecake++;
                tvcherrycheesecake.setText("No. of cherrycheesecake: " + tvnocherrycheesecake);
            }
        });
        tvcherrycheesecake1 = findViewById(R.id.tvcherrycheesecake1);
        tvcherrycheesecake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnocherrycheesecake1++;
                tvcherrycheesecake1.setText("No. of cherrycheesecake: " + tvnocherrycheesecake1);
            }
        });
        tvgingerbreadhouse = findViewById(R.id.tvgingerbreadhouse);
        tvgingerbreadhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnogingerbreadhouse++;
                tvgingerbreadhouse.setText("No. of gingerbreadhouse: " + tvnogingerbreadhouse);
            }
        });
        tvgingerbreadhouse1 = findViewById(R.id.tvgingerbreadhouse1);
        tvgingerbreadhouse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnogingerbreadhouse1++;
                tvgingerbreadhouse1.setText("No. of gingerbreadhouse: " + tvnogingerbreadhouse1);
            }
        });
        tvhamburger = findViewById(R.id.tvhamburger);
        tvhamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnohamburger++;
                tvhamburger.setText("No. of hamburger: " + tvnohamburger);
            }
        });
        tvhamburger1 = findViewById(R.id.tvhamburger1);
        tvhamburger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnohamburger1++;
                tvhamburger1.setText("No. of hamburger: " + tvnohamburger1);
            }
        });
        tvsunnysideupeggs = findViewById(R.id.tvsunnysideupeggs);
        tvsunnysideupeggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnosunnysideupeggs++;
                tvsunnysideupeggs.setText("No. of sunnysideupeggs: " + tvnosunnysideupeggs);
            }
        });
        tvsunnysideupeggs1 = findViewById(R.id.tvsunnysideupeggs1);
        tvsunnysideupeggs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvnosunnysideupeggs1++;
                tvsunnysideupeggs1.setText("No. of sunnysideupeggs: " + tvnosunnysideupeggs1);
            }
        });
        btnOrder= findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvnobread > 0) {
                    Toast.makeText(MainActivity.this,"No. of bread: " + tvnobread,  Toast.LENGTH_SHORT).show();
                }
                if (tvnobread1 > 0) {
                    Toast.makeText(MainActivity.this,"No. of bread: " + tvnobread1,  Toast.LENGTH_SHORT).show();
                }
                if (tvnohamburger > 0) {
                    Toast.makeText(MainActivity.this,"No. of hamburger: " + tvnohamburger,  Toast.LENGTH_SHORT).show();
                }
                if (tvnohamburger1 > 0) {
                    Toast.makeText(MainActivity.this,"No. of hamburger: " + tvnohamburger1,  Toast.LENGTH_SHORT).show();
                }
                if (tvnogingerbreadhouse > 0) {
                    Toast.makeText(MainActivity.this,"No. of gingerbreadhouse: " + tvnogingerbreadhouse,  Toast.LENGTH_SHORT).show();
                }
                if (tvnogingerbreadhouse1 > 0) {
                    Toast.makeText(MainActivity.this,"No. of gingerbreadhouse: " + tvnogingerbreadhouse1,  Toast.LENGTH_SHORT).show();
                }
                if (tvnocherrycheesecake > 0) {
                    Toast.makeText(MainActivity.this,"No. of cherrycheesecake: " + tvnocherrycheesecake,  Toast.LENGTH_SHORT).show();
                }
                if (tvnocherrycheesecake1 > 0) {
                    Toast.makeText(MainActivity.this,"No. of cherrycheesecake: " + tvnocherrycheesecake1,  Toast.LENGTH_SHORT).show();
                }
                if (tvnosunnysideupeggs > 0) {
                    Toast.makeText(MainActivity.this,"No. of cherrycheesecake: " + tvnosunnysideupeggs,  Toast.LENGTH_SHORT).show();
                }
                if (tvnosunnysideupeggs1 > 0) {
                    Toast.makeText(MainActivity.this,"No. of cherrycheesecake: " + tvnosunnysideupeggs1,  Toast.LENGTH_SHORT).show();
                }


            }
        });

    }



}