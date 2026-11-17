package ad1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dxjokdxxww {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f1578yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f1579zdlpuopuiu;

        iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f1579zdlpuopuiu = iobyxmoadgVar;
            this.f1578yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((ribwqtqdhb.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ribwqtqdhb.wkgbmnqykc AnimatedVisibility, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(AnimatedVisibility, "$this$AnimatedVisibility");
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-996510818, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.snackbar.MySparConnectionSnackbar.<anonymous> (MySparConnectionSnackbar.kt:33)");
            }
            float f13 = 16;
            yadqdtsiqt.zoijcleaow(dxjokdxxww.wflxmlrfwp(androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 7, null), this.f1579zdlpuopuiu, this.f1578yggfygwlhe, draadjrbmkVar, 6), lr0.eablkybsjg.gxszxtbevo.Fatal, null, e0.gxszxtbevo.ppxfxbqfkf(b31.wflxmlrfwp.proloyalty_check_internet_connection, draadjrbmkVar, 0), null, ad1.iobyxmoadg.f1580iobyxmoadg.iobyxmoadg(), null, draadjrbmkVar, 196656, 84);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int btonecajqb(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dxjokdxxww(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(boolean z13, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        gxszxtbevo(z13, draadjrbmkVar, iobyxmoadgVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gxszxtbevo(final boolean z13, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-2109230906);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(658515106);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ad1.wkgbmnqykc
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return dxjokdxxww.lqeggnwhkg(((Boolean) obj).booleanValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(658516130);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ad1.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return dxjokdxxww.nufgyqmvbu();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2109230906, i15, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.snackbar.MySparConnectionSnackbar (MySparConnectionSnackbar.kt:27)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(658519719);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt3 == iobyxmoadgVar2.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ad1.gxszxtbevo
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(dxjokdxxww.dxjokdxxww(((Integer) obj).intValue()));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.animation.wkgbmnqykc wkgbmnqykcVarYadqdtsiqt = androidx.compose.animation.zoijcleaow.yadqdtsiqt(null, (tg.draadjrbmk) objYadqdtsiqt3, 1, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(658521639);
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == iobyxmoadgVar2.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: ad1.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(dxjokdxxww.btonecajqb(((Integer) obj).intValue()));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z13, null, wkgbmnqykcVarYadqdtsiqt, androidx.compose.animation.zoijcleaow.wwaezpbzkn(null, (tg.draadjrbmk) objYadqdtsiqt4, 1, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-996510818, true, new iobyxmoadg(iobyxmoadgVar, draadjrbmkVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (i15 & 14) | 200064, 18);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        final tg.draadjrbmk draadjrbmkVar3 = draadjrbmkVar;
        final tg.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ad1.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return dxjokdxxww.gtknphoqwx(z13, draadjrbmkVar3, iobyxmoadgVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(boolean z13) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.wkgbmnqykc wflxmlrfwp(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13) {
        draadjrbmkVar2.sopmlzcsov(-964520031);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-964520031, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.snackbar.debugSwipeToDismiss (MySparConnectionSnackbar.kt:55)");
        }
        if (uw0.ppxfxbqfkf.f114521iobyxmoadg.kcexrzcfyt()) {
            wkgbmnqykcVar = bd1.ppxfxbqfkf.gxszxtbevo(wkgbmnqykcVar, draadjrbmkVar, iobyxmoadgVar, 0.0f, draadjrbmkVar2, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 << 3) & 896), 4);
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar2.stevsuqkhv();
        return wkgbmnqykcVar;
    }
}
