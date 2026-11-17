package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i13, Parcel parcel, Parcel parcel2, int i14) throws RemoteException {
        if (i13 != 1) {
            if (i13 != 2) {
                return false;
            }
            int i15 = com.google.android.gms.internal.auth.zzc.zza;
            int i16 = parcel.readInt();
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzc(i16 != 0);
        } else {
            Account account = (Account) com.google.android.gms.internal.auth.zzc.zza(parcel, Account.CREATOR);
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
