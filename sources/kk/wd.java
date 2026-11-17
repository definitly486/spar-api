package kk;

import android.os.SystemClock;
import android.view.View;
import npi.spay.Yr;

/* JADX INFO: loaded from: classes3.dex */
public final class wd implements View.OnClickListener {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Yr f59131yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f59132zdlpuopuiu;

    public wd(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, Yr yr2) {
        this.f59132zdlpuopuiu = jpowsppfyaVar;
        this.f59131yggfygwlhe = yr2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f59132zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        ((ly) this.f59131yggfygwlhe.yadqdtsiqt()).draadjrbmk(bp.f56039iobyxmoadg);
    }
}
