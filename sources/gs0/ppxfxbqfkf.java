package gs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.t;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f38411iobyxmoadg;

        static {
            int[] iArr = new int[js0.zoijcleaow.values().length];
            try {
                iArr[js0.zoijcleaow.HALF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f38411iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(CounterModel counterModel, js0.zoijcleaow zoijcleaowVar, ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(counterModel, zoijcleaowVar, tints, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0219  */
    /* JADX WARN: Code duplicated, block: B:106:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0101  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01da  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0212  */
    public static final void ppxfxbqfkf(final CounterModel model, final js0.zoijcleaow counterStyle, final ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final tg.iobyxmoadg iobyxmoadgVar2;
        tg.iobyxmoadg iobyxmoadgVar3;
        boolean z13;
        Object objYadqdtsiqt;
        int iIntValue;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        oipsdeybqn oipsdeybqnVarIobyxmoadg;
        Object objYadqdtsiqt2;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        long jIwizpuwonk;
        String onPrimary;
        Object objYadqdtsiqt3;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-807951951);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(counterStyle) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(tints) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                iobyxmoadgVar2 = iobyxmoadgVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(535272286);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ppxfxbqfkf.wkgbmnqykc();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-807951951, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.BasketIcon (BasketIcon.kt:40)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(535273552);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = Integer.valueOf(iobyxmoadg.f38411iobyxmoadg[counterStyle.ordinal()] == 1 ? 60 : 48);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iIntValue = ((Number) objYadqdtsiqt).intValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                if (model.getIsExpand()) {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                } else {
                    oipsdeybqnVarIobyxmoadg = null;
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYggfygwlhe = cdpycssgdh.yggfygwlhe(cdpycssgdh.wkgbmnqykc(w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "COUNTER_ADD_TO_BASKET_BUTTON", null, null, false, 14, null), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(iIntValue));
                    boolean zEsjtqupxsv = model.esjtqupxsv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(535294147);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarYggfygwlhe, (metgxyhuhe.draadjrbmk) objYadqdtsiqt2, null, zEsjtqupxsv, null, null, iobyxmoadgVar3, 24, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
                    if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                        androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                    }
                    draadjrbmkVarBtonecajqb.pkzmftpjix();
                    if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                        draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                    } else {
                        draadjrbmkVarBtonecajqb.yggfygwlhe();
                    }
                    draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar4.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar4.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar4.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    m.wkgbmnqykc wkgbmnqykcVarZoijcleaow = e0.lqeggnwhkg.zoijcleaow(m.wkgbmnqykc.f64773gtknphoqwx, b31.gxszxtbevo.ic_cart_14, draadjrbmkVarBtonecajqb, 6);
                    if (tints != null && (onPrimary = tints.getOnPrimary()) != null) {
                        oipsdeybqnVarIobyxmoadg = j41.iobyxmoadg.iobyxmoadg(onPrimary);
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1474513114);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yadqdtsiqt();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j13 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    t.wkgbmnqykc(wkgbmnqykcVarZoijcleaow, null, null, j13, draadjrbmkVarBtonecajqb, 48, 4);
                    draadjrbmkVar2.cqumvgiudr();
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar2 = iobyxmoadgVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: gs0.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ppxfxbqfkf.eablkybsjg(model, counterStyle, tints, iobyxmoadgVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i15 & 1171) == 1170) {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(535272286);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-807951951, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.BasketIcon (BasketIcon.kt:40)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(535273552);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = Integer.valueOf(iobyxmoadg.f38411iobyxmoadg[counterStyle.ordinal()] == 1 ? 60 : 48);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = Integer.valueOf(iobyxmoadg.f38411iobyxmoadg[counterStyle.ordinal()] == 1 ? 60 : 48);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iIntValue = ((Number) objYadqdtsiqt).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (model.getIsExpand()) {
                oipsdeybqnVarIobyxmoadg = null;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYggfygwlhe2 = cdpycssgdh.yggfygwlhe(cdpycssgdh.wkgbmnqykc(w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "COUNTER_ADD_TO_BASKET_BUTTON", null, null, false, 14, null), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(iIntValue));
                boolean zEsjtqupxsv2 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(535294147);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarYggfygwlhe2, (metgxyhuhe.draadjrbmk) objYadqdtsiqt2, null, zEsjtqupxsv2, null, null, iobyxmoadgVar3, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo2);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar5.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar5.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar5.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                m.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = e0.lqeggnwhkg.zoijcleaow(m.wkgbmnqykc.f64773gtknphoqwx, b31.gxszxtbevo.ic_cart_14, draadjrbmkVarBtonecajqb, 6);
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = j41.iobyxmoadg.iobyxmoadg(onPrimary);
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1474513114);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yadqdtsiqt();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j14 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                t.wkgbmnqykc(wkgbmnqykcVarZoijcleaow2, null, null, j14, draadjrbmkVarBtonecajqb, 48, 4);
                draadjrbmkVar2.cqumvgiudr();
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar2 = iobyxmoadgVar3;
        } else {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(535272286);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-807951951, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.BasketIcon (BasketIcon.kt:40)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(535273552);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = Integer.valueOf(iobyxmoadg.f38411iobyxmoadg[counterStyle.ordinal()] == 1 ? 60 : 48);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = Integer.valueOf(iobyxmoadg.f38411iobyxmoadg[counterStyle.ordinal()] == 1 ? 60 : 48);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iIntValue = ((Number) objYadqdtsiqt).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (model.getIsExpand()) {
                oipsdeybqnVarIobyxmoadg = null;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYggfygwlhe3 = cdpycssgdh.yggfygwlhe(cdpycssgdh.wkgbmnqykc(w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "COUNTER_ADD_TO_BASKET_BUTTON", null, null, false, 14, null), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(iIntValue));
                boolean zEsjtqupxsv3 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(535294147);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarYggfygwlhe3, (metgxyhuhe.draadjrbmk) objYadqdtsiqt2, null, zEsjtqupxsv3, null, null, iobyxmoadgVar3, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo3);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar6 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar6.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar6.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar6.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar6.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar6.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                m.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = e0.lqeggnwhkg.zoijcleaow(m.wkgbmnqykc.f64773gtknphoqwx, b31.gxszxtbevo.ic_cart_14, draadjrbmkVarBtonecajqb, 6);
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = j41.iobyxmoadg.iobyxmoadg(onPrimary);
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1474513114);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yadqdtsiqt();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j15 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                t.wkgbmnqykc(wkgbmnqykcVarZoijcleaow3, null, null, j15, draadjrbmkVarBtonecajqb, 48, 4);
                draadjrbmkVar2.cqumvgiudr();
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar2 = iobyxmoadgVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: gs0.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.eablkybsjg(model, counterStyle, tints, iobyxmoadgVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
