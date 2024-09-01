package org.athreya.project.impl;

import org.athreya.project.interfaces.RsiOmniStore;

public class Analytics implements RsiOmniStore {
    @Override
    public String getDepartmentName() {
        return "Analytics Department";
    }

    @Override
    public int getNumberOfEmployees() {
        return 2;
    }

    @Override
    public int getODCNumber() {
        return 11;
    }

    @Override
    public void work() {
        System.out.println("Analytics Team Working !");
    }
}
