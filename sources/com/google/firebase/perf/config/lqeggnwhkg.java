package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static lqeggnwhkg f24578iobyxmoadg;

    private lqeggnwhkg() {
    }

    public static synchronized lqeggnwhkg eablkybsjg() {
        try {
            if (f24578iobyxmoadg == null) {
                f24578iobyxmoadg = new lqeggnwhkg();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24578iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_rl_network_event_count_bg";
    }

    protected Long wkgbmnqykc() {
        return 70L;
    }
}
