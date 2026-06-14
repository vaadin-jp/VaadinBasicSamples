package com.example.demo;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.aura.Aura;
import org.springframework.context.annotation.Configuration;

// Pushアノテーションを AppShellConfiguratorインターフェースを実装したクラスに付けておくと
// getUI().access()メソッドでプッシュ通知ができるようになります。
// Viewクラスに @Push をつけてもプッシュ通知はできませんのでご注意ください。

@Push 
@Configuration
@StyleSheet(Lumo.STYLESHEET) // あるいは、@StyleSheet(Aura.STYLESHEET)
public class MyAppConfig implements AppShellConfigurator {
    
}