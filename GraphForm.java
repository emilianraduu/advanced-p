package com.uni.mihai.radu;

import javax.swing.*;

public class GraphForm extends JPanel {
    private final CatalogFrame frame;
    JLabel titleLabel = new JLabel("Name of the graph");
    JSpinner verticesField = new JSpinner(
            new SpinnerNumberModel());

    public GraphForm(CatalogFrame frame) {
        this.frame = frame;
    }

    private void init() {

    }
    private void addGraph() {
    }
}