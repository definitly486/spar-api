package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import md.agtfadlqog;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final gd.iobyxmoadg f24663eablkybsjg = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Runtime f24664iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f24665ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Context f24666wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ActivityManager f24667zoijcleaow;

    dxjokdxxww(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int iobyxmoadg() {
        return agtfadlqog.ppxfxbqfkf(md.gtknphoqwx.f66811esjtqupxsv.wkgbmnqykc(this.f24665ppxfxbqfkf.totalMem));
    }

    public int ppxfxbqfkf() {
        return agtfadlqog.ppxfxbqfkf(md.gtknphoqwx.f66812iwizpuwonk.wkgbmnqykc(this.f24667zoijcleaow.getMemoryClass()));
    }

    public int zoijcleaow() {
        return agtfadlqog.ppxfxbqfkf(md.gtknphoqwx.f66811esjtqupxsv.wkgbmnqykc(this.f24664iobyxmoadg.maxMemory()));
    }

    dxjokdxxww(Runtime runtime, Context context) {
        this.f24664iobyxmoadg = runtime;
        this.f24666wkgbmnqykc = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f24667zoijcleaow = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f24665ppxfxbqfkf = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
