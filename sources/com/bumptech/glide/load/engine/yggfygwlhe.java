package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f21018iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Handler f21019zoijcleaow = new Handler(Looper.getMainLooper(), new iobyxmoadg());

    private static final class iobyxmoadg implements Handler.Callback {
        iobyxmoadg() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((n8.ppxfxbqfkf) message.obj).zoijcleaow();
            return true;
        }
    }

    yggfygwlhe() {
    }

    synchronized void iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        try {
            if (this.f21018iobyxmoadg || z13) {
                this.f21019zoijcleaow.obtainMessage(1, ppxfxbqfkfVar).sendToTarget();
            } else {
                this.f21018iobyxmoadg = true;
                ppxfxbqfkfVar.zoijcleaow();
                this.f21018iobyxmoadg = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
