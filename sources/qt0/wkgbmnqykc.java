package qt0;

import android.content.Context;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import l41.nufgyqmvbu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f80632jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f80633yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ComposeView f80634zdlpuopuiu;

        /* JADX INFO: renamed from: qt0.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1789iobyxmoadg implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f80635yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ int f80636zdlpuopuiu;

            C1789iobyxmoadg(int i13, draadjrbmk draadjrbmkVar) {
                this.f80636zdlpuopuiu = i13;
                this.f80635yggfygwlhe = draadjrbmkVar;
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
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1078235940, i13, -1, "ru.myspar.proloyalty.common.view.rate.drawRatingBarView.<anonymous>.<anonymous> (RatingBarView.kt:18)");
                }
                ppxfxbqfkf.ppxfxbqfkf(this.f80636zdlpuopuiu, this.f80635yggfygwlhe, null, 0, false, true, draadjrbmkVar, 196608, 28);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(ComposeView composeView, int i13, draadjrbmk draadjrbmkVar) {
            this.f80634zdlpuopuiu = composeView;
            this.f80633yggfygwlhe = i13;
            this.f80632jyumaefscl = draadjrbmkVar;
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
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1963833129, i13, -1, "ru.myspar.proloyalty.common.view.rate.drawRatingBarView.<anonymous> (RatingBarView.kt:15)");
            }
            Context context = this.f80634zdlpuopuiu.getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            l41.zoijcleaow.zoijcleaow(p41.ppxfxbqfkf.eablkybsjg(context) ? nufgyqmvbu.Dark : nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1078235940, true, new C1789iobyxmoadg(this.f80633yggfygwlhe, this.f80632jyumaefscl), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final void iobyxmoadg(ComposeView composeView, int i13, draadjrbmk onStarClicked) {
        zdlpuopuiu.btonecajqb(composeView, "<this>");
        zdlpuopuiu.btonecajqb(onStarClicked, "onStarClicked");
        try {
            composeView.setViewCompositionStrategy(s.zoijcleaow.f7058zoijcleaow);
            composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1963833129, true, new iobyxmoadg(composeView, i13, onStarClicked)));
        } catch (Throwable unused) {
        }
    }
}
