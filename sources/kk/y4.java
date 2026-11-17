package kk;

import android.os.SystemClock;
import android.view.View;
import spay.sdk.view.BnplButtonCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class y4 implements View.OnClickListener {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ BnplButtonCompositeView f59381yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f59382zdlpuopuiu;

    public y4(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, BnplButtonCompositeView bnplButtonCompositeView) {
        this.f59382zdlpuopuiu = jpowsppfyaVar;
        this.f59381yggfygwlhe = bnplButtonCompositeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f59382zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        this.f59381yggfygwlhe.performClick();
    }
}
