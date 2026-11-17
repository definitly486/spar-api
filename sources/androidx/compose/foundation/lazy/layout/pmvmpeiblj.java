package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class pmvmpeiblj {

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f5100jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f5101yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ zynmafqrjb f5102zdlpuopuiu;

        iobyxmoadg(zynmafqrjb zynmafqrjbVar, int i13, Object obj) {
            this.f5102zdlpuopuiu = zynmafqrjbVar;
            this.f5101yggfygwlhe = i13;
            this.f5100jyumaefscl = obj;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(980966366, i13, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            this.f5102zdlpuopuiu.nufgyqmvbu(this.f5101yggfygwlhe, this.f5100jyumaefscl, draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(zynmafqrjb zynmafqrjbVar, Object obj, int i13, Object obj2, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(zynmafqrjbVar, obj, i13, obj2, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(final zynmafqrjb zynmafqrjbVar, final Object obj, final int i13, final Object obj2, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1439843069);
        if ((i14 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(zynmafqrjbVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(obj) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(obj2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i15 & 1171) != 1170, i15 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1439843069, i15, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((rhgxfdycjh.lqeggnwhkg) obj).gxszxtbevo(obj2, ezmngbhpjk.nufgyqmvbu.eablkybsjg(980966366, true, new iobyxmoadg(zynmafqrjbVar, i13, obj2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: androidx.compose.foundation.lazy.layout.lereixgezr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj3, Object obj4) {
                    return pmvmpeiblj.ppxfxbqfkf(zynmafqrjbVar, obj, i13, obj2, i14, (androidx.compose.runtime.draadjrbmk) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }
}
