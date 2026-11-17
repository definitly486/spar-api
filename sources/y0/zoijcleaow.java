package y0;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(String str, long j13) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j13);
        }
    }
}
