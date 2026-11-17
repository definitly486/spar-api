package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq {
    public static int zza(int i13) {
        boolean z13 = true;
        if (i13 != 0 && i13 != 1) {
            if (i13 == 2) {
                i13 = 2;
            } else {
                z13 = false;
            }
        }
        Preconditions.checkArgument(z13, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i13));
        return i13;
    }

    public static String zzb(int i13) {
        if (i13 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i13 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i13 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
