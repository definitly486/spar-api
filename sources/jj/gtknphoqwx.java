package jj;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class gtknphoqwx extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f51589yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f51590zdlpuopuiu;

    private class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f51592yggfygwlhe;

        public ppxfxbqfkf() {
            super();
            this.f51592yggfygwlhe = ((AbstractList) gtknphoqwx.this).modCount;
        }

        @Override // jj.gtknphoqwx.wkgbmnqykc
        protected void iobyxmoadg() {
            if (((AbstractList) gtknphoqwx.this).modCount == this.f51592yggfygwlhe) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) gtknphoqwx.this).modCount + "; expected: " + this.f51592yggfygwlhe);
        }

        @Override // java.util.Iterator
        public void remove() {
            iobyxmoadg();
            gtknphoqwx.this.clear();
        }

        @Override // jj.gtknphoqwx.wkgbmnqykc
        protected Object zoijcleaow() {
            return gtknphoqwx.this.f51589yggfygwlhe;
        }
    }

    private static abstract class wkgbmnqykc implements Iterator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private boolean f51593zdlpuopuiu;

        private wkgbmnqykc() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f51593zdlpuopuiu;
        }

        protected abstract void iobyxmoadg();

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f51593zdlpuopuiu) {
                throw new NoSuchElementException();
            }
            this.f51593zdlpuopuiu = true;
            iobyxmoadg();
            return zoijcleaow();
        }

        protected abstract Object zoijcleaow();
    }

    private static class zoijcleaow implements Iterator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private static final zoijcleaow f51594zdlpuopuiu = new zoijcleaow();

        private zoijcleaow() {
        }

        public static zoijcleaow iobyxmoadg() {
            return f51594zdlpuopuiu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i13 == 2 || i13 == 3) {
            objArr[1] = "iterator";
        } else if (i13 == 5 || i13 == 6 || i13 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        int i13 = this.f51590zdlpuopuiu;
        if (i13 == 0) {
            this.f51589yggfygwlhe = obj;
        } else if (i13 == 1) {
            this.f51589yggfygwlhe = new Object[]{this.f51589yggfygwlhe, obj};
        } else {
            Object[] objArr = (Object[]) this.f51589yggfygwlhe;
            int length = objArr.length;
            if (i13 >= length) {
                int i14 = ((length * 3) / 2) + 1;
                int i15 = i13 + 1;
                if (i14 < i15) {
                    i14 = i15;
                }
                Object[] objArr2 = new Object[i14];
                this.f51589yggfygwlhe = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f51590zdlpuopuiu] = obj;
        }
        this.f51590zdlpuopuiu++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f51589yggfygwlhe = null;
        this.f51590zdlpuopuiu = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i13) {
        int i14;
        if (i13 >= 0 && i13 < (i14 = this.f51590zdlpuopuiu)) {
            return i14 == 1 ? this.f51589yggfygwlhe : ((Object[]) this.f51589yggfygwlhe)[i13];
        }
        throw new IndexOutOfBoundsException("Index: " + i13 + ", Size: " + this.f51590zdlpuopuiu);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        int i13 = this.f51590zdlpuopuiu;
        if (i13 == 0) {
            zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaow.iobyxmoadg();
            if (zoijcleaowVarIobyxmoadg == null) {
                iobyxmoadg(2);
            }
            return zoijcleaowVarIobyxmoadg;
        }
        if (i13 == 1) {
            return new ppxfxbqfkf();
        }
        Iterator it = super.iterator();
        if (it == null) {
            iobyxmoadg(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i13) {
        int i14;
        Object obj;
        if (i13 < 0 || i13 >= (i14 = this.f51590zdlpuopuiu)) {
            throw new IndexOutOfBoundsException("Index: " + i13 + ", Size: " + this.f51590zdlpuopuiu);
        }
        if (i14 == 1) {
            obj = this.f51589yggfygwlhe;
            this.f51589yggfygwlhe = null;
        } else {
            Object[] objArr = (Object[]) this.f51589yggfygwlhe;
            Object obj2 = objArr[i13];
            if (i14 == 2) {
                this.f51589yggfygwlhe = objArr[1 - i13];
            } else {
                int i15 = (i14 - i13) - 1;
                if (i15 > 0) {
                    System.arraycopy(objArr, i13 + 1, objArr, i13, i15);
                }
                objArr[this.f51590zdlpuopuiu - 1] = null;
            }
            obj = obj2;
        }
        this.f51590zdlpuopuiu--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i13, Object obj) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f51590zdlpuopuiu)) {
            throw new IndexOutOfBoundsException("Index: " + i13 + ", Size: " + this.f51590zdlpuopuiu);
        }
        if (i14 == 1) {
            Object obj2 = this.f51589yggfygwlhe;
            this.f51589yggfygwlhe = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f51589yggfygwlhe;
        Object obj3 = objArr[i13];
        objArr[i13] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f51590zdlpuopuiu;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        int i13 = this.f51590zdlpuopuiu;
        if (i13 >= 2) {
            Arrays.sort((Object[]) this.f51589yggfygwlhe, 0, i13, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            iobyxmoadg(4);
        }
        int length = objArr.length;
        int i13 = this.f51590zdlpuopuiu;
        if (i13 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f51589yggfygwlhe;
                return objArr2;
            }
            objArr[0] = this.f51589yggfygwlhe;
        } else {
            if (length < i13) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f51589yggfygwlhe, i13, objArr.getClass());
                if (objArrCopyOf == null) {
                    iobyxmoadg(6);
                }
                return objArrCopyOf;
            }
            if (i13 != 0) {
                System.arraycopy(this.f51589yggfygwlhe, 0, objArr, 0, i13);
            }
        }
        int i14 = this.f51590zdlpuopuiu;
        if (length > i14) {
            objArr[i14] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i13, Object obj) {
        int i14;
        if (i13 >= 0 && i13 <= (i14 = this.f51590zdlpuopuiu)) {
            if (i14 == 0) {
                this.f51589yggfygwlhe = obj;
            } else if (i14 == 1 && i13 == 0) {
                this.f51589yggfygwlhe = new Object[]{obj, this.f51589yggfygwlhe};
            } else {
                Object[] objArr = new Object[i14 + 1];
                if (i14 == 1) {
                    objArr[0] = this.f51589yggfygwlhe;
                } else {
                    Object[] objArr2 = (Object[]) this.f51589yggfygwlhe;
                    System.arraycopy(objArr2, 0, objArr, 0, i13);
                    System.arraycopy(objArr2, i13, objArr, i13 + 1, this.f51590zdlpuopuiu - i13);
                }
                objArr[i13] = obj;
                this.f51589yggfygwlhe = objArr;
            }
            this.f51590zdlpuopuiu++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i13 + ", Size: " + this.f51590zdlpuopuiu);
    }
}
