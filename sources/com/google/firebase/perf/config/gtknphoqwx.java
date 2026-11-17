package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static gtknphoqwx f24566iobyxmoadg;

    protected gtknphoqwx() {
    }

    protected static synchronized gtknphoqwx eablkybsjg() {
        try {
            if (f24566iobyxmoadg == null) {
                f24566iobyxmoadg = new gtknphoqwx();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24566iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_disabled_android_versions";
    }

    protected String wkgbmnqykc() {
        return "";
    }
}
