package kk;

import android.os.SystemClock;
import android.view.View;
import npi.spay.Yr;

/* JADX INFO: loaded from: classes3.dex */
public final class ze implements View.OnClickListener {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Yr f59569yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f59570zdlpuopuiu;

    public ze(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, Yr yr2) {
        this.f59570zdlpuopuiu = jpowsppfyaVar;
        this.f59569yggfygwlhe = yr2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f59570zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        ((ly) this.f59569yggfygwlhe.yadqdtsiqt()).draadjrbmk(wn.f59184iobyxmoadg);
    }
}
