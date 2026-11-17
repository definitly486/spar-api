package hg;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class hcddaimhww implements Map, Serializable, ug.iobyxmoadg {
    private static final long serialVersionUID = 8246714829545688274L;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final hcddaimhww f40231zdlpuopuiu = new hcddaimhww();

    private hcddaimhww() {
    }

    private final Object readResolve() {
        return f40231zdlpuopuiu;
    }

    public Collection agtfadlqog() {
        return pkzmftpjix.f40259zdlpuopuiu;
    }

    public Set btonecajqb() {
        return jpowsppfya.f40244zdlpuopuiu;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return iobyxmoadg((Void) obj);
        }
        return false;
    }

    public int draadjrbmk() {
        return 0;
    }

    public Set dxjokdxxww() {
        return jpowsppfya.f40244zdlpuopuiu;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return dxjokdxxww();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    public boolean iobyxmoadg(Void value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        return false;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return btonecajqb();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return draadjrbmk();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return agtfadlqog();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }
}
