package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan {
    public static int zza(int i13) {
        boolean z13 = true;
        if (i13 != 100 && i13 != 102 && i13 != 104) {
            if (i13 == 105) {
                i13 = 105;
            } else {
                z13 = false;
            }
        }
        Preconditions.checkArgument(z13, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i13));
        return i13;
    }

    public static String zzb(int i13) {
        if (i13 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i13 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i13 == 104) {
            return "LOW_POWER";
        }
        if (i13 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
