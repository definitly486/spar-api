package ju;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fu.cllcsxoeiz;
import fu.wypolnanlu;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import igdgnonuha.w6;
import igdgnonuha.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dxjokdxxww {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(int i13, double d13, double d14, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        zoijcleaow(i13, d13, d14, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final int i13, final double d13, final double d14, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(92783762);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.gxszxtbevo(d13) ? 32 : 16;
        }
        if ((i15 & 4) != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.gxszxtbevo(d14) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i15 & 8;
        if (i17 == 0) {
            if ((i14 & 3072) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i16 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(92783762, i16, -1, "ru.myspar.common.view.product.compose.single.combo.ProductCardComboContainerPriceInfo (ProductCardComboContainerPriceInfo.kt:27)");
                }
                String strWkgbmnqykc = e0.gxszxtbevo.wkgbmnqykc(s40.draadjrbmk.discount_percent_format, new Object[]{String.valueOf(i13)}, draadjrbmkVarBtonecajqb, 0);
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.btonecajqb(), draadjrbmkVarBtonecajqb, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                cllcsxoeiz.zoijcleaow(strWkgbmnqykc, null, draadjrbmkVarBtonecajqb, 0, 2);
                float f13 = 4;
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                wypolnanlu.zoijcleaow(null, d13, null, false, draadjrbmkVarBtonecajqb, (i16 & 112) | 3456, 1);
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                int i18 = s40.draadjrbmk.price_with_currency_format;
                String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1));
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(...)");
                w6.btonecajqb(e0.gxszxtbevo.wkgbmnqykc(i18, new Object[]{str}, draadjrbmkVarBtonecajqb, 0), null, bfopjjpdmp.ppxfxbqfkf(4286216826L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 384, 0, 65530);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ju.nufgyqmvbu
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return dxjokdxxww.ppxfxbqfkf(i13, d13, d14, wkgbmnqykcVar4, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 3072;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i16 & 1171) == 1170) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(92783762, i16, -1, "ru.myspar.common.view.product.compose.single.combo.ProductCardComboContainerPriceInfo (ProductCardComboContainerPriceInfo.kt:27)");
            }
            String strWkgbmnqykc2 = e0.gxszxtbevo.wkgbmnqykc(s40.draadjrbmk.discount_percent_format, new Object[]{String.valueOf(i13)}, draadjrbmkVarBtonecajqb, 0);
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.btonecajqb(), draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            cllcsxoeiz.zoijcleaow(strWkgbmnqykc2, null, draadjrbmkVarBtonecajqb, 0, 2);
            float f14 = 4;
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, 6);
            wypolnanlu.zoijcleaow(null, d13, null, false, draadjrbmkVarBtonecajqb, (i16 & 112) | 3456, 1);
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, 6);
            int i19 = s40.draadjrbmk.price_with_currency_format;
            String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "format(...)");
            w6.btonecajqb(e0.gxszxtbevo.wkgbmnqykc(i19, new Object[]{str2}, draadjrbmkVarBtonecajqb, 0), null, bfopjjpdmp.ppxfxbqfkf(4286216826L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 384, 0, 65530);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(92783762, i16, -1, "ru.myspar.common.view.product.compose.single.combo.ProductCardComboContainerPriceInfo (ProductCardComboContainerPriceInfo.kt:27)");
            }
            String strWkgbmnqykc3 = e0.gxszxtbevo.wkgbmnqykc(s40.draadjrbmk.discount_percent_format, new Object[]{String.valueOf(i13)}, draadjrbmkVarBtonecajqb, 0);
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.btonecajqb(), draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            cllcsxoeiz.zoijcleaow(strWkgbmnqykc3, null, draadjrbmkVarBtonecajqb, 0, 2);
            float f15 = 4;
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f15), draadjrbmkVarBtonecajqb, 6);
            wypolnanlu.zoijcleaow(null, d13, null, false, draadjrbmkVarBtonecajqb, (i16 & 112) | 3456, 1);
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f15), draadjrbmkVarBtonecajqb, 6);
            int i110 = s40.draadjrbmk.price_with_currency_format;
            String str3 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str3, "format(...)");
            w6.btonecajqb(e0.gxszxtbevo.wkgbmnqykc(i110, new Object[]{str3}, draadjrbmkVarBtonecajqb, 0), null, bfopjjpdmp.ppxfxbqfkf(4286216826L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 384, 0, 65530);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ju.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return dxjokdxxww.ppxfxbqfkf(i13, d13, d14, wkgbmnqykcVar4, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
