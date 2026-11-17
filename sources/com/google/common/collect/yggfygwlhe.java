package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yggfygwlhe implements Map, Serializable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static final Map.Entry[] f23733iwizpuwonk = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private transient oxmwwwfdhm f23734jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private transient jyumaefscl f23735yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private transient jyumaefscl f23736zdlpuopuiu;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        C0407iobyxmoadg f23737eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Comparator f23738iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f23739ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        boolean f23740wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        Object[] f23741zoijcleaow;

        /* JADX INFO: renamed from: com.google.common.collect.yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0407iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Object f23742iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final Object f23743ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final Object f23744zoijcleaow;

            C0407iobyxmoadg(Object obj, Object obj2, Object obj3) {
                this.f23742iobyxmoadg = obj;
                this.f23744zoijcleaow = obj2;
                this.f23743ppxfxbqfkf = obj3;
            }

            IllegalArgumentException iobyxmoadg() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f23742iobyxmoadg + "=" + this.f23744zoijcleaow + " and " + this.f23742iobyxmoadg + "=" + this.f23743ppxfxbqfkf);
            }
        }

        public iobyxmoadg() {
            this(4);
        }

        static void dxjokdxxww(Object[] objArr, int i13, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = i14 * 2;
                Object obj = objArr[i15];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i15 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i14] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i13, pkzmftpjix.wkgbmnqykc(comparator).nufgyqmvbu(zynmafqrjb.btonecajqb()));
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = i16 * 2;
                objArr[i17] = entryArr[i16].getKey();
                objArr[i17 + 1] = entryArr[i16].getValue();
            }
        }

        private Object[] eablkybsjg(Object[] objArr, int i13) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i14 = i13 - 1; i14 >= 0; i14--) {
                Object obj = objArr[i14 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i14);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i13 - bitSet.cardinality()) * 2];
            int i15 = 0;
            int i16 = 0;
            while (i15 < i13 * 2) {
                if (bitSet.get(i15 >>> 1)) {
                    i15 += 2;
                } else {
                    int i17 = i16 + 1;
                    int i18 = i15 + 1;
                    Object obj2 = objArr[i15];
                    Objects.requireNonNull(obj2);
                    objArr2[i16] = obj2;
                    i16 += 2;
                    i15 += 2;
                    Object obj3 = objArr[i18];
                    Objects.requireNonNull(obj3);
                    objArr2[i17] = obj3;
                }
            }
            return objArr2;
        }

        private void wkgbmnqykc(int i13) {
            int i14 = i13 * 2;
            Object[] objArr = this.f23741zoijcleaow;
            if (i14 > objArr.length) {
                this.f23741zoijcleaow = Arrays.copyOf(objArr, oxmwwwfdhm.zoijcleaow.ppxfxbqfkf(objArr.length, i14));
                this.f23740wkgbmnqykc = false;
            }
        }

        private yggfygwlhe zoijcleaow(boolean z13) {
            Object[] objArrEablkybsjg;
            C0407iobyxmoadg c0407iobyxmoadg;
            C0407iobyxmoadg c0407iobyxmoadg2;
            if (z13 && (c0407iobyxmoadg2 = this.f23737eablkybsjg) != null) {
                throw c0407iobyxmoadg2.iobyxmoadg();
            }
            int length = this.f23739ppxfxbqfkf;
            if (this.f23738iobyxmoadg == null) {
                objArrEablkybsjg = this.f23741zoijcleaow;
            } else {
                if (this.f23740wkgbmnqykc) {
                    this.f23741zoijcleaow = Arrays.copyOf(this.f23741zoijcleaow, length * 2);
                }
                objArrEablkybsjg = this.f23741zoijcleaow;
                if (!z13) {
                    objArrEablkybsjg = eablkybsjg(objArrEablkybsjg, this.f23739ppxfxbqfkf);
                    if (objArrEablkybsjg.length < this.f23741zoijcleaow.length) {
                        length = objArrEablkybsjg.length >>> 1;
                    }
                }
                dxjokdxxww(objArrEablkybsjg, length, this.f23738iobyxmoadg);
            }
            this.f23740wkgbmnqykc = true;
            hkdspvbjdz hkdspvbjdzVarLereixgezr = hkdspvbjdz.lereixgezr(length, objArrEablkybsjg, this);
            if (!z13 || (c0407iobyxmoadg = this.f23737eablkybsjg) == null) {
                return hkdspvbjdzVarLereixgezr;
            }
            throw c0407iobyxmoadg.iobyxmoadg();
        }

        public iobyxmoadg gxszxtbevo(Object obj, Object obj2) {
            wkgbmnqykc(this.f23739ppxfxbqfkf + 1);
            nufgyqmvbu.iobyxmoadg(obj, obj2);
            Object[] objArr = this.f23741zoijcleaow;
            int i13 = this.f23739ppxfxbqfkf;
            objArr[i13 * 2] = obj;
            objArr[(i13 * 2) + 1] = obj2;
            this.f23739ppxfxbqfkf = i13 + 1;
            return this;
        }

        public yggfygwlhe iobyxmoadg() {
            return ppxfxbqfkf();
        }

        public iobyxmoadg lqeggnwhkg(Map.Entry entry) {
            return gxszxtbevo(entry.getKey(), entry.getValue());
        }

        public iobyxmoadg nufgyqmvbu(Iterable iterable) {
            if (iterable instanceof Collection) {
                wkgbmnqykc(this.f23739ppxfxbqfkf + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                lqeggnwhkg((Map.Entry) it.next());
            }
            return this;
        }

        public yggfygwlhe ppxfxbqfkf() {
            return zoijcleaow(true);
        }

        iobyxmoadg(int i13) {
            this.f23741zoijcleaow = new Object[i13 * 2];
            this.f23739ppxfxbqfkf = 0;
            this.f23740wkgbmnqykc = false;
        }
    }

    static class zoijcleaow implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Object f23745yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f23746zdlpuopuiu;

        zoijcleaow(yggfygwlhe yggfygwlheVar) {
            Object[] objArr = new Object[yggfygwlheVar.size()];
            Object[] objArr2 = new Object[yggfygwlheVar.size()];
            ulzqkzuiru it = yggfygwlheVar.entrySet().iterator();
            int i13 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i13] = entry.getKey();
                objArr2[i13] = entry.getValue();
                i13++;
            }
            this.f23746zdlpuopuiu = objArr;
            this.f23745yggfygwlhe = objArr2;
        }

        final Object iobyxmoadg() {
            Object[] objArr = (Object[]) this.f23746zdlpuopuiu;
            Object[] objArr2 = (Object[]) this.f23745yggfygwlhe;
            iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(objArr.length);
            for (int i13 = 0; i13 < objArr.length; i13++) {
                iobyxmoadgVarWkgbmnqykc.gxszxtbevo(objArr[i13], objArr2[i13]);
            }
            return iobyxmoadgVarWkgbmnqykc.ppxfxbqfkf();
        }

        final Object readResolve() {
            Object obj = this.f23746zdlpuopuiu;
            if (!(obj instanceof jyumaefscl)) {
                return iobyxmoadg();
            }
            jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) this.f23745yggfygwlhe;
            iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(jyumaefsclVar.size());
            ulzqkzuiru it = jyumaefsclVar.iterator();
            ulzqkzuiru it2 = oxmwwwfdhmVar.iterator();
            while (it.hasNext()) {
                iobyxmoadgVarWkgbmnqykc.gxszxtbevo(it.next(), it2.next());
            }
            return iobyxmoadgVarWkgbmnqykc.ppxfxbqfkf();
        }

        iobyxmoadg wkgbmnqykc(int i13) {
            return new iobyxmoadg(i13);
        }
    }

    yggfygwlhe() {
    }

    public static yggfygwlhe dxjokdxxww(Map map) {
        if ((map instanceof yggfygwlhe) && !(map instanceof SortedMap)) {
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) map;
            if (!yggfygwlheVar.rgvfuqvkyq()) {
                return yggfygwlheVar;
            }
        }
        return lqeggnwhkg(map.entrySet());
    }

    public static iobyxmoadg iobyxmoadg() {
        return new iobyxmoadg();
    }

    public static yggfygwlhe kcexrzcfyt() {
        return hkdspvbjdz.f23648pmvmpeiblj;
    }

    public static yggfygwlhe lqeggnwhkg(Iterable iterable) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        iobyxmoadgVar.nufgyqmvbu(iterable);
        return iobyxmoadgVar.iobyxmoadg();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static iobyxmoadg wkgbmnqykc(int i13) {
        nufgyqmvbu.zoijcleaow(i13, "expectedSize");
        return new iobyxmoadg(i13);
    }

    public static yggfygwlhe zdlpuopuiu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        nufgyqmvbu.iobyxmoadg(obj, obj2);
        nufgyqmvbu.iobyxmoadg(obj3, obj4);
        nufgyqmvbu.iobyxmoadg(obj5, obj6);
        nufgyqmvbu.iobyxmoadg(obj7, obj8);
        return hkdspvbjdz.cqumvgiudr(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    abstract oxmwwwfdhm agtfadlqog();

    abstract jyumaefscl btonecajqb();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract jyumaefscl draadjrbmk();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return zynmafqrjb.ppxfxbqfkf(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return kegysxyocb.wkgbmnqykc(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public oxmwwwfdhm values() {
        oxmwwwfdhm oxmwwwfdhmVar = this.f23734jyumaefscl;
        if (oxmwwwfdhmVar != null) {
            return oxmwwwfdhmVar;
        }
        oxmwwwfdhm oxmwwwfdhmVarAgtfadlqog = agtfadlqog();
        this.f23734jyumaefscl = oxmwwwfdhmVarAgtfadlqog;
        return oxmwwwfdhmVarAgtfadlqog;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public jyumaefscl entrySet() {
        jyumaefscl jyumaefsclVar = this.f23736zdlpuopuiu;
        if (jyumaefsclVar != null) {
            return jyumaefsclVar;
        }
        jyumaefscl jyumaefsclVarBtonecajqb = btonecajqb();
        this.f23736zdlpuopuiu = jyumaefsclVarBtonecajqb;
        return jyumaefsclVarBtonecajqb;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    abstract boolean rgvfuqvkyq();

    public String toString() {
        return zynmafqrjb.dxjokdxxww(this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public jyumaefscl keySet() {
        jyumaefscl jyumaefsclVar = this.f23735yggfygwlhe;
        if (jyumaefsclVar != null) {
            return jyumaefsclVar;
        }
        jyumaefscl jyumaefsclVarDraadjrbmk = draadjrbmk();
        this.f23735yggfygwlhe = jyumaefsclVarDraadjrbmk;
        return jyumaefsclVarDraadjrbmk;
    }

    Object writeReplace() {
        return new zoijcleaow(this);
    }
}
