package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jyumaefscl extends oxmwwwfdhm implements Set {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private transient zdlpuopuiu f23667yggfygwlhe;

    public static class iobyxmoadg extends oxmwwwfdhm.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f23668eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Object[] f23669wkgbmnqykc;

        public iobyxmoadg() {
            super(4);
        }

        private void gtknphoqwx(Object obj) {
            Objects.requireNonNull(this.f23669wkgbmnqykc);
            int length = this.f23669wkgbmnqykc.length - 1;
            int iHashCode = obj.hashCode();
            int iZoijcleaow = vdvldrhtss.zoijcleaow(iHashCode);
            while (true) {
                int i13 = iZoijcleaow & length;
                Object[] objArr = this.f23669wkgbmnqykc;
                Object obj2 = objArr[i13];
                if (obj2 == null) {
                    objArr[i13] = obj;
                    this.f23668eablkybsjg += iHashCode;
                    super.wkgbmnqykc(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iZoijcleaow = i13 + 1;
                }
            }
        }

        public iobyxmoadg btonecajqb(Iterable iterable) {
            xa.draadjrbmk.btonecajqb(iterable);
            if (this.f23669wkgbmnqykc != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    iobyxmoadg(it.next());
                }
            } else {
                super.zoijcleaow(iterable);
            }
            return this;
        }

        public jyumaefscl draadjrbmk() {
            jyumaefscl jyumaefsclVarZdlpuopuiu;
            int i13 = this.f23690zoijcleaow;
            if (i13 == 0) {
                return jyumaefscl.pmvmpeiblj();
            }
            if (i13 == 1) {
                Object obj = this.f23688iobyxmoadg[0];
                Objects.requireNonNull(obj);
                return jyumaefscl.zynmafqrjb(obj);
            }
            if (this.f23669wkgbmnqykc == null || jyumaefscl.kcexrzcfyt(i13) != this.f23669wkgbmnqykc.length) {
                jyumaefsclVarZdlpuopuiu = jyumaefscl.zdlpuopuiu(this.f23690zoijcleaow, this.f23688iobyxmoadg);
                this.f23690zoijcleaow = jyumaefsclVarZdlpuopuiu.size();
            } else {
                Object[] objArrCopyOf = jyumaefscl.lmojexxdyd(this.f23690zoijcleaow, this.f23688iobyxmoadg.length) ? Arrays.copyOf(this.f23688iobyxmoadg, this.f23690zoijcleaow) : this.f23688iobyxmoadg;
                int i14 = this.f23668eablkybsjg;
                Object[] objArr = this.f23669wkgbmnqykc;
                jyumaefsclVarZdlpuopuiu = new cllcsxoeiz(objArrCopyOf, i14, objArr, objArr.length - 1, this.f23690zoijcleaow);
            }
            this.f23689ppxfxbqfkf = true;
            this.f23669wkgbmnqykc = null;
            return jyumaefsclVarZdlpuopuiu;
        }

        public iobyxmoadg dxjokdxxww(Object... objArr) {
            if (this.f23669wkgbmnqykc != null) {
                for (Object obj : objArr) {
                    iobyxmoadg(obj);
                }
            } else {
                super.eablkybsjg(objArr);
            }
            return this;
        }

        @Override // com.google.common.collect.oxmwwwfdhm.zoijcleaow
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg(Object obj) {
            xa.draadjrbmk.btonecajqb(obj);
            if (this.f23669wkgbmnqykc != null && jyumaefscl.kcexrzcfyt(this.f23690zoijcleaow) <= this.f23669wkgbmnqykc.length) {
                gtknphoqwx(obj);
                return this;
            }
            this.f23669wkgbmnqykc = null;
            super.wkgbmnqykc(obj);
            return this;
        }
    }

    private static class zoijcleaow implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Object[] f23670zdlpuopuiu;

        zoijcleaow(Object[] objArr) {
            this.f23670zdlpuopuiu = objArr;
        }

        Object readResolve() {
            return jyumaefscl.jyumaefscl(this.f23670zdlpuopuiu);
        }
    }

    jyumaefscl() {
    }

    public static jyumaefscl cdpycssgdh(Object obj, Object obj2, Object obj3) {
        return zdlpuopuiu(3, obj, obj2, obj3);
    }

    public static jyumaefscl istkbnxepw(Object obj, Object obj2) {
        return zdlpuopuiu(2, obj, obj2);
    }

    public static jyumaefscl jyumaefscl(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zdlpuopuiu(objArr.length, (Object[]) objArr.clone()) : zynmafqrjb(objArr[0]);
        }
        return pmvmpeiblj();
    }

    static int kcexrzcfyt(int i13) {
        int iMax = Math.max(i13, 2);
        if (iMax >= 751619276) {
            xa.draadjrbmk.eablkybsjg(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lmojexxdyd(int i13, int i14) {
        return i13 < (i14 >> 1) + (i14 >> 2);
    }

    public static jyumaefscl pmvmpeiblj() {
        return cllcsxoeiz.f23626zynmafqrjb;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static jyumaefscl yadqdtsiqt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zdlpuopuiu(5, obj, obj2, obj3, obj4, obj5);
    }

    public static jyumaefscl yggfygwlhe(Collection collection) {
        if ((collection instanceof jyumaefscl) && !(collection instanceof SortedSet)) {
            jyumaefscl jyumaefsclVar = (jyumaefscl) collection;
            if (!jyumaefsclVar.agtfadlqog()) {
                return jyumaefsclVar;
            }
        }
        Object[] array = collection.toArray();
        return zdlpuopuiu(array.length, array);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jyumaefscl zdlpuopuiu(int i13, Object... objArr) {
        if (i13 == 0) {
            return pmvmpeiblj();
        }
        if (i13 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return zynmafqrjb(obj);
        }
        int iKcexrzcfyt = kcexrzcfyt(i13);
        Object[] objArr2 = new Object[iKcexrzcfyt];
        int i14 = iKcexrzcfyt - 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            Object objIobyxmoadg = ylkuphrtab.iobyxmoadg(objArr[i17], i17);
            int iHashCode = objIobyxmoadg.hashCode();
            int iZoijcleaow = vdvldrhtss.zoijcleaow(iHashCode);
            while (true) {
                int i18 = iZoijcleaow & i14;
                Object obj2 = objArr2[i18];
                if (obj2 == null) {
                    objArr[i16] = objIobyxmoadg;
                    objArr2[i18] = objIobyxmoadg;
                    i15 += iHashCode;
                    i16++;
                    break;
                }
                if (obj2.equals(objIobyxmoadg)) {
                    break;
                }
                iZoijcleaow++;
            }
        }
        Arrays.fill(objArr, i16, i13, (Object) null);
        if (i16 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new tzroggbefp(obj3);
        }
        if (kcexrzcfyt(i16) < iKcexrzcfyt / 2) {
            return zdlpuopuiu(i16, objArr);
        }
        if (lmojexxdyd(i16, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i16);
        }
        return new cllcsxoeiz(objArr, i15, objArr2, i14, i16);
    }

    public static jyumaefscl zynmafqrjb(Object obj) {
        return new tzroggbefp(obj);
    }

    zdlpuopuiu cqumvgiudr() {
        return zdlpuopuiu.rgvfuqvkyq(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jyumaefscl) && lereixgezr() && ((jyumaefscl) obj).lereixgezr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return kegysxyocb.iobyxmoadg(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return kegysxyocb.wkgbmnqykc(this);
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    public zdlpuopuiu iobyxmoadg() {
        zdlpuopuiu zdlpuopuiuVar = this.f23667yggfygwlhe;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar;
        }
        zdlpuopuiu zdlpuopuiuVarCqumvgiudr = cqumvgiudr();
        this.f23667yggfygwlhe = zdlpuopuiuVarCqumvgiudr;
        return zdlpuopuiuVarCqumvgiudr;
    }

    boolean lereixgezr() {
        return false;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    /* JADX INFO: renamed from: ojitshcjhn */
    public abstract ulzqkzuiru iterator();

    @Override // com.google.common.collect.oxmwwwfdhm
    Object writeReplace() {
        return new zoijcleaow(toArray());
    }
}
