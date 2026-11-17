package k60;

import kotlin.jvm.internal.zdlpuopuiu;
import rs.wkgbmnqykc;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import u5.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, String sql) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        zdlpuopuiu.btonecajqb(sql, "sql");
        try {
            lqeggnwhkgVar.lmojexxdyd(sql);
        } catch (Exception e13) {
            wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
        }
    }
}
