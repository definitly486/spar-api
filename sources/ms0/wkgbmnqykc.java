package ms0;

import android.content.Context;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import l41.nufgyqmvbu;
import ns0.eablkybsjg;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ HintUiModel.iobyxmoadg f67876cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f67877iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ss0.zoijcleaow f67878jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f67879yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ComposeView f67880zdlpuopuiu;

        /* JADX INFO: renamed from: ms0.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1443iobyxmoadg implements rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ HintUiModel.iobyxmoadg f67881iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f67882jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ss0.zoijcleaow f67883yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ List f67884zdlpuopuiu;

            C1443iobyxmoadg(List list, ss0.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, HintUiModel.iobyxmoadg iobyxmoadgVar) {
                this.f67884zdlpuopuiu = list;
                this.f67883yggfygwlhe = zoijcleaowVar;
                this.f67882jyumaefscl = draadjrbmkVar;
                this.f67881iwizpuwonk = iobyxmoadgVar;
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
                    jyumaefscl.ntlheqmsrt(-1999204828, i13, -1, "ru.myspar.proloyalty.common.view.hint.drawHintColumnView.<anonymous>.<anonymous> (HintView.kt:31)");
                }
                List list = this.f67884zdlpuopuiu;
                HintUiModel.iobyxmoadg iobyxmoadgVar = this.f67881iwizpuwonk;
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ru.myspar.proloyalty.common.view.hint.model.iobyxmoadg.zoijcleaow((HintUiModel) it.next(), iobyxmoadgVar));
                }
                eablkybsjg.eablkybsjg(arrayList, null, this.f67883yggfygwlhe, 0.0f, this.f67882jyumaefscl, draadjrbmkVar, 0, 10);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(ComposeView composeView, List list, ss0.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, HintUiModel.iobyxmoadg iobyxmoadgVar) {
            this.f67880zdlpuopuiu = composeView;
            this.f67879yggfygwlhe = list;
            this.f67878jyumaefscl = zoijcleaowVar;
            this.f67877iwizpuwonk = draadjrbmkVar;
            this.f67876cqumvgiudr = iobyxmoadgVar;
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
                jyumaefscl.ntlheqmsrt(-1707441825, i13, -1, "ru.myspar.proloyalty.common.view.hint.drawHintColumnView.<anonymous> (HintView.kt:28)");
            }
            Context context = this.f67880zdlpuopuiu.getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            l41.zoijcleaow.zoijcleaow(p41.ppxfxbqfkf.eablkybsjg(context) ? nufgyqmvbu.Dark : nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1999204828, true, new C1443iobyxmoadg(this.f67879yggfygwlhe, this.f67878jyumaefscl, this.f67877iwizpuwonk, this.f67876cqumvgiudr), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static /* synthetic */ void ppxfxbqfkf(ComposeView composeView, List list, HintUiModel.iobyxmoadg iobyxmoadgVar, ss0.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = HintUiModel.iobyxmoadg.SMALL;
        }
        if ((i13 & 4) != 0) {
            zoijcleaowVar = ss0.zoijcleaow.LEFT;
        }
        if ((i13 & 8) != 0) {
            draadjrbmkVar = new draadjrbmk() { // from class: ms0.ppxfxbqfkf
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

    public static final void zoijcleaow(ComposeView composeView, List hints, HintUiModel.iobyxmoadg sizeLegacyView, ss0.zoijcleaow hintOrientation, draadjrbmk onClick) {
        zdlpuopuiu.btonecajqb(composeView, "<this>");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(sizeLegacyView, "sizeLegacyView");
        zdlpuopuiu.btonecajqb(hintOrientation, "hintOrientation");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        try {
            composeView.setViewCompositionStrategy(s.zoijcleaow.f7058zoijcleaow);
            composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1707441825, true, new iobyxmoadg(composeView, hints, hintOrientation, onClick, sizeLegacyView)));
        } catch (Throwable unused) {
        }
    }
}
