package ag;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo implements Map {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Map f1711zdlpuopuiu;

    private gxszxtbevo(Map map) {
        this.f1711zdlpuopuiu = map;
    }

    public static Map iobyxmoadg(Map map) {
        return new gxszxtbevo(map);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f1711zdlpuopuiu.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f1711zdlpuopuiu.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        if (obj instanceof Class) {
            return this.f1711zdlpuopuiu.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f1711zdlpuopuiu.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public int size() {
        return this.f1711zdlpuopuiu.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f1711zdlpuopuiu.values();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public Object put(Class cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }
}
