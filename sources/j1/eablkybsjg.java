package j1;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ThreadLocal f50461iobyxmoadg = new ThreadLocal();

    static class iobyxmoadg {
        static void iobyxmoadg(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean iobyxmoadg(Paint paint, j1.iobyxmoadg iobyxmoadgVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            iobyxmoadg.iobyxmoadg(paint, iobyxmoadgVar != null ? zoijcleaow.C1079zoijcleaow.iobyxmoadg(iobyxmoadgVar) : null);
            return true;
        }
        if (iobyxmoadgVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeIobyxmoadg = zoijcleaow.iobyxmoadg(iobyxmoadgVar);
        paint.setXfermode(modeIobyxmoadg != null ? new PorterDuffXfermode(modeIobyxmoadg) : null);
        return modeIobyxmoadg != null;
    }
}
