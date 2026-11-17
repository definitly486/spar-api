package com.google.android.gms.internal.mlkit_vision_barcode;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzec {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j13, Object obj2, Object obj3) {
        while (!iobyxmoadg.iobyxmoadg(unsafe, obj, j13, obj2, obj3)) {
            if (unsafe.getObject(obj, j13) != obj2) {
                return false;
            }
        }
        return true;
    }
}
