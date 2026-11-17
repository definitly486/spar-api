package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static wkgbmnqykc f24586iobyxmoadg;

    private wkgbmnqykc() {
    }

    protected static synchronized wkgbmnqykc eablkybsjg() {
        try {
            if (f24586iobyxmoadg == null) {
                f24586iobyxmoadg = new wkgbmnqykc();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24586iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_experiment_app_start_ttid";
    }

    protected Boolean wkgbmnqykc() {
        return Boolean.FALSE;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "experiment_app_start_ttid";
    }
}
