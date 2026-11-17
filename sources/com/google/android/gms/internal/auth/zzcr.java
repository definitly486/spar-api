package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.iobyxmoadg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcr {
    private static final iobyxmoadg zza = new iobyxmoadg();

    public static synchronized Uri zza(String str) {
        iobyxmoadg iobyxmoadgVar = zza;
        Uri uri = (Uri) iobyxmoadgVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        iobyxmoadgVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
