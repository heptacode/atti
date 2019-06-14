package com.example.justbreathe.atti.Activity.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.justbreathe.atti.Activity.Activities.Register.RegisterActivity1;
import com.example.justbreathe.atti.R;

public class LoginActivity extends AppCompatActivity {
    Button login, register;
    EditText id, pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        id = findViewById(R.id.login_et_id);
        pw = findViewById(R.id.login_et_pw);
        login = findViewById(R.id.login_btn_login);
        register = findViewById(R.id.login_btn_register);

        //쉐어드프리퍼런스로 자동로그인
        //
        //
        //
        //

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sid = id.getText().toString();
                String spw = pw.getText().toString();
                //아이디 비번 서버 전송
                //서버에서 이름(String) 한국인 여부(boolean) 받기


//                Call<LoginData> call = NetworkHelper.getInstance().signin(sid,spw);
//                call.enqueue(new Callback<LoginData>() {
//                    @Override
//                    public void onResponse(Call<LoginData> call, Response<LoginData> response) {
//                        if(response.code()==123){
//                            if(response.body()!=null){
//                                //서버에서 이름 가져오기
//                                String name = response.body().getName();
//                                boolean korean = response.body().isKorean();
                                //쉐어드로 자동로그인 저장 및 아이디,비번,이름,한국인인지 User모델에 넣기
                                //id.getText().toString(), pw.getText().toString(), name, korean
                                //
                                //

                                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                                startActivity(intent);
                                finish();
//                            }
//                        }else if(response.code()==123){
//                            Toast.makeText(LoginActivity.this, "아이디 혹은 비밀번호를 다시 확인해주세요.", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                    @Override
//                    public void onFailure(Call<LoginData> call, Throwable t) {
//                        Toast.makeText(LoginActivity.this, "서버 요청에 문제가 생겼습니다. 잠시후 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
//                    }
//                });
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register_intent = new Intent(LoginActivity.this, RegisterActivity1.class);
                startActivity(register_intent);
                //회원가입 후 다시 돌아오기 위해 finish() 안함
            }
        });
    }
}