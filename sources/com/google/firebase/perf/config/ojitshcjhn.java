package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static ojitshcjhn f24580iobyxmoadg;

    private ojitshcjhn() {
    }

    public static synchronized ojitshcjhn eablkybsjg() {
        try {
            if (f24580iobyxmoadg == null) {
                f24580iobyxmoadg = new ojitshcjhn();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24580iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_session_max_duration_min";
    }

    protected Long wkgbmnqykc() {
        return 240L;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "sessions_max_length_minutes";
    }
}
