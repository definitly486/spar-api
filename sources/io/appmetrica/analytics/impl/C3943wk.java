package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3943wk implements InterfaceC3461dd {
    @Override // io.appmetrica.analytics.impl.InterfaceC3461dd
    public final void a(Context context) {
        Rm rmA = Qm.a(C3621jm.class);
        ProtobufStateStorage<Object> protobufStateStorageA = rmA.a(context, rmA.d(context));
        C3621jm c3621jm = (C3621jm) protobufStateStorageA.read();
        C3596im c3596imA = c3621jm.a(c3621jm.f47556m);
        c3596imA.f47476o = 0L;
        protobufStateStorageA.save(new C3621jm(c3596imA));
    }
}
