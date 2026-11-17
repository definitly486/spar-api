package com.google.android.gms.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzy {
    static int zza(int i13) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i14 = 0; i14 < 6; i14++) {
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
