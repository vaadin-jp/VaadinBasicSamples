package com.example.demo.others;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * プッシュ通知を有効にするには、AppShellConfigurator を実装したクラスに
 * @Pushアノテーションをつける必要があります。
 * このプロジェクトでは MyAppConfig クラスに@Pushアノテーションをつけているので、
 * PushView クラスで getUI().access() メソッドを呼び出すとプッシュ通知ができます。 
 */

@Route("push")
public class PushView extends VerticalLayout {

    Button button = new Button("ボタンを押すとしばらくしてプッシュ通知");
    ProgressBar progressBar = new ProgressBar();   
    ExecutorService executorService = Executors.newSingleThreadExecutor();    

    public PushView(){
        progressBar.setVisible(false); // 最初はプログレスバーを非表示にしておく。
        progressBar.setIndeterminate(true); // プログレスバーを無限インジケーターにする。
        progressBar.setWidthFull(); // プログレスバーの幅を最大にする。
        button.setWidthFull(); // ボタンの幅を最大にする。
        button.addClickListener(event -> onButtonClicked());
        add(button, progressBar);
    }

private void onButtonClicked() {
    
    button.setEnabled(false); // ボタンを無効にする。
    progressBar.setVisible(true); // ボタンが押されたらプログレスバーを表示する。
    
    UI ui = UI.getCurrent(); // 現在のUIを取得する。これがないとプッシュ通知が送れない。UIはスレッドセーフではないので、別スレッドでアクセスする場合は getCurrent() でUIを取得してからアクセスする必要がある。

    executorService.submit(() -> {

        try {
            Thread.sleep(5000); // 5秒待つ（重い処理の代わり）
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        ui.access(() -> {
            button.setEnabled(true); // ボタンを有効にする。
            progressBar.setVisible(false); // プッシュ通知を送る前にプログレスバーを非表示にする。
            Notification.show("処理が完了しました！"); // プッシュ通知を表示する。
        });
    });
}
}
