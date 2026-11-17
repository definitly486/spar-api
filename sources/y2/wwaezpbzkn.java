package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class wwaezpbzkn implements dxjokdxxww {
    protected wwaezpbzkn() {
    }

    @Override // y2.dxjokdxxww
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // y2.dxjokdxxww
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // y2.dxjokdxxww
    public ojitshcjhn iobyxmoadg(Looper looper, Handler.Callback callback) {
        return new ylkuphrtab(new Handler(looper, callback));
    }

    @Override // y2.dxjokdxxww
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // y2.dxjokdxxww
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // y2.dxjokdxxww
    public void zoijcleaow() {
    }
}
