package android.wings.websarva.viewwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SampleActivity extends AppCompatActivity {

    ListView mListView;
    ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        mListView = (ListView) findViewById(R.id.sample_list);
        mAdapter = new SampleListAdapter(getApplicationContext());

        View header = (View)getLayoutInflater().inflate(R.layout.header,null);
        View footer = (View)getLayoutInflater().inflate(R.layout.footer, null);

        mListView.addHeaderView(header);
        mListView.addFooterView(footer);

        for (int i = 1; i <= 50; i++) {
            mAdapter.add(i);
        }

        mListView.setAdapter(mAdapter);
    }
}