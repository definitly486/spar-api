package ipoelvxyzq;

import hg.agtfadlqog;
import hg.jyumaefscl;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.btonecajqb;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements RandomAccess {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f49166iwizpuwonk = 8;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f49167jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private List f49168yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public Object[] f49169zdlpuopuiu;

    private static final class iobyxmoadg implements List, ug.wkgbmnqykc {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ppxfxbqfkf f49170zdlpuopuiu;

        public iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f49170zdlpuopuiu = ppxfxbqfkfVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f49170zdlpuopuiu.zoijcleaow(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i13, Collection collection) {
            return this.f49170zdlpuopuiu.wkgbmnqykc(i13, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f49170zdlpuopuiu.nufgyqmvbu();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f49170zdlpuopuiu.dxjokdxxww(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f49170zdlpuopuiu.btonecajqb(collection);
        }

        @Override // java.util.List
        public Object get(int i13) {
            wkgbmnqykc.iobyxmoadg(this, i13);
            return this.f49170zdlpuopuiu.f49169zdlpuopuiu[i13];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f49170zdlpuopuiu.wflxmlrfwp(obj);
        }

        public int iobyxmoadg() {
            return this.f49170zdlpuopuiu.draadjrbmk();
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f49170zdlpuopuiu.draadjrbmk() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C1048ppxfxbqfkf(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f49170zdlpuopuiu.ojitshcjhn(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C1048ppxfxbqfkf(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i13) {
            return zoijcleaow(i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f49170zdlpuopuiu.vdvldrhtss(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f49170zdlpuopuiu.yggfygwlhe(collection);
        }

        @Override // java.util.List
        public Object set(int i13, Object obj) {
            wkgbmnqykc.iobyxmoadg(this, i13);
            return this.f49170zdlpuopuiu.jyumaefscl(i13, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return iobyxmoadg();
        }

        @Override // java.util.List
        public List subList(int i13, int i14) {
            wkgbmnqykc.zoijcleaow(this, i13, i14);
            return new zoijcleaow(this, i13, i14);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return btonecajqb.iobyxmoadg(this);
        }

        public Object zoijcleaow(int i13) {
            wkgbmnqykc.iobyxmoadg(this, i13);
            return this.f49170zdlpuopuiu.oxmwwwfdhm(i13);
        }

        @Override // java.util.List
        public void add(int i13, Object obj) {
            this.f49170zdlpuopuiu.iobyxmoadg(i13, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f49170zdlpuopuiu.gxszxtbevo(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i13) {
            return new C1048ppxfxbqfkf(this, i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f49170zdlpuopuiu.rgvfuqvkyq(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return btonecajqb.zoijcleaow(this, objArr);
        }
    }

    /* JADX INFO: renamed from: ipoelvxyzq.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static final class C1048ppxfxbqfkf implements ListIterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f49171yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f49172zdlpuopuiu;

        public C1048ppxfxbqfkf(List list, int i13) {
            this.f49172zdlpuopuiu = list;
            this.f49171yggfygwlhe = i13;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f49172zdlpuopuiu.add(this.f49171yggfygwlhe, obj);
            this.f49171yggfygwlhe++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f49171yggfygwlhe < this.f49172zdlpuopuiu.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f49171yggfygwlhe > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f49172zdlpuopuiu;
            int i13 = this.f49171yggfygwlhe;
            this.f49171yggfygwlhe = i13 + 1;
            return list.get(i13);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f49171yggfygwlhe;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i13 = this.f49171yggfygwlhe - 1;
            this.f49171yggfygwlhe = i13;
            return this.f49172zdlpuopuiu.get(i13);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f49171yggfygwlhe - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i13 = this.f49171yggfygwlhe - 1;
            this.f49171yggfygwlhe = i13;
            this.f49172zdlpuopuiu.remove(i13);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f49172zdlpuopuiu.set(this.f49171yggfygwlhe, obj);
        }
    }

    private static final class zoijcleaow implements List, ug.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f49173jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f49174yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f49175zdlpuopuiu;

        public zoijcleaow(List list, int i13, int i14) {
            this.f49175zdlpuopuiu = list;
            this.f49174yggfygwlhe = i13;
            this.f49173jyumaefscl = i14;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f49175zdlpuopuiu;
            int i13 = this.f49173jyumaefscl;
            this.f49173jyumaefscl = i13 + 1;
            list.add(i13, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i13, Collection collection) {
            this.f49175zdlpuopuiu.addAll(i13 + this.f49174yggfygwlhe, collection);
            int size = collection.size();
            this.f49173jyumaefscl += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i13 = this.f49173jyumaefscl - 1;
            int i14 = this.f49174yggfygwlhe;
            if (i14 <= i13) {
                while (true) {
                    this.f49175zdlpuopuiu.remove(i13);
                    if (i13 == i14) {
                        break;
                    } else {
                        i13--;
                    }
                }
            }
            this.f49173jyumaefscl = this.f49174yggfygwlhe;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i13 = this.f49173jyumaefscl;
            for (int i14 = this.f49174yggfygwlhe; i14 < i13; i14++) {
                if (zdlpuopuiu.eablkybsjg(this.f49175zdlpuopuiu.get(i14), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i13) {
            wkgbmnqykc.iobyxmoadg(this, i13);
            return this.f49175zdlpuopuiu.get(i13 + this.f49174yggfygwlhe);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i13 = this.f49173jyumaefscl;
            for (int i14 = this.f49174yggfygwlhe; i14 < i13; i14++) {
                if (zdlpuopuiu.eablkybsjg(this.f49175zdlpuopuiu.get(i14), obj)) {
                    return i14 - this.f49174yggfygwlhe;
                }
            }
            return -1;
        }

        public int iobyxmoadg() {
            return this.f49173jyumaefscl - this.f49174yggfygwlhe;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f49173jyumaefscl == this.f49174yggfygwlhe;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C1048ppxfxbqfkf(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i13 = this.f49173jyumaefscl - 1;
            int i14 = this.f49174yggfygwlhe;
            if (i14 > i13) {
                return -1;
            }
            while (!zdlpuopuiu.eablkybsjg(this.f49175zdlpuopuiu.get(i13), obj)) {
                if (i13 == i14) {
                    return -1;
                }
                i13--;
            }
            return i13 - this.f49174yggfygwlhe;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C1048ppxfxbqfkf(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i13) {
            return zoijcleaow(i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i13 = this.f49173jyumaefscl;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i13 != this.f49173jyumaefscl;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i13 = this.f49173jyumaefscl;
            int i14 = i13 - 1;
            int i15 = this.f49174yggfygwlhe;
            if (i15 <= i14) {
                while (true) {
                    if (!collection.contains(this.f49175zdlpuopuiu.get(i14))) {
                        this.f49175zdlpuopuiu.remove(i14);
                        this.f49173jyumaefscl--;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14--;
                }
            }
            return i13 != this.f49173jyumaefscl;
        }

        @Override // java.util.List
        public Object set(int i13, Object obj) {
            wkgbmnqykc.iobyxmoadg(this, i13);
            return this.f49175zdlpuopuiu.set(i13 + this.f49174yggfygwlhe, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return iobyxmoadg();
        }

        @Override // java.util.List
        public List subList(int i13, int i14) {
            wkgbmnqykc.zoijcleaow(this, i13, i14);
            return new zoijcleaow(this, i13, i14);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return btonecajqb.iobyxmoadg(this);
        }

        public Object zoijcleaow(int i13) {
            wkgbmnqykc.iobyxmoadg(this, i13);
            Object objRemove = this.f49175zdlpuopuiu.remove(i13 + this.f49174yggfygwlhe);
            this.f49173jyumaefscl--;
            return objRemove;
        }

        @Override // java.util.List
        public void add(int i13, Object obj) {
            this.f49175zdlpuopuiu.add(i13 + this.f49174yggfygwlhe, obj);
            this.f49173jyumaefscl++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i13) {
            return new C1048ppxfxbqfkf(this, i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i13 = this.f49173jyumaefscl;
            for (int i14 = this.f49174yggfygwlhe; i14 < i13; i14++) {
                if (zdlpuopuiu.eablkybsjg(this.f49175zdlpuopuiu.get(i14), obj)) {
                    this.f49175zdlpuopuiu.remove(i14);
                    this.f49173jyumaefscl--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return btonecajqb.zoijcleaow(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f49175zdlpuopuiu.addAll(this.f49173jyumaefscl, collection);
            int size = collection.size();
            this.f49173jyumaefscl += size;
            return size > 0;
        }
    }

    public ppxfxbqfkf(Object[] objArr, int i13) {
        this.f49169zdlpuopuiu = objArr;
        this.f49167jyumaefscl = i13;
    }

    public final Object agtfadlqog() {
        if (draadjrbmk() != 0) {
            return this.f49169zdlpuopuiu[draadjrbmk() - 1];
        }
        esjtqupxsv("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean btonecajqb(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dxjokdxxww(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void cqumvgiudr(Comparator comparator) {
        agtfadlqog.stevsuqkhv(this.f49169zdlpuopuiu, comparator, 0, this.f49167jyumaefscl);
    }

    public final int draadjrbmk() {
        return this.f49167jyumaefscl;
    }

    public final boolean dxjokdxxww(Object obj) {
        int iDraadjrbmk = draadjrbmk() - 1;
        if (iDraadjrbmk >= 0) {
            for (int i13 = 0; !zdlpuopuiu.eablkybsjg(this.f49169zdlpuopuiu[i13], obj); i13++) {
                if (i13 != iDraadjrbmk) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean eablkybsjg(int i13, List list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i14 = this.f49167jyumaefscl + size;
        if (this.f49169zdlpuopuiu.length < i14) {
            zdlpuopuiu(i14);
        }
        Object[] objArr = this.f49169zdlpuopuiu;
        int i15 = this.f49167jyumaefscl;
        if (i13 != i15) {
            System.arraycopy(objArr, i13, objArr, i13 + size, i15 - i13);
        }
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            objArr[i13 + i16] = list.get(i16);
        }
        this.f49167jyumaefscl += size;
        return true;
    }

    public final Void esjtqupxsv(String str) {
        throw new NoSuchElementException(str);
    }

    public final Object gtknphoqwx() {
        if (draadjrbmk() != 0) {
            return this.f49169zdlpuopuiu[0];
        }
        esjtqupxsv("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean gxszxtbevo(Collection collection) {
        return wkgbmnqykc(this.f49167jyumaefscl, collection);
    }

    public final void iobyxmoadg(int i13, Object obj) {
        int i14 = this.f49167jyumaefscl + 1;
        if (this.f49169zdlpuopuiu.length < i14) {
            zdlpuopuiu(i14);
        }
        Object[] objArr = this.f49169zdlpuopuiu;
        int i15 = this.f49167jyumaefscl;
        if (i13 != i15) {
            System.arraycopy(objArr, i13, objArr, i13 + 1, i15 - i13);
        }
        objArr[i13] = obj;
        this.f49167jyumaefscl++;
    }

    public final void iwizpuwonk(int i13) {
        this.f49167jyumaefscl = i13;
    }

    public final Object jyumaefscl(int i13, Object obj) {
        Object[] objArr = this.f49169zdlpuopuiu;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    public final void kcexrzcfyt(int i13, int i14) {
        if (i14 > i13) {
            int i15 = this.f49167jyumaefscl;
            if (i14 < i15) {
                Object[] objArr = this.f49169zdlpuopuiu;
                System.arraycopy(objArr, i14, objArr, i13, i15 - i14);
            }
            int i16 = this.f49167jyumaefscl - (i14 - i13);
            int iDraadjrbmk = draadjrbmk() - 1;
            if (i16 <= iDraadjrbmk) {
                int i17 = i16;
                while (true) {
                    this.f49169zdlpuopuiu[i17] = null;
                    if (i17 == iDraadjrbmk) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f49167jyumaefscl = i16;
        }
    }

    public final List lqeggnwhkg() {
        List list = this.f49168yggfygwlhe;
        if (list != null) {
            return list;
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this);
        this.f49168yggfygwlhe = iobyxmoadgVar;
        return iobyxmoadgVar;
    }

    public final void nufgyqmvbu() {
        Object[] objArr = this.f49169zdlpuopuiu;
        int i13 = this.f49167jyumaefscl;
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = null;
        }
        this.f49167jyumaefscl = 0;
    }

    public final int ojitshcjhn(Object obj) {
        Object[] objArr = this.f49169zdlpuopuiu;
        for (int i13 = this.f49167jyumaefscl - 1; i13 >= 0; i13--) {
            if (zdlpuopuiu.eablkybsjg(obj, objArr[i13])) {
                return i13;
            }
        }
        return -1;
    }

    public final Object oxmwwwfdhm(int i13) {
        Object[] objArr = this.f49169zdlpuopuiu;
        Object obj = objArr[i13];
        if (i13 != draadjrbmk() - 1) {
            int i14 = i13 + 1;
            System.arraycopy(objArr, i14, objArr, i13, this.f49167jyumaefscl - i14);
        }
        int i15 = this.f49167jyumaefscl - 1;
        this.f49167jyumaefscl = i15;
        objArr[i15] = null;
        return obj;
    }

    public final boolean ppxfxbqfkf(int i13, ppxfxbqfkf ppxfxbqfkfVar) {
        int i14 = ppxfxbqfkfVar.f49167jyumaefscl;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f49167jyumaefscl + i14;
        if (this.f49169zdlpuopuiu.length < i15) {
            zdlpuopuiu(i15);
        }
        Object[] objArr = this.f49169zdlpuopuiu;
        int i16 = this.f49167jyumaefscl;
        if (i13 != i16) {
            System.arraycopy(objArr, i13, objArr, i13 + i14, i16 - i13);
        }
        System.arraycopy(ppxfxbqfkfVar.f49169zdlpuopuiu, 0, objArr, i13, i14);
        this.f49167jyumaefscl += i14;
        return true;
    }

    public final boolean rgvfuqvkyq(Object obj) {
        int iWflxmlrfwp = wflxmlrfwp(obj);
        if (iWflxmlrfwp < 0) {
            return false;
        }
        oxmwwwfdhm(iWflxmlrfwp);
        return true;
    }

    public final boolean vdvldrhtss(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i13 = this.f49167jyumaefscl;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rgvfuqvkyq(it.next());
        }
        return i13 != this.f49167jyumaefscl;
    }

    public final int wflxmlrfwp(Object obj) {
        Object[] objArr = this.f49169zdlpuopuiu;
        int i13 = this.f49167jyumaefscl;
        for (int i14 = 0; i14 < i13; i14++) {
            if (zdlpuopuiu.eablkybsjg(obj, objArr[i14])) {
                return i14;
            }
        }
        return -1;
    }

    public final boolean wkgbmnqykc(int i13, Collection collection) {
        int i14 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i15 = this.f49167jyumaefscl + size;
        if (this.f49169zdlpuopuiu.length < i15) {
            zdlpuopuiu(i15);
        }
        Object[] objArr = this.f49169zdlpuopuiu;
        int i16 = this.f49167jyumaefscl;
        if (i13 != i16) {
            System.arraycopy(objArr, i13, objArr, i13 + size, i16 - i13);
        }
        for (Object obj : collection) {
            int i17 = i14 + 1;
            if (i14 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            objArr[i14 + i13] = obj;
            i14 = i17;
        }
        this.f49167jyumaefscl += size;
        return true;
    }

    public final boolean yggfygwlhe(Collection collection) {
        int i13 = this.f49167jyumaefscl;
        for (int iDraadjrbmk = draadjrbmk() - 1; -1 < iDraadjrbmk; iDraadjrbmk--) {
            if (!collection.contains(this.f49169zdlpuopuiu[iDraadjrbmk])) {
                oxmwwwfdhm(iDraadjrbmk);
            }
        }
        return i13 != this.f49167jyumaefscl;
    }

    public final void zdlpuopuiu(int i13) {
        Object[] objArr = this.f49169zdlpuopuiu;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i13, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f49169zdlpuopuiu = objArr2;
    }

    public final boolean zoijcleaow(Object obj) {
        int i13 = this.f49167jyumaefscl + 1;
        if (this.f49169zdlpuopuiu.length < i13) {
            zdlpuopuiu(i13);
        }
        Object[] objArr = this.f49169zdlpuopuiu;
        int i14 = this.f49167jyumaefscl;
        objArr[i14] = obj;
        this.f49167jyumaefscl = i14 + 1;
        return true;
    }
}
