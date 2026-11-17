package kk;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class bm implements View.OnClickListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ x0 f56030jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ dn f56031yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f56032zdlpuopuiu;

    public bm(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, dn dnVar, x0 x0Var) {
        this.f56032zdlpuopuiu = jpowsppfyaVar;
        this.f56031yggfygwlhe = dnVar;
        this.f56030jyumaefscl = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f56032zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        this.f56031yggfygwlhe.f56306zoijcleaow.invoke(this.f56030jyumaefscl);
    }
}
