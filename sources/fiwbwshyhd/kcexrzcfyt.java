package fiwbwshyhd;

import androidx.compose.runtime.i1;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.zeieaojujs;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.pkzmftpjix;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(vdvldrhtss vdvldrhtssVar, boolean z13, pkzmftpjix pkzmftpjixVar, pkzmftpjix pkzmftpjixVar2) {
        vdvldrhtssVar.yggfygwlhe(z13);
        vdvldrhtssVar.iwizpuwonk(pkzmftpjixVar.f60030zdlpuopuiu);
        vdvldrhtssVar.jyumaefscl(pkzmftpjixVar2.f60030zdlpuopuiu);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final vdvldrhtss zoijcleaow(final boolean z13, tg.iobyxmoadg iobyxmoadgVar, float f13, float f14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        if ((i14 & 4) != 0) {
            f13 = zoijcleaow.f34019iobyxmoadg.iobyxmoadg();
        }
        if ((i14 & 8) != 0) {
            f14 = zoijcleaow.f34019iobyxmoadg.zoijcleaow();
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-174977512, i13, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (w0.nufgyqmvbu.gxszxtbevo(f13, w0.nufgyqmvbu.lqeggnwhkg(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar2.iobyxmoadg()) {
            objYadqdtsiqt = jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) objYadqdtsiqt;
        i1 i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar, draadjrbmkVar, (i13 >> 3) & 14);
        final pkzmftpjix pkzmftpjixVar = new pkzmftpjix();
        final pkzmftpjix pkzmftpjixVar2 = new pkzmftpjix();
        w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo());
        pkzmftpjixVar.f60030zdlpuopuiu = wkgbmnqykcVar.I(f13);
        pkzmftpjixVar2.f60030zdlpuopuiu = wkgbmnqykcVar.I(f14);
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(cllcsxoeizVar);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt2 == iobyxmoadgVar2.iobyxmoadg()) {
            objYadqdtsiqt2 = new vdvldrhtss(cllcsxoeizVar, i1VarAgtfadlqog, pkzmftpjixVar2.f60030zdlpuopuiu, pkzmftpjixVar.f60030zdlpuopuiu);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        final vdvldrhtss vdvldrhtssVar = (vdvldrhtss) objYadqdtsiqt2;
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(vdvldrhtssVar) | ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.iobyxmoadg(z13)) || (i13 & 6) == 4) | draadjrbmkVar.zoijcleaow(pkzmftpjixVar.f60030zdlpuopuiu) | draadjrbmkVar.zoijcleaow(pkzmftpjixVar2.f60030zdlpuopuiu);
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt3 == iobyxmoadgVar2.iobyxmoadg()) {
            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: fiwbwshyhd.oxmwwwfdhm
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return kcexrzcfyt.ppxfxbqfkf(vdvldrhtssVar, z13, pkzmftpjixVar, pkzmftpjixVar2);
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
        }
        jlmebxxoox.lqeggnwhkg((tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVar, 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return vdvldrhtssVar;
    }
}
