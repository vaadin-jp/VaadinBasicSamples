package com.example.demo.charts;

import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * ① Vaadin の Chart を使うためには、 build.gradle の dependancies セクションの中に下記の一行を追加してください。
 * implementation 'com.vaadin:vaadin-charts-flow'
 */
@Route("pie-chart")
public class PieChartView extends VerticalLayout {

    Double[] data = {10.0, 41.0, 35.0, 51.0, 49.0, 62.0};

    public PieChartView() {

        Chart chart = new Chart(ChartType.PIE); // ①
        chart.setWidthFull();
        chart.setHeight("600px");

        DataSeries series = new DataSeries(); // ②
        series.add(new DataSeriesItem("Jan", data[0])); // ③
        series.add(new DataSeriesItem("Feb", data[1])); // ③
        series.add(new DataSeriesItem("Mar", data[2])); // ③
        series.add(new DataSeriesItem("Apr", data[3])); // ③
        series.add(new DataSeriesItem("May", data[4])); // ③
        series.add(new DataSeriesItem("Jun", data[5])); // ③

        Configuration config = chart.getConfiguration(); // ④
        config.setTitle("Pie Chart");
        config.setSeries(series);

        this.setWidthFull();
        this.add(chart);
   }
}