package wj;

import java.util.concurrent.TimeUnit;
import uj.cdpycssgdh;
import uj.iozdgvuglv;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final String f119922iobyxmoadg = cdpycssgdh.eablkybsjg("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final long f119925zoijcleaow = iozdgvuglv.gxszxtbevo("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f119923ppxfxbqfkf = iozdgvuglv.eablkybsjg("kotlinx.coroutines.scheduler.core.pool.size", zg.gtknphoqwx.gxszxtbevo(cdpycssgdh.iobyxmoadg(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f119924wkgbmnqykc = iozdgvuglv.eablkybsjg("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final long f119920eablkybsjg = TimeUnit.SECONDS.toNanos(iozdgvuglv.gxszxtbevo("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static lqeggnwhkg f119921gxszxtbevo = eablkybsjg.f119932iobyxmoadg;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ppxfxbqfkf(boolean z13) {
        return z13 ? "Blocking" : "Non-blocking";
    }

    public static final nufgyqmvbu zoijcleaow(Runnable runnable, long j13, boolean z13) {
        return new dxjokdxxww(runnable, j13, z13);
    }
}
