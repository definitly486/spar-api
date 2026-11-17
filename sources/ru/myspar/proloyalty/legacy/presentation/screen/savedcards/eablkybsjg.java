package ru.myspar.proloyalty.legacy.presentation.screen.savedcards;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fb1.nufgyqmvbu;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;
import z41.cdpycssgdh;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97291jyumaefscl;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, eablkybsjg.class, "onQuestionClick", "onQuestionClick(Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/models/QuestionItemUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ib1.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ib1.ppxfxbqfkf p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((eablkybsjg) this.receiver).ojitshcjhn(p13);
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, eablkybsjg.class, "onDeleteCardClick", "onDeleteCardClick(Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/models/CardItemUiModel;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ib1.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ib1.iobyxmoadg p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((eablkybsjg) this.receiver).agtfadlqog(p13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97291jyumaefscl = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fb1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.savedcards.eablkybsjg.gtknphoqwx(this.f33390zdlpuopuiu);
            }
        });
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) binding.invoke();
        ComposeView cvActionBar = cdpycssgdhVar.f127886ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(lqeggnwhkg.proloyalty_saved_cards_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: fb1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.savedcards.eablkybsjg.wflxmlrfwp(this.f33389zdlpuopuiu);
            }
        }, null, null, 109, null);
        cdpycssgdhVar.f127887wkgbmnqykc.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        RecyclerView rvSavedCardInfo = cdpycssgdhVar.f127887wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(rvSavedCardInfo, "rvSavedCardInfo");
        r41.zoijcleaow.ppxfxbqfkf(rvSavedCardInfo, draadjrbmk(), cdpycssgdhVar);
        RecyclerView.wflxmlrfwp itemAnimator = cdpycssgdhVar.f127887wkgbmnqykc.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.cqumvgiudr(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void agtfadlqog(ib1.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(new ppxfxbqfkf.C2296ppxfxbqfkf(iobyxmoadgVar));
    }

    private final gb1.zdlpuopuiu draadjrbmk() {
        return (gb1.zdlpuopuiu) this.f97291jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gb1.zdlpuopuiu gtknphoqwx(eablkybsjg eablkybsjgVar) {
        return new gb1.zdlpuopuiu(new iobyxmoadg(eablkybsjgVar), new zoijcleaow(eablkybsjgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ojitshcjhn(ib1.ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar.eablkybsjg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f97294iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(cdpycssgdh binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f127888zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
        draadjrbmk().wkgbmnqykc(model.iobyxmoadg());
    }
}
