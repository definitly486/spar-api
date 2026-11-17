package rl1;

import j0.l;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.rate.rate_bonus_product.api.model.ReviewWithBonusesDialogArgs;
import ru.myspar.proloyalty.rate.rate_bonus_product.impl.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f83098ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f83099wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f83098ppxfxbqfkf = storeFactory;
        this.f83099wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f83098ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f83100iobyxmoadg), this.f83099wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        String article = ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getArticle();
        String name = ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getName();
        return new State(article, ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getImageUrl(), name, ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getBonusQuantity(), 0, new tzroggbefp("", 0L, (l) null, 6, (gtknphoqwx) null), ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getPlaceholder(), false, false);
    }
}
