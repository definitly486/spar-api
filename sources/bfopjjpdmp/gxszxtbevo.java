package bfopjjpdmp;

import g.btonecajqb;
import g.draadjrbmk;
import h.ageimvtcrz;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends iobyxmoadg {
    public gxszxtbevo(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2, zoijcleaow zoijcleaowVar3, zoijcleaow zoijcleaowVar4) {
        super(zoijcleaowVar, zoijcleaowVar2, zoijcleaowVar3, zoijcleaowVar4);
    }

    @Override // bfopjjpdmp.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo ppxfxbqfkf(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2, zoijcleaow zoijcleaowVar3, zoijcleaow zoijcleaowVar4) {
        return new gxszxtbevo(zoijcleaowVar, zoijcleaowVar2, zoijcleaowVar3, zoijcleaowVar4);
    }

    @Override // bfopjjpdmp.iobyxmoadg
    public ageimvtcrz eablkybsjg(long j13, float f13, float f14, float f15, float f16, zdlpuopuiu zdlpuopuiuVar) {
        if (f13 + f14 + f15 + f16 == 0.0f) {
            return new ageimvtcrz.zoijcleaow(draadjrbmk.ppxfxbqfkf(j13));
        }
        g.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = draadjrbmk.ppxfxbqfkf(j13);
        zdlpuopuiu zdlpuopuiuVar2 = zdlpuopuiu.Ltr;
        float f17 = zdlpuopuiuVar == zdlpuopuiuVar2 ? f13 : f14;
        long jZoijcleaow = g.iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L));
        float f18 = zdlpuopuiuVar == zdlpuopuiuVar2 ? f14 : f13;
        long jZoijcleaow2 = g.iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(f18)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32));
        float f19 = zdlpuopuiuVar == zdlpuopuiuVar2 ? f15 : f16;
        long jZoijcleaow3 = g.iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L));
        float f23 = zdlpuopuiuVar == zdlpuopuiuVar2 ? f16 : f15;
        return new ageimvtcrz.ppxfxbqfkf(btonecajqb.zoijcleaow(lqeggnwhkgVarPpxfxbqfkf, jZoijcleaow, jZoijcleaow2, jZoijcleaow3, g.iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(f23)) & 4294967295L) | (((long) Float.floatToRawIntBits(f23)) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dxjokdxxww(), gxszxtbevoVar.dxjokdxxww()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), gxszxtbevoVar.nufgyqmvbu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevo(), gxszxtbevoVar.gxszxtbevo()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkg(), gxszxtbevoVar.lqeggnwhkg());
    }

    public int hashCode() {
        return (((((dxjokdxxww().hashCode() * 31) + nufgyqmvbu().hashCode()) * 31) + gxszxtbevo().hashCode()) * 31) + lqeggnwhkg().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + dxjokdxxww() + ", topEnd = " + nufgyqmvbu() + ", bottomEnd = " + gxszxtbevo() + ", bottomStart = " + lqeggnwhkg() + ')';
    }
}
