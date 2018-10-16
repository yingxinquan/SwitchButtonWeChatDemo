package com.mundane.likewechatswitchbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.switch_button)
    WeChatSwitchButton mSwitchButton;
    @Bind(R.id.tv)
    TextView     mTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSwitchButton.setOnCheckedChangeListener(new WeChatSwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(WeChatSwitchButton buttonView, boolean isChecked) {
                mTv.setText(isChecked ? "开" : "关");
            }
        });
    }
}
