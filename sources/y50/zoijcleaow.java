package y50;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import igdgnonuha.b0;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f123932yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f123933zdlpuopuiu;

        iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, rgvfuqvkyq rgvfuqvkyqVar) {
            this.f123933zdlpuopuiu = nufgyqmvbuVar;
            this.f123932yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-394799309, i13, -1, "ru.myspar.core.ui.compose.design_system.presentation.DesignSystem.<anonymous> (DesignSystem.kt:15)");
            }
            lqeggnwhkg.gxszxtbevo(this.f123933zdlpuopuiu.wkgbmnqykc(), this.f123932yggfygwlhe, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(nufgyqmvbuVar, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final nufgyqmvbu theme, final rgvfuqvkyq content, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(theme, "theme");
        zdlpuopuiu.btonecajqb(content, "content");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-533526649);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(theme) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(content) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-533526649, i14, -1, "ru.myspar.core.ui.compose.design_system.presentation.DesignSystem (DesignSystem.kt:10)");
            }
            b0.zoijcleaow(theme.wkgbmnqykc().iobyxmoadg(), x50.wkgbmnqykc.iobyxmoadg(theme.wkgbmnqykc().ppxfxbqfkf().zoijcleaow()), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-394799309, true, new iobyxmoadg(theme, content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 4);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: y50.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(theme, content, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
