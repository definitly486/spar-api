package l41;

import androidx.compose.runtime.a;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.b;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.lmojexxdyd;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final a f61582iobyxmoadg = lmojexxdyd.btonecajqb(new tg.iobyxmoadg() { // from class: l41.eablkybsjg
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return lqeggnwhkg.eablkybsjg();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final a f61583zoijcleaow = lmojexxdyd.btonecajqb(new tg.iobyxmoadg() { // from class: l41.gxszxtbevo
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return lqeggnwhkg.wkgbmnqykc();
        }
    });

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f61584zdlpuopuiu;

        iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f61584zdlpuopuiu = rgvfuqvkyqVar;
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
                jyumaefscl.ntlheqmsrt(-779985160, i13, -1, "ru.myspar.proloyalty.core.ui.compose.design_system.presentation.ProvideDesignSystem.<anonymous> (ThemeProvider.kt:26)");
            }
            this.f61584zdlpuopuiu.invoke(draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final a dxjokdxxww() {
        return f61582iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j41.zoijcleaow eablkybsjg() {
        throw new IllegalStateException("CompositionLocal LocalExtraColor not present");
    }

    public static final void gxszxtbevo(final i41.iobyxmoadg customTheme, final rgvfuqvkyq content, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(customTheme, "customTheme");
        zdlpuopuiu.btonecajqb(content, "content");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1952572488);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(customTheme) ? 4 : 2) | i13;
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
                jyumaefscl.ntlheqmsrt(-1952572488, i14, -1, "ru.myspar.proloyalty.core.ui.compose.design_system.presentation.ProvideDesignSystem (ThemeProvider.kt:21)");
            }
            lmojexxdyd.wkgbmnqykc(new b[]{f61582iobyxmoadg.wkgbmnqykc(customTheme.zoijcleaow()), f61583zoijcleaow.wkgbmnqykc(customTheme.ppxfxbqfkf())}, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-779985160, true, new iobyxmoadg(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, b.f5523dxjokdxxww | 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: l41.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.lqeggnwhkg(customTheme, content, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(i41.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        gxszxtbevo(iobyxmoadgVar, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final a nufgyqmvbu() {
        return f61583zoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k41.zoijcleaow wkgbmnqykc() {
        throw new IllegalStateException("CompositionLocal ExtraTypes not present");
    }
}
