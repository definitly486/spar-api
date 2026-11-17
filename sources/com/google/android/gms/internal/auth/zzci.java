package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.jztzpxfvev;

/* JADX INFO: loaded from: classes2.dex */
public final class zzci {
    private final jztzpxfvev zza;

    zzci(jztzpxfvev jztzpxfvevVar) {
        this.zza = jztzpxfvevVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        jztzpxfvev jztzpxfvevVar;
        if (uri != null) {
            jztzpxfvevVar = (jztzpxfvev) this.zza.get(uri.toString());
        } else {
            jztzpxfvevVar = null;
        }
        if (jztzpxfvevVar == null) {
            return null;
        }
        return (String) jztzpxfvevVar.get("".concat(str3));
    }
}
