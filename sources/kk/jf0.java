package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class jf0 implements de0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public boolean f57188eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f57189iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public boolean f57190ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public boolean f57191wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f57192zoijcleaow;

    public jf0(Context context, wc0 featuresHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f57189iobyxmoadg = context;
    }

    public final void iobyxmoadg(boolean z13) {
        this.f57189iobyxmoadg.getSharedPreferences("USER_TOGGLE", 0).edit().putString("UserBiometricToggleKey", String.valueOf(z13)).apply();
    }
}
