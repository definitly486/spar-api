package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class zdlpuopuiu extends AbstractList implements RandomAccess, draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final draadjrbmk f60180zdlpuopuiu;

    class iobyxmoadg implements ListIterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f60182yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        ListIterator f60183zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f60182yggfygwlhe = i13;
            this.f60183zdlpuopuiu = zdlpuopuiu.this.f60180zdlpuopuiu.listIterator(i13);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f60183zdlpuopuiu.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f60183zdlpuopuiu.hasPrevious();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f60183zdlpuopuiu.nextIndex();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f60183zdlpuopuiu.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f60183zdlpuopuiu.previousIndex();
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
            return (String) this.f60183zdlpuopuiu.next();
        }
    }

    class zoijcleaow implements Iterator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Iterator f60185zdlpuopuiu;

        zoijcleaow() {
            this.f60185zdlpuopuiu = zdlpuopuiu.this.f60180zdlpuopuiu.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60185zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f60185zdlpuopuiu.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zdlpuopuiu(draadjrbmk draadjrbmkVar) {
        this.f60180zdlpuopuiu = draadjrbmkVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public wkgbmnqykc getByteString(int i13) {
        return this.f60180zdlpuopuiu.getByteString(i13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public List getUnderlyingElements() {
        return this.f60180zdlpuopuiu.getUnderlyingElements();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public draadjrbmk getUnmodifiableView() {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public void mhtqkkgtqm(wkgbmnqykc wkgbmnqykcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f60180zdlpuopuiu.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public String get(int i13) {
        return (String) this.f60180zdlpuopuiu.get(i13);
    }
}
