package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Time implements Serializable {
    private String text;
    private int tzOffset;
    private long value;

    public Time(long j13, int i13, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        this.value = j13;
        this.tzOffset = i13;
        this.text = str;
    }

    public String getText() {
        return this.text;
    }

    public int getTzOffset() {
        return this.tzOffset;
    }

    public long getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.value = archive.add(this.value);
        this.tzOffset = archive.add(this.tzOffset);
        this.text = archive.add(this.text, false);
    }

    public Time() {
    }
}
