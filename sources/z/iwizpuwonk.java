package z;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk implements List, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private androidx.collection.jpowsppfya f127024zdlpuopuiu = new androidx.collection.jpowsppfya(16);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private androidx.collection.wwaezpbzkn f127023yggfygwlhe = new androidx.collection.wwaezpbzkn(16);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f127022jyumaefscl = -1;

    private final class zoijcleaow implements List, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f127030yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f127031zdlpuopuiu;

        public zoijcleaow(int i13, int i14) {
            this.f127031zdlpuopuiu = i13;
            this.f127030yggfygwlhe = i14;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i13, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i13, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) {
                return iobyxmoadg((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int eablkybsjg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
            int i13 = this.f127030yggfygwlhe;
            int i14 = this.f127031zdlpuopuiu;
            if (i14 > i13) {
                return -1;
            }
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iwizpuwonk.this.f127024zdlpuopuiu.wkgbmnqykc(i13), ppxfxbqfkfVar)) {
                if (i13 == i14) {
                    return -1;
                }
                i13--;
            }
            return i13 - this.f127031zdlpuopuiu;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) {
                return wkgbmnqykc((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj);
            }
            return -1;
        }

        public boolean iobyxmoadg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
            return indexOf(ppxfxbqfkfVar) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            iwizpuwonk iwizpuwonkVar = iwizpuwonk.this;
            int i13 = this.f127031zdlpuopuiu;
            return iwizpuwonkVar.new iobyxmoadg(i13, i13, this.f127030yggfygwlhe);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) {
                return eablkybsjg((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            iwizpuwonk iwizpuwonkVar = iwizpuwonk.this;
            int i13 = this.f127031zdlpuopuiu;
            return iwizpuwonkVar.new iobyxmoadg(i13, i13, this.f127030yggfygwlhe);
        }

        public int ppxfxbqfkf() {
            return this.f127030yggfygwlhe - this.f127031zdlpuopuiu;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i13) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return ppxfxbqfkf();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i13, int i14) {
            iwizpuwonk iwizpuwonkVar = iwizpuwonk.this;
            int i15 = this.f127031zdlpuopuiu;
            return iwizpuwonkVar.new zoijcleaow(i13 + i15, i15 + i14);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
        }

        public int wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
            int i13 = this.f127031zdlpuopuiu;
            int i14 = this.f127030yggfygwlhe;
            if (i13 > i14) {
                return -1;
            }
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iwizpuwonk.this.f127024zdlpuopuiu.wkgbmnqykc(i13), ppxfxbqfkfVar)) {
                if (i13 == i14) {
                    return -1;
                }
                i13++;
            }
            return i13 - this.f127031zdlpuopuiu;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf get(int i13) {
            Object objWkgbmnqykc = iwizpuwonk.this.f127024zdlpuopuiu.wkgbmnqykc(i13 + this.f127031zdlpuopuiu);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) objWkgbmnqykc;
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i13) {
            iwizpuwonk iwizpuwonkVar = iwizpuwonk.this;
            int i14 = this.f127031zdlpuopuiu;
            return iwizpuwonkVar.new iobyxmoadg(i13 + i14, i14, this.f127030yggfygwlhe);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, objArr);
        }
    }

    private final long btonecajqb() {
        long jZoijcleaow = cqumvgiudr.zoijcleaow(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i13 = this.f127022jyumaefscl + 1;
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(this);
        if (i13 <= iOjitshcjhn) {
            while (true) {
                long jZoijcleaow2 = oxmwwwfdhm.zoijcleaow(this.f127023yggfygwlhe.iobyxmoadg(i13));
                if (oxmwwwfdhm.iobyxmoadg(jZoijcleaow2, jZoijcleaow) < 0) {
                    jZoijcleaow = jZoijcleaow2;
                }
                if (oxmwwwfdhm.ppxfxbqfkf(jZoijcleaow) < 0.0f && oxmwwwfdhm.eablkybsjg(jZoijcleaow)) {
                    return jZoijcleaow;
                }
                if (i13 != iOjitshcjhn) {
                    i13++;
                }
            }
        }
        return jZoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kcexrzcfyt(int i13, int i14) {
        if (i13 >= i14) {
            return;
        }
        this.f127024zdlpuopuiu.istkbnxepw(i13, i14);
        this.f127023yggfygwlhe.dxjokdxxww(i13, i14);
    }

    private final void oxmwwwfdhm(int i13) {
        this.f127024zdlpuopuiu.zynmafqrjb(i13);
        this.f127023yggfygwlhe.nufgyqmvbu(i13);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void agtfadlqog(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
        if (this.f127022jyumaefscl == hg.jyumaefscl.ojitshcjhn(this)) {
            int i13 = this.f127022jyumaefscl;
            kcexrzcfyt(this.f127022jyumaefscl + 1, size());
            this.f127022jyumaefscl++;
            this.f127024zdlpuopuiu.agtfadlqog(ppxfxbqfkfVar);
            this.f127023yggfygwlhe.wkgbmnqykc(cqumvgiudr.iobyxmoadg(0.0f, z13, true));
            iobyxmoadgVar.invoke();
            this.f127022jyumaefscl = i13;
            return;
        }
        long jBtonecajqb = btonecajqb();
        int i14 = this.f127022jyumaefscl;
        if (!oxmwwwfdhm.wkgbmnqykc(jBtonecajqb)) {
            if (oxmwwwfdhm.ppxfxbqfkf(jBtonecajqb) > 0.0f) {
                int i15 = this.f127022jyumaefscl;
                kcexrzcfyt(this.f127022jyumaefscl + 1, size());
                this.f127022jyumaefscl++;
                this.f127024zdlpuopuiu.agtfadlqog(ppxfxbqfkfVar);
                this.f127023yggfygwlhe.wkgbmnqykc(cqumvgiudr.iobyxmoadg(0.0f, z13, true));
                iobyxmoadgVar.invoke();
                this.f127022jyumaefscl = i15;
                return;
            }
            return;
        }
        this.f127022jyumaefscl = hg.jyumaefscl.ojitshcjhn(this);
        int i16 = this.f127022jyumaefscl;
        kcexrzcfyt(this.f127022jyumaefscl + 1, size());
        this.f127022jyumaefscl++;
        this.f127024zdlpuopuiu.agtfadlqog(ppxfxbqfkfVar);
        this.f127023yggfygwlhe.wkgbmnqykc(cqumvgiudr.iobyxmoadg(0.0f, z13, true));
        iobyxmoadgVar.invoke();
        this.f127022jyumaefscl = i16;
        if (oxmwwwfdhm.ppxfxbqfkf(btonecajqb()) < 0.0f) {
            kcexrzcfyt(i14 + 1, this.f127022jyumaefscl + 1);
        }
        this.f127022jyumaefscl = i14;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f127022jyumaefscl = -1;
        this.f127024zdlpuopuiu.yggfygwlhe();
        this.f127023yggfygwlhe.gxszxtbevo();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) {
            return dxjokdxxww((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int draadjrbmk() {
        return this.f127024zdlpuopuiu.eablkybsjg();
    }

    public boolean dxjokdxxww(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        return indexOf(ppxfxbqfkfVar) != -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf get(int i13) {
        Object objWkgbmnqykc = this.f127024zdlpuopuiu.wkgbmnqykc(i13);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) objWkgbmnqykc;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) {
            return ojitshcjhn((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj);
        }
        return -1;
    }

    public final void iobyxmoadg() {
        this.f127022jyumaefscl = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f127024zdlpuopuiu.lqeggnwhkg();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new iobyxmoadg(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) {
            return vdvldrhtss((androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new iobyxmoadg(this, 0, 0, 0, 7, null);
    }

    public int ojitshcjhn(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(this);
        if (iOjitshcjhn < 0) {
            return -1;
        }
        int i13 = 0;
        while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f127024zdlpuopuiu.wkgbmnqykc(i13), ppxfxbqfkfVar)) {
            if (i13 == iOjitshcjhn) {
                return -1;
            }
            i13++;
        }
        return i13;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean rgvfuqvkyq(float f13, boolean z13) {
        if (this.f127022jyumaefscl == hg.jyumaefscl.ojitshcjhn(this)) {
            return true;
        }
        return oxmwwwfdhm.iobyxmoadg(btonecajqb(), cqumvgiudr.zoijcleaow(f13, z13, false, 4, null)) > 0;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return draadjrbmk();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i13, int i14) {
        return new zoijcleaow(i13, i14);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public int vdvldrhtss(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        for (int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(this); -1 < iOjitshcjhn; iOjitshcjhn--) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f127024zdlpuopuiu.wkgbmnqykc(iOjitshcjhn), ppxfxbqfkfVar)) {
                return iOjitshcjhn;
            }
        }
        return -1;
    }

    public final boolean wflxmlrfwp() {
        long jBtonecajqb = btonecajqb();
        return oxmwwwfdhm.ppxfxbqfkf(jBtonecajqb) < 0.0f && oxmwwwfdhm.eablkybsjg(jBtonecajqb) && !oxmwwwfdhm.wkgbmnqykc(jBtonecajqb);
    }

    public final void zdlpuopuiu(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar, float f13, boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
        if (this.f127022jyumaefscl == hg.jyumaefscl.ojitshcjhn(this)) {
            int i13 = this.f127022jyumaefscl;
            kcexrzcfyt(this.f127022jyumaefscl + 1, size());
            this.f127022jyumaefscl++;
            this.f127024zdlpuopuiu.agtfadlqog(ppxfxbqfkfVar);
            this.f127023yggfygwlhe.wkgbmnqykc(cqumvgiudr.iobyxmoadg(f13, z13, false));
            iobyxmoadgVar.invoke();
            this.f127022jyumaefscl = i13;
            if (this.f127022jyumaefscl + 1 == hg.jyumaefscl.ojitshcjhn(this) || oxmwwwfdhm.wkgbmnqykc(btonecajqb())) {
                oxmwwwfdhm(this.f127022jyumaefscl + 1);
                return;
            }
            return;
        }
        long jBtonecajqb = btonecajqb();
        int i14 = this.f127022jyumaefscl;
        this.f127022jyumaefscl = hg.jyumaefscl.ojitshcjhn(this);
        int i15 = this.f127022jyumaefscl;
        kcexrzcfyt(this.f127022jyumaefscl + 1, size());
        this.f127022jyumaefscl++;
        this.f127024zdlpuopuiu.agtfadlqog(ppxfxbqfkfVar);
        this.f127023yggfygwlhe.wkgbmnqykc(cqumvgiudr.iobyxmoadg(f13, z13, false));
        iobyxmoadgVar.invoke();
        this.f127022jyumaefscl = i15;
        long jBtonecajqb2 = btonecajqb();
        if (this.f127022jyumaefscl + 1 >= hg.jyumaefscl.ojitshcjhn(this) || oxmwwwfdhm.iobyxmoadg(jBtonecajqb, jBtonecajqb2) <= 0) {
            kcexrzcfyt(this.f127022jyumaefscl + 1, size());
        } else {
            kcexrzcfyt(i14 + 1, oxmwwwfdhm.wkgbmnqykc(jBtonecajqb2) ? this.f127022jyumaefscl + 2 : this.f127022jyumaefscl + 1);
        }
        this.f127022jyumaefscl = i14;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i13) {
        return new iobyxmoadg(this, i13, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, objArr);
    }

    private final class iobyxmoadg implements ListIterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int f127026jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f127027yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f127028zdlpuopuiu;

        public iobyxmoadg(int i13, int i14, int i15) {
            this.f127028zdlpuopuiu = i13;
            this.f127027yggfygwlhe = i14;
            this.f127026jyumaefscl = i15;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f127028zdlpuopuiu < this.f127026jyumaefscl;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f127028zdlpuopuiu > this.f127027yggfygwlhe;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf next() {
            androidx.collection.jpowsppfya jpowsppfyaVar = iwizpuwonk.this.f127024zdlpuopuiu;
            int i13 = this.f127028zdlpuopuiu;
            this.f127028zdlpuopuiu = i13 + 1;
            Object objWkgbmnqykc = jpowsppfyaVar.wkgbmnqykc(i13);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) objWkgbmnqykc;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f127028zdlpuopuiu - this.f127027yggfygwlhe;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f127028zdlpuopuiu - this.f127027yggfygwlhe) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf previous() {
            androidx.collection.jpowsppfya jpowsppfyaVar = iwizpuwonk.this.f127024zdlpuopuiu;
            int i13 = this.f127028zdlpuopuiu - 1;
            this.f127028zdlpuopuiu = i13;
            Object objWkgbmnqykc = jpowsppfyaVar.wkgbmnqykc(i13);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) objWkgbmnqykc;
        }

        public /* synthetic */ iobyxmoadg(iwizpuwonk iwizpuwonkVar, int i13, int i14, int i15, int i16, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? iwizpuwonkVar.size() : i15);
        }
    }
}
