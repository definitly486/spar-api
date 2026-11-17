package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static gxszxtbevo f24567iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f24568zoijcleaow = Collections.unmodifiableMap(new iobyxmoadg());

    class iobyxmoadg extends HashMap {
        iobyxmoadg() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private gxszxtbevo() {
    }

    public static synchronized gxszxtbevo eablkybsjg() {
        try {
            if (f24567iobyxmoadg == null) {
                f24567iobyxmoadg = new gxszxtbevo();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24567iobyxmoadg;
    }

    protected static String gxszxtbevo(long j13) {
        return (String) f24568zoijcleaow.get(Long.valueOf(j13));
    }

    protected static boolean lqeggnwhkg(long j13) {
        return f24568zoijcleaow.containsKey(Long.valueOf(j13));
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String iobyxmoadg() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.google.firebase.perf.config.jyumaefscl
    protected String ppxfxbqfkf() {
        return "fpr_log_source";
    }

    protected String wkgbmnqykc() {
        return dd.iobyxmoadg.f27850ppxfxbqfkf;
    }
}
