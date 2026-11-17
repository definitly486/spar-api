package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class mg0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ag.wkgbmnqykc f57646iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f57647zoijcleaow;

    public mg0(if0 if0Var, ag.wkgbmnqykc wkgbmnqykcVar, fg.iobyxmoadg iobyxmoadgVar) {
        this.f57646iobyxmoadg = wkgbmnqykcVar;
        this.f57647zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        Context context = (Context) this.f57646iobyxmoadg.get();
        wc0 featuresHandler = (wc0) this.f57647zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        return (de0) ag.dxjokdxxww.eablkybsjg(new jf0(context, featuresHandler));
    }
}
