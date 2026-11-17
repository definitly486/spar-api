package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i13, Parcel parcel, Parcel parcel2, int i14) throws RemoteException {
        if (i13 != 1) {
            return false;
        }
        int i15 = parcel.readInt();
        com.google.android.gms.internal.base.zac.zab(parcel);
        zab(i15);
        return true;
    }
}
