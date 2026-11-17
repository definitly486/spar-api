package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg implements Map.Entry {
    eablkybsjg() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return xa.dxjokdxxww.iobyxmoadg(getKey(), entry.getKey()) && xa.dxjokdxxww.iobyxmoadg(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
