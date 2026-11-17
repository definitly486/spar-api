package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class xrmfcynszj extends AbstractList implements cqumvgiudr, RandomAccess {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final cqumvgiudr f8879zdlpuopuiu;

    class iobyxmoadg implements ListIterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f8881yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        ListIterator f8882zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f8881yggfygwlhe = i13;
            this.f8882zdlpuopuiu = xrmfcynszj.this.f8879zdlpuopuiu.listIterator(i13);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f8882zdlpuopuiu.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f8882zdlpuopuiu.hasPrevious();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f8882zdlpuopuiu.nextIndex();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f8882zdlpuopuiu.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f8882zdlpuopuiu.previousIndex();
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
            return (String) this.f8882zdlpuopuiu.next();
        }
    }

    class zoijcleaow implements Iterator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Iterator f8884zdlpuopuiu;

        zoijcleaow() {
            this.f8884zdlpuopuiu = xrmfcynszj.this.f8879zdlpuopuiu.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8884zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f8884zdlpuopuiu.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public xrmfcynszj(cqumvgiudr cqumvgiudrVar) {
        this.f8879zdlpuopuiu = cqumvgiudrVar;
    }

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public Object getRaw(int i13) {
        return this.f8879zdlpuopuiu.getRaw(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public List getUnderlyingElements() {
        return this.f8879zdlpuopuiu.getUnderlyingElements();
    }

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public cqumvgiudr getUnmodifiableView() {
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

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public void r(gxszxtbevo gxszxtbevoVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8879zdlpuopuiu.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public String get(int i13) {
        return (String) this.f8879zdlpuopuiu.get(i13);
    }
}
