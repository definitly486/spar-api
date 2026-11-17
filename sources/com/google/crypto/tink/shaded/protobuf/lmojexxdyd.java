package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lmojexxdyd extends LinkedHashMap {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final lmojexxdyd f23963yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f23964zdlpuopuiu;

    static {
        lmojexxdyd lmojexxdydVar = new lmojexxdyd();
        f23963yggfygwlhe = lmojexxdydVar;
        lmojexxdydVar.kcexrzcfyt();
    }

    private lmojexxdyd() {
        this.f23964zdlpuopuiu = true;
    }

    private void agtfadlqog() {
        if (!vdvldrhtss()) {
            throw new UnsupportedOperationException();
        }
    }

    public static lmojexxdyd draadjrbmk() {
        return f23963yggfygwlhe;
    }

    static int iobyxmoadg(Map map) {
        int iWkgbmnqykc = 0;
        for (Map.Entry entry : map.entrySet()) {
            iWkgbmnqykc += wkgbmnqykc(entry.getValue()) ^ wkgbmnqykc(entry.getKey());
        }
        return iWkgbmnqykc;
    }

    private static void lqeggnwhkg(Map map) {
        for (Object obj : map.keySet()) {
            esjtqupxsv.iobyxmoadg(obj);
            esjtqupxsv.iobyxmoadg(map.get(obj));
        }
    }

    private static boolean ojitshcjhn(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean rgvfuqvkyq(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !ojitshcjhn(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static int wkgbmnqykc(Object obj) {
        if (obj instanceof byte[]) {
            return esjtqupxsv.wkgbmnqykc((byte[]) obj);
        }
        if (obj instanceof esjtqupxsv.iobyxmoadg) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        agtfadlqog();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && rgvfuqvkyq(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return iobyxmoadg(this);
    }

    public lmojexxdyd jyumaefscl() {
        return isEmpty() ? new lmojexxdyd() : new lmojexxdyd(this);
    }

    public void kcexrzcfyt() {
        this.f23964zdlpuopuiu = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        agtfadlqog();
        esjtqupxsv.iobyxmoadg(obj);
        esjtqupxsv.iobyxmoadg(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        agtfadlqog();
        lqeggnwhkg(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        agtfadlqog();
        return super.remove(obj);
    }

    public boolean vdvldrhtss() {
        return this.f23964zdlpuopuiu;
    }

    public void zdlpuopuiu(lmojexxdyd lmojexxdydVar) {
        agtfadlqog();
        if (lmojexxdydVar.isEmpty()) {
            return;
        }
        putAll(lmojexxdydVar);
    }

    private lmojexxdyd(Map map) {
        super(map);
        this.f23964zdlpuopuiu = true;
    }
}
