package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zynmafqrjb extends LinkedHashMap {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final zynmafqrjb f8907yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f8908zdlpuopuiu;

    static {
        zynmafqrjb zynmafqrjbVar = new zynmafqrjb();
        f8907yggfygwlhe = zynmafqrjbVar;
        zynmafqrjbVar.kcexrzcfyt();
    }

    private zynmafqrjb() {
        this.f8908zdlpuopuiu = true;
    }

    private void agtfadlqog() {
        if (!vdvldrhtss()) {
            throw new UnsupportedOperationException();
        }
    }

    public static zynmafqrjb draadjrbmk() {
        return f8907yggfygwlhe;
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
            zdlpuopuiu.iobyxmoadg(obj);
            zdlpuopuiu.iobyxmoadg(map.get(obj));
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
        return obj instanceof byte[] ? zdlpuopuiu.wkgbmnqykc((byte[]) obj) : obj.hashCode();
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

    public zynmafqrjb jyumaefscl() {
        return isEmpty() ? new zynmafqrjb() : new zynmafqrjb(this);
    }

    public void kcexrzcfyt() {
        this.f8908zdlpuopuiu = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        agtfadlqog();
        zdlpuopuiu.iobyxmoadg(obj);
        zdlpuopuiu.iobyxmoadg(obj2);
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
        return this.f8908zdlpuopuiu;
    }

    public void zdlpuopuiu(zynmafqrjb zynmafqrjbVar) {
        agtfadlqog();
        if (zynmafqrjbVar.isEmpty()) {
            return;
        }
        putAll(zynmafqrjbVar);
    }

    private zynmafqrjb(Map map) {
        super(map);
        this.f8908zdlpuopuiu = true;
    }
}
