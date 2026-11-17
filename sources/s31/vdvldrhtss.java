package s31;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vdvldrhtss {
    public static final g.lqeggnwhkg iobyxmoadg(x.rgvfuqvkyq rgvfuqvkyqVar) {
        zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        try {
            long jGxszxtbevo = x.vdvldrhtss.gxszxtbevo(rgvfuqvkyqVar);
            int i13 = (int) (jGxszxtbevo >> 32);
            int i14 = (int) (jGxszxtbevo & 4294967295L);
            return new g.lqeggnwhkg(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat(i13) + ((int) (rgvfuqvkyqVar.iobyxmoadg() >> 32)), Float.intBitsToFloat(i14) + ((int) (4294967295L & rgvfuqvkyqVar.iobyxmoadg())));
        } catch (IllegalStateException unused) {
            return g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
        }
    }
}
