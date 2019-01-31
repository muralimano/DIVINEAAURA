package com.oceansoftwares.divineaaura;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.oceansoftwares.divineaaura.entities.TopupData;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends Fragment {
    //    static String[][] tablecolmdata = {
//            {"1", "sabari raja", "sanjay88@gmail.com", "8015203449", "345678", "icic bank", "20000", "fdxgcvb", "Approved"},
//            {"2", "sabari raja", "sanjay88@gmail.com", "8015203449", "234567", "icic bank", "4000", "sgf", "Process"},
//            {"3", "sabari raja", "sanjay88@gmail.com", "8015203449", "12345", "icic bank", "1000", "interest", "Approved"},
//
//    };
//    static String[] spaceProbeHeaders = {"ID", "Name", "Email", "Mobile", "Reference", "No", "Bank", "Amount", "Comments", "Status"};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //   mlistview = getActivity().findViewById(R.id.toplistview);
 //       ListView mlistview = (ListView) getActivity().findViewById(R.id.toplistview);

        View rootview = inflater.inflate(R.layout.activity_dashboard, container, false);
//
//
//               4800, "Test comments", "Activie"));
//
//        TopupData data1 = new TopupData(1, "murali", "murali@oceansoftwares.com", "9876543210", 147, "State Bank",
//                4800, "Test comments", "Activie");
//        TopupData data2 = new TopupData(2, "vignesh", "vignesh@oceansoftwares.com", "645789321", 65, "Indain Bank",
//                18800, "Test comments", "Process");
//        TopupData data3 = new TopupData(3, "Ram", "ram@oceansoftwares.com", "7894562130", 47, "Kotak Bank",
//                4800, "Test comments", "Activie");
//        TopupData data4 = new TopupData(4, "murali", "murali@oceansoftwares.com", "9876543210", 147, "State Bank",
//                4800, "Test comments", "Activie");
//
//        ArrayList<TopupData> topupData = new ArrayList<>();
//
//        topupData.add(data1);
//
//        Toplistadapter toplistadapter = new Toplistadapter(getActivity(), R.layout.topup_table_row, topupData);
//
//        mlistview.setAdapter(toplistadapter);
//

        return rootview;

    }
}
