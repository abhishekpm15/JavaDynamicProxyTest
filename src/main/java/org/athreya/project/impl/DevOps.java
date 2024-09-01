package org.athreya.project.impl;

import org.athreya.project.interfaces.RsiOmniStore;

public class DevOps implements RsiOmniStore {
    @Override
    public String getDepartmentName() {
        return "DevOps Department";
    }

    @Override
    public int getNumberOfEmployees() {
        return 5;
    }

    @Override
    public int getODCNumber() {
        return 11;
    }

    @Override
    public void work() {
        System.out.println("DevOps Team Working !");
    }
}
