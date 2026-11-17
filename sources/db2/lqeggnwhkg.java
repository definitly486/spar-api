package db2;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.webview_screen.impl.myspar.domain.State;
import ru.myspar.webview_screen.impl.myspar.domain.args.MySparWebViewArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f27410ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f27411zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f27411zoijcleaow = storeFactory;
        this.f27410ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((MySparWebViewArgs) gxszxtbevo()).getTitle(), ((MySparWebViewArgs) gxszxtbevo()).getUrl(), ((MySparWebViewArgs) gxszxtbevo()).getLoadWithOverviewMode(), ((MySparWebViewArgs) gxszxtbevo()).getAnalyticsPageFrom());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f27411zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f27412iobyxmoadg), this.f27410ppxfxbqfkf, new zoijcleaow());
    }
}
