package ru.myspar.legacy.presentation.screen.savedcards;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import id0.nufgyqmvbu;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.hcddaimhww;
import pm.dxjokdxxww;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89612jyumaefscl;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, eablkybsjg.class, "onQuestionClick", "onQuestionClick(Lru/myspar/legacy/presentation/screen/savedcards/models/QuestionItemUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ld0.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ld0.ppxfxbqfkf p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((eablkybsjg) this.receiver).ojitshcjhn(p13);
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, eablkybsjg.class, "onDeleteCardClick", "onDeleteCardClick(Lru/myspar/legacy/presentation/screen/savedcards/models/CardItemUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ld0.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ld0.iobyxmoadg p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((eablkybsjg) this.receiver).agtfadlqog(p13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89612jyumaefscl = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: id0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.savedcards.eablkybsjg.gtknphoqwx(this.f42415zdlpuopuiu);
            }
        });
        hcddaimhww hcddaimhwwVar = (hcddaimhww) binding.invoke();
        ComposeView cvActionBar = hcddaimhwwVar.f65548ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(dxjokdxxww.saved_cards_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: id0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.savedcards.eablkybsjg.wflxmlrfwp(this.f42414zdlpuopuiu);
            }
        }, null, null, 109, null);
        hcddaimhwwVar.f65549wkgbmnqykc.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        RecyclerView rvSavedCardInfo = hcddaimhwwVar.f65549wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(rvSavedCardInfo, "rvSavedCardInfo");
        e60.zoijcleaow.ppxfxbqfkf(rvSavedCardInfo, draadjrbmk(), hcddaimhwwVar);
        RecyclerView.wflxmlrfwp itemAnimator = hcddaimhwwVar.f65549wkgbmnqykc.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.cqumvgiudr(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void agtfadlqog(ld0.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(new ppxfxbqfkf.C2053ppxfxbqfkf(iobyxmoadgVar));
    }

    private final jd0.zdlpuopuiu draadjrbmk() {
        return (jd0.zdlpuopuiu) this.f89612jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd0.zdlpuopuiu gtknphoqwx(eablkybsjg eablkybsjgVar) {
        return new jd0.zdlpuopuiu(new iobyxmoadg(eablkybsjgVar), new zoijcleaow(eablkybsjgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ojitshcjhn(ld0.ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar.eablkybsjg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f89615iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(hcddaimhww binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f65550zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
        draadjrbmk().wkgbmnqykc(model.iobyxmoadg());
    }
}
