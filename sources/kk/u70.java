package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class u70 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f58786iobyxmoadg;

    public u70(w00 w00Var, fg.iobyxmoadg iobyxmoadgVar) {
        this.f58786iobyxmoadg = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        gg customSharedPreferences = (gg) this.f58786iobyxmoadg.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(customSharedPreferences, "customSharedPreferences");
        return (tc) ag.dxjokdxxww.eablkybsjg(new tc(customSharedPreferences));
    }
}
