package dd;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final fg.iobyxmoadg f27852eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final fg.iobyxmoadg f27853gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fg.iobyxmoadg f27854iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final fg.iobyxmoadg f27855lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fg.iobyxmoadg f27856ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final fg.iobyxmoadg f27857wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fg.iobyxmoadg f27858zoijcleaow;

    public lqeggnwhkg(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5, fg.iobyxmoadg iobyxmoadgVar6, fg.iobyxmoadg iobyxmoadgVar7) {
        this.f27854iobyxmoadg = iobyxmoadgVar;
        this.f27858zoijcleaow = iobyxmoadgVar2;
        this.f27856ppxfxbqfkf = iobyxmoadgVar3;
        this.f27857wkgbmnqykc = iobyxmoadgVar4;
        this.f27852eablkybsjg = iobyxmoadgVar5;
        this.f27853gxszxtbevo = iobyxmoadgVar6;
        this.f27855lqeggnwhkg = iobyxmoadgVar7;
    }

    public static lqeggnwhkg iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, fg.iobyxmoadg iobyxmoadgVar5, fg.iobyxmoadg iobyxmoadgVar6, fg.iobyxmoadg iobyxmoadgVar7) {
        return new lqeggnwhkg(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7);
    }

    public static eablkybsjg ppxfxbqfkf(com.google.firebase.gxszxtbevo gxszxtbevoVar, tc.zoijcleaow zoijcleaowVar, uc.eablkybsjg eablkybsjgVar, tc.zoijcleaow zoijcleaowVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, SessionManager sessionManager) {
        return new eablkybsjg(gxszxtbevoVar, zoijcleaowVar, eablkybsjgVar, zoijcleaowVar2, remoteConfigManager, iobyxmoadgVar, sessionManager);
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public eablkybsjg get() {
        return ppxfxbqfkf((com.google.firebase.gxszxtbevo) this.f27854iobyxmoadg.get(), (tc.zoijcleaow) this.f27858zoijcleaow.get(), (uc.eablkybsjg) this.f27856ppxfxbqfkf.get(), (tc.zoijcleaow) this.f27857wkgbmnqykc.get(), (RemoteConfigManager) this.f27852eablkybsjg.get(), (com.google.firebase.perf.config.iobyxmoadg) this.f27853gxszxtbevo.get(), (SessionManager) this.f27855lqeggnwhkg.get());
    }
}
