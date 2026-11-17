package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo extends lqeggnwhkg {

    private static class iobyxmoadg extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final int f23771jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final int f23772yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final int[] f23773zdlpuopuiu;

        iobyxmoadg(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && gxszxtbevo.dxjokdxxww(this.f23773zdlpuopuiu, ((Integer) obj).intValue(), this.f23772yggfygwlhe, this.f23771jyumaefscl) != -1;
        }

        int[] dxjokdxxww() {
            return Arrays.copyOfRange(this.f23773zdlpuopuiu, this.f23772yggfygwlhe, this.f23771jyumaefscl);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return super.equals(obj);
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            int size = size();
            if (iobyxmoadgVar.size() != size) {
                return false;
            }
            for (int i13 = 0; i13 < size; i13++) {
                if (this.f23773zdlpuopuiu[this.f23772yggfygwlhe + i13] != iobyxmoadgVar.f23773zdlpuopuiu[iobyxmoadgVar.f23772yggfygwlhe + i13]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iNufgyqmvbu = 1;
            for (int i13 = this.f23772yggfygwlhe; i13 < this.f23771jyumaefscl; i13++) {
                iNufgyqmvbu = (iNufgyqmvbu * 31) + gxszxtbevo.nufgyqmvbu(this.f23773zdlpuopuiu[i13]);
            }
            return iNufgyqmvbu;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iDxjokdxxww;
            if (!(obj instanceof Integer) || (iDxjokdxxww = gxszxtbevo.dxjokdxxww(this.f23773zdlpuopuiu, ((Integer) obj).intValue(), this.f23772yggfygwlhe, this.f23771jyumaefscl)) < 0) {
                return -1;
            }
            return iDxjokdxxww - this.f23772yggfygwlhe;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Integer get(int i13) {
            draadjrbmk.nufgyqmvbu(i13, size());
            return Integer.valueOf(this.f23773zdlpuopuiu[this.f23772yggfygwlhe + i13]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iBtonecajqb;
            if (!(obj instanceof Integer) || (iBtonecajqb = gxszxtbevo.btonecajqb(this.f23773zdlpuopuiu, ((Integer) obj).intValue(), this.f23772yggfygwlhe, this.f23771jyumaefscl)) < 0) {
                return -1;
            }
            return iBtonecajqb - this.f23772yggfygwlhe;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23771jyumaefscl - this.f23772yggfygwlhe;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i13, int i14) {
            draadjrbmk.agtfadlqog(i13, i14, size());
            if (i13 == i14) {
                return Collections.emptyList();
            }
            int[] iArr = this.f23773zdlpuopuiu;
            int i15 = this.f23772yggfygwlhe;
            return new iobyxmoadg(iArr, i13 + i15, i15 + i14);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 5);
            sb3.append('[');
            sb3.append(this.f23773zdlpuopuiu[this.f23772yggfygwlhe]);
            int i13 = this.f23772yggfygwlhe;
            while (true) {
                i13++;
                if (i13 >= this.f23771jyumaefscl) {
                    sb3.append(']');
                    return sb3.toString();
                }
                sb3.append(", ");
                sb3.append(this.f23773zdlpuopuiu[i13]);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public Integer set(int i13, Integer num) {
            draadjrbmk.nufgyqmvbu(i13, size());
            int[] iArr = this.f23773zdlpuopuiu;
            int i14 = this.f23772yggfygwlhe;
            int i15 = iArr[i14 + i13];
            iArr[i14 + i13] = ((Integer) draadjrbmk.btonecajqb(num)).intValue();
            return Integer.valueOf(i15);
        }

        iobyxmoadg(int[] iArr, int i13, int i14) {
            this.f23773zdlpuopuiu = iArr;
            this.f23772yggfygwlhe = i13;
            this.f23771jyumaefscl = i14;
        }
    }

    public static Integer agtfadlqog(String str, int i13) {
        Long lPpxfxbqfkf = nufgyqmvbu.ppxfxbqfkf(str, i13);
        if (lPpxfxbqfkf == null || lPpxfxbqfkf.longValue() != lPpxfxbqfkf.intValue()) {
            return null;
        }
        return Integer.valueOf(lPpxfxbqfkf.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int btonecajqb(int[] iArr, int i13, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (iArr[i16] == i13) {
                return i16;
            }
        }
        return -1;
    }

    public static int[] draadjrbmk(Collection collection) {
        if (collection instanceof iobyxmoadg) {
            return ((iobyxmoadg) collection).dxjokdxxww();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = ((Number) draadjrbmk.btonecajqb(array[i13])).intValue();
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int dxjokdxxww(int[] iArr, int i13, int i14, int i15) {
        while (i14 < i15) {
            if (iArr[i14] == i13) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int eablkybsjg(int i13, int i14, int i15) {
        draadjrbmk.gxszxtbevo(i14 <= i15, "min (%s) must be less than or equal to max (%s)", i14, i15);
        return Math.min(Math.max(i13, i14), i15);
    }

    public static int gtknphoqwx(long j13) {
        if (j13 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j13 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j13;
    }

    public static int gxszxtbevo(byte[] bArr) {
        draadjrbmk.gxszxtbevo(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return lqeggnwhkg(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int lqeggnwhkg(byte b13, byte b14, byte b15, byte b16) {
        return (b13 << 24) | ((b14 & 255) << 16) | ((b15 & 255) << 8) | (b16 & 255);
    }

    public static int nufgyqmvbu(int i13) {
        return i13;
    }

    public static List ppxfxbqfkf(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new iobyxmoadg(iArr);
    }

    public static Integer wflxmlrfwp(String str) {
        return agtfadlqog(str, 10);
    }

    public static int wkgbmnqykc(long j13) {
        int i13 = (int) j13;
        draadjrbmk.lqeggnwhkg(((long) i13) == j13, "Out of range: %s", j13);
        return i13;
    }
}
