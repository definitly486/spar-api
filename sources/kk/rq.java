package kk;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class rq implements View.OnClickListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ np f58463jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ vr f58464yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f58465zdlpuopuiu;

    public rq(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, vr vrVar, np npVar) {
        this.f58465zdlpuopuiu = jpowsppfyaVar;
        this.f58464yggfygwlhe = vrVar;
        this.f58463jyumaefscl = npVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.internal.jyumaefscl, tg.draadjrbmk] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f58465zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        this.f58464yggfygwlhe.f59056ppxfxbqfkf.invoke(this.f58463jyumaefscl);
    }
}
