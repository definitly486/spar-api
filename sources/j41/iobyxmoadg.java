package j41;

import android.graphics.Color;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import kotlin.jvm.internal.zdlpuopuiu;
import kr0.wkgbmnqykc;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final oipsdeybqn iobyxmoadg(String str) {
        Integer numValueOf;
        zdlpuopuiu.btonecajqb(str, "<this>");
        try {
            numValueOf = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th2) {
            wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            return oipsdeybqn.dxjokdxxww(bfopjjpdmp.zoijcleaow(numValueOf.intValue()));
        }
        return null;
    }
}
