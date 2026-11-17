package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class mbcevpiqjq extends ppxfxbqfkf implements RandomAccess {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final mbcevpiqjq f8722iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f8723jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object[] f8724yggfygwlhe;

    static {
        mbcevpiqjq mbcevpiqjqVar = new mbcevpiqjq(new Object[0], 0);
        f8722iwizpuwonk = mbcevpiqjqVar;
        mbcevpiqjqVar.makeImmutable();
    }

    private mbcevpiqjq(Object[] objArr, int i13) {
        this.f8724yggfygwlhe = objArr;
        this.f8723jyumaefscl = i13;
    }

    private String eablkybsjg(int i13) {
        return "Index:" + i13 + ", Size:" + this.f8723jyumaefscl;
    }

    public static mbcevpiqjq ppxfxbqfkf() {
        return f8722iwizpuwonk;
    }

    private void wkgbmnqykc(int i13) {
        if (i13 < 0 || i13 >= this.f8723jyumaefscl) {
            throw new IndexOutOfBoundsException(eablkybsjg(i13));
        }
    }

    private static Object[] zoijcleaow(int i13) {
        return new Object[i13];
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        iobyxmoadg();
        int i13 = this.f8723jyumaefscl;
        Object[] objArr = this.f8724yggfygwlhe;
        if (i13 == objArr.length) {
            this.f8724yggfygwlhe = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8724yggfygwlhe;
        int i14 = this.f8723jyumaefscl;
        this.f8723jyumaefscl = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i13) {
        wkgbmnqykc(i13);
        return this.f8724yggfygwlhe[i13];
    }

    @Override // androidx.datastore.preferences.protobuf.zdlpuopuiu.zoijcleaow
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public mbcevpiqjq mutableCopyWithCapacity(int i13) {
        if (i13 >= this.f8723jyumaefscl) {
            return new mbcevpiqjq(Arrays.copyOf(this.f8724yggfygwlhe, i13), this.f8723jyumaefscl);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i13) {
        iobyxmoadg();
        wkgbmnqykc(i13);
        Object[] objArr = this.f8724yggfygwlhe;
        Object obj = objArr[i13];
        int i14 = this.f8723jyumaefscl;
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.f8723jyumaefscl--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i13, Object obj) {
        iobyxmoadg();
        wkgbmnqykc(i13);
        Object[] objArr = this.f8724yggfygwlhe;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8723jyumaefscl;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i13, Object obj) {
        int i14;
        iobyxmoadg();
        if (i13 >= 0 && i13 <= (i14 = this.f8723jyumaefscl)) {
            Object[] objArr = this.f8724yggfygwlhe;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArrZoijcleaow = zoijcleaow(((i14 * 3) / 2) + 1);
                System.arraycopy(this.f8724yggfygwlhe, 0, objArrZoijcleaow, 0, i13);
                System.arraycopy(this.f8724yggfygwlhe, i13, objArrZoijcleaow, i13 + 1, this.f8723jyumaefscl - i13);
                this.f8724yggfygwlhe = objArrZoijcleaow;
            }
            this.f8724yggfygwlhe[i13] = obj;
            this.f8723jyumaefscl++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(eablkybsjg(i13));
    }
}
