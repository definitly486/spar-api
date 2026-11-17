package ydmasvzmpa;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final jpowsppfya f124630iobyxmoadg;

    public static final class iobyxmoadg implements x.istkbnxepw {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f124631iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f124632ppxfxbqfkf = hg.tzroggbefp.dxjokdxxww();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f124633zoijcleaow;

        iobyxmoadg() {
        }

        @Override // x.istkbnxepw
        public Map agtfadlqog() {
            return this.f124632ppxfxbqfkf;
        }

        @Override // x.istkbnxepw
        public int getHeight() {
            return this.f124633zoijcleaow;
        }

        @Override // x.istkbnxepw
        public int getWidth() {
            return this.f124631iobyxmoadg;
        }

        @Override // x.istkbnxepw
        public void ojitshcjhn() {
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        List listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        jztzpxfvev.jlmebxxoox jlmebxxooxVar = jztzpxfvev.jlmebxxoox.Vertical;
        f124630iobyxmoadg = new jpowsppfya(null, 0, false, 0.0f, iobyxmoadgVar, 0.0f, false, pj.dsvhmnatus.iobyxmoadg(lg.gtknphoqwx.f62507zdlpuopuiu), w0.gxszxtbevo.zoijcleaow(1.0f, 0.0f, 2, null), 0, new tg.draadjrbmk() { // from class: ydmasvzmpa.uwvvkdfqfp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ydmasvzmpa.wkgbmnqykc(((Integer) obj).intValue());
            }
        }, new tg.draadjrbmk() { // from class: ydmasvzmpa.yfnezrywwk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Integer.valueOf(ydmasvzmpa.eablkybsjg(((Integer) obj).intValue()));
            }
        }, listWflxmlrfwp, 0, 0, 0, false, jlmebxxooxVar, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int eablkybsjg(int i13) {
        return -1;
    }

    public static final metgxyhuhe lqeggnwhkg(final int i13, final int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            i13 = 0;
        }
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(29186956, i15, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:77)");
        }
        Object[] objArr = new Object[0];
        rhgxfdycjh.jyumaefscl jyumaefsclVarIobyxmoadg = metgxyhuhe.f124536esjtqupxsv.iobyxmoadg();
        boolean z13 = true;
        boolean z14 = (((i15 & 14) ^ 6) > 4 && draadjrbmkVar.ppxfxbqfkf(i13)) || (i15 & 6) == 4;
        if ((((i15 & 112) ^ 48) <= 32 || !draadjrbmkVar.ppxfxbqfkf(i14)) && (i15 & 48) != 32) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z15 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ydmasvzmpa.czzsidtyhn
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ydmasvzmpa.nufgyqmvbu(i13, i14);
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        metgxyhuhe metgxyhuheVar = (metgxyhuhe) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarIobyxmoadg, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return metgxyhuheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final metgxyhuhe nufgyqmvbu(int i13, int i14) {
        return new metgxyhuhe(i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wkgbmnqykc(int i13) {
        return hg.jyumaefscl.wflxmlrfwp();
    }
}
