package org.athreya.project.impl;

import org.athreya.project.interfaces.RsiOmniStore;

public class SapServices implements RsiOmniStore {
    @Override
    public String getDepartmentName() {
        return "Sap service Department";
    }

    @Override
    public int getNumberOfEmployees() {
        return 10;
    }

    @Override
    public int getODCNumber() {
        return 11;
    }

    @Override
    public void work() {
        System.out.println("Sap Service Team Working !");
    }
}
