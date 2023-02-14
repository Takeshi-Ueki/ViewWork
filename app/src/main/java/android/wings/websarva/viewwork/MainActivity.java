package android.wings.websarva.viewwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout margin = findViewById(R.id.margin);
        margin.setOnClickListener(new MarginClickListener());
        TextView tv_send = findViewById(R.id.tv_send);
        tv_send.setOnClickListener(new TextClickListener());
        Button link = findViewById(R.id.btn_link);
        link.setOnClickListener(new ButtonClickListener());
    }

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            Uri uri = Uri.parse("http://www.r-jc.jp/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }

    /**
     * テキストの周りをタップしたときの処理
     */
    private class MarginClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SampleActivity.class);
            startActivity(intent);
        }
    }

    /**
     * テキストをタップしたときの処理
     */
    private class TextClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            return;
        }
    }
}