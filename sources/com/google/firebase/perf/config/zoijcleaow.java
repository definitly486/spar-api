package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static zoijcleaow f24589iobyxmoadg;

    private zoijcleaow() {
    }

    protected static synchronized zoijcleaow eablkybsjg() {
        try {
            if (f24589iobyxmoadg == null) {
                f24589iobyxmoadg = new zoijcleaow();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24589iobyxmoadg;
    }

    protected Boolean wkgbmnqykc() {
        return Boolean.FALSE;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "firebase_performance_collection_deactivated";
    }
}
