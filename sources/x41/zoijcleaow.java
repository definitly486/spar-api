package x41;

import kotlin.jvm.internal.zdlpuopuiu;
import kr0.wkgbmnqykc;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import u5.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, String sql) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        zdlpuopuiu.btonecajqb(sql, "sql");
        try {
            lqeggnwhkgVar.lmojexxdyd(sql);
        } catch (Exception e13) {
            wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
        }
    }
}
