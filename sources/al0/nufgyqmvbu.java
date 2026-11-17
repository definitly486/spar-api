package al0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import igdgnonuha.q;
import igdgnonuha.w6;
import igdgnonuha.z;
import ikoacuggdj.lrnfpwlwnk;
import ikoacuggdj.lxfrhoxuzk;
import opjhrmiecq.uawqvzlxes;
import p0.jhduphickx;
import p0.okpsazkaxt;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nufgyqmvbu {

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f2136zdlpuopuiu;

        iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar) {
            this.f2136zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1167823062, i13, -1, "ru.myspar.proloyalty.activation_card.impl.presentation.compose.ActivateCardState.<anonymous>.<anonymous>.<anonymous> (ActivateCardState.kt:80)");
            }
            q.zoijcleaow(this.f2136zdlpuopuiu, null, false, null, cqumvgiudr.f2115iobyxmoadg.iobyxmoadg(), draadjrbmkVar, 24576, 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jhduphickx eablkybsjg(j0.eablkybsjg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return y31.iobyxmoadg.zoijcleaow(it, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, zk0.nufgyqmvbu nufgyqmvbuVar, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(nufgyqmvbuVar.iobyxmoadg().draadjrbmk());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(zk0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.draadjrbmk draadjrbmkVar2, tg.iobyxmoadg iobyxmoadgVar4, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i14) {
        wkgbmnqykc(nufgyqmvbuVar, iobyxmoadgVar, draadjrbmkVar, iobyxmoadgVar2, iobyxmoadgVar3, draadjrbmkVar2, iobyxmoadgVar4, draadjrbmkVar3, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void wkgbmnqykc(final zk0.nufgyqmvbu model, final tg.iobyxmoadg onBackClick, final tg.draadjrbmk onCardNumberChanged, final tg.iobyxmoadg onScanClick, final tg.iobyxmoadg onActivateCardClick, final tg.draadjrbmk onDialogConfirmClick, final tg.iobyxmoadg onDialogCancelClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackClick, "onBackClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCardNumberChanged, "onCardNumberChanged");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onScanClick, "onScanClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onActivateCardClick, "onActivateCardClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDialogConfirmClick, "onDialogConfirmClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDialogCancelClick, "onDialogCancelClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1940418692);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onBackClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onCardNumberChanged) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onScanClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onActivateCardClick) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDialogConfirmClick) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDialogCancelClick) ? 1048576 : 524288;
        }
        int i16 = i14;
        if ((599187 & i16) == 599186 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1940418692, i16, -1, "ru.myspar.proloyalty.activation_card.impl.presentation.compose.ActivateCardState (ActivateCardState.kt:42)");
            }
            lxfrhoxuzk lxfrhoxuzkVarWkgbmnqykc = lrnfpwlwnk.wkgbmnqykc(0, draadjrbmkVarBtonecajqb, 0, 1);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarDxjokdxxww = lrnfpwlwnk.dxjokdxxww(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(iobyxmoadgVar, 0.0f, 1, null), lxfrhoxuzkVarWkgbmnqykc, false, null, false, 14, null);
            czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = eablkybsjgVar.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarDxjokdxxww);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            e31.eablkybsjg.nufgyqmvbu(null, null, null, true, onBackClick, null, false, null, draadjrbmkVarBtonecajqb, ((i16 << 9) & 57344) | 3072, 231);
            float f13 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarAgtfadlqog = androidx.compose.foundation.layout.esjtqupxsv.agtfadlqog(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f13));
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarAgtfadlqog);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(xk0.eablkybsjg.proloyalty_activate_card, draadjrbmkVarBtonecajqb, 0);
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf, null, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().btonecajqb(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            draadjrbmkVarBtonecajqb.sopmlzcsov(467726021);
            String strZoijcleaow = model.zoijcleaow();
            if (strZoijcleaow == null || strZoijcleaow.length() == 0) {
                i15 = 6;
            } else {
                i15 = 6;
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                w6.btonecajqb(model.zoijcleaow(), null, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().iobyxmoadg(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f14 = 12;
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, i15);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
            tzroggbefp tzroggbefpVarIobyxmoadg = model.iobyxmoadg();
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(xk0.eablkybsjg.proloyalty_card_number, draadjrbmkVarBtonecajqb, 0);
            uawqvzlxes uawqvzlxesVar = new uawqvzlxes(0, null, p0.lereixgezr.f75258zoijcleaow.wkgbmnqykc(), 0, null, null, null, 123, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(467765129);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                objYadqdtsiqt = new okpsazkaxt() { // from class: al0.eablkybsjg
                    @Override // p0.okpsazkaxt
                    public final jhduphickx iobyxmoadg(j0.eablkybsjg eablkybsjgVar2) {
                        return nufgyqmvbu.eablkybsjg(eablkybsjgVar2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            y31.kcexrzcfyt.gxszxtbevo(wkgbmnqykcVarNufgyqmvbu, tzroggbefpVarIobyxmoadg, onCardNumberChanged, strPpxfxbqfkf2, null, 0L, false, false, null, null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1167823062, true, new iobyxmoadg(onScanClick), draadjrbmkVarBtonecajqb, 54), false, (okpsazkaxt) objYadqdtsiqt, uawqvzlxesVar, null, true, 0, 0, null, null, null, null, draadjrbmkVarBtonecajqb, (i16 & 896) | 6, 12804480, 0, 16592880);
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, i15);
            boolean z13 = true;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            i31.wkgbmnqykc.wkgbmnqykc(e0.gxszxtbevo.ppxfxbqfkf(xk0.eablkybsjg.proloyalty_activate_card, draadjrbmkVarBtonecajqb, 0), onActivateCardClick, androidx.compose.foundation.layout.cdpycssgdh.dxjokdxxww(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(56)), null, model.wkgbmnqykc(), null, null, false, draadjrbmkVarBtonecajqb, ((i16 >> 9) & 112) | 384, 232);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.cqumvgiudr();
            if (model.lqeggnwhkg() && model.ppxfxbqfkf() != null) {
                String strDraadjrbmk = model.iobyxmoadg().draadjrbmk();
                String strPpxfxbqfkf3 = model.ppxfxbqfkf();
                draadjrbmkVar2.sopmlzcsov(-430002950);
                boolean z14 = (i16 & 458752) == 131072;
                if ((i16 & 14) != 4) {
                    z13 = false;
                }
                boolean z15 = z14 | z13;
                Object objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
                if (z15 || objYadqdtsiqt2 == iobyxmoadgVar4.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: al0.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.gxszxtbevo(onDialogConfirmClick, model, (String) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar2.stevsuqkhv();
                wkgbmnqykc.ppxfxbqfkf(strDraadjrbmk, strPpxfxbqfkf3, onDialogCancelClick, (tg.draadjrbmk) objYadqdtsiqt2, draadjrbmkVar2, (i16 >> 12) & 896);
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: al0.lqeggnwhkg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.lqeggnwhkg(model, onBackClick, onCardNumberChanged, onScanClick, onActivateCardClick, onDialogConfirmClick, onDialogCancelClick, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
