package com.example.webwrapper; 

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private WebView webView;
    private FrameLayout rootLayout;
    private FrameLayout splashLayout;
    
    private final String targetTelegram = "https://t.me/pw0mod";
    private final String homeUrl = "https://pwthor.live/study/batches/698ec4d979fb4aa23c1fd2c3";
    private final long EXPIRY_TIME_MS = 1786783022000L;

    private final String BASE64_LOGO = "iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAYAAABccqhmAAAABHNCSVQICAgIfAhkiAAAAAlwSFlz" +
            "AAALEgAACxIB0t1+/AAAABZ0RVh0Q3JlYXRpb24gVGltZQAwNy8xNy8yNlRy2moAAAAcdEVYdFNv" +
            "ZnR3YXJlAEFkb2JlIEZpcmV3b3JrcyBDUzTree4nAAAQM0lEQVR4nO3dfZBdZX3H8c+5d7NJdpPN" +
            "JptNJrshIZnAIJgEIkZsx47WKoK1dTrTttqx7bTjY6etdTrTzsy0nTrjY6eddtrpaDtti7a1Kk5B" +
            "CwWVUIQpQh4CgUAekuyG3ezuZpPd7O7tPef0j3Oyu5tNstnce+7N7vN7zdzZc889d++5+5zf93f+" +
            "5/f7fQEAAAAAAP8fe7wLAAAAAPCXIkAAAAAARIIAAAAAQIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQI" +
            "AAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAAAIQIAAAA" +
            "AAAA8H/tfx8j129p7pnsAAAAAElFTksuQmND";

    private Handler urlCheckHandler = new Handler();
    private Runnable urlCheckRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isAppExpired()) {
            redirectToTelegramAndExit();
            return;
        }

        // Setup Parent Layout Containers
        rootLayout = new FrameLayout(this);
        webView = new WebView(this);
        splashLayout = new FrameLayout(this);

        // Add WebView as the base layer underneath
        rootLayout.addView(webView);
        
        // Setup Splash Screen Container with a pure BLACK background to match the logo
        splashLayout.setBackgroundColor(0xFF000000); 
        ImageView splashImageView = new ImageView(this);
        splashImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        
        // Dynamic Layout parameters to give padding to the logo inside the center
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, 
                FrameLayout.LayoutParams.MATCH_PARENT
        );
        int paddingPx = (int) (40 * getResources().getDisplayMetrics().density);
        splashImageView.setPadding(paddingPx, paddingPx, paddingPx, paddingPx);
        
        splashLayout.addView(splashImageView, lp);
        rootLayout.addView(splashLayout);
        
        setContentView(rootLayout);

        // Decode base64 image and display it instantly
        try {
            byte[] decodedString = Base64.decode(BASE64_LOGO, Base64.DEFAULT);
            android.graphics.Bitmap decodedByte = android.graphics.BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
            splashImageView.setImageBitmap(decodedByte);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Hide Splash Screen after exactly 5 seconds (5000ms)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (splashLayout != null) {
                    splashLayout.setVisibility(View.GONE);
                }
            }
        }, 5000);

        // Setup WebView Settings
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                return checkAndRedirect(url);
            }

            @Override
            public void onPageStarted(WebView view, String url, android.graphics.Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                injectCustomCSS(view, url);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                injectCustomCSS(view, url);

                if (url != null && url.toLowerCase().contains("/study/donate")) {
                    return;
                }

                // ULTRA FLASH MODE - 100ms LOOP WITH HIGH-PERFORMANCE FILTERS
                String jsCode = "javascript:(function() { " +
                        "setInterval(function() { " +
                        
                            // 1. FAST TEXT REPLACEMENT
                            "var textNodes = document.querySelectorAll('span, p, div, h1, h2, h3, b, strong'); " +
                            "for (var i = 0; i < textNodes.length; i++) { " +
                                "var el = textNodes[i]; " +
                                "if(el.closest('.video-js, .plyr, video, [class*=\"player\"], [class*=\"vjs\"]')) continue; " + 
                                "if(el.children.length === 0 && el.innerText && el.innerText.trim() === 'PW THOR') { " +
                                    "el.innerText = 'PREMIUM PW'; " +
                                "} " +
                            "} " +

                            // 2. NEW BLUE LOGO IMAGE REMOVER
                            "var badLogos = document.querySelectorAll(\"img[src*='pwthor.site/logo.png']\"); " +
                            "for (var j = 0; j < badLogos.length; j++) { " +
                                "var container = badLogos[j].closest('div.rounded-full') || badLogos[j].parentElement; " +
                                "if(container) { container.style.setProperty('display', 'none', 'important'); } " +
                            "} " +

                            // 3. TARGETED AVATAR CONTAINER REMOVER
                            "var avatars = document.querySelectorAll('div.w-10.h-10.rounded-full.overflow-hidden'); " +
                            "for (var aIndex = 0; aIndex < avatars.length; aIndex++) { " +
                                "avatars[aIndex].style.setProperty('display', 'none', 'important'); " +
                            "} " +

                            // 4. TEXT-BASED ELEMENT ASSASSIN
                            "var killList = ['Contact Us', 'Download', 'PWTHOR owner', '@pwthor', 'Join Our Community', 'Telegram Community !!']; " +
                            "var targetElements = document.querySelectorAll('div, span, a, li, button, p'); " +
                            "for (var k = 0; k < targetElements.length; k++) { " +
                                "var element = targetElements[k]; " +
                                "if(element.closest('.video-js, .plyr, video, [class*=\"player\"], [class*=\"vjs\"]')) { " +
                                    "if(!element.innerText || !element.innerText.includes('Download')) { continue; } " +
                                "} " +
                                "if (element.children.length === 0 && element.innerText) { " +
                                    "var txt = element.innerText.trim(); " +
                                    "for (var m = 0; m < killList.length; m++) { " +
                                        "if (txt === killList[m] || txt.includes(killList[m])) { " +
                                            "var box = element.closest('div[class*=\"flex\"], div[class*=\"item\"], a, li, button, div[role=\"dialog\"]') || element.parentElement; " +
                                            "if (box && box.tagName !== 'BODY' && box.tagName !== 'HTML') { " +
                                                "box.style.setProperty('display', 'none', 'important'); " +
                                            "} " +
                                        "} " +
                                    "} " +
                                "} " +
                            "} " +

                            // 5. MODAL POPUP BACKUP KILLER
                            "var dialogs = document.querySelectorAll('div[role=\"dialog\"]'); " +
                            "for (var n = 0; n < dialogs.length; n++) { " +
                                "if(dialogs[n].closest('.video-js, .plyr, video, [class*=\"player\"], [class*=\"vjs\"]')) continue; " +
                                "dialogs[n].style.setProperty('display', 'none', 'important'); " +
                            "} " +

                        "}, 100); " + 
                "})()";

                view.loadUrl(jsCode);
            }
        });

        urlCheckRunnable = new Runnable() {
            @Override
            public void run() {
                if (isAppExpired()) {
                    redirectToTelegramAndExit();
                    return;
                }
                if (webView != null) {
                    String currentUrl = webView.getUrl();
                    if (currentUrl != null && !currentUrl.equals("about:blank")) {
                        checkAndRedirect(currentUrl);
                    }
                }
                urlCheckHandler.postDelayed(this, 1000); 
            }
        };
        urlCheckHandler.postDelayed(urlCheckRunnable, 1000);

        webView.loadUrl(homeUrl);
    }

    private void injectCustomCSS(WebView view, String url) {
        if (url != null && url.toLowerCase().contains("/study/donate")) {
            return;
        }
        
        try {
            String css = "img[alt='PW THOR'], .bg-muted { display: none !important; }" +
                    "div[class*='cursor-pointer']:has(span:contains('Contact Us')), " +
                    "div[class*='cursor-pointer']:has(span:contains('Donate Batch')) { display: none !important; }";
            String js = "var style = document.getElementById('custom-css-injection');" +
                    "if(!style) {" +
                    " style = document.createElement('style');" +
                    " style.id = 'custom-css-injection';" +
                    " style.innerHTML = \"" +
                    " img[alt='PW THOR'], span.bg-muted { display: none !important; } " +
                    " div.flex.items-center:has(svg.lucide-contact), div.flex.items-center:has(svg.lucide-heart) { display: none !important; }" +
                    " \";" +
                    " document.head.appendChild(style);" +
                    "}";
            view.loadUrl("javascript:(function() { " + js + " })()");
        } catch (Exception e) {}
    }

    private boolean isAppExpired() {
        return System.currentTimeMillis() >= EXPIRY_TIME_MS;
    }

    private void redirectToTelegramAndExit() {
        try {
            Toast.makeText(this, "App validity expired!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(targetTelegram));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {}
        finish();
    }

    private boolean checkAndRedirect(String url) {
        String urlLower = url.toLowerCase();
        if (urlLower.contains("static.pw.live") || url.equals(targetTelegram)) {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return true;
            } catch (Exception e) { return false; }
        }
        
        if (urlLower.contains("t.me/pw_thor") || urlLower.contains("t.me/pwthor1") ||
                urlLower.cont
