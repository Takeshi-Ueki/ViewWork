package android.wings.websarva.viewwork;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class SampleListAdapter extends ArrayAdapter<String> {

    LayoutInflater mInflater;

    static final class ViewHolder {
        TextView mCassetteName;
    }

    public SampleListAdapter(Context context) {
        super(context, 0);
        mInflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final View view;
        final ViewHolder holder;

        //
        if (convertView == null) {
            view = mInflater.inflate(R.layout.adapter_sample_list_item, null);
            holder = new ViewHolder();
            holder.mCassetteName = (TextView) view.findViewById(R.id.cassette);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }

        // テキストセット
        holder.mCassetteName.setText("カセット:" + (position + 1));

        // 背景色セット
        if (position % 2 == 0) {
            view.setBackgroundColor(Color.LTGRAY);
        } else {
            view.setBackgroundColor(Color.TRANSPARENT);
        }

        if (position == 40) {
            Toast.makeText(view.getContext(), "40", Toast.LENGTH_LONG).show();
        }

        return view;
    }
}