package y80;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(tg.iobyxmoadg iobyxmoadgVar, boolean z13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(iobyxmoadgVar, z13, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(final tg.iobyxmoadg onRefreshClick, final boolean z13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean z14;
        boolean z15;
        Object objYadqdtsiqt;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(onRefreshClick, "onRefreshClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1814909561);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(onRefreshClick) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1814909561, i15, -1, "ru.myspar.dynamic_qr.impl.presentation.compose.qrcode.unavailable.RefreshButton (RefreshButton.kt:31)");
                }
                float f13 = 8;
                ydmasvzmpa ydmasvzmpaVarGxszxtbevo = esjtqupxsv.gxszxtbevo(nufgyqmvbu.lqeggnwhkg(f13), nufgyqmvbu.lqeggnwhkg(f13));
                draadjrbmkVarBtonecajqb.sopmlzcsov(-624742574);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | ((i15 & 14) == 4);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: y80.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.wkgbmnqykc(z13, onRefreshClick);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                a50.wkgbmnqykc.eablkybsjg((tg.iobyxmoadg) objYadqdtsiqt, wkgbmnqykcVar3, false, z13, null, null, ydmasvzmpaVarGxszxtbevo, iobyxmoadg.f124072iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 112) | 14155776 | ((i15 << 6) & 7168), 52);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: y80.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lqeggnwhkg.eablkybsjg(onRefreshClick, z13, wkgbmnqykcVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 147) == 146) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1814909561, i15, -1, "ru.myspar.dynamic_qr.impl.presentation.compose.qrcode.unavailable.RefreshButton (RefreshButton.kt:31)");
            }
            float f14 = 8;
            ydmasvzmpa ydmasvzmpaVarGxszxtbevo2 = esjtqupxsv.gxszxtbevo(nufgyqmvbu.lqeggnwhkg(f14), nufgyqmvbu.lqeggnwhkg(f14));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-624742574);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | ((i15 & 14) == 4);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: y80.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.wkgbmnqykc(z13, onRefreshClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: y80.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.wkgbmnqykc(z13, onRefreshClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            a50.wkgbmnqykc.eablkybsjg((tg.iobyxmoadg) objYadqdtsiqt, wkgbmnqykcVar3, false, z13, null, null, ydmasvzmpaVarGxszxtbevo2, iobyxmoadg.f124072iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 112) | 14155776 | ((i15 << 6) & 7168), 52);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1814909561, i15, -1, "ru.myspar.dynamic_qr.impl.presentation.compose.qrcode.unavailable.RefreshButton (RefreshButton.kt:31)");
            }
            float f15 = 8;
            ydmasvzmpa ydmasvzmpaVarGxszxtbevo3 = esjtqupxsv.gxszxtbevo(nufgyqmvbu.lqeggnwhkg(f15), nufgyqmvbu.lqeggnwhkg(f15));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-624742574);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | ((i15 & 14) == 4);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: y80.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.wkgbmnqykc(z13, onRefreshClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: y80.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.wkgbmnqykc(z13, onRefreshClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            a50.wkgbmnqykc.eablkybsjg((tg.iobyxmoadg) objYadqdtsiqt, wkgbmnqykcVar3, false, z13, null, null, ydmasvzmpaVarGxszxtbevo3, iobyxmoadg.f124072iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 112) | 14155776 | ((i15 << 6) & 7168), 52);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: y80.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.eablkybsjg(onRefreshClick, z13, wkgbmnqykcVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
        if (!z13) {
            iobyxmoadgVar.invoke();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
