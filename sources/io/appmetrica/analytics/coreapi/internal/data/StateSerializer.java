package io.appmetrica.analytics.coreapi.internal.data;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface StateSerializer<T> {
    T defaultValue();

    byte[] toByteArray(T t13);

    T toState(byte[] bArr) throws IOException;
}
