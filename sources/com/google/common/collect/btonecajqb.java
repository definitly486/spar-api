package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class btonecajqb extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final Object f23597istkbnxepw = new Object();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private transient int f23598cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private transient int f23599esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    transient Object[] f23600iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    transient Object[] f23601jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private transient Set f23602lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private transient Set f23603pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    transient int[] f23604yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private transient Object f23605zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private transient Collection f23606zynmafqrjb;

    class gxszxtbevo extends AbstractSet {
        gxszxtbevo() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            btonecajqb.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return btonecajqb.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return btonecajqb.this.ulzqkzuiru();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapHcddaimhww = btonecajqb.this.hcddaimhww();
            if (mapHcddaimhww != null) {
                return mapHcddaimhww.keySet().remove(obj);
            }
            return btonecajqb.this.jlmebxxoox(obj) != btonecajqb.f23597istkbnxepw;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return btonecajqb.this.size();
        }
    }

    class iobyxmoadg extends eablkybsjg {
        iobyxmoadg() {
            super(btonecajqb.this, null);
        }

        @Override // com.google.common.collect.btonecajqb.eablkybsjg
        Object zoijcleaow(int i13) {
            return btonecajqb.this.ntlheqmsrt(i13);
        }
    }

    final class lqeggnwhkg extends com.google.common.collect.eablkybsjg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f23614yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f23615zdlpuopuiu;

        lqeggnwhkg(int i13) {
            this.f23615zdlpuopuiu = btonecajqb.this.ntlheqmsrt(i13);
            this.f23614yggfygwlhe = i13;
        }

        private void iobyxmoadg() {
            int i13 = this.f23614yggfygwlhe;
            if (i13 == -1 || i13 >= btonecajqb.this.size() || !xa.dxjokdxxww.iobyxmoadg(this.f23615zdlpuopuiu, btonecajqb.this.ntlheqmsrt(this.f23614yggfygwlhe))) {
                this.f23614yggfygwlhe = btonecajqb.this.kegysxyocb(this.f23615zdlpuopuiu);
            }
        }

        @Override // com.google.common.collect.eablkybsjg, java.util.Map.Entry
        public Object getKey() {
            return this.f23615zdlpuopuiu;
        }

        @Override // com.google.common.collect.eablkybsjg, java.util.Map.Entry
        public Object getValue() {
            Map mapHcddaimhww = btonecajqb.this.hcddaimhww();
            if (mapHcddaimhww != null) {
                return wwaezpbzkn.iobyxmoadg(mapHcddaimhww.get(this.f23615zdlpuopuiu));
            }
            iobyxmoadg();
            int i13 = this.f23614yggfygwlhe;
            return i13 == -1 ? wwaezpbzkn.zoijcleaow() : btonecajqb.this.yfnezrywwk(i13);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapHcddaimhww = btonecajqb.this.hcddaimhww();
            if (mapHcddaimhww != null) {
                return wwaezpbzkn.iobyxmoadg(mapHcddaimhww.put(this.f23615zdlpuopuiu, obj));
            }
            iobyxmoadg();
            int i13 = this.f23614yggfygwlhe;
            if (i13 == -1) {
                btonecajqb.this.put(this.f23615zdlpuopuiu, obj);
                return wwaezpbzkn.zoijcleaow();
            }
            Object objYfnezrywwk = btonecajqb.this.yfnezrywwk(i13);
            btonecajqb.this.uwvvkdfqfp(this.f23614yggfygwlhe, obj);
            return objYfnezrywwk;
        }
    }

    class nufgyqmvbu extends AbstractCollection {
        nufgyqmvbu() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            btonecajqb.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return btonecajqb.this.ydmasvzmpa();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return btonecajqb.this.size();
        }
    }

    class ppxfxbqfkf extends eablkybsjg {
        ppxfxbqfkf() {
            super(btonecajqb.this, null);
        }

        @Override // com.google.common.collect.btonecajqb.eablkybsjg
        Object zoijcleaow(int i13) {
            return btonecajqb.this.yfnezrywwk(i13);
        }
    }

    class wkgbmnqykc extends AbstractSet {
        wkgbmnqykc() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            btonecajqb.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapHcddaimhww = btonecajqb.this.hcddaimhww();
            if (mapHcddaimhww != null) {
                return mapHcddaimhww.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iKegysxyocb = btonecajqb.this.kegysxyocb(entry.getKey());
            return iKegysxyocb != -1 && xa.dxjokdxxww.iobyxmoadg(btonecajqb.this.yfnezrywwk(iKegysxyocb), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return btonecajqb.this.hkdspvbjdz();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapHcddaimhww = btonecajqb.this.hcddaimhww();
            if (mapHcddaimhww != null) {
                return mapHcddaimhww.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (btonecajqb.this.crxdokpmqz()) {
                return false;
            }
            int iWypolnanlu = btonecajqb.this.wypolnanlu();
            int iGxszxtbevo = gtknphoqwx.gxszxtbevo(entry.getKey(), entry.getValue(), iWypolnanlu, btonecajqb.this.jhduphickx(), btonecajqb.this.ribwqtqdhb(), btonecajqb.this.vipkmwdibw(), btonecajqb.this.ikoacuggdj());
            if (iGxszxtbevo == -1) {
                return false;
            }
            btonecajqb.this.sopmlzcsov(iGxszxtbevo, iWypolnanlu);
            btonecajqb.btonecajqb(btonecajqb.this);
            btonecajqb.this.stevsuqkhv();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return btonecajqb.this.size();
        }
    }

    class zoijcleaow extends eablkybsjg {
        zoijcleaow() {
            super(btonecajqb.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.btonecajqb.eablkybsjg
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public Map.Entry zoijcleaow(int i13) {
            return btonecajqb.this.new lqeggnwhkg(i13);
        }
    }

    btonecajqb(int i13) {
        tzroggbefp(i13);
    }

    static /* synthetic */ int btonecajqb(btonecajqb btonecajqbVar) {
        int i13 = btonecajqbVar.f23599esjtqupxsv;
        btonecajqbVar.f23599esjtqupxsv = i13 - 1;
        return i13;
    }

    private void czzsidtyhn(int i13, Object obj) {
        vipkmwdibw()[i13] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] ikoacuggdj() {
        Object[] objArr = this.f23600iwizpuwonk;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object jhduphickx() {
        Object obj = this.f23605zdlpuopuiu;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object jlmebxxoox(Object obj) {
        if (crxdokpmqz()) {
            return f23597istkbnxepw;
        }
        int iWypolnanlu = wypolnanlu();
        int iGxszxtbevo = gtknphoqwx.gxszxtbevo(obj, null, iWypolnanlu, jhduphickx(), ribwqtqdhb(), vipkmwdibw(), null);
        if (iGxszxtbevo == -1) {
            return f23597istkbnxepw;
        }
        Object objYfnezrywwk = yfnezrywwk(iGxszxtbevo);
        sopmlzcsov(iGxszxtbevo, iWypolnanlu);
        this.f23599esjtqupxsv--;
        stevsuqkhv();
        return objYfnezrywwk;
    }

    private int jpowsppfya(int i13) {
        return ribwqtqdhb()[i13];
    }

    private void jztzpxfvev(int i13) {
        int iMin;
        int length = ribwqtqdhb().length;
        if (i13 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        okpsazkaxt(iMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int kegysxyocb(Object obj) {
        if (crxdokpmqz()) {
            return -1;
        }
        int iPpxfxbqfkf = vdvldrhtss.ppxfxbqfkf(obj);
        int iWypolnanlu = wypolnanlu();
        int iNufgyqmvbu = gtknphoqwx.nufgyqmvbu(jhduphickx(), iPpxfxbqfkf & iWypolnanlu);
        if (iNufgyqmvbu == 0) {
            return -1;
        }
        int iZoijcleaow = gtknphoqwx.zoijcleaow(iPpxfxbqfkf, iWypolnanlu);
        do {
            int i13 = iNufgyqmvbu - 1;
            int iJpowsppfya = jpowsppfya(i13);
            if (gtknphoqwx.zoijcleaow(iJpowsppfya, iWypolnanlu) == iZoijcleaow && xa.dxjokdxxww.iobyxmoadg(obj, ntlheqmsrt(i13))) {
                return i13;
            }
            iNufgyqmvbu = gtknphoqwx.ppxfxbqfkf(iJpowsppfya, iWypolnanlu);
        } while (iNufgyqmvbu != 0);
        return -1;
    }

    private void metgxyhuhe(int i13, int i14) {
        ribwqtqdhb()[i13] = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object ntlheqmsrt(int i13) {
        return vipkmwdibw()[i13];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i13 = objectInputStream.readInt();
        if (i13 < 0) {
            throw new InvalidObjectException("Invalid size: " + i13);
        }
        tzroggbefp(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] ribwqtqdhb() {
        int[] iArr = this.f23604yggfygwlhe;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void rlfsiqarku(int i13) {
        this.f23598cqumvgiudr = gtknphoqwx.wkgbmnqykc(this.f23598cqumvgiudr, 32 - Integer.numberOfLeadingZeros(i13), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uwvvkdfqfp(int i13, Object obj) {
        ikoacuggdj()[i13] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] vipkmwdibw() {
        Object[] objArr = this.f23601jyumaefscl;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itHkdspvbjdz = hkdspvbjdz();
        while (itHkdspvbjdz.hasNext()) {
            Map.Entry entry = (Map.Entry) itHkdspvbjdz.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wypolnanlu() {
        return (1 << (this.f23598cqumvgiudr & 31)) - 1;
    }

    private int xrmfcynszj(int i13, int i14, int i15, int i16) {
        Object objIobyxmoadg = gtknphoqwx.iobyxmoadg(i14);
        int i17 = i14 - 1;
        if (i16 != 0) {
            gtknphoqwx.dxjokdxxww(objIobyxmoadg, i15 & i17, i16 + 1);
        }
        Object objJhduphickx = jhduphickx();
        int[] iArrRibwqtqdhb = ribwqtqdhb();
        for (int i18 = 0; i18 <= i13; i18++) {
            int iNufgyqmvbu = gtknphoqwx.nufgyqmvbu(objJhduphickx, i18);
            while (iNufgyqmvbu != 0) {
                int i19 = iNufgyqmvbu - 1;
                int i23 = iArrRibwqtqdhb[i19];
                int iZoijcleaow = gtknphoqwx.zoijcleaow(i23, i13) | i18;
                int i24 = iZoijcleaow & i17;
                int iNufgyqmvbu2 = gtknphoqwx.nufgyqmvbu(objIobyxmoadg, i24);
                gtknphoqwx.dxjokdxxww(objIobyxmoadg, i24, iNufgyqmvbu);
                iArrRibwqtqdhb[i19] = gtknphoqwx.wkgbmnqykc(iZoijcleaow, iNufgyqmvbu2, i17);
                iNufgyqmvbu = gtknphoqwx.ppxfxbqfkf(i23, i13);
            }
        }
        this.f23605zdlpuopuiu = objIobyxmoadg;
        rlfsiqarku(i17);
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object yfnezrywwk(int i13) {
        return ikoacuggdj()[i13];
    }

    public static btonecajqb ylkuphrtab(int i13) {
        return new btonecajqb(i13);
    }

    Map cdpycssgdh(int i13) {
        return new LinkedHashMap(i13, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (crxdokpmqz()) {
            return;
        }
        stevsuqkhv();
        Map mapHcddaimhww = hcddaimhww();
        if (mapHcddaimhww != null) {
            this.f23598cqumvgiudr = com.google.common.primitives.gxszxtbevo.eablkybsjg(size(), 3, 1073741823);
            mapHcddaimhww.clear();
            this.f23605zdlpuopuiu = null;
            this.f23599esjtqupxsv = 0;
            return;
        }
        Arrays.fill(vipkmwdibw(), 0, this.f23599esjtqupxsv, (Object) null);
        Arrays.fill(ikoacuggdj(), 0, this.f23599esjtqupxsv, (Object) null);
        gtknphoqwx.lqeggnwhkg(jhduphickx());
        Arrays.fill(ribwqtqdhb(), 0, this.f23599esjtqupxsv, 0);
        this.f23599esjtqupxsv = 0;
    }

    int cllcsxoeiz() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapHcddaimhww = hcddaimhww();
        if (mapHcddaimhww != null) {
            return mapHcddaimhww.containsKey(obj);
        }
        return kegysxyocb(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapHcddaimhww = hcddaimhww();
        if (mapHcddaimhww != null) {
            return mapHcddaimhww.containsValue(obj);
        }
        for (int i13 = 0; i13 < this.f23599esjtqupxsv; i13++) {
            if (xa.dxjokdxxww.iobyxmoadg(obj, yfnezrywwk(i13))) {
                return true;
            }
        }
        return false;
    }

    void cqumvgiudr(int i13) {
    }

    boolean crxdokpmqz() {
        return this.f23605zdlpuopuiu == null;
    }

    int dsvhmnatus(int i13) {
        int i14 = i13 + 1;
        if (i14 < this.f23599esjtqupxsv) {
            return i14;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f23603pmvmpeiblj;
        if (set != null) {
            return set;
        }
        Set setIstkbnxepw = istkbnxepw();
        this.f23603pmvmpeiblj = setIstkbnxepw;
        return setIstkbnxepw;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapHcddaimhww = hcddaimhww();
        if (mapHcddaimhww != null) {
            return mapHcddaimhww.get(obj);
        }
        int iKegysxyocb = kegysxyocb(obj);
        if (iKegysxyocb == -1) {
            return null;
        }
        cqumvgiudr(iKegysxyocb);
        return yfnezrywwk(iKegysxyocb);
    }

    Map hcddaimhww() {
        Object obj = this.f23605zdlpuopuiu;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator hkdspvbjdz() {
        Map mapHcddaimhww = hcddaimhww();
        return mapHcddaimhww != null ? mapHcddaimhww.entrySet().iterator() : new zoijcleaow();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    Set istkbnxepw() {
        return new wkgbmnqykc();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f23602lereixgezr;
        if (set != null) {
            return set;
        }
        Set setLmojexxdyd = lmojexxdyd();
        this.f23602lereixgezr = setLmojexxdyd;
        return setLmojexxdyd;
    }

    int lereixgezr(int i13, int i14) {
        return i13 - 1;
    }

    Set lmojexxdyd() {
        return new gxszxtbevo();
    }

    void mbcevpiqjq(int i13, Object obj, Object obj2, int i14, int i15) {
        metgxyhuhe(i13, gtknphoqwx.wkgbmnqykc(i14, 0, i15));
        czzsidtyhn(i13, obj);
        uwvvkdfqfp(i13, obj2);
    }

    void okpsazkaxt(int i13) {
        this.f23604yggfygwlhe = Arrays.copyOf(ribwqtqdhb(), i13);
        this.f23601jyumaefscl = Arrays.copyOf(vipkmwdibw(), i13);
        this.f23600iwizpuwonk = Arrays.copyOf(ikoacuggdj(), i13);
    }

    int pmvmpeiblj() {
        xa.draadjrbmk.rgvfuqvkyq(crxdokpmqz(), "Arrays already allocated");
        int i13 = this.f23598cqumvgiudr;
        int iBtonecajqb = gtknphoqwx.btonecajqb(i13);
        this.f23605zdlpuopuiu = gtknphoqwx.iobyxmoadg(iBtonecajqb);
        rlfsiqarku(iBtonecajqb - 1);
        this.f23604yggfygwlhe = new int[i13];
        this.f23601jyumaefscl = new Object[i13];
        this.f23600iwizpuwonk = new Object[i13];
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int iXrmfcynszj;
        int i13;
        if (crxdokpmqz()) {
            pmvmpeiblj();
        }
        Map mapHcddaimhww = hcddaimhww();
        if (mapHcddaimhww != null) {
            return mapHcddaimhww.put(obj, obj2);
        }
        int[] iArrRibwqtqdhb = ribwqtqdhb();
        Object[] objArrVipkmwdibw = vipkmwdibw();
        Object[] objArrIkoacuggdj = ikoacuggdj();
        int i14 = this.f23599esjtqupxsv;
        int i15 = i14 + 1;
        int iPpxfxbqfkf = vdvldrhtss.ppxfxbqfkf(obj);
        int iWypolnanlu = wypolnanlu();
        int i16 = iPpxfxbqfkf & iWypolnanlu;
        int iNufgyqmvbu = gtknphoqwx.nufgyqmvbu(jhduphickx(), i16);
        if (iNufgyqmvbu != 0) {
            int iZoijcleaow = gtknphoqwx.zoijcleaow(iPpxfxbqfkf, iWypolnanlu);
            int i17 = 0;
            while (true) {
                int i18 = iNufgyqmvbu - 1;
                int i19 = iArrRibwqtqdhb[i18];
                if (gtknphoqwx.zoijcleaow(i19, iWypolnanlu) == iZoijcleaow && xa.dxjokdxxww.iobyxmoadg(obj, objArrVipkmwdibw[i18])) {
                    Object obj3 = objArrIkoacuggdj[i18];
                    objArrIkoacuggdj[i18] = obj2;
                    cqumvgiudr(i18);
                    return obj3;
                }
                int iPpxfxbqfkf2 = gtknphoqwx.ppxfxbqfkf(i19, iWypolnanlu);
                i17++;
                if (iPpxfxbqfkf2 != 0) {
                    iNufgyqmvbu = iPpxfxbqfkf2;
                } else {
                    if (i17 >= 9) {
                        return zynmafqrjb().put(obj, obj2);
                    }
                    if (i15 > iWypolnanlu) {
                        iXrmfcynszj = xrmfcynszj(iWypolnanlu, gtknphoqwx.eablkybsjg(iWypolnanlu), iPpxfxbqfkf, i14);
                        i13 = iXrmfcynszj;
                    } else {
                        iArrRibwqtqdhb[i18] = gtknphoqwx.wkgbmnqykc(i19, i15, iWypolnanlu);
                        i13 = iWypolnanlu;
                    }
                }
            }
        } else if (i15 > iWypolnanlu) {
            iXrmfcynszj = xrmfcynszj(iWypolnanlu, gtknphoqwx.eablkybsjg(iWypolnanlu), iPpxfxbqfkf, i14);
            i13 = iXrmfcynszj;
        } else {
            gtknphoqwx.dxjokdxxww(jhduphickx(), i16, i15);
            i13 = iWypolnanlu;
        }
        jztzpxfvev(i15);
        mbcevpiqjq(i14, obj, obj2, iPpxfxbqfkf, i13);
        this.f23599esjtqupxsv = i15;
        stevsuqkhv();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapHcddaimhww = hcddaimhww();
        if (mapHcddaimhww != null) {
            return mapHcddaimhww.remove(obj);
        }
        Object objJlmebxxoox = jlmebxxoox(obj);
        if (objJlmebxxoox == f23597istkbnxepw) {
            return null;
        }
        return objJlmebxxoox;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapHcddaimhww = hcddaimhww();
        return mapHcddaimhww != null ? mapHcddaimhww.size() : this.f23599esjtqupxsv;
    }

    void sopmlzcsov(int i13, int i14) {
        Object objJhduphickx = jhduphickx();
        int[] iArrRibwqtqdhb = ribwqtqdhb();
        Object[] objArrVipkmwdibw = vipkmwdibw();
        Object[] objArrIkoacuggdj = ikoacuggdj();
        int size = size();
        int i15 = size - 1;
        if (i13 >= i15) {
            objArrVipkmwdibw[i13] = null;
            objArrIkoacuggdj[i13] = null;
            iArrRibwqtqdhb[i13] = 0;
            return;
        }
        Object obj = objArrVipkmwdibw[i15];
        objArrVipkmwdibw[i13] = obj;
        objArrIkoacuggdj[i13] = objArrIkoacuggdj[i15];
        objArrVipkmwdibw[i15] = null;
        objArrIkoacuggdj[i15] = null;
        iArrRibwqtqdhb[i13] = iArrRibwqtqdhb[i15];
        iArrRibwqtqdhb[i15] = 0;
        int iPpxfxbqfkf = vdvldrhtss.ppxfxbqfkf(obj) & i14;
        int iNufgyqmvbu = gtknphoqwx.nufgyqmvbu(objJhduphickx, iPpxfxbqfkf);
        if (iNufgyqmvbu == size) {
            gtknphoqwx.dxjokdxxww(objJhduphickx, iPpxfxbqfkf, i13 + 1);
            return;
        }
        while (true) {
            int i16 = iNufgyqmvbu - 1;
            int i17 = iArrRibwqtqdhb[i16];
            int iPpxfxbqfkf2 = gtknphoqwx.ppxfxbqfkf(i17, i14);
            if (iPpxfxbqfkf2 == size) {
                iArrRibwqtqdhb[i16] = gtknphoqwx.wkgbmnqykc(i17, i13 + 1, i14);
                return;
            }
            iNufgyqmvbu = iPpxfxbqfkf2;
        }
    }

    void stevsuqkhv() {
        this.f23598cqumvgiudr += 32;
    }

    void tzroggbefp(int i13) {
        xa.draadjrbmk.eablkybsjg(i13 >= 0, "Expected size must be >= 0");
        this.f23598cqumvgiudr = com.google.common.primitives.gxszxtbevo.eablkybsjg(i13, 1, 1073741823);
    }

    Iterator ulzqkzuiru() {
        Map mapHcddaimhww = hcddaimhww();
        return mapHcddaimhww != null ? mapHcddaimhww.keySet().iterator() : new iobyxmoadg();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f23606zynmafqrjb;
        if (collection != null) {
            return collection;
        }
        Collection collectionWwaezpbzkn = wwaezpbzkn();
        this.f23606zynmafqrjb = collectionWwaezpbzkn;
        return collectionWwaezpbzkn;
    }

    Collection wwaezpbzkn() {
        return new nufgyqmvbu();
    }

    Iterator ydmasvzmpa() {
        Map mapHcddaimhww = hcddaimhww();
        return mapHcddaimhww != null ? mapHcddaimhww.values().iterator() : new ppxfxbqfkf();
    }

    Map zynmafqrjb() {
        Map mapCdpycssgdh = cdpycssgdh(wypolnanlu() + 1);
        int iCllcsxoeiz = cllcsxoeiz();
        while (iCllcsxoeiz >= 0) {
            mapCdpycssgdh.put(ntlheqmsrt(iCllcsxoeiz), yfnezrywwk(iCllcsxoeiz));
            iCllcsxoeiz = dsvhmnatus(iCllcsxoeiz);
        }
        this.f23605zdlpuopuiu = mapCdpycssgdh;
        this.f23604yggfygwlhe = null;
        this.f23601jyumaefscl = null;
        this.f23600iwizpuwonk = null;
        stevsuqkhv();
        return mapCdpycssgdh;
    }

    private abstract class eablkybsjg implements Iterator {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f23608jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f23609yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f23610zdlpuopuiu;

        private eablkybsjg() {
            this.f23610zdlpuopuiu = btonecajqb.this.f23598cqumvgiudr;
            this.f23609yggfygwlhe = btonecajqb.this.cllcsxoeiz();
            this.f23608jyumaefscl = -1;
        }

        private void iobyxmoadg() {
            if (btonecajqb.this.f23598cqumvgiudr != this.f23610zdlpuopuiu) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23609yggfygwlhe >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            iobyxmoadg();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i13 = this.f23609yggfygwlhe;
            this.f23608jyumaefscl = i13;
            Object objZoijcleaow = zoijcleaow(i13);
            this.f23609yggfygwlhe = btonecajqb.this.dsvhmnatus(this.f23609yggfygwlhe);
            return objZoijcleaow;
        }

        void ppxfxbqfkf() {
            this.f23610zdlpuopuiu += 32;
        }

        @Override // java.util.Iterator
        public void remove() {
            iobyxmoadg();
            com.google.common.collect.nufgyqmvbu.ppxfxbqfkf(this.f23608jyumaefscl >= 0);
            ppxfxbqfkf();
            btonecajqb btonecajqbVar = btonecajqb.this;
            btonecajqbVar.remove(btonecajqbVar.ntlheqmsrt(this.f23608jyumaefscl));
            this.f23609yggfygwlhe = btonecajqb.this.lereixgezr(this.f23609yggfygwlhe, this.f23608jyumaefscl);
            this.f23608jyumaefscl = -1;
        }

        abstract Object zoijcleaow(int i13);

        /* synthetic */ eablkybsjg(btonecajqb btonecajqbVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }
}
