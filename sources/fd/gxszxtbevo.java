package fd;

import ag.dxjokdxxww;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f33416iobyxmoadg;

    public gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        this.f33416iobyxmoadg = iobyxmoadgVar;
    }

    public static gxszxtbevo iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        return new gxszxtbevo(iobyxmoadgVar);
    }

    public static RemoteConfigManager ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        return (RemoteConfigManager) dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.eablkybsjg(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return ppxfxbqfkf(this.f33416iobyxmoadg);
    }
}
