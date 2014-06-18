package com.tipcalculator.app;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity {

    private SeekBar seekBar;
    private boolean decimal = false;
    private double PercTip = 0;
    double Bill = 0;
    double Tip = 0;
    double TotalBill = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        final TextView firstTextView = (TextView) findViewById(R.id.textView);
        final Button buttonClear = (Button) findViewById(R.id.clrButon);
        final Button tipButton = (Button) findViewById(R.id.tipButton);
        final Button buttonP = (Button) findViewById(R.id.buttonP);
        final Button button0 = (Button) findViewById(R.id.button0);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox1);

        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progressValue, boolean fromUser) {
                        PercTip = (float) progressValue;
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // Do something here,
                        //if you want to do anything at the start of
                        // touching the seekbar
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        tipButton.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View view) {
                Bill = Double.parseDouble(String.valueOf(firstTextView.getText()));
                Tip = Bill * ((PercTip + 10) * .01);
                TotalBill = Bill + Tip;
                DecimalFormat Total = new DecimalFormat("00.00");
                Total.setRoundingMode(RoundingMode.UP);
                firstTextView.setText("Total: " + Total.format(new Double(TotalBill)));
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onScr = String.valueOf(firstTextView.getText());
                onScr = onScr + ".";
                firstTextView.setText(onScr);
                decimal = true;
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstTextView.setText("0");
                Bill = 0;
                Tip = 0;
                TotalBill = 0;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("0");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 0;
                    firstTextView.setText(onScr);
                }
            }
        });



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("1");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 1;
                    firstTextView.setText(onScr);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("2");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 2;
                    firstTextView.setText(onScr);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("3");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 3;
                    firstTextView.setText(onScr);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("4");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 4;
                    firstTextView.setText(onScr);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("5");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 5;
                    firstTextView.setText(onScr);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("6");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 6;
                    firstTextView.setText(onScr);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("7");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 7;
                    firstTextView.setText(onScr);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("8");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 8;
                    firstTextView.setText(onScr);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(String.valueOf(firstTextView.getText())) == 0) {
                    firstTextView.setText("9");
                }
                else{
                    String onScr = String.valueOf(firstTextView.getText());
                    onScr =  onScr + 9;
                    firstTextView.setText(onScr);
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
