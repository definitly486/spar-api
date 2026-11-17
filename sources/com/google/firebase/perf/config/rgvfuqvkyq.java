package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static rgvfuqvkyq f24583iobyxmoadg;

    private rgvfuqvkyq() {
    }

    public static synchronized rgvfuqvkyq eablkybsjg() {
        try {
            if (f24583iobyxmoadg == null) {
                f24583iobyxmoadg = new rgvfuqvkyq();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24583iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    protected Long wkgbmnqykc() {
        return 0L;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "sessions_memory_capture_frequency_bg_ms";
    }
}
