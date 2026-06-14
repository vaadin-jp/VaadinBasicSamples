package com.example.demo.layouts;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("horizontal-layout")
public class HorizontalLayoutView extends VerticalLayout{
    
    public HorizontalLayoutView() {
        sample0();
        sample1();
        sample2();
        sample3();
        sample4();
        sample5();
        sample6();
    }

    /**
     * HorizontalLayout の コンポーネントの幅調整は一切しないサンプル
     */
    private void sample0() {

        var component1 = new TextField();
        var component2 = new Button("ボタンです");       

        var horizontalLayout = new HorizontalLayout();

        horizontalLayout.add(component1, component2);
        horizontalLayout.setWidthFull();

        this.add(horizontalLayout);
    }

    /**
     * HorizontalLayout の コンポーネントに幅をセットするサンプル
     */
    private void sample1() {

        var component1 = new TextField();
        var component2 = new Button("ボタンです");       

        component1.setWidth("90%");
        component2.setWidth("10%");

        var horizontalLayout = new HorizontalLayout();

        // horizontalLayout.getStyle().set("background-color", "lightGreen"); // 横並びのレイアウトをわかりやすくするために、横並びのレイアウトの背景色を薄い緑色にします。

        horizontalLayout.add(component1, component2);
        horizontalLayout.setWidthFull();

        this.add(horizontalLayout);
    }

    /**
     * HorizontalLayout の setFlexGrow()メソッドを使って中のコンポーネントの割合を調整するサンプル
     */
    private void sample2() {

        var component1 = new TextField();
        var component2 = new Button("ボタンです");       

        var horizontalLayout = new HorizontalLayout();

        // horizontalLayout.getStyle().set("border", "1px solid black"); // 横並びのレイアウトをわかりやすくするために、横並びのレイアウトの周りに黒い線をつけます。

        horizontalLayout.add(component1, component2);
        horizontalLayout.setWidthFull();
        horizontalLayout.setFlexGrow(9, component1); // component1が9割、component2が1割の幅になるように設定
        horizontalLayout.setFlexGrow(1, component2); // component1が9割、component2が1割の幅になるように設定

        this.add(horizontalLayout);
    }


    /**
     * HorizontalLayout の特定のコンポーネントだけを右寄せにするサンプル
     * 余ったスペースがあればcomponent1だけが広がっていくようにする
     */
    private void sample3() {

        var component1 = new TextField();
        var component2 = new Button("ボタンです");       

        var horizontalLayout = new HorizontalLayout();

        // horizontalLayout.getStyle().set("border", "1px solid red"); // 横並びのレイアウトをわかりやすくするために、横並びのレイアウトの周りに黒い線をつけます。
        
        horizontalLayout.add(component1, component2);
        horizontalLayout.setWidthFull();
        horizontalLayout.setFlexGrow(1, component1); // 余ったスペースがあればcomponent1だけが広がっていくようにする

        this.add(horizontalLayout);
    }

    /**
     * HorizontalLayout の expand() メソッドを使って特定のコンポーネントだけを大きくするサンプル
     */
    private void sample4() {

        var component1 = new TextField();
        var component2 = new Button("ボタンです");       

        component2.getStyle().set("margin-left", "auto"); // component2の左側マージンを auto にする

        var horizontalLayout = new HorizontalLayout();

        // horizontalLayout.getStyle().set("border", "1px solid yellow"); // 横並びのレイアウトをわかりやすくするために、横並びのレイアウトの周りに黒い線をつけます。
        
        horizontalLayout.add(component1, component2);
        horizontalLayout.setWidthFull();
        horizontalLayout.expand(component1); // expand()メソッドで component1だけを大きくする

        this.add(horizontalLayout);
    }

    /**
     * HorizontalLayout の特定のコンポーネントだけを右寄せにするサンプル
     * component2の左側マージン "margin-left" を "auto" にする
     */
    private void sample5() {

        var component1 = new TextField();
        var component2 = new Button("ボタンです");       

        component2.getStyle().set("margin-left", "auto"); // component2の左側マージンを auto にする

        var horizontalLayout = new HorizontalLayout();

        // horizontalLayout.getStyle().set("border", "1px solid red"); // 横並びのレイアウトをわかりやすくするために、横並びのレイアウトの周りに黒い線をつけます。
        
        horizontalLayout.add(component1, component2);
        horizontalLayout.setWidthFull();

        this.add(horizontalLayout);
    }

    /**
     * HorizontalLayout の縦方向のアラインメントをベースラインに設定するサンプル
     * component2の左側マージンを auto にする
     */
    private void sample6() {
        var component1 = new TextField("お名前");
        var component2 = new TextField("ご住所");
        var component3 = new Button("送信");               
        var layout = new HorizontalLayout();
        layout.add(component1, component2, component3);
        layout.setWidthFull();
        layout.setAlignItems(Alignment.BASELINE);
        this.add(new H1("お名前とご住所を入力してください"), layout);
    }
}
