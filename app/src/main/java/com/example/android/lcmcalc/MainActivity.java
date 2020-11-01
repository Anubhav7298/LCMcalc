package com.example.android.lcmcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void calculateLcm(View view)
    {
        EditText editTextNumber1   = (EditText)findViewById(R.id.editTextNumber1);
        String value1= editTextNumber1.getText().toString();
        int a1=Integer.parseInt(value1);
        EditText editTextNumber2   = (EditText)findViewById(R.id.editTextNumber2);
        String value2= editTextNumber2.getText().toString();
        int a2=Integer.parseInt(value2);
        EditText editTextNumber3   = (EditText)findViewById(R.id.editTextNumber3);
        String value3= editTextNumber3.getText().toString();
        int a3=Integer.parseInt(value3);

        int ans = calcLcm(a1,a2,a3);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("" + ans);


    }






    private int calcLcm(int a1, int a2, int a3)
    {
        int k=0,p=1,i,j,c=0;
        int arr[]=new int[3];
        arr[0]=a1;
        arr[1]=a2;
        arr[2]=a3;
        for(i=0;i<3;i++)
        {
            if(arr[i]>k)
            {
                k=arr[i];
            }
            p=p*arr[i];
        }
        for(j=k;j<=p;j++)
        {
            for(i=0;i<3;i++)
            {
                if(j%arr[i]==0)
                {
                    c=c+1;
                }
            }
            if(c==3)
            {
                break;
            }
            else
            {
                c=0;
            }
        }
        return j;
    }

    public void calculateHcf(View view)
    {
        EditText editTextNumber1   = (EditText)findViewById(R.id.editTextNumber1);
        String value1= editTextNumber1.getText().toString();
        int a1=Integer.parseInt(value1);
        EditText editTextNumber2   = (EditText)findViewById(R.id.editTextNumber2);
        String value2= editTextNumber2.getText().toString();
        int a2=Integer.parseInt(value2);
        EditText editTextNumber3   = (EditText)findViewById(R.id.editTextNumber3);
        String value3= editTextNumber3.getText().toString();
        int a3=Integer.parseInt(value3);

        int ans = calcHcf(a1,a2,a3);

        TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("" + ans);


    }

    private int calcHcf(int a1, int a2, int a3)
    {
        int arr[]=new int[3];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        int k=10000000;
        int h=1;
        System.out.println("Enter the numbers");
        for(int i=0;i<3;i++)
        {

            if(arr[i]<k)
                k=arr[i];
        }
        for(int i=2;i<=k;i++)
        {
            int c=0;
            for(int j=0;j<3;j++)
            {
                if(arr[j]%i==0)
                    c=c+1;
            }
            if(c==3)
                h=i;
        }
        return h;
    }




}