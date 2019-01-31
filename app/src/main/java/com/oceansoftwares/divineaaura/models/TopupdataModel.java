package com.oceansoftwares.divineaaura.models;

import com.oceansoftwares.divineaaura.entities.TopupData;

import java.util.ArrayList;
import java.util.List;

public class TopupdataModel {

    public List<TopupData> findalldata() {

        List<TopupData> topupData = new ArrayList<TopupData>();

        topupData.add(new TopupData(1, "murali", "murali@oceansoftwares.com", "9876543210", 147, "State Bank",
                4800, "Test comments", "Activie"));
        topupData.add(new TopupData(2, "vignesh", "vignesh@oceansoftwares.com", "645789321", 65, "Indain Bank",
                18800, "Test comments", "Process"));
        topupData.add(new TopupData(3, "Ram", "ram@oceansoftwares.com", "7894562130", 47, "Kotak Bank",
                4800, "Test comments", "Activie"));
        topupData.add(new TopupData(4, "murali", "murali@oceansoftwares.com", "9876543210", 147, "State Bank",
                4800, "Test comments", "Activie"));
        return topupData;

    }

    public TopupData find(int id){
        for (TopupData topupData : this.findalldata()){
            if(topupData.getId()==(id)){
                return topupData;
            }
        }
        return null;

    }
}
