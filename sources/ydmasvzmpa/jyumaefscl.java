package ydmasvzmpa;

import androidx.compose.foundation.lazy.layout.iwxlajgraz;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt eablkybsjg(i1 i1Var, metgxyhuhe metgxyhuheVar) {
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) i1Var.getValue();
        return new kcexrzcfyt(metgxyhuheVar, ojitshcjhnVar, new iwxlajgraz(metgxyhuheVar.lmojexxdyd(), ojitshcjhnVar));
    }

    public static final tg.iobyxmoadg ppxfxbqfkf(final metgxyhuhe metgxyhuheVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1898306282, i13, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        final i1 i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar, draadjrbmkVar2, (i13 >> 3) & 14);
        boolean z13 = (((i13 & 14) ^ 6) > 4 && draadjrbmkVar2.ulzqkzuiru(metgxyhuheVar)) || (i13 & 6) == 4;
        Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            final i1 i1VarWkgbmnqykc = v0.wkgbmnqykc(v0.wflxmlrfwp(), new tg.iobyxmoadg() { // from class: ydmasvzmpa.zdlpuopuiu
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return jyumaefscl.wkgbmnqykc(i1VarAgtfadlqog);
                }
            });
            objYadqdtsiqt = new kotlin.jvm.internal.istkbnxepw(v0.wkgbmnqykc(v0.wflxmlrfwp(), new tg.iobyxmoadg() { // from class: ydmasvzmpa.yggfygwlhe
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return jyumaefscl.eablkybsjg(i1VarWkgbmnqykc, metgxyhuheVar);
                }
            })) { // from class: ydmasvzmpa.jyumaefscl.iobyxmoadg
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
    public static final ojitshcjhn wkgbmnqykc(i1 i1Var) {
        return new ojitshcjhn((tg.draadjrbmk) i1Var.getValue());
    }
}
