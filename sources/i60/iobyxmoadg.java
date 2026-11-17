package i60;

import gg.kcexrzcfyt;
import gg.zdlpuopuiu;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg extends wkgbmnqykc {
    public final String eablkybsjg(Object obj) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zoijcleaow().zoijcleaow(ppxfxbqfkf(), obj));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
            objWkgbmnqykc = null;
        }
        String str = (String) objWkgbmnqykc;
        return str == null ? "" : str;
    }

    public final Object gxszxtbevo(String str) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
                str = null;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(str != null ? zoijcleaow().ppxfxbqfkf(ppxfxbqfkf(), str) : null);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            return objWkgbmnqykc;
        }
        rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        return null;
    }
}
