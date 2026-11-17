package et0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import zs0.jpowsppfya;

/* JADX INFO: loaded from: classes5.dex */
public abstract class agtfadlqog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(String str, String str2, String str3, int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        zoijcleaow(str, str2, str3, i13, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final String name, final String country, final String countryAndFlagEmoji, final int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int i17;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(country, "country");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(countryAndFlagEmoji, "countryAndFlagEmoji");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1943933694);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(name) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(country) ? 32 : 16;
        }
        if ((i15 & 4) != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(countryAndFlagEmoji) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i18 = i15 & 16;
        if (i18 == 0) {
            if ((i14 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            if ((i16 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1943933694, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.single.horizontal.ProductCardHorizontalContentName (ProductCardHorizontalContentName.kt:22)");
                }
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
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
                i17 = i16 >> 6;
                jpowsppfya.wkgbmnqykc(name, i13, null, null, draadjrbmkVarBtonecajqb, (i16 & 14) | (i17 & 112), 12);
                draadjrbmkVarBtonecajqb.sopmlzcsov(209937125);
                if (!mj.kcexrzcfyt.zfvoamnweg(country)) {
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                    zs0.yggfygwlhe.zoijcleaow(countryAndFlagEmoji, null, draadjrbmkVarBtonecajqb, i17 & 14, 2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
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
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: et0.wflxmlrfwp
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return agtfadlqog.ppxfxbqfkf(name, country, countryAndFlagEmoji, i13, wkgbmnqykcVar4, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i16 & 9363) == 9362) {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1943933694, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.single.horizontal.ProductCardHorizontalContentName (ProductCardHorizontalContentName.kt:22)");
            }
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
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
            i17 = i16 >> 6;
            jpowsppfya.wkgbmnqykc(name, i13, null, null, draadjrbmkVarBtonecajqb, (i16 & 14) | (i17 & 112), 12);
            draadjrbmkVarBtonecajqb.sopmlzcsov(209937125);
            if (!mj.kcexrzcfyt.zfvoamnweg(country)) {
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                zs0.yggfygwlhe.zoijcleaow(countryAndFlagEmoji, null, draadjrbmkVarBtonecajqb, i17 & 14, 2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1943933694, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.single.horizontal.ProductCardHorizontalContentName (ProductCardHorizontalContentName.kt:22)");
            }
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
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
            i17 = i16 >> 6;
            jpowsppfya.wkgbmnqykc(name, i13, null, null, draadjrbmkVarBtonecajqb, (i16 & 14) | (i17 & 112), 12);
            draadjrbmkVarBtonecajqb.sopmlzcsov(209937125);
            if (!mj.kcexrzcfyt.zfvoamnweg(country)) {
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                zs0.yggfygwlhe.zoijcleaow(countryAndFlagEmoji, null, draadjrbmkVarBtonecajqb, i17 & 14, 2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: et0.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return agtfadlqog.ppxfxbqfkf(name, country, countryAndFlagEmoji, i13, wkgbmnqykcVar4, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
