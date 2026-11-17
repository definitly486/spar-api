package bx1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.State;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.args.MySparWebViewArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f17350ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f17351wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f17350ppxfxbqfkf = storeFactory;
        this.f17351wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f17350ppxfxbqfkf, state, new a8.wkgbmnqykc(new ppxfxbqfkf.iobyxmoadg(((MySparWebViewArgs) gxszxtbevo()).getUrl()), ppxfxbqfkf.zoijcleaow.f17353iobyxmoadg), this.f17351wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((MySparWebViewArgs) gxszxtbevo()).getScenario(), ((MySparWebViewArgs) gxszxtbevo()).getTitle(), ((MySparWebViewArgs) gxszxtbevo()).getLoadWithOverviewMode(), ((MySparWebViewArgs) gxszxtbevo()).getAnalyticsPageFrom(), null, null, 48, null);
    }
}
