package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class x implements q {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final t f117369iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f117370ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f117371wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final okpsazkaxt f117372zoijcleaow;

    public /* synthetic */ x(t tVar, okpsazkaxt okpsazkaxtVar, long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(tVar, okpsazkaxtVar, j13);
    }

    private final kcexrzcfyt dxjokdxxww(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        long j14 = this.f117371wkgbmnqykc;
        long j15 = j13 + j14;
        long j16 = this.f117370ppxfxbqfkf;
        return j15 > j16 ? this.f117369iobyxmoadg.gxszxtbevo(j16 - j14, kcexrzcfytVar, kcexrzcfytVar3, kcexrzcfytVar2) : kcexrzcfytVar2;
    }

    private final long nufgyqmvbu(long j13) {
        long j14 = this.f117371wkgbmnqykc;
        if (j13 + j14 <= 0) {
            return 0L;
        }
        long j15 = j13 + j14;
        long j16 = this.f117370ppxfxbqfkf;
        long j17 = j15 / j16;
        return (this.f117372zoijcleaow == okpsazkaxt.Restart || j17 % ((long) 2) == 0) ? j15 - (j17 * j16) : ((j17 + 1) * j16) - j15;
    }

    @Override // vipkmwdibw.q
    public kcexrzcfyt gxszxtbevo(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        return this.f117369iobyxmoadg.gxszxtbevo(nufgyqmvbu(j13), kcexrzcfytVar, kcexrzcfytVar2, dxjokdxxww(j13, kcexrzcfytVar, kcexrzcfytVar3, kcexrzcfytVar2));
    }

    @Override // vipkmwdibw.q
    public boolean iobyxmoadg() {
        return true;
    }

    @Override // vipkmwdibw.q
    public kcexrzcfyt lqeggnwhkg(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        return this.f117369iobyxmoadg.lqeggnwhkg(nufgyqmvbu(j13), kcexrzcfytVar, kcexrzcfytVar2, dxjokdxxww(j13, kcexrzcfytVar, kcexrzcfytVar3, kcexrzcfytVar2));
    }

    @Override // vipkmwdibw.q
    public long zoijcleaow(kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        return Long.MAX_VALUE;
    }

    private x(t tVar, okpsazkaxt okpsazkaxtVar, long j13) {
        this.f117369iobyxmoadg = tVar;
        this.f117372zoijcleaow = okpsazkaxtVar;
        this.f117370ppxfxbqfkf = ((long) (tVar.eablkybsjg() + tVar.wkgbmnqykc())) * 1000000;
        this.f117371wkgbmnqykc = j13 * 1000000;
    }
}
