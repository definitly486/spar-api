package oe1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import df1.cqumvgiudr;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class btonecajqb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc wkgbmnqykcVar2, cqumvgiudr cqumvgiudrVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, wkgbmnqykcVar2, cqumvgiudrVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc item, final cqumvgiudr sectionsCallbacks, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2015340544);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2015340544, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.order_status.OrderStatusSection (OrderStatusSection.kt:16)");
            }
            if (item instanceof df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(921714887);
                lqeggnwhkg.ppxfxbqfkf(wkgbmnqykcVar, ((df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc.zoijcleaow) item).nufgyqmvbu(), sectionsCallbacks.draadjrbmk(), draadjrbmkVarBtonecajqb, i15 & 14, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (item instanceof df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc.ppxfxbqfkf) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1491368424);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(esjtqupxsv.rgvfuqvkyq(wkgbmnqykcVar, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), 0.0f, 1, null);
                    cf1.zoijcleaow zoijcleaowVarNufgyqmvbu = ((df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc.ppxfxbqfkf) item).nufgyqmvbu();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(921729290);
                    boolean z13 = ((i15 & 112) == 32) | ((i15 & 896) == 256);
                    Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: oe1.nufgyqmvbu
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return btonecajqb.wkgbmnqykc(sectionsCallbacks, item);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    ppxfxbqfkf.ppxfxbqfkf(zoijcleaowVarNufgyqmvbu, wkgbmnqykcVarNufgyqmvbu, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    if (!(item instanceof df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc.C0555wkgbmnqykc)) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(921712599);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        throw new NoWhenBranchMatchedException();
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(921733983);
                    draadjrbmk.zoijcleaow(wkgbmnqykcVar, draadjrbmkVarBtonecajqb, i15 & 14, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: oe1.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.eablkybsjg(wkgbmnqykcVar2, item, sectionsCallbacks, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(cqumvgiudr cqumvgiudrVar, df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc wkgbmnqykcVar) {
        cqumvgiudrVar.draadjrbmk().invoke(((df1.iobyxmoadg.gxszxtbevo.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).nufgyqmvbu().eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
