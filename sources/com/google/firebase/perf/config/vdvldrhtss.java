package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class vdvldrhtss extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static vdvldrhtss f24584iobyxmoadg;

    private vdvldrhtss() {
    }

    public static synchronized vdvldrhtss gxszxtbevo() {
        try {
            if (f24584iobyxmoadg == null) {
                f24584iobyxmoadg = new vdvldrhtss();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24584iobyxmoadg;
    }

    protected Long eablkybsjg() {
        return Long.valueOf(wkgbmnqykc().longValue() * 3);
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    protected Long wkgbmnqykc() {
        return 100L;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "sessions_memory_capture_frequency_fg_ms";
    }
}
