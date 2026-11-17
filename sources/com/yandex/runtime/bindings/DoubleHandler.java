package com.yandex.runtime.bindings;

/* JADX INFO: loaded from: classes3.dex */
public class DoubleHandler implements ArchivingHandler<Double> {
    private final boolean isOptional;

    public DoubleHandler() {
        this(false);
    }

    public DoubleHandler(boolean z13) {
        this.isOptional = z13;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Double add(Double d13, Archive archive) {
        return archive.add(d13, this.isOptional);
    }
}
