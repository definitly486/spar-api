package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    static class iobyxmoadg extends AbstractCollection {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final xa.wflxmlrfwp f23640yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Collection f23641zdlpuopuiu;

        iobyxmoadg(Collection collection, xa.wflxmlrfwp wflxmlrfwpVar) {
            this.f23641zdlpuopuiu = collection;
            this.f23640yggfygwlhe = wflxmlrfwpVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            xa.draadjrbmk.wkgbmnqykc(this.f23640yggfygwlhe.apply(obj));
            return this.f23641zdlpuopuiu.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                xa.draadjrbmk.wkgbmnqykc(this.f23640yggfygwlhe.apply(it.next()));
            }
            return this.f23641zdlpuopuiu.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            iwizpuwonk.lqeggnwhkg(this.f23641zdlpuopuiu, this.f23640yggfygwlhe);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (dxjokdxxww.ppxfxbqfkf(this.f23641zdlpuopuiu, obj)) {
                return this.f23640yggfygwlhe.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return dxjokdxxww.iobyxmoadg(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !iwizpuwonk.iobyxmoadg(this.f23641zdlpuopuiu, this.f23640yggfygwlhe);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return cqumvgiudr.lqeggnwhkg(this.f23641zdlpuopuiu.iterator(), this.f23640yggfygwlhe);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f23641zdlpuopuiu.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f23641zdlpuopuiu.iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f23640yggfygwlhe.apply(next) && collection.contains(next)) {
                    it.remove();
                    z13 = true;
                }
            }
            return z13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f23641zdlpuopuiu.iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f23640yggfygwlhe.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z13 = true;
                }
            }
            return z13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = this.f23641zdlpuopuiu.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                if (this.f23640yggfygwlhe.apply(it.next())) {
                    i13++;
                }
            }
            return i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return lereixgezr.lqeggnwhkg(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return lereixgezr.lqeggnwhkg(iterator()).toArray(objArr);
        }
    }

    static boolean iobyxmoadg(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static boolean ppxfxbqfkf(Collection collection, Object obj) {
        xa.draadjrbmk.btonecajqb(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static StringBuilder zoijcleaow(int i13) {
        nufgyqmvbu.zoijcleaow(i13, "size");
        return new StringBuilder((int) Math.min(((long) i13) * 8, 1073741824L));
    }
}
