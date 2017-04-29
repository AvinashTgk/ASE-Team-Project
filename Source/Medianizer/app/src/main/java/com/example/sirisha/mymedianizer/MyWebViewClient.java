package com.example.sirisha.mymedianizer;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Sirisha on 3/13/17.
 */

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (!Uri.parse(url).getHost().equals("www.example.com"))
        {
            return false;
        }

        return false;
    }
}