package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static dxjokdxxww f24563iobyxmoadg;

    private dxjokdxxww() {
    }

    protected static synchronized dxjokdxxww gxszxtbevo() {
        try {
            if (f24563iobyxmoadg == null) {
                f24563iobyxmoadg = new dxjokdxxww();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24563iobyxmoadg;
    }

    protected Double eablkybsjg() {
        return Double.valueOf(wkgbmnqykc().doubleValue() / 1000.0d);
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_vc_network_request_sampling_rate";
    }

    protected Double wkgbmnqykc() {
        return Double.valueOf(1.0d);
    }
}
