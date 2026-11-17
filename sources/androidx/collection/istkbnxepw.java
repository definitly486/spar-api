package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
class istkbnxepw implements Map, ug.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private czzsidtyhn f4289iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private kcexrzcfyt f4290jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private lqeggnwhkg f4291yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final jlmebxxoox f4292zdlpuopuiu;

    public istkbnxepw(jlmebxxoox parent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        this.f4292zdlpuopuiu = parent;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f4292zdlpuopuiu.ppxfxbqfkf(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f4292zdlpuopuiu.wkgbmnqykc(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return iobyxmoadg();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4292zdlpuopuiu, ((istkbnxepw) obj).f4292zdlpuopuiu);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f4292zdlpuopuiu.eablkybsjg(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f4292zdlpuopuiu.hashCode();
    }

    public Set iobyxmoadg() {
        lqeggnwhkg lqeggnwhkgVar = this.f4291yggfygwlhe;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar;
        }
        lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg(this.f4292zdlpuopuiu);
        this.f4291yggfygwlhe = lqeggnwhkgVar2;
        return lqeggnwhkgVar2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f4292zdlpuopuiu.nufgyqmvbu();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return zoijcleaow();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int ppxfxbqfkf() {
        return this.f4292zdlpuopuiu.f4298eablkybsjg;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return ppxfxbqfkf();
    }

    public String toString() {
        return this.f4292zdlpuopuiu.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return wkgbmnqykc();
    }

    public Collection wkgbmnqykc() {
        czzsidtyhn czzsidtyhnVar = this.f4289iwizpuwonk;
        if (czzsidtyhnVar != null) {
            return czzsidtyhnVar;
        }
        czzsidtyhn czzsidtyhnVar2 = new czzsidtyhn(this.f4292zdlpuopuiu);
        this.f4289iwizpuwonk = czzsidtyhnVar2;
        return czzsidtyhnVar2;
    }

    public Set zoijcleaow() {
        kcexrzcfyt kcexrzcfytVar = this.f4290jyumaefscl;
        if (kcexrzcfytVar != null) {
            return kcexrzcfytVar;
        }
        kcexrzcfyt kcexrzcfytVar2 = new kcexrzcfyt(this.f4292zdlpuopuiu);
        this.f4290jyumaefscl = kcexrzcfytVar2;
        return kcexrzcfytVar2;
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
