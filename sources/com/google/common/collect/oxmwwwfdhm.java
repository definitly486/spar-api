package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oxmwwwfdhm extends AbstractCollection implements Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final Object[] f23687zdlpuopuiu = new Object[0];

    static abstract class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Object[] f23688iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f23689ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f23690zoijcleaow;

        iobyxmoadg(int i13) {
            nufgyqmvbu.zoijcleaow(i13, "initialCapacity");
            this.f23688iobyxmoadg = new Object[i13];
            this.f23690zoijcleaow = 0;
        }

        private void lqeggnwhkg(int i13) {
            Object[] objArr = this.f23688iobyxmoadg;
            int iPpxfxbqfkf = zoijcleaow.ppxfxbqfkf(objArr.length, this.f23690zoijcleaow + i13);
            if (iPpxfxbqfkf > objArr.length || this.f23689ppxfxbqfkf) {
                this.f23688iobyxmoadg = Arrays.copyOf(this.f23688iobyxmoadg, iPpxfxbqfkf);
                this.f23689ppxfxbqfkf = false;
            }
        }

        public zoijcleaow eablkybsjg(Object... objArr) {
            gxszxtbevo(objArr, objArr.length);
            return this;
        }

        final void gxszxtbevo(Object[] objArr, int i13) {
            ylkuphrtab.ppxfxbqfkf(objArr, i13);
            lqeggnwhkg(i13);
            System.arraycopy(objArr, 0, this.f23688iobyxmoadg, this.f23690zoijcleaow, i13);
            this.f23690zoijcleaow += i13;
        }

        public iobyxmoadg wkgbmnqykc(Object obj) {
            xa.draadjrbmk.btonecajqb(obj);
            lqeggnwhkg(1);
            Object[] objArr = this.f23688iobyxmoadg;
            int i13 = this.f23690zoijcleaow;
            this.f23690zoijcleaow = i13 + 1;
            objArr[i13] = obj;
            return this;
        }

        @Override // com.google.common.collect.oxmwwwfdhm.zoijcleaow
        public zoijcleaow zoijcleaow(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                lqeggnwhkg(collection.size());
                if (collection instanceof oxmwwwfdhm) {
                    this.f23690zoijcleaow = ((oxmwwwfdhm) collection).wkgbmnqykc(this.f23688iobyxmoadg, this.f23690zoijcleaow);
                    return this;
                }
            }
            super.zoijcleaow(iterable);
            return this;
        }
    }

    public static abstract class zoijcleaow {
        zoijcleaow() {
        }

        static int ppxfxbqfkf(int i13, int i14) {
            if (i14 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i14 <= i13) {
                return i13;
            }
            int iHighestOneBit = i13 + (i13 >> 1) + 1;
            if (iHighestOneBit < i14) {
                iHighestOneBit = Integer.highestOneBit(i14 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract zoijcleaow iobyxmoadg(Object obj);

        public zoijcleaow zoijcleaow(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                iobyxmoadg(it.next());
            }
            return this;
        }
    }

    oxmwwwfdhm() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract boolean agtfadlqog();

    int btonecajqb() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    int draadjrbmk() {
        throw new UnsupportedOperationException();
    }

    Object[] dxjokdxxww() {
        return null;
    }

    public abstract zdlpuopuiu iobyxmoadg();

    /* JADX INFO: renamed from: ojitshcjhn */
    public abstract ulzqkzuiru iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f23687zdlpuopuiu);
    }

    abstract int wkgbmnqykc(Object[] objArr, int i13);

    Object writeReplace() {
        return new zdlpuopuiu.ppxfxbqfkf(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        xa.draadjrbmk.btonecajqb(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrDxjokdxxww = dxjokdxxww();
            if (objArrDxjokdxxww != null) {
                return hcddaimhww.iobyxmoadg(objArrDxjokdxxww, draadjrbmk(), btonecajqb(), objArr);
            }
            objArr = ylkuphrtab.wkgbmnqykc(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        wkgbmnqykc(objArr, 0);
        return objArr;
    }
}
