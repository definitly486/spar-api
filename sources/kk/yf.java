package kk;

import android.os.SystemClock;
import android.view.View;
import npi.spay.To;

/* JADX INFO: loaded from: classes3.dex */
public final class yf implements View.OnClickListener {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ To f59435yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f59436zdlpuopuiu;

    public yf(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, To to2) {
        this.f59436zdlpuopuiu = jpowsppfyaVar;
        this.f59435yggfygwlhe = to2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f59436zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        ((ve) ((fi) this.f59435yggfygwlhe.yadqdtsiqt()).f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
    }
}
