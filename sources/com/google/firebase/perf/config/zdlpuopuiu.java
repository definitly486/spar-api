package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class zdlpuopuiu extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static zdlpuopuiu f24588iobyxmoadg;

    private zdlpuopuiu() {
    }

    public static synchronized zdlpuopuiu eablkybsjg() {
        try {
            if (f24588iobyxmoadg == null) {
                f24588iobyxmoadg = new zdlpuopuiu();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24588iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_rl_trace_event_count_fg";
    }

    protected Long wkgbmnqykc() {
        return 300L;
    }
}
