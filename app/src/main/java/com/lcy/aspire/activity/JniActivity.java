package com.lcy.aspire.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.lcy.aspire.R;
import com.lcy.aspire.utils.JniUtils;

/**
 * Created by liucy01 on 2016/11/17.
 */
public class JniActivity extends Activity {
    private TextView jniTextView;
    private JniUtils jniUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jni_layout);
        initView();
        jniUtils = new JniUtils();
        jniTextView.setText(jniUtils.getCLanguageString());
    }

    private void initView() {
        jniTextView = (TextView) findViewById(R.id.jniTextView);
    }
}
