package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzag zzc;

    public final zzah zza(Object obj, Object obj2) {
        int i13 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i14 = i13 + i13;
        if (i14 > length) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i14));
        }
        zzw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i15 = this.zzb;
        int i16 = i15 + i15;
        objArr2[i16] = obj;
        objArr2[i16 + 1] = obj2;
        this.zzb = i15 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.zzc;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.zzb, this.zza, this);
        zzag zzagVar2 = this.zzc;
        if (zzagVar2 == null) {
            return zzaqVarZzg;
        }
        throw zzagVar2.zza();
    }
}
