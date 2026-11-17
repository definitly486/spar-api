package wc;

import com.google.firebase.installations.nufgyqmvbu;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f119253iobyxmoadg = nufgyqmvbu.ppxfxbqfkf();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f119254ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f119255zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f119252wkgbmnqykc = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final long f119251eablkybsjg = TimeUnit.MINUTES.toMillis(30);

    eablkybsjg() {
    }

    private synchronized void eablkybsjg() {
        this.f119254ppxfxbqfkf = 0;
    }

    private synchronized long iobyxmoadg(int i13) {
        if (ppxfxbqfkf(i13)) {
            return (long) Math.min(Math.pow(2.0d, this.f119254ppxfxbqfkf) + this.f119253iobyxmoadg.eablkybsjg(), f119251eablkybsjg);
        }
        return f119252wkgbmnqykc;
    }

    private static boolean ppxfxbqfkf(int i13) {
        return i13 == 429 || (i13 >= 500 && i13 < 600);
    }

    private static boolean wkgbmnqykc(int i13) {
        return (i13 >= 200 && i13 < 300) || i13 == 401 || i13 == 404;
    }

    public synchronized void gxszxtbevo(int i13) {
        if (wkgbmnqykc(i13)) {
            eablkybsjg();
            return;
        }
        this.f119254ppxfxbqfkf++;
        this.f119255zoijcleaow = this.f119253iobyxmoadg.iobyxmoadg() + iobyxmoadg(i13);
    }

    public synchronized boolean zoijcleaow() {
        return this.f119254ppxfxbqfkf == 0 || this.f119253iobyxmoadg.iobyxmoadg() > this.f119255zoijcleaow;
    }
}
