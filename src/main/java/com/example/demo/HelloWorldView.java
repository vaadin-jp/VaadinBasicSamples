package com.example.demo; // ①

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * 最もシンプルな「ハローワールド」の画面です。
 * 
 * ポイント①：このクラスは、DemoApplication.java と同じパッケージ（フォルダ）に配置してください。
 * 
 * ポイント②：クラスの定義の直前に @Route と記述して、パスを指定します。
 * この例では http://localhost:8080/hello と指定したときに表示される画面を定義しています。
 * 
 * ポイント③：VerticalLayoutを継承してください。
 * VerticalLayoutは、縦並びに部品を並べていくための「土台」です。
 * 
 * ポイント④：add()メソッドで "こんにちは、世界！" という文字列を画面に表示しています。
 */
@Route("hello") // ①
public class HelloWorldView extends VerticalLayout{ // ②

    public HelloWorldView(){
        add("こんにちは、世界！"); // ③
    }
}
