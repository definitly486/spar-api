package com.yandex.runtime.bindings;

/* JADX INFO: loaded from: classes3.dex */
public class LongHandler implements ArchivingHandler<Long> {
    private final boolean isOptional;

    public LongHandler() {
        this(false);
    }

    public LongHandler(boolean z13) {
        this.isOptional = z13;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Long add(Long l13, Archive archive) {
        return archive.add(l13, this.isOptional);
    }
}
