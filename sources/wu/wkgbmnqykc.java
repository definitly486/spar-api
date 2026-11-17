package wu;

import android.content.Context;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import y50.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f120631jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f120632yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ComposeView f120633zdlpuopuiu;

        /* JADX INFO: renamed from: wu.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C3030iobyxmoadg implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f120634yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ int f120635zdlpuopuiu;

            C3030iobyxmoadg(int i13, draadjrbmk draadjrbmkVar) {
                this.f120635zdlpuopuiu = i13;
                this.f120634yggfygwlhe = draadjrbmkVar;
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
                    jyumaefscl.ntlheqmsrt(-1218434399, i13, -1, "ru.myspar.common.view.rate.drawRatingBarView.<anonymous>.<anonymous> (RatingBarView.kt:18)");
                }
                ppxfxbqfkf.ppxfxbqfkf(this.f120635zdlpuopuiu, this.f120634yggfygwlhe, null, 0, false, true, draadjrbmkVar, 196608, 28);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(ComposeView composeView, int i13, draadjrbmk draadjrbmkVar) {
            this.f120633zdlpuopuiu = composeView;
            this.f120632yggfygwlhe = i13;
            this.f120631jyumaefscl = draadjrbmkVar;
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
                jyumaefscl.ntlheqmsrt(-746914426, i13, -1, "ru.myspar.common.view.rate.drawRatingBarView.<anonymous> (RatingBarView.kt:15)");
            }
            Context context = this.f120633zdlpuopuiu.getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            y50.zoijcleaow.zoijcleaow(c60.zoijcleaow.eablkybsjg(context) ? nufgyqmvbu.Dark : nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1218434399, true, new C3030iobyxmoadg(this.f120632yggfygwlhe, this.f120631jyumaefscl), draadjrbmkVar, 54), draadjrbmkVar, 48);
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
            composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-746914426, true, new iobyxmoadg(composeView, i13, onStarClicked)));
        } catch (Throwable unused) {
        }
    }
}
