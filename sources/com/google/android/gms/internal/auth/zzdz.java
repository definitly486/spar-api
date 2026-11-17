package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzdz extends zzec {
    private final int zzc;

    zzdz(byte[] bArr, int i13, int i14) {
        super(bArr);
        zzef.zzi(0, i14, bArr.length);
        this.zzc = i14;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i13) {
        int i14 = this.zzc;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.zza[i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i13);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i13 + ", " + i14);
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    final byte zzb(int i13) {
        return this.zza[i13];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}
