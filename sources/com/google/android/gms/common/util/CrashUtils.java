package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th2) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th2);
            return false;
        } catch (Exception e13) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e13);
            return false;
        }
    }
}
