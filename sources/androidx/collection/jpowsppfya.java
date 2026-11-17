package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya extends mbcevpiqjq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private zoijcleaow f4303ppxfxbqfkf;

    private static final class iobyxmoadg implements ListIterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f4304yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f4305zdlpuopuiu;

        public iobyxmoadg(List list, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "list");
            this.f4305zdlpuopuiu = list;
            this.f4304yggfygwlhe = i13 - 1;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            List list = this.f4305zdlpuopuiu;
            int i13 = this.f4304yggfygwlhe + 1;
            this.f4304yggfygwlhe = i13;
            list.add(i13, obj);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f4304yggfygwlhe < this.f4305zdlpuopuiu.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f4304yggfygwlhe >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f4305zdlpuopuiu;
            int i13 = this.f4304yggfygwlhe + 1;
            this.f4304yggfygwlhe = i13;
            return list.get(i13);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f4304yggfygwlhe + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            List list = this.f4305zdlpuopuiu;
            int i13 = this.f4304yggfygwlhe;
            this.f4304yggfygwlhe = i13 - 1;
            return list.get(i13);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f4304yggfygwlhe;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f4305zdlpuopuiu.remove(this.f4304yggfygwlhe);
            this.f4304yggfygwlhe--;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f4305zdlpuopuiu.set(this.f4304yggfygwlhe, obj);
        }
    }

    private static final class ppxfxbqfkf implements List, ug.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f4306jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f4307yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f4308zdlpuopuiu;

        public ppxfxbqfkf(List list, int i13, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "list");
            this.f4308zdlpuopuiu = list;
            this.f4307yggfygwlhe = i13;
            this.f4306jyumaefscl = i14;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f4308zdlpuopuiu;
            int i13 = this.f4306jyumaefscl;
            this.f4306jyumaefscl = i13 + 1;
            list.add(i13, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i13, Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            this.f4308zdlpuopuiu.addAll(i13 + this.f4307yggfygwlhe, elements);
            this.f4306jyumaefscl += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i13 = this.f4306jyumaefscl - 1;
            int i14 = this.f4307yggfygwlhe;
            if (i14 <= i13) {
                while (true) {
                    this.f4308zdlpuopuiu.remove(i13);
                    if (i13 == i14) {
                        break;
                    } else {
                        i13--;
                    }
                }
            }
            this.f4306jyumaefscl = this.f4307yggfygwlhe;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i13 = this.f4306jyumaefscl;
            for (int i14 = this.f4307yggfygwlhe; i14 < i13; i14++) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4308zdlpuopuiu.get(i14), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i13) {
            ntlheqmsrt.wkgbmnqykc(this, i13);
            return this.f4308zdlpuopuiu.get(i13 + this.f4307yggfygwlhe);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i13 = this.f4306jyumaefscl;
            for (int i14 = this.f4307yggfygwlhe; i14 < i13; i14++) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4308zdlpuopuiu.get(i14), obj)) {
                    return i14 - this.f4307yggfygwlhe;
                }
            }
            return -1;
        }

        public int iobyxmoadg() {
            return this.f4306jyumaefscl - this.f4307yggfygwlhe;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f4306jyumaefscl == this.f4307yggfygwlhe;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new iobyxmoadg(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i13 = this.f4306jyumaefscl - 1;
            int i14 = this.f4307yggfygwlhe;
            if (i14 > i13) {
                return -1;
            }
            while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4308zdlpuopuiu.get(i13), obj)) {
                if (i13 == i14) {
                    return -1;
                }
                i13--;
            }
            return i13 - this.f4307yggfygwlhe;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new iobyxmoadg(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i13) {
            return zoijcleaow(i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            int i13 = this.f4306jyumaefscl;
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i13 != this.f4306jyumaefscl;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            int i13 = this.f4306jyumaefscl;
            int i14 = i13 - 1;
            int i15 = this.f4307yggfygwlhe;
            if (i15 <= i14) {
                while (true) {
                    if (!elements.contains(this.f4308zdlpuopuiu.get(i14))) {
                        this.f4308zdlpuopuiu.remove(i14);
                        this.f4306jyumaefscl--;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14--;
                }
            }
            return i13 != this.f4306jyumaefscl;
        }

        @Override // java.util.List
        public Object set(int i13, Object obj) {
            ntlheqmsrt.wkgbmnqykc(this, i13);
            return this.f4308zdlpuopuiu.set(i13 + this.f4307yggfygwlhe, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return iobyxmoadg();
        }

        @Override // java.util.List
        public List subList(int i13, int i14) {
            ntlheqmsrt.eablkybsjg(this, i13, i14);
            return new ppxfxbqfkf(this, i13, i14);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
        }

        public Object zoijcleaow(int i13) {
            ntlheqmsrt.wkgbmnqykc(this, i13);
            Object objRemove = this.f4308zdlpuopuiu.remove(i13 + this.f4307yggfygwlhe);
            this.f4306jyumaefscl--;
            return objRemove;
        }

        @Override // java.util.List
        public void add(int i13, Object obj) {
            this.f4308zdlpuopuiu.add(i13 + this.f4307yggfygwlhe, obj);
            this.f4306jyumaefscl++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i13) {
            return new iobyxmoadg(this, i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i13 = this.f4306jyumaefscl;
            for (int i14 = this.f4307yggfygwlhe; i14 < i13; i14++) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4308zdlpuopuiu.get(i14), obj)) {
                    this.f4308zdlpuopuiu.remove(i14);
                    this.f4306jyumaefscl--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] array) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
            return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            this.f4308zdlpuopuiu.addAll(this.f4306jyumaefscl, elements);
            this.f4306jyumaefscl += elements.size();
            return elements.size() > 0;
        }
    }

    private static final class zoijcleaow implements List, ug.wkgbmnqykc {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final jpowsppfya f4309zdlpuopuiu;

        public zoijcleaow(jpowsppfya objectList) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objectList, "objectList");
            this.f4309zdlpuopuiu = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f4309zdlpuopuiu.agtfadlqog(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i13, Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            return this.f4309zdlpuopuiu.ojitshcjhn(i13, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f4309zdlpuopuiu.yggfygwlhe();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f4309zdlpuopuiu.iobyxmoadg(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            return this.f4309zdlpuopuiu.zoijcleaow(elements);
        }

        @Override // java.util.List
        public Object get(int i13) {
            ntlheqmsrt.wkgbmnqykc(this, i13);
            return this.f4309zdlpuopuiu.wkgbmnqykc(i13);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f4309zdlpuopuiu.gxszxtbevo(obj);
        }

        public int iobyxmoadg() {
            return this.f4309zdlpuopuiu.eablkybsjg();
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f4309zdlpuopuiu.lqeggnwhkg();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new iobyxmoadg(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f4309zdlpuopuiu.gtknphoqwx(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new iobyxmoadg(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i13) {
            return zoijcleaow(i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            return this.f4309zdlpuopuiu.pmvmpeiblj(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            return this.f4309zdlpuopuiu.yadqdtsiqt(elements);
        }

        @Override // java.util.List
        public Object set(int i13, Object obj) {
            ntlheqmsrt.wkgbmnqykc(this, i13);
            return this.f4309zdlpuopuiu.iozdgvuglv(i13, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return iobyxmoadg();
        }

        @Override // java.util.List
        public List subList(int i13, int i14) {
            ntlheqmsrt.eablkybsjg(this, i13, i14);
            return new ppxfxbqfkf(this, i13, i14);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
        }

        public Object zoijcleaow(int i13) {
            ntlheqmsrt.wkgbmnqykc(this, i13);
            return this.f4309zdlpuopuiu.zynmafqrjb(i13);
        }

        @Override // java.util.List
        public void add(int i13, Object obj) {
            this.f4309zdlpuopuiu.wflxmlrfwp(i13, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            return this.f4309zdlpuopuiu.vdvldrhtss(elements);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i13) {
            return new iobyxmoadg(this, i13);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f4309zdlpuopuiu.lereixgezr(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] array) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
            return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
        }
    }

    public jpowsppfya(int i13) {
        super(i13, null);
    }

    private final void lmojexxdyd(int i13) {
        jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index " + i13 + " must be in 0.." + this.f4344zoijcleaow);
    }

    public final boolean agtfadlqog(Object obj) {
        int i13 = this.f4344zoijcleaow + 1;
        Object[] objArr = this.f4343iobyxmoadg;
        if (objArr.length < i13) {
            cdpycssgdh(i13, objArr);
        }
        Object[] objArr2 = this.f4343iobyxmoadg;
        int i14 = this.f4344zoijcleaow;
        objArr2[i14] = obj;
        this.f4344zoijcleaow = i14 + 1;
        return true;
    }

    public final void cdpycssgdh(int i13, Object[] oldContent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldContent, "oldContent");
        int length = oldContent.length;
        this.f4343iobyxmoadg = hg.agtfadlqog.agtfadlqog(oldContent, new Object[Math.max(i13, (length * 3) / 2)], 0, 0, length);
    }

    public final void cqumvgiudr(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            agtfadlqog(it.next());
        }
    }

    public final void esjtqupxsv(List elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i13 = this.f4344zoijcleaow;
        int size = elements.size() + i13;
        Object[] objArr = this.f4343iobyxmoadg;
        if (objArr.length < size) {
            cdpycssgdh(size, objArr);
        }
        Object[] objArr2 = this.f4343iobyxmoadg;
        int size2 = elements.size();
        for (int i14 = 0; i14 < size2; i14++) {
            objArr2[i14 + i13] = elements.get(i14);
        }
        this.f4344zoijcleaow += elements.size();
    }

    public final Object iozdgvuglv(int i13, Object obj) {
        if (i13 < 0 || i13 >= this.f4344zoijcleaow) {
            draadjrbmk(i13);
        }
        Object[] objArr = this.f4343iobyxmoadg;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    public final void istkbnxepw(int i13, int i14) {
        int i15;
        if (i13 < 0 || i13 > (i15 = this.f4344zoijcleaow) || i14 < 0 || i14 > i15) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Start (" + i13 + ") and end (" + i14 + ") must be in 0.." + this.f4344zoijcleaow);
        }
        if (i14 < i13) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Start (" + i13 + ") is more than end (" + i14 + ')');
        }
        if (i14 != i13) {
            int i16 = this.f4344zoijcleaow;
            if (i14 < i16) {
                Object[] objArr = this.f4343iobyxmoadg;
                hg.agtfadlqog.agtfadlqog(objArr, objArr, i13, i14, i16);
            }
            int i17 = this.f4344zoijcleaow;
            int i18 = i17 - (i14 - i13);
            hg.agtfadlqog.lereixgezr(this.f4343iobyxmoadg, null, i18, i17);
            this.f4344zoijcleaow = i18;
        }
    }

    public final void iwizpuwonk(mbcevpiqjq elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (elements.lqeggnwhkg()) {
            return;
        }
        int i13 = this.f4344zoijcleaow + elements.f4344zoijcleaow;
        Object[] objArr = this.f4343iobyxmoadg;
        if (objArr.length < i13) {
            cdpycssgdh(i13, objArr);
        }
        hg.agtfadlqog.agtfadlqog(elements.f4343iobyxmoadg, this.f4343iobyxmoadg, this.f4344zoijcleaow, 0, elements.f4344zoijcleaow);
        this.f4344zoijcleaow += elements.f4344zoijcleaow;
    }

    public final void jyumaefscl(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            lereixgezr(it.next());
        }
    }

    public List kcexrzcfyt() {
        return zdlpuopuiu();
    }

    public final boolean lereixgezr(Object obj) {
        int iGxszxtbevo = gxszxtbevo(obj);
        if (iGxszxtbevo < 0) {
            return false;
        }
        zynmafqrjb(iGxszxtbevo);
        return true;
    }

    public final boolean ojitshcjhn(int i13, Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (i13 < 0 || i13 > this.f4344zoijcleaow) {
            lmojexxdyd(i13);
        }
        int i14 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this.f4344zoijcleaow + elements.size();
        Object[] objArr = this.f4343iobyxmoadg;
        if (objArr.length < size) {
            cdpycssgdh(size, objArr);
        }
        Object[] objArr2 = this.f4343iobyxmoadg;
        if (i13 != this.f4344zoijcleaow) {
            hg.agtfadlqog.agtfadlqog(objArr2, objArr2, elements.size() + i13, i13, this.f4344zoijcleaow);
        }
        for (Object obj : elements) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            objArr2[i14 + i13] = obj;
            i14 = i15;
        }
        this.f4344zoijcleaow += elements.size();
        return true;
    }

    public final boolean oxmwwwfdhm(List elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int i13 = this.f4344zoijcleaow;
        esjtqupxsv(elements);
        return i13 != this.f4344zoijcleaow;
    }

    public final boolean pmvmpeiblj(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int i13 = this.f4344zoijcleaow;
        jyumaefscl(elements);
        return i13 != this.f4344zoijcleaow;
    }

    public final boolean rgvfuqvkyq(mbcevpiqjq elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int i13 = this.f4344zoijcleaow;
        iwizpuwonk(elements);
        return i13 != this.f4344zoijcleaow;
    }

    public final boolean vdvldrhtss(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int i13 = this.f4344zoijcleaow;
        cqumvgiudr(elements);
        return i13 != this.f4344zoijcleaow;
    }

    public final void wflxmlrfwp(int i13, Object obj) {
        if (i13 < 0 || i13 > this.f4344zoijcleaow) {
            lmojexxdyd(i13);
        }
        int i14 = this.f4344zoijcleaow + 1;
        Object[] objArr = this.f4343iobyxmoadg;
        if (objArr.length < i14) {
            cdpycssgdh(i14, objArr);
        }
        Object[] objArr2 = this.f4343iobyxmoadg;
        int i15 = this.f4344zoijcleaow;
        if (i13 != i15) {
            hg.agtfadlqog.agtfadlqog(objArr2, objArr2, i13 + 1, i13, i15);
        }
        objArr2[i13] = obj;
        this.f4344zoijcleaow++;
    }

    public final boolean yadqdtsiqt(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int i13 = this.f4344zoijcleaow;
        Object[] objArr = this.f4343iobyxmoadg;
        for (int i14 = i13 - 1; -1 < i14; i14--) {
            if (!elements.contains(objArr[i14])) {
                zynmafqrjb(i14);
            }
        }
        return i13 != this.f4344zoijcleaow;
    }

    public final void yggfygwlhe() {
        hg.agtfadlqog.lereixgezr(this.f4343iobyxmoadg, null, 0, this.f4344zoijcleaow);
        this.f4344zoijcleaow = 0;
    }

    public final List zdlpuopuiu() {
        zoijcleaow zoijcleaowVar = this.f4303ppxfxbqfkf;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zoijcleaow zoijcleaowVar2 = new zoijcleaow(this);
        this.f4303ppxfxbqfkf = zoijcleaowVar2;
        return zoijcleaowVar2;
    }

    public final Object zynmafqrjb(int i13) {
        if (i13 < 0 || i13 >= this.f4344zoijcleaow) {
            draadjrbmk(i13);
        }
        Object[] objArr = this.f4343iobyxmoadg;
        Object obj = objArr[i13];
        int i14 = this.f4344zoijcleaow;
        if (i13 != i14 - 1) {
            hg.agtfadlqog.agtfadlqog(objArr, objArr, i13, i13 + 1, i14);
        }
        int i15 = this.f4344zoijcleaow - 1;
        this.f4344zoijcleaow = i15;
        objArr[i15] = null;
        return obj;
    }

    public /* synthetic */ jpowsppfya(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 16 : i13);
    }
}
