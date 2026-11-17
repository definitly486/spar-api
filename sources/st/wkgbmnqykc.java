package st;

import android.content.Context;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tt.eablkybsjg;
import y50.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ HintUiModel.iobyxmoadg f108534cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f108535iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ yt.zoijcleaow f108536jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f108537yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ComposeView f108538zdlpuopuiu;

        /* JADX INFO: renamed from: st.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2666iobyxmoadg implements rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ HintUiModel.iobyxmoadg f108539iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f108540jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ yt.zoijcleaow f108541yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ List f108542zdlpuopuiu;

            C2666iobyxmoadg(List list, yt.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, HintUiModel.iobyxmoadg iobyxmoadgVar) {
                this.f108542zdlpuopuiu = list;
                this.f108541yggfygwlhe = zoijcleaowVar;
                this.f108540jyumaefscl = draadjrbmkVar;
                this.f108539iwizpuwonk = iobyxmoadgVar;
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
                    jyumaefscl.ntlheqmsrt(-1837740609, i13, -1, "ru.myspar.common.view.hint.drawHintColumnView.<anonymous>.<anonymous> (HintView.kt:29)");
                }
                List list = this.f108542zdlpuopuiu;
                HintUiModel.iobyxmoadg iobyxmoadgVar = this.f108539iwizpuwonk;
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ru.myspar.common.view.hint.model.iobyxmoadg.zoijcleaow((HintUiModel) it.next(), iobyxmoadgVar));
                }
                eablkybsjg.eablkybsjg(arrayList, null, this.f108541yggfygwlhe, 0.0f, this.f108540jyumaefscl, draadjrbmkVar, 0, 10);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(ComposeView composeView, List list, yt.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, HintUiModel.iobyxmoadg iobyxmoadgVar) {
            this.f108538zdlpuopuiu = composeView;
            this.f108537yggfygwlhe = list;
            this.f108536jyumaefscl = zoijcleaowVar;
            this.f108535iwizpuwonk = draadjrbmkVar;
            this.f108534cqumvgiudr = iobyxmoadgVar;
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
                jyumaefscl.ntlheqmsrt(1504317796, i13, -1, "ru.myspar.common.view.hint.drawHintColumnView.<anonymous> (HintView.kt:28)");
            }
            Context context = this.f108538zdlpuopuiu.getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            y50.zoijcleaow.zoijcleaow(c60.zoijcleaow.eablkybsjg(context) ? nufgyqmvbu.Dark : nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1837740609, true, new C2666iobyxmoadg(this.f108537yggfygwlhe, this.f108536jyumaefscl, this.f108535iwizpuwonk, this.f108534cqumvgiudr), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static /* synthetic */ void ppxfxbqfkf(ComposeView composeView, List list, HintUiModel.iobyxmoadg iobyxmoadgVar, yt.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = HintUiModel.iobyxmoadg.SMALL;
        }
        if ((i13 & 4) != 0) {
            zoijcleaowVar = yt.zoijcleaow.LEFT;
        }
        if ((i13 & 8) != 0) {
            draadjrbmkVar = new draadjrbmk() { // from class: st.ppxfxbqfkf
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj2) {
                    return wkgbmnqykc.wkgbmnqykc((HintUiModel) obj2);
                }
            };
        }
        zoijcleaow(composeView, list, iobyxmoadgVar, zoijcleaowVar, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(HintUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(ComposeView composeView, List hints, HintUiModel.iobyxmoadg sizeLegacyView, yt.zoijcleaow hintOrientation, draadjrbmk onClick) {
        zdlpuopuiu.btonecajqb(composeView, "<this>");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(sizeLegacyView, "sizeLegacyView");
        zdlpuopuiu.btonecajqb(hintOrientation, "hintOrientation");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        try {
            composeView.setViewCompositionStrategy(s.zoijcleaow.f7058zoijcleaow);
            composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1504317796, true, new iobyxmoadg(composeView, hints, hintOrientation, onClick, sizeLegacyView)));
        } catch (Throwable unused) {
        }
    }
}
