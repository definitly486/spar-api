package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class ulzqkzuiru {

    public static final class iobyxmoadg implements androidx.compose.runtime.ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tzroggbefp f5140iobyxmoadg;

        public iobyxmoadg(tzroggbefp tzroggbefpVar) {
            this.f5140iobyxmoadg = tzroggbefpVar;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            this.f5140iobyxmoadg.wkgbmnqykc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(Object obj, int i13, sopmlzcsov sopmlzcsovVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(obj, i13, sopmlzcsovVar, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final Object obj, final int i13, final sopmlzcsov sopmlzcsovVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(872548579);
        if ((i14 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(sopmlzcsovVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i15 & 1171) != 1170, i15 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(872548579, i15, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(obj) | draadjrbmkVarBtonecajqb.ulzqkzuiru(sopmlzcsovVar);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tzroggbefp(obj, sopmlzcsovVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final tzroggbefp tzroggbefpVar = (tzroggbefp) objYadqdtsiqt;
            tzroggbefpVar.eablkybsjg(i13);
            tzroggbefpVar.gxszxtbevo((x.hcddaimhww) draadjrbmkVarBtonecajqb.ojitshcjhn(x.jpowsppfya.iobyxmoadg()));
            boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(tzroggbefpVar);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.mbcevpiqjq
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return ulzqkzuiru.wkgbmnqykc(tzroggbefpVar, (androidx.compose.runtime.ulzqkzuiru) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            androidx.compose.runtime.jlmebxxoox.zoijcleaow(tzroggbefpVar, (tg.draadjrbmk) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.runtime.lmojexxdyd.ppxfxbqfkf(x.jpowsppfya.iobyxmoadg().wkgbmnqykc(tzroggbefpVar), rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 112) | b.f5523dxjokdxxww);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: androidx.compose.foundation.lazy.layout.ntlheqmsrt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return ulzqkzuiru.eablkybsjg(obj, i13, sopmlzcsovVar, rgvfuqvkyqVar, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.ntlheqmsrt wkgbmnqykc(tzroggbefp tzroggbefpVar, androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
        return new iobyxmoadg(tzroggbefpVar);
    }
}
