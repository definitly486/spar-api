package z51;

import hg.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f129135ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f129136wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f129135ppxfxbqfkf = storeFactory;
        this.f129136wkgbmnqykc = executor;
    }

    private final State agtfadlqog(BuildYourComboDialogArgs buildYourComboDialogArgs) {
        return new State((ComboSetProduct) jyumaefscl.opjhrmiecq(buildYourComboDialogArgs.getComboSet().getProductsFirst()), (ComboSetProduct) jyumaefscl.opjhrmiecq(buildYourComboDialogArgs.getComboSet().getProductsSecond()), buildYourComboDialogArgs.getComboSet());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f129135ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.f129137iobyxmoadg), this.f129136wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return agtfadlqog((BuildYourComboDialogArgs) gxszxtbevo());
    }
}
