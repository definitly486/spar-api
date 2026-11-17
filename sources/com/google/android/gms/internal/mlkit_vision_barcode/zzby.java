package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes2.dex */
final class zzby {
    static int zza(int i13, String str) {
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i13);
    }

    static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
