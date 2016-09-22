package com.nick.study.dagger2test.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.nick.study.dagger2test.MainActivityModule;
import com.nick.study.dagger2test.MyApplication;
import com.nick.study.dagger2test.R;
import com.nick.study.dagger2test.utils.HttpHelper;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    HttpHelper httpHelper;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.get(this).getAppComponent()
                .plus(new MainActivityModule())
                .inject(this);
        textView = (TextView) findViewById(R.id.tv);

        httpHelper.get("https://api.github.com/users/nickyangjun", new HttpHelper.Listener() {
            @Override
            public void onSuccess(final String response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(response);
                    }
                });
            }

            @Override
            public void onFailed() {

            }
        });
        httpHelper.get("https://api.github.com/users/nickyangjun", new HttpHelper.Listener() {
            @Override
            public void onSuccess(final String response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(response);
                    }
                });
            }

            @Override
            public void onFailed() {

            }
        });
    }
}
