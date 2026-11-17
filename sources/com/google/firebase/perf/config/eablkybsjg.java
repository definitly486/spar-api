package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static eablkybsjg f24564iobyxmoadg;

    private eablkybsjg() {
    }

    protected static synchronized eablkybsjg eablkybsjg() {
        try {
            if (f24564iobyxmoadg == null) {
                f24564iobyxmoadg = new eablkybsjg();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24564iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_vc_fragment_sampling_rate";
    }

    protected Double wkgbmnqykc() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String zoijcleaow() {
        return "fragment_sampling_percentage";
    }
}
