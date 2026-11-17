package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg extends jztzpxfvev implements Map {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    ppxfxbqfkf f4276cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    eablkybsjg f4277esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    C0076iobyxmoadg f4278iwizpuwonk;

    final class gxszxtbevo extends dxjokdxxww {
        gxszxtbevo() {
            super(iobyxmoadg.this.size());
        }

        @Override // androidx.collection.dxjokdxxww
        protected Object iobyxmoadg(int i13) {
            return iobyxmoadg.this.gtknphoqwx(i13);
        }

        @Override // androidx.collection.dxjokdxxww
        protected void zoijcleaow(int i13) {
            iobyxmoadg.this.dxjokdxxww(i13);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    final class C0076iobyxmoadg extends AbstractSet {
        C0076iobyxmoadg() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return iobyxmoadg.this.new wkgbmnqykc();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return iobyxmoadg.this.size();
        }
    }

    final class wkgbmnqykc implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f4284jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f4285yggfygwlhe = -1;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f4286zdlpuopuiu;

        wkgbmnqykc() {
            this.f4286zdlpuopuiu = iobyxmoadg.this.size() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f4284jyumaefscl) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return jlmebxxoox.iobyxmoadg.ppxfxbqfkf(entry.getKey(), iobyxmoadg.this.gxszxtbevo(this.f4285yggfygwlhe)) && jlmebxxoox.iobyxmoadg.ppxfxbqfkf(entry.getValue(), iobyxmoadg.this.gtknphoqwx(this.f4285yggfygwlhe));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f4284jyumaefscl) {
                return iobyxmoadg.this.gxszxtbevo(this.f4285yggfygwlhe);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f4284jyumaefscl) {
                return iobyxmoadg.this.gtknphoqwx(this.f4285yggfygwlhe);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4285yggfygwlhe < this.f4286zdlpuopuiu;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f4284jyumaefscl) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objGxszxtbevo = iobyxmoadg.this.gxszxtbevo(this.f4285yggfygwlhe);
            Object objGtknphoqwx = iobyxmoadg.this.gtknphoqwx(this.f4285yggfygwlhe);
            return (objGxszxtbevo == null ? 0 : objGxszxtbevo.hashCode()) ^ (objGtknphoqwx != null ? objGtknphoqwx.hashCode() : 0);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f4285yggfygwlhe++;
            this.f4284jyumaefscl = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4284jyumaefscl) {
                throw new IllegalStateException();
            }
            iobyxmoadg.this.dxjokdxxww(this.f4285yggfygwlhe);
            this.f4285yggfygwlhe--;
            this.f4286zdlpuopuiu--;
            this.f4284jyumaefscl = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f4284jyumaefscl) {
                return iobyxmoadg.this.btonecajqb(this.f4285yggfygwlhe, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class zoijcleaow extends dxjokdxxww {
        zoijcleaow() {
            super(iobyxmoadg.this.size());
        }

        @Override // androidx.collection.dxjokdxxww
        protected Object iobyxmoadg(int i13) {
            return iobyxmoadg.this.gxszxtbevo(i13);
        }

        @Override // androidx.collection.dxjokdxxww
        protected void zoijcleaow(int i13) {
            iobyxmoadg.this.dxjokdxxww(i13);
        }
    }

    public iobyxmoadg() {
    }

    static boolean wflxmlrfwp(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean agtfadlqog(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    @Override // androidx.collection.jztzpxfvev, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.jztzpxfvev, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public boolean draadjrbmk(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0076iobyxmoadg c0076iobyxmoadg = this.f4278iwizpuwonk;
        if (c0076iobyxmoadg != null) {
            return c0076iobyxmoadg;
        }
        C0076iobyxmoadg c0076iobyxmoadg2 = new C0076iobyxmoadg();
        this.f4278iwizpuwonk = c0076iobyxmoadg2;
        return c0076iobyxmoadg2;
    }

    @Override // androidx.collection.jztzpxfvev, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f4276cqumvgiudr;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
        this.f4276cqumvgiudr = ppxfxbqfkfVar2;
        return ppxfxbqfkfVar2;
    }

    public boolean ojitshcjhn(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(gxszxtbevo(size2))) {
                dxjokdxxww(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        zoijcleaow(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.jztzpxfvev, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        eablkybsjg eablkybsjgVar = this.f4277esjtqupxsv;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        eablkybsjg eablkybsjgVar2 = new eablkybsjg();
        this.f4277esjtqupxsv = eablkybsjgVar2;
        return eablkybsjgVar2;
    }

    public iobyxmoadg(int i13) {
        super(i13);
    }

    final class eablkybsjg implements Collection {
        eablkybsjg() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            iobyxmoadg.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return iobyxmoadg.this.iobyxmoadg(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return iobyxmoadg.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return iobyxmoadg.this.new gxszxtbevo();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iIobyxmoadg = iobyxmoadg.this.iobyxmoadg(obj);
            if (iIobyxmoadg < 0) {
                return false;
            }
            iobyxmoadg.this.dxjokdxxww(iIobyxmoadg);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = iobyxmoadg.this.size();
            int i13 = 0;
            boolean z13 = false;
            while (i13 < size) {
                if (collection.contains(iobyxmoadg.this.gtknphoqwx(i13))) {
                    iobyxmoadg.this.dxjokdxxww(i13);
                    i13--;
                    size--;
                    z13 = true;
                }
                i13++;
            }
            return z13;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = iobyxmoadg.this.size();
            int i13 = 0;
            boolean z13 = false;
            while (i13 < size) {
                if (!collection.contains(iobyxmoadg.this.gtknphoqwx(i13))) {
                    iobyxmoadg.this.dxjokdxxww(i13);
                    i13--;
                    size--;
                    z13 = true;
                }
                i13++;
            }
            return z13;
        }

        @Override // java.util.Collection
        public int size() {
            return iobyxmoadg.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = iobyxmoadg.this.size();
            Object[] objArr = new Object[size];
            for (int i13 = 0; i13 < size; i13++) {
                objArr[i13] = iobyxmoadg.this.gtknphoqwx(i13);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i13 = 0; i13 < size; i13++) {
                objArr[i13] = iobyxmoadg.this.gtknphoqwx(i13);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    final class ppxfxbqfkf implements Set {
        ppxfxbqfkf() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            iobyxmoadg.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return iobyxmoadg.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return iobyxmoadg.this.draadjrbmk(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return iobyxmoadg.wflxmlrfwp(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = iobyxmoadg.this.size() - 1; size >= 0; size--) {
                Object objGxszxtbevo = iobyxmoadg.this.gxszxtbevo(size);
                iHashCode += objGxszxtbevo == null ? 0 : objGxszxtbevo.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return iobyxmoadg.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return iobyxmoadg.this.new zoijcleaow();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iWkgbmnqykc = iobyxmoadg.this.wkgbmnqykc(obj);
            if (iWkgbmnqykc < 0) {
                return false;
            }
            iobyxmoadg.this.dxjokdxxww(iWkgbmnqykc);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return iobyxmoadg.this.agtfadlqog(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return iobyxmoadg.this.ojitshcjhn(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return iobyxmoadg.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = iobyxmoadg.this.size();
            Object[] objArr = new Object[size];
            for (int i13 = 0; i13 < size; i13++) {
                objArr[i13] = iobyxmoadg.this.gxszxtbevo(i13);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i13 = 0; i13 < size; i13++) {
                objArr[i13] = iobyxmoadg.this.gxszxtbevo(i13);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public iobyxmoadg(jztzpxfvev jztzpxfvevVar) {
        super(jztzpxfvevVar);
    }
}
