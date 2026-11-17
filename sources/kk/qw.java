package kk;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class qw implements View.OnClickListener {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.ke f58243yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.jpowsppfya f58244zdlpuopuiu;

    public qw(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, npi.spay.ke keVar) {
        this.f58244zdlpuopuiu = jpowsppfyaVar;
        this.f58243yggfygwlhe = keVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f58244zdlpuopuiu;
        if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < 400) {
            return;
        }
        jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = this.f58243yggfygwlhe.requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity()");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oxmwwwfdhmVarRequireActivity, "<this>");
        View currentFocus = oxmwwwfdhmVarRequireActivity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(oxmwwwfdhmVarRequireActivity);
        }
        xd0.ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, currentFocus);
        ((rgvfuqvkyq) this.f58243yggfygwlhe.yadqdtsiqt()).agtfadlqog(ojitshcjhn.f57965iobyxmoadg);
    }
}
