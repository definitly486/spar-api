package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public final class Zf implements ProtobufStateStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f46866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f46867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f46868d;

    public Zf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f46865a = str;
        this.f46866b = iBinaryDataHelper;
        this.f46867c = protobufStateSerializer;
        this.f46868d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f46866b.remove(this.f46865a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f46866b.get(this.f46865a);
            if (bArr != null && bArr.length != 0) {
                return this.f46868d.toModel((MessageNano) this.f46867c.toState(bArr));
            }
            return this.f46868d.toModel((MessageNano) this.f46867c.defaultValue());
        } catch (Throwable unused) {
            return this.f46868d.toModel((MessageNano) this.f46867c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f46866b.insert(this.f46865a, this.f46867c.toByteArray((MessageNano) this.f46868d.fromModel(obj)));
    }
}
