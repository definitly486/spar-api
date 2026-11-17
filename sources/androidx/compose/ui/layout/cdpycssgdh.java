package androidx.compose.ui.layout;

import androidx.collection.hkdspvbjdz;
import androidx.collection.sopmlzcsov;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public interface cdpycssgdh {

    public static final class iobyxmoadg implements Collection, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final hkdspvbjdz f6471zdlpuopuiu;

        public iobyxmoadg(hkdspvbjdz hkdspvbjdzVar) {
            this.f6471zdlpuopuiu = hkdspvbjdzVar;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f6471zdlpuopuiu.gtknphoqwx();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f6471zdlpuopuiu.iobyxmoadg(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f6471zdlpuopuiu.iobyxmoadg(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f6471zdlpuopuiu.lqeggnwhkg(obj);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f6471zdlpuopuiu.wkgbmnqykc();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f6471zdlpuopuiu.btonecajqb().iterator();
        }

        public int ppxfxbqfkf() {
            return this.f6471zdlpuopuiu.ppxfxbqfkf();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f6471zdlpuopuiu.cqumvgiudr(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.f6471zdlpuopuiu.cqumvgiudr(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.f6471zdlpuopuiu.zynmafqrjb(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return ppxfxbqfkf();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
        }

        public final hkdspvbjdz zoijcleaow() {
            return this.f6471zdlpuopuiu;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, objArr);
        }

        public /* synthetic */ iobyxmoadg(hkdspvbjdz hkdspvbjdzVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? sopmlzcsov.iobyxmoadg() : hkdspvbjdzVar);
        }
    }

    void iobyxmoadg(iobyxmoadg iobyxmoadgVar);

    boolean zoijcleaow(Object obj, Object obj2);
}
