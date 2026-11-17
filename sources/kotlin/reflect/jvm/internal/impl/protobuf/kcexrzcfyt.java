package kotlin.reflect.jvm.internal.impl.protobuf;

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

/* JADX INFO: loaded from: classes3.dex */
abstract class kcexrzcfyt extends AbstractMap {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private volatile eablkybsjg f60108cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f60109iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Map f60110jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private List f60111yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f60112zdlpuopuiu;

    private class eablkybsjg extends AbstractSet {
        private eablkybsjg() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            kcexrzcfyt.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = kcexrzcfyt.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            kcexrzcfyt.this.rgvfuqvkyq((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new wkgbmnqykc(kcexrzcfyt.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            kcexrzcfyt.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return kcexrzcfyt.this.size();
        }

        /* synthetic */ eablkybsjg(kcexrzcfyt kcexrzcfytVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    static class iobyxmoadg extends kcexrzcfyt {
        iobyxmoadg(int i13) {
            super(i13, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.kcexrzcfyt
        public void agtfadlqog() {
            if (!wflxmlrfwp()) {
                for (int i13 = 0; i13 < btonecajqb(); i13++) {
                    Map.Entry entryDxjokdxxww = dxjokdxxww(i13);
                    if (((lqeggnwhkg.zoijcleaow) entryDxjokdxxww.getKey()).isRepeated()) {
                        entryDxjokdxxww.setValue(Collections.unmodifiableList((List) entryDxjokdxxww.getValue()));
                    }
                }
                for (Map.Entry entry : gtknphoqwx()) {
                    if (((lqeggnwhkg.zoijcleaow) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.agtfadlqog();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.rgvfuqvkyq((lqeggnwhkg.zoijcleaow) obj, obj2);
        }
    }

    private class ppxfxbqfkf implements Comparable, Map.Entry {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Object f60115yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Comparable f60116zdlpuopuiu;

        ppxfxbqfkf(kcexrzcfyt kcexrzcfytVar, Map.Entry entry) {
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
            return zoijcleaow(this.f60116zdlpuopuiu, entry.getKey()) && zoijcleaow(this.f60115yggfygwlhe, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f60115yggfygwlhe;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f60116zdlpuopuiu;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f60115yggfygwlhe;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(ppxfxbqfkf ppxfxbqfkfVar) {
            return getKey().compareTo(ppxfxbqfkfVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f60116zdlpuopuiu;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            kcexrzcfyt.this.gxszxtbevo();
            Object obj2 = this.f60115yggfygwlhe;
            this.f60115yggfygwlhe = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f60116zdlpuopuiu);
            String strValueOf2 = String.valueOf(this.f60115yggfygwlhe);
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb3.append(strValueOf);
            sb3.append("=");
            sb3.append(strValueOf2);
            return sb3.toString();
        }

        ppxfxbqfkf(Comparable comparable, Object obj) {
            this.f60116zdlpuopuiu = comparable;
            this.f60115yggfygwlhe = obj;
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Iterator f60121iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final Iterable f60122zoijcleaow = new C1199zoijcleaow();

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

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.kcexrzcfyt$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        static class C1199zoijcleaow implements Iterable {
            C1199zoijcleaow() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return zoijcleaow.f60121iobyxmoadg;
            }
        }

        static Iterable zoijcleaow() {
            return f60122zoijcleaow;
        }
    }

    /* synthetic */ kcexrzcfyt(int i13, iobyxmoadg iobyxmoadgVar) {
        this(i13);
    }

    private SortedMap draadjrbmk() {
        gxszxtbevo();
        if (this.f60110jyumaefscl.isEmpty() && !(this.f60110jyumaefscl instanceof TreeMap)) {
            this.f60110jyumaefscl = new TreeMap();
        }
        return (SortedMap) this.f60110jyumaefscl;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int eablkybsjg(Comparable comparable) {
        int i13;
        int i14;
        int i15;
        int iCompareTo;
        int size = this.f60111yggfygwlhe.size();
        int i16 = size - 1;
        if (i16 < 0) {
            i13 = 0;
            while (i13 <= i16) {
                i15 = (i13 + i16) / 2;
                iCompareTo = comparable.compareTo(((ppxfxbqfkf) this.f60111yggfygwlhe.get(i15)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((ppxfxbqfkf) this.f60111yggfygwlhe.get(i16)).getKey());
            if (iCompareTo2 > 0) {
                i14 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i16;
                }
                i13 = 0;
                while (i13 <= i16) {
                    i15 = (i13 + i16) / 2;
                    iCompareTo = comparable.compareTo(((ppxfxbqfkf) this.f60111yggfygwlhe.get(i15)).getKey());
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
    public void gxszxtbevo() {
        if (this.f60109iwizpuwonk) {
            throw new UnsupportedOperationException();
        }
    }

    private void lqeggnwhkg() {
        gxszxtbevo();
        if (!this.f60111yggfygwlhe.isEmpty() || (this.f60111yggfygwlhe instanceof ArrayList)) {
            return;
        }
        this.f60111yggfygwlhe = new ArrayList(this.f60112zdlpuopuiu);
    }

    static kcexrzcfyt ojitshcjhn(int i13) {
        return new iobyxmoadg(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object vdvldrhtss(int i13) {
        gxszxtbevo();
        Object value = ((ppxfxbqfkf) this.f60111yggfygwlhe.remove(i13)).getValue();
        if (!this.f60110jyumaefscl.isEmpty()) {
            Iterator it = draadjrbmk().entrySet().iterator();
            this.f60111yggfygwlhe.add(new ppxfxbqfkf(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void agtfadlqog() {
        if (this.f60109iwizpuwonk) {
            return;
        }
        this.f60110jyumaefscl = this.f60110jyumaefscl.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f60110jyumaefscl);
        this.f60109iwizpuwonk = true;
    }

    public int btonecajqb() {
        return this.f60111yggfygwlhe.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        gxszxtbevo();
        if (!this.f60111yggfygwlhe.isEmpty()) {
            this.f60111yggfygwlhe.clear();
        }
        if (this.f60110jyumaefscl.isEmpty()) {
            return;
        }
        this.f60110jyumaefscl.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return eablkybsjg(comparable) >= 0 || this.f60110jyumaefscl.containsKey(comparable);
    }

    public Map.Entry dxjokdxxww(int i13) {
        return (Map.Entry) this.f60111yggfygwlhe.get(i13);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f60108cqumvgiudr == null) {
            this.f60108cqumvgiudr = new eablkybsjg(this, null);
        }
        return this.f60108cqumvgiudr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iEablkybsjg = eablkybsjg(comparable);
        return iEablkybsjg >= 0 ? ((ppxfxbqfkf) this.f60111yggfygwlhe.get(iEablkybsjg)).getValue() : this.f60110jyumaefscl.get(comparable);
    }

    public Iterable gtknphoqwx() {
        return this.f60110jyumaefscl.isEmpty() ? zoijcleaow.zoijcleaow() : this.f60110jyumaefscl.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        gxszxtbevo();
        Comparable comparable = (Comparable) obj;
        int iEablkybsjg = eablkybsjg(comparable);
        if (iEablkybsjg >= 0) {
            return vdvldrhtss(iEablkybsjg);
        }
        if (this.f60110jyumaefscl.isEmpty()) {
            return null;
        }
        return this.f60110jyumaefscl.remove(comparable);
    }

    public Object rgvfuqvkyq(Comparable comparable, Object obj) {
        gxszxtbevo();
        int iEablkybsjg = eablkybsjg(comparable);
        if (iEablkybsjg >= 0) {
            return ((ppxfxbqfkf) this.f60111yggfygwlhe.get(iEablkybsjg)).setValue(obj);
        }
        lqeggnwhkg();
        int i13 = -(iEablkybsjg + 1);
        if (i13 >= this.f60112zdlpuopuiu) {
            return draadjrbmk().put(comparable, obj);
        }
        int size = this.f60111yggfygwlhe.size();
        int i14 = this.f60112zdlpuopuiu;
        if (size == i14) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f60111yggfygwlhe.remove(i14 - 1);
            draadjrbmk().put(ppxfxbqfkfVar.getKey(), ppxfxbqfkfVar.getValue());
        }
        this.f60111yggfygwlhe.add(i13, new ppxfxbqfkf(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f60111yggfygwlhe.size() + this.f60110jyumaefscl.size();
    }

    public boolean wflxmlrfwp() {
        return this.f60109iwizpuwonk;
    }

    private class wkgbmnqykc implements Iterator {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Iterator f60118jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f60119yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f60120zdlpuopuiu;

        private wkgbmnqykc() {
            this.f60120zdlpuopuiu = -1;
        }

        private Iterator iobyxmoadg() {
            if (this.f60118jyumaefscl == null) {
                this.f60118jyumaefscl = kcexrzcfyt.this.f60110jyumaefscl.entrySet().iterator();
            }
            return this.f60118jyumaefscl;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60120zdlpuopuiu + 1 < kcexrzcfyt.this.f60111yggfygwlhe.size() || iobyxmoadg().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f60119yggfygwlhe) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f60119yggfygwlhe = false;
            kcexrzcfyt.this.gxszxtbevo();
            if (this.f60120zdlpuopuiu >= kcexrzcfyt.this.f60111yggfygwlhe.size()) {
                iobyxmoadg().remove();
                return;
            }
            kcexrzcfyt kcexrzcfytVar = kcexrzcfyt.this;
            int i13 = this.f60120zdlpuopuiu;
            this.f60120zdlpuopuiu = i13 - 1;
            kcexrzcfytVar.vdvldrhtss(i13);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f60119yggfygwlhe = true;
            int i13 = this.f60120zdlpuopuiu + 1;
            this.f60120zdlpuopuiu = i13;
            return i13 < kcexrzcfyt.this.f60111yggfygwlhe.size() ? (Map.Entry) kcexrzcfyt.this.f60111yggfygwlhe.get(this.f60120zdlpuopuiu) : (Map.Entry) iobyxmoadg().next();
        }

        /* synthetic */ wkgbmnqykc(kcexrzcfyt kcexrzcfytVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private kcexrzcfyt(int i13) {
        this.f60112zdlpuopuiu = i13;
        this.f60111yggfygwlhe = Collections.emptyList();
        this.f60110jyumaefscl = Collections.emptyMap();
    }
}
