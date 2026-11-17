package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class oxmwwwfdhm extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static oxmwwwfdhm f24581iobyxmoadg;

    private oxmwwwfdhm() {
    }

    public static synchronized oxmwwwfdhm gxszxtbevo() {
        try {
            if (f24581iobyxmoadg == null) {
                f24581iobyxmoadg = new oxmwwwfdhm();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24581iobyxmoadg;
    }

    protected Double eablkybsjg() {
        return Double.valueOf(wkgbmnqykc().doubleValue() / 1000.0d);
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_vc_session_sampling_rate";
    }

    protected Double wkgbmnqykc() {
        return Double.valueOf(0.01d);
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "sessions_sampling_percentage";
    }
}
