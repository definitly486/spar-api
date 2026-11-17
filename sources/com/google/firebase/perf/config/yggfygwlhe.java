package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static yggfygwlhe f24587iobyxmoadg;

    private yggfygwlhe() {
    }

    protected static synchronized yggfygwlhe gxszxtbevo() {
        try {
            if (f24587iobyxmoadg == null) {
                f24587iobyxmoadg = new yggfygwlhe();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24587iobyxmoadg;
    }

    protected Double eablkybsjg() {
        return Double.valueOf(wkgbmnqykc().doubleValue() / 1000.0d);
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_vc_trace_sampling_rate";
    }

    protected Double wkgbmnqykc() {
        return Double.valueOf(1.0d);
    }
}
