package gd;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static ppxfxbqfkf f36844iobyxmoadg;

    private ppxfxbqfkf() {
    }

    public static synchronized ppxfxbqfkf ppxfxbqfkf() {
        try {
            if (f36844iobyxmoadg == null) {
                f36844iobyxmoadg = new ppxfxbqfkf();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f36844iobyxmoadg;
    }

    void eablkybsjg(String str) {
        Log.w("FirebasePerformance", str);
    }

    void iobyxmoadg(String str) {
        Log.d("FirebasePerformance", str);
    }

    void wkgbmnqykc(String str) {
        Log.i("FirebasePerformance", str);
    }

    void zoijcleaow(String str) {
        Log.e("FirebasePerformance", str);
    }
}
