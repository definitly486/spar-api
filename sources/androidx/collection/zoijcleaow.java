package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements Collection, Set, ug.zoijcleaow, ug.gxszxtbevo {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f4415jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object[] f4416yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int[] f4417zdlpuopuiu;

    private final class iobyxmoadg extends dxjokdxxww {
        public iobyxmoadg() {
            super(zoijcleaow.this.eablkybsjg());
        }

        @Override // androidx.collection.dxjokdxxww
        protected Object iobyxmoadg(int i13) {
            return zoijcleaow.this.draadjrbmk(i13);
        }

        @Override // androidx.collection.dxjokdxxww
        protected void zoijcleaow(int i13) {
            zoijcleaow.this.gxszxtbevo(i13);
        }
    }

    public zoijcleaow() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i13;
        int iPpxfxbqfkf;
        int iEablkybsjg = eablkybsjg();
        if (obj == null) {
            iPpxfxbqfkf = wkgbmnqykc.wkgbmnqykc(this);
            i13 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i13 = iHashCode;
            iPpxfxbqfkf = wkgbmnqykc.ppxfxbqfkf(this, obj, iHashCode);
        }
        if (iPpxfxbqfkf >= 0) {
            return false;
        }
        int i14 = ~iPpxfxbqfkf;
        if (iEablkybsjg >= ppxfxbqfkf().length) {
            int i15 = 8;
            if (iEablkybsjg >= 8) {
                i15 = (iEablkybsjg >> 1) + iEablkybsjg;
            } else if (iEablkybsjg < 4) {
                i15 = 4;
            }
            int[] iArrPpxfxbqfkf = ppxfxbqfkf();
            Object[] objArrZoijcleaow = zoijcleaow();
            wkgbmnqykc.iobyxmoadg(this, i15);
            if (iEablkybsjg != eablkybsjg()) {
                throw new ConcurrentModificationException();
            }
            if (!(ppxfxbqfkf().length == 0)) {
                hg.agtfadlqog.vdvldrhtss(iArrPpxfxbqfkf, ppxfxbqfkf(), 0, 0, iArrPpxfxbqfkf.length, 6, null);
                hg.agtfadlqog.kcexrzcfyt(objArrZoijcleaow, zoijcleaow(), 0, 0, objArrZoijcleaow.length, 6, null);
            }
        }
        if (i14 < iEablkybsjg) {
            int i16 = i14 + 1;
            hg.agtfadlqog.draadjrbmk(ppxfxbqfkf(), ppxfxbqfkf(), i16, i14, iEablkybsjg);
            hg.agtfadlqog.agtfadlqog(zoijcleaow(), zoijcleaow(), i16, i14, iEablkybsjg);
        }
        if (iEablkybsjg != eablkybsjg() || i14 >= ppxfxbqfkf().length) {
            throw new ConcurrentModificationException();
        }
        ppxfxbqfkf()[i14] = i13;
        zoijcleaow()[i14] = obj;
        gtknphoqwx(eablkybsjg() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        iobyxmoadg(eablkybsjg() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void btonecajqb(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<set-?>");
        this.f4417zdlpuopuiu = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (eablkybsjg() != 0) {
            btonecajqb(jlmebxxoox.iobyxmoadg.f51694iobyxmoadg);
            dxjokdxxww(jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf);
            gtknphoqwx(0);
        }
        if (eablkybsjg() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
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

    public final Object draadjrbmk(int i13) {
        return zoijcleaow()[i13];
    }

    public final void dxjokdxxww(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<set-?>");
        this.f4416yggfygwlhe = objArr;
    }

    public final int eablkybsjg() {
        return this.f4415jyumaefscl;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int iEablkybsjg = eablkybsjg();
                for (int i13 = 0; i13 < iEablkybsjg; i13++) {
                    if (((Set) obj).contains(draadjrbmk(i13))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final void gtknphoqwx(int i13) {
        this.f4415jyumaefscl = i13;
    }

    public final Object gxszxtbevo(int i13) {
        int iEablkybsjg = eablkybsjg();
        Object obj = zoijcleaow()[i13];
        if (iEablkybsjg <= 1) {
            clear();
        } else {
            int i14 = iEablkybsjg - 1;
            if (ppxfxbqfkf().length <= 8 || eablkybsjg() >= ppxfxbqfkf().length / 3) {
                if (i13 < i14) {
                    int i15 = i13 + 1;
                    hg.agtfadlqog.draadjrbmk(ppxfxbqfkf(), ppxfxbqfkf(), i13, i15, iEablkybsjg);
                    hg.agtfadlqog.agtfadlqog(zoijcleaow(), zoijcleaow(), i13, i15, iEablkybsjg);
                }
                zoijcleaow()[i14] = null;
            } else {
                int iEablkybsjg2 = eablkybsjg() > 8 ? eablkybsjg() + (eablkybsjg() >> 1) : 8;
                int[] iArrPpxfxbqfkf = ppxfxbqfkf();
                Object[] objArrZoijcleaow = zoijcleaow();
                wkgbmnqykc.iobyxmoadg(this, iEablkybsjg2);
                if (i13 > 0) {
                    hg.agtfadlqog.vdvldrhtss(iArrPpxfxbqfkf, ppxfxbqfkf(), 0, 0, i13, 6, null);
                    hg.agtfadlqog.kcexrzcfyt(objArrZoijcleaow, zoijcleaow(), 0, 0, i13, 6, null);
                }
                if (i13 < i14) {
                    int i16 = i13 + 1;
                    hg.agtfadlqog.draadjrbmk(iArrPpxfxbqfkf, ppxfxbqfkf(), i13, i16, iEablkybsjg);
                    hg.agtfadlqog.agtfadlqog(objArrZoijcleaow, zoijcleaow(), i13, i16, iEablkybsjg);
                }
            }
            if (iEablkybsjg != eablkybsjg()) {
                throw new ConcurrentModificationException();
            }
            gtknphoqwx(i14);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrPpxfxbqfkf = ppxfxbqfkf();
        int iEablkybsjg = eablkybsjg();
        int i13 = 0;
        for (int i14 = 0; i14 < iEablkybsjg; i14++) {
            i13 += iArrPpxfxbqfkf[i14];
        }
        return i13;
    }

    public final int indexOf(Object obj) {
        return obj == null ? wkgbmnqykc.wkgbmnqykc(this) : wkgbmnqykc.ppxfxbqfkf(this, obj, obj.hashCode());
    }

    public final void iobyxmoadg(int i13) {
        int iEablkybsjg = eablkybsjg();
        if (ppxfxbqfkf().length < i13) {
            int[] iArrPpxfxbqfkf = ppxfxbqfkf();
            Object[] objArrZoijcleaow = zoijcleaow();
            wkgbmnqykc.iobyxmoadg(this, i13);
            if (eablkybsjg() > 0) {
                hg.agtfadlqog.vdvldrhtss(iArrPpxfxbqfkf, ppxfxbqfkf(), 0, 0, eablkybsjg(), 6, null);
                hg.agtfadlqog.kcexrzcfyt(objArrZoijcleaow, zoijcleaow(), 0, 0, eablkybsjg(), 6, null);
            }
        }
        if (eablkybsjg() != iEablkybsjg) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return eablkybsjg() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    public final int[] ppxfxbqfkf() {
        return this.f4417zdlpuopuiu;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        gxszxtbevo(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        boolean z13 = false;
        for (int iEablkybsjg = eablkybsjg() - 1; -1 < iEablkybsjg; iEablkybsjg--) {
            if (!hg.jyumaefscl.xrmfcynszj(elements, zoijcleaow()[iEablkybsjg])) {
                gxszxtbevo(iEablkybsjg);
                z13 = true;
            }
        }
        return z13;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return wkgbmnqykc();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return hg.agtfadlqog.yggfygwlhe(this.f4416yggfygwlhe, 0, this.f4415jyumaefscl);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(eablkybsjg() * 14);
        sb3.append('{');
        int iEablkybsjg = eablkybsjg();
        for (int i13 = 0; i13 < iEablkybsjg; i13++) {
            if (i13 > 0) {
                sb3.append(", ");
            }
            Object objDraadjrbmk = draadjrbmk(i13);
            if (objDraadjrbmk != this) {
                sb3.append(objDraadjrbmk);
            } else {
                sb3.append("(this Set)");
            }
        }
        sb3.append('}');
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public int wkgbmnqykc() {
        return this.f4415jyumaefscl;
    }

    public final Object[] zoijcleaow() {
        return this.f4416yggfygwlhe;
    }

    public zoijcleaow(int i13) {
        this.f4417zdlpuopuiu = jlmebxxoox.iobyxmoadg.f51694iobyxmoadg;
        this.f4416yggfygwlhe = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
        if (i13 > 0) {
            wkgbmnqykc.iobyxmoadg(this, i13);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        Object[] objArrIobyxmoadg = ppxfxbqfkf.iobyxmoadg(array, this.f4415jyumaefscl);
        hg.agtfadlqog.agtfadlqog(this.f4416yggfygwlhe, objArrIobyxmoadg, 0, 0, this.f4415jyumaefscl);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArrIobyxmoadg);
        return objArrIobyxmoadg;
    }

    public /* synthetic */ zoijcleaow(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13);
    }
}
