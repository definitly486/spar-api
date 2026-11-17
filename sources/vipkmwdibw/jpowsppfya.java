package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya implements ylkuphrtab {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f117157eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117158iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f117159ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f117160wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f117161zoijcleaow;

    public jpowsppfya(int i13, int i14, yadqdtsiqt yadqdtsiqtVar) {
        this.f117158iobyxmoadg = i13;
        this.f117161zoijcleaow = i14;
        this.f117159ppxfxbqfkf = yadqdtsiqtVar;
        this.f117160wkgbmnqykc = ((long) i13) * 1000000;
        this.f117157eablkybsjg = ((long) i14) * 1000000;
    }

    @Override // vipkmwdibw.ylkuphrtab
    public long eablkybsjg(float f13, float f14, float f15) {
        return this.f117157eablkybsjg + this.f117160wkgbmnqykc;
    }

    @Override // vipkmwdibw.ylkuphrtab
    public float ppxfxbqfkf(long j13, float f13, float f14, float f15) {
        long j14 = j13 - this.f117157eablkybsjg;
        long j15 = this.f117160wkgbmnqykc;
        if (j14 < 0) {
            j14 = 0;
        }
        if (j14 > j15) {
            j14 = j15;
        }
        float fIobyxmoadg = this.f117159ppxfxbqfkf.iobyxmoadg(this.f117158iobyxmoadg == 0 ? 1.0f : j14 / j15);
        return (f13 * (1 - fIobyxmoadg)) + (f14 * fIobyxmoadg);
    }

    @Override // vipkmwdibw.ylkuphrtab
    public float wkgbmnqykc(long j13, float f13, float f14, float f15) {
        long j14 = j13 - this.f117157eablkybsjg;
        long j15 = this.f117160wkgbmnqykc;
        if (j14 < 0) {
            j14 = 0;
        }
        long j16 = j14 > j15 ? j15 : j14;
        if (j16 == 0) {
            return f15;
        }
        return (ppxfxbqfkf(j16, f13, f14, f15) - ppxfxbqfkf(j16 - 1000000, f13, f14, f15)) * 1000.0f;
    }
}
