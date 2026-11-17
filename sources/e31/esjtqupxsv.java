package e31;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.h;
import j0.i;
import j0.jrbgnlbqoe;
import j0.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract class esjtqupxsv {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        final /* synthetic */ long f30323cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f30324cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ long f30325esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ n f30326istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f30327iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ h f30328jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ n f30329lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ long f30330pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        final /* synthetic */ String f30331yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ n f30332yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ j0.eablkybsjg f30333zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ boolean f30334zynmafqrjb;

        iobyxmoadg(j0.eablkybsjg eablkybsjgVar, n nVar, h hVar, String str, String str2, long j13, n nVar2, long j14, boolean z13, n nVar3, long j15, String str3) {
            this.f30333zdlpuopuiu = eablkybsjgVar;
            this.f30332yggfygwlhe = nVar;
            this.f30328jyumaefscl = hVar;
            this.f30327iwizpuwonk = str;
            this.f30324cqumvgiudr = str2;
            this.f30325esjtqupxsv = j13;
            this.f30329lereixgezr = nVar2;
            this.f30330pmvmpeiblj = j14;
            this.f30334zynmafqrjb = z13;
            this.f30326istkbnxepw = nVar3;
            this.f30323cdpycssgdh = j15;
            this.f30331yadqdtsiqt = str3;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((czzsidtyhn.gtknphoqwx) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(czzsidtyhn.gtknphoqwx BoxWithConstraints, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            int iZynmafqrjb;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i13 & 6) == 0) {
                i14 = i13 | (draadjrbmkVar.ulzqkzuiru(BoxWithConstraints) ? 4 : 2);
            } else {
                i14 = i13;
            }
            if ((i14 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-218088484, i14, -1, "ru.myspar.proloyalty.core.ui.compose.components.PriceView.<anonymous> (PriceView.kt:75)");
            }
            Integer numValueOf = Integer.valueOf(w0.zoijcleaow.draadjrbmk(BoxWithConstraints.ppxfxbqfkf()));
            if (!w0.zoijcleaow.nufgyqmvbu(BoxWithConstraints.ppxfxbqfkf())) {
                numValueOf = null;
            }
            draadjrbmkVar.sopmlzcsov(2054720069);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f30333zdlpuopuiu) | draadjrbmkVar.ulzqkzuiru(this.f30332yggfygwlhe) | draadjrbmkVar.ulzqkzuiru(numValueOf);
            h hVar = this.f30328jyumaefscl;
            j0.eablkybsjg eablkybsjgVar = this.f30333zdlpuopuiu;
            n nVar = this.f30332yggfygwlhe;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                float fWflxmlrfwp = 1.0f;
                if (numValueOf != null && (iZynmafqrjb = (int) (h.wkgbmnqykc(hVar, eablkybsjgVar, nVar, 0, false, 1, null, 0L, null, null, null, false, 2020, null).zynmafqrjb() >> 32)) > numValueOf.intValue()) {
                    fWflxmlrfwp = zg.gtknphoqwx.wflxmlrfwp((numValueOf.intValue() / iZynmafqrjb) * 0.97f, 0.7f, 1.0f);
                }
                objYadqdtsiqt = Float.valueOf(fWflxmlrfwp);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            float fFloatValue = ((Number) objYadqdtsiqt).floatValue();
            draadjrbmkVar.stevsuqkhv();
            w6.gtknphoqwx(esjtqupxsv.wkgbmnqykc(this.f30327iwizpuwonk, this.f30324cqumvgiudr, this.f30332yggfygwlhe, this.f30325esjtqupxsv, this.f30329lereixgezr, this.f30330pmvmpeiblj, this.f30334zynmafqrjb, this.f30326istkbnxepw, this.f30323cdpycssgdh, this.f30331yadqdtsiqt, fFloatValue, draadjrbmkVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, null, esjtqupxsv.lqeggnwhkg(this.f30332yggfygwlhe, fFloatValue), draadjrbmkVar, 0, 3504, 116734);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n lqeggnwhkg(n nVar, float f13) {
        if (f13 == 1.0f) {
            return nVar;
        }
        long jDraadjrbmk = nVar.draadjrbmk();
        w0.iwizpuwonk.zoijcleaow(jDraadjrbmk);
        long jGtknphoqwx = w0.iwizpuwonk.gtknphoqwx(w0.jyumaefscl.gxszxtbevo(jDraadjrbmk), w0.jyumaefscl.nufgyqmvbu(jDraadjrbmk) * f13);
        long jKcexrzcfyt = nVar.kcexrzcfyt();
        w0.iwizpuwonk.zoijcleaow(jKcexrzcfyt);
        return nVar.zoijcleaow((16777183 & 1) != 0 ? nVar.f50294iobyxmoadg.lqeggnwhkg() : 0L, (16777183 & 2) != 0 ? nVar.f50294iobyxmoadg.gtknphoqwx() : jGtknphoqwx, (16777183 & 4) != 0 ? nVar.f50294iobyxmoadg.agtfadlqog() : null, (16777183 & 8) != 0 ? nVar.f50294iobyxmoadg.draadjrbmk() : null, (16777183 & 16) != 0 ? nVar.f50294iobyxmoadg.wflxmlrfwp() : null, (16777183 & 32) != 0 ? nVar.f50294iobyxmoadg.dxjokdxxww() : null, (16777183 & 64) != 0 ? nVar.f50294iobyxmoadg.btonecajqb() : null, (16777183 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nVar.f50294iobyxmoadg.ojitshcjhn() : 0L, (16777183 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nVar.f50294iobyxmoadg.eablkybsjg() : null, (16777183 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? nVar.f50294iobyxmoadg.yggfygwlhe() : null, (16777183 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? nVar.f50294iobyxmoadg.rgvfuqvkyq() : null, (16777183 & 2048) != 0 ? nVar.f50294iobyxmoadg.wkgbmnqykc() : 0L, (16777183 & 4096) != 0 ? nVar.f50294iobyxmoadg.kcexrzcfyt() : null, (16777183 & 8192) != 0 ? nVar.f50294iobyxmoadg.oxmwwwfdhm() : null, (16777183 & 16384) != 0 ? nVar.f50294iobyxmoadg.nufgyqmvbu() : null, (16777183 & 32768) != 0 ? nVar.f50296zoijcleaow.nufgyqmvbu() : 0, (16777183 & 65536) != 0 ? nVar.f50296zoijcleaow.dxjokdxxww() : 0, (16777183 & 131072) != 0 ? nVar.f50296zoijcleaow.eablkybsjg() : w0.iwizpuwonk.gtknphoqwx(w0.jyumaefscl.gxszxtbevo(jKcexrzcfyt), w0.jyumaefscl.nufgyqmvbu(jKcexrzcfyt) * f13), (16777183 & 262144) != 0 ? nVar.f50296zoijcleaow.btonecajqb() : null, (16777183 & 524288) != 0 ? nVar.f50295ppxfxbqfkf : null, (16777183 & 1048576) != 0 ? nVar.f50296zoijcleaow.gxszxtbevo() : null, (16777183 & 2097152) != 0 ? nVar.f50296zoijcleaow.wkgbmnqykc() : 0, (16777183 & 4194304) != 0 ? nVar.f50296zoijcleaow.ppxfxbqfkf() : 0, (16777183 & 8388608) != 0 ? nVar.f50296zoijcleaow.gtknphoqwx() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, n nVar, long j13, String str2, n nVar2, long j14, boolean z13, n nVar3, long j15, boolean z14, int i13, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        zoijcleaow(wkgbmnqykcVar, str, nVar, j13, str2, nVar2, j14, z13, nVar3, j15, z14, draadjrbmkVar, f.iobyxmoadg(i13 | 1), f.iobyxmoadg(i14), i15);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0.eablkybsjg wkgbmnqykc(String str, String str2, n nVar, long j13, n nVar2, long j14, boolean z13, n nVar3, long j15, String str3, float f13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(-620698805);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-620698805, i13, -1, "ru.myspar.proloyalty.core.ui.compose.components.PriceView.rememberPriceText (PriceView.kt:47)");
        }
        draadjrbmkVar.sopmlzcsov(2093242697);
        boolean zUlzqkzuiru = ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.zoijcleaow(f13)) || (i13 & 6) == 4) | draadjrbmkVar.ulzqkzuiru(str) | draadjrbmkVar.ulzqkzuiru(str2);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            j0.eablkybsjg.zoijcleaow zoijcleaowVar = new j0.eablkybsjg.zoijcleaow(0, 1, null);
            jrbgnlbqoe jrbgnlbqoeVarCllcsxoeiz = lqeggnwhkg(nVar, f13).cllcsxoeiz();
            int iZdlpuopuiu = zoijcleaowVar.zdlpuopuiu(jrbgnlbqoeVarCllcsxoeiz.iobyxmoadg((65534 & 1) != 0 ? jrbgnlbqoeVarCllcsxoeiz.lqeggnwhkg() : j13, (65534 & 2) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50281zoijcleaow : 0L, (65534 & 4) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50277ppxfxbqfkf : null, (65534 & 8) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50280wkgbmnqykc : null, (65534 & 16) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50270eablkybsjg : null, (65534 & 32) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50272gxszxtbevo : null, (65534 & 64) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50274lqeggnwhkg : null, (65534 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50275nufgyqmvbu : 0L, (65534 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50269dxjokdxxww : null, (65534 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50267btonecajqb : null, (65534 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50271gtknphoqwx : null, (65534 & 2048) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50268draadjrbmk : 0L, (65534 & 4096) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50279wflxmlrfwp : null, (65534 & 8192) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50266agtfadlqog : null, (65534 & 16384) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50276ojitshcjhn : null, (65534 & 32768) != 0 ? jrbgnlbqoeVarCllcsxoeiz.f50278rgvfuqvkyq : null));
            try {
                zoijcleaowVar.gtknphoqwx(str);
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu);
                jrbgnlbqoe jrbgnlbqoeVarCllcsxoeiz2 = lqeggnwhkg(nVar2, f13).cllcsxoeiz();
                v0.iobyxmoadg.C2860iobyxmoadg c2860iobyxmoadg = v0.iobyxmoadg.f114982zoijcleaow;
                int iZdlpuopuiu2 = zoijcleaowVar.zdlpuopuiu(jrbgnlbqoeVarCllcsxoeiz2.iobyxmoadg((65534 & 1) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.lqeggnwhkg() : j14, (65534 & 2) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50281zoijcleaow : 0L, (65534 & 4) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50277ppxfxbqfkf : null, (65534 & 8) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50280wkgbmnqykc : null, (65534 & 16) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50270eablkybsjg : null, (65534 & 32) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50272gxszxtbevo : null, (65534 & 64) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50274lqeggnwhkg : null, (65534 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50275nufgyqmvbu : 0L, (65534 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50269dxjokdxxww : v0.iobyxmoadg.wkgbmnqykc(c2860iobyxmoadg.ppxfxbqfkf()), (65534 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50267btonecajqb : null, (65534 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50271gtknphoqwx : null, (65534 & 2048) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50268draadjrbmk : 0L, (65534 & 4096) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50279wflxmlrfwp : null, (65534 & 8192) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50266agtfadlqog : null, (65534 & 16384) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50276ojitshcjhn : null, (65534 & 32768) != 0 ? jrbgnlbqoeVarCllcsxoeiz2.f50278rgvfuqvkyq : null));
                try {
                    zoijcleaowVar.gtknphoqwx(" " + str2);
                    zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu2);
                    if (z13) {
                        jrbgnlbqoe jrbgnlbqoeVarCllcsxoeiz3 = lqeggnwhkg(nVar3, f13).cllcsxoeiz();
                        int iZdlpuopuiu3 = zoijcleaowVar.zdlpuopuiu(jrbgnlbqoeVarCllcsxoeiz3.iobyxmoadg((65534 & 1) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.lqeggnwhkg() : j15, (65534 & 2) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50281zoijcleaow : 0L, (65534 & 4) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50277ppxfxbqfkf : null, (65534 & 8) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50280wkgbmnqykc : null, (65534 & 16) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50270eablkybsjg : null, (65534 & 32) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50272gxszxtbevo : null, (65534 & 64) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50274lqeggnwhkg : null, (65534 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50275nufgyqmvbu : 0L, (65534 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50269dxjokdxxww : v0.iobyxmoadg.wkgbmnqykc(c2860iobyxmoadg.ppxfxbqfkf()), (65534 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50267btonecajqb : null, (65534 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50271gtknphoqwx : null, (65534 & 2048) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50268draadjrbmk : 0L, (65534 & 4096) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50279wflxmlrfwp : null, (65534 & 8192) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50266agtfadlqog : null, (65534 & 16384) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50276ojitshcjhn : null, (65534 & 32768) != 0 ? jrbgnlbqoeVarCllcsxoeiz3.f50278rgvfuqvkyq : null));
                        try {
                            zoijcleaowVar.gtknphoqwx(" " + str3);
                            zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu3);
                        } catch (Throwable th2) {
                            zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu3);
                            throw th2;
                        }
                    }
                    objYadqdtsiqt = zoijcleaowVar.yggfygwlhe();
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                } catch (Throwable th3) {
                    zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu2);
                    throw th3;
                }
            } catch (Throwable th4) {
                zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu);
                throw th4;
            }
        }
        j0.eablkybsjg eablkybsjgVar = (j0.eablkybsjg) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return eablkybsjgVar;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String price, n nVar, long j13, final String priceDecimal, n nVar2, long j14, boolean z13, n nVar3, long j15, boolean z14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14, final int i15) {
        int i16;
        n nVar4;
        long j16;
        n nVar5;
        int i17;
        n nVarEablkybsjg;
        long jIwizpuwonk;
        n nVarNufgyqmvbu;
        long jIwizpuwonk2;
        n nVarNufgyqmvbu2;
        long jIwizpuwonk3;
        boolean z15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        n nVar6;
        int i18;
        long j17;
        n nVar7;
        boolean z16;
        n nVar8;
        long j18;
        long j19;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final n nVar9;
        final long j23;
        final n nVar10;
        final long j24;
        final boolean z17;
        final n nVar11;
        final long j25;
        final boolean z18;
        int i19;
        int i23;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(price, "price");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(priceDecimal, "priceDecimal");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1954155499);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(price) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i15 & 4) == 0) {
                nVar4 = nVar;
                if (draadjrbmkVarBtonecajqb.ulzqkzuiru(nVar4)) {
                    i23 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                }
                i16 |= i23;
            } else {
                nVar4 = nVar;
            }
            i23 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i16 |= i23;
        } else {
            nVar4 = nVar;
        }
        if ((i13 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                j16 = j13;
                if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j16)) {
                    i19 = 2048;
                }
                i16 |= i19;
            } else {
                j16 = j13;
            }
            i19 = UserVerificationMethods.USER_VERIFY_ALL;
            i16 |= i19;
        } else {
            j16 = j13;
        }
        if ((i15 & 16) != 0) {
            i16 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(priceDecimal) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            if ((i15 & 32) == 0) {
                nVar5 = nVar2;
                int i25 = draadjrbmkVarBtonecajqb.ulzqkzuiru(nVar5) ? 131072 : 65536;
                i16 |= i25;
            } else {
                nVar5 = nVar2;
            }
            i16 |= i25;
        } else {
            nVar5 = nVar2;
        }
        if ((1572864 & i13) == 0) {
            i16 |= ((i15 & 64) == 0 && draadjrbmkVarBtonecajqb.wkgbmnqykc(j14)) ? 1048576 : 524288;
        }
        int i26 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i26 != 0) {
            i16 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= ((i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 && draadjrbmkVarBtonecajqb.ulzqkzuiru(nVar3)) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i16 |= ((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 && draadjrbmkVarBtonecajqb.wkgbmnqykc(j15)) ? 536870912 : 268435456;
        }
        int i27 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i27 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = i14 | (draadjrbmkVarBtonecajqb.iobyxmoadg(z14) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((306783379 & i16) == 306783378 && (i17 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar;
            nVar11 = nVar3;
            j25 = j15;
            z18 = z14;
            nVar9 = nVar4;
            j23 = j16;
            nVar10 = nVar5;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            j24 = j14;
            z17 = z13;
        } else {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) == 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = i24 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar;
                if ((i15 & 4) != 0) {
                    nVarEablkybsjg = z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).eablkybsjg();
                    i16 &= -897;
                } else {
                    nVarEablkybsjg = nVar4;
                }
                if ((i15 & 8) != 0) {
                    jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).iwizpuwonk();
                    i16 &= -7169;
                } else {
                    jIwizpuwonk = j16;
                }
                if ((i15 & 32) != 0) {
                    nVarNufgyqmvbu = z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).nufgyqmvbu();
                    i16 &= -458753;
                } else {
                    nVarNufgyqmvbu = nVar5;
                }
                if ((i15 & 64) != 0) {
                    jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).iwizpuwonk();
                    i16 &= -3670017;
                } else {
                    jIwizpuwonk2 = j14;
                }
                boolean z19 = i26 != 0 ? true : z13;
                if ((i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    nVarNufgyqmvbu2 = z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).nufgyqmvbu();
                    i16 &= -234881025;
                } else {
                    nVarNufgyqmvbu2 = nVar3;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).iwizpuwonk();
                    i16 = (-1879048193) & i16;
                } else {
                    jIwizpuwonk3 = j15;
                }
                if (i27 != 0) {
                    wkgbmnqykcVar2 = wkgbmnqykcVar4;
                    nVar6 = nVarEablkybsjg;
                    i18 = i16;
                    j17 = jIwizpuwonk;
                    nVar7 = nVarNufgyqmvbu;
                    z16 = z19;
                    nVar8 = nVarNufgyqmvbu2;
                    j18 = jIwizpuwonk2;
                    j19 = jIwizpuwonk3;
                    z15 = false;
                } else {
                    z15 = z14;
                    wkgbmnqykcVar2 = wkgbmnqykcVar4;
                    nVar6 = nVarEablkybsjg;
                    i18 = i16;
                    j17 = jIwizpuwonk;
                    nVar7 = nVarNufgyqmvbu;
                    z16 = z19;
                    nVar8 = nVarNufgyqmvbu2;
                    j18 = jIwizpuwonk2;
                    j19 = jIwizpuwonk3;
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                }
                if ((i15 & 64) != 0) {
                    i16 &= -3670017;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    i16 &= -234881025;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    i16 &= -1879048193;
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                j18 = j14;
                z16 = z13;
                nVar8 = nVar3;
                j19 = j15;
                z15 = z14;
                i18 = i16;
                nVar6 = nVar4;
                j17 = j16;
                nVar7 = nVar5;
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1954155499, i18, i17, "ru.myspar.proloyalty.core.ui.compose.components.PriceView (PriceView.kt:43)");
            }
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(b31.wflxmlrfwp.proloyalty_rouble, draadjrbmkVarBtonecajqb, 0);
            if (z15) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1353615779);
                n nVar12 = nVar6;
                czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar2, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-218088484, true, new iobyxmoadg(wkgbmnqykc(price, priceDecimal, nVar12, j17, nVar7, j18, z16, nVar8, j19, strPpxfxbqfkf, 1.0f, draadjrbmkVarBtonecajqb, 6), nVar12, i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1), price, priceDecimal, j17, nVar7, j18, z16, nVar8, j19, strPpxfxbqfkf), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (i18 & 14) | 3072, 6);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            } else {
                int i28 = i18;
                draadjrbmkVarBtonecajqb.sopmlzcsov(1354723812);
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.gtknphoqwx(wkgbmnqykc(price, priceDecimal, nVar6, j17, nVar7, j18, z16, nVar8, j19, strPpxfxbqfkf, 1.0f, draadjrbmkVarBtonecajqb, 6), wkgbmnqykcVar2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar6, draadjrbmkVar2, (i28 << 3) & 112, (i28 << 15) & 29360128, 131068);
                draadjrbmkVar2.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            nVar9 = nVar6;
            j23 = j17;
            nVar10 = nVar7;
            j24 = j18;
            z17 = z16;
            nVar11 = nVar8;
            j25 = j19;
            z18 = z15;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: e31.cqumvgiudr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.ppxfxbqfkf(wkgbmnqykcVar3, price, nVar9, j23, priceDecimal, nVar10, j24, z17, nVar11, j25, z18, i13, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
