package com.yandex.runtime.bindings;

/* JADX INFO: loaded from: classes3.dex */
public class IntegerHandler implements ArchivingHandler<Integer> {
    private final boolean isOptional;

    public IntegerHandler() {
        this(false);
    }

    public IntegerHandler(boolean z13) {
        this.isOptional = z13;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Integer add(Integer num, Archive archive) {
        return archive.add(num, this.isOptional);
    }
}
