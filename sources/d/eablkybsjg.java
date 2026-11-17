package d;

import tg.draadjrbmk;
import x.rgvfuqvkyq;
import x.vdvldrhtss;
import z.ageimvtcrz;
import z.fiwbwshyhd;
import z.fyldjkxazc;
import z.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(gxszxtbevo gxszxtbevoVar, zoijcleaow zoijcleaowVar) {
        gxszxtbevoVar.M(zoijcleaowVar);
        gxszxtbevoVar.h(zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(ageimvtcrz ageimvtcrzVar, draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar.invoke(ageimvtcrzVar) != fiwbwshyhd.ContinueTraversal) {
            return;
        }
        fyldjkxazc.gxszxtbevo(ageimvtcrzVar, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, long j13) {
        if (!wkgbmnqykcVar.wflxmlrfwp().n0()) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVarPmvmpeiblj = gtknphoqwx.rgvfuqvkyq(wkgbmnqykcVar).pmvmpeiblj();
        if (!rgvfuqvkyqVarPmvmpeiblj.gxszxtbevo()) {
            return false;
        }
        long jEablkybsjg = vdvldrhtss.eablkybsjg(rgvfuqvkyqVarPmvmpeiblj);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jEablkybsjg >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jEablkybsjg & 4294967295L));
        float fO0 = ((int) (wkgbmnqykcVar.O0() >> 32)) + fIntBitsToFloat;
        float fO1 = ((int) (wkgbmnqykcVar.O0() & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j13 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > fO0) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fO1;
    }
}
