package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class mi implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ag.wkgbmnqykc f57651iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f57652zoijcleaow;

    public mi(jh jhVar, ag.wkgbmnqykc wkgbmnqykcVar, fg.iobyxmoadg iobyxmoadgVar) {
        this.f57651iobyxmoadg = wkgbmnqykcVar;
        this.f57652zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        Context context = (Context) this.f57651iobyxmoadg.get();
        lk.lereixgezr okHttpClient = (lk.lereixgezr) this.f57652zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(okHttpClient, "okHttpClient");
        v6.wkgbmnqykc.iobyxmoadg iobyxmoadgVarEablkybsjg = new v6.wkgbmnqykc.iobyxmoadg(context).eablkybsjg(new fg(okHttpClient));
        v6.iobyxmoadg.C2883iobyxmoadg c2883iobyxmoadg = new v6.iobyxmoadg.C2883iobyxmoadg();
        c2883iobyxmoadg.ppxfxbqfkf(new x6.kcexrzcfyt.zoijcleaow(false, 1, null));
        return (v6.wkgbmnqykc) ag.dxjokdxxww.eablkybsjg(iobyxmoadgVarEablkybsjg.wkgbmnqykc(c2883iobyxmoadg.eablkybsjg()).zoijcleaow());
    }
}
