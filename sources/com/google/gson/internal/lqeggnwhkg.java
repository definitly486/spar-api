package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final Comparator f25117zynmafqrjb = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    int f25118cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final eablkybsjg f25119esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int f25120iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    eablkybsjg f25121jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private zoijcleaow f25122lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ppxfxbqfkf f25123pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f25124yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Comparator f25125zdlpuopuiu;

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    final class ppxfxbqfkf extends AbstractSet {

        class iobyxmoadg extends wkgbmnqykc {
            iobyxmoadg() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return iobyxmoadg().f25127esjtqupxsv;
            }
        }

        ppxfxbqfkf() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            lqeggnwhkg.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return lqeggnwhkg.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new iobyxmoadg();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return lqeggnwhkg.this.agtfadlqog(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return lqeggnwhkg.this.f25120iwizpuwonk;
        }
    }

    private abstract class wkgbmnqykc implements Iterator {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f25138jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        eablkybsjg f25139yggfygwlhe = null;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        eablkybsjg f25140zdlpuopuiu;

        wkgbmnqykc() {
            this.f25140zdlpuopuiu = lqeggnwhkg.this.f25119esjtqupxsv.f25128iwizpuwonk;
            this.f25138jyumaefscl = lqeggnwhkg.this.f25118cqumvgiudr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f25140zdlpuopuiu != lqeggnwhkg.this.f25119esjtqupxsv;
        }

        final eablkybsjg iobyxmoadg() {
            eablkybsjg eablkybsjgVar = this.f25140zdlpuopuiu;
            lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
            if (eablkybsjgVar == lqeggnwhkgVar.f25119esjtqupxsv) {
                throw new NoSuchElementException();
            }
            if (lqeggnwhkgVar.f25118cqumvgiudr != this.f25138jyumaefscl) {
                throw new ConcurrentModificationException();
            }
            this.f25140zdlpuopuiu = eablkybsjgVar.f25128iwizpuwonk;
            this.f25139yggfygwlhe = eablkybsjgVar;
            return eablkybsjgVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            eablkybsjg eablkybsjgVar = this.f25139yggfygwlhe;
            if (eablkybsjgVar == null) {
                throw new IllegalStateException();
            }
            lqeggnwhkg.this.draadjrbmk(eablkybsjgVar, true);
            this.f25139yggfygwlhe = null;
            this.f25138jyumaefscl = lqeggnwhkg.this.f25118cqumvgiudr;
        }
    }

    class zoijcleaow extends AbstractSet {

        class iobyxmoadg extends wkgbmnqykc {
            iobyxmoadg() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return iobyxmoadg();
            }
        }

        zoijcleaow() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            lqeggnwhkg.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && lqeggnwhkg.this.lqeggnwhkg((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new iobyxmoadg();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            eablkybsjg eablkybsjgVarLqeggnwhkg;
            if (!(obj instanceof Map.Entry) || (eablkybsjgVarLqeggnwhkg = lqeggnwhkg.this.lqeggnwhkg((Map.Entry) obj)) == null) {
                return false;
            }
            lqeggnwhkg.this.draadjrbmk(eablkybsjgVarLqeggnwhkg, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return lqeggnwhkg.this.f25120iwizpuwonk;
        }
    }

    public lqeggnwhkg() {
        this(f25117zynmafqrjb, true);
    }

    private void btonecajqb(eablkybsjg eablkybsjgVar, boolean z13) {
        while (eablkybsjgVar != null) {
            eablkybsjg eablkybsjgVar2 = eablkybsjgVar.f25132yggfygwlhe;
            eablkybsjg eablkybsjgVar3 = eablkybsjgVar.f25129jyumaefscl;
            int i13 = eablkybsjgVar2 != null ? eablkybsjgVar2.f25134zynmafqrjb : 0;
            int i14 = eablkybsjgVar3 != null ? eablkybsjgVar3.f25134zynmafqrjb : 0;
            int i15 = i13 - i14;
            if (i15 == -2) {
                eablkybsjg eablkybsjgVar4 = eablkybsjgVar3.f25132yggfygwlhe;
                eablkybsjg eablkybsjgVar5 = eablkybsjgVar3.f25129jyumaefscl;
                int i16 = (eablkybsjgVar4 != null ? eablkybsjgVar4.f25134zynmafqrjb : 0) - (eablkybsjgVar5 != null ? eablkybsjgVar5.f25134zynmafqrjb : 0);
                if (i16 == -1 || (i16 == 0 && !z13)) {
                    rgvfuqvkyq(eablkybsjgVar);
                } else {
                    vdvldrhtss(eablkybsjgVar3);
                    rgvfuqvkyq(eablkybsjgVar);
                }
                if (z13) {
                    return;
                }
            } else if (i15 == 2) {
                eablkybsjg eablkybsjgVar6 = eablkybsjgVar2.f25132yggfygwlhe;
                eablkybsjg eablkybsjgVar7 = eablkybsjgVar2.f25129jyumaefscl;
                int i17 = (eablkybsjgVar6 != null ? eablkybsjgVar6.f25134zynmafqrjb : 0) - (eablkybsjgVar7 != null ? eablkybsjgVar7.f25134zynmafqrjb : 0);
                if (i17 == 1 || (i17 == 0 && !z13)) {
                    vdvldrhtss(eablkybsjgVar);
                } else {
                    rgvfuqvkyq(eablkybsjgVar2);
                    vdvldrhtss(eablkybsjgVar);
                }
                if (z13) {
                    return;
                }
            } else if (i15 == 0) {
                eablkybsjgVar.f25134zynmafqrjb = i13 + 1;
                if (z13) {
                    return;
                }
            } else {
                eablkybsjgVar.f25134zynmafqrjb = Math.max(i13, i14) + 1;
                if (!z13) {
                    return;
                }
            }
            eablkybsjgVar = eablkybsjgVar.f25133zdlpuopuiu;
        }
    }

    private boolean iobyxmoadg(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void ojitshcjhn(eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
        eablkybsjg eablkybsjgVar3 = eablkybsjgVar.f25133zdlpuopuiu;
        eablkybsjgVar.f25133zdlpuopuiu = null;
        if (eablkybsjgVar2 != null) {
            eablkybsjgVar2.f25133zdlpuopuiu = eablkybsjgVar3;
        }
        if (eablkybsjgVar3 == null) {
            this.f25121jyumaefscl = eablkybsjgVar2;
        } else if (eablkybsjgVar3.f25132yggfygwlhe == eablkybsjgVar) {
            eablkybsjgVar3.f25132yggfygwlhe = eablkybsjgVar2;
        } else {
            eablkybsjgVar3.f25129jyumaefscl = eablkybsjgVar2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rgvfuqvkyq(eablkybsjg eablkybsjgVar) {
        eablkybsjg eablkybsjgVar2 = eablkybsjgVar.f25132yggfygwlhe;
        eablkybsjg eablkybsjgVar3 = eablkybsjgVar.f25129jyumaefscl;
        eablkybsjg eablkybsjgVar4 = eablkybsjgVar3.f25132yggfygwlhe;
        eablkybsjg eablkybsjgVar5 = eablkybsjgVar3.f25129jyumaefscl;
        eablkybsjgVar.f25129jyumaefscl = eablkybsjgVar4;
        if (eablkybsjgVar4 != null) {
            eablkybsjgVar4.f25133zdlpuopuiu = eablkybsjgVar;
        }
        ojitshcjhn(eablkybsjgVar, eablkybsjgVar3);
        eablkybsjgVar3.f25132yggfygwlhe = eablkybsjgVar;
        eablkybsjgVar.f25133zdlpuopuiu = eablkybsjgVar3;
        int iMax = Math.max(eablkybsjgVar2 != null ? eablkybsjgVar2.f25134zynmafqrjb : 0, eablkybsjgVar4 != null ? eablkybsjgVar4.f25134zynmafqrjb : 0) + 1;
        eablkybsjgVar.f25134zynmafqrjb = iMax;
        eablkybsjgVar3.f25134zynmafqrjb = Math.max(iMax, eablkybsjgVar5 != null ? eablkybsjgVar5.f25134zynmafqrjb : 0) + 1;
    }

    private void vdvldrhtss(eablkybsjg eablkybsjgVar) {
        eablkybsjg eablkybsjgVar2 = eablkybsjgVar.f25132yggfygwlhe;
        eablkybsjg eablkybsjgVar3 = eablkybsjgVar.f25129jyumaefscl;
        eablkybsjg eablkybsjgVar4 = eablkybsjgVar2.f25132yggfygwlhe;
        eablkybsjg eablkybsjgVar5 = eablkybsjgVar2.f25129jyumaefscl;
        eablkybsjgVar.f25132yggfygwlhe = eablkybsjgVar5;
        if (eablkybsjgVar5 != null) {
            eablkybsjgVar5.f25133zdlpuopuiu = eablkybsjgVar;
        }
        ojitshcjhn(eablkybsjgVar, eablkybsjgVar2);
        eablkybsjgVar2.f25129jyumaefscl = eablkybsjgVar;
        eablkybsjgVar.f25133zdlpuopuiu = eablkybsjgVar2;
        int iMax = Math.max(eablkybsjgVar3 != null ? eablkybsjgVar3.f25134zynmafqrjb : 0, eablkybsjgVar5 != null ? eablkybsjgVar5.f25134zynmafqrjb : 0) + 1;
        eablkybsjgVar.f25134zynmafqrjb = iMax;
        eablkybsjgVar2.f25134zynmafqrjb = Math.max(iMax, eablkybsjgVar4 != null ? eablkybsjgVar4.f25134zynmafqrjb : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    eablkybsjg agtfadlqog(Object obj) {
        eablkybsjg eablkybsjgVarDxjokdxxww = dxjokdxxww(obj);
        if (eablkybsjgVarDxjokdxxww != null) {
            draadjrbmk(eablkybsjgVarDxjokdxxww, true);
        }
        return eablkybsjgVarDxjokdxxww;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f25121jyumaefscl = null;
        this.f25120iwizpuwonk = 0;
        this.f25118cqumvgiudr++;
        eablkybsjg eablkybsjgVar = this.f25119esjtqupxsv;
        eablkybsjgVar.f25126cqumvgiudr = eablkybsjgVar;
        eablkybsjgVar.f25128iwizpuwonk = eablkybsjgVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return dxjokdxxww(obj) != null;
    }

    void draadjrbmk(eablkybsjg eablkybsjgVar, boolean z13) {
        int i13;
        if (z13) {
            eablkybsjg eablkybsjgVar2 = eablkybsjgVar.f25126cqumvgiudr;
            eablkybsjgVar2.f25128iwizpuwonk = eablkybsjgVar.f25128iwizpuwonk;
            eablkybsjgVar.f25128iwizpuwonk.f25126cqumvgiudr = eablkybsjgVar2;
        }
        eablkybsjg eablkybsjgVar3 = eablkybsjgVar.f25132yggfygwlhe;
        eablkybsjg eablkybsjgVar4 = eablkybsjgVar.f25129jyumaefscl;
        eablkybsjg eablkybsjgVar5 = eablkybsjgVar.f25133zdlpuopuiu;
        int i14 = 0;
        if (eablkybsjgVar3 == null || eablkybsjgVar4 == null) {
            if (eablkybsjgVar3 != null) {
                ojitshcjhn(eablkybsjgVar, eablkybsjgVar3);
                eablkybsjgVar.f25132yggfygwlhe = null;
            } else if (eablkybsjgVar4 != null) {
                ojitshcjhn(eablkybsjgVar, eablkybsjgVar4);
                eablkybsjgVar.f25129jyumaefscl = null;
            } else {
                ojitshcjhn(eablkybsjgVar, null);
            }
            btonecajqb(eablkybsjgVar5, false);
            this.f25120iwizpuwonk--;
            this.f25118cqumvgiudr++;
            return;
        }
        eablkybsjg eablkybsjgVarZoijcleaow = eablkybsjgVar3.f25134zynmafqrjb > eablkybsjgVar4.f25134zynmafqrjb ? eablkybsjgVar3.zoijcleaow() : eablkybsjgVar4.iobyxmoadg();
        draadjrbmk(eablkybsjgVarZoijcleaow, false);
        eablkybsjg eablkybsjgVar6 = eablkybsjgVar.f25132yggfygwlhe;
        if (eablkybsjgVar6 != null) {
            i13 = eablkybsjgVar6.f25134zynmafqrjb;
            eablkybsjgVarZoijcleaow.f25132yggfygwlhe = eablkybsjgVar6;
            eablkybsjgVar6.f25133zdlpuopuiu = eablkybsjgVarZoijcleaow;
            eablkybsjgVar.f25132yggfygwlhe = null;
        } else {
            i13 = 0;
        }
        eablkybsjg eablkybsjgVar7 = eablkybsjgVar.f25129jyumaefscl;
        if (eablkybsjgVar7 != null) {
            i14 = eablkybsjgVar7.f25134zynmafqrjb;
            eablkybsjgVarZoijcleaow.f25129jyumaefscl = eablkybsjgVar7;
            eablkybsjgVar7.f25133zdlpuopuiu = eablkybsjgVarZoijcleaow;
            eablkybsjgVar.f25129jyumaefscl = null;
        }
        eablkybsjgVarZoijcleaow.f25134zynmafqrjb = Math.max(i13, i14) + 1;
        ojitshcjhn(eablkybsjgVar, eablkybsjgVarZoijcleaow);
    }

    eablkybsjg dxjokdxxww(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return wkgbmnqykc(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        zoijcleaow zoijcleaowVar = this.f25122lereixgezr;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zoijcleaow zoijcleaowVar2 = new zoijcleaow();
        this.f25122lereixgezr = zoijcleaowVar2;
        return zoijcleaowVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        eablkybsjg eablkybsjgVarDxjokdxxww = dxjokdxxww(obj);
        if (eablkybsjgVarDxjokdxxww != null) {
            return eablkybsjgVarDxjokdxxww.f25131pmvmpeiblj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f25123pmvmpeiblj;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
        this.f25123pmvmpeiblj = ppxfxbqfkfVar2;
        return ppxfxbqfkfVar2;
    }

    eablkybsjg lqeggnwhkg(Map.Entry entry) {
        eablkybsjg eablkybsjgVarDxjokdxxww = dxjokdxxww(entry.getKey());
        if (eablkybsjgVarDxjokdxxww == null || !iobyxmoadg(eablkybsjgVarDxjokdxxww.f25131pmvmpeiblj, entry.getValue())) {
            return null;
        }
        return eablkybsjgVarDxjokdxxww;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f25124yggfygwlhe) {
            throw new NullPointerException("value == null");
        }
        eablkybsjg eablkybsjgVarWkgbmnqykc = wkgbmnqykc(obj, true);
        Object obj3 = eablkybsjgVarWkgbmnqykc.f25131pmvmpeiblj;
        eablkybsjgVarWkgbmnqykc.f25131pmvmpeiblj = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        eablkybsjg eablkybsjgVarAgtfadlqog = agtfadlqog(obj);
        if (eablkybsjgVarAgtfadlqog != null) {
            return eablkybsjgVarAgtfadlqog.f25131pmvmpeiblj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f25120iwizpuwonk;
    }

    eablkybsjg wkgbmnqykc(Object obj, boolean z13) {
        int iCompareTo;
        eablkybsjg eablkybsjgVar;
        Comparator comparator = this.f25125zdlpuopuiu;
        eablkybsjg eablkybsjgVar2 = this.f25121jyumaefscl;
        if (eablkybsjgVar2 != null) {
            Comparable comparable = comparator == f25117zynmafqrjb ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eablkybsjgVar2.f25127esjtqupxsv) : comparator.compare(obj, eablkybsjgVar2.f25127esjtqupxsv);
                if (iCompareTo == 0) {
                    return eablkybsjgVar2;
                }
                eablkybsjg eablkybsjgVar3 = iCompareTo < 0 ? eablkybsjgVar2.f25132yggfygwlhe : eablkybsjgVar2.f25129jyumaefscl;
                if (eablkybsjgVar3 == null) {
                    break;
                }
                eablkybsjgVar2 = eablkybsjgVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z13) {
            return null;
        }
        eablkybsjg eablkybsjgVar4 = this.f25119esjtqupxsv;
        if (eablkybsjgVar2 != null) {
            eablkybsjgVar = new eablkybsjg(this.f25124yggfygwlhe, eablkybsjgVar2, obj, eablkybsjgVar4, eablkybsjgVar4.f25126cqumvgiudr);
            if (iCompareTo < 0) {
                eablkybsjgVar2.f25132yggfygwlhe = eablkybsjgVar;
            } else {
                eablkybsjgVar2.f25129jyumaefscl = eablkybsjgVar;
            }
            btonecajqb(eablkybsjgVar2, true);
        } else {
            if (comparator == f25117zynmafqrjb && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eablkybsjgVar = new eablkybsjg(this.f25124yggfygwlhe, eablkybsjgVar2, obj, eablkybsjgVar4, eablkybsjgVar4.f25126cqumvgiudr);
            this.f25121jyumaefscl = eablkybsjgVar;
        }
        this.f25120iwizpuwonk++;
        this.f25118cqumvgiudr++;
        return eablkybsjgVar;
    }

    public lqeggnwhkg(boolean z13) {
        this(f25117zynmafqrjb, z13);
    }

    public lqeggnwhkg(Comparator comparator, boolean z13) {
        this.f25120iwizpuwonk = 0;
        this.f25118cqumvgiudr = 0;
        this.f25125zdlpuopuiu = comparator == null ? f25117zynmafqrjb : comparator;
        this.f25124yggfygwlhe = z13;
        this.f25119esjtqupxsv = new eablkybsjg(z13);
    }

    static final class eablkybsjg implements Map.Entry {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        eablkybsjg f25126cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final Object f25127esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        eablkybsjg f25128iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        eablkybsjg f25129jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final boolean f25130lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        Object f25131pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        eablkybsjg f25132yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        eablkybsjg f25133zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f25134zynmafqrjb;

        eablkybsjg(boolean z13) {
            this.f25127esjtqupxsv = null;
            this.f25130lereixgezr = z13;
            this.f25126cqumvgiudr = this;
            this.f25128iwizpuwonk = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f25127esjtqupxsv;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f25131pmvmpeiblj;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f25127esjtqupxsv;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f25131pmvmpeiblj;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f25127esjtqupxsv;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f25131pmvmpeiblj;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        public eablkybsjg iobyxmoadg() {
            eablkybsjg eablkybsjgVar = this;
            for (eablkybsjg eablkybsjgVar2 = this.f25132yggfygwlhe; eablkybsjgVar2 != null; eablkybsjgVar2 = eablkybsjgVar2.f25132yggfygwlhe) {
                eablkybsjgVar = eablkybsjgVar2;
            }
            return eablkybsjgVar;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f25130lereixgezr) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f25131pmvmpeiblj;
            this.f25131pmvmpeiblj = obj;
            return obj2;
        }

        public String toString() {
            return this.f25127esjtqupxsv + "=" + this.f25131pmvmpeiblj;
        }

        public eablkybsjg zoijcleaow() {
            eablkybsjg eablkybsjgVar = this;
            for (eablkybsjg eablkybsjgVar2 = this.f25129jyumaefscl; eablkybsjgVar2 != null; eablkybsjgVar2 = eablkybsjgVar2.f25129jyumaefscl) {
                eablkybsjgVar = eablkybsjgVar2;
            }
            return eablkybsjgVar;
        }

        eablkybsjg(boolean z13, eablkybsjg eablkybsjgVar, Object obj, eablkybsjg eablkybsjgVar2, eablkybsjg eablkybsjgVar3) {
            this.f25133zdlpuopuiu = eablkybsjgVar;
            this.f25127esjtqupxsv = obj;
            this.f25130lereixgezr = z13;
            this.f25134zynmafqrjb = 1;
            this.f25128iwizpuwonk = eablkybsjgVar2;
            this.f25126cqumvgiudr = eablkybsjgVar3;
            eablkybsjgVar3.f25128iwizpuwonk = this;
            eablkybsjgVar2.f25126cqumvgiudr = this;
        }
    }
}
