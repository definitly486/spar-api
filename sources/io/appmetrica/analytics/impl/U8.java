package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class U8 implements StateSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateSerializer f46603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AESEncrypter f46604b;

    public U8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f46603a = stateSerializer;
        this.f46604b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f46603a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f46604b.encrypt(this.f46603a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) throws IOException {
        try {
            return this.f46603a.toState(this.f46604b.decrypt(bArr));
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
