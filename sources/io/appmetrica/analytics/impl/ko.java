package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: loaded from: classes3.dex */
public final class ko implements InterfaceC3510fb {
    @Override // io.appmetrica.analytics.impl.InterfaceC3510fb
    public final String a(Context context) {
        ProtobufStateStorage<Object> protobufStateStorageA;
        C3621jm c3621jm;
        try {
            Rm rmA = Qm.a(C3621jm.class);
            if (rmA != null && (protobufStateStorageA = rmA.a(context, rmA.c(context))) != null && (c3621jm = (C3621jm) protobufStateStorageA.read()) != null) {
                return c3621jm.f47544a;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
