package ig;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements Map, Serializable, ug.eablkybsjg {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final iobyxmoadg f42497lmojexxdyd = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final wkgbmnqykc f42498wwaezpbzkn;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private lqeggnwhkg f42499cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f42500cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f42501esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f42502iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ig.gxszxtbevo f42503istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int[] f42504iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int[] f42505jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f42506lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f42507pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private ig.eablkybsjg f42508yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object[] f42509yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Object[] f42510zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f42511zynmafqrjb;

    public static final class eablkybsjg extends C1002wkgbmnqykc implements Iterator, ug.iobyxmoadg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(wkgbmnqykc map) {
            super(map);
            zdlpuopuiu.btonecajqb(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            iobyxmoadg();
            if (zoijcleaow() >= wkgbmnqykc().f42501esjtqupxsv) {
                throw new NoSuchElementException();
            }
            int iZoijcleaow = zoijcleaow();
            gxszxtbevo(iZoijcleaow + 1);
            dxjokdxxww(iZoijcleaow);
            Object obj = wkgbmnqykc().f42510zdlpuopuiu[ppxfxbqfkf()];
            eablkybsjg();
            return obj;
        }
    }

    public static final class gxszxtbevo extends C1002wkgbmnqykc implements Iterator, ug.iobyxmoadg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(wkgbmnqykc map) {
            super(map);
            zdlpuopuiu.btonecajqb(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            iobyxmoadg();
            if (zoijcleaow() >= wkgbmnqykc().f42501esjtqupxsv) {
                throw new NoSuchElementException();
            }
            int iZoijcleaow = zoijcleaow();
            gxszxtbevo(iZoijcleaow + 1);
            dxjokdxxww(iZoijcleaow);
            Object[] objArr = wkgbmnqykc().f42509yggfygwlhe;
            zdlpuopuiu.lqeggnwhkg(objArr);
            Object obj = objArr[ppxfxbqfkf()];
            eablkybsjg();
            return obj;
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int ppxfxbqfkf(int i13) {
            return Integer.highestOneBit(zg.gtknphoqwx.gxszxtbevo(i13, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int wkgbmnqykc(int i13) {
            return Integer.numberOfLeadingZeros(i13) + 1;
        }

        public final wkgbmnqykc eablkybsjg() {
            return wkgbmnqykc.f42498wwaezpbzkn;
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements Map.Entry, ug.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int f42512jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f42513yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final wkgbmnqykc f42514zdlpuopuiu;

        public ppxfxbqfkf(wkgbmnqykc map, int i13) {
            zdlpuopuiu.btonecajqb(map, "map");
            this.f42514zdlpuopuiu = map;
            this.f42513yggfygwlhe = i13;
            this.f42512jyumaefscl = map.f42507pmvmpeiblj;
        }

        private final void iobyxmoadg() {
            if (this.f42514zdlpuopuiu.f42507pmvmpeiblj != this.f42512jyumaefscl) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (zdlpuopuiu.eablkybsjg(entry.getKey(), getKey()) && zdlpuopuiu.eablkybsjg(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            iobyxmoadg();
            return this.f42514zdlpuopuiu.f42510zdlpuopuiu[this.f42513yggfygwlhe];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            iobyxmoadg();
            Object[] objArr = this.f42514zdlpuopuiu.f42509yggfygwlhe;
            zdlpuopuiu.lqeggnwhkg(objArr);
            return objArr[this.f42513yggfygwlhe];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            iobyxmoadg();
            this.f42514zdlpuopuiu.jyumaefscl();
            Object[] objArrKcexrzcfyt = this.f42514zdlpuopuiu.kcexrzcfyt();
            int i13 = this.f42513yggfygwlhe;
            Object obj2 = objArrKcexrzcfyt[i13];
            objArrKcexrzcfyt[i13] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getKey());
            sb3.append('=');
            sb3.append(getValue());
            return sb3.toString();
        }
    }

    /* JADX INFO: renamed from: ig.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static class C1002wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f42515iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f42516jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f42517yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final wkgbmnqykc f42518zdlpuopuiu;

        public C1002wkgbmnqykc(wkgbmnqykc map) {
            zdlpuopuiu.btonecajqb(map, "map");
            this.f42518zdlpuopuiu = map;
            this.f42516jyumaefscl = -1;
            this.f42515iwizpuwonk = map.f42507pmvmpeiblj;
            eablkybsjg();
        }

        public final void dxjokdxxww(int i13) {
            this.f42516jyumaefscl = i13;
        }

        public final void eablkybsjg() {
            while (this.f42517yggfygwlhe < this.f42518zdlpuopuiu.f42501esjtqupxsv) {
                int[] iArr = this.f42518zdlpuopuiu.f42505jyumaefscl;
                int i13 = this.f42517yggfygwlhe;
                if (iArr[i13] >= 0) {
                    return;
                } else {
                    this.f42517yggfygwlhe = i13 + 1;
                }
            }
        }

        public final void gxszxtbevo(int i13) {
            this.f42517yggfygwlhe = i13;
        }

        public final boolean hasNext() {
            return this.f42517yggfygwlhe < this.f42518zdlpuopuiu.f42501esjtqupxsv;
        }

        public final void iobyxmoadg() {
            if (this.f42518zdlpuopuiu.f42507pmvmpeiblj != this.f42515iwizpuwonk) {
                throw new ConcurrentModificationException();
            }
        }

        public final int ppxfxbqfkf() {
            return this.f42516jyumaefscl;
        }

        public final void remove() {
            iobyxmoadg();
            if (this.f42516jyumaefscl == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f42518zdlpuopuiu.jyumaefscl();
            this.f42518zdlpuopuiu.vipkmwdibw(this.f42516jyumaefscl);
            this.f42516jyumaefscl = -1;
            this.f42515iwizpuwonk = this.f42518zdlpuopuiu.f42507pmvmpeiblj;
        }

        public final wkgbmnqykc wkgbmnqykc() {
            return this.f42518zdlpuopuiu;
        }

        public final int zoijcleaow() {
            return this.f42517yggfygwlhe;
        }
    }

    public static final class zoijcleaow extends C1002wkgbmnqykc implements Iterator, ug.iobyxmoadg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(wkgbmnqykc map) {
            super(map);
            zdlpuopuiu.btonecajqb(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf next() {
            iobyxmoadg();
            if (zoijcleaow() >= wkgbmnqykc().f42501esjtqupxsv) {
                throw new NoSuchElementException();
            }
            int iZoijcleaow = zoijcleaow();
            gxszxtbevo(iZoijcleaow + 1);
            dxjokdxxww(iZoijcleaow);
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(wkgbmnqykc(), ppxfxbqfkf());
            eablkybsjg();
            return ppxfxbqfkfVar;
        }

        public final int draadjrbmk() {
            if (zoijcleaow() >= wkgbmnqykc().f42501esjtqupxsv) {
                throw new NoSuchElementException();
            }
            int iZoijcleaow = zoijcleaow();
            gxszxtbevo(iZoijcleaow + 1);
            dxjokdxxww(iZoijcleaow);
            Object obj = wkgbmnqykc().f42510zdlpuopuiu[ppxfxbqfkf()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = wkgbmnqykc().f42509yggfygwlhe;
            zdlpuopuiu.lqeggnwhkg(objArr);
            Object obj2 = objArr[ppxfxbqfkf()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            eablkybsjg();
            return iHashCode2;
        }

        public final void gtknphoqwx(StringBuilder sb3) {
            zdlpuopuiu.btonecajqb(sb3, "sb");
            if (zoijcleaow() >= wkgbmnqykc().f42501esjtqupxsv) {
                throw new NoSuchElementException();
            }
            int iZoijcleaow = zoijcleaow();
            gxszxtbevo(iZoijcleaow + 1);
            dxjokdxxww(iZoijcleaow);
            Object obj = wkgbmnqykc().f42510zdlpuopuiu[ppxfxbqfkf()];
            if (obj == wkgbmnqykc()) {
                sb3.append("(this Map)");
            } else {
                sb3.append(obj);
            }
            sb3.append('=');
            Object[] objArr = wkgbmnqykc().f42509yggfygwlhe;
            zdlpuopuiu.lqeggnwhkg(objArr);
            Object obj2 = objArr[ppxfxbqfkf()];
            if (obj2 == wkgbmnqykc()) {
                sb3.append("(this Map)");
            } else {
                sb3.append(obj2);
            }
            eablkybsjg();
        }
    }

    static {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(0);
        wkgbmnqykcVar.f42502iozdgvuglv = true;
        f42498wwaezpbzkn = wkgbmnqykcVar;
    }

    private wkgbmnqykc(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i13, int i14) {
        this.f42510zdlpuopuiu = objArr;
        this.f42509yggfygwlhe = objArr2;
        this.f42505jyumaefscl = iArr;
        this.f42504iwizpuwonk = iArr2;
        this.f42500cqumvgiudr = i13;
        this.f42501esjtqupxsv = i14;
        this.f42506lereixgezr = f42497lmojexxdyd.wkgbmnqykc(hkdspvbjdz());
    }

    private final void cdpycssgdh(int i13) {
        if (jztzpxfvev(i13)) {
            cqumvgiudr(true);
        } else {
            istkbnxepw(this.f42501esjtqupxsv + i13);
        }
    }

    private final void cqumvgiudr(boolean z13) {
        int i13;
        Object[] objArr = this.f42509yggfygwlhe;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i13 = this.f42501esjtqupxsv;
            if (i14 >= i13) {
                break;
            }
            int[] iArr = this.f42505jyumaefscl;
            int i16 = iArr[i14];
            if (i16 >= 0) {
                Object[] objArr2 = this.f42510zdlpuopuiu;
                objArr2[i15] = objArr2[i14];
                if (objArr != null) {
                    objArr[i15] = objArr[i14];
                }
                if (z13) {
                    iArr[i15] = i16;
                    this.f42504iwizpuwonk[i16] = i15 + 1;
                }
                i15++;
            }
            i14++;
        }
        ig.ppxfxbqfkf.lqeggnwhkg(this.f42510zdlpuopuiu, i15, i13);
        if (objArr != null) {
            ig.ppxfxbqfkf.lqeggnwhkg(objArr, i15, this.f42501esjtqupxsv);
        }
        this.f42501esjtqupxsv = i15;
    }

    private final void crxdokpmqz(int i13) {
        sopmlzcsov();
        int i14 = 0;
        if (this.f42501esjtqupxsv > size()) {
            cqumvgiudr(false);
        }
        this.f42504iwizpuwonk = new int[i13];
        this.f42506lereixgezr = f42497lmojexxdyd.wkgbmnqykc(i13);
        while (i14 < this.f42501esjtqupxsv) {
            int i15 = i14 + 1;
            if (!ulzqkzuiru(i14)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i14 = i15;
        }
    }

    private final int hkdspvbjdz() {
        return this.f42504iwizpuwonk.length;
    }

    private final void istkbnxepw(int i13) {
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > hcddaimhww()) {
            int iEablkybsjg = hg.wkgbmnqykc.f40274zdlpuopuiu.eablkybsjg(hcddaimhww(), i13);
            this.f42510zdlpuopuiu = ig.ppxfxbqfkf.eablkybsjg(this.f42510zdlpuopuiu, iEablkybsjg);
            Object[] objArr = this.f42509yggfygwlhe;
            this.f42509yggfygwlhe = objArr != null ? ig.ppxfxbqfkf.eablkybsjg(objArr, iEablkybsjg) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f42505jyumaefscl, iEablkybsjg);
            zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f42505jyumaefscl = iArrCopyOf;
            int iPpxfxbqfkf = f42497lmojexxdyd.ppxfxbqfkf(iEablkybsjg);
            if (iPpxfxbqfkf > hkdspvbjdz()) {
                crxdokpmqz(iPpxfxbqfkf);
            }
        }
    }

    private final void jhduphickx(int i13) {
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(this.f42500cqumvgiudr * 2, hkdspvbjdz() / 2);
        int i14 = 0;
        int i15 = i13;
        do {
            i13 = i13 == 0 ? hkdspvbjdz() - 1 : i13 - 1;
            i14++;
            if (i14 > this.f42500cqumvgiudr) {
                this.f42504iwizpuwonk[i15] = 0;
                return;
            }
            int[] iArr = this.f42504iwizpuwonk;
            int i16 = iArr[i13];
            if (i16 == 0) {
                iArr[i15] = 0;
                return;
            }
            if (i16 < 0) {
                iArr[i15] = -1;
            } else {
                int i17 = i16 - 1;
                if (((stevsuqkhv(this.f42510zdlpuopuiu[i17]) - i13) & (hkdspvbjdz() - 1)) >= i14) {
                    this.f42504iwizpuwonk[i15] = i16;
                    this.f42505jyumaefscl[i17] = i15;
                }
                iBtonecajqb--;
            }
            i15 = i13;
            i14 = 0;
            iBtonecajqb--;
        } while (iBtonecajqb >= 0);
        this.f42504iwizpuwonk[i15] = -1;
    }

    private final boolean jztzpxfvev(int i13) {
        int iHcddaimhww = hcddaimhww();
        int i14 = this.f42501esjtqupxsv;
        int i15 = iHcddaimhww - i14;
        int size = i14 - size();
        return i15 < i13 && i15 + size >= i13 && size >= hcddaimhww() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] kcexrzcfyt() {
        Object[] objArr = this.f42509yggfygwlhe;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrWkgbmnqykc = ig.ppxfxbqfkf.wkgbmnqykc(hcddaimhww());
        this.f42509yggfygwlhe = objArrWkgbmnqykc;
        return objArrWkgbmnqykc;
    }

    private final boolean mbcevpiqjq(Collection collection) {
        boolean z13 = false;
        if (collection.isEmpty()) {
            return false;
        }
        cdpycssgdh(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (ntlheqmsrt((Map.Entry) it.next())) {
                z13 = true;
            }
        }
        return z13;
    }

    private final boolean ntlheqmsrt(Map.Entry entry) {
        int iVdvldrhtss = vdvldrhtss(entry.getKey());
        Object[] objArrKcexrzcfyt = kcexrzcfyt();
        if (iVdvldrhtss >= 0) {
            objArrKcexrzcfyt[iVdvldrhtss] = entry.getValue();
            return true;
        }
        int i13 = (-iVdvldrhtss) - 1;
        if (zdlpuopuiu.eablkybsjg(entry.getValue(), objArrKcexrzcfyt[i13])) {
            return false;
        }
        objArrKcexrzcfyt[i13] = entry.getValue();
        return true;
    }

    private final void sopmlzcsov() {
        this.f42507pmvmpeiblj++;
    }

    private final int stevsuqkhv(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f42506lereixgezr;
    }

    private final boolean ulzqkzuiru(int i13) {
        int iStevsuqkhv = stevsuqkhv(this.f42510zdlpuopuiu[i13]);
        int i14 = this.f42500cqumvgiudr;
        while (true) {
            int[] iArr = this.f42504iwizpuwonk;
            if (iArr[iStevsuqkhv] == 0) {
                iArr[iStevsuqkhv] = i13 + 1;
                this.f42505jyumaefscl[i13] = iStevsuqkhv;
                return true;
            }
            i14--;
            if (i14 < 0) {
                return false;
            }
            iStevsuqkhv = iStevsuqkhv == 0 ? hkdspvbjdz() - 1 : iStevsuqkhv - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vipkmwdibw(int i13) {
        ig.ppxfxbqfkf.gxszxtbevo(this.f42510zdlpuopuiu, i13);
        Object[] objArr = this.f42509yggfygwlhe;
        if (objArr != null) {
            ig.ppxfxbqfkf.gxszxtbevo(objArr, i13);
        }
        jhduphickx(this.f42505jyumaefscl[i13]);
        this.f42505jyumaefscl[i13] = -1;
        this.f42511zynmafqrjb = size() - 1;
        sopmlzcsov();
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42502iozdgvuglv) {
            return new dxjokdxxww(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int wwaezpbzkn(Object obj) {
        int iStevsuqkhv = stevsuqkhv(obj);
        int i13 = this.f42500cqumvgiudr;
        while (true) {
            int i14 = this.f42504iwizpuwonk[iStevsuqkhv];
            if (i14 == 0) {
                return -1;
            }
            if (i14 > 0) {
                int i15 = i14 - 1;
                if (zdlpuopuiu.eablkybsjg(this.f42510zdlpuopuiu[i15], obj)) {
                    return i15;
                }
            }
            i13--;
            if (i13 < 0) {
                return -1;
            }
            iStevsuqkhv = iStevsuqkhv == 0 ? hkdspvbjdz() - 1 : iStevsuqkhv - 1;
        }
    }

    private final int ylkuphrtab(Object obj) {
        int i13 = this.f42501esjtqupxsv;
        while (true) {
            i13--;
            if (i13 < 0) {
                return -1;
            }
            if (this.f42505jyumaefscl[i13] >= 0) {
                Object[] objArr = this.f42509yggfygwlhe;
                zdlpuopuiu.lqeggnwhkg(objArr);
                if (zdlpuopuiu.eablkybsjg(objArr[i13], obj)) {
                    return i13;
                }
            }
        }
    }

    private final boolean zynmafqrjb(Map map) {
        return size() == map.size() && lereixgezr(map.entrySet());
    }

    @Override // java.util.Map
    public void clear() {
        jyumaefscl();
        int i13 = this.f42501esjtqupxsv - 1;
        if (i13 >= 0) {
            int i14 = 0;
            while (true) {
                int[] iArr = this.f42505jyumaefscl;
                int i15 = iArr[i14];
                if (i15 >= 0) {
                    this.f42504iwizpuwonk[i15] = 0;
                    iArr[i14] = -1;
                }
                if (i14 == i13) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        ig.ppxfxbqfkf.lqeggnwhkg(this.f42510zdlpuopuiu, 0, this.f42501esjtqupxsv);
        Object[] objArr = this.f42509yggfygwlhe;
        if (objArr != null) {
            ig.ppxfxbqfkf.lqeggnwhkg(objArr, 0, this.f42501esjtqupxsv);
        }
        this.f42511zynmafqrjb = 0;
        this.f42501esjtqupxsv = 0;
        sopmlzcsov();
    }

    public Set cllcsxoeiz() {
        ig.gxszxtbevo gxszxtbevoVar = this.f42503istkbnxepw;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar;
        }
        ig.gxszxtbevo gxszxtbevoVar2 = new ig.gxszxtbevo(this);
        this.f42503istkbnxepw = gxszxtbevoVar2;
        return gxszxtbevoVar2;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return wwaezpbzkn(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ylkuphrtab(obj) >= 0;
    }

    public int dsvhmnatus() {
        return this.f42511zynmafqrjb;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return jpowsppfya();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && zynmafqrjb((Map) obj));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iWwaezpbzkn = wwaezpbzkn(obj);
        if (iWwaezpbzkn < 0) {
            return null;
        }
        Object[] objArr = this.f42509yggfygwlhe;
        zdlpuopuiu.lqeggnwhkg(objArr);
        return objArr[iWwaezpbzkn];
    }

    @Override // java.util.Map
    public int hashCode() {
        zoijcleaow zoijcleaowVarLmojexxdyd = lmojexxdyd();
        int iDraadjrbmk = 0;
        while (zoijcleaowVarLmojexxdyd.hasNext()) {
            iDraadjrbmk += zoijcleaowVarLmojexxdyd.draadjrbmk();
        }
        return iDraadjrbmk;
    }

    public final int hcddaimhww() {
        return this.f42510zdlpuopuiu.length;
    }

    public final boolean ikoacuggdj(Object obj) {
        jyumaefscl();
        int iWwaezpbzkn = wwaezpbzkn(obj);
        if (iWwaezpbzkn < 0) {
            return false;
        }
        vipkmwdibw(iWwaezpbzkn);
        return true;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public Set jpowsppfya() {
        ig.eablkybsjg eablkybsjgVar = this.f42508yadqdtsiqt;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        ig.eablkybsjg eablkybsjgVar2 = new ig.eablkybsjg(this);
        this.f42508yadqdtsiqt = eablkybsjgVar2;
        return eablkybsjgVar2;
    }

    public final void jyumaefscl() {
        if (this.f42502iozdgvuglv) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean kegysxyocb() {
        return this.f42502iozdgvuglv;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return cllcsxoeiz();
    }

    public final boolean lereixgezr(Collection m13) {
        zdlpuopuiu.btonecajqb(m13, "m");
        for (Object obj : m13) {
            if (obj != null) {
                try {
                    if (!pmvmpeiblj((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final zoijcleaow lmojexxdyd() {
        return new zoijcleaow(this);
    }

    public final boolean okpsazkaxt(Object obj) {
        jyumaefscl();
        int iYlkuphrtab = ylkuphrtab(obj);
        if (iYlkuphrtab < 0) {
            return false;
        }
        vipkmwdibw(iYlkuphrtab);
        return true;
    }

    public final boolean pmvmpeiblj(Map.Entry entry) {
        zdlpuopuiu.btonecajqb(entry, "entry");
        int iWwaezpbzkn = wwaezpbzkn(entry.getKey());
        if (iWwaezpbzkn < 0) {
            return false;
        }
        Object[] objArr = this.f42509yggfygwlhe;
        zdlpuopuiu.lqeggnwhkg(objArr);
        return zdlpuopuiu.eablkybsjg(objArr[iWwaezpbzkn], entry.getValue());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        jyumaefscl();
        int iVdvldrhtss = vdvldrhtss(obj);
        Object[] objArrKcexrzcfyt = kcexrzcfyt();
        if (iVdvldrhtss >= 0) {
            objArrKcexrzcfyt[iVdvldrhtss] = obj2;
            return null;
        }
        int i13 = (-iVdvldrhtss) - 1;
        Object obj3 = objArrKcexrzcfyt[i13];
        objArrKcexrzcfyt[i13] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        zdlpuopuiu.btonecajqb(from, "from");
        jyumaefscl();
        mbcevpiqjq(from.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        jyumaefscl();
        int iWwaezpbzkn = wwaezpbzkn(obj);
        if (iWwaezpbzkn < 0) {
            return null;
        }
        Object[] objArr = this.f42509yggfygwlhe;
        zdlpuopuiu.lqeggnwhkg(objArr);
        Object obj2 = objArr[iWwaezpbzkn];
        vipkmwdibw(iWwaezpbzkn);
        return obj2;
    }

    public final boolean ribwqtqdhb(Map.Entry entry) {
        zdlpuopuiu.btonecajqb(entry, "entry");
        jyumaefscl();
        int iWwaezpbzkn = wwaezpbzkn(entry.getKey());
        if (iWwaezpbzkn < 0) {
            return false;
        }
        Object[] objArr = this.f42509yggfygwlhe;
        zdlpuopuiu.lqeggnwhkg(objArr);
        if (!zdlpuopuiu.eablkybsjg(objArr[iWwaezpbzkn], entry.getValue())) {
            return false;
        }
        vipkmwdibw(iWwaezpbzkn);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return dsvhmnatus();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder((size() * 3) + 2);
        sb3.append("{");
        zoijcleaow zoijcleaowVarLmojexxdyd = lmojexxdyd();
        int i13 = 0;
        while (zoijcleaowVarLmojexxdyd.hasNext()) {
            if (i13 > 0) {
                sb3.append(", ");
            }
            zoijcleaowVarLmojexxdyd.gtknphoqwx(sb3);
            i13++;
        }
        sb3.append("}");
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final eablkybsjg tzroggbefp() {
        return new eablkybsjg(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return wypolnanlu();
    }

    public final int vdvldrhtss(Object obj) {
        jyumaefscl();
        while (true) {
            int iStevsuqkhv = stevsuqkhv(obj);
            int iBtonecajqb = zg.gtknphoqwx.btonecajqb(this.f42500cqumvgiudr * 2, hkdspvbjdz() / 2);
            int i13 = 0;
            while (true) {
                int i14 = this.f42504iwizpuwonk[iStevsuqkhv];
                if (i14 <= 0) {
                    if (this.f42501esjtqupxsv >= hcddaimhww()) {
                        cdpycssgdh(1);
                        break;
                    }
                    int i15 = this.f42501esjtqupxsv;
                    int i16 = i15 + 1;
                    this.f42501esjtqupxsv = i16;
                    this.f42510zdlpuopuiu[i15] = obj;
                    this.f42505jyumaefscl[i15] = iStevsuqkhv;
                    this.f42504iwizpuwonk[iStevsuqkhv] = i16;
                    this.f42511zynmafqrjb = size() + 1;
                    sopmlzcsov();
                    if (i13 > this.f42500cqumvgiudr) {
                        this.f42500cqumvgiudr = i13;
                    }
                    return i15;
                }
                if (zdlpuopuiu.eablkybsjg(this.f42510zdlpuopuiu[i14 - 1], obj)) {
                    return -i14;
                }
                i13++;
                if (i13 > iBtonecajqb) {
                    crxdokpmqz(hkdspvbjdz() * 2);
                    break;
                }
                iStevsuqkhv = iStevsuqkhv == 0 ? hkdspvbjdz() - 1 : iStevsuqkhv - 1;
            }
        }
    }

    public Collection wypolnanlu() {
        lqeggnwhkg lqeggnwhkgVar = this.f42499cdpycssgdh;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar;
        }
        lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg(this);
        this.f42499cdpycssgdh = lqeggnwhkgVar2;
        return lqeggnwhkgVar2;
    }

    public final gxszxtbevo xrmfcynszj() {
        return new gxszxtbevo(this);
    }

    public final Map zdlpuopuiu() {
        jyumaefscl();
        this.f42502iozdgvuglv = true;
        if (size() > 0) {
            return this;
        }
        wkgbmnqykc wkgbmnqykcVar = f42498wwaezpbzkn;
        zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return wkgbmnqykcVar;
    }

    public wkgbmnqykc() {
        this(8);
    }

    public wkgbmnqykc(int i13) {
        this(ig.ppxfxbqfkf.wkgbmnqykc(i13), null, new int[i13], new int[f42497lmojexxdyd.ppxfxbqfkf(i13)], 2, 0);
    }
}
