package kk;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ n1 f56970jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ l0 f56971yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f56972zdlpuopuiu;

    public i(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, l0 l0Var, n1 n1Var) {
        this.f56972zdlpuopuiu = jpowsppfyaVar;
        this.f56971yggfygwlhe = l0Var;
        this.f56970jyumaefscl = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f56972zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        this.f56971yggfygwlhe.f57368zoijcleaow.invoke(this.f56970jyumaefscl);
    }
}
