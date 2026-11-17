package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
interface Schema<T> {
    boolean equals(T t13, T t14);

    int getSerializedSize(T t13);

    int hashCode(T t13);

    boolean isInitialized(T t13);

    void makeImmutable(T t13);

    void mergeFrom(T t13, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t13, T t14);

    void mergeFrom(T t13, byte[] bArr, int i13, int i14, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t13, Writer writer) throws IOException;
}
