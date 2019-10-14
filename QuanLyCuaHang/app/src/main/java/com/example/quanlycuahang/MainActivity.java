package com.example.quanlycuahang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.quanlycuahang.Admin.AdminActivity;
import com.example.quanlycuahang.Kitchen.KitchenActivity;
import com.example.quanlycuahang.Order.OrderActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton ibLogin;
    EditText edtTaiKhoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        dangNhap();
    }

    private void dangNhap() {
        ibLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = edtTaiKhoan.getText().toString();
                if (name.equals("1")) {
                    Intent intent = new Intent(MainActivity.this, AdminActivity.class);
                    startActivity(intent);
                }
                if (name.equals("2")) {
                    Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                    startActivity(intent);
                }
                if (name.equals("3")) {
                    Intent intent = new Intent(MainActivity.this, KitchenActivity.class);
                    startActivity(intent);
                }


            }
        });
    }

    private void init() {
        ibLogin = findViewById(R.id.ib_login);
        edtTaiKhoan = findViewById(R.id.edt_tai_khoan);
    }
}