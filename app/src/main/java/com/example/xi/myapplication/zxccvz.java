package com.example.xi.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.button2;

public class zxccvz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  denglubutton= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(zxccvz.this);
                LayoutInflater inflater = getLayoutInflater();
                builder.setView(inflater.inflate(R.layout.duihuakuang, null)).setTitle("登陆")
                        .setPositiveButton("登陆", new DialogInterface.OnClickListener() {
                            View view = getLayoutInflater().inflate(R.layout.denglu1, null);//????
                            EditText userid = (EditText) view.findViewById(R.id.editTextUserId);
                            EditText password = (EditText) view.findViewById(R.id.editTextPwd);

                            public void onClick(DialogInterface dialog, int id) {
                                if (!userid.getText().toString.equals("abc") || !password.getText().equals("123")) {
                                    Toast.makeText(zxccvz.this, "用户名或密码错误", Toast.LENGTH_LONG).show();
                                }
                                Toast.makeText(zxccvz.this, "登陆成功", Toast.LENGTH_LONG).show();
                            }

                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                builder.show();
            }

            dialogbutton.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v){
                    AlertDialog.Builder builder = new AlertDialog.Builder(zzccvz.this);
                    builder.setMessage("请点击登陆按钮").setTitle("温馨提示");
                    builder.show();
                }
            }
            });
        }






}

