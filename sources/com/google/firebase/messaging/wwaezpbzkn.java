package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class wwaezpbzkn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f24511eablkybsjg = 0;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f24512iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f24513ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f24514wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f24515zoijcleaow;

    wwaezpbzkn(Context context) {
        this.f24512iobyxmoadg = context;
    }

    private PackageInfo gxszxtbevo(String str) {
        try {
            return this.f24512iobyxmoadg.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e13) {
            Log.w("FirebaseMessaging", "Failed to find package " + e13);
            return null;
        }
    }

    private synchronized void nufgyqmvbu() {
        PackageInfo packageInfoGxszxtbevo = gxszxtbevo(this.f24512iobyxmoadg.getPackageName());
        if (packageInfoGxszxtbevo != null) {
            this.f24515zoijcleaow = Integer.toString(packageInfoGxszxtbevo.versionCode);
            this.f24513ppxfxbqfkf = packageInfoGxszxtbevo.versionName;
        }
    }

    static String ppxfxbqfkf(com.google.firebase.gxszxtbevo gxszxtbevoVar) {
        String strWkgbmnqykc = gxszxtbevoVar.agtfadlqog().wkgbmnqykc();
        if (strWkgbmnqykc != null) {
            return strWkgbmnqykc;
        }
        String strPpxfxbqfkf = gxszxtbevoVar.agtfadlqog().ppxfxbqfkf();
        if (!strPpxfxbqfkf.startsWith("1:")) {
            return strPpxfxbqfkf;
        }
        String[] strArrSplit = strPpxfxbqfkf.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    synchronized int eablkybsjg() {
        int i13 = this.f24511eablkybsjg;
        if (i13 != 0) {
            return i13;
        }
        PackageManager packageManager = this.f24512iobyxmoadg.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f24511eablkybsjg = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f24511eablkybsjg = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f24511eablkybsjg = 2;
        } else {
            this.f24511eablkybsjg = 1;
        }
        return this.f24511eablkybsjg;
    }

    synchronized String iobyxmoadg() {
        try {
            if (this.f24515zoijcleaow == null) {
                nufgyqmvbu();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24515zoijcleaow;
    }

    boolean lqeggnwhkg() {
        return eablkybsjg() != 0;
    }

    synchronized int wkgbmnqykc() {
        PackageInfo packageInfoGxszxtbevo;
        try {
            if (this.f24514wkgbmnqykc == 0 && (packageInfoGxszxtbevo = gxszxtbevo("com.google.android.gms")) != null) {
                this.f24514wkgbmnqykc = packageInfoGxszxtbevo.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24514wkgbmnqykc;
    }

    synchronized String zoijcleaow() {
        try {
            if (this.f24513ppxfxbqfkf == null) {
                nufgyqmvbu();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24513ppxfxbqfkf;
    }
}
