package org.athreya.project.impl;

import org.athreya.project.interfaces.RsiOmniStore;

public class Backend implements RsiOmniStore {
    @Override
    public String getDepartmentName() {
        return "Backend Department";
    }

    @Override
    public int getNumberOfEmployees() {
        return 4;
    }

    @Override
    public int getODCNumber() {
        return 11;
    }

    @Override
    public void work() {
        System.out.println("Backend Team Working !");
    }
}
