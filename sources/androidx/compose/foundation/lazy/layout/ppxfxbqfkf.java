package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f5103eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f5104gxszxtbevo = -1;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long f5105iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f5106ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f5107wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f5108zoijcleaow;

    private final int iobyxmoadg(int i13, int i14) {
        return i14 == -1 ? i13 : ((i14 * 3) + i13) / 4;
    }

    private final long zoijcleaow(long j13, long j14) {
        if (j14 == 0) {
            return j13;
        }
        long j15 = 4;
        return (j13 / j15) + ((j14 / j15) * ((long) 3));
    }

    public final void agtfadlqog(long j13) {
        this.f5106ppxfxbqfkf = zoijcleaow(j13, this.f5106ppxfxbqfkf);
    }

    public final void btonecajqb(long j13) {
        this.f5107wkgbmnqykc = zoijcleaow(j13, this.f5107wkgbmnqykc);
    }

    public final void draadjrbmk(long j13) {
        this.f5103eablkybsjg = zoijcleaow(j13, this.f5103eablkybsjg);
    }

    public final long dxjokdxxww() {
        return this.f5108zoijcleaow;
    }

    public final long eablkybsjg() {
        return this.f5105iobyxmoadg;
    }

    public final void gtknphoqwx(long j13) {
        this.f5105iobyxmoadg = zoijcleaow(j13, this.f5105iobyxmoadg);
    }

    public final long gxszxtbevo() {
        return this.f5103eablkybsjg;
    }

    public final int lqeggnwhkg() {
        return this.f5104gxszxtbevo;
    }

    public final long nufgyqmvbu() {
        return this.f5106ppxfxbqfkf;
    }

    public final void ojitshcjhn(long j13) {
        this.f5108zoijcleaow = zoijcleaow(j13, this.f5108zoijcleaow);
    }

    public final void ppxfxbqfkf() {
        this.f5103eablkybsjg = 0L;
    }

    public final void wflxmlrfwp(int i13) {
        this.f5104gxszxtbevo = iobyxmoadg(i13, this.f5104gxszxtbevo);
    }

    public final long wkgbmnqykc() {
        return this.f5107wkgbmnqykc;
    }
}
