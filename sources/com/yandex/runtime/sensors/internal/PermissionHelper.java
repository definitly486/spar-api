package com.yandex.runtime.sensors.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.yandex.runtime.Runtime;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionHelper {
    private static final String TAG = "com.yandex.runtime.sensors.internal.PermissionHelper";

    public static boolean checkPermissions(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        try {
            Context applicationContext = Runtime.getApplicationContext();
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (String str : strArr) {
                    int i13 = 0;
                    while (true) {
                        String[] strArr2 = packageInfo.requestedPermissions;
                        if (i13 >= strArr2.length) {
                            return false;
                        }
                        if ((packageInfo.requestedPermissionsFlags[i13] & 2) != 0 && strArr2[i13].equals(str)) {
                            break;
                        }
                        i13++;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e13) {
            Log.e(TAG, "Exception of calling getPackageInfo", e13);
            return false;
        }
    }
}
