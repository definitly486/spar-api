package ln1;

import android.content.Context;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.i1;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jyumaefscl {

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ComposeView f63686zdlpuopuiu;

        /* JADX INFO: renamed from: ln1.jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1304iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ i1 f63687zdlpuopuiu;

            C1304iobyxmoadg(i1 i1Var) {
                this.f63687zdlpuopuiu = i1Var;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1938058096, i13, -1, "ru.myspar.proloyalty.scan.impl.scan_screen.presentation.drawActionBar.<anonymous>.<anonymous> (ScanScreenViewImpl.kt:67)");
                }
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(esjtqupxsv.oxmwwwfdhm(cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), 0.0f, iobyxmoadg.ppxfxbqfkf(this.f63687zdlpuopuiu).zoijcleaow(), 0.0f, 0.0f, 13, null), draadjrbmkVar, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(ComposeView composeView) {
            this.f63686zdlpuopuiu = composeView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e31.jyumaefscl ppxfxbqfkf(i1 i1Var) {
            return (e31.jyumaefscl) i1Var.getValue();
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            zoijcleaow((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1353129771, i13, -1, "ru.myspar.proloyalty.scan.impl.scan_screen.presentation.drawActionBar.<anonymous> (ScanScreenViewImpl.kt:63)");
            }
            i1 i1VarRgvfuqvkyq = e31.eablkybsjg.rgvfuqvkyq(draadjrbmkVar, 0);
            Context context = this.f63686zdlpuopuiu.getContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            l41.zoijcleaow.zoijcleaow(p41.ppxfxbqfkf.eablkybsjg(context) ? l41.nufgyqmvbu.Dark : l41.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1938058096, true, new C1304iobyxmoadg(i1VarRgvfuqvkyq), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(ComposeView composeView) {
        try {
            composeView.setViewCompositionStrategy(s.zoijcleaow.f7058zoijcleaow);
            composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1353129771, true, new iobyxmoadg(composeView)));
        } catch (Throwable unused) {
        }
    }
}
