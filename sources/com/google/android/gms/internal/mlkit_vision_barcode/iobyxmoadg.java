package com.google.android.gms.internal.mlkit_vision_barcode;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class iobyxmoadg {
    public static /* synthetic */ boolean iobyxmoadg(Unsafe unsafe, Object obj, long j13, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j13, obj2, obj3)) {
            if (unsafe.getObject(obj, j13) != obj2) {
                return false;
            }
        }
        return true;
    }
}
