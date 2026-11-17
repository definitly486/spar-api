package com.yandex.mapkit.indoor;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class IndoorLevel implements Serializable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f25449id;
    private boolean isUnderground;
    private String name;

    public IndoorLevel(String str, String str2, boolean z13) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        this.f25449id = str;
        this.name = str2;
        this.isUnderground = z13;
    }

    public String getId() {
        return this.f25449id;
    }

    public boolean getIsUnderground() {
        return this.isUnderground;
    }

    public String getName() {
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f25449id = archive.add(this.f25449id, false);
        this.name = archive.add(this.name, false);
        this.isUnderground = archive.add(this.isUnderground);
    }

    public IndoorLevel() {
    }
}
