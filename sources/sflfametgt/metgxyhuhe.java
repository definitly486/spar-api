package sflfametgt;

import java.util.Map;
import vipkmwdibw.tbqsvytpvh;

/* JADX INFO: loaded from: classes.dex */
public abstract class metgxyhuhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f106284iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(56);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final wypolnanlu f106286zoijcleaow = new wypolnanlu(hg.jyumaefscl.wflxmlrfwp(), 0, 0, 0, jztzpxfvev.jlmebxxoox.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, xrmfcynszj.ojitshcjhn.zoijcleaow.f123191iobyxmoadg, new iobyxmoadg(), false, null, null, pj.dsvhmnatus.iobyxmoadg(lg.gtknphoqwx.f62507zdlpuopuiu), 393216, null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final zoijcleaow f106285ppxfxbqfkf = new zoijcleaow();

    public static final class iobyxmoadg implements x.istkbnxepw {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f106287iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f106288ppxfxbqfkf = hg.tzroggbefp.dxjokdxxww();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f106289zoijcleaow;

        iobyxmoadg() {
        }

        @Override // x.istkbnxepw
        public Map agtfadlqog() {
            return this.f106288ppxfxbqfkf;
        }

        @Override // x.istkbnxepw
        public int getHeight() {
            return this.f106289zoijcleaow;
        }

        @Override // x.istkbnxepw
        public int getWidth() {
            return this.f106287iobyxmoadg;
        }

        @Override // x.istkbnxepw
        public void ojitshcjhn() {
        }
    }

    public static final class zoijcleaow implements w0.wkgbmnqykc {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final float f106291zdlpuopuiu = 1.0f;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final float f106290yggfygwlhe = 1.0f;

        zoijcleaow() {
        }

        @Override // w0.draadjrbmk
        public float F() {
            return this.f106290yggfygwlhe;
        }

        @Override // w0.wkgbmnqykc
        public float getDensity() {
            return this.f106291zdlpuopuiu;
        }
    }

    public static final ikoacuggdj agtfadlqog(final int i13, final float f13, final tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14, int i15) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            f13 = 0.0f;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1210768637, i14, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:89)");
        }
        Object[] objArr = new Object[0];
        rhgxfdycjh.jyumaefscl jyumaefsclVarIobyxmoadg = eablkybsjg.f106160hkdspvbjdz.iobyxmoadg();
        boolean z13 = true;
        boolean z14 = ((((i14 & 14) ^ 6) > 4 && draadjrbmkVar.ppxfxbqfkf(i13)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && draadjrbmkVar.zoijcleaow(f13)) || (i14 & 48) == 32);
        if ((((i14 & 896) ^ 384) <= 256 || !draadjrbmkVar.ulzqkzuiru(iobyxmoadgVar)) && (i14 & 384) != 256) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z15 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new tg.iobyxmoadg() { // from class: sflfametgt.jztzpxfvev
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return metgxyhuhe.ojitshcjhn(i13, f13, iobyxmoadgVar);
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarIobyxmoadg, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0);
        eablkybsjgVar.igdgnonuha().setValue(iobyxmoadgVar);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return eablkybsjgVar;
    }

    public static final long btonecajqb(istkbnxepw istkbnxepwVar, int i13) {
        long jDxjokdxxww = (((((long) i13) * ((long) (istkbnxepwVar.dxjokdxxww() + istkbnxepwVar.lqeggnwhkg()))) + ((long) istkbnxepwVar.wkgbmnqykc())) + ((long) istkbnxepwVar.zoijcleaow())) - ((long) istkbnxepwVar.dxjokdxxww());
        int iIobyxmoadg = (int) (istkbnxepwVar.getOrientation() == jztzpxfvev.jlmebxxoox.Horizontal ? istkbnxepwVar.iobyxmoadg() >> 32 : istkbnxepwVar.iobyxmoadg() & 4294967295L);
        return zg.gtknphoqwx.lqeggnwhkg(jDxjokdxxww - ((long) (iIobyxmoadg - zg.gtknphoqwx.agtfadlqog(istkbnxepwVar.gtknphoqwx().iobyxmoadg(iIobyxmoadg, istkbnxepwVar.lqeggnwhkg(), istkbnxepwVar.wkgbmnqykc(), istkbnxepwVar.zoijcleaow(), i13 - 1, i13), 0, iIobyxmoadg))), 0L);
    }

    public static final float draadjrbmk() {
        return f106284iobyxmoadg;
    }

    public static final Object dxjokdxxww(ikoacuggdj ikoacuggdjVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objOjitshcjhn;
        return (ikoacuggdjVar.cqumvgiudr() + (-1) < 0 || (objOjitshcjhn = ikoacuggdj.ojitshcjhn(ikoacuggdjVar, ikoacuggdjVar.cqumvgiudr() + (-1), 0.0f, null, gxszxtbevoVar, 6, null)) != mg.zoijcleaow.gxszxtbevo()) ? gg.wwaezpbzkn.f37140iobyxmoadg : objOjitshcjhn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long gtknphoqwx(wypolnanlu wypolnanluVar, int i13) {
        int iIobyxmoadg = (int) (wypolnanluVar.getOrientation() == jztzpxfvev.jlmebxxoox.Horizontal ? wypolnanluVar.iobyxmoadg() >> 32 : wypolnanluVar.iobyxmoadg() & 4294967295L);
        return zg.gtknphoqwx.agtfadlqog(wypolnanluVar.gtknphoqwx().iobyxmoadg(iIobyxmoadg, wypolnanluVar.lqeggnwhkg(), wypolnanluVar.wkgbmnqykc(), wypolnanluVar.zoijcleaow(), 0, i13), 0, iIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(final androidx.compose.foundation.lazy.layout.jhduphickx jhduphickxVar, int i13, float f13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyqVar.invoke(jhduphickxVar, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13));
        boolean z13 = i13 > jhduphickxVar.nufgyqmvbu();
        int iZoijcleaow = (jhduphickxVar.zoijcleaow() - jhduphickxVar.nufgyqmvbu()) + 1;
        if (((z13 && i13 > jhduphickxVar.zoijcleaow()) || (!z13 && i13 < jhduphickxVar.nufgyqmvbu())) && Math.abs(i13 - jhduphickxVar.nufgyqmvbu()) >= 3) {
            jhduphickxVar.ppxfxbqfkf(z13 ? zg.gtknphoqwx.gxszxtbevo(i13 - iZoijcleaow, jhduphickxVar.nufgyqmvbu()) : zg.gtknphoqwx.btonecajqb(iZoijcleaow + i13, jhduphickxVar.nufgyqmvbu()), 0);
        }
        float fEablkybsjg = androidx.compose.foundation.lazy.layout.jhduphickx.eablkybsjg(jhduphickxVar, i13, 0, 2, null) + f13;
        final kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar = new kotlin.jvm.internal.pkzmftpjix();
        Object objWflxmlrfwp = tbqsvytpvh.wflxmlrfwp(0.0f, fEablkybsjg, 0.0f, gtknphoqwxVar, new tg.rgvfuqvkyq() { // from class: sflfametgt.xrmfcynszj
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return metgxyhuhe.lqeggnwhkg(pkzmftpjixVar, jhduphickxVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, gxszxtbevoVar, 4, null);
        return objWflxmlrfwp == mg.zoijcleaow.gxszxtbevo() ? objWflxmlrfwp : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, androidx.compose.foundation.lazy.layout.jhduphickx jhduphickxVar, float f13, float f14) {
        pkzmftpjixVar.f60030zdlpuopuiu += jhduphickxVar.wkgbmnqykc(f13 - pkzmftpjixVar.f60030zdlpuopuiu);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final Object nufgyqmvbu(ikoacuggdj ikoacuggdjVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objOjitshcjhn;
        return (ikoacuggdjVar.cqumvgiudr() + 1 >= ikoacuggdjVar.pkzmftpjix() || (objOjitshcjhn = ikoacuggdj.ojitshcjhn(ikoacuggdjVar, ikoacuggdjVar.cqumvgiudr() + 1, 0.0f, null, gxszxtbevoVar, 6, null)) != mg.zoijcleaow.gxszxtbevo()) ? gg.wwaezpbzkn.f37140iobyxmoadg : objOjitshcjhn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg ojitshcjhn(int i13, float f13, tg.iobyxmoadg iobyxmoadgVar) {
        return new eablkybsjg(i13, f13, iobyxmoadgVar);
    }

    public static final wypolnanlu wflxmlrfwp() {
        return f106286zoijcleaow;
    }
}
