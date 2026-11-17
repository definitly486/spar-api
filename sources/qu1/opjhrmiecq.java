package qu1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.tbqsvytpvh;

/* JADX INFO: loaded from: classes6.dex */
public abstract class opjhrmiecq {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f80790yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ boolean f80791zdlpuopuiu;

        iobyxmoadg(boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f80791zdlpuopuiu = z13;
            this.f80790yggfygwlhe = iobyxmoadgVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((tbqsvytpvh) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(tbqsvytpvh ActionBar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ActionBar, "$this$ActionBar");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1238111563, i13, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.SubscriptionDetailTopBar.<anonymous> (SubscriptionDetailTopBar.kt:21)");
            }
            if (this.f80791zdlpuopuiu) {
                n31.zoijcleaow.zoijcleaow(b31.gxszxtbevo.ic_settings, this.f80790yggfygwlhe, null, false, 0L, draadjrbmkVar, 0, 28);
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, tg.iobyxmoadg iobyxmoadgVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar2, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, str, iobyxmoadgVar, z13, iobyxmoadgVar2, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String title, final tg.iobyxmoadg onBtnBackClick, final boolean z13, final tg.iobyxmoadg onBtnSettingsClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBtnBackClick, "onBtnBackClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBtnSettingsClick, "onBtnSettingsClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1079386296);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(title) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onBtnBackClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onBtnSettingsClick) ? 16384 : 8192;
        }
        if ((i15 & 9363) == 9362 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1079386296, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.SubscriptionDetailTopBar (SubscriptionDetailTopBar.kt:15)");
            }
            e31.eablkybsjg.nufgyqmvbu(wkgbmnqykcVar4, title, null, false, onBtnBackClick, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1238111563, true, new iobyxmoadg(z13, onBtnSettingsClick), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (i15 & 14) | 12582912 | (i15 & 112) | (57344 & (i15 << 6)), 108);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.bfopjjpdmp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return opjhrmiecq.ppxfxbqfkf(wkgbmnqykcVar3, title, onBtnBackClick, z13, onBtnSettingsClick, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
