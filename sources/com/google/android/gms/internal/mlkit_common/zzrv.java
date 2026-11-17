package com.google.android.gms.internal.mlkit_common;

import ge.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
final class zzrv extends zzsi {
    private zzmu zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private draadjrbmk zze;
    private zzna zzf;
    private int zzg;
    private byte zzh;

    zzrv() {
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zza(zzna zznaVar) {
        if (zznaVar == null) {
            throw new NullPointerException("Null downloadStatus");
        }
        this.zzf = zznaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzb(zzmu zzmuVar) {
        if (zzmuVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.zza = zzmuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzc(int i13) {
        this.zzg = i13;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzd(draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            throw new NullPointerException("Null modelType");
        }
        this.zze = draadjrbmkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zze(boolean z13) {
        this.zzd = z13;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzf(boolean z13) {
        this.zzc = z13;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzsi zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsj zzh() {
        zzmu zzmuVar;
        String str;
        draadjrbmk draadjrbmkVar;
        zzna zznaVar;
        if (this.zzh == 7 && (zzmuVar = this.zza) != null && (str = this.zzb) != null && (draadjrbmkVar = this.zze) != null && (zznaVar = this.zzf) != null) {
            return new zzrx(zzmuVar, str, this.zzc, this.zzd, draadjrbmkVar, zznaVar, this.zzg, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.zza == null) {
            sb3.append(" errorCode");
        }
        if (this.zzb == null) {
            sb3.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb3.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb3.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb3.append(" modelType");
        }
        if (this.zzf == null) {
            sb3.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb3.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
    }
}
