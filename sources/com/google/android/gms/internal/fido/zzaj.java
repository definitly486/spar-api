package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaj {
    private final String zza;
    private final zzah zzb;
    private zzah zzc;

    /* synthetic */ zzaj(String str, zzai zzaiVar) {
        zzah zzahVar = new zzah(null);
        this.zzb = zzahVar;
        this.zzc = zzahVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(32);
        sb3.append(this.zza);
        sb3.append('{');
        zzah zzahVar = this.zzb.zzc;
        String str = "";
        while (zzahVar != null) {
            Object obj = zzahVar.zzb;
            boolean z13 = zzahVar instanceof zzaf;
            sb3.append(str);
            String str2 = zzahVar.zza;
            if (str2 != null) {
                sb3.append(str2);
                sb3.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb3.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb3.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzahVar = zzahVar.zzc;
            str = ", ";
        }
        sb3.append('}');
        return sb3.toString();
    }

    public final zzaj zza(String str, int i13) {
        String strValueOf = String.valueOf(i13);
        zzaf zzafVar = new zzaf(null);
        this.zzc.zzc = zzafVar;
        this.zzc = zzafVar;
        zzafVar.zzb = strValueOf;
        zzafVar.zza = "errorCode";
        return this;
    }

    public final zzaj zzb(String str, Object obj) {
        zzah zzahVar = new zzah(null);
        this.zzc.zzc = zzahVar;
        this.zzc = zzahVar;
        zzahVar.zzb = obj;
        zzahVar.zza = str;
        return this;
    }
}
