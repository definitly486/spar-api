package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzar {
    public static int zza(int i13) {
        boolean z13 = true;
        if (i13 != 0 && i13 != 1) {
            if (i13 == 2) {
                i13 = 2;
            } else {
                z13 = false;
            }
        }
        Preconditions.checkArgument(z13, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i13));
        return i13;
    }

    public static String zzb(int i13) {
        if (i13 == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i13 == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i13 == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }
}
