package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static wflxmlrfwp f24585iobyxmoadg;

    private wflxmlrfwp() {
    }

    public static synchronized wflxmlrfwp eablkybsjg() {
        try {
            if (f24585iobyxmoadg == null) {
                f24585iobyxmoadg = new wflxmlrfwp();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24585iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    protected Long wkgbmnqykc() {
        return 0L;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }
}
