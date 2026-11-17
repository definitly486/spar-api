package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ql implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ag.wkgbmnqykc f58209iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f58210zoijcleaow;

    public ql(lj ljVar, ag.wkgbmnqykc wkgbmnqykcVar, fg.iobyxmoadg iobyxmoadgVar) {
        this.f58209iobyxmoadg = wkgbmnqykcVar;
        this.f58210zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        Context context = (Context) this.f58209iobyxmoadg.get();
        x10 sessionStoreSP = (x10) this.f58210zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionStoreSP, "sessionStoreSP");
        return (f80) ag.dxjokdxxww.eablkybsjg(new rb0(context, sessionStoreSP));
    }
}
