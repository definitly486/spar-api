package fd;

import ag.dxjokdxxww;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f33421iobyxmoadg;

    public lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        this.f33421iobyxmoadg = iobyxmoadgVar;
    }

    public static lqeggnwhkg iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        return new lqeggnwhkg(iobyxmoadgVar);
    }

    public static SessionManager ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        return (SessionManager) dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.gxszxtbevo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return ppxfxbqfkf(this.f33421iobyxmoadg);
    }
}
