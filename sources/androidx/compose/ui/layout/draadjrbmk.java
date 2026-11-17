package androidx.compose.ui.layout;

import hg.tzroggbefp;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface draadjrbmk extends x.wflxmlrfwp {
    static /* synthetic */ x.istkbnxepw L(draadjrbmk draadjrbmkVar, int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i15 & 4) != 0) {
            map = tzroggbefp.dxjokdxxww();
        }
        Map map2 = map;
        if ((i15 & 8) != 0) {
            draadjrbmkVar2 = null;
        }
        return draadjrbmkVar.Z(i13, i14, map2, draadjrbmkVar2, draadjrbmkVar3);
    }

    static /* synthetic */ x.istkbnxepw ntlheqmsrt(draadjrbmk draadjrbmkVar, int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar2, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i15 & 4) != 0) {
            map = tzroggbefp.dxjokdxxww();
        }
        return draadjrbmkVar.nuxfzjnpeb(i13, i14, map, draadjrbmkVar2);
    }

    x.istkbnxepw Z(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2);

    default x.istkbnxepw nuxfzjnpeb(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar) {
        return Z(i13, i14, map, null, draadjrbmkVar);
    }
}
