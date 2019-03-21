package com.uni.mihai.radu;

import com.sun.deploy.panel.ControlPanel;

import javax.swing.*;

public class CatalogFrame extends JFrame {
    GraphForm form;
    CatalogList list;
    ControlPanel control;

    public CatalogFrame() {
        super("Visual Graph Manager");
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}