package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class ribwqtqdhb extends AbstractMap {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private volatile lqeggnwhkg f8782cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Map f8783esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f8784iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Map f8785jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private volatile ppxfxbqfkf f8786lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private List f8787yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f8788zdlpuopuiu;

    private class eablkybsjg implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Object f8790yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Comparable f8791zdlpuopuiu;

        eablkybsjg(ribwqtqdhb ribwqtqdhbVar, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean zoijcleaow(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return zoijcleaow(this.f8791zdlpuopuiu, entry.getKey()) && zoijcleaow(this.f8790yggfygwlhe, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f8790yggfygwlhe;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f8791zdlpuopuiu;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f8790yggfygwlhe;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(eablkybsjg eablkybsjgVar) {
            return getKey().compareTo(eablkybsjgVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f8791zdlpuopuiu;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            ribwqtqdhb.this.lqeggnwhkg();
            Object obj2 = this.f8790yggfygwlhe;
            this.f8790yggfygwlhe = obj;
            return obj2;
        }

        public String toString() {
            return this.f8791zdlpuopuiu + "=" + this.f8790yggfygwlhe;
        }

        eablkybsjg(Comparable comparable, Object obj) {
            this.f8791zdlpuopuiu = comparable;
            this.f8790yggfygwlhe = obj;
        }
    }

    static class iobyxmoadg extends ribwqtqdhb {
        iobyxmoadg(int i13) {
            super(i13, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            return super.kcexrzcfyt(null, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.ribwqtqdhb
        public void vdvldrhtss() {
            if (!rgvfuqvkyq()) {
                if (draadjrbmk() > 0) {
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(gtknphoqwx(0).getKey());
                    throw null;
                }
                Iterator it = agtfadlqog().iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.vdvldrhtss();
        }
    }

    private class lqeggnwhkg extends AbstractSet {
        private lqeggnwhkg() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ribwqtqdhb.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ribwqtqdhb.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            ribwqtqdhb.this.kcexrzcfyt((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new gxszxtbevo(ribwqtqdhb.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            ribwqtqdhb.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ribwqtqdhb.this.size();
        }

        /* synthetic */ lqeggnwhkg(ribwqtqdhb ribwqtqdhbVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private class ppxfxbqfkf extends lqeggnwhkg {
        private ppxfxbqfkf() {
            super(ribwqtqdhb.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.ribwqtqdhb.lqeggnwhkg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new zoijcleaow(ribwqtqdhb.this, null);
        }

        /* synthetic */ ppxfxbqfkf(ribwqtqdhb ribwqtqdhbVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Iterator f8798iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final Iterable f8799zoijcleaow = new zoijcleaow();

        static class iobyxmoadg implements Iterator {
            iobyxmoadg() {
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
                throw new UnsupportedOperationException();
            }
        }

        static class zoijcleaow implements Iterable {
            zoijcleaow() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return wkgbmnqykc.f8798iobyxmoadg;
            }
        }

        static Iterable zoijcleaow() {
            return f8799zoijcleaow;
        }
    }

    /* synthetic */ ribwqtqdhb(int i13, iobyxmoadg iobyxmoadgVar) {
        this(i13);
    }

    private void btonecajqb() {
        lqeggnwhkg();
        if (!this.f8787yggfygwlhe.isEmpty() || (this.f8787yggfygwlhe instanceof ArrayList)) {
            return;
        }
        this.f8787yggfygwlhe = new ArrayList(this.f8788zdlpuopuiu);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int gxszxtbevo(Comparable comparable) {
        int i13;
        int i14;
        int i15;
        int iCompareTo;
        int size = this.f8787yggfygwlhe.size();
        int i16 = size - 1;
        if (i16 < 0) {
            i13 = 0;
            while (i13 <= i16) {
                i15 = (i13 + i16) / 2;
                iCompareTo = comparable.compareTo(((eablkybsjg) this.f8787yggfygwlhe.get(i15)).getKey());
                if (iCompareTo < 0) {
                    i16 = i15 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i15;
                    }
                    i13 = i15 + 1;
                }
            }
            i14 = i13 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((eablkybsjg) this.f8787yggfygwlhe.get(i16)).getKey());
            if (iCompareTo2 > 0) {
                i14 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i16;
                }
                i13 = 0;
                while (i13 <= i16) {
                    i15 = (i13 + i16) / 2;
                    iCompareTo = comparable.compareTo(((eablkybsjg) this.f8787yggfygwlhe.get(i15)).getKey());
                    if (iCompareTo < 0) {
                        i16 = i15 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i15;
                        }
                        i13 = i15 + 1;
                    }
                }
                i14 = i13 + 1;
            }
        }
        return -i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lqeggnwhkg() {
        if (this.f8784iwizpuwonk) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap ojitshcjhn() {
        lqeggnwhkg();
        if (this.f8785jyumaefscl.isEmpty() && !(this.f8785jyumaefscl instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8785jyumaefscl = treeMap;
            this.f8783esjtqupxsv = treeMap.descendingMap();
        }
        return (SortedMap) this.f8785jyumaefscl;
    }

    static ribwqtqdhb oxmwwwfdhm(int i13) {
        return new iobyxmoadg(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object zdlpuopuiu(int i13) {
        lqeggnwhkg();
        Object value = ((eablkybsjg) this.f8787yggfygwlhe.remove(i13)).getValue();
        if (!this.f8785jyumaefscl.isEmpty()) {
            Iterator it = ojitshcjhn().entrySet().iterator();
            this.f8787yggfygwlhe.add(new eablkybsjg(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public Iterable agtfadlqog() {
        return this.f8785jyumaefscl.isEmpty() ? wkgbmnqykc.zoijcleaow() : this.f8785jyumaefscl.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        lqeggnwhkg();
        if (!this.f8787yggfygwlhe.isEmpty()) {
            this.f8787yggfygwlhe.clear();
        }
        if (this.f8785jyumaefscl.isEmpty()) {
            return;
        }
        this.f8785jyumaefscl.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return gxszxtbevo(comparable) >= 0 || this.f8785jyumaefscl.containsKey(comparable);
    }

    public int draadjrbmk() {
        return this.f8787yggfygwlhe.size();
    }

    Set dxjokdxxww() {
        if (this.f8786lereixgezr == null) {
            this.f8786lereixgezr = new ppxfxbqfkf(this, null);
        }
        return this.f8786lereixgezr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f8782cqumvgiudr == null) {
            this.f8782cqumvgiudr = new lqeggnwhkg(this, null);
        }
        return this.f8782cqumvgiudr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ribwqtqdhb)) {
            return super.equals(obj);
        }
        ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) obj;
        int size = size();
        if (size != ribwqtqdhbVar.size()) {
            return false;
        }
        int iDraadjrbmk = draadjrbmk();
        if (iDraadjrbmk != ribwqtqdhbVar.draadjrbmk()) {
            return entrySet().equals(ribwqtqdhbVar.entrySet());
        }
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            if (!gtknphoqwx(i13).equals(ribwqtqdhbVar.gtknphoqwx(i13))) {
                return false;
            }
        }
        if (iDraadjrbmk != size) {
            return this.f8785jyumaefscl.equals(ribwqtqdhbVar.f8785jyumaefscl);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iGxszxtbevo = gxszxtbevo(comparable);
        return iGxszxtbevo >= 0 ? ((eablkybsjg) this.f8787yggfygwlhe.get(iGxszxtbevo)).getValue() : this.f8785jyumaefscl.get(comparable);
    }

    public Map.Entry gtknphoqwx(int i13) {
        return (Map.Entry) this.f8787yggfygwlhe.get(i13);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iDraadjrbmk = draadjrbmk();
        int iHashCode = 0;
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            iHashCode += ((eablkybsjg) this.f8787yggfygwlhe.get(i13)).hashCode();
        }
        return wflxmlrfwp() > 0 ? iHashCode + this.f8785jyumaefscl.hashCode() : iHashCode;
    }

    public Object kcexrzcfyt(Comparable comparable, Object obj) {
        lqeggnwhkg();
        int iGxszxtbevo = gxszxtbevo(comparable);
        if (iGxszxtbevo >= 0) {
            return ((eablkybsjg) this.f8787yggfygwlhe.get(iGxszxtbevo)).setValue(obj);
        }
        btonecajqb();
        int i13 = -(iGxszxtbevo + 1);
        if (i13 >= this.f8788zdlpuopuiu) {
            return ojitshcjhn().put(comparable, obj);
        }
        int size = this.f8787yggfygwlhe.size();
        int i14 = this.f8788zdlpuopuiu;
        if (size == i14) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) this.f8787yggfygwlhe.remove(i14 - 1);
            ojitshcjhn().put(eablkybsjgVar.getKey(), eablkybsjgVar.getValue());
        }
        this.f8787yggfygwlhe.add(i13, new eablkybsjg(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        lqeggnwhkg();
        Comparable comparable = (Comparable) obj;
        int iGxszxtbevo = gxszxtbevo(comparable);
        if (iGxszxtbevo >= 0) {
            return zdlpuopuiu(iGxszxtbevo);
        }
        if (this.f8785jyumaefscl.isEmpty()) {
            return null;
        }
        return this.f8785jyumaefscl.remove(comparable);
    }

    public boolean rgvfuqvkyq() {
        return this.f8784iwizpuwonk;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8787yggfygwlhe.size() + this.f8785jyumaefscl.size();
    }

    public void vdvldrhtss() {
        if (this.f8784iwizpuwonk) {
            return;
        }
        this.f8785jyumaefscl = this.f8785jyumaefscl.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8785jyumaefscl);
        this.f8783esjtqupxsv = this.f8783esjtqupxsv.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8783esjtqupxsv);
        this.f8784iwizpuwonk = true;
    }

    public int wflxmlrfwp() {
        return this.f8785jyumaefscl.size();
    }

    private class gxszxtbevo implements Iterator {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Iterator f8793jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f8794yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f8795zdlpuopuiu;

        private gxszxtbevo() {
            this.f8795zdlpuopuiu = -1;
        }

        private Iterator iobyxmoadg() {
            if (this.f8793jyumaefscl == null) {
                this.f8793jyumaefscl = ribwqtqdhb.this.f8785jyumaefscl.entrySet().iterator();
            }
            return this.f8793jyumaefscl;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8795zdlpuopuiu + 1 >= ribwqtqdhb.this.f8787yggfygwlhe.size()) {
                return !ribwqtqdhb.this.f8785jyumaefscl.isEmpty() && iobyxmoadg().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8794yggfygwlhe) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f8794yggfygwlhe = false;
            ribwqtqdhb.this.lqeggnwhkg();
            if (this.f8795zdlpuopuiu >= ribwqtqdhb.this.f8787yggfygwlhe.size()) {
                iobyxmoadg().remove();
                return;
            }
            ribwqtqdhb ribwqtqdhbVar = ribwqtqdhb.this;
            int i13 = this.f8795zdlpuopuiu;
            this.f8795zdlpuopuiu = i13 - 1;
            ribwqtqdhbVar.zdlpuopuiu(i13);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f8794yggfygwlhe = true;
            int i13 = this.f8795zdlpuopuiu + 1;
            this.f8795zdlpuopuiu = i13;
            return i13 < ribwqtqdhb.this.f8787yggfygwlhe.size() ? (Map.Entry) ribwqtqdhb.this.f8787yggfygwlhe.get(this.f8795zdlpuopuiu) : (Map.Entry) iobyxmoadg().next();
        }

        /* synthetic */ gxszxtbevo(ribwqtqdhb ribwqtqdhbVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private class zoijcleaow implements Iterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Iterator f8801yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f8802zdlpuopuiu;

        private zoijcleaow() {
            this.f8802zdlpuopuiu = ribwqtqdhb.this.f8787yggfygwlhe.size();
        }

        private Iterator iobyxmoadg() {
            if (this.f8801yggfygwlhe == null) {
                this.f8801yggfygwlhe = ribwqtqdhb.this.f8783esjtqupxsv.entrySet().iterator();
            }
            return this.f8801yggfygwlhe;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i13 = this.f8802zdlpuopuiu;
            return (i13 > 0 && i13 <= ribwqtqdhb.this.f8787yggfygwlhe.size()) || iobyxmoadg().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (iobyxmoadg().hasNext()) {
                return (Map.Entry) iobyxmoadg().next();
            }
            List list = ribwqtqdhb.this.f8787yggfygwlhe;
            int i13 = this.f8802zdlpuopuiu - 1;
            this.f8802zdlpuopuiu = i13;
            return (Map.Entry) list.get(i13);
        }

        /* synthetic */ zoijcleaow(ribwqtqdhb ribwqtqdhbVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private ribwqtqdhb(int i13) {
        this.f8788zdlpuopuiu = i13;
        this.f8787yggfygwlhe = Collections.emptyList();
        this.f8785jyumaefscl = Collections.emptyMap();
        this.f8783esjtqupxsv = Collections.emptyMap();
    }
}
