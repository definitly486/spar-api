package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static nufgyqmvbu f24579iobyxmoadg;

    private nufgyqmvbu() {
    }

    public static synchronized nufgyqmvbu eablkybsjg() {
        try {
            if (f24579iobyxmoadg == null) {
                f24579iobyxmoadg = new nufgyqmvbu();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24579iobyxmoadg;
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_rl_network_event_count_fg";
    }

    protected Long wkgbmnqykc() {
        return 700L;
    }
}
