package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static agtfadlqog f24556iobyxmoadg;

    private agtfadlqog() {
    }

    public static synchronized agtfadlqog gxszxtbevo() {
        try {
            if (f24556iobyxmoadg == null) {
                f24556iobyxmoadg = new agtfadlqog();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24556iobyxmoadg;
    }

    protected Long eablkybsjg() {
        return Long.valueOf(wkgbmnqykc().longValue() * 3);
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    protected Long wkgbmnqykc() {
        return 100L;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }
}
