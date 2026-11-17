package com.google.firebase.installations;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static nufgyqmvbu f24276wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xc.iobyxmoadg f24278iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final long f24277zoijcleaow = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Pattern f24275ppxfxbqfkf = Pattern.compile("\\AA[\\w-]{38}\\z");

    private nufgyqmvbu(xc.iobyxmoadg iobyxmoadgVar) {
        this.f24278iobyxmoadg = iobyxmoadgVar;
    }

    static boolean lqeggnwhkg(String str) {
        return f24275ppxfxbqfkf.matcher(str).matches();
    }

    static boolean nufgyqmvbu(String str) {
        return str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
    }

    public static nufgyqmvbu ppxfxbqfkf() {
        return wkgbmnqykc(xc.zoijcleaow.iobyxmoadg());
    }

    public static nufgyqmvbu wkgbmnqykc(xc.iobyxmoadg iobyxmoadgVar) {
        if (f24276wkgbmnqykc == null) {
            f24276wkgbmnqykc = new nufgyqmvbu(iobyxmoadgVar);
        }
        return f24276wkgbmnqykc;
    }

    public long eablkybsjg() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean gxszxtbevo(vc.wkgbmnqykc wkgbmnqykcVar) {
        return TextUtils.isEmpty(wkgbmnqykcVar.zoijcleaow()) || wkgbmnqykcVar.nufgyqmvbu() + wkgbmnqykcVar.ppxfxbqfkf() < zoijcleaow() + f24277zoijcleaow;
    }

    public long iobyxmoadg() {
        return this.f24278iobyxmoadg.currentTimeMillis();
    }

    public long zoijcleaow() {
        return TimeUnit.MILLISECONDS.toSeconds(iobyxmoadg());
    }
}
