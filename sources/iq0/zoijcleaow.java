package iq0;

import androidx.compose.foundation.eablkybsjg;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.wkgbmnqykc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fq0.nufgyqmvbu;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(String str, tg.iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(str, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final String text, final tg.iobyxmoadg onClick, wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        wkgbmnqykc wkgbmnqykcVar3;
        oipsdeybqn oipsdeybqnVar;
        z zVar;
        int i17;
        long jIwizpuwonk;
        draadjrbmk draadjrbmkVar2;
        final wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(884493406);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(text) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i16 = i15;
            if ((i16 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(884493406, i16, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.compose.buttons.SpecificProductTextButton (SpecificProductTextButton.kt:14)");
                }
                oipsdeybqnVar = (oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(nufgyqmvbu.iobyxmoadg());
                zVar = z.f44180iobyxmoadg;
                i17 = z.f44181zoijcleaow;
                n nVarNufgyqmvbu = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i17).nufgyqmvbu();
                draadjrbmkVarBtonecajqb.sopmlzcsov(634782856);
                if (oipsdeybqnVar == null) {
                    jIwizpuwonk = zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i17).btonecajqb();
                } else {
                    jIwizpuwonk = oipsdeybqnVar.iwizpuwonk();
                }
                long j13 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(text, eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVarNufgyqmvbu, draadjrbmkVar2, i16 & 14, 0, 65528);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: iq0.iobyxmoadg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return zoijcleaow.ppxfxbqfkf(text, onClick, wkgbmnqykcVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 147) == 146) {
            if (i18 != 0) {
                wkgbmnqykcVar3 = wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(884493406, i16, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.compose.buttons.SpecificProductTextButton (SpecificProductTextButton.kt:14)");
            }
            oipsdeybqnVar = (oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(nufgyqmvbu.iobyxmoadg());
            zVar = z.f44180iobyxmoadg;
            i17 = z.f44181zoijcleaow;
            n nVarNufgyqmvbu2 = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i17).nufgyqmvbu();
            draadjrbmkVarBtonecajqb.sopmlzcsov(634782856);
            if (oipsdeybqnVar == null) {
                jIwizpuwonk = zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i17).btonecajqb();
            } else {
                jIwizpuwonk = oipsdeybqnVar.iwizpuwonk();
            }
            long j14 = jIwizpuwonk;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(text, eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null), j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVarNufgyqmvbu2, draadjrbmkVar2, i16 & 14, 0, 65528);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar3 = wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(884493406, i16, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.compose.buttons.SpecificProductTextButton (SpecificProductTextButton.kt:14)");
            }
            oipsdeybqnVar = (oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(nufgyqmvbu.iobyxmoadg());
            zVar = z.f44180iobyxmoadg;
            i17 = z.f44181zoijcleaow;
            n nVarNufgyqmvbu3 = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i17).nufgyqmvbu();
            draadjrbmkVarBtonecajqb.sopmlzcsov(634782856);
            if (oipsdeybqnVar == null) {
                jIwizpuwonk = zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i17).btonecajqb();
            } else {
                jIwizpuwonk = oipsdeybqnVar.iwizpuwonk();
            }
            long j15 = jIwizpuwonk;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(text, eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null), j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVarNufgyqmvbu3, draadjrbmkVar2, i16 & 14, 0, 65528);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: iq0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(text, onClick, wkgbmnqykcVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
