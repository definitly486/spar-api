package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i13, int i14, long j13, int i15, int i16, int i17, int i18) {
        zzmjVar.zzc(zzc(i13, i14, j13, i15, i16, i17, i18), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i13, int i14, long j13, int i15, int i16, int i17, int i18) {
        zzmjVar.zzc(zzc(i13, i14, j13, i15, i16, i17, i18), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i13, int i14, long j13, int i15, int i16, int i17, int i18) {
        return new zzmt(i13, i14, i17, i15, i16, SystemClock.elapsedRealtime() - j13, i18);
    }
}
