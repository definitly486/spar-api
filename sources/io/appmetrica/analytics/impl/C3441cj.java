package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3441cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f47029b;

    public C3441cj(Context context, SafePackageManager safePackageManager) {
        this.f47028a = context;
        this.f47029b = safePackageManager;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f47029b;
        Context context = this.f47028a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 4096);
        if (packageInfo == null) {
            return arrayList;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i13 = 0; i13 < strArr.length; i13++) {
            String str = strArr[i13];
            if (iArr == null || iArr.length <= i13 || (iArr[i13] & 2) == 0) {
                arrayList.add(new PermissionState(str, false));
            } else {
                arrayList.add(new PermissionState(str, true));
            }
        }
        return arrayList;
    }
}
