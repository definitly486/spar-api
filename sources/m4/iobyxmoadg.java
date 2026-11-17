package m4;

import t3.iozdgvuglv;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends t3.nufgyqmvbu implements lqeggnwhkg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f65127btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final long f65128draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f65129dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f65130gtknphoqwx;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f65131nufgyqmvbu;

    public iobyxmoadg(long j13, long j14, iozdgvuglv.iobyxmoadg iobyxmoadgVar, boolean z13) {
        this(j13, j14, iobyxmoadgVar.f109449gxszxtbevo, iobyxmoadgVar.f109452ppxfxbqfkf, z13);
    }

    @Override // m4.lqeggnwhkg
    public int btonecajqb() {
        return this.f65129dxjokdxxww;
    }

    public iobyxmoadg eablkybsjg(long j13) {
        return new iobyxmoadg(j13, this.f65131nufgyqmvbu, this.f65129dxjokdxxww, this.f65127btonecajqb, this.f65130gtknphoqwx);
    }

    @Override // m4.lqeggnwhkg
    public long gxszxtbevo() {
        return this.f65128draadjrbmk;
    }

    @Override // m4.lqeggnwhkg
    public long nufgyqmvbu(long j13) {
        return zoijcleaow(j13);
    }

    public iobyxmoadg(long j13, long j14, int i13, int i14, boolean z13) {
        super(j13, j14, i13, i14, z13);
        this.f65131nufgyqmvbu = j14;
        this.f65129dxjokdxxww = i13;
        this.f65127btonecajqb = i14;
        this.f65130gtknphoqwx = z13;
        this.f65128draadjrbmk = j13 == -1 ? -1L : j13;
    }
}
