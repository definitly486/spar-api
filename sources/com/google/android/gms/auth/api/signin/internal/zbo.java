package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i13, Parcel parcel, Parcel parcel2, int i14) throws RemoteException {
        if (i13 == 1) {
            zbc();
        } else {
            if (i13 != 2) {
                return false;
            }
            zbb();
        }
        return true;
    }
}
