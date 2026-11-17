package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kegysxyocb {

    public static abstract class eablkybsjg extends AbstractSet {
        /* synthetic */ eablkybsjg(stevsuqkhv stevsuqkhvVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private eablkybsjg() {
        }
    }

    class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Set f23673yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Set f23674zdlpuopuiu;

        /* JADX INFO: renamed from: com.google.common.collect.kegysxyocb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0404iobyxmoadg extends com.google.common.collect.zoijcleaow {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final Iterator f23676jyumaefscl;

            C0404iobyxmoadg() {
                this.f23676jyumaefscl = iobyxmoadg.this.f23674zdlpuopuiu.iterator();
            }

            @Override // com.google.common.collect.zoijcleaow
            protected Object iobyxmoadg() {
                while (this.f23676jyumaefscl.hasNext()) {
                    Object next = this.f23676jyumaefscl.next();
                    if (iobyxmoadg.this.f23673yggfygwlhe.contains(next)) {
                        return next;
                    }
                }
                return zoijcleaow();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Set set, Set set2) {
            super(null);
            this.f23674zdlpuopuiu = set;
            this.f23673yggfygwlhe = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f23674zdlpuopuiu.contains(obj) && this.f23673yggfygwlhe.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f23674zdlpuopuiu.containsAll(collection) && this.f23673yggfygwlhe.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ulzqkzuiru iterator() {
            return new C0404iobyxmoadg();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f23673yggfygwlhe, this.f23674zdlpuopuiu);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f23674zdlpuopuiu.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                if (this.f23673yggfygwlhe.contains(it.next())) {
                    i13++;
                }
            }
            return i13;
        }
    }

    private static class ppxfxbqfkf extends zoijcleaow implements SortedSet {
        ppxfxbqfkf(SortedSet sortedSet, xa.wflxmlrfwp wflxmlrfwpVar) {
            super(sortedSet, wflxmlrfwpVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f23641zdlpuopuiu).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return cqumvgiudr.nufgyqmvbu(this.f23641zdlpuopuiu.iterator(), this.f23640yggfygwlhe);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new ppxfxbqfkf(((SortedSet) this.f23641zdlpuopuiu).headSet(obj), this.f23640yggfygwlhe);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f23641zdlpuopuiu;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f23640yggfygwlhe.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new ppxfxbqfkf(((SortedSet) this.f23641zdlpuopuiu).subSet(obj, obj2), this.f23640yggfygwlhe);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new ppxfxbqfkf(((SortedSet) this.f23641zdlpuopuiu).tailSet(obj), this.f23640yggfygwlhe);
        }
    }

    static abstract class wkgbmnqykc extends AbstractSet {
        wkgbmnqykc() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return kegysxyocb.dxjokdxxww(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) xa.draadjrbmk.btonecajqb(collection));
        }
    }

    private static class zoijcleaow extends dxjokdxxww.iobyxmoadg implements Set {
        zoijcleaow(Set set, xa.wflxmlrfwp wflxmlrfwpVar) {
            super(set, wflxmlrfwpVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return kegysxyocb.iobyxmoadg(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return kegysxyocb.wkgbmnqykc(this);
        }
    }

    static boolean btonecajqb(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean dxjokdxxww(Set set, Collection collection) {
        xa.draadjrbmk.btonecajqb(collection);
        if (collection instanceof iozdgvuglv) {
            collection = ((iozdgvuglv) collection).i();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? btonecajqb(set, collection.iterator()) : cqumvgiudr.agtfadlqog(set.iterator(), collection);
    }

    public static eablkybsjg eablkybsjg(Set set, Set set2) {
        xa.draadjrbmk.gtknphoqwx(set, "set1");
        xa.draadjrbmk.gtknphoqwx(set2, "set2");
        return new iobyxmoadg(set, set2);
    }

    public static HashSet gxszxtbevo() {
        return new HashSet();
    }

    static boolean iobyxmoadg(Set set, Object obj) {
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

    public static HashSet lqeggnwhkg(int i13) {
        return new HashSet(zynmafqrjb.iobyxmoadg(i13));
    }

    public static Set nufgyqmvbu() {
        return Collections.newSetFromMap(zynmafqrjb.eablkybsjg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet ppxfxbqfkf(SortedSet sortedSet, xa.wflxmlrfwp wflxmlrfwpVar) {
        if (!(sortedSet instanceof zoijcleaow)) {
            return new ppxfxbqfkf((SortedSet) xa.draadjrbmk.btonecajqb(sortedSet), (xa.wflxmlrfwp) xa.draadjrbmk.btonecajqb(wflxmlrfwpVar));
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) sortedSet;
        return new ppxfxbqfkf((SortedSet) zoijcleaowVar.f23641zdlpuopuiu, xa.agtfadlqog.zoijcleaow(zoijcleaowVar.f23640yggfygwlhe, wflxmlrfwpVar));
    }

    static int wkgbmnqykc(Set set) {
        Iterator it = set.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i13 = ~(~(i13 + (next != null ? next.hashCode() : 0)));
        }
        return i13;
    }

    public static Set zoijcleaow(Set set, xa.wflxmlrfwp wflxmlrfwpVar) {
        if (set instanceof SortedSet) {
            return ppxfxbqfkf((SortedSet) set, wflxmlrfwpVar);
        }
        if (!(set instanceof zoijcleaow)) {
            return new zoijcleaow((Set) xa.draadjrbmk.btonecajqb(set), (xa.wflxmlrfwp) xa.draadjrbmk.btonecajqb(wflxmlrfwpVar));
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) set;
        return new zoijcleaow((Set) zoijcleaowVar.f23641zdlpuopuiu, xa.agtfadlqog.zoijcleaow(zoijcleaowVar.f23640yggfygwlhe, wflxmlrfwpVar));
    }
}
