package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class zzcx extends zzdc {
    zzcx(zzcz zzczVar, String str, Double d13, boolean z13) {
        super(zzczVar, str, d13, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.zzc + ": " + ((String) obj));
            return null;
        }
    }
}
