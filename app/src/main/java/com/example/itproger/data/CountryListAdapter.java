package com.example.itproger.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.itproger.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountryListAdapter extends ArrayAdapter<Country>{

    private Context mContext;
    int mResource;
    public CountryListAdapter(@NonNull Context context, int resource, @NonNull Country[] objects) {
        super(context, resource, objects);
        mContext=context;
        mResource = resource;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String countryName = Objects.requireNonNull(getItem(position)).getCountryName();
        String flagName = Objects.requireNonNull(getItem(position)).getFlagName();
        String population = String.valueOf(Objects.requireNonNull(getItem(position)).getPopulation());

//        Country country = new Country(countryName,flagName,population);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvFlagName = (TextView)convertView.findViewById(R.id.TextView1);
        TextView tvCountryName = (TextView)convertView.findViewById(R.id.TextView2);
        TextView tvPopulation = (TextView)convertView.findViewById(R.id.TextView3);

        tvFlagName.setText(flagName);
        tvCountryName.setText(countryName);
        tvPopulation.setText(population);

        return convertView;
    }
}
