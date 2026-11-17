package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn extends rgvfuqvkyq implements Map {
    protected ojitshcjhn() {
    }

    @Override // java.util.Map
    public void clear() {
        zoijcleaow().clear();
    }

    public boolean containsKey(Object obj) {
        return zoijcleaow().containsKey(obj);
    }

    protected int eablkybsjg() {
        return kegysxyocb.wkgbmnqykc(entrySet());
    }

    public Set entrySet() {
        return zoijcleaow().entrySet();
    }

    public Object get(Object obj) {
        return zoijcleaow().get(obj);
    }

    public boolean isEmpty() {
        return zoijcleaow().isEmpty();
    }

    public Set keySet() {
        return zoijcleaow().keySet();
    }

    protected boolean ppxfxbqfkf(Object obj) {
        return zynmafqrjb.zoijcleaow(this, obj);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return zoijcleaow().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        zoijcleaow().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return zoijcleaow().remove(obj);
    }

    public int size() {
        return zoijcleaow().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return zoijcleaow().values();
    }

    protected boolean wkgbmnqykc(Object obj) {
        return zynmafqrjb.ppxfxbqfkf(this, obj);
    }

    protected abstract Map zoijcleaow();
}
