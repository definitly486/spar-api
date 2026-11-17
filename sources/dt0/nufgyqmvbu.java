package dt0;

import h.ageimvtcrz;
import h.e;
import h.mhtqkkgtqm;
import h.ntlheqmsrt;
import hg.ikoacuggdj;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements e {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f29570iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f29571ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f29572zoijcleaow;

    public /* synthetic */ nufgyqmvbu(float f13, float f14, float f15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15);
    }

    private final long zoijcleaow(long j13, float f13) {
        float fGtknphoqwx = g.eablkybsjg.gtknphoqwx(j13);
        return fGtknphoqwx == 0.0f ? j13 : g.eablkybsjg.oxmwwwfdhm(j13, zg.gtknphoqwx.dxjokdxxww(f13, fGtknphoqwx / 2) / fGtknphoqwx);
    }

    @Override // h.e
    public ageimvtcrz iobyxmoadg(long j13, w0.zdlpuopuiu layoutDirection, w0.wkgbmnqykc density) {
        long j14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(density, "density");
        int i13 = (int) (j13 >> 32);
        float f13 = 2;
        float fDxjokdxxww = zg.gtknphoqwx.dxjokdxxww(density.I(this.f29570iobyxmoadg), Float.intBitsToFloat(i13) / f13);
        float fI = density.I(this.f29572zoijcleaow);
        float fI2 = density.I(this.f29571ppxfxbqfkf);
        int i14 = (int) (j13 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i14) / f13;
        Set setDxjokdxxww = ikoacuggdj.dxjokdxxww(2, 5);
        List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L))), g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32))), g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - fDxjokdxxww)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L))), g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32))), g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32))), g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fDxjokdxxww)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L))));
        mhtqkkgtqm mhtqkkgtqmVarIobyxmoadg = ntlheqmsrt.iobyxmoadg();
        int i15 = 0;
        for (Object obj : listRgvfuqvkyq) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            long jZdlpuopuiu = ((g.eablkybsjg) obj).zdlpuopuiu();
            long jZdlpuopuiu2 = ((g.eablkybsjg) listRgvfuqvkyq.get(((i15 - 1) + listRgvfuqvkyq.size()) % listRgvfuqvkyq.size())).zdlpuopuiu();
            long jZdlpuopuiu3 = ((g.eablkybsjg) listRgvfuqvkyq.get(i16 % listRgvfuqvkyq.size())).zdlpuopuiu();
            float f14 = setDxjokdxxww.contains(Integer.valueOf(i15)) ? fI2 : fI;
            long jRgvfuqvkyq = g.eablkybsjg.rgvfuqvkyq(jZdlpuopuiu2, jZdlpuopuiu);
            long jRgvfuqvkyq2 = g.eablkybsjg.rgvfuqvkyq(jZdlpuopuiu3, jZdlpuopuiu);
            long jVdvldrhtss = g.eablkybsjg.vdvldrhtss(jZdlpuopuiu, zoijcleaow(jRgvfuqvkyq, f14));
            long jVdvldrhtss2 = g.eablkybsjg.vdvldrhtss(jZdlpuopuiu, zoijcleaow(jRgvfuqvkyq2, f14));
            if (i15 == 0) {
                j14 = 4294967295L;
                mhtqkkgtqmVarIobyxmoadg.iobyxmoadg(Float.intBitsToFloat((int) (jVdvldrhtss >> 32)), Float.intBitsToFloat((int) (jVdvldrhtss & 4294967295L)));
            } else {
                j14 = 4294967295L;
                mhtqkkgtqmVarIobyxmoadg.wkgbmnqykc(Float.intBitsToFloat((int) (jVdvldrhtss >> 32)), Float.intBitsToFloat((int) (jVdvldrhtss & 4294967295L)));
            }
            mhtqkkgtqmVarIobyxmoadg.draadjrbmk(Float.intBitsToFloat((int) (jZdlpuopuiu >> 32)), Float.intBitsToFloat((int) (jZdlpuopuiu & j14)), Float.intBitsToFloat((int) (jVdvldrhtss2 >> 32)), Float.intBitsToFloat((int) (jVdvldrhtss2 & j14)));
            fI = fI;
            i15 = i16;
        }
        mhtqkkgtqmVarIobyxmoadg.close();
        return new ageimvtcrz.iobyxmoadg(mhtqkkgtqmVarIobyxmoadg);
    }

    private nufgyqmvbu(float f13, float f14, float f15) {
        this.f29570iobyxmoadg = f13;
        this.f29572zoijcleaow = f14;
        this.f29571ppxfxbqfkf = f15;
    }
}
