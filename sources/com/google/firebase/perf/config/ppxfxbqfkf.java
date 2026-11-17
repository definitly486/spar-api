package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static ppxfxbqfkf f24582iobyxmoadg;

    private ppxfxbqfkf() {
    }

    protected static synchronized ppxfxbqfkf wkgbmnqykc() {
        try {
            if (f24582iobyxmoadg == null) {
                f24582iobyxmoadg = new ppxfxbqfkf();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24582iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "isEnabled";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "firebase_performance_collection_enabled";
    }
}
