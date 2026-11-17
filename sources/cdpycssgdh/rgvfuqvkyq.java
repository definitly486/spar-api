package cdpycssgdh;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgvfuqvkyq {
    public static void iobyxmoadg() {
        u1.nufgyqmvbu.dxjokdxxww(ppxfxbqfkf(), "Not in application's main thread");
    }

    public static boolean ppxfxbqfkf() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void wkgbmnqykc(Runnable runnable) {
        if (ppxfxbqfkf()) {
            runnable.run();
        } else {
            u1.nufgyqmvbu.dxjokdxxww(zoijcleaow().post(runnable), "Unable to post to main thread");
        }
    }

    private static Handler zoijcleaow() {
        return new Handler(Looper.getMainLooper());
    }
}
