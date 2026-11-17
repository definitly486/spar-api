package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class zzcl extends zzcm {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzcl(int i13) {
    }

    private final void zzd(int i13) {
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

    public final zzcl zza(Object obj) {
        obj.getClass();
        zzd(this.zzb + 1);
        Object[] objArr = this.zza;
        int i13 = this.zzb;
        this.zzb = i13 + 1;
        objArr[i13] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcm
    public /* bridge */ /* synthetic */ zzcm zzb(Object obj) {
        throw null;
    }

    public final zzcm zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzd(this.zzb + collection.size());
            if (collection instanceof zzcn) {
                this.zzb = ((zzcn) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}
