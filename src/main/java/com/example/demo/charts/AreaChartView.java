package com.example.demo.charts;

import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * ① Vaadin の Chart を使うためには、 build.gradle の dependancies セクションの中に下記の一行を追加してください。
 * implementation 'com.vaadin:vaadin-charts-flow'
 */
@Route("area-chart")
public class AreaChartView extends VerticalLayout {

    Double[] data1 = {10.0, 41.0, 35.0, 51.0, 49.0, 62.0};
    Double[] data2 = {20.0, 32.0, 45.0, 42.0, 38.0, 46.0};
    Double[] data3 = {5.0, 10.0, 20.0, 35.0, 40.0, 80.0};

    public AreaChartView() {

        Chart chart = new Chart(ChartType.AREA); // ②
        chart.setWidthFull();
        chart.setHeight("600px");

        XAxis xAxis = new XAxis(); // ③
        xAxis.setCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun");

        PlotOptionsArea options = new PlotOptionsArea(); // ④
        options.setStacking(Stacking.NORMAL);

        ListSeries s1 = new ListSeries("Data 1", data1); // ⑤
        ListSeries s2 = new ListSeries("Data 2", data2); // ⑤
        ListSeries s3 = new ListSeries("Data 2", data2); // ⑤

        s1.setPlotOptions(options);
        s2.setPlotOptions(options);
        s3.setPlotOptions(options);

        Configuration config = chart.getConfiguration(); // ⑥
        config.setTitle("Area Chart");
        config.addxAxis(xAxis);
        config.addSeries(s1);
        config.addSeries(s2);
        config.addSeries(s3);

        this.setWidthFull();
        this.add(chart);
    }
}