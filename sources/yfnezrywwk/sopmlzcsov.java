package yfnezrywwk;

import java.util.List;
import java.util.Map;
import jztzpxfvev.jlmebxxoox;

/* JADX INFO: loaded from: classes.dex */
public abstract class sopmlzcsov {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final yadqdtsiqt f124894iobyxmoadg;

    public static final class iobyxmoadg implements x.istkbnxepw {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f124895iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f124896ppxfxbqfkf = hg.tzroggbefp.dxjokdxxww();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f124897zoijcleaow;

        iobyxmoadg() {
        }

        @Override // x.istkbnxepw
        public Map agtfadlqog() {
            return this.f124896ppxfxbqfkf;
        }

        @Override // x.istkbnxepw
        public int getHeight() {
            return this.f124897zoijcleaow;
        }

        @Override // x.istkbnxepw
        public int getWidth() {
            return this.f124895iobyxmoadg;
        }

        @Override // x.istkbnxepw
        public void ojitshcjhn() {
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        List listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        jlmebxxoox jlmebxxooxVar = jlmebxxoox.Vertical;
        int i13 = 0;
        boolean z13 = false;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z14 = false;
        f124894iobyxmoadg = new yadqdtsiqt(null, i13, z13, f13, iobyxmoadgVar, f14, z14, pj.dsvhmnatus.iobyxmoadg(lg.gtknphoqwx.f62507zdlpuopuiu), w0.gxszxtbevo.zoijcleaow(1.0f, 0.0f, 2, null), w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null), listWflxmlrfwp, 0, 0, 0, false, jlmebxxooxVar, 0, 0, null);
    }

    public static final mbcevpiqjq ppxfxbqfkf(final int i13, final int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            i13 = 0;
        }
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1470655220, i15, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        rhgxfdycjh.jyumaefscl jyumaefsclVarIobyxmoadg = mbcevpiqjq.f124831esjtqupxsv.iobyxmoadg();
        boolean z13 = true;
        boolean z14 = (((i15 & 14) ^ 6) > 4 && draadjrbmkVar.ppxfxbqfkf(i13)) || (i15 & 6) == 4;
        if ((((i15 & 112) ^ 48) <= 32 || !draadjrbmkVar.ppxfxbqfkf(i14)) && (i15 & 48) != 32) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z15 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new tg.iobyxmoadg() { // from class: yfnezrywwk.ulzqkzuiru
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return sopmlzcsov.wkgbmnqykc(i13, i14);
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        mbcevpiqjq mbcevpiqjqVar = (mbcevpiqjq) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarIobyxmoadg, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return mbcevpiqjqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mbcevpiqjq wkgbmnqykc(int i13, int i14) {
        return new mbcevpiqjq(i13, i14);
    }
}
