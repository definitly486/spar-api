package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class fw implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f56597iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56598zoijcleaow;

    public fw(xt xtVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f56597iobyxmoadg = iobyxmoadgVar;
        this.f56598zoijcleaow = iobyxmoadgVar2;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        qy configService = (qy) this.f56597iobyxmoadg.get();
        gg defaultSharedPreferences = (gg) this.f56598zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configService, "configService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultSharedPreferences, "defaultSharedPreferences");
        return (m60) ag.dxjokdxxww.eablkybsjg(new s80(configService, defaultSharedPreferences));
    }
}
