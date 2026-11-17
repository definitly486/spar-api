package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbh extends zzbd {
    public zzbh() {
        super(4);
    }

    public final zzbh zza(Object obj) {
        obj.getClass();
        int i13 = this.zzb;
        int i14 = i13 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i14) {
            int i15 = length + (length >> 1) + 1;
            if (i15 < i14) {
                int iHighestOneBit = Integer.highestOneBit(i13);
                i15 = iHighestOneBit + iHighestOneBit;
            }
            if (i15 < 0) {
                i15 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i15);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i16 = this.zzb;
        this.zzb = i16 + 1;
        objArr2[i16] = obj;
        return this;
    }

    public final zzbk zzb() {
        this.zzc = true;
        return zzbk.zzg(this.zza, this.zzb);
    }
}
