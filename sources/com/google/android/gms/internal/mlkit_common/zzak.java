package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak {
    static Object[] zza(Object[] objArr, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (objArr[i14] == null) {
                throw new NullPointerException("at index " + i14);
            }
        }
        return objArr;
    }
}
