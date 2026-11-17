package k70;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.State;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final void ikoacuggdj(State state, ComboSetProduct comboSetProduct) {
        if (zdlpuopuiu.eablkybsjg(state.getSelectedProductFirst().getArticle(), comboSetProduct.getArticle())) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(comboSetProduct));
    }

    private final void jhduphickx() {
        crxdokpmqz(eablkybsjg.zoijcleaow.f54104iobyxmoadg);
    }

    private final void okpsazkaxt(State state, ComboSetProduct comboSetProduct) {
        if (zdlpuopuiu.eablkybsjg(state.getSelectedProductSecond().getArticle(), comboSetProduct.getArticle())) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(comboSetProduct));
    }

    private final void vipkmwdibw(State state) {
        crxdokpmqz(new eablkybsjg.iobyxmoadg(state.getSelectedProductFirst(), state.getSelectedProductSecond()));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f54110iobyxmoadg)) {
            vipkmwdibw((State) jlmebxxoox());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f54113iobyxmoadg)) {
            jhduphickx();
        } else if (intent instanceof wkgbmnqykc.ppxfxbqfkf) {
            ikoacuggdj((State) jlmebxxoox(), ((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof wkgbmnqykc.C1161wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            okpsazkaxt((State) jlmebxxoox(), ((wkgbmnqykc.C1161wkgbmnqykc) intent).iobyxmoadg());
        }
    }
}
