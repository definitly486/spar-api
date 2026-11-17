package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static iobyxmoadg f23090ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f23091iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Handler f23092zoijcleaow = new Handler(Looper.getMainLooper(), new C0401iobyxmoadg());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0401iobyxmoadg implements Handler.Callback {
        C0401iobyxmoadg() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            yggfygwlhe.iobyxmoadg(message.obj);
            iobyxmoadgVar.ppxfxbqfkf(null);
            return true;
        }
    }

    private static class ppxfxbqfkf {
    }

    interface zoijcleaow {
    }

    private iobyxmoadg() {
    }

    private boolean iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        throw null;
    }

    private boolean wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        return false;
    }

    static iobyxmoadg zoijcleaow() {
        if (f23090ppxfxbqfkf == null) {
            f23090ppxfxbqfkf = new iobyxmoadg();
        }
        return f23090ppxfxbqfkf;
    }

    public void eablkybsjg(zoijcleaow zoijcleaowVar) {
        synchronized (this.f23091iobyxmoadg) {
            try {
                if (wkgbmnqykc(zoijcleaowVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void gxszxtbevo(zoijcleaow zoijcleaowVar) {
        synchronized (this.f23091iobyxmoadg) {
            try {
                if (wkgbmnqykc(zoijcleaowVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f23091iobyxmoadg) {
            iobyxmoadg(ppxfxbqfkfVar, 2);
        }
    }
}
