package com.example.zheng.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xi.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Verbose Message");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Button loginbutton = (Button)findViewById(R.id.button2);
        Button dialogbutton = (Button)findViewById(R.id.button3);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater layoutnflater = getLayoutInflater();
                builder.setView(layoutnflater.inflate(R.layout.login_dialog,null)).setTitle("登陆")
                        .setPositiveButton("登陆", new DialogInterface.OnClickListener(){
                            View view = getLayoutInflater().inflate(R.layout.login_dialog,null);
                            EditText userid = (EditText)view.findViewById(R.id.userId);
                            EditText password =(EditText)view.findViewById(R.id.passWord);
                            @Override
                            public void onClick(DialogInterface dialog,int id){
                                if(!userid.getText().equals("abc")||!password.getText().equals("123"))
                                {
                                    Toast.makeText(MainActivity.this,"用户名或密码错误",Toast.LENGTH_LONG).show();
                                }Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                            }
                        }).setNegativeButton("取消",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int id) {
                    }
                });
                builder.show();
            }
        });
        dialogbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("请点击登陆按钮").setTitle("温馨提示");
                builder.show();
            }
        });
    }
}
