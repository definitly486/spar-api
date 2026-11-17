package y5;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
abstract class ppxfxbqfkf {
    public static void iobyxmoadg(String str, int i13) {
        Trace.beginAsyncSection(str, i13);
    }

    public static boolean ppxfxbqfkf() {
        return Trace.isEnabled();
    }

    public static void wkgbmnqykc(String str, int i13) {
        Trace.setCounter(str, i13);
    }

    public static void zoijcleaow(String str, int i13) {
        Trace.endAsyncSection(str, i13);
    }
}
