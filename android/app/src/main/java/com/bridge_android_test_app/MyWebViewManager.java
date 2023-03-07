package com.bridge_android_test_app;

import android.os.Build;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import im.delight.android.webview.AdvancedWebView;

public class MyWebViewManager extends SimpleViewManager<AdvancedWebView> {

    public static final String REACT_CLASS = "MyWebView";


    @NonNull
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @NonNull
    @Override
    protected AdvancedWebView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        final AdvancedWebView webView = new AdvancedWebView(themedReactContext);

        callAvv(webView);

        return webView;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void callAvv(AdvancedWebView webView) {

        webView.getWebChromeClient();
        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        webView.getSettings().getJavaScriptEnabled();
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.setDesktopMode(true);
        webView.loadUrl("file:///android_asset/3dView/car.html");

    }
}
