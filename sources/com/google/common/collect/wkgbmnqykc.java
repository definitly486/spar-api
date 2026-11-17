package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
abstract class wkgbmnqykc extends com.google.common.collect.gxszxtbevo implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private transient Map f23696cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private transient int f23697esjtqupxsv;

    private class btonecajqb extends eablkybsjg implements SortedSet {
        btonecajqb(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return zoijcleaow().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return zoijcleaow().firstKey();
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return wkgbmnqykc.this.new btonecajqb(zoijcleaow().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return zoijcleaow().lastKey();
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return wkgbmnqykc.this.new btonecajqb(zoijcleaow().subMap(obj, obj2));
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return wkgbmnqykc.this.new btonecajqb(zoijcleaow().tailMap(obj));
        }

        SortedMap zoijcleaow() {
            return (SortedMap) super.iobyxmoadg();
        }
    }

    private class dxjokdxxww extends ppxfxbqfkf implements SortedMap {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        SortedSet f23701cqumvgiudr;

        dxjokdxxww(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return dxjokdxxww().comparator();
        }

        SortedMap dxjokdxxww() {
            return (SortedMap) this.f23720jyumaefscl;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return dxjokdxxww().firstKey();
        }

        SortedSet gxszxtbevo() {
            return wkgbmnqykc.this.new btonecajqb(dxjokdxxww());
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            return wkgbmnqykc.this.new dxjokdxxww(dxjokdxxww().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return dxjokdxxww().lastKey();
        }

        @Override // com.google.common.collect.wkgbmnqykc.ppxfxbqfkf, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f23701cqumvgiudr;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetGxszxtbevo = gxszxtbevo();
            this.f23701cqumvgiudr = sortedSetGxszxtbevo;
            return sortedSetGxszxtbevo;
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            return wkgbmnqykc.this.new dxjokdxxww(dxjokdxxww().subMap(obj, obj2));
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            return wkgbmnqykc.this.new dxjokdxxww(dxjokdxxww().tailMap(obj));
        }
    }

    private class eablkybsjg extends zynmafqrjb.wkgbmnqykc {

        class iobyxmoadg implements Iterator {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f23704jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ Iterator f23705yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Map.Entry f23706zdlpuopuiu;

            iobyxmoadg(eablkybsjg eablkybsjgVar, Iterator it) {
                this.f23705yggfygwlhe = it;
                this.f23704jyumaefscl = eablkybsjgVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23705yggfygwlhe.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f23705yggfygwlhe.next();
                this.f23706zdlpuopuiu = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                xa.draadjrbmk.rgvfuqvkyq(this.f23706zdlpuopuiu != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f23706zdlpuopuiu.getValue();
                this.f23705yggfygwlhe.remove();
                wkgbmnqykc.lereixgezr(wkgbmnqykc.this, collection.size());
                collection.clear();
                this.f23706zdlpuopuiu = null;
            }
        }

        eablkybsjg(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            cqumvgiudr.ppxfxbqfkf(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return iobyxmoadg().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || iobyxmoadg().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return iobyxmoadg().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new iobyxmoadg(this, iobyxmoadg().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) iobyxmoadg().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                wkgbmnqykc.lereixgezr(wkgbmnqykc.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    private final class gxszxtbevo extends dxjokdxxww implements NavigableMap {
        gxszxtbevo(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.wkgbmnqykc.dxjokdxxww
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public NavigableMap dxjokdxxww() {
            return (NavigableMap) super.dxjokdxxww();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.wkgbmnqykc.dxjokdxxww
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public NavigableSet gxszxtbevo() {
            return wkgbmnqykc.this.new lqeggnwhkg(dxjokdxxww());
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = dxjokdxxww().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return eablkybsjg(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return dxjokdxxww().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return wkgbmnqykc.this.new gxszxtbevo(dxjokdxxww().descendingMap());
        }

        @Override // com.google.common.collect.wkgbmnqykc.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = dxjokdxxww().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return eablkybsjg(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = dxjokdxxww().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return eablkybsjg(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return dxjokdxxww().floorKey(obj);
        }

        @Override // com.google.common.collect.wkgbmnqykc.dxjokdxxww, java.util.SortedMap
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = dxjokdxxww().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return eablkybsjg(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return dxjokdxxww().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = dxjokdxxww().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return eablkybsjg(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = dxjokdxxww().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return eablkybsjg(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return dxjokdxxww().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // com.google.common.collect.wkgbmnqykc.dxjokdxxww, java.util.SortedMap
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return wflxmlrfwp(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return wflxmlrfwp(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.wkgbmnqykc.dxjokdxxww, java.util.SortedMap
        /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        Map.Entry wflxmlrfwp(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionIstkbnxepw = wkgbmnqykc.this.istkbnxepw();
            collectionIstkbnxepw.addAll((Collection) entry.getValue());
            it.remove();
            return zynmafqrjb.wkgbmnqykc(entry.getKey(), wkgbmnqykc.this.hcddaimhww(collectionIstkbnxepw));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z13) {
            return wkgbmnqykc.this.new gxszxtbevo(dxjokdxxww().headMap(obj, z13));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z13, Object obj2, boolean z14) {
            return wkgbmnqykc.this.new gxszxtbevo(dxjokdxxww().subMap(obj, z13, obj2, z14));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z13) {
            return wkgbmnqykc.this.new gxszxtbevo(dxjokdxxww().tailMap(obj, z13));
        }
    }

    class iobyxmoadg extends AbstractC0406wkgbmnqykc {
        iobyxmoadg() {
            super();
        }

        @Override // com.google.common.collect.wkgbmnqykc.AbstractC0406wkgbmnqykc
        Object iobyxmoadg(Object obj, Object obj2) {
            return obj2;
        }
    }

    private final class lqeggnwhkg extends btonecajqb implements NavigableSet {
        lqeggnwhkg(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return zoijcleaow().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return wkgbmnqykc.this.new lqeggnwhkg(zoijcleaow().descendingMap());
        }

        @Override // com.google.common.collect.wkgbmnqykc.btonecajqb, java.util.SortedSet
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return zoijcleaow().floorKey(obj);
        }

        @Override // com.google.common.collect.wkgbmnqykc.btonecajqb, java.util.SortedSet
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return zoijcleaow().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return zoijcleaow().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return cqumvgiudr.wflxmlrfwp(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return cqumvgiudr.wflxmlrfwp(descendingIterator());
        }

        @Override // com.google.common.collect.wkgbmnqykc.btonecajqb, java.util.SortedSet
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.wkgbmnqykc.btonecajqb
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public NavigableMap zoijcleaow() {
            return (NavigableMap) super.zoijcleaow();
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z13) {
            return wkgbmnqykc.this.new lqeggnwhkg(zoijcleaow().headMap(obj, z13));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z13, Object obj2, boolean z14) {
            return wkgbmnqykc.this.new lqeggnwhkg(zoijcleaow().subMap(obj, z13, obj2, z14));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z13) {
            return wkgbmnqykc.this.new lqeggnwhkg(zoijcleaow().tailMap(obj, z13));
        }
    }

    private class nufgyqmvbu extends draadjrbmk implements RandomAccess {
        nufgyqmvbu(Object obj, List list, gtknphoqwx gtknphoqwxVar) {
            super(obj, list, gtknphoqwxVar);
        }
    }

    private class ppxfxbqfkf extends zynmafqrjb.gxszxtbevo {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final transient Map f23720jyumaefscl;

        class iobyxmoadg extends zynmafqrjb.ppxfxbqfkf {
            iobyxmoadg() {
            }

            @Override // com.google.common.collect.zynmafqrjb.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.dxjokdxxww.ppxfxbqfkf(ppxfxbqfkf.this.f23720jyumaefscl.entrySet(), obj);
            }

            @Override // com.google.common.collect.zynmafqrjb.ppxfxbqfkf
            Map iobyxmoadg() {
                return ppxfxbqfkf.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return ppxfxbqfkf.this.new zoijcleaow();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                wkgbmnqykc.this.ylkuphrtab(entry.getKey());
                return true;
            }
        }

        class zoijcleaow implements Iterator {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Collection f23723yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final Iterator f23724zdlpuopuiu;

            zoijcleaow() {
                this.f23724zdlpuopuiu = ppxfxbqfkf.this.f23720jyumaefscl.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23724zdlpuopuiu.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f23724zdlpuopuiu.next();
                this.f23723yggfygwlhe = (Collection) entry.getValue();
                return ppxfxbqfkf.this.eablkybsjg(entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                xa.draadjrbmk.rgvfuqvkyq(this.f23723yggfygwlhe != null, "no calls to next() since the last call to remove()");
                this.f23724zdlpuopuiu.remove();
                wkgbmnqykc.lereixgezr(wkgbmnqykc.this, this.f23723yggfygwlhe.size());
                this.f23723yggfygwlhe.clear();
                this.f23723yggfygwlhe = null;
            }
        }

        ppxfxbqfkf(Map map) {
            this.f23720jyumaefscl = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f23720jyumaefscl == wkgbmnqykc.this.f23696cqumvgiudr) {
                wkgbmnqykc.this.clear();
            } else {
                cqumvgiudr.ppxfxbqfkf(new zoijcleaow());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return zynmafqrjb.gxszxtbevo(this.f23720jyumaefscl, obj);
        }

        Map.Entry eablkybsjg(Map.Entry entry) {
            Object key = entry.getKey();
            return zynmafqrjb.wkgbmnqykc(key, wkgbmnqykc.this.jpowsppfya(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f23720jyumaefscl.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f23720jyumaefscl.hashCode();
        }

        @Override // com.google.common.collect.zynmafqrjb.gxszxtbevo
        protected Set iobyxmoadg() {
            return new iobyxmoadg();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set keySet() {
            return wkgbmnqykc.this.rgvfuqvkyq();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) zynmafqrjb.lqeggnwhkg(this.f23720jyumaefscl, obj);
            if (collection == null) {
                return null;
            }
            return wkgbmnqykc.this.jpowsppfya(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f23720jyumaefscl.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f23720jyumaefscl.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f23720jyumaefscl.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionIstkbnxepw = wkgbmnqykc.this.istkbnxepw();
            collectionIstkbnxepw.addAll(collection);
            wkgbmnqykc.lereixgezr(wkgbmnqykc.this, collection.size());
            collection.clear();
            return collectionIstkbnxepw;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    private abstract class AbstractC0406wkgbmnqykc implements Iterator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Iterator f23729zdlpuopuiu;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f23728yggfygwlhe = null;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Collection f23727jyumaefscl = null;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Iterator f23726iwizpuwonk = cqumvgiudr.gxszxtbevo();

        AbstractC0406wkgbmnqykc() {
            this.f23729zdlpuopuiu = wkgbmnqykc.this.f23696cqumvgiudr.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23729zdlpuopuiu.hasNext() || this.f23726iwizpuwonk.hasNext();
        }

        abstract Object iobyxmoadg(Object obj, Object obj2);

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f23726iwizpuwonk.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f23729zdlpuopuiu.next();
                this.f23728yggfygwlhe = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f23727jyumaefscl = collection;
                this.f23726iwizpuwonk = collection.iterator();
            }
            return iobyxmoadg(wwaezpbzkn.iobyxmoadg(this.f23728yggfygwlhe), this.f23726iwizpuwonk.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f23726iwizpuwonk.remove();
            Collection collection = this.f23727jyumaefscl;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f23729zdlpuopuiu.remove();
            }
            wkgbmnqykc.jyumaefscl(wkgbmnqykc.this);
        }
    }

    class zoijcleaow extends AbstractC0406wkgbmnqykc {
        zoijcleaow() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.wkgbmnqykc.AbstractC0406wkgbmnqykc
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Map.Entry iobyxmoadg(Object obj, Object obj2) {
            return zynmafqrjb.wkgbmnqykc(obj, obj2);
        }
    }

    protected wkgbmnqykc(Map map) {
        xa.draadjrbmk.wkgbmnqykc(map.isEmpty());
        this.f23696cqumvgiudr = map;
    }

    static /* synthetic */ int cqumvgiudr(wkgbmnqykc wkgbmnqykcVar, int i13) {
        int i14 = wkgbmnqykcVar.f23697esjtqupxsv + i13;
        wkgbmnqykcVar.f23697esjtqupxsv = i14;
        return i14;
    }

    static /* synthetic */ int jyumaefscl(wkgbmnqykc wkgbmnqykcVar) {
        int i13 = wkgbmnqykcVar.f23697esjtqupxsv;
        wkgbmnqykcVar.f23697esjtqupxsv = i13 - 1;
        return i13;
    }

    static /* synthetic */ int lereixgezr(wkgbmnqykc wkgbmnqykcVar, int i13) {
        int i14 = wkgbmnqykcVar.f23697esjtqupxsv - i13;
        wkgbmnqykcVar.f23697esjtqupxsv = i14;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator wwaezpbzkn(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    static /* synthetic */ int yggfygwlhe(wkgbmnqykc wkgbmnqykcVar) {
        int i13 = wkgbmnqykcVar.f23697esjtqupxsv;
        wkgbmnqykcVar.f23697esjtqupxsv = i13 + 1;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ylkuphrtab(Object obj) {
        Collection collection = (Collection) zynmafqrjb.nufgyqmvbu(this.f23696cqumvgiudr, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f23697esjtqupxsv -= size;
        }
    }

    @Override // com.google.common.collect.gxszxtbevo
    Collection agtfadlqog() {
        return new com.google.common.collect.gxszxtbevo.zoijcleaow();
    }

    @Override // com.google.common.collect.gxszxtbevo
    Collection btonecajqb() {
        return new com.google.common.collect.gxszxtbevo.iobyxmoadg();
    }

    Collection cdpycssgdh(Object obj) {
        return istkbnxepw();
    }

    @Override // com.google.common.collect.istkbnxepw
    public void clear() {
        Iterator it = this.f23696cqumvgiudr.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f23696cqumvgiudr.clear();
        this.f23697esjtqupxsv = 0;
    }

    @Override // com.google.common.collect.istkbnxepw
    public Collection get(Object obj) {
        Collection collectionCdpycssgdh = (Collection) this.f23696cqumvgiudr.get(obj);
        if (collectionCdpycssgdh == null) {
            collectionCdpycssgdh = cdpycssgdh(obj);
        }
        return jpowsppfya(obj, collectionCdpycssgdh);
    }

    abstract Collection hcddaimhww(Collection collection);

    final List hkdspvbjdz(Object obj, List list, gtknphoqwx gtknphoqwxVar) {
        return list instanceof RandomAccess ? new nufgyqmvbu(obj, list, gtknphoqwxVar) : new draadjrbmk(obj, list, gtknphoqwxVar);
    }

    @Override // com.google.common.collect.gxszxtbevo, com.google.common.collect.istkbnxepw
    public Collection iobyxmoadg() {
        return super.iobyxmoadg();
    }

    abstract Collection istkbnxepw();

    abstract Collection jpowsppfya(Object obj, Collection collection);

    final Set lmojexxdyd() {
        Map map = this.f23696cqumvgiudr;
        if (map instanceof NavigableMap) {
            return new lqeggnwhkg((NavigableMap) this.f23696cqumvgiudr);
        }
        return map instanceof SortedMap ? new btonecajqb((SortedMap) this.f23696cqumvgiudr) : new eablkybsjg(this.f23696cqumvgiudr);
    }

    @Override // com.google.common.collect.gxszxtbevo
    Iterator ojitshcjhn() {
        return new zoijcleaow();
    }

    final void pkzmftpjix(Map map) {
        this.f23696cqumvgiudr = map;
        this.f23697esjtqupxsv = 0;
        for (Collection collection : map.values()) {
            xa.draadjrbmk.wkgbmnqykc(!collection.isEmpty());
            this.f23697esjtqupxsv += collection.size();
        }
    }

    @Override // com.google.common.collect.istkbnxepw
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f23696cqumvgiudr.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f23697esjtqupxsv++;
            return true;
        }
        Collection collectionCdpycssgdh = cdpycssgdh(obj);
        if (!collectionCdpycssgdh.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f23697esjtqupxsv++;
        this.f23696cqumvgiudr.put(obj, collectionCdpycssgdh);
        return true;
    }

    @Override // com.google.common.collect.istkbnxepw
    public int size() {
        return this.f23697esjtqupxsv;
    }

    @Override // com.google.common.collect.gxszxtbevo, com.google.common.collect.istkbnxepw
    public Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.gxszxtbevo
    Iterator vdvldrhtss() {
        return new iobyxmoadg();
    }

    final Map yadqdtsiqt() {
        Map map = this.f23696cqumvgiudr;
        if (map instanceof NavigableMap) {
            return new gxszxtbevo((NavigableMap) this.f23696cqumvgiudr);
        }
        return map instanceof SortedMap ? new dxjokdxxww((SortedMap) this.f23696cqumvgiudr) : new ppxfxbqfkf(this.f23696cqumvgiudr);
    }

    Map zynmafqrjb() {
        return this.f23696cqumvgiudr;
    }

    class draadjrbmk extends gtknphoqwx implements List {

        private class iobyxmoadg extends gtknphoqwx.iobyxmoadg implements ListIterator {
            iobyxmoadg() {
                super();
            }

            private ListIterator ppxfxbqfkf() {
                return (ListIterator) iobyxmoadg();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = draadjrbmk.this.isEmpty();
                ppxfxbqfkf().add(obj);
                wkgbmnqykc.yggfygwlhe(wkgbmnqykc.this);
                if (zIsEmpty) {
                    draadjrbmk.this.iobyxmoadg();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return ppxfxbqfkf().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return ppxfxbqfkf().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return ppxfxbqfkf().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return ppxfxbqfkf().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                ppxfxbqfkf().set(obj);
            }

            public iobyxmoadg(int i13) {
                super(draadjrbmk.this.dxjokdxxww().listIterator(i13));
            }
        }

        draadjrbmk(Object obj, List list, gtknphoqwx gtknphoqwxVar) {
            super(obj, list, gtknphoqwxVar);
        }

        @Override // java.util.List
        public void add(int i13, Object obj) {
            eablkybsjg();
            boolean zIsEmpty = ppxfxbqfkf().isEmpty();
            dxjokdxxww().add(i13, obj);
            wkgbmnqykc.yggfygwlhe(wkgbmnqykc.this);
            if (zIsEmpty) {
                iobyxmoadg();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i13, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = dxjokdxxww().addAll(i13, collection);
            if (zAddAll) {
                wkgbmnqykc.cqumvgiudr(wkgbmnqykc.this, ppxfxbqfkf().size() - size);
                if (size == 0) {
                    iobyxmoadg();
                }
            }
            return zAddAll;
        }

        List dxjokdxxww() {
            return (List) ppxfxbqfkf();
        }

        @Override // java.util.List
        public Object get(int i13) {
            eablkybsjg();
            return dxjokdxxww().get(i13);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            eablkybsjg();
            return dxjokdxxww().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            eablkybsjg();
            return dxjokdxxww().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            eablkybsjg();
            return new iobyxmoadg();
        }

        @Override // java.util.List
        public Object remove(int i13) {
            eablkybsjg();
            Object objRemove = dxjokdxxww().remove(i13);
            wkgbmnqykc.jyumaefscl(wkgbmnqykc.this);
            gxszxtbevo();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i13, Object obj) {
            eablkybsjg();
            return dxjokdxxww().set(i13, obj);
        }

        @Override // java.util.List
        public List subList(int i13, int i14) {
            eablkybsjg();
            return wkgbmnqykc.this.hkdspvbjdz(wkgbmnqykc(), dxjokdxxww().subList(i13, i14), zoijcleaow() == null ? this : zoijcleaow());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i13) {
            eablkybsjg();
            return new iobyxmoadg(i13);
        }
    }

    class gtknphoqwx extends AbstractCollection {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final Collection f23708iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final gtknphoqwx f23709jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Collection f23710yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Object f23711zdlpuopuiu;

        gtknphoqwx(Object obj, Collection collection, gtknphoqwx gtknphoqwxVar) {
            this.f23711zdlpuopuiu = obj;
            this.f23710yggfygwlhe = collection;
            this.f23709jyumaefscl = gtknphoqwxVar;
            this.f23708iwizpuwonk = gtknphoqwxVar == null ? null : gtknphoqwxVar.ppxfxbqfkf();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            eablkybsjg();
            boolean zIsEmpty = this.f23710yggfygwlhe.isEmpty();
            boolean zAdd = this.f23710yggfygwlhe.add(obj);
            if (zAdd) {
                wkgbmnqykc.yggfygwlhe(wkgbmnqykc.this);
                if (zIsEmpty) {
                    iobyxmoadg();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f23710yggfygwlhe.addAll(collection);
            if (zAddAll) {
                wkgbmnqykc.cqumvgiudr(wkgbmnqykc.this, this.f23710yggfygwlhe.size() - size);
                if (size == 0) {
                    iobyxmoadg();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f23710yggfygwlhe.clear();
            wkgbmnqykc.lereixgezr(wkgbmnqykc.this, size);
            gxszxtbevo();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            eablkybsjg();
            return this.f23710yggfygwlhe.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            eablkybsjg();
            return this.f23710yggfygwlhe.containsAll(collection);
        }

        void eablkybsjg() {
            Collection collection;
            gtknphoqwx gtknphoqwxVar = this.f23709jyumaefscl;
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.eablkybsjg();
                if (this.f23709jyumaefscl.ppxfxbqfkf() != this.f23708iwizpuwonk) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f23710yggfygwlhe.isEmpty() || (collection = (Collection) wkgbmnqykc.this.f23696cqumvgiudr.get(this.f23711zdlpuopuiu)) == null) {
                    return;
                }
                this.f23710yggfygwlhe = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            eablkybsjg();
            return this.f23710yggfygwlhe.equals(obj);
        }

        void gxszxtbevo() {
            gtknphoqwx gtknphoqwxVar = this.f23709jyumaefscl;
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.gxszxtbevo();
            } else if (this.f23710yggfygwlhe.isEmpty()) {
                wkgbmnqykc.this.f23696cqumvgiudr.remove(this.f23711zdlpuopuiu);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            eablkybsjg();
            return this.f23710yggfygwlhe.hashCode();
        }

        void iobyxmoadg() {
            gtknphoqwx gtknphoqwxVar = this.f23709jyumaefscl;
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.iobyxmoadg();
            } else {
                wkgbmnqykc.this.f23696cqumvgiudr.put(this.f23711zdlpuopuiu, this.f23710yggfygwlhe);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            eablkybsjg();
            return new iobyxmoadg();
        }

        Collection ppxfxbqfkf() {
            return this.f23710yggfygwlhe;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            eablkybsjg();
            boolean zRemove = this.f23710yggfygwlhe.remove(obj);
            if (zRemove) {
                wkgbmnqykc.jyumaefscl(wkgbmnqykc.this);
                gxszxtbevo();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f23710yggfygwlhe.removeAll(collection);
            if (zRemoveAll) {
                wkgbmnqykc.cqumvgiudr(wkgbmnqykc.this, this.f23710yggfygwlhe.size() - size);
                gxszxtbevo();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            xa.draadjrbmk.btonecajqb(collection);
            int size = size();
            boolean zRetainAll = this.f23710yggfygwlhe.retainAll(collection);
            if (zRetainAll) {
                wkgbmnqykc.cqumvgiudr(wkgbmnqykc.this, this.f23710yggfygwlhe.size() - size);
                gxszxtbevo();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            eablkybsjg();
            return this.f23710yggfygwlhe.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            eablkybsjg();
            return this.f23710yggfygwlhe.toString();
        }

        Object wkgbmnqykc() {
            return this.f23711zdlpuopuiu;
        }

        gtknphoqwx zoijcleaow() {
            return this.f23709jyumaefscl;
        }

        class iobyxmoadg implements Iterator {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final Collection f23713yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final Iterator f23714zdlpuopuiu;

            iobyxmoadg() {
                Collection collection = gtknphoqwx.this.f23710yggfygwlhe;
                this.f23713yggfygwlhe = collection;
                this.f23714zdlpuopuiu = wkgbmnqykc.wwaezpbzkn(collection);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                zoijcleaow();
                return this.f23714zdlpuopuiu.hasNext();
            }

            Iterator iobyxmoadg() {
                zoijcleaow();
                return this.f23714zdlpuopuiu;
            }

            @Override // java.util.Iterator
            public Object next() {
                zoijcleaow();
                return this.f23714zdlpuopuiu.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f23714zdlpuopuiu.remove();
                wkgbmnqykc.jyumaefscl(wkgbmnqykc.this);
                gtknphoqwx.this.gxszxtbevo();
            }

            void zoijcleaow() {
                gtknphoqwx.this.eablkybsjg();
                if (gtknphoqwx.this.f23710yggfygwlhe != this.f23713yggfygwlhe) {
                    throw new ConcurrentModificationException();
                }
            }

            iobyxmoadg(Iterator it) {
                this.f23713yggfygwlhe = gtknphoqwx.this.f23710yggfygwlhe;
                this.f23714zdlpuopuiu = it;
            }
        }
    }
}
