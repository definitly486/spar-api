package com.yandex.runtime.bindings;

/* JADX INFO: loaded from: classes3.dex */
public class BytesHandler implements ArchivingHandler<byte[]> {
    private final boolean isOptional;

    public BytesHandler() {
        this(false);
    }

    public BytesHandler(boolean z13) {
        this.isOptional = z13;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public byte[] add(byte[] bArr, Archive archive) {
        return archive.add(bArr, this.isOptional);
    }
}
