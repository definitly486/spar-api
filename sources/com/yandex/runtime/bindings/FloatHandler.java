package com.yandex.runtime.bindings;

/* JADX INFO: loaded from: classes3.dex */
public class FloatHandler implements ArchivingHandler<Float> {
    private final boolean isOptional;

    public FloatHandler() {
        this(false);
    }

    public FloatHandler(boolean z13) {
        this.isOptional = z13;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Float add(Float f13, Archive archive) {
        return archive.add(f13, this.isOptional);
    }
}
