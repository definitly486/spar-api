package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzav {
    private final String zza;
    private final zzat zzb;
    private zzat zzc;

    /* synthetic */ zzav(String str, zzau zzauVar) {
        zzat zzatVar = new zzat();
        this.zzb = zzatVar;
        this.zzc = zzatVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(32);
        sb3.append(this.zza);
        sb3.append('{');
        zzat zzatVar = this.zzb.zzb;
        String str = "";
        while (zzatVar != null) {
            Object obj = zzatVar.zza;
            sb3.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb3.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb3.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzatVar = zzatVar.zzb;
            str = ", ";
        }
        sb3.append('}');
        return sb3.toString();
    }

    public final zzav zza(Object obj) {
        zzat zzatVar = new zzat();
        this.zzc.zzb = zzatVar;
        this.zzc = zzatVar;
        zzatVar.zza = obj;
        return this;
    }
}
