package bfopjjpdmp;

import g.gtknphoqwx;
import h.ageimvtcrz;
import h.e;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements e {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f16085iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f16086ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f16087wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f16088zoijcleaow;

    public iobyxmoadg(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2, zoijcleaow zoijcleaowVar3, zoijcleaow zoijcleaowVar4) {
        this.f16085iobyxmoadg = zoijcleaowVar;
        this.f16088zoijcleaow = zoijcleaowVar2;
        this.f16086ppxfxbqfkf = zoijcleaowVar3;
        this.f16087wkgbmnqykc = zoijcleaowVar4;
    }

    public static /* synthetic */ iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2, zoijcleaow zoijcleaowVar3, zoijcleaow zoijcleaowVar4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i13 & 1) != 0) {
            zoijcleaowVar = iobyxmoadgVar.f16085iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            zoijcleaowVar2 = iobyxmoadgVar.f16088zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            zoijcleaowVar3 = iobyxmoadgVar.f16086ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            zoijcleaowVar4 = iobyxmoadgVar.f16087wkgbmnqykc;
        }
        return iobyxmoadgVar.ppxfxbqfkf(zoijcleaowVar, zoijcleaowVar2, zoijcleaowVar3, zoijcleaowVar4);
    }

    public final zoijcleaow dxjokdxxww() {
        return this.f16085iobyxmoadg;
    }

    public abstract ageimvtcrz eablkybsjg(long j13, float f13, float f14, float f15, float f16, zdlpuopuiu zdlpuopuiuVar);

    public final zoijcleaow gxszxtbevo() {
        return this.f16086ppxfxbqfkf;
    }

    @Override // h.e
    public final ageimvtcrz iobyxmoadg(long j13, zdlpuopuiu zdlpuopuiuVar, w0.wkgbmnqykc wkgbmnqykcVar) {
        float fIobyxmoadg = this.f16085iobyxmoadg.iobyxmoadg(j13, wkgbmnqykcVar);
        float fIobyxmoadg2 = this.f16088zoijcleaow.iobyxmoadg(j13, wkgbmnqykcVar);
        float fIobyxmoadg3 = this.f16086ppxfxbqfkf.iobyxmoadg(j13, wkgbmnqykcVar);
        float fIobyxmoadg4 = this.f16087wkgbmnqykc.iobyxmoadg(j13, wkgbmnqykcVar);
        float fBtonecajqb = gtknphoqwx.btonecajqb(j13);
        float f13 = fIobyxmoadg + fIobyxmoadg4;
        if (f13 > fBtonecajqb) {
            float f14 = fBtonecajqb / f13;
            fIobyxmoadg *= f14;
            fIobyxmoadg4 *= f14;
        }
        float f15 = fIobyxmoadg4;
        float f16 = fIobyxmoadg2 + fIobyxmoadg3;
        if (f16 > fBtonecajqb) {
            float f17 = fBtonecajqb / f16;
            fIobyxmoadg2 *= f17;
            fIobyxmoadg3 *= f17;
        }
        if (!(fIobyxmoadg >= 0.0f && fIobyxmoadg2 >= 0.0f && fIobyxmoadg3 >= 0.0f && f15 >= 0.0f)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("Corner size in Px can't be negative(topStart = " + fIobyxmoadg + ", topEnd = " + fIobyxmoadg2 + ", bottomEnd = " + fIobyxmoadg3 + ", bottomStart = " + f15 + ")!");
        }
        return eablkybsjg(j13, fIobyxmoadg, fIobyxmoadg2, fIobyxmoadg3, f15, zdlpuopuiuVar);
    }

    public final zoijcleaow lqeggnwhkg() {
        return this.f16087wkgbmnqykc;
    }

    public final zoijcleaow nufgyqmvbu() {
        return this.f16088zoijcleaow;
    }

    public abstract iobyxmoadg ppxfxbqfkf(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2, zoijcleaow zoijcleaowVar3, zoijcleaow zoijcleaowVar4);

    public final iobyxmoadg zoijcleaow(zoijcleaow zoijcleaowVar) {
        return ppxfxbqfkf(zoijcleaowVar, zoijcleaowVar, zoijcleaowVar, zoijcleaowVar);
    }
}
