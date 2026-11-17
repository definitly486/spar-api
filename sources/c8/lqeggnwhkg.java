package c8;

import android.util.Log;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile gxszxtbevo f19177iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f19178zoijcleaow = new Object();

    private static final gxszxtbevo iobyxmoadg() {
        return ppxfxbqfkf() ? new iobyxmoadg() : new dxjokdxxww();
    }

    private static final boolean ppxfxbqfkf() {
        try {
            Log.isLoggable("", 3);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final void wkgbmnqykc(String text) {
        zdlpuopuiu.btonecajqb(text, "text");
        zoijcleaow().iobyxmoadg(text);
    }

    private static final gxszxtbevo zoijcleaow() {
        if (f19177iobyxmoadg == null) {
            synchronized (f19178zoijcleaow) {
                try {
                    if (f19177iobyxmoadg == null) {
                        f19177iobyxmoadg = iobyxmoadg();
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        gxszxtbevo gxszxtbevoVar = f19177iobyxmoadg;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
