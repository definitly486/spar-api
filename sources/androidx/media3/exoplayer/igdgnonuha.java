package androidx.media3.exoplayer;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class igdgnonuha {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f10563agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f10565draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f10567eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f10568gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Object f10569gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f10570iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Looper f10571lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f10572nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.dxjokdxxww f10573ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f10574wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final v2.cdpycssgdh f10575wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f10576zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f10566dxjokdxxww = -9223372036854775807L;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f10564btonecajqb = true;

    public interface iobyxmoadg {
        void dxjokdxxww(igdgnonuha igdgnonuhaVar);
    }

    public interface zoijcleaow {
        void cqumvgiudr(int i13, Object obj);
    }

    public igdgnonuha(iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar, int i13, y2.dxjokdxxww dxjokdxxwwVar, Looper looper) {
        this.f10576zoijcleaow = iobyxmoadgVar;
        this.f10570iobyxmoadg = zoijcleaowVar;
        this.f10575wkgbmnqykc = cdpycssgdhVar;
        this.f10571lqeggnwhkg = looper;
        this.f10573ppxfxbqfkf = dxjokdxxwwVar;
        this.f10572nufgyqmvbu = i13;
    }

    public synchronized void btonecajqb(boolean z13) {
        this.f10565draadjrbmk = z13 | this.f10565draadjrbmk;
        this.f10574wflxmlrfwp = true;
        notifyAll();
    }

    public igdgnonuha draadjrbmk(Object obj) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f10568gtknphoqwx);
        this.f10569gxszxtbevo = obj;
        return this;
    }

    public synchronized boolean dxjokdxxww() {
        return this.f10563agtfadlqog;
    }

    public long eablkybsjg() {
        return this.f10566dxjokdxxww;
    }

    public igdgnonuha gtknphoqwx() {
        y2.iobyxmoadg.lqeggnwhkg(!this.f10568gtknphoqwx);
        if (this.f10566dxjokdxxww == -9223372036854775807L) {
            y2.iobyxmoadg.iobyxmoadg(this.f10564btonecajqb);
        }
        this.f10568gtknphoqwx = true;
        this.f10576zoijcleaow.dxjokdxxww(this);
        return this;
    }

    public zoijcleaow gxszxtbevo() {
        return this.f10570iobyxmoadg;
    }

    public boolean iobyxmoadg() {
        return this.f10564btonecajqb;
    }

    public v2.cdpycssgdh lqeggnwhkg() {
        return this.f10575wkgbmnqykc;
    }

    public int nufgyqmvbu() {
        return this.f10567eablkybsjg;
    }

    public int ppxfxbqfkf() {
        return this.f10572nufgyqmvbu;
    }

    public igdgnonuha wflxmlrfwp(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f10568gtknphoqwx);
        this.f10567eablkybsjg = i13;
        return this;
    }

    public Object wkgbmnqykc() {
        return this.f10569gxszxtbevo;
    }

    public Looper zoijcleaow() {
        return this.f10571lqeggnwhkg;
    }
}
