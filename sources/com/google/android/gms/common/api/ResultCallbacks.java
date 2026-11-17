package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(R r13) {
        Status status = r13.getStatus();
        if (status.isSuccess()) {
            onSuccess(r13);
            return;
        }
        onFailure(status);
        if (r13 instanceof Releasable) {
            try {
                ((Releasable) r13).release();
            } catch (RuntimeException e13) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r13)), e13);
            }
        }
    }

    public abstract void onSuccess(R r13);
}
