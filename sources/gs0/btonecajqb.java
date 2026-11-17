package gs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;
import java.util.Arrays;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import tg.vdvldrhtss;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class btonecajqb {

    static final class iobyxmoadg implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Price f38368jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ColorsUiModel.Hex.Tints f38369yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ CounterModel f38370zdlpuopuiu;

        iobyxmoadg(CounterModel counterModel, ColorsUiModel.Hex.Tints tints, Price price) {
            this.f38370zdlpuopuiu = counterModel;
            this.f38369yggfygwlhe = tints;
            this.f38368jyumaefscl = price;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg(((Boolean) obj).booleanValue(), (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            String onPrimary;
            if ((i13 & 6) == 0) {
                i14 = i13 | (draadjrbmkVar.iobyxmoadg(z13) ? 4 : 2);
            } else {
                i14 = i13;
            }
            if ((i14 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(62110360, i14, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls.<anonymous>.<anonymous>.<anonymous> (CounterControls.kt:87)");
            }
            if (z13) {
                draadjrbmkVar.sopmlzcsov(-1722390538);
                fs0.vdvldrhtss.zoijcleaow(draadjrbmkVar, 0);
                draadjrbmkVar.stevsuqkhv();
            } else {
                draadjrbmkVar.sopmlzcsov(-1722309256);
                oipsdeybqn oipsdeybqnVarIobyxmoadg = null;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                boolean isMeasureTypeSwitchable = this.f38370zdlpuopuiu.getIsMeasureTypeSwitchable();
                z zVar = z.f44180iobyxmoadg;
                int i15 = z.f44181zoijcleaow;
                n nVarWkgbmnqykc = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVar, i15).zoijcleaow().wkgbmnqykc();
                ColorsUiModel.Hex.Tints tints = this.f38369yggfygwlhe;
                if (tints != null && (onPrimary = tints.getOnPrimary()) != null) {
                    oipsdeybqnVarIobyxmoadg = j41.iobyxmoadg.iobyxmoadg(onPrimary);
                }
                draadjrbmkVar.sopmlzcsov(1191377728);
                long jIozdgvuglv = oipsdeybqnVarIobyxmoadg == null ? l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar, i15).iozdgvuglv() : oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                draadjrbmkVar.stevsuqkhv();
                draadjrbmk.zoijcleaow(this.f38368jyumaefscl, isMeasureTypeSwitchable, wkgbmnqykcVarNufgyqmvbu, jIozdgvuglv, 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(v0.btonecajqb.f114934zoijcleaow.iobyxmoadg()), 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarWkgbmnqykc, draadjrbmkVar, 384, 24960, 109552);
                draadjrbmkVar.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, CounterModel counterModel, ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(wkgbmnqykcVar, counterModel, tints, iobyxmoadgVar, iobyxmoadgVar2, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x020d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:108:0x023c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0258  */
    /* JADX WARN: Code duplicated, block: B:113:0x0260  */
    /* JADX WARN: Code duplicated, block: B:116:0x0291  */
    /* JADX WARN: Code duplicated, block: B:119:0x029c  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x036e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0379  */
    /* JADX WARN: Code duplicated, block: B:133:0x0387  */
    /* JADX WARN: Code duplicated, block: B:134:0x0390  */
    /* JADX WARN: Code duplicated, block: B:137:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x03da  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:148:0x040c  */
    /* JADX WARN: Code duplicated, block: B:152:0x041a  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:86:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0179  */
    /* JADX WARN: Code duplicated, block: B:91:0x0187  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e0  */
    public static final void wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final CounterModel model, final ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        tg.iobyxmoadg iobyxmoadgVar3;
        int i16;
        tg.iobyxmoadg iobyxmoadgVar4;
        int i17;
        int i18;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        tg.iobyxmoadg iobyxmoadgVar5;
        tg.iobyxmoadg iobyxmoadgVar6;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int iHashCode2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt;
        boolean zUlzqkzuiru2;
        Object objYadqdtsiqt2;
        z zVar;
        int i19;
        oipsdeybqn oipsdeybqnVarIobyxmoadg;
        long jIwizpuwonk;
        oipsdeybqn oipsdeybqnVarIobyxmoadg2;
        long jIwizpuwonk2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        oipsdeybqn oipsdeybqnVarIobyxmoadg3;
        long jIwizpuwonk3;
        final tg.iobyxmoadg iobyxmoadgVar7;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        final tg.iobyxmoadg iobyxmoadgVar8;
        String onPrimary;
        String onPrimary2;
        String onPrimary3;
        Object objYadqdtsiqt3;
        Object objYadqdtsiqt4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1776435683);
        int i23 = i14 & 1;
        if (i23 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(tints) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                iobyxmoadgVar3 = iobyxmoadgVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    iobyxmoadgVar4 = iobyxmoadgVar2;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i23 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i24 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1016060791);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: gs0.lqeggnwhkg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return btonecajqb.eablkybsjg();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar5 = iobyxmoadgVar3;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1016062007);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.nufgyqmvbu
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return btonecajqb.gxszxtbevo();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt3;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar6 = iobyxmoadgVar4;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-1776435683, i18, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls (CounterControls.kt:57)");
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "COUNTER_EXPANDED", null, null, false, 14, null), 0.0f, 1, null);
                    a.eablkybsjg.iobyxmoadg iobyxmoadgVar9 = a.eablkybsjg.f20iobyxmoadg;
                    zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar9.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar10 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar10.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar10.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar10.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar10.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar10.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar11 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar11, 0.0f, 1, null);
                    zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), iobyxmoadgVar9.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 54);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo2);
                    iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar10.iobyxmoadg();
                    if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                        androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                    }
                    draadjrbmkVarBtonecajqb.pkzmftpjix();
                    if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                        draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                    } else {
                        draadjrbmkVarBtonecajqb.yggfygwlhe();
                    }
                    draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar10.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar10.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar10.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                        draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                        draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar10.wkgbmnqykc());
                    czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(251781632);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    String str = (String) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(251783868);
                    zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    Price price = (Price) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar11, "COUNTER_AMOUNT", null, null, false, 14, null);
                    zVar = z.f44180iobyxmoadg;
                    i19 = z.f44181zoijcleaow;
                    n nVarDraadjrbmk = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk();
                    if (tints != null || (onPrimary3 = tints.getOnPrimary()) == null) {
                        oipsdeybqnVarIobyxmoadg = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg = j41.iobyxmoadg.iobyxmoadg(onPrimary3);
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(251791545);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j13 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
                    String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{str, e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()), draadjrbmkVarBtonecajqb, 0)}, 2));
                    zdlpuopuiu.dxjokdxxww(str2, "format(...)");
                    w6.btonecajqb(str2, wkgbmnqykcVarOjitshcjhn, j13, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarDraadjrbmk, draadjrbmkVarBtonecajqb, 0, 3120, 55288);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                    ribwqtqdhb.nufgyqmvbu.iobyxmoadg(Boolean.valueOf(model.getIsLoading()), null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(62110360, true, new iobyxmoadg(model, tints, price), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 24576, 14);
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn2 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar11, iobyxmoadgVar9.nufgyqmvbu()), "COUNTER_MINUS_BUTTON", null, null, false, 14, null);
                    js0.zoijcleaow zoijcleaowVar = js0.zoijcleaow.FULL;
                    int i25 = b31.gxszxtbevo.ic_minus_14;
                    if (tints != null || (onPrimary2 = tints.getOnPrimary()) == null) {
                        oipsdeybqnVarIobyxmoadg2 = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg2 = j41.iobyxmoadg.iobyxmoadg(onPrimary2);
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1034336746);
                    if (oipsdeybqnVarIobyxmoadg2 == null) {
                        jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                    } else {
                        jIwizpuwonk2 = oipsdeybqnVarIobyxmoadg2.iwizpuwonk();
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.iobyxmoadg iobyxmoadgVar12 = iobyxmoadgVar5;
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    gxszxtbevo.ppxfxbqfkf(zoijcleaowVar, i25, jIwizpuwonk2, wkgbmnqykcVarOjitshcjhn2, iobyxmoadgVar5, draadjrbmkVarBtonecajqb, ((i18 << 3) & 57344) | 6, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn3 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar11, iobyxmoadgVar9.gxszxtbevo()), "COUNTER_PLUS_BUTTON", null, null, false, 14, null);
                    int i26 = b31.gxszxtbevo.ic_plus_14;
                    if (tints != null || (onPrimary = tints.getOnPrimary()) == null) {
                        oipsdeybqnVarIobyxmoadg3 = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg3 = j41.iobyxmoadg.iobyxmoadg(onPrimary);
                    }
                    draadjrbmkVar2.sopmlzcsov(-1034322986);
                    if (oipsdeybqnVarIobyxmoadg3 == null) {
                        jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).yadqdtsiqt();
                    } else {
                        jIwizpuwonk3 = oipsdeybqnVarIobyxmoadg3.iwizpuwonk();
                    }
                    long j14 = jIwizpuwonk3;
                    draadjrbmkVar2.stevsuqkhv();
                    gxszxtbevo.ppxfxbqfkf(zoijcleaowVar, i26, j14, wkgbmnqykcVarOjitshcjhn3, iobyxmoadgVar6, draadjrbmkVar2, (i18 & 57344) | 6, 0);
                    draadjrbmkVar2.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar7 = iobyxmoadgVar12;
                    wkgbmnqykcVar4 = wkgbmnqykcVar5;
                    iobyxmoadgVar8 = iobyxmoadgVar6;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                    iobyxmoadgVar8 = iobyxmoadgVar4;
                }
                a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: gs0.dxjokdxxww
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return btonecajqb.lqeggnwhkg(wkgbmnqykcVar4, model, tints, iobyxmoadgVar7, iobyxmoadgVar8, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            iobyxmoadgVar4 = iobyxmoadgVar2;
            i18 = i15;
            if ((i18 & 9363) == 9362) {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016060791);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: gs0.lqeggnwhkg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.eablkybsjg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar5 = iobyxmoadgVar3;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016062007);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.nufgyqmvbu
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar6 = iobyxmoadgVar4;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1776435683, i18, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls (CounterControls.kt:57)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "COUNTER_EXPANDED", null, null, false, 14, null), 0.0f, 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar13 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar13.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo3);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar14 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar14.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar14.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar14.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar14.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar14.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar15 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo4 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar15, 0.0f, 1, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), iobyxmoadgVar13.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 54);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo4);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar14.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar14.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar14.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar14.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                } else {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar14.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(251781632);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                String str3 = (String) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(251783868);
                zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                Price price2 = (Price) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn4 = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar15, "COUNTER_AMOUNT", null, null, false, 14, null);
                zVar = z.f44180iobyxmoadg;
                i19 = z.f44181zoijcleaow;
                n nVarDraadjrbmk2 = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk();
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = null;
                } else {
                    oipsdeybqnVarIobyxmoadg = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(251791545);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j15 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tzroggbefp tzroggbefpVar2 = tzroggbefp.f60034iobyxmoadg;
                String str4 = String.format("%s %s", Arrays.copyOf(new Object[]{str3, e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()), draadjrbmkVarBtonecajqb, 0)}, 2));
                zdlpuopuiu.dxjokdxxww(str4, "format(...)");
                w6.btonecajqb(str4, wkgbmnqykcVarOjitshcjhn4, j15, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarDraadjrbmk2, draadjrbmkVarBtonecajqb, 0, 3120, 55288);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                ribwqtqdhb.nufgyqmvbu.iobyxmoadg(Boolean.valueOf(model.getIsLoading()), null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(62110360, true, new iobyxmoadg(model, tints, price2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 24576, 14);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn5 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar2.wkgbmnqykc(iobyxmoadgVar15, iobyxmoadgVar13.nufgyqmvbu()), "COUNTER_MINUS_BUTTON", null, null, false, 14, null);
                js0.zoijcleaow zoijcleaowVar2 = js0.zoijcleaow.FULL;
                int i27 = b31.gxszxtbevo.ic_minus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg2 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg2 = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1034336746);
                if (oipsdeybqnVarIobyxmoadg2 == null) {
                    jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk2 = oipsdeybqnVarIobyxmoadg2.iwizpuwonk();
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.iobyxmoadg iobyxmoadgVar16 = iobyxmoadgVar5;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar2, i27, jIwizpuwonk2, wkgbmnqykcVarOjitshcjhn5, iobyxmoadgVar5, draadjrbmkVarBtonecajqb, ((i18 << 3) & 57344) | 6, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn6 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar2.wkgbmnqykc(iobyxmoadgVar15, iobyxmoadgVar13.gxszxtbevo()), "COUNTER_PLUS_BUTTON", null, null, false, 14, null);
                int i28 = b31.gxszxtbevo.ic_plus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg3 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg3 = null;
                }
                draadjrbmkVar2.sopmlzcsov(-1034322986);
                if (oipsdeybqnVarIobyxmoadg3 == null) {
                    jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk3 = oipsdeybqnVarIobyxmoadg3.iwizpuwonk();
                }
                long j16 = jIwizpuwonk3;
                draadjrbmkVar2.stevsuqkhv();
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar2, i28, j16, wkgbmnqykcVarOjitshcjhn6, iobyxmoadgVar6, draadjrbmkVar2, (i18 & 57344) | 6, 0);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar7 = iobyxmoadgVar16;
                wkgbmnqykcVar4 = wkgbmnqykcVar6;
                iobyxmoadgVar8 = iobyxmoadgVar6;
            } else {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016060791);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: gs0.lqeggnwhkg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.eablkybsjg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar5 = iobyxmoadgVar3;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016062007);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.nufgyqmvbu
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar6 = iobyxmoadgVar4;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1776435683, i18, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls (CounterControls.kt:57)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo5 = cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "COUNTER_EXPANDED", null, null, false, 14, null), 0.0f, 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar17 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar17.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo5);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar18 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar18.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar18.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar18.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar18.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar18.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar19 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo6 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar19, 0.0f, 1, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), iobyxmoadgVar17.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 54);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo6);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar18.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar18.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar18.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar18.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                } else {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar18.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(251781632);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                String str5 = (String) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(251783868);
                zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                Price price3 = (Price) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn7 = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar19, "COUNTER_AMOUNT", null, null, false, 14, null);
                zVar = z.f44180iobyxmoadg;
                i19 = z.f44181zoijcleaow;
                n nVarDraadjrbmk3 = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk();
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = null;
                } else {
                    oipsdeybqnVarIobyxmoadg = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(251791545);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j17 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tzroggbefp tzroggbefpVar3 = tzroggbefp.f60034iobyxmoadg;
                String str6 = String.format("%s %s", Arrays.copyOf(new Object[]{str5, e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()), draadjrbmkVarBtonecajqb, 0)}, 2));
                zdlpuopuiu.dxjokdxxww(str6, "format(...)");
                w6.btonecajqb(str6, wkgbmnqykcVarOjitshcjhn7, j17, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarDraadjrbmk3, draadjrbmkVarBtonecajqb, 0, 3120, 55288);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                ribwqtqdhb.nufgyqmvbu.iobyxmoadg(Boolean.valueOf(model.getIsLoading()), null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(62110360, true, new iobyxmoadg(model, tints, price3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 24576, 14);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn8 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar3.wkgbmnqykc(iobyxmoadgVar19, iobyxmoadgVar17.nufgyqmvbu()), "COUNTER_MINUS_BUTTON", null, null, false, 14, null);
                js0.zoijcleaow zoijcleaowVar3 = js0.zoijcleaow.FULL;
                int i29 = b31.gxszxtbevo.ic_minus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg2 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg2 = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1034336746);
                if (oipsdeybqnVarIobyxmoadg2 == null) {
                    jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk2 = oipsdeybqnVarIobyxmoadg2.iwizpuwonk();
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.iobyxmoadg iobyxmoadgVar110 = iobyxmoadgVar5;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar3, i29, jIwizpuwonk2, wkgbmnqykcVarOjitshcjhn8, iobyxmoadgVar5, draadjrbmkVarBtonecajqb, ((i18 << 3) & 57344) | 6, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn9 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar3.wkgbmnqykc(iobyxmoadgVar19, iobyxmoadgVar17.gxszxtbevo()), "COUNTER_PLUS_BUTTON", null, null, false, 14, null);
                int i210 = b31.gxszxtbevo.ic_plus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg3 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg3 = null;
                }
                draadjrbmkVar2.sopmlzcsov(-1034322986);
                if (oipsdeybqnVarIobyxmoadg3 == null) {
                    jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk3 = oipsdeybqnVarIobyxmoadg3.iwizpuwonk();
                }
                long j18 = jIwizpuwonk3;
                draadjrbmkVar2.stevsuqkhv();
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar3, i210, j18, wkgbmnqykcVarOjitshcjhn9, iobyxmoadgVar6, draadjrbmkVar2, (i18 & 57344) | 6, 0);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar7 = iobyxmoadgVar110;
                wkgbmnqykcVar4 = wkgbmnqykcVar7;
                iobyxmoadgVar8 = iobyxmoadgVar6;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: gs0.dxjokdxxww
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return btonecajqb.lqeggnwhkg(wkgbmnqykcVar4, model, tints, iobyxmoadgVar7, iobyxmoadgVar8, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        iobyxmoadgVar3 = iobyxmoadgVar;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                iobyxmoadgVar4 = iobyxmoadgVar2;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 9363) == 9362) {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016060791);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: gs0.lqeggnwhkg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.eablkybsjg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar5 = iobyxmoadgVar3;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016062007);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.nufgyqmvbu
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar6 = iobyxmoadgVar4;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1776435683, i18, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls (CounterControls.kt:57)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo7 = cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "COUNTER_EXPANDED", null, null, false, 14, null), 0.0f, 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar111 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww4 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar111.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt7 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg7 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo7);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar112 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar112.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww4, iobyxmoadgVar112.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt7, iobyxmoadgVar112.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar112.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg7, iobyxmoadgVar112.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar4 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar113 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo8 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar113, 0.0f, 1, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg4 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), iobyxmoadgVar111.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 54);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt8 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg8 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo8);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar112.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg4, iobyxmoadgVar112.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt8, iobyxmoadgVar112.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar112.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                } else {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg8, iobyxmoadgVar112.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar4 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(251781632);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                String str7 = (String) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(251783868);
                zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                Price price4 = (Price) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn10 = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar113, "COUNTER_AMOUNT", null, null, false, 14, null);
                zVar = z.f44180iobyxmoadg;
                i19 = z.f44181zoijcleaow;
                n nVarDraadjrbmk4 = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk();
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = null;
                } else {
                    oipsdeybqnVarIobyxmoadg = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(251791545);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j19 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tzroggbefp tzroggbefpVar4 = tzroggbefp.f60034iobyxmoadg;
                String str8 = String.format("%s %s", Arrays.copyOf(new Object[]{str7, e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()), draadjrbmkVarBtonecajqb, 0)}, 2));
                zdlpuopuiu.dxjokdxxww(str8, "format(...)");
                w6.btonecajqb(str8, wkgbmnqykcVarOjitshcjhn10, j19, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarDraadjrbmk4, draadjrbmkVarBtonecajqb, 0, 3120, 55288);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                ribwqtqdhb.nufgyqmvbu.iobyxmoadg(Boolean.valueOf(model.getIsLoading()), null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(62110360, true, new iobyxmoadg(model, tints, price4), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 24576, 14);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn11 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar4.wkgbmnqykc(iobyxmoadgVar113, iobyxmoadgVar111.nufgyqmvbu()), "COUNTER_MINUS_BUTTON", null, null, false, 14, null);
                js0.zoijcleaow zoijcleaowVar4 = js0.zoijcleaow.FULL;
                int i211 = b31.gxszxtbevo.ic_minus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg2 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg2 = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1034336746);
                if (oipsdeybqnVarIobyxmoadg2 == null) {
                    jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk2 = oipsdeybqnVarIobyxmoadg2.iwizpuwonk();
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.iobyxmoadg iobyxmoadgVar114 = iobyxmoadgVar5;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar4, i211, jIwizpuwonk2, wkgbmnqykcVarOjitshcjhn11, iobyxmoadgVar5, draadjrbmkVarBtonecajqb, ((i18 << 3) & 57344) | 6, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn12 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar4.wkgbmnqykc(iobyxmoadgVar113, iobyxmoadgVar111.gxszxtbevo()), "COUNTER_PLUS_BUTTON", null, null, false, 14, null);
                int i212 = b31.gxszxtbevo.ic_plus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg3 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg3 = null;
                }
                draadjrbmkVar2.sopmlzcsov(-1034322986);
                if (oipsdeybqnVarIobyxmoadg3 == null) {
                    jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk3 = oipsdeybqnVarIobyxmoadg3.iwizpuwonk();
                }
                long j110 = jIwizpuwonk3;
                draadjrbmkVar2.stevsuqkhv();
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar4, i212, j110, wkgbmnqykcVarOjitshcjhn12, iobyxmoadgVar6, draadjrbmkVar2, (i18 & 57344) | 6, 0);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar7 = iobyxmoadgVar114;
                wkgbmnqykcVar4 = wkgbmnqykcVar8;
                iobyxmoadgVar8 = iobyxmoadgVar6;
            } else {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016060791);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: gs0.lqeggnwhkg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.eablkybsjg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar5 = iobyxmoadgVar3;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1016062007);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.nufgyqmvbu
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar6 = iobyxmoadgVar4;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1776435683, i18, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls (CounterControls.kt:57)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo9 = cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "COUNTER_EXPANDED", null, null, false, 14, null), 0.0f, 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar115 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww5 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar115.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt9 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg9 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo9);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar116 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar116.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww5, iobyxmoadgVar116.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt9, iobyxmoadgVar116.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar116.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg9, iobyxmoadgVar116.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar5 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar117 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo10 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar117, 0.0f, 1, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg5 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), iobyxmoadgVar115.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 54);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt10 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg10 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo10);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar116.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg5, iobyxmoadgVar116.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt10, iobyxmoadgVar116.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar116.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                } else {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg10, iobyxmoadgVar116.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar5 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(251781632);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                String str9 = (String) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(251783868);
                zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                Price price5 = (Price) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn13 = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar117, "COUNTER_AMOUNT", null, null, false, 14, null);
                zVar = z.f44180iobyxmoadg;
                i19 = z.f44181zoijcleaow;
                n nVarDraadjrbmk5 = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk();
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = null;
                } else {
                    oipsdeybqnVarIobyxmoadg = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(251791545);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j111 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tzroggbefp tzroggbefpVar5 = tzroggbefp.f60034iobyxmoadg;
                String str10 = String.format("%s %s", Arrays.copyOf(new Object[]{str9, e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()), draadjrbmkVarBtonecajqb, 0)}, 2));
                zdlpuopuiu.dxjokdxxww(str10, "format(...)");
                w6.btonecajqb(str10, wkgbmnqykcVarOjitshcjhn13, j111, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarDraadjrbmk5, draadjrbmkVarBtonecajqb, 0, 3120, 55288);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                ribwqtqdhb.nufgyqmvbu.iobyxmoadg(Boolean.valueOf(model.getIsLoading()), null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(62110360, true, new iobyxmoadg(model, tints, price5), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 24576, 14);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn14 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar5.wkgbmnqykc(iobyxmoadgVar117, iobyxmoadgVar115.nufgyqmvbu()), "COUNTER_MINUS_BUTTON", null, null, false, 14, null);
                js0.zoijcleaow zoijcleaowVar5 = js0.zoijcleaow.FULL;
                int i213 = b31.gxszxtbevo.ic_minus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg2 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg2 = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1034336746);
                if (oipsdeybqnVarIobyxmoadg2 == null) {
                    jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk2 = oipsdeybqnVarIobyxmoadg2.iwizpuwonk();
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.iobyxmoadg iobyxmoadgVar118 = iobyxmoadgVar5;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar9 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar5, i213, jIwizpuwonk2, wkgbmnqykcVarOjitshcjhn14, iobyxmoadgVar5, draadjrbmkVarBtonecajqb, ((i18 << 3) & 57344) | 6, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn15 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar5.wkgbmnqykc(iobyxmoadgVar117, iobyxmoadgVar115.gxszxtbevo()), "COUNTER_PLUS_BUTTON", null, null, false, 14, null);
                int i214 = b31.gxszxtbevo.ic_plus_14;
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg3 = null;
                } else {
                    oipsdeybqnVarIobyxmoadg3 = null;
                }
                draadjrbmkVar2.sopmlzcsov(-1034322986);
                if (oipsdeybqnVarIobyxmoadg3 == null) {
                    jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).yadqdtsiqt();
                } else {
                    jIwizpuwonk3 = oipsdeybqnVarIobyxmoadg3.iwizpuwonk();
                }
                long j112 = jIwizpuwonk3;
                draadjrbmkVar2.stevsuqkhv();
                gxszxtbevo.ppxfxbqfkf(zoijcleaowVar5, i214, j112, wkgbmnqykcVarOjitshcjhn15, iobyxmoadgVar6, draadjrbmkVar2, (i18 & 57344) | 6, 0);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar7 = iobyxmoadgVar118;
                wkgbmnqykcVar4 = wkgbmnqykcVar9;
                iobyxmoadgVar8 = iobyxmoadgVar6;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: gs0.dxjokdxxww
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return btonecajqb.lqeggnwhkg(wkgbmnqykcVar4, model, tints, iobyxmoadgVar7, iobyxmoadgVar8, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        iobyxmoadgVar4 = iobyxmoadgVar2;
        i18 = i15;
        if ((i18 & 9363) == 9362) {
            if (i23 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i24 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1016060791);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: gs0.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return btonecajqb.eablkybsjg();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar5 = iobyxmoadgVar3;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1016062007);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.nufgyqmvbu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return btonecajqb.gxszxtbevo();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar6 = iobyxmoadgVar4;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1776435683, i18, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls (CounterControls.kt:57)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo11 = cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "COUNTER_EXPANDED", null, null, false, 14, null), 0.0f, 1, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar119 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww6 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar119.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt11 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg11 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo11);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar1110 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar1110.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww6, iobyxmoadgVar1110.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt11, iobyxmoadgVar1110.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar1110.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg11, iobyxmoadgVar1110.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar6 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar1111 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo12 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar1111, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg6 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), iobyxmoadgVar119.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 54);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt12 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg12 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo12);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar1110.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg6, iobyxmoadgVar1110.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt12, iobyxmoadgVar1110.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar1110.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg12, iobyxmoadgVar1110.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar6 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(251781632);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            String str11 = (String) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(251783868);
            zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2) {
                objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            Price price6 = (Price) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn16 = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar1111, "COUNTER_AMOUNT", null, null, false, 14, null);
            zVar = z.f44180iobyxmoadg;
            i19 = z.f44181zoijcleaow;
            n nVarDraadjrbmk6 = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk();
            if (tints != null) {
                oipsdeybqnVarIobyxmoadg = null;
            } else {
                oipsdeybqnVarIobyxmoadg = null;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(251791545);
            if (oipsdeybqnVarIobyxmoadg == null) {
                jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
            } else {
                jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
            }
            long j113 = jIwizpuwonk;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tzroggbefp tzroggbefpVar6 = tzroggbefp.f60034iobyxmoadg;
            String str12 = String.format("%s %s", Arrays.copyOf(new Object[]{str11, e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()), draadjrbmkVarBtonecajqb, 0)}, 2));
            zdlpuopuiu.dxjokdxxww(str12, "format(...)");
            w6.btonecajqb(str12, wkgbmnqykcVarOjitshcjhn16, j113, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarDraadjrbmk6, draadjrbmkVarBtonecajqb, 0, 3120, 55288);
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
            ribwqtqdhb.nufgyqmvbu.iobyxmoadg(Boolean.valueOf(model.getIsLoading()), null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(62110360, true, new iobyxmoadg(model, tints, price6), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 24576, 14);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn17 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar6.wkgbmnqykc(iobyxmoadgVar1111, iobyxmoadgVar119.nufgyqmvbu()), "COUNTER_MINUS_BUTTON", null, null, false, 14, null);
            js0.zoijcleaow zoijcleaowVar6 = js0.zoijcleaow.FULL;
            int i215 = b31.gxszxtbevo.ic_minus_14;
            if (tints != null) {
                oipsdeybqnVarIobyxmoadg2 = null;
            } else {
                oipsdeybqnVarIobyxmoadg2 = null;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1034336746);
            if (oipsdeybqnVarIobyxmoadg2 == null) {
                jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
            } else {
                jIwizpuwonk2 = oipsdeybqnVarIobyxmoadg2.iwizpuwonk();
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.iobyxmoadg iobyxmoadgVar1112 = iobyxmoadgVar5;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar10 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            gxszxtbevo.ppxfxbqfkf(zoijcleaowVar6, i215, jIwizpuwonk2, wkgbmnqykcVarOjitshcjhn17, iobyxmoadgVar5, draadjrbmkVarBtonecajqb, ((i18 << 3) & 57344) | 6, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn18 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar6.wkgbmnqykc(iobyxmoadgVar1111, iobyxmoadgVar119.gxszxtbevo()), "COUNTER_PLUS_BUTTON", null, null, false, 14, null);
            int i216 = b31.gxszxtbevo.ic_plus_14;
            if (tints != null) {
                oipsdeybqnVarIobyxmoadg3 = null;
            } else {
                oipsdeybqnVarIobyxmoadg3 = null;
            }
            draadjrbmkVar2.sopmlzcsov(-1034322986);
            if (oipsdeybqnVarIobyxmoadg3 == null) {
                jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).yadqdtsiqt();
            } else {
                jIwizpuwonk3 = oipsdeybqnVarIobyxmoadg3.iwizpuwonk();
            }
            long j114 = jIwizpuwonk3;
            draadjrbmkVar2.stevsuqkhv();
            gxszxtbevo.ppxfxbqfkf(zoijcleaowVar6, i216, j114, wkgbmnqykcVarOjitshcjhn18, iobyxmoadgVar6, draadjrbmkVar2, (i18 & 57344) | 6, 0);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar7 = iobyxmoadgVar1112;
            wkgbmnqykcVar4 = wkgbmnqykcVar10;
            iobyxmoadgVar8 = iobyxmoadgVar6;
        } else {
            if (i23 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i24 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1016060791);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: gs0.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return btonecajqb.eablkybsjg();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar5 = iobyxmoadgVar3;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1016062007);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: gs0.nufgyqmvbu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return btonecajqb.gxszxtbevo();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar6 = iobyxmoadgVar4;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1776435683, i18, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.counter_controls.CounterControls (CounterControls.kt:57)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo13 = cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "COUNTER_EXPANDED", null, null, false, 14, null), 0.0f, 1, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar1113 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww7 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar1113.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt13 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg13 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo13);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar1114 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar1114.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww7, iobyxmoadgVar1114.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt13, iobyxmoadgVar1114.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar1114.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg13, iobyxmoadgVar1114.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar7 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar1115 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo14 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar1115, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg7 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), iobyxmoadgVar1113.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 54);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt14 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg14 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo14);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar1114.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg7, iobyxmoadgVar1114.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt14, iobyxmoadgVar1114.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar1114.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg14, iobyxmoadgVar1114.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar7 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(251781632);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = ks0.iobyxmoadg.eablkybsjg(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            String str13 = (String) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(251783868);
            zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2) {
                objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = ks0.iobyxmoadg.nufgyqmvbu(model);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            Price price7 = (Price) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn19 = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar1115, "COUNTER_AMOUNT", null, null, false, 14, null);
            zVar = z.f44180iobyxmoadg;
            i19 = z.f44181zoijcleaow;
            n nVarDraadjrbmk7 = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk();
            if (tints != null) {
                oipsdeybqnVarIobyxmoadg = null;
            } else {
                oipsdeybqnVarIobyxmoadg = null;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(251791545);
            if (oipsdeybqnVarIobyxmoadg == null) {
                jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
            } else {
                jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
            }
            long j115 = jIwizpuwonk;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tzroggbefp tzroggbefpVar7 = tzroggbefp.f60034iobyxmoadg;
            String str14 = String.format("%s %s", Arrays.copyOf(new Object[]{str13, e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()), draadjrbmkVarBtonecajqb, 0)}, 2));
            zdlpuopuiu.dxjokdxxww(str14, "format(...)");
            w6.btonecajqb(str14, wkgbmnqykcVarOjitshcjhn19, j115, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarDraadjrbmk7, draadjrbmkVarBtonecajqb, 0, 3120, 55288);
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
            ribwqtqdhb.nufgyqmvbu.iobyxmoadg(Boolean.valueOf(model.getIsLoading()), null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(62110360, true, new iobyxmoadg(model, tints, price7), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 24576, 14);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn110 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar7.wkgbmnqykc(iobyxmoadgVar1115, iobyxmoadgVar1113.nufgyqmvbu()), "COUNTER_MINUS_BUTTON", null, null, false, 14, null);
            js0.zoijcleaow zoijcleaowVar7 = js0.zoijcleaow.FULL;
            int i217 = b31.gxszxtbevo.ic_minus_14;
            if (tints != null) {
                oipsdeybqnVarIobyxmoadg2 = null;
            } else {
                oipsdeybqnVarIobyxmoadg2 = null;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1034336746);
            if (oipsdeybqnVarIobyxmoadg2 == null) {
                jIwizpuwonk2 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).yadqdtsiqt();
            } else {
                jIwizpuwonk2 = oipsdeybqnVarIobyxmoadg2.iwizpuwonk();
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.iobyxmoadg iobyxmoadgVar1116 = iobyxmoadgVar5;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar11 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            gxszxtbevo.ppxfxbqfkf(zoijcleaowVar7, i217, jIwizpuwonk2, wkgbmnqykcVarOjitshcjhn110, iobyxmoadgVar5, draadjrbmkVarBtonecajqb, ((i18 << 3) & 57344) | 6, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn111 = w31.nufgyqmvbu.ojitshcjhn(wflxmlrfwpVar7.wkgbmnqykc(iobyxmoadgVar1115, iobyxmoadgVar1113.gxszxtbevo()), "COUNTER_PLUS_BUTTON", null, null, false, 14, null);
            int i218 = b31.gxszxtbevo.ic_plus_14;
            if (tints != null) {
                oipsdeybqnVarIobyxmoadg3 = null;
            } else {
                oipsdeybqnVarIobyxmoadg3 = null;
            }
            draadjrbmkVar2.sopmlzcsov(-1034322986);
            if (oipsdeybqnVarIobyxmoadg3 == null) {
                jIwizpuwonk3 = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).yadqdtsiqt();
            } else {
                jIwizpuwonk3 = oipsdeybqnVarIobyxmoadg3.iwizpuwonk();
            }
            long j116 = jIwizpuwonk3;
            draadjrbmkVar2.stevsuqkhv();
            gxszxtbevo.ppxfxbqfkf(zoijcleaowVar7, i218, j116, wkgbmnqykcVarOjitshcjhn111, iobyxmoadgVar6, draadjrbmkVar2, (i18 & 57344) | 6, 0);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar7 = iobyxmoadgVar1116;
            wkgbmnqykcVar4 = wkgbmnqykcVar11;
            iobyxmoadgVar8 = iobyxmoadgVar6;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: gs0.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.lqeggnwhkg(wkgbmnqykcVar4, model, tints, iobyxmoadgVar7, iobyxmoadgVar8, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
