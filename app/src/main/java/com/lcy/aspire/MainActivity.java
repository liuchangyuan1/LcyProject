package com.lcy.aspire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lcy.aspire.activity.TableViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tableView = (TextView) findViewById(R.id.tableView);
        tableView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tableView:
                startActivity(new Intent(this,TableViewActivity.class));
                break;
        }
    }
}
