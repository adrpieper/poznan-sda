package com.example.lv.numbers.adrian.numberslistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.editText);
        ListView numbersListView = (ListView) findViewById(R.id.numbersListView);
        Button addButton = (Button) findViewById(R.id.addButton);
        TextView maxTextView = (TextView) findViewById(R.id.maxTextView);
        TextView minTextView = (TextView) findViewById(R.id.minTextView);
        TextView meanTextView = (TextView) findViewById(R.id.meanTextView);

        List<Integer> numbers = generateNumbers();

        NumberAdapter numberAdapter = new NumberAdapter(numbers);
        numbersListView.setAdapter(numberAdapter);
    }

    private List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(1);
        return numbers;
    }

    private class NumberAdapter extends BaseAdapter {

        private List<Integer> numbers;

        private NumberAdapter(List<Integer> numbers) {
            this.numbers = numbers;
        }

        @Override
        public int getCount() {
            return numbers.size();
        }

        @Override
        public Object getItem(int position) {
            return numbers.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView;
            if (convertView != null) {
                textView = (TextView) convertView;
            }else {
                textView = new TextView(MainActivity.this);
            }
            textView.setText(String.valueOf(numbers.get(position)));
            return textView;
        }
    }
}
