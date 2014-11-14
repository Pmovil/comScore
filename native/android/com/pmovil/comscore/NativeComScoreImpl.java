package com.pmovil.comscore;

import android.app.Activity;
import com.codename1.impl.android.CodenameOneActivity;
import java.util.HashMap;

public class NativeComScoreImpl {
    private static CodenameOneActivity app;
    
    public void initComScore() {
        app = (CodenameOneActivity) comScore.getContext();
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.setAppContext(app);
            }
        });
    }

    public void setCustomerC2(final String c2Value) {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.setCustomerC2(c2Value);
            }
        });
    }

    public void setPublisherSecret(final String publisherSecretCode) {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.setPublisherSecret(publisherSecretCode);
            }
        });
    }

    public void setAppName(final String applicationName) {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.setAppName(applicationName);
            }
        });
    }

    public void onEnterForeground() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.onEnterForeground();
            }
        });
    }

    public void onExitForeground() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.onExitForeground();
            }
        });
    }

    public void onUxActive() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.onUxActive();
            }
        });
    }

    public void onUxInactive() {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.onUxInactive();
            }
        });
    }

    public void enableAutoUpdate(final int interval, final boolean foregroundOnly) {
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.enableAutoUpdate(interval, foregroundOnly);
            }
        });
    }

    public void view(String param, String param1) {
        final HashMap hash = new HashMap();
        hash.put(param, param1);
        app.runOnUiThread(new Runnable() {
            public void run() {
                com.comscore.analytics.comScore.view(hash);
            }
        });
    }

    public boolean isSupported() {
        return true;
    }

}
