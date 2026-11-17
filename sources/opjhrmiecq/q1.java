package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
final class q1 implements p0.ylkuphrtab {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f73917ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f73918wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p0.ylkuphrtab f73919zoijcleaow;

    public q1(p0.ylkuphrtab ylkuphrtabVar, int i13, int i14) {
        this.f73919zoijcleaow = ylkuphrtabVar;
        this.f73917ppxfxbqfkf = i13;
        this.f73918wkgbmnqykc = i14;
    }

    @Override // p0.ylkuphrtab
    public int iobyxmoadg(int i13) {
        int iIobyxmoadg = this.f73919zoijcleaow.iobyxmoadg(i13);
        if (i13 >= 0 && i13 <= this.f73918wkgbmnqykc) {
            r1.nufgyqmvbu(iIobyxmoadg, this.f73917ppxfxbqfkf, i13);
        }
        return iIobyxmoadg;
    }

    @Override // p0.ylkuphrtab
    public int zoijcleaow(int i13) {
        int iZoijcleaow = this.f73919zoijcleaow.zoijcleaow(i13);
        if (i13 >= 0 && i13 <= this.f73917ppxfxbqfkf) {
            r1.lqeggnwhkg(iZoijcleaow, this.f73918wkgbmnqykc, i13);
        }
        return iZoijcleaow;
    }
}
