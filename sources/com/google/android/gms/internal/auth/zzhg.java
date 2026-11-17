package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzhg extends zzhi {
    zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(Object obj, long j13) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j13));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(Object obj, long j13) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j13));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(Object obj, long j13, boolean z13) {
        if (zzhj.zza) {
            zzhj.zzi(obj, j13, z13);
        } else {
            zzhj.zzj(obj, j13, z13);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(Object obj, long j13, double d13) {
        this.zza.putLong(obj, j13, Double.doubleToLongBits(d13));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(Object obj, long j13, float f13) {
        this.zza.putInt(obj, j13, Float.floatToIntBits(f13));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(Object obj, long j13) {
        return zzhj.zza ? zzhj.zzq(obj, j13) : zzhj.zzr(obj, j13);
    }
}
