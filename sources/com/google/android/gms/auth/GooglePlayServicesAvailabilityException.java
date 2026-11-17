package com.google.android.gms.auth;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    GooglePlayServicesAvailabilityException(int i13, String str, Intent intent) {
        super(str, intent);
        this.zza = i13;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
