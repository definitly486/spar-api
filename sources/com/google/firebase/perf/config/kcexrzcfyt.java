package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static kcexrzcfyt f24576iobyxmoadg;

    private kcexrzcfyt() {
    }

    public static synchronized kcexrzcfyt eablkybsjg() {
        try {
            if (f24576iobyxmoadg == null) {
                f24576iobyxmoadg = new kcexrzcfyt();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24576iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_rl_trace_event_count_bg";
    }

    protected Long wkgbmnqykc() {
        return 30L;
    }
}
