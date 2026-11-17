package com.yandex.runtime.bindings;

/* JADX INFO: loaded from: classes3.dex */
public class StringHandler implements ArchivingHandler<String> {
    private final boolean isOptional;

    public StringHandler() {
        this(false);
    }

    public StringHandler(boolean z13) {
        this.isOptional = z13;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public String add(String str, Archive archive) {
        return archive.add(str, this.isOptional);
    }
}
