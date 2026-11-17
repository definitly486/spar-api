package rg;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                gg.lqeggnwhkg.iobyxmoadg(th2, th3);
            }
        }
    }
}
