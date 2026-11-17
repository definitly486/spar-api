package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzeh extends zzej {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzeh(byte[] bArr, int i13, int i14, boolean z13, zzeg zzegVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i13) throws zzfb {
        int i14 = this.zze;
        this.zze = 0;
        int i15 = this.zzc + this.zzd;
        this.zzc = i15;
        if (i15 > 0) {
            this.zzd = i15;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i14;
    }
}
