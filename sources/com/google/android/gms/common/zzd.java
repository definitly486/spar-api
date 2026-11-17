package com.google.android.gms.common;

import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzd {
    static int zza(int i13) {
        int[] iArr = {1, 2, 3};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr[i14];
            int i16 = i15 - 1;
            if (i15 == 0) {
                throw null;
            }
            if (i16 == i13) {
                return i15;
            }
        }
        return 1;
    }
}
