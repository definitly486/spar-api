package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class gxszxtbevo implements istkbnxepw {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private transient Map f23642iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private transient Collection f23643jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private transient Set f23644yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private transient Collection f23645zdlpuopuiu;

    class iobyxmoadg extends yadqdtsiqt.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // com.google.common.collect.yadqdtsiqt.zoijcleaow
        istkbnxepw iobyxmoadg() {
            return gxszxtbevo.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return gxszxtbevo.this.ojitshcjhn();
        }
    }

    class zoijcleaow extends AbstractCollection {
        zoijcleaow() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            gxszxtbevo.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return gxszxtbevo.this.nufgyqmvbu(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return gxszxtbevo.this.vdvldrhtss();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return gxszxtbevo.this.size();
        }
    }

    gxszxtbevo() {
    }

    abstract Collection agtfadlqog();

    abstract Collection btonecajqb();

    abstract Set draadjrbmk();

    abstract Map dxjokdxxww();

    public boolean equals(Object obj) {
        return yadqdtsiqt.iobyxmoadg(this, obj);
    }

    public int hashCode() {
        return wkgbmnqykc().hashCode();
    }

    @Override // com.google.common.collect.istkbnxepw
    public Collection iobyxmoadg() {
        Collection collection = this.f23645zdlpuopuiu;
        if (collection != null) {
            return collection;
        }
        Collection collectionBtonecajqb = btonecajqb();
        this.f23645zdlpuopuiu = collectionBtonecajqb;
        return collectionBtonecajqb;
    }

    @Override // com.google.common.collect.istkbnxepw
    public boolean lqeggnwhkg(Object obj, Object obj2) {
        Collection collection = (Collection) wkgbmnqykc().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean nufgyqmvbu(Object obj) {
        Iterator it = wkgbmnqykc().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Iterator ojitshcjhn();

    @Override // com.google.common.collect.istkbnxepw
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) wkgbmnqykc().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public Set rgvfuqvkyq() {
        Set set = this.f23644yggfygwlhe;
        if (set != null) {
            return set;
        }
        Set setDraadjrbmk = draadjrbmk();
        this.f23644yggfygwlhe = setDraadjrbmk;
        return setDraadjrbmk;
    }

    public String toString() {
        return wkgbmnqykc().toString();
    }

    @Override // com.google.common.collect.istkbnxepw
    public Collection values() {
        Collection collection = this.f23643jyumaefscl;
        if (collection != null) {
            return collection;
        }
        Collection collectionAgtfadlqog = agtfadlqog();
        this.f23643jyumaefscl = collectionAgtfadlqog;
        return collectionAgtfadlqog;
    }

    abstract Iterator vdvldrhtss();

    @Override // com.google.common.collect.istkbnxepw
    public Map wkgbmnqykc() {
        Map map = this.f23642iwizpuwonk;
        if (map != null) {
            return map;
        }
        Map mapDxjokdxxww = dxjokdxxww();
        this.f23642iwizpuwonk = mapDxjokdxxww;
        return mapDxjokdxxww;
    }
}
