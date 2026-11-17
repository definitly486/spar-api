package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z13, int i13, int i14, String str, Throwable th2) {
        this.zza = z13;
        this.zzd = i13;
        this.zzb = str;
        this.zzc = th2;
    }

    @Deprecated
    static zzx zzb() {
        return zze;
    }

    static zzx zzc(String str) {
        return new zzx(false, 1, 5, str, null);
    }

    static zzx zzd(String str, Throwable th2) {
        return new zzx(false, 1, 5, str, th2);
    }

    static zzx zzf(int i13) {
        return new zzx(true, i13, 1, null, null);
    }

    static zzx zzg(int i13, int i14, String str, Throwable th2) {
        return new zzx(false, i13, i14, str, th2);
    }

    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
