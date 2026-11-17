package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final boolean f21128eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final boolean f21129gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final File f21130lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static volatile yggfygwlhe f21131nufgyqmvbu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f21135zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f21133ppxfxbqfkf = true;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AtomicBoolean f21134wkgbmnqykc = new AtomicBoolean(false);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f21132iobyxmoadg = 20000;

    static {
        int i13 = Build.VERSION.SDK_INT;
        f21128eablkybsjg = i13 < 29;
        f21129gxszxtbevo = i13 >= 28;
        f21130lqeggnwhkg = new File("/proc/self/fd");
    }

    yggfygwlhe() {
    }

    private static boolean eablkybsjg() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean iobyxmoadg() {
        return f21128eablkybsjg && !this.f21134wkgbmnqykc.get();
    }

    private int ppxfxbqfkf() {
        if (eablkybsjg()) {
            return 500;
        }
        return this.f21132iobyxmoadg;
    }

    private synchronized boolean wkgbmnqykc() {
        try {
            boolean z13 = true;
            int i13 = this.f21135zoijcleaow + 1;
            this.f21135zoijcleaow = i13;
            if (i13 >= 50) {
                this.f21135zoijcleaow = 0;
                int length = f21130lqeggnwhkg.list().length;
                long jPpxfxbqfkf = ppxfxbqfkf();
                if (length >= jPpxfxbqfkf) {
                    z13 = false;
                }
                this.f21133ppxfxbqfkf = z13;
                if (!z13 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jPpxfxbqfkf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f21133ppxfxbqfkf;
    }

    public static yggfygwlhe zoijcleaow() {
        if (f21131nufgyqmvbu == null) {
            synchronized (yggfygwlhe.class) {
                try {
                    if (f21131nufgyqmvbu == null) {
                        f21131nufgyqmvbu = new yggfygwlhe();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21131nufgyqmvbu;
    }

    public boolean gxszxtbevo(int i13, int i14, boolean z13, boolean z14) {
        if (!z13) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f21129gxszxtbevo) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (iobyxmoadg()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z14) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i13 < 0 || i14 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (wkgbmnqykc()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean lqeggnwhkg(int i13, int i14, BitmapFactory.Options options, boolean z13, boolean z14) {
        boolean zGxszxtbevo = gxszxtbevo(i13, i14, z13, z14);
        if (zGxszxtbevo) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zGxszxtbevo;
    }

    public void nufgyqmvbu() {
        g9.draadjrbmk.iobyxmoadg();
        this.f21134wkgbmnqykc.set(true);
    }
}
