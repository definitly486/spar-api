package fd;

import ag.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f33425iobyxmoadg;

    public zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        this.f33425iobyxmoadg = iobyxmoadgVar;
    }

    public static zoijcleaow iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        return new zoijcleaow(iobyxmoadgVar);
    }

    public static com.google.firebase.perf.config.iobyxmoadg ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        return (com.google.firebase.perf.config.iobyxmoadg) dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.iobyxmoadg(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.iobyxmoadg get() {
        return ppxfxbqfkf(this.f33425iobyxmoadg);
    }
}
