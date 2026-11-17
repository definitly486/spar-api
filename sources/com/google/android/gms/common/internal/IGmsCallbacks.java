package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i13, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zzb(int i13, Bundle bundle) throws RemoteException;

    void zzc(int i13, IBinder iBinder, zzk zzkVar) throws RemoteException;
}
