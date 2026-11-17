package b8;

import android.os.Looper;
import c8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static final String iobyxmoadg() {
        String string = Thread.currentThread().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static final boolean ppxfxbqfkf(wkgbmnqykc mainThreadId) {
        zdlpuopuiu.btonecajqb(mainThreadId, "mainThreadId");
        return mainThreadId.iobyxmoadg() == Thread.currentThread().getId();
    }

    public static final wkgbmnqykc zoijcleaow() {
        try {
            return new wkgbmnqykc(Looper.getMainLooper().getThread().getId());
        } catch (Throwable th2) {
            lqeggnwhkg.wkgbmnqykc("Unable to determine Main thread id: " + th2.getMessage());
            return null;
        }
    }
}
