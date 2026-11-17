package mw1;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final Map iobyxmoadg(String str) {
        if (str != null) {
            Map mapGxszxtbevo = tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Authorization", "Bearer " + str));
            if (mapGxszxtbevo != null) {
                return mapGxszxtbevo;
            }
        }
        return tzroggbefp.dxjokdxxww();
    }
}
