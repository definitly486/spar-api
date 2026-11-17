package j42;

import lg.gxszxtbevo;
import nj.ppxfxbqfkf;
import nj.wkgbmnqykc;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {
    static /* synthetic */ Object gxszxtbevo(zoijcleaow zoijcleaowVar, long j13, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitCurrentLocation-AlWCoAE");
        }
        if ((i13 & 1) != 0) {
            nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
            j13 = ppxfxbqfkf.kcexrzcfyt(10, wkgbmnqykc.SECONDS);
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = iobyxmoadg.HIGH_ACCURACY;
        }
        return zoijcleaowVar.eablkybsjg(j13, iobyxmoadgVar, gxszxtbevoVar);
    }

    static /* synthetic */ void wkgbmnqykc(zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLastLocation");
        }
        if ((i13 & 2) != 0) {
            draadjrbmkVar2 = null;
        }
        zoijcleaowVar.iobyxmoadg(draadjrbmkVar, draadjrbmkVar2);
    }

    Object eablkybsjg(long j13, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar);

    void iobyxmoadg(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2);

    Object ppxfxbqfkf(long j13, long j14, gxszxtbevo gxszxtbevoVar);

    default String[] zoijcleaow() {
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }
}
