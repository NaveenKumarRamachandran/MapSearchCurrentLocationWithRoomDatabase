package com.naveen.samplemap.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.naveen.samplemap.APICallback;
import com.naveen.samplemap.R;
import com.naveen.samplemap.RetrofitCallApi;
import com.naveen.samplemap.model.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    EditText mail,pwd;
    APICallback apiCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mail=findViewById(R.id.mail_id);
        pwd=findViewById(R.id.password);
    }

    void login(View v){

    }


    public void fetchinformation(final String email, String password) {
        apiCallback = RetrofitCallApi.getRetrofit().create(APICallback.class);

        Call<List<UserModel>> call = apiCallback.getUserData(email, password);
        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                /*UserModel userModel = response.body();
                assert userModel != null;
                for (UserModel sm : userModel) {
                    if (sm.getStatusValue().equals("Success")) {
                        int userID = sm.getStatusId();

                        String userName=sm.getUserName();
                        Toast.makeText(Login.this, "Authentication Success", Toast.LENGTH_SHORT).show();
                        SharedPreferences sharedPreferences = getSharedPreferences("User", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("UserName",userName);
                        editor.putInt("UserID", userID);
                        editor.commit();

                        if(editor.commit()) {
                            // Toast.makeText(Loginactivity.this, "UserName"+userName, Toast.LENGTH_SHORT).show();
                            finish();
                        }

                    } else {
                        Toast.makeText(Login.this, "Authentication Failed", Toast.LENGTH_SHORT).show();

                    }}
*/
                }


            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                Toast.makeText(Login.this, "Network Error" + t, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
