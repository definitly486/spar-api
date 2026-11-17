package ba1;

import g.lqeggnwhkg;
import h.ageimvtcrz;
import h.e;
import h.mhtqkkgtqm;
import h.ntlheqmsrt;
import w0.wkgbmnqykc;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements e {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f15584iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f15585zoijcleaow;

    public iobyxmoadg(float f13, float f14) {
        this.f15584iobyxmoadg = f13;
        this.f15585zoijcleaow = f14;
    }

    @Override // h.e
    public ageimvtcrz iobyxmoadg(long j13, zdlpuopuiu layoutDirection, wkgbmnqykc density) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(density, "density");
        mhtqkkgtqm mhtqkkgtqmVarIobyxmoadg = ntlheqmsrt.iobyxmoadg();
        mhtqkkgtqmVarIobyxmoadg.iobyxmoadg(this.f15584iobyxmoadg, 0.0f);
        int i13 = (int) (j13 >> 32);
        mhtqkkgtqmVarIobyxmoadg.wkgbmnqykc(Float.intBitsToFloat(i13) - this.f15584iobyxmoadg, 0.0f);
        float f13 = 2;
        mhtqkkgtqmVarIobyxmoadg.dxjokdxxww(new lqeggnwhkg(Float.intBitsToFloat(i13) - (this.f15584iobyxmoadg * f13), 0.0f, Float.intBitsToFloat(i13), this.f15584iobyxmoadg * f13), 270.0f, 90.0f, false);
        int i14 = (int) (j13 & 4294967295L);
        mhtqkkgtqmVarIobyxmoadg.wkgbmnqykc(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14) - this.f15584iobyxmoadg);
        mhtqkkgtqmVarIobyxmoadg.dxjokdxxww(new lqeggnwhkg(Float.intBitsToFloat(i13) - (this.f15584iobyxmoadg * f13), Float.intBitsToFloat(i14) - (this.f15584iobyxmoadg * f13), Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), 0.0f, 90.0f, false);
        mhtqkkgtqmVarIobyxmoadg.wkgbmnqykc(this.f15584iobyxmoadg, Float.intBitsToFloat(i14));
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        float f14 = this.f15584iobyxmoadg;
        mhtqkkgtqmVarIobyxmoadg.dxjokdxxww(new lqeggnwhkg(0.0f, fIntBitsToFloat - (f14 * f13), f14 * f13, Float.intBitsToFloat(i14)), 90.0f, 90.0f, false);
        mhtqkkgtqmVarIobyxmoadg.wkgbmnqykc(0.0f, this.f15584iobyxmoadg);
        float f15 = this.f15584iobyxmoadg;
        mhtqkkgtqmVarIobyxmoadg.dxjokdxxww(new lqeggnwhkg(0.0f, 0.0f, f15 * f13, f15 * f13), 180.0f, 90.0f, false);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) / f13;
        float f16 = this.f15585zoijcleaow;
        mhtqkkgtqmVarIobyxmoadg.lqeggnwhkg(new lqeggnwhkg(-f16, fIntBitsToFloat2 - f16, f16, fIntBitsToFloat2 + f16), 90.0f, -180.0f);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
        float f17 = this.f15585zoijcleaow;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
        float f18 = this.f15585zoijcleaow;
        mhtqkkgtqmVarIobyxmoadg.lqeggnwhkg(new lqeggnwhkg(fIntBitsToFloat3 - f17, fIntBitsToFloat2 - f17, fIntBitsToFloat4 + f18, fIntBitsToFloat2 + f18), 270.0f, -180.0f);
        mhtqkkgtqmVarIobyxmoadg.close();
        return new ageimvtcrz.iobyxmoadg(mhtqkkgtqmVarIobyxmoadg);
    }
}
