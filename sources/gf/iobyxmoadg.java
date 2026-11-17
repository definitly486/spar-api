package gf;

import android.content.Context;
import hm.lqeggnwhkg;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final AtomicBoolean f37087iobyxmoadg = new AtomicBoolean();

    public static void iobyxmoadg(Context context) {
        zoijcleaow(context, "org/threeten/bp/TZDB.dat");
    }

    public static void zoijcleaow(Context context, String str) {
        if (f37087iobyxmoadg.getAndSet(true)) {
            return;
        }
        lqeggnwhkg.ppxfxbqfkf(new zoijcleaow(context, str));
    }
}
