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

public class TopupRequestStatus extends Fragment {

    ListView mlistview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mlistview = getActivity().findViewById(R.id.toplistview);

        View rootview = inflater.inflate(R.layout.activity_topup_request_status, container, false);
        ListView mlistview = (ListView) rootview.findViewById(R.id.toplistview);

        TopupData data1 = new TopupData(1, "murali", "murali@oceansoftwares.com", "9876543210", 147, "State Bank",
                4800, "Test comments", "Activie");
        TopupData data2 = new TopupData(2, "vignesh", "vignesh@oceansoftwares.com", "645789321", 65, "Indain Bank",
                18800, "Test comments", "Process");
        TopupData data3 = new TopupData(3, "Ram", "ram@oceansoftwares.com", "7894562130", 47, "Kotak Bank",
                4800, "Test comments", "Activie");
        TopupData data4 = new TopupData(4, "murali", "murali@oceansoftwares.com", "9876543210", 147, "State Bank",
                4800, "Test comments", "Activie");

        ArrayList<TopupData> topupData = new ArrayList<>();

        topupData.add(data1);
        topupData.add(data2);
        topupData.add(data3);
        topupData.add(data4);

        Dashboardadapter dashboardadapter = new Dashboardadapter(getActivity(), R.layout.dashboard_table_row, topupData);

        // Add a header to the ListView

        inflater = getLayoutInflater();
        ViewGroup header = (ViewGroup) inflater.inflate(R.layout.dashboard_table_header, mlistview, false);
        mlistview.addHeaderView(header);

        mlistview.setAdapter(dashboardadapter);
        return rootview;

    }
}
