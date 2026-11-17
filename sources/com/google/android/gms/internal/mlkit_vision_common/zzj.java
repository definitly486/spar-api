package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzj extends zzk {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzj(int i13) {
    }

    private final void zzb(int i13) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i13) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i14 = length + (length >> 1) + 1;
        if (i14 < i13) {
            int iHighestOneBit = Integer.highestOneBit(i13 - 1);
            i14 = iHighestOneBit + iHighestOneBit;
        }
        if (i14 < 0) {
            i14 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i14);
        this.zzc = false;
    }

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i13 = this.zzb;
        this.zzb = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
