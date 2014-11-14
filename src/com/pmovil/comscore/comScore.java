/*
 * The MIT License
 *
 * Copyright 2014 Pmovil LTDA.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pmovil.comscore;

import com.codename1.system.NativeLookup;

/**
 * comScore support in cn1
 *
 * @author Fabricio
 */
public class comScore {
    
    private static Object contextValue;
    private static NativeComScore peer;
    
    private comScore() {
    }
    
    public static void init(Object context) throws RuntimeException {
        if (peer == null) {
            peer = (NativeComScore)NativeLookup.create(NativeComScore.class);
            if ( peer == null ) {
                throw new RuntimeException("NativeComScore is not implemented yet in this platform.");
            }
        }
        if ( !peer.isSupported() ){
            throw new RuntimeException("NativeComScore is not supported in this platform.");
        }
        contextValue = context;
        peer.initComScore();
    }
    
    protected static Object getContext() {
        return contextValue;
    }
    
    public static void setCustomerC2(String c2Value) {
        peer.setCustomerC2(c2Value);
    }

    public static void setPublisherSecret(String publisherSecretCode) {
        peer.setPublisherSecret(publisherSecretCode);
    }

    public static void setAppName(String applicationName) {
        peer.setAppName(applicationName);
    }

    public static void onEnterForeground() {
        peer.onEnterForeground();
    }

    public static void onExitForeground() {
        peer.onExitForeground();
    }

    public static void onUxActive() {
        peer.onUxActive();
    }

    public static void onUxInactive() {
        peer.onUxInactive();
    }

    public static void enableAutoUpdate(int interval, boolean foregroundOnly) {
        peer.enableAutoUpdate(interval, foregroundOnly);
    }
    
    public static void view(String key, String value) {
        peer.view(key, value);
    }
}
