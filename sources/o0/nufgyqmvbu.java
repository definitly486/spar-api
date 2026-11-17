package o0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nufgyqmvbu f71493iobyxmoadg = new nufgyqmvbu();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f71494iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public final Handler iobyxmoadg(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private nufgyqmvbu() {
    }

    public final Handler iobyxmoadg(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? iobyxmoadg.f71494iobyxmoadg.iobyxmoadg(looper) : new Handler(looper);
    }
}
