package ikoacuggdj;

import androidx.compose.foundation.ScrollingLayoutElement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class lrnfpwlwnk {
    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc dxjokdxxww(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, lxfrhoxuzk lxfrhoxuzkVar, boolean z13, jztzpxfvev.hkdspvbjdz hkdspvbjdzVar, boolean z14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        if ((i13 & 4) != 0) {
            hkdspvbjdzVar = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        return nufgyqmvbu(wkgbmnqykcVar, lxfrhoxuzkVar, z13, hkdspvbjdzVar, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lxfrhoxuzk eablkybsjg(int i13) {
        return new lxfrhoxuzk(i13);
    }

    private static final androidx.compose.ui.wkgbmnqykc gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, lxfrhoxuzk lxfrhoxuzkVar, boolean z13, jztzpxfvev.hkdspvbjdz hkdspvbjdzVar, boolean z14, boolean z15, boolean z16, xrmfcynszj xrmfcynszjVar) {
        return androidx.compose.foundation.zdlpuopuiu.iobyxmoadg(wkgbmnqykcVar, lxfrhoxuzkVar, z15 ? jztzpxfvev.jlmebxxoox.Vertical : jztzpxfvev.jlmebxxoox.Horizontal, z14, z13, hkdspvbjdzVar, lxfrhoxuzkVar.vdvldrhtss(), z16, xrmfcynszjVar, (UserVerificationMethods.USER_VERIFY_HANDPRINT & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : null).eablkybsjg(new ScrollingLayoutElement(lxfrhoxuzkVar, z13, z15));
    }

    static /* synthetic */ androidx.compose.ui.wkgbmnqykc lqeggnwhkg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, lxfrhoxuzk lxfrhoxuzkVar, boolean z13, jztzpxfvev.hkdspvbjdz hkdspvbjdzVar, boolean z14, boolean z15, boolean z16, xrmfcynszj xrmfcynszjVar, int i13, Object obj) {
        return gxszxtbevo(wkgbmnqykcVar, lxfrhoxuzkVar, z13, hkdspvbjdzVar, z14, z15, z16, (i13 & 64) != 0 ? null : xrmfcynszjVar);
    }

    public static final androidx.compose.ui.wkgbmnqykc nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, lxfrhoxuzk lxfrhoxuzkVar, boolean z13, jztzpxfvev.hkdspvbjdz hkdspvbjdzVar, boolean z14) {
        return lqeggnwhkg(wkgbmnqykcVar, lxfrhoxuzkVar, z14, hkdspvbjdzVar, z13, true, true, null, 64, null);
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, lxfrhoxuzk lxfrhoxuzkVar, boolean z13, jztzpxfvev.hkdspvbjdz hkdspvbjdzVar, boolean z14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        if ((i13 & 4) != 0) {
            hkdspvbjdzVar = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        return zoijcleaow(wkgbmnqykcVar, lxfrhoxuzkVar, z13, hkdspvbjdzVar, z14);
    }

    public static final lxfrhoxuzk wkgbmnqykc(final int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14, int i15) {
        boolean z13 = true;
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1464256199, i14, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        rhgxfdycjh.jyumaefscl jyumaefsclVarIobyxmoadg = lxfrhoxuzk.f44853dxjokdxxww.iobyxmoadg();
        if ((((i14 & 14) ^ 6) <= 4 || !draadjrbmkVar.ppxfxbqfkf(i13)) && (i14 & 6) != 4) {
            z13 = false;
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ikoacuggdj.weqkydbzbr
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return lrnfpwlwnk.eablkybsjg(i13);
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        lxfrhoxuzk lxfrhoxuzkVar = (lxfrhoxuzk) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarIobyxmoadg, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return lxfrhoxuzkVar;
    }

    public static final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, lxfrhoxuzk lxfrhoxuzkVar, boolean z13, jztzpxfvev.hkdspvbjdz hkdspvbjdzVar, boolean z14) {
        return lqeggnwhkg(wkgbmnqykcVar, lxfrhoxuzkVar, z14, hkdspvbjdzVar, z13, false, true, null, 64, null);
    }
}
