package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static btonecajqb f24557iobyxmoadg;

    private btonecajqb() {
    }

    public static synchronized btonecajqb eablkybsjg() {
        try {
            if (f24557iobyxmoadg == null) {
                f24557iobyxmoadg = new btonecajqb();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24557iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_rl_time_limit_sec";
    }

    protected Long wkgbmnqykc() {
        return 600L;
    }
}
