package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class jlmebxxoox extends ppxfxbqfkf implements RandomAccess {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final jlmebxxoox f23945iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f23946jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object[] f23947yggfygwlhe;

    static {
        jlmebxxoox jlmebxxooxVar = new jlmebxxoox(new Object[0], 0);
        f23945iwizpuwonk = jlmebxxooxVar;
        jlmebxxooxVar.makeImmutable();
    }

    private jlmebxxoox(Object[] objArr, int i13) {
        this.f23947yggfygwlhe = objArr;
        this.f23946jyumaefscl = i13;
    }

    private String eablkybsjg(int i13) {
        return "Index:" + i13 + ", Size:" + this.f23946jyumaefscl;
    }

    public static jlmebxxoox ppxfxbqfkf() {
        return f23945iwizpuwonk;
    }

    private void wkgbmnqykc(int i13) {
        if (i13 < 0 || i13 >= this.f23946jyumaefscl) {
            throw new IndexOutOfBoundsException(eablkybsjg(i13));
        }
    }

    private static Object[] zoijcleaow(int i13) {
        return new Object[i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        iobyxmoadg();
        int i13 = this.f23946jyumaefscl;
        Object[] objArr = this.f23947yggfygwlhe;
        if (i13 == objArr.length) {
            this.f23947yggfygwlhe = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f23947yggfygwlhe;
        int i14 = this.f23946jyumaefscl;
        this.f23946jyumaefscl = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i13) {
        wkgbmnqykc(i13);
        return this.f23947yggfygwlhe[i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.esjtqupxsv.wkgbmnqykc
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public jlmebxxoox mutableCopyWithCapacity(int i13) {
        if (i13 >= this.f23946jyumaefscl) {
            return new jlmebxxoox(Arrays.copyOf(this.f23947yggfygwlhe, i13), this.f23946jyumaefscl);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.List
    public Object remove(int i13) {
        iobyxmoadg();
        wkgbmnqykc(i13);
        Object[] objArr = this.f23947yggfygwlhe;
        Object obj = objArr[i13];
        int i14 = this.f23946jyumaefscl;
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.f23946jyumaefscl--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i13, Object obj) {
        iobyxmoadg();
        wkgbmnqykc(i13);
        Object[] objArr = this.f23947yggfygwlhe;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23946jyumaefscl;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i13, Object obj) {
        int i14;
        iobyxmoadg();
        if (i13 >= 0 && i13 <= (i14 = this.f23946jyumaefscl)) {
            Object[] objArr = this.f23947yggfygwlhe;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArrZoijcleaow = zoijcleaow(((i14 * 3) / 2) + 1);
                System.arraycopy(this.f23947yggfygwlhe, 0, objArrZoijcleaow, 0, i13);
                System.arraycopy(this.f23947yggfygwlhe, i13, objArrZoijcleaow, i13 + 1, this.f23946jyumaefscl - i13);
                this.f23947yggfygwlhe = objArrZoijcleaow;
            }
            this.f23947yggfygwlhe[i13] = obj;
            this.f23946jyumaefscl++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(eablkybsjg(i13));
    }
}
