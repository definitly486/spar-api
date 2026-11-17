package hf0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.loymaxpopup.impl.domain.LoymaxPopupArgs;
import ru.myspar.loymaxpopup.impl.domain.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f40136ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f40137zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f40137zoijcleaow = storeFactory;
        this.f40136ppxfxbqfkf = executor;
    }

    private final State wflxmlrfwp(LoymaxPopupArgs loymaxPopupArgs) {
        return new State(loymaxPopupArgs.getId(), loymaxPopupArgs.getPage(), loymaxPopupArgs.getNavLink(), loymaxPopupArgs.getReference(), loymaxPopupArgs.getTitle(), loymaxPopupArgs.getSubtitle(), loymaxPopupArgs.getImageUrl(), loymaxPopupArgs.getText(), loymaxPopupArgs.getButtonText());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return wflxmlrfwp((LoymaxPopupArgs) gxszxtbevo());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f40137zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.f40138iobyxmoadg), this.f40136ppxfxbqfkf, new zoijcleaow());
    }
}
