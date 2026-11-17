package m3;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final AtomicLong f65024nufgyqmvbu = new AtomicLong();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final long f65025eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final long f65026gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f65027iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final long f65028lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Uri f65029ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Map f65030wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final b3.lqeggnwhkg f65031zoijcleaow;

    public dxjokdxxww(long j13, b3.lqeggnwhkg lqeggnwhkgVar, long j14) {
        this(j13, lqeggnwhkgVar, lqeggnwhkgVar.f15057iobyxmoadg, Collections.emptyMap(), j14, 0L, 0L);
    }

    public static long iobyxmoadg() {
        return f65024nufgyqmvbu.getAndIncrement();
    }

    public dxjokdxxww(long j13, b3.lqeggnwhkg lqeggnwhkgVar, Uri uri, Map map, long j14, long j15, long j16) {
        this.f65027iobyxmoadg = j13;
        this.f65031zoijcleaow = lqeggnwhkgVar;
        this.f65029ppxfxbqfkf = uri;
        this.f65030wkgbmnqykc = map;
        this.f65025eablkybsjg = j14;
        this.f65026gxszxtbevo = j15;
        this.f65028lqeggnwhkg = j16;
    }
}
