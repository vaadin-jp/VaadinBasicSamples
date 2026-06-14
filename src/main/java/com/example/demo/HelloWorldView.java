package com.example.demo;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloWorldView extends VerticalLayout{

    public HelloWorldView(){
        add("こんにちは、世界！");
    }
}
