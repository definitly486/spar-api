package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class kv implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ag.wkgbmnqykc f57353iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f57354ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final u70 f57355wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f57356zoijcleaow;

    public kv(gu guVar, ag.wkgbmnqykc wkgbmnqykcVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, u70 u70Var) {
        this.f57353iobyxmoadg = wkgbmnqykcVar;
        this.f57356zoijcleaow = iobyxmoadgVar;
        this.f57354ppxfxbqfkf = iobyxmoadgVar2;
        this.f57355wkgbmnqykc = u70Var;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        Context context = (Context) this.f57353iobyxmoadg.get();
        wc0 featuresHandler = (wc0) this.f57356zoijcleaow.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f57354ppxfxbqfkf.get();
        tc userIdManager = (tc) this.f57355wkgbmnqykc.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userIdManager, "userIdManager");
        return (bt) ag.dxjokdxxww.eablkybsjg(new bt(context, featuresHandler, sPayDataContract, userIdManager));
    }
}
