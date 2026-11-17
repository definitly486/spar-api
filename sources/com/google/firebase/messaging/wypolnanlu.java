package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes2.dex */
abstract class wypolnanlu {
    static void gxszxtbevo(Context context, boolean z13) {
        SharedPreferences.Editor editorEdit = zoijcleaow(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z13);
        editorEdit.apply();
    }

    static void lqeggnwhkg(final Context context, istkbnxepw istkbnxepwVar, final boolean z13) {
        if (PlatformVersion.isAtLeastQ() && !wkgbmnqykc(zoijcleaow(context), z13)) {
            istkbnxepwVar.draadjrbmk(z13).addOnSuccessListener(new l5.zoijcleaow(), new OnSuccessListener() { // from class: com.google.firebase.messaging.dsvhmnatus
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    wypolnanlu.nufgyqmvbu(context, z13);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void nufgyqmvbu(Context context, boolean z13) {
        SharedPreferences.Editor editorEdit = zoijcleaow(context).edit();
        editorEdit.putBoolean("proxy_retention", z13);
        editorEdit.apply();
    }

    static boolean ppxfxbqfkf(Context context) {
        return zoijcleaow(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean wkgbmnqykc(SharedPreferences sharedPreferences, boolean z13) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z13;
    }

    private static SharedPreferences zoijcleaow(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
}
