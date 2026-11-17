package com.yandex.runtime.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class Scheduler extends Handler {
    public Scheduler() {
        super(Looper.getMainLooper());
        post(new Runnable(this) { // from class: com.yandex.runtime.internal.Scheduler.1
            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-8);
            }
        });
    }

    private static native void run(long j13);

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        run(((Long) message.obj).longValue());
    }

    public void schedule(long j13, long j14) {
        sendMessageDelayed(Message.obtain(this, 0, new Long(j13)), j14);
    }
}
