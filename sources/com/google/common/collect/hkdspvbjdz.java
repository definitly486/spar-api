package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class hkdspvbjdz extends yggfygwlhe {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    static final yggfygwlhe f23648pmvmpeiblj = new hkdspvbjdz(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final transient Object f23649cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final transient Object[] f23650esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final transient int f23651lereixgezr;

    static class iobyxmoadg extends jyumaefscl {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final transient int f23652cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final transient int f23653esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final transient Object[] f23654iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final transient yggfygwlhe f23655jyumaefscl;

        /* JADX INFO: renamed from: com.google.common.collect.hkdspvbjdz$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0403iobyxmoadg extends zdlpuopuiu {
            C0403iobyxmoadg() {
            }

            @Override // com.google.common.collect.oxmwwwfdhm
            public boolean agtfadlqog() {
                return true;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i13) {
                xa.draadjrbmk.nufgyqmvbu(i13, iobyxmoadg.this.f23653esjtqupxsv);
                int i14 = i13 * 2;
                Object obj = iobyxmoadg.this.f23654iwizpuwonk[iobyxmoadg.this.f23652cqumvgiudr + i14];
                Objects.requireNonNull(obj);
                Object obj2 = iobyxmoadg.this.f23654iwizpuwonk[i14 + (iobyxmoadg.this.f23652cqumvgiudr ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iobyxmoadg.this.f23653esjtqupxsv;
            }

            @Override // com.google.common.collect.zdlpuopuiu, com.google.common.collect.oxmwwwfdhm
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        iobyxmoadg(yggfygwlhe yggfygwlheVar, Object[] objArr, int i13, int i14) {
            this.f23655jyumaefscl = yggfygwlheVar;
            this.f23654iwizpuwonk = objArr;
            this.f23652cqumvgiudr = i13;
            this.f23653esjtqupxsv = i14;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        boolean agtfadlqog() {
            return true;
        }

        @Override // com.google.common.collect.oxmwwwfdhm, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f23655jyumaefscl.get(key));
        }

        @Override // com.google.common.collect.jyumaefscl
        zdlpuopuiu cqumvgiudr() {
            return new C0403iobyxmoadg();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: ojitshcjhn */
        public ulzqkzuiru iterator() {
            return iobyxmoadg().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f23653esjtqupxsv;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        int wkgbmnqykc(Object[] objArr, int i13) {
            return iobyxmoadg().wkgbmnqykc(objArr, i13);
        }

        @Override // com.google.common.collect.jyumaefscl, com.google.common.collect.oxmwwwfdhm
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class ppxfxbqfkf extends zdlpuopuiu {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final transient int f23657cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final transient int f23658iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final transient Object[] f23659jyumaefscl;

        ppxfxbqfkf(Object[] objArr, int i13, int i14) {
            this.f23659jyumaefscl = objArr;
            this.f23658iwizpuwonk = i13;
            this.f23657cqumvgiudr = i14;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        boolean agtfadlqog() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i13) {
            xa.draadjrbmk.nufgyqmvbu(i13, this.f23657cqumvgiudr);
            Object obj = this.f23659jyumaefscl[(i13 * 2) + this.f23658iwizpuwonk];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23657cqumvgiudr;
        }

        @Override // com.google.common.collect.zdlpuopuiu, com.google.common.collect.oxmwwwfdhm
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class zoijcleaow extends jyumaefscl {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final transient zdlpuopuiu f23660iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final transient yggfygwlhe f23661jyumaefscl;

        zoijcleaow(yggfygwlhe yggfygwlheVar, zdlpuopuiu zdlpuopuiuVar) {
            this.f23661jyumaefscl = yggfygwlheVar;
            this.f23660iwizpuwonk = zdlpuopuiuVar;
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        boolean agtfadlqog() {
            return true;
        }

        @Override // com.google.common.collect.oxmwwwfdhm, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f23661jyumaefscl.get(obj) != null;
        }

        @Override // com.google.common.collect.jyumaefscl, com.google.common.collect.oxmwwwfdhm
        public zdlpuopuiu iobyxmoadg() {
            return this.f23660iwizpuwonk;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: ojitshcjhn */
        public ulzqkzuiru iterator() {
            return iobyxmoadg().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f23661jyumaefscl.size();
        }

        @Override // com.google.common.collect.oxmwwwfdhm
        int wkgbmnqykc(Object[] objArr, int i13) {
            return iobyxmoadg().wkgbmnqykc(objArr, i13);
        }

        @Override // com.google.common.collect.jyumaefscl, com.google.common.collect.oxmwwwfdhm
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private hkdspvbjdz(Object obj, Object[] objArr, int i13) {
        this.f23649cqumvgiudr = obj;
        this.f23650esjtqupxsv = objArr;
        this.f23651lereixgezr = i13;
    }

    static hkdspvbjdz cqumvgiudr(int i13, Object[] objArr) {
        return lereixgezr(i13, objArr, null);
    }

    static hkdspvbjdz lereixgezr(int i13, Object[] objArr, yggfygwlhe.iobyxmoadg iobyxmoadgVar) {
        if (i13 == 0) {
            return (hkdspvbjdz) f23648pmvmpeiblj;
        }
        if (i13 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            nufgyqmvbu.iobyxmoadg(obj, obj2);
            return new hkdspvbjdz(null, objArr, 1);
        }
        xa.draadjrbmk.draadjrbmk(i13, objArr.length >> 1);
        Object objPmvmpeiblj = pmvmpeiblj(objArr, i13, jyumaefscl.kcexrzcfyt(i13), 0);
        if (objPmvmpeiblj instanceof Object[]) {
            Object[] objArr2 = (Object[]) objPmvmpeiblj;
            yggfygwlhe.iobyxmoadg.C0407iobyxmoadg c0407iobyxmoadg = (yggfygwlhe.iobyxmoadg.C0407iobyxmoadg) objArr2[2];
            if (iobyxmoadgVar == null) {
                throw c0407iobyxmoadg.iobyxmoadg();
            }
            iobyxmoadgVar.f23737eablkybsjg = c0407iobyxmoadg;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objPmvmpeiblj = obj3;
            i13 = iIntValue;
        }
        return new hkdspvbjdz(objPmvmpeiblj, objArr, i13);
    }

    private static Object pmvmpeiblj(Object[] objArr, int i13, int i14, int i15) {
        yggfygwlhe.iobyxmoadg.C0407iobyxmoadg c0407iobyxmoadg = null;
        if (i13 == 1) {
            Object obj = objArr[i15];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i15 ^ 1];
            Objects.requireNonNull(obj2);
            nufgyqmvbu.iobyxmoadg(obj, obj2);
            return null;
        }
        int i16 = i14 - 1;
        int i17 = -1;
        if (i14 <= 128) {
            byte[] bArr = new byte[i14];
            Arrays.fill(bArr, (byte) -1);
            int i18 = 0;
            for (int i19 = 0; i19 < i13; i19++) {
                int i23 = (i19 * 2) + i15;
                int i24 = (i18 * 2) + i15;
                Object obj3 = objArr[i23];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i23 ^ 1];
                Objects.requireNonNull(obj4);
                nufgyqmvbu.iobyxmoadg(obj3, obj4);
                int iZoijcleaow = vdvldrhtss.zoijcleaow(obj3.hashCode());
                while (true) {
                    int i25 = iZoijcleaow & i16;
                    int i26 = bArr[i25] & 255;
                    if (i26 == 255) {
                        bArr[i25] = (byte) i24;
                        if (i18 < i19) {
                            objArr[i24] = obj3;
                            objArr[i24 ^ 1] = obj4;
                        }
                        i18++;
                        break;
                    }
                    if (obj3.equals(objArr[i26])) {
                        int i27 = i26 ^ 1;
                        Object obj5 = objArr[i27];
                        Objects.requireNonNull(obj5);
                        c0407iobyxmoadg = new yggfygwlhe.iobyxmoadg.C0407iobyxmoadg(obj3, obj4, obj5);
                        objArr[i27] = obj4;
                        break;
                    }
                    iZoijcleaow = i25 + 1;
                }
            }
            return i18 == i13 ? bArr : new Object[]{bArr, Integer.valueOf(i18), c0407iobyxmoadg};
        }
        if (i14 <= 32768) {
            short[] sArr = new short[i14];
            Arrays.fill(sArr, (short) -1);
            int i28 = 0;
            for (int i29 = 0; i29 < i13; i29++) {
                int i33 = (i29 * 2) + i15;
                int i34 = (i28 * 2) + i15;
                Object obj6 = objArr[i33];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i33 ^ 1];
                Objects.requireNonNull(obj7);
                nufgyqmvbu.iobyxmoadg(obj6, obj7);
                int iZoijcleaow2 = vdvldrhtss.zoijcleaow(obj6.hashCode());
                while (true) {
                    int i35 = iZoijcleaow2 & i16;
                    int i36 = sArr[i35] & 65535;
                    if (i36 == 65535) {
                        sArr[i35] = (short) i34;
                        if (i28 < i29) {
                            objArr[i34] = obj6;
                            objArr[i34 ^ 1] = obj7;
                        }
                        i28++;
                        break;
                    }
                    if (obj6.equals(objArr[i36])) {
                        int i37 = i36 ^ 1;
                        Object obj8 = objArr[i37];
                        Objects.requireNonNull(obj8);
                        c0407iobyxmoadg = new yggfygwlhe.iobyxmoadg.C0407iobyxmoadg(obj6, obj7, obj8);
                        objArr[i37] = obj7;
                        break;
                    }
                    iZoijcleaow2 = i35 + 1;
                }
            }
            return i28 == i13 ? sArr : new Object[]{sArr, Integer.valueOf(i28), c0407iobyxmoadg};
        }
        int[] iArr = new int[i14];
        Arrays.fill(iArr, -1);
        int i38 = 0;
        int i39 = 0;
        while (i38 < i13) {
            int i43 = (i38 * 2) + i15;
            int i44 = (i39 * 2) + i15;
            Object obj9 = objArr[i43];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i43 ^ 1];
            Objects.requireNonNull(obj10);
            nufgyqmvbu.iobyxmoadg(obj9, obj10);
            int iZoijcleaow3 = vdvldrhtss.zoijcleaow(obj9.hashCode());
            while (true) {
                int i45 = iZoijcleaow3 & i16;
                int i46 = iArr[i45];
                if (i46 == i17) {
                    iArr[i45] = i44;
                    if (i39 < i38) {
                        objArr[i44] = obj9;
                        objArr[i44 ^ 1] = obj10;
                    }
                    i39++;
                    break;
                }
                if (obj9.equals(objArr[i46])) {
                    int i47 = i46 ^ 1;
                    Object obj11 = objArr[i47];
                    Objects.requireNonNull(obj11);
                    c0407iobyxmoadg = new yggfygwlhe.iobyxmoadg.C0407iobyxmoadg(obj9, obj10, obj11);
                    objArr[i47] = obj10;
                    break;
                }
                iZoijcleaow3 = i45 + 1;
                i17 = -1;
            }
            i38++;
            i17 = -1;
        }
        return i39 == i13 ? iArr : new Object[]{iArr, Integer.valueOf(i39), c0407iobyxmoadg};
    }

    static Object zynmafqrjb(Object obj, Object[] objArr, int i13, int i14, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i13 == 1) {
            Object obj3 = objArr[i14];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i14 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iZoijcleaow = vdvldrhtss.zoijcleaow(obj2.hashCode());
            while (true) {
                int i15 = iZoijcleaow & length;
                int i16 = bArr[i15] & 255;
                if (i16 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                iZoijcleaow = i15 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iZoijcleaow2 = vdvldrhtss.zoijcleaow(obj2.hashCode());
            while (true) {
                int i17 = iZoijcleaow2 & length2;
                int i18 = sArr[i17] & 65535;
                if (i18 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i18])) {
                    return objArr[i18 ^ 1];
                }
                iZoijcleaow2 = i17 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iZoijcleaow3 = vdvldrhtss.zoijcleaow(obj2.hashCode());
            while (true) {
                int i19 = iZoijcleaow3 & length3;
                int i23 = iArr[i19];
                if (i23 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i23])) {
                    return objArr[i23 ^ 1];
                }
                iZoijcleaow3 = i19 + 1;
            }
        }
    }

    @Override // com.google.common.collect.yggfygwlhe
    oxmwwwfdhm agtfadlqog() {
        return new ppxfxbqfkf(this.f23650esjtqupxsv, 1, this.f23651lereixgezr);
    }

    @Override // com.google.common.collect.yggfygwlhe
    jyumaefscl btonecajqb() {
        return new iobyxmoadg(this, this.f23650esjtqupxsv, 0, this.f23651lereixgezr);
    }

    @Override // com.google.common.collect.yggfygwlhe
    jyumaefscl draadjrbmk() {
        return new zoijcleaow(this, new ppxfxbqfkf(this.f23650esjtqupxsv, 0, this.f23651lereixgezr));
    }

    @Override // com.google.common.collect.yggfygwlhe, java.util.Map
    public Object get(Object obj) {
        Object objZynmafqrjb = zynmafqrjb(this.f23649cqumvgiudr, this.f23650esjtqupxsv, this.f23651lereixgezr, 0, obj);
        if (objZynmafqrjb == null) {
            return null;
        }
        return objZynmafqrjb;
    }

    @Override // com.google.common.collect.yggfygwlhe
    boolean rgvfuqvkyq() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f23651lereixgezr;
    }

    @Override // com.google.common.collect.yggfygwlhe
    Object writeReplace() {
        return super.writeReplace();
    }
}
