package md0;

import android.content.Context;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.i1;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import gg.wwaezpbzkn;
import v40.cqumvgiudr;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jyumaefscl {

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ComposeView f66852zdlpuopuiu;

        /* JADX INFO: renamed from: md0.jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1381iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ i1 f66853zdlpuopuiu;

            C1381iobyxmoadg(i1 i1Var) {
                this.f66853zdlpuopuiu = i1Var;
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
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2020118282, i13, -1, "ru.myspar.legacy.presentation.screen.scanproduct.drawActionBar.<anonymous>.<anonymous> (ScanProductViewImpl.kt:61)");
                }
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(esjtqupxsv.oxmwwwfdhm(cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), 0.0f, iobyxmoadg.ppxfxbqfkf(this.f66853zdlpuopuiu).zoijcleaow(), 0.0f, 0.0f, 13, null), draadjrbmkVar, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(ComposeView composeView) {
            this.f66852zdlpuopuiu = composeView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cqumvgiudr ppxfxbqfkf(i1 i1Var) {
            return (cqumvgiudr) i1Var.getValue();
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1389251825, i13, -1, "ru.myspar.legacy.presentation.screen.scanproduct.drawActionBar.<anonymous> (ScanProductViewImpl.kt:57)");
            }
            i1 i1VarRgvfuqvkyq = v40.eablkybsjg.rgvfuqvkyq(draadjrbmkVar, 0);
            Context context = this.f66852zdlpuopuiu.getContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            y50.zoijcleaow.zoijcleaow(c60.zoijcleaow.eablkybsjg(context) ? y50.nufgyqmvbu.Dark : y50.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-2020118282, true, new C1381iobyxmoadg(i1VarRgvfuqvkyq), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(ComposeView composeView) {
        try {
            composeView.setViewCompositionStrategy(s.zoijcleaow.f7058zoijcleaow);
            composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1389251825, true, new iobyxmoadg(composeView)));
        } catch (Throwable unused) {
        }
    }
}
