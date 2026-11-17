package yzdjzghtvl;

import androidx.compose.runtime.fmlbqenlif;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import hg.stevsuqkhv;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.hcddaimhww;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt implements List, ug.wkgbmnqykc {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f126945iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f126946jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f126947yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final SnapshotStateList f126948zdlpuopuiu;

    public static final class iobyxmoadg implements ListIterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ yadqdtsiqt f126949yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hcddaimhww f126950zdlpuopuiu;

        iobyxmoadg(hcddaimhww hcddaimhwwVar, yadqdtsiqt yadqdtsiqtVar) {
            this.f126950zdlpuopuiu = hcddaimhwwVar;
            this.f126949yggfygwlhe = yadqdtsiqtVar;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f126950zdlpuopuiu.f60014zdlpuopuiu < this.f126949yggfygwlhe.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f126950zdlpuopuiu.f60014zdlpuopuiu >= 0;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void add(Object obj) {
            vdvldrhtss.btonecajqb();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i13 = this.f126950zdlpuopuiu.f60014zdlpuopuiu + 1;
            vdvldrhtss.wflxmlrfwp(i13, this.f126949yggfygwlhe.size());
            this.f126950zdlpuopuiu.f60014zdlpuopuiu = i13;
            return this.f126949yggfygwlhe.get(i13);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f126950zdlpuopuiu.f60014zdlpuopuiu + 1;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public Void set(Object obj) {
            vdvldrhtss.btonecajqb();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i13 = this.f126950zdlpuopuiu.f60014zdlpuopuiu;
            vdvldrhtss.wflxmlrfwp(i13, this.f126949yggfygwlhe.size());
            this.f126950zdlpuopuiu.f60014zdlpuopuiu = i13 - 1;
            return this.f126949yggfygwlhe.get(i13);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f126950zdlpuopuiu.f60014zdlpuopuiu;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            vdvldrhtss.btonecajqb();
            throw new KotlinNothingValueException();
        }
    }

    public yadqdtsiqt(SnapshotStateList snapshotStateList, int i13, int i14) {
        this.f126948zdlpuopuiu = snapshotStateList;
        this.f126947yggfygwlhe = i13;
        this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(snapshotStateList);
        this.f126945iwizpuwonk = i14 - i13;
    }

    private final void ppxfxbqfkf() {
        if (vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu) != this.f126946jyumaefscl) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        ppxfxbqfkf();
        this.f126948zdlpuopuiu.add(this.f126947yggfygwlhe + size(), obj);
        this.f126945iwizpuwonk = size() + 1;
        this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i13, Collection collection) {
        ppxfxbqfkf();
        boolean zAddAll = this.f126948zdlpuopuiu.addAll(i13 + this.f126947yggfygwlhe, collection);
        if (zAddAll) {
            this.f126945iwizpuwonk = size() + collection.size();
            this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            ppxfxbqfkf();
            SnapshotStateList snapshotStateList = this.f126948zdlpuopuiu;
            int i13 = this.f126947yggfygwlhe;
            snapshotStateList.btonecajqb(i13, size() + i13);
            this.f126945iwizpuwonk = 0;
            this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i13) {
        ppxfxbqfkf();
        vdvldrhtss.wflxmlrfwp(i13, size());
        return this.f126948zdlpuopuiu.get(this.f126947yggfygwlhe + i13);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        ppxfxbqfkf();
        int i13 = this.f126947yggfygwlhe;
        Iterator it = zg.gtknphoqwx.jyumaefscl(i13, size() + i13).iterator();
        while (it.hasNext()) {
            int iIobyxmoadg = ((stevsuqkhv) it).iobyxmoadg();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f126948zdlpuopuiu.get(iIobyxmoadg))) {
                return iIobyxmoadg - this.f126947yggfygwlhe;
            }
        }
        return -1;
    }

    public int iobyxmoadg() {
        return this.f126945iwizpuwonk;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ppxfxbqfkf();
        int size = this.f126947yggfygwlhe + size();
        do {
            size--;
            if (size < this.f126947yggfygwlhe) {
                return -1;
            }
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f126948zdlpuopuiu.get(size)));
        return size - this.f126947yggfygwlhe;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i13) {
        return zoijcleaow(i13);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z13 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z13) {
                    z13 = true;
                }
            }
            return z13;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        ppxfxbqfkf();
        SnapshotStateList snapshotStateList = this.f126948zdlpuopuiu;
        int i13 = this.f126947yggfygwlhe;
        int iWflxmlrfwp = snapshotStateList.wflxmlrfwp(collection, i13, size() + i13);
        if (iWflxmlrfwp > 0) {
            this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu);
            this.f126945iwizpuwonk = size() - iWflxmlrfwp;
        }
        return iWflxmlrfwp > 0;
    }

    @Override // java.util.List
    public Object set(int i13, Object obj) {
        vdvldrhtss.wflxmlrfwp(i13, size());
        ppxfxbqfkf();
        Object obj2 = this.f126948zdlpuopuiu.set(i13 + this.f126947yggfygwlhe, obj);
        this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return iobyxmoadg();
    }

    @Override // java.util.List
    public List subList(int i13, int i14) {
        if (!(i13 >= 0 && i13 <= i14 && i14 <= size())) {
            fmlbqenlif.iobyxmoadg("fromIndex or toIndex are out of bounds");
        }
        ppxfxbqfkf();
        SnapshotStateList snapshotStateList = this.f126948zdlpuopuiu;
        int i15 = this.f126947yggfygwlhe;
        return new yadqdtsiqt(snapshotStateList, i13 + i15, i14 + i15);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public Object zoijcleaow(int i13) {
        ppxfxbqfkf();
        Object objRemove = this.f126948zdlpuopuiu.remove(this.f126947yggfygwlhe + i13);
        this.f126945iwizpuwonk = size() - 1;
        this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu);
        return objRemove;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i13) {
        ppxfxbqfkf();
        hcddaimhww hcddaimhwwVar = new hcddaimhww();
        hcddaimhwwVar.f60014zdlpuopuiu = i13 - 1;
        return new iobyxmoadg(hcddaimhwwVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, objArr);
    }

    @Override // java.util.List
    public void add(int i13, Object obj) {
        ppxfxbqfkf();
        this.f126948zdlpuopuiu.add(this.f126947yggfygwlhe + i13, obj);
        this.f126945iwizpuwonk = size() + 1;
        this.f126946jyumaefscl = vdvldrhtss.nufgyqmvbu(this.f126948zdlpuopuiu);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
