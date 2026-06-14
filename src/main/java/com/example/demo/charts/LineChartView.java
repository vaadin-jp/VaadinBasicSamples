package com.example.demo.charts;

import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * Vaadin の Chart を使うためには、 
 * build.gradle の dependancies セクションの中に下記の一行を追加してください。
 * implementation 'com.vaadin:vaadin-charts-flow'
 */
@Route("line-chart")
public class LineChartView extends VerticalLayout {

    Double[] data1 = {10.0, 41.0, 35.0, 51.0, 49.0, 62.0};
    Double[] data2 = {20.0, 32.0, 45.0, 42.0, 38.0, 46.0};
    Double[] data3 = {5.0, 10.0, 20.0, 35.0, 40.0, 80.0};

    public LineChartView() {

        Chart chart = new Chart(ChartType.LINE);
        chart.setWidthFull();
        chart.setHeight("600px");

        XAxis xAxis = new XAxis();
        xAxis.setCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun");

        Configuration config = chart.getConfiguration();
        config.setTitle("Line Chart");
        config.addxAxis(xAxis);
        config.addSeries(new ListSeries("Data 1", data1));
        config.addSeries(new ListSeries("Data 2", data2));
        config.addSeries(new ListSeries("Data 3", data3));

        this.setWidthFull();
        this.add(chart);
    }
}