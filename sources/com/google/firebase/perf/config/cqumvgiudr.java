package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class cqumvgiudr {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final gd.iobyxmoadg f24558ppxfxbqfkf = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static cqumvgiudr f24559wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile SharedPreferences f24560iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ExecutorService f24561zoijcleaow;

    public cqumvgiudr(ExecutorService executorService) {
        this.f24561zoijcleaow = executorService;
    }

    public static synchronized cqumvgiudr eablkybsjg() {
        try {
            if (f24559wkgbmnqykc == null) {
                f24559wkgbmnqykc = new cqumvgiudr(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24559wkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nufgyqmvbu(Context context) {
        if (this.f24560iobyxmoadg != null || context == null) {
            return;
        }
        this.f24560iobyxmoadg = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    private Context wkgbmnqykc() {
        try {
            com.google.firebase.gxszxtbevo.draadjrbmk();
            return com.google.firebase.gxszxtbevo.draadjrbmk().gtknphoqwx();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public boolean btonecajqb(String str, double d13) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return false;
            }
        }
        this.f24560iobyxmoadg.edit().putLong(str, Double.doubleToRawLongBits(d13)).apply();
        return true;
    }

    public boolean draadjrbmk(String str, String str2) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f24560iobyxmoadg.edit().remove(str).apply();
            return true;
        }
        this.f24560iobyxmoadg.edit().putString(str, str2).apply();
        return true;
    }

    public synchronized void dxjokdxxww(final Context context) {
        if (this.f24560iobyxmoadg == null && context != null) {
            this.f24561zoijcleaow.execute(new Runnable() { // from class: com.google.firebase.perf.config.iwizpuwonk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24575zdlpuopuiu.nufgyqmvbu(context);
                }
            });
        }
    }

    public boolean gtknphoqwx(String str, long j13) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return false;
            }
        }
        this.f24560iobyxmoadg.edit().putLong(str, j13).apply();
        return true;
    }

    public md.lqeggnwhkg gxszxtbevo(String str) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when getting long value on device cache.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return md.lqeggnwhkg.iobyxmoadg();
            }
        }
        if (!this.f24560iobyxmoadg.contains(str)) {
            return md.lqeggnwhkg.iobyxmoadg();
        }
        try {
            return md.lqeggnwhkg.eablkybsjg(Long.valueOf(this.f24560iobyxmoadg.getLong(str, 0L)));
        } catch (ClassCastException e13) {
            f24558ppxfxbqfkf.zoijcleaow("Key %s from sharedPreferences has type other than long: %s", str, e13.getMessage());
            return md.lqeggnwhkg.iobyxmoadg();
        }
    }

    public md.lqeggnwhkg lqeggnwhkg(String str) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when getting String value on device cache.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return md.lqeggnwhkg.iobyxmoadg();
            }
        }
        if (!this.f24560iobyxmoadg.contains(str)) {
            return md.lqeggnwhkg.iobyxmoadg();
        }
        try {
            return md.lqeggnwhkg.eablkybsjg(this.f24560iobyxmoadg.getString(str, ""));
        } catch (ClassCastException e13) {
            f24558ppxfxbqfkf.zoijcleaow("Key %s from sharedPreferences has type other than String: %s", str, e13.getMessage());
            return md.lqeggnwhkg.iobyxmoadg();
        }
    }

    public md.lqeggnwhkg ppxfxbqfkf(String str) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when getting double value on device cache.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return md.lqeggnwhkg.iobyxmoadg();
            }
        }
        if (!this.f24560iobyxmoadg.contains(str)) {
            return md.lqeggnwhkg.iobyxmoadg();
        }
        try {
            try {
                return md.lqeggnwhkg.eablkybsjg(Double.valueOf(Double.longBitsToDouble(this.f24560iobyxmoadg.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return md.lqeggnwhkg.eablkybsjg(Double.valueOf(Float.valueOf(this.f24560iobyxmoadg.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e13) {
            f24558ppxfxbqfkf.zoijcleaow("Key %s from sharedPreferences has type other than double: %s", str, e13.getMessage());
            return md.lqeggnwhkg.iobyxmoadg();
        }
    }

    public boolean wflxmlrfwp(String str, boolean z13) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return false;
            }
        }
        this.f24560iobyxmoadg.edit().putBoolean(str, z13).apply();
        return true;
    }

    public md.lqeggnwhkg zoijcleaow(String str) {
        if (str == null) {
            f24558ppxfxbqfkf.iobyxmoadg("Key is null when getting boolean value on device cache.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        if (this.f24560iobyxmoadg == null) {
            dxjokdxxww(wkgbmnqykc());
            if (this.f24560iobyxmoadg == null) {
                return md.lqeggnwhkg.iobyxmoadg();
            }
        }
        if (!this.f24560iobyxmoadg.contains(str)) {
            return md.lqeggnwhkg.iobyxmoadg();
        }
        try {
            return md.lqeggnwhkg.eablkybsjg(Boolean.valueOf(this.f24560iobyxmoadg.getBoolean(str, false)));
        } catch (ClassCastException e13) {
            f24558ppxfxbqfkf.zoijcleaow("Key %s from sharedPreferences has type other than long: %s", str, e13.getMessage());
            return md.lqeggnwhkg.iobyxmoadg();
        }
    }
}
