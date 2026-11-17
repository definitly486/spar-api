package lr;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import gg.wwaezpbzkn;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import metgxyhuhe.gtknphoqwx;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dxjokdxxww {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(tbqsvytpvh tbqsvytpvhVar, int i13, long j13, long j14, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i14, int i15, draadjrbmk draadjrbmkVar, int i16) {
        zoijcleaow(tbqsvytpvhVar, i13, j13, j14, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0225  */
    /* JADX WARN: Code duplicated, block: B:103:0x0233  */
    /* JADX WARN: Code duplicated, block: B:106:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:85:0x0184  */
    /* JADX WARN: Code duplicated, block: B:86:0x0188  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x0202  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206  */
    public static final void zoijcleaow(final tbqsvytpvh SortButton, final int i13, final long j13, final long j14, final tg.iobyxmoadg onClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i17;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        Object objYadqdtsiqt;
        draadjrbmk draadjrbmkVar2;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int iHashCode2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        draadjrbmk draadjrbmkVarIobyxmoadg2;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(SortButton, "$this$SortButton");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-870491471);
        if ((i15 & Integer.MIN_VALUE) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(SortButton) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 1) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        if ((i15 & 2) != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 4) != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.wkgbmnqykc(j14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 8) != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 16384 : 8192;
        }
        int i18 = i15 & 16;
        if (i18 == 0) {
            if ((196608 & i14) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 131072 : 65536;
            }
            i17 = i16;
            if ((74899 & i17) == 74898 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-870491471, i17, -1, "ru.myspar.catalog.impl.product_list.presentation.compose.components.filters.SortButton (SortButton.kt:38)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.eablkybsjg.iobyxmoadg(tbqsvytpvh.zoijcleaow(SortButton, cdpycssgdh.wkgbmnqykc(wkgbmnqykcVar3, 0.0f, 1, null), 1.0f, false, 2, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(12))), j14, null, 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-133694622);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                metgxyhuhe.draadjrbmk draadjrbmkVar3 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarWkgbmnqykc, draadjrbmkVar3, null, false, null, null, onClick, 28, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar2.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarGxszxtbevo);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVar2.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar2.pkzmftpjix();
                if (draadjrbmkVar2.lqeggnwhkg()) {
                    draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVar2.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar2);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), iobyxmoadgVar.dxjokdxxww(), draadjrbmkVar2, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar2.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, iobyxmoadgVar3);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVar2.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar2.pkzmftpjix();
                if (draadjrbmkVar2.lqeggnwhkg()) {
                    draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVar2.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar2);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
                roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
                String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(i13, draadjrbmkVar2, (i17 >> 3) & 14);
                z zVar = z.f44180iobyxmoadg;
                int i19 = z.f44181zoijcleaow;
                w6.btonecajqb(strPpxfxbqfkf, null, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVar2, i19).zoijcleaow().zoijcleaow(), draadjrbmkVar2, 0, 0, 65530);
                i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVar2, 6);
                t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_arrow_up_down, draadjrbmkVar2, 0), null, null, j13, draadjrbmkVar2, ((i17 << 3) & 7168) | 48, 4);
                draadjrbmkVar2.cqumvgiudr();
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lr.nufgyqmvbu
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return dxjokdxxww.ppxfxbqfkf(SortButton, i13, j13, j14, onClick, wkgbmnqykcVar4, i14, i15, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 196608;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i17 = i16;
        if ((74899 & i17) == 74898) {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-870491471, i17, -1, "ru.myspar.catalog.impl.product_list.presentation.compose.components.filters.SortButton (SortButton.kt:38)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc2 = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.eablkybsjg.iobyxmoadg(tbqsvytpvh.zoijcleaow(SortButton, cdpycssgdh.wkgbmnqykc(wkgbmnqykcVar3, 0.0f, 1, null), 1.0f, false, 2, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(12))), j14, null, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-133694622);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar4 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarWkgbmnqykc2, draadjrbmkVar4, null, false, null, null, onClick, 28, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar4 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar4.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarGxszxtbevo2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar5.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f4892iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow2 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), iobyxmoadgVar4.dxjokdxxww(), draadjrbmkVar2, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, iobyxmoadgVar6);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar5.wkgbmnqykc());
            roivzttewh roivzttewhVar2 = roivzttewh.f26469iobyxmoadg;
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(i13, draadjrbmkVar2, (i17 >> 3) & 14);
            z zVar2 = z.f44180iobyxmoadg;
            int i110 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf2, null, y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVar2, i110).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVar2, i110).zoijcleaow().zoijcleaow(), draadjrbmkVar2, 0, 0, 65530);
            i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVar2, 6);
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_arrow_up_down, draadjrbmkVar2, 0), null, null, j13, draadjrbmkVar2, ((i17 << 3) & 7168) | 48, 4);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar6;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-870491471, i17, -1, "ru.myspar.catalog.impl.product_list.presentation.compose.components.filters.SortButton (SortButton.kt:38)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc3 = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.eablkybsjg.iobyxmoadg(tbqsvytpvh.zoijcleaow(SortButton, cdpycssgdh.wkgbmnqykc(wkgbmnqykcVar3, 0.0f, 1, null), 1.0f, false, 2, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(12))), j14, null, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-133694622);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar5 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarWkgbmnqykc3, draadjrbmkVar5, null, false, null, null, onClick, 28, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar7 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar7.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarGxszxtbevo3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar8 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar8.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar8.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwp.f4892iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar9 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow3 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), iobyxmoadgVar7.dxjokdxxww(), draadjrbmkVar2, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, iobyxmoadgVar9);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar8.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow3, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar8.wkgbmnqykc());
            roivzttewh roivzttewhVar3 = roivzttewh.f26469iobyxmoadg;
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(i13, draadjrbmkVar2, (i17 >> 3) & 14);
            z zVar3 = z.f44180iobyxmoadg;
            int i111 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf3, null, y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVar2, i111).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVar2, i111).zoijcleaow().zoijcleaow(), draadjrbmkVar2, 0, 0, 65530);
            i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVar2, 6);
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_arrow_up_down, draadjrbmkVar2, 0), null, null, j13, draadjrbmkVar2, ((i17 << 3) & 7168) | 48, 4);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar7;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lr.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return dxjokdxxww.ppxfxbqfkf(SortButton, i13, j13, j14, onClick, wkgbmnqykcVar4, i14, i15, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
