package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes2.dex */
public class mbcevpiqjq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static mbcevpiqjq f24452eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f24453iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Boolean f24456zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Boolean f24454ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Queue f24455wkgbmnqykc = new ArrayDeque();

    private mbcevpiqjq() {
    }

    private synchronized String gxszxtbevo(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f24453iobyxmoadg;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f24453iobyxmoadg = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f24453iobyxmoadg = serviceInfo.name;
                    }
                    return this.f24453iobyxmoadg;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + CardDateFormatTextWatcher.DIVIDER_CHARACTER + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int iobyxmoadg(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strGxszxtbevo = gxszxtbevo(context, intent);
        if (strGxszxtbevo != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strGxszxtbevo);
            }
            intent.setClassName(context.getPackageName(), strGxszxtbevo);
        }
        try {
            if (eablkybsjg(context)) {
                componentNameStartService = jztzpxfvev.nufgyqmvbu(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return OkHttpErrorHandlerImpl.HTTP_NOT_FOUND;
        } catch (IllegalStateException e13) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e13);
            return 402;
        } catch (SecurityException e14) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e14);
            return OkHttpErrorHandlerImpl.HTTP_UNAUTHORIZED;
        }
    }

    static synchronized mbcevpiqjq zoijcleaow() {
        try {
            if (f24452eablkybsjg == null) {
                f24452eablkybsjg = new mbcevpiqjq();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24452eablkybsjg;
    }

    boolean eablkybsjg(Context context) {
        if (this.f24456zoijcleaow == null) {
            this.f24456zoijcleaow = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f24456zoijcleaow.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f24456zoijcleaow.booleanValue();
    }

    public int lqeggnwhkg(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f24455wkgbmnqykc.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return iobyxmoadg(context, intent2);
    }

    Intent ppxfxbqfkf() {
        return (Intent) this.f24455wkgbmnqykc.poll();
    }

    boolean wkgbmnqykc(Context context) {
        if (this.f24454ppxfxbqfkf == null) {
            this.f24454ppxfxbqfkf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f24456zoijcleaow.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f24454ppxfxbqfkf.booleanValue();
    }
}
