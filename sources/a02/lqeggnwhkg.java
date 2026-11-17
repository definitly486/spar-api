package a02;

import j0.l;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.rate.rate_bonus_product.api.model.ReviewWithBonusesDialogArgs;
import ru.myspar.rate.rate_bonus_product.impl.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f137ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f138zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f138zoijcleaow = storeFactory;
        this.f137ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        String article = ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getArticle();
        String name = ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getName();
        return new State(article, ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getImageUrl(), name, ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getBonusQuantity(), 0, new tzroggbefp("", 0L, (l) null, 6, (gtknphoqwx) null), ((ReviewWithBonusesDialogArgs) gxszxtbevo()).getPlaceholder(), false, false);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f138zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f139iobyxmoadg), this.f137ppxfxbqfkf, new zoijcleaow());
    }
}
