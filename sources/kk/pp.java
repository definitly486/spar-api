package kk;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class pp implements View.OnClickListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ gn f58107jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ tq f58108yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f58109zdlpuopuiu;

    public pp(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, tq tqVar, gn gnVar) {
        this.f58109zdlpuopuiu = jpowsppfyaVar;
        this.f58108yggfygwlhe = tqVar;
        this.f58107jyumaefscl = gnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f58109zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        this.f58108yggfygwlhe.f58714zoijcleaow.invoke(this.f58107jyumaefscl);
    }
}
