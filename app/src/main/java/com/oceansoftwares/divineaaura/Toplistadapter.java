package com.oceansoftwares.divineaaura;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.oceansoftwares.divineaaura.entities.TopupData;

import java.util.ArrayList;
import java.util.List;

class Toplistadapter extends ArrayAdapter<TopupData> {

    private static  final String TAG = "Toplistadapter";
    private Context mcontext;
    int mresource;

    public Toplistadapter(Context context, int resource, ArrayList<TopupData> objects) {
        super(context, resource, objects);

        mcontext = context;
        mresource = resource;
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        int id = getItem(position).getId();
        String name = getItem(position).getName();
        String email = getItem(position).getEmail();
        String phone = getItem(position).getMobile();
        int referenceno = getItem(position).getReferenceNo();
        String bank = getItem(position).getBank();
        int amount = getItem(position).getAmount();
        String comments = getItem(position).getComments();
        String status = getItem(position).getStatus();

        TopupData topupData = new TopupData(id,name,email,phone,referenceno,bank,amount,comments,status);
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mresource, parent, false );


        TextView tvname = convertView.findViewById(R.id.toptvid);
        TextView tvreferenceno = convertView.findViewById(R.id.toptvreferenceno);
        TextView tvbank = convertView.findViewById(R.id.toptvbank);
        TextView tvamount = convertView.findViewById(R.id.toptvamount);
        TextView tvcomments = convertView.findViewById(R.id.toptvcomments);
        TextView tvstatus = convertView.findViewById(R.id.toptvstatus);

        tvname.setText(name);
        tvreferenceno.setText(Integer.toString(referenceno));
        tvbank.setText(bank);
        tvamount.setText(Integer.toString(amount));
        tvcomments.setText(comments);
        tvstatus.setText(status);
        return convertView;

    }
}
