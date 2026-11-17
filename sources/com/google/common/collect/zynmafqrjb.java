package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zynmafqrjb {

    static class eablkybsjg extends AbstractCollection {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Map f23760zdlpuopuiu;

        eablkybsjg(Map map) {
            this.f23760zdlpuopuiu = (Map) xa.draadjrbmk.btonecajqb(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            iobyxmoadg().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return iobyxmoadg().containsValue(obj);
        }

        final Map iobyxmoadg() {
            return this.f23760zdlpuopuiu;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return iobyxmoadg().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return zynmafqrjb.gtknphoqwx(iobyxmoadg().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : iobyxmoadg().entrySet()) {
                    if (xa.dxjokdxxww.iobyxmoadg(obj, entry.getValue())) {
                        iobyxmoadg().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) xa.draadjrbmk.btonecajqb(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetGxszxtbevo = kegysxyocb.gxszxtbevo();
                for (Map.Entry entry : iobyxmoadg().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetGxszxtbevo.add(entry.getKey());
                    }
                }
                return iobyxmoadg().keySet().removeAll(hashSetGxszxtbevo);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) xa.draadjrbmk.btonecajqb(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetGxszxtbevo = kegysxyocb.gxszxtbevo();
                for (Map.Entry entry : iobyxmoadg().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetGxszxtbevo.add(entry.getKey());
                    }
                }
                return iobyxmoadg().keySet().retainAll(hashSetGxszxtbevo);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return iobyxmoadg().size();
        }
    }

    static abstract class gxszxtbevo extends AbstractMap {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private transient Collection f23761yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private transient Set f23762zdlpuopuiu;

        gxszxtbevo() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f23762zdlpuopuiu;
            if (set != null) {
                return set;
            }
            Set setIobyxmoadg = iobyxmoadg();
            this.f23762zdlpuopuiu = setIobyxmoadg;
            return setIobyxmoadg;
        }

        abstract Set iobyxmoadg();

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f23761yggfygwlhe;
            if (collection != null) {
                return collection;
            }
            Collection collectionZoijcleaow = zoijcleaow();
            this.f23761yggfygwlhe = collectionZoijcleaow;
            return collectionZoijcleaow;
        }

        Collection zoijcleaow() {
            return new eablkybsjg(this);
        }
    }

    class iobyxmoadg extends mbcevpiqjq {
        iobyxmoadg(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.mbcevpiqjq
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Object iobyxmoadg(Map.Entry entry) {
            return entry.getValue();
        }
    }

    static abstract class ppxfxbqfkf extends kegysxyocb.wkgbmnqykc {
        ppxfxbqfkf() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            iobyxmoadg().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        abstract Map iobyxmoadg();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return iobyxmoadg().isEmpty();
        }

        @Override // com.google.common.collect.kegysxyocb.wkgbmnqykc, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) xa.draadjrbmk.btonecajqb(collection));
            } catch (UnsupportedOperationException unused) {
                return kegysxyocb.btonecajqb(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.kegysxyocb.wkgbmnqykc, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) xa.draadjrbmk.btonecajqb(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetLqeggnwhkg = kegysxyocb.lqeggnwhkg(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetLqeggnwhkg.add(((Map.Entry) obj).getKey());
                    }
                }
                return iobyxmoadg().keySet().retainAll(hashSetLqeggnwhkg);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return iobyxmoadg().size();
        }
    }

    static class wkgbmnqykc extends kegysxyocb.wkgbmnqykc {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Map f23763zdlpuopuiu;

        wkgbmnqykc(Map map) {
            this.f23763zdlpuopuiu = (Map) xa.draadjrbmk.btonecajqb(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return iobyxmoadg().containsKey(obj);
        }

        Map iobyxmoadg() {
            return this.f23763zdlpuopuiu;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return iobyxmoadg().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return iobyxmoadg().size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class zoijcleaow implements xa.eablkybsjg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f23766zdlpuopuiu = new iobyxmoadg("KEY", 0);

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final zoijcleaow f23765yggfygwlhe = new C0408zoijcleaow("VALUE", 1);

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final /* synthetic */ zoijcleaow[] f23764jyumaefscl = iobyxmoadg();

        final enum iobyxmoadg extends zoijcleaow {
            iobyxmoadg(String str, int i13) {
                super(str, i13, null);
            }

            @Override // xa.eablkybsjg
            /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.zynmafqrjb$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        final enum C0408zoijcleaow extends zoijcleaow {
            C0408zoijcleaow(String str, int i13) {
                super(str, i13, null);
            }

            @Override // xa.eablkybsjg
            /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private zoijcleaow(String str, int i13) {
            super(str, i13);
        }

        private static /* synthetic */ zoijcleaow[] iobyxmoadg() {
            return new zoijcleaow[]{f23766zdlpuopuiu, f23765yggfygwlhe};
        }

        public static zoijcleaow valueOf(String str) {
            return (zoijcleaow) Enum.valueOf(zoijcleaow.class, str);
        }

        public static zoijcleaow[] values() {
            return (zoijcleaow[]) f23764jyumaefscl.clone();
        }

        /* synthetic */ zoijcleaow(String str, int i13, pmvmpeiblj pmvmpeibljVar) {
            this(str, i13);
        }
    }

    static xa.eablkybsjg btonecajqb() {
        return zoijcleaow.f23765yggfygwlhe;
    }

    static String dxjokdxxww(Map map) {
        StringBuilder sbZoijcleaow = dxjokdxxww.zoijcleaow(map.size());
        sbZoijcleaow.append('{');
        boolean z13 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z13) {
                sbZoijcleaow.append(", ");
            }
            sbZoijcleaow.append(entry.getKey());
            sbZoijcleaow.append('=');
            sbZoijcleaow.append(entry.getValue());
            z13 = false;
        }
        sbZoijcleaow.append('}');
        return sbZoijcleaow.toString();
    }

    public static IdentityHashMap eablkybsjg() {
        return new IdentityHashMap();
    }

    static Iterator gtknphoqwx(Iterator it) {
        return new iobyxmoadg(it);
    }

    static boolean gxszxtbevo(Map map, Object obj) {
        xa.draadjrbmk.btonecajqb(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static int iobyxmoadg(int i13) {
        if (i13 < 3) {
            nufgyqmvbu.zoijcleaow(i13, "expectedSize");
            return i13 + 1;
        }
        if (i13 < 1073741824) {
            return (int) Math.ceil(((double) i13) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static Object lqeggnwhkg(Map map, Object obj) {
        xa.draadjrbmk.btonecajqb(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object nufgyqmvbu(Map map, Object obj) {
        xa.draadjrbmk.btonecajqb(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean ppxfxbqfkf(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry wkgbmnqykc(Object obj, Object obj2) {
        return new kcexrzcfyt(obj, obj2);
    }

    static boolean zoijcleaow(Map map, Object obj) {
        return cqumvgiudr.wkgbmnqykc(gtknphoqwx(map.entrySet().iterator()), obj);
    }
}
