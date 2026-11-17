package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f8362iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Configuration f8363zoijcleaow;

    public kcexrzcfyt(boolean z13) {
        this.f8362iobyxmoadg = z13;
    }

    public final boolean iobyxmoadg() {
        return this.f8362iobyxmoadg;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kcexrzcfyt(boolean z13, Configuration newConfig) {
        this(z13);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newConfig, "newConfig");
        this.f8363zoijcleaow = newConfig;
    }
}
