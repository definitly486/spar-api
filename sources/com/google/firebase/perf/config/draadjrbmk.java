package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static draadjrbmk f24562iobyxmoadg;

    protected draadjrbmk() {
    }

    protected static synchronized draadjrbmk eablkybsjg() {
        try {
            if (f24562iobyxmoadg == null) {
                f24562iobyxmoadg = new draadjrbmk();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24562iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_enabled";
    }

    protected Boolean wkgbmnqykc() {
        return Boolean.TRUE;
    }
}
