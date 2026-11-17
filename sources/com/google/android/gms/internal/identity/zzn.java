package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    protected final boolean zza(int i13, Parcel parcel, Parcel parcel2, int i14) throws RemoteException {
        if (i13 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean z13 = parcel.readInt() != 0;
        zzc.zzd(parcel);
        zzb(status, z13);
        return true;
    }
}
