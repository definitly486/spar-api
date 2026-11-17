package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes2.dex */
public class zzaa {
    zzaa() {
    }

    static int zza(int i13, int i14) {
        if (i14 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i15 = i13 + (i13 >> 1) + 1;
        if (i15 < i14) {
            int iHighestOneBit = Integer.highestOneBit(i14 - 1);
            i15 = iHighestOneBit + iHighestOneBit;
        }
        if (i15 < 0) {
            return Integer.MAX_VALUE;
        }
        return i15;
    }
}
