package kk;

import android.os.SystemClock;
import android.view.View;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xx implements View.OnClickListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ npi.spay.ke f59345jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ nz f59346yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f59347zdlpuopuiu;

    public xx(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, nz nzVar, npi.spay.ke keVar) {
        this.f59347zdlpuopuiu = jpowsppfyaVar;
        this.f59346yggfygwlhe = nzVar;
        this.f59345jyumaefscl = keVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f59347zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        ag0 ag0Var = this.f59346yggfygwlhe.f57867wkgbmnqykc.f107892b;
        if (ag0Var != null) {
            ag0Var.setText(R.string.spay_empty_string);
        }
        ((rgvfuqvkyq) this.f59345jyumaefscl.yadqdtsiqt()).agtfadlqog(c1.f56076iobyxmoadg);
    }
}
