package yfnezrywwk;

import androidx.compose.foundation.lazy.layout.iwxlajgraz;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final vdvldrhtss eablkybsjg(i1 i1Var, mbcevpiqjq mbcevpiqjqVar, gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) i1Var.getValue();
        return new vdvldrhtss(mbcevpiqjqVar, wflxmlrfwpVar, gxszxtbevoVar, new iwxlajgraz(mbcevpiqjqVar.iozdgvuglv(), wflxmlrfwpVar));
    }

    public static final tg.iobyxmoadg ppxfxbqfkf(final mbcevpiqjq mbcevpiqjqVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-343736148, i13, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
        }
        final i1 i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar, draadjrbmkVar2, (i13 >> 3) & 14);
        boolean z13 = (((i13 & 14) ^ 6) > 4 && draadjrbmkVar2.ulzqkzuiru(mbcevpiqjqVar)) || (i13 & 6) == 4;
        Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            final gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
            final i1 i1VarWkgbmnqykc = v0.wkgbmnqykc(v0.wflxmlrfwp(), new tg.iobyxmoadg() { // from class: yfnezrywwk.oxmwwwfdhm
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return zdlpuopuiu.wkgbmnqykc(i1VarAgtfadlqog);
                }
            });
            objYadqdtsiqt = new kotlin.jvm.internal.istkbnxepw(v0.wkgbmnqykc(v0.wflxmlrfwp(), new tg.iobyxmoadg() { // from class: yfnezrywwk.kcexrzcfyt
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return zdlpuopuiu.eablkybsjg(i1VarWkgbmnqykc, mbcevpiqjqVar, gxszxtbevoVar);
                }
            })) { // from class: yfnezrywwk.zdlpuopuiu.iobyxmoadg
                @Override // ah.draadjrbmk
                public Object get() {
                    return ((i1) this.receiver).getValue();
                }
            };
            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
        }
        ah.draadjrbmk draadjrbmkVar3 = (ah.draadjrbmk) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return draadjrbmkVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wflxmlrfwp wkgbmnqykc(i1 i1Var) {
        return new wflxmlrfwp((tg.draadjrbmk) i1Var.getValue());
    }
}
