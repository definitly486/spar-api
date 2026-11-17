package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zdlpuopuiu extends oxmwwwfdhm implements List, RandomAccess {
    private static final long serialVersionUID = -889275714;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final sopmlzcsov f23747yggfygwlhe = new zoijcleaow(jpowsppfya.f23664cqumvgiudr, 0);

    public static final class iobyxmoadg extends oxmwwwfdhm.iobyxmoadg {
        public iobyxmoadg() {
            this(4);
        }

        public iobyxmoadg btonecajqb(Iterable iterable) {
            super.zoijcleaow(iterable);
            return this;
        }

        public iobyxmoadg dxjokdxxww(Object... objArr) {
            super.eablkybsjg(objArr);
            return this;
        }

        public zdlpuopuiu gtknphoqwx() {
            this.f23689ppxfxbqfkf = true;
            return zdlpuopuiu.vdvldrhtss(this.f23688iobyxmoadg, this.f23690zoijcleaow);
        }

        @Override // com.google.common.collect.oxmwwwfdhm.zoijcleaow
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg(Object obj) {
            super.wkgbmnqykc(obj);
            return this;
        }

        iobyxmoadg(int i13) {
            super(i13);
        }
    }

    static class ppxfxbqfkf implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Object[] f23748zdlpuopuiu;

        ppxfxbqfkf(Object[] objArr) {
            this.f23748zdlpuopuiu = objArr;
        }

        Object readResolve() {
            return zdlpuopuiu.cqumvgiudr(this.f23748zdlpuopuiu);
        }
    }

    class wkgbmnqykc extends zdlpuopuiu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final transient int f23750iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final transient int f23751jyumaefscl;

        wkgbmnqykc(int i13, int i14) {
            this.f23751jyumaefscl = i13;
            this.f23750iwizpuwonk = i14;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        boolean agtfadlqog() {
            return true;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        int btonecajqb() {
            return zdlpuopuiu.this.draadjrbmk() + this.f23751jyumaefscl + this.f23750iwizpuwonk;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        int draadjrbmk() {
            return zdlpuopuiu.this.draadjrbmk() + this.f23751jyumaefscl;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        Object[] dxjokdxxww() {
            return zdlpuopuiu.this.dxjokdxxww();
        }

        @Override // java.util.List
        public Object get(int i13) {
            xa.draadjrbmk.nufgyqmvbu(i13, this.f23750iwizpuwonk);
            return zdlpuopuiu.this.get(i13 + this.f23751jyumaefscl);
        }

        @Override // com.google.common.collect.zdlpuopuiu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.zdlpuopuiu, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.zdlpuopuiu, java.util.List
        /* JADX INFO: renamed from: pkzmftpjix, reason: merged with bridge method [inline-methods] */
        public zdlpuopuiu subList(int i13, int i14) {
            xa.draadjrbmk.agtfadlqog(i13, i14, this.f23750iwizpuwonk);
            zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
            int i15 = this.f23751jyumaefscl;
            return zdlpuopuiuVar.subList(i13 + i15, i14 + i15);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23750iwizpuwonk;
        }

        @Override // com.google.common.collect.zdlpuopuiu, com.google.common.collect.oxmwwwfdhm
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.zdlpuopuiu, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i13) {
            return super.listIterator(i13);
        }
    }

    static class zoijcleaow extends com.google.common.collect.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final zdlpuopuiu f23752jyumaefscl;

        zoijcleaow(zdlpuopuiu zdlpuopuiuVar, int i13) {
            super(zdlpuopuiuVar.size(), i13);
            this.f23752jyumaefscl = zdlpuopuiuVar;
        }

        @Override // com.google.common.collect.iobyxmoadg
        protected Object iobyxmoadg(int i13) {
            return this.f23752jyumaefscl.get(i13);
        }
    }

    zdlpuopuiu() {
    }

    public static zdlpuopuiu cdpycssgdh(Object obj, Object obj2) {
        return yggfygwlhe(obj, obj2);
    }

    public static zdlpuopuiu cqumvgiudr(Object[] objArr) {
        return objArr.length == 0 ? zynmafqrjb() : yggfygwlhe((Object[]) objArr.clone());
    }

    public static zdlpuopuiu istkbnxepw(Object obj) {
        return yggfygwlhe(obj);
    }

    public static zdlpuopuiu jyumaefscl(Collection collection) {
        if (!(collection instanceof oxmwwwfdhm)) {
            return yggfygwlhe(collection.toArray());
        }
        zdlpuopuiu zdlpuopuiuVarIobyxmoadg = ((oxmwwwfdhm) collection).iobyxmoadg();
        return zdlpuopuiuVarIobyxmoadg.agtfadlqog() ? rgvfuqvkyq(zdlpuopuiuVarIobyxmoadg.toArray()) : zdlpuopuiuVarIobyxmoadg;
    }

    public static iobyxmoadg kcexrzcfyt() {
        return new iobyxmoadg();
    }

    public static zdlpuopuiu lmojexxdyd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return yggfygwlhe(obj, obj2, obj3, obj4, obj5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static zdlpuopuiu rgvfuqvkyq(Object[] objArr) {
        return vdvldrhtss(objArr, objArr.length);
    }

    static zdlpuopuiu vdvldrhtss(Object[] objArr, int i13) {
        return i13 == 0 ? zynmafqrjb() : new jpowsppfya(objArr, i13);
    }

    public static zdlpuopuiu wwaezpbzkn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        xa.draadjrbmk.eablkybsjg(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return yggfygwlhe(objArr2);
    }

    public static zdlpuopuiu yadqdtsiqt(Object obj, Object obj2, Object obj3) {
        return yggfygwlhe(obj, obj2, obj3);
    }

    private static zdlpuopuiu yggfygwlhe(Object... objArr) {
        return rgvfuqvkyq(ylkuphrtab.zoijcleaow(objArr));
    }

    public static zdlpuopuiu ylkuphrtab(Comparator comparator, Iterable iterable) {
        xa.draadjrbmk.btonecajqb(comparator);
        Object[] objArrBtonecajqb = iwizpuwonk.btonecajqb(iterable);
        ylkuphrtab.zoijcleaow(objArrBtonecajqb);
        Arrays.sort(objArrBtonecajqb, comparator);
        return rgvfuqvkyq(objArrBtonecajqb);
    }

    public static iobyxmoadg zdlpuopuiu(int i13) {
        nufgyqmvbu.zoijcleaow(i13, "expectedSize");
        return new iobyxmoadg(i13);
    }

    public static zdlpuopuiu zynmafqrjb() {
        return jpowsppfya.f23664cqumvgiudr;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.oxmwwwfdhm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return lereixgezr.iobyxmoadg(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i13 = 1;
        for (int i14 = 0; i14 < size; i14++) {
            i13 = ~(~((i13 * 31) + get(i14).hashCode()));
        }
        return i13;
    }

    zdlpuopuiu hcddaimhww(int i13, int i14) {
        return new wkgbmnqykc(i13, i14 - i13);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return lereixgezr.zoijcleaow(this, obj);
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    public final zdlpuopuiu iobyxmoadg() {
        return this;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return lereixgezr.wkgbmnqykc(this, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public sopmlzcsov listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public ulzqkzuiru iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: pkzmftpjix */
    public zdlpuopuiu subList(int i13, int i14) {
        xa.draadjrbmk.agtfadlqog(i13, i14, size());
        int i15 = i14 - i13;
        if (i15 == size()) {
            return this;
        }
        return i15 == 0 ? zynmafqrjb() : hcddaimhww(i13, i14);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public sopmlzcsov listIterator(int i13) {
        xa.draadjrbmk.draadjrbmk(i13, size());
        return isEmpty() ? f23747yggfygwlhe : new zoijcleaow(this, i13);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    int wkgbmnqykc(Object[] objArr, int i13) {
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            objArr[i13 + i14] = get(i14);
        }
        return i13 + size;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    Object writeReplace() {
        return new ppxfxbqfkf(toArray());
    }
}
