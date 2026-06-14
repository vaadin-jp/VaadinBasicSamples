package com.example.demo.layouts;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("vertical-layout")
public class VerticalLayoutView extends HorizontalLayout{

    public VerticalLayoutView() {

        this.setSizeFull();

        H1 component1 = new H1("コンポーネント1");
        H1 component2 = new H1("コンポーネント2");       

        component1.setWidthFull();
        component1.getStyle().set("background-color", "lightblue");
        component1.getStyle().set("display", "flex");
        component1.getStyle().set("align-items", "center");
        component1.getStyle().set("justify-content", "center");

        component2.setWidthFull();
        component2.getStyle().set("background-color", "lightgreen");
        component2.getStyle().set("display", "flex");
        component2.getStyle().set("align-items", "center");
        component2.getStyle().set("justify-content", "center");

        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.add(component1, component2);
        verticalLayout.setWidthFull();
        verticalLayout.setFlexGrow(3, component1); // component1が3割、component3が7割の幅になるように設定
        verticalLayout.setFlexGrow(7, component2); // component1が3割、component2が7割の幅になるように設定

        this.add(verticalLayout);
    }

}
