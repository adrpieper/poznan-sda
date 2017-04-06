package com.example.ps.adrian.personslist;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.ps.adrian.personslist.databinding.PersonViewBinding;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PersonProvider provider = new PersonProvider();
        PersonProvider provider = new FilePersonProvider(getResources());
        List<Person> persons = provider.provide();
        PersonAdapter personAdapter = new PersonAdapter(persons, getLayoutInflater());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(personAdapter);
    }

    private class PersonAdapter extends BaseAdapter {

        private List<Person> persons;
        private LayoutInflater layoutInflater;

        private PersonAdapter(List<Person> persons, LayoutInflater layoutInflater) {
            this.persons = persons;
            this.layoutInflater = layoutInflater;
        }

        @Override
        public int getCount() {
            return persons.size();
        }

        @Override
        public Object getItem(int position) {
            return persons.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            PersonViewBinding binding = PersonViewBinding.inflate(layoutInflater, parent, false);
            Person person = persons.get(position);
            binding.setPerson(person);
            return binding.getRoot();
        }
    }
}
