package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww implements ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f117097iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f117098ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final rlfsiqarku f117099wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f117100zoijcleaow;

    public hcddaimhww(float f13, float f14, float f15) {
        this.f117097iobyxmoadg = f13;
        this.f117100zoijcleaow = f14;
        this.f117098ppxfxbqfkf = f15;
        rlfsiqarku rlfsiqarkuVar = new rlfsiqarku(1.0f);
        rlfsiqarkuVar.ppxfxbqfkf(f13);
        rlfsiqarkuVar.eablkybsjg(f14);
        this.f117099wkgbmnqykc = rlfsiqarkuVar;
    }

    @Override // vipkmwdibw.ylkuphrtab
    public long eablkybsjg(float f13, float f14, float f15) {
        float fZoijcleaow = this.f117099wkgbmnqykc.zoijcleaow();
        float fIobyxmoadg = this.f117099wkgbmnqykc.iobyxmoadg();
        float f16 = f13 - f14;
        float f17 = this.f117098ppxfxbqfkf;
        return metgxyhuhe.zoijcleaow(fZoijcleaow, fIobyxmoadg, f15 / f17, f16 / f17, 1.0f) * 1000000;
    }

    @Override // vipkmwdibw.ylkuphrtab
    public float ppxfxbqfkf(long j13, float f13, float f14, float f15) {
        this.f117099wkgbmnqykc.wkgbmnqykc(f14);
        return Float.intBitsToFloat((int) (this.f117099wkgbmnqykc.gxszxtbevo(f13, f15, j13 / 1000000) >> 32));
    }

    @Override // vipkmwdibw.ylkuphrtab
    public float wkgbmnqykc(long j13, float f13, float f14, float f15) {
        this.f117099wkgbmnqykc.wkgbmnqykc(f14);
        return Float.intBitsToFloat((int) (this.f117099wkgbmnqykc.gxszxtbevo(f13, f15, j13 / 1000000) & 4294967295L));
    }

    @Override // vipkmwdibw.ylkuphrtab
    public float zoijcleaow(float f13, float f14, float f15) {
        return 0.0f;
    }

    public /* synthetic */ hcddaimhww(float f13, float f14, float f15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 1.0f : f13, (i13 & 2) != 0 ? 1500.0f : f14, (i13 & 4) != 0 ? 0.01f : f15);
    }
}
