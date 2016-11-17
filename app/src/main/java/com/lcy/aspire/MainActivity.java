package com.lcy.aspire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lcy.aspire.activity.JniActivity;
import com.lcy.aspire.activity.TableViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tableView, jniView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tableView = (TextView) findViewById(R.id.tableView);
        jniView = (TextView) findViewById(R.id.jniView);
        tableView.setOnClickListener(this);
        jniView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tableView:
                startActivity(new Intent(this, TableViewActivity.class));
                break;
            case R.id.jniView:
                startActivity(new Intent(this,JniActivity.class));
                break;
            default:
                break;
        }
    }
}
