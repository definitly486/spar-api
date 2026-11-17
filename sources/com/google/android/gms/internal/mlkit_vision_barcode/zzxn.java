package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxn {
    public static zzxn zzg(Iterable iterable, int i13, int i14, float f13) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i13;
        int iMin2 = i14;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f14 = i13;
        float f15 = i14;
        return new zzxg((iMin + 0.0f) / f14, (iMin2 + 0.0f) / f15, (iMax + 0.0f) / f14, (iMax2 + 0.0f) / f15, 0.0f);
    }

    abstract float zza();

    abstract float zzb();

    abstract float zzc();

    abstract float zzd();

    abstract float zze();

    final float zzf() {
        if (zzh()) {
            return (zzb() - zzc()) * (zzd() - zze());
        }
        return 0.0f;
    }

    final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }
}
