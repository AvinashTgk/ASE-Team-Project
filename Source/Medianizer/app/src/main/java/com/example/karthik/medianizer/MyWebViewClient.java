package com.example.karthik.medianizer;

/**
 * Created by avina on 3/10/2017.
 */

import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Raghu on 2/25/16.
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