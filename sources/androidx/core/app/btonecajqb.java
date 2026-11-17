package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f8356iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Configuration f8357zoijcleaow;

    public btonecajqb(boolean z13) {
        this.f8356iobyxmoadg = z13;
    }

    public final boolean iobyxmoadg() {
        return this.f8356iobyxmoadg;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public btonecajqb(boolean z13, Configuration newConfig) {
        this(z13);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newConfig, "newConfig");
        this.f8357zoijcleaow = newConfig;
    }
}
