package e72;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import o72.Splash;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f30846iobyxmoadg;

        static {
            int[] iArr = new int[Splash.ppxfxbqfkf.values().length];
            try {
                iArr[Splash.ppxfxbqfkf.LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Splash.ppxfxbqfkf.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30846iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(Splash splash, boolean z13, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        eablkybsjg(splash, z13, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(final Splash splash, final boolean z13, final tg.iobyxmoadg onAnimationFinish, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        boolean z14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAnimationFinish, "onAnimationFinish");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1613071927);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(splash) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onAnimationFinish) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1613071927, i14, -1, "ru.myspar.splash.compose.SplashScreenContent (SplashScreenContent.kt:16)");
            }
            Splash.ppxfxbqfkf type = splash != null ? splash.getType() : null;
            int i15 = type == null ? -1 : iobyxmoadg.f30846iobyxmoadg[type.ordinal()];
            if (i15 != -1) {
                if (i15 == 1) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(497959342);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                    m7.gtknphoqwx gtknphoqwxVarOxmwwwfdhm = m7.ojitshcjhn.oxmwwwfdhm(m7.wflxmlrfwp.iobyxmoadg.iobyxmoadg(m7.wflxmlrfwp.iobyxmoadg.zoijcleaow(splash.getFilePath())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(497966275);
                    z14 = (i14 & 896) == 256;
                    Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: e72.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return eablkybsjg.gxszxtbevo(onAnimationFinish);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb = draadjrbmkVarBtonecajqb;
                    vdvldrhtss.eablkybsjg(wkgbmnqykcVarGxszxtbevo, gtknphoqwxVarOxmwwwfdhm, z13, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i14 << 3) & 896) | 6, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    if (i15 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(497958254);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        throw new NoWhenBranchMatchedException();
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(497968444);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(497973827);
                    z14 = (i14 & 896) == 256;
                    Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z14 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: e72.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return eablkybsjg.lqeggnwhkg(onAnimationFinish);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    int i16 = i14 << 3;
                    zdlpuopuiu.ppxfxbqfkf(wkgbmnqykcVarGxszxtbevo2, splash, z13, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i16 & 112) | 6 | (i16 & 896), 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(497975701);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                m7.gtknphoqwx gtknphoqwxVarOxmwwwfdhm2 = m7.ojitshcjhn.oxmwwwfdhm(m7.wflxmlrfwp.zoijcleaow.iobyxmoadg(m7.wflxmlrfwp.zoijcleaow.zoijcleaow(d72.iobyxmoadg.lottie_default)), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                draadjrbmkVarBtonecajqb.sopmlzcsov(497982851);
                z14 = (i14 & 896) == 256;
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: e72.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return eablkybsjg.nufgyqmvbu(onAnimationFinish);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                vdvldrhtss.eablkybsjg(wkgbmnqykcVarGxszxtbevo3, gtknphoqwxVarOxmwwwfdhm2, z13, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVar2, ((i14 << 3) & 896) | 6, 0);
                draadjrbmkVar2.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: e72.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.dxjokdxxww(splash, z13, onAnimationFinish, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
