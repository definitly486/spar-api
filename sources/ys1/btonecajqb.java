package ys1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.wwaezpbzkn;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import igdgnonuha.z;
import it1.Splash;
import vipkmwdibw.fmlbqenlif;
import vipkmwdibw.lmojexxdyd;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class btonecajqb {
    private static final void btonecajqb(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    private static final float draadjrbmk(i1 i1Var) {
        return ((Number) i1Var.getValue()).floatValue();
    }

    private static final boolean dxjokdxxww(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:103:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x0252  */
    /* JADX WARN: Code duplicated, block: B:110:0x025e  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:86:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4  */
    public static final void eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final Splash splash, final boolean z13, final String str, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        tg.draadjrbmk draadjrbmkVar3;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final tg.draadjrbmk draadjrbmkVar4;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        final iwxlajgraz iwxlajgrazVar;
        float f13;
        boolean z14;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt2;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        Object objYadqdtsiqt3;
        final tg.draadjrbmk draadjrbmkVar5;
        Object objYadqdtsiqt4;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-382304089);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(splash) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3) ? 16384 : 8192;
            }
            i16 = i15;
            if ((i16 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1924719788);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: ys1.gxszxtbevo
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return btonecajqb.gxszxtbevo((Splash) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt4;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-382304089, i16, -1, "ru.myspar.proloyalty.splash.compose.SplashScreen (SplashScreen.kt:31)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1924720779);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                if (dxjokdxxww(iwxlajgrazVar)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                fmlbqenlif fmlbqenlifVarDraadjrbmk = vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1924729831);
                if ((57344 & i16) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zLmojexxdyd = z14 | draadjrbmkVarBtonecajqb.lmojexxdyd(splash);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ys1.lqeggnwhkg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return btonecajqb.gtknphoqwx(draadjrbmkVar4, splash, ((Float) obj).floatValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar6 = draadjrbmkVar4;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.iobyxmoadg.iobyxmoadg(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), draadjrbmk(vipkmwdibw.eablkybsjg.eablkybsjg(f13, fmlbqenlifVarDraadjrbmk, 0.0f, "animationSplashScreenVisible", (tg.draadjrbmk) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 3072, 4))), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), null, 2, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarWkgbmnqykc);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(1444964894);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: ys1.nufgyqmvbu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return btonecajqb.lqeggnwhkg(iwxlajgrazVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                int i19 = i16 >> 3;
                eablkybsjg.eablkybsjg(splash, z13, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, (i19 & 112) | (i19 & 14) | 384);
                draadjrbmk.zoijcleaow(esjtqupxsv.oxmwwwfdhm(wflxmlrfwpVar.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, iobyxmoadgVar2.wflxmlrfwp()), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(120), 0.0f, 0.0f, 13, null), str, draadjrbmkVarBtonecajqb, (i16 >> 6) & 112, 0);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                draadjrbmkVar5 = draadjrbmkVar6;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar5 = draadjrbmkVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ys1.dxjokdxxww
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return btonecajqb.nufgyqmvbu(wkgbmnqykcVar4, splash, z13, str, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        draadjrbmkVar3 = draadjrbmkVar;
        i16 = i15;
        if ((i16 & 9363) == 9362) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1924719788);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: ys1.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return btonecajqb.gxszxtbevo((Splash) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt4;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-382304089, i16, -1, "ru.myspar.proloyalty.splash.compose.SplashScreen (SplashScreen.kt:31)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1924720779);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (dxjokdxxww(iwxlajgrazVar)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fmlbqenlif fmlbqenlifVarDraadjrbmk2 = vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1924729831);
            if ((57344 & i16) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            zLmojexxdyd = z14 | draadjrbmkVarBtonecajqb.lmojexxdyd(splash);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ys1.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.gtknphoqwx(draadjrbmkVar4, splash, ((Float) obj).floatValue());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ys1.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.gtknphoqwx(draadjrbmkVar4, splash, ((Float) obj).floatValue());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar7 = draadjrbmkVar4;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc2 = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.iobyxmoadg.iobyxmoadg(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), draadjrbmk(vipkmwdibw.eablkybsjg.eablkybsjg(f13, fmlbqenlifVarDraadjrbmk2, 0.0f, "animationSplashScreenVisible", (tg.draadjrbmk) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 3072, 4))), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), null, 2, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar4 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar4.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarWkgbmnqykc2);
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
            draadjrbmkVarBtonecajqb.sopmlzcsov(1444964894);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: ys1.nufgyqmvbu
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return btonecajqb.lqeggnwhkg(iwxlajgrazVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i110 = i16 >> 3;
            eablkybsjg.eablkybsjg(splash, z13, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, (i110 & 112) | (i110 & 14) | 384);
            draadjrbmk.zoijcleaow(esjtqupxsv.oxmwwwfdhm(wflxmlrfwpVar2.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, iobyxmoadgVar4.wflxmlrfwp()), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(120), 0.0f, 0.0f, 13, null), str, draadjrbmkVarBtonecajqb, (i16 >> 6) & 112, 0);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            draadjrbmkVar5 = draadjrbmkVar7;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1924719788);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: ys1.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return btonecajqb.gxszxtbevo((Splash) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt4;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-382304089, i16, -1, "ru.myspar.proloyalty.splash.compose.SplashScreen (SplashScreen.kt:31)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1924720779);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (dxjokdxxww(iwxlajgrazVar)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fmlbqenlif fmlbqenlifVarDraadjrbmk3 = vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1924729831);
            if ((57344 & i16) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            zLmojexxdyd = z14 | draadjrbmkVarBtonecajqb.lmojexxdyd(splash);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ys1.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.gtknphoqwx(draadjrbmkVar4, splash, ((Float) obj).floatValue());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ys1.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.gtknphoqwx(draadjrbmkVar4, splash, ((Float) obj).floatValue());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar8 = draadjrbmkVar4;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc3 = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.iobyxmoadg.iobyxmoadg(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), draadjrbmk(vipkmwdibw.eablkybsjg.eablkybsjg(f13, fmlbqenlifVarDraadjrbmk3, 0.0f, "animationSplashScreenVisible", (tg.draadjrbmk) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 3072, 4))), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), null, 2, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar6 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar6.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarWkgbmnqykc3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar7 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar7.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar7.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar7.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar7.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar7.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(1444964894);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: ys1.nufgyqmvbu
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return btonecajqb.lqeggnwhkg(iwxlajgrazVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i111 = i16 >> 3;
            eablkybsjg.eablkybsjg(splash, z13, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, (i111 & 112) | (i111 & 14) | 384);
            draadjrbmk.zoijcleaow(esjtqupxsv.oxmwwwfdhm(wflxmlrfwpVar3.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, iobyxmoadgVar6.wflxmlrfwp()), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(120), 0.0f, 0.0f, 13, null), str, draadjrbmkVarBtonecajqb, (i16 >> 6) & 112, 0);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            draadjrbmkVar5 = draadjrbmkVar8;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ys1.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.nufgyqmvbu(wkgbmnqykcVar5, splash, z13, str, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, Splash splash, float f13) {
        draadjrbmkVar.invoke(splash);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(Splash splash) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(iwxlajgraz iwxlajgrazVar) {
        btonecajqb(iwxlajgrazVar, false);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, Splash splash, boolean z13, String str, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(wkgbmnqykcVar, splash, z13, str, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
