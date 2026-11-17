package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class uwvvkdfqfp extends AbstractList implements zynmafqrjb, RandomAccess {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zynmafqrjb f24050zdlpuopuiu;

    class iobyxmoadg implements ListIterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f24052yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        ListIterator f24053zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f24052yggfygwlhe = i13;
            this.f24053zdlpuopuiu = uwvvkdfqfp.this.f24050zdlpuopuiu.listIterator(i13);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f24053zdlpuopuiu.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f24053zdlpuopuiu.hasPrevious();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f24053zdlpuopuiu.nextIndex();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f24053zdlpuopuiu.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f24053zdlpuopuiu.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f24053zdlpuopuiu.next();
        }
    }

    class zoijcleaow implements Iterator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Iterator f24055zdlpuopuiu;

        zoijcleaow() {
            this.f24055zdlpuopuiu = uwvvkdfqfp.this.f24050zdlpuopuiu.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24055zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f24055zdlpuopuiu.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public uwvvkdfqfp(zynmafqrjb zynmafqrjbVar) {
        this.f24050zdlpuopuiu = zynmafqrjbVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public void T(nufgyqmvbu nufgyqmvbuVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public Object getRaw(int i13) {
        return this.f24050zdlpuopuiu.getRaw(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public List getUnderlyingElements() {
        return this.f24050zdlpuopuiu.getUnderlyingElements();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public zynmafqrjb getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new zoijcleaow();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i13) {
        return new iobyxmoadg(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24050zdlpuopuiu.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public String get(int i13) {
        return (String) this.f24050zdlpuopuiu.get(i13);
    }
}
