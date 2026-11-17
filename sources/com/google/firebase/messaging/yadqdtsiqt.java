package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class yadqdtsiqt implements Closeable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Task f24517jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile Future f24518yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final URL f24519zdlpuopuiu;

    private yadqdtsiqt(URL url) {
        this.f24519zdlpuopuiu = url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void btonecajqb(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(wkgbmnqykc());
        } catch (Exception e13) {
            taskCompletionSource.setException(e13);
        }
    }

    private byte[] lqeggnwhkg() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f24519zdlpuopuiu.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrWkgbmnqykc = zoijcleaow.wkgbmnqykc(zoijcleaow.zoijcleaow(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrWkgbmnqykc.length + " bytes from " + this.f24519zdlpuopuiu);
            }
            if (bArrWkgbmnqykc.length <= 1048576) {
                return bArrWkgbmnqykc;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static yadqdtsiqt nufgyqmvbu(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new yadqdtsiqt(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24518yggfygwlhe.cancel(true);
    }

    public void draadjrbmk(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f24518yggfygwlhe = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.cdpycssgdh
            @Override // java.lang.Runnable
            public final void run() {
                this.f24363zdlpuopuiu.btonecajqb(taskCompletionSource);
            }
        });
        this.f24517jyumaefscl = taskCompletionSource.getTask();
    }

    public Task dxjokdxxww() {
        return (Task) Preconditions.checkNotNull(this.f24517jyumaefscl);
    }

    public Bitmap wkgbmnqykc() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f24519zdlpuopuiu);
        }
        byte[] bArrLqeggnwhkg = lqeggnwhkg();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrLqeggnwhkg, 0, bArrLqeggnwhkg.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f24519zdlpuopuiu);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f24519zdlpuopuiu);
        }
        return bitmapDecodeByteArray;
    }
}
