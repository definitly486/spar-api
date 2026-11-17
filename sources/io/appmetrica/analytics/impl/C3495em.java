package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3495em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f47187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to f47188b;

    public C3495em(ProtobufStateStorage protobufStateStorage, to toVar) {
        this.f47187a = protobufStateStorage;
        this.f47188b = toVar;
    }

    public C3495em(Context context) {
        this(Qm.a(C3621jm.class).a(context), Ia.j().B().a());
    }
}
