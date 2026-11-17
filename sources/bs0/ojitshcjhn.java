package bs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.wwaezpbzkn;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ojitshcjhn {
    public static final void eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String title, final String description, final boolean z13, final int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-810507861);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i14 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i14;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(title) ? 32 : 16;
        }
        if ((i15 & 4) != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(description) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 16) != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 16384 : 8192;
        }
        if ((i16 & 9363) == 9362 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-810507861, i16, -1, "ru.myspar.proloyalty.common.view.addressbar.MySparAddressBarText (MySparAddressBarText.kt:31)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarDxjokdxxww = cdpycssgdh.dxjokdxxww(wkgbmnqykcVar2, w0.nufgyqmvbu.lqeggnwhkg(40));
            czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarGxszxtbevo = eablkybsjgVar.gxszxtbevo();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(gxszxtbevoVarGxszxtbevo, iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarDxjokdxxww);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, 0.0f, 1, null);
            if (kcexrzcfyt.zfvoamnweg(description)) {
                wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.wkgbmnqykc(wkgbmnqykcVarNufgyqmvbu, 0.0f, 1, null);
            }
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), iobyxmoadgVar.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(roivzttewh.f26469iobyxmoadg.iobyxmoadg(iobyxmoadgVar3, 1.0f, false), "mySparAddressBarTitle", null, null, false, 14, null);
            z zVar = z.f44180iobyxmoadg;
            int i18 = z.f44181zoijcleaow;
            n nVarOjitshcjhn = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).zoijcleaow().ojitshcjhn();
            long jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk();
            v0.jyumaefscl.iobyxmoadg iobyxmoadgVar4 = v0.jyumaefscl.f114986iobyxmoadg;
            int i19 = i16;
            int i23 = i19 >> 3;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
            w6.btonecajqb(title, wkgbmnqykcVarOjitshcjhn, jIwizpuwonk, 0L, null, null, null, 0L, null, null, 0L, iobyxmoadgVar4.zoijcleaow(), false, i13, 0, null, nVarOjitshcjhn, draadjrbmkVarBtonecajqb, i23 & 14, (i23 & 7168) | 48, 55288);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1022293376);
            if (z13) {
                t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVarBtonecajqb, 6);
                ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            draadjrbmkVarBtonecajqb.sopmlzcsov(89698011);
            if (kcexrzcfyt.zfvoamnweg(description)) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(description, w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar3, "mySparAddressBarDescription", null, null, false, 14, null), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, iobyxmoadgVar4.zoijcleaow(), false, 1, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).zoijcleaow().zoijcleaow(), draadjrbmkVar2, (i19 >> 6) & 14, 3120, 55288);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bs0.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.gxszxtbevo(wkgbmnqykcVar3, title, description, z13, i13, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, String str2, boolean z13, int i13, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        eablkybsjg(wkgbmnqykcVar, str, str2, z13, i13, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void ppxfxbqfkf(androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1559505502);
        if (i13 == 0 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1559505502, i13, -1, "ru.myspar.proloyalty.common.view.addressbar.AddressTitleTrailingIcon (MySparAddressBarText.kt:71)");
            }
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.ic_arrow_right_grey, draadjrbmkVarBtonecajqb, 0), null, w31.nufgyqmvbu.ojitshcjhn(cdpycssgdh.vdvldrhtss(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(16)), "mySparAddressBarTitleTrailingIcon", null, null, false, 14, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).lereixgezr(), draadjrbmkVarBtonecajqb, 48, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bs0.agtfadlqog
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.wkgbmnqykc(i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkf(draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
