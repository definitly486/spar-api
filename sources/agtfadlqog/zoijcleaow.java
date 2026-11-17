package agtfadlqog;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow implements Iterable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ppxfxbqfkf f1865yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    ppxfxbqfkf f1866zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final WeakHashMap f1864jyumaefscl = new WeakHashMap();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f1863iwizpuwonk = 0;

    private static abstract class eablkybsjg extends gxszxtbevo implements Iterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        ppxfxbqfkf f1867yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        ppxfxbqfkf f1868zdlpuopuiu;

        eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
            this.f1868zdlpuopuiu = ppxfxbqfkfVar2;
            this.f1867yggfygwlhe = ppxfxbqfkfVar;
        }

        private ppxfxbqfkf eablkybsjg() {
            ppxfxbqfkf ppxfxbqfkfVar = this.f1867yggfygwlhe;
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f1868zdlpuopuiu;
            if (ppxfxbqfkfVar == ppxfxbqfkfVar2 || ppxfxbqfkfVar2 == null) {
                return null;
            }
            return ppxfxbqfkf(ppxfxbqfkfVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1867yggfygwlhe != null;
        }

        @Override // agtfadlqog.zoijcleaow.gxszxtbevo
        public void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            if (this.f1868zdlpuopuiu == ppxfxbqfkfVar && ppxfxbqfkfVar == this.f1867yggfygwlhe) {
                this.f1867yggfygwlhe = null;
                this.f1868zdlpuopuiu = null;
            }
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f1868zdlpuopuiu;
            if (ppxfxbqfkfVar2 == ppxfxbqfkfVar) {
                this.f1868zdlpuopuiu = zoijcleaow(ppxfxbqfkfVar2);
            }
            if (this.f1867yggfygwlhe == ppxfxbqfkfVar) {
                this.f1867yggfygwlhe = eablkybsjg();
            }
        }

        abstract ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            ppxfxbqfkf ppxfxbqfkfVar = this.f1867yggfygwlhe;
            this.f1867yggfygwlhe = eablkybsjg();
            return ppxfxbqfkfVar;
        }

        abstract ppxfxbqfkf zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar);
    }

    public static abstract class gxszxtbevo {
        abstract void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar);
    }

    static class iobyxmoadg extends eablkybsjg {
        iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
            super(ppxfxbqfkfVar, ppxfxbqfkfVar2);
        }

        @Override // agtfadlqog.zoijcleaow.eablkybsjg
        ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkfVar.f1870jyumaefscl;
        }

        @Override // agtfadlqog.zoijcleaow.eablkybsjg
        ppxfxbqfkf zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkfVar.f1869iwizpuwonk;
        }
    }

    static class ppxfxbqfkf implements Map.Entry {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        ppxfxbqfkf f1869iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        ppxfxbqfkf f1870jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final Object f1871yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Object f1872zdlpuopuiu;

        ppxfxbqfkf(Object obj, Object obj2) {
            this.f1872zdlpuopuiu = obj;
            this.f1871yggfygwlhe = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f1872zdlpuopuiu.equals(ppxfxbqfkfVar.f1872zdlpuopuiu) && this.f1871yggfygwlhe.equals(ppxfxbqfkfVar.f1871yggfygwlhe);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f1872zdlpuopuiu;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f1871yggfygwlhe;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1872zdlpuopuiu.hashCode() ^ this.f1871yggfygwlhe.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1872zdlpuopuiu + "=" + this.f1871yggfygwlhe;
        }
    }

    public class wkgbmnqykc extends gxszxtbevo implements Iterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f1874yggfygwlhe = true;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private ppxfxbqfkf f1875zdlpuopuiu;

        wkgbmnqykc() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1874yggfygwlhe) {
                return zoijcleaow.this.f1866zdlpuopuiu != null;
            }
            ppxfxbqfkf ppxfxbqfkfVar = this.f1875zdlpuopuiu;
            return (ppxfxbqfkfVar == null || ppxfxbqfkfVar.f1870jyumaefscl == null) ? false : true;
        }

        @Override // agtfadlqog.zoijcleaow.gxszxtbevo
        void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f1875zdlpuopuiu;
            if (ppxfxbqfkfVar == ppxfxbqfkfVar2) {
                ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkfVar2.f1869iwizpuwonk;
                this.f1875zdlpuopuiu = ppxfxbqfkfVar3;
                this.f1874yggfygwlhe = ppxfxbqfkfVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f1874yggfygwlhe) {
                this.f1874yggfygwlhe = false;
                this.f1875zdlpuopuiu = zoijcleaow.this.f1866zdlpuopuiu;
            } else {
                ppxfxbqfkf ppxfxbqfkfVar = this.f1875zdlpuopuiu;
                this.f1875zdlpuopuiu = ppxfxbqfkfVar != null ? ppxfxbqfkfVar.f1870jyumaefscl : null;
            }
            return this.f1875zdlpuopuiu;
        }
    }

    /* JADX INFO: renamed from: agtfadlqog.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static class C0040zoijcleaow extends eablkybsjg {
        C0040zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
            super(ppxfxbqfkfVar, ppxfxbqfkfVar2);
        }

        @Override // agtfadlqog.zoijcleaow.eablkybsjg
        ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkfVar.f1869iwizpuwonk;
        }

        @Override // agtfadlqog.zoijcleaow.eablkybsjg
        ppxfxbqfkf zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkfVar.f1870jyumaefscl;
        }
    }

    public Iterator descendingIterator() {
        C0040zoijcleaow c0040zoijcleaow = new C0040zoijcleaow(this.f1865yggfygwlhe, this.f1866zdlpuopuiu);
        this.f1864jyumaefscl.put(c0040zoijcleaow, Boolean.FALSE);
        return c0040zoijcleaow;
    }

    public Object dxjokdxxww(Object obj) {
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaow(obj);
        if (ppxfxbqfkfVarZoijcleaow == null) {
            return null;
        }
        this.f1863iwizpuwonk--;
        if (!this.f1864jyumaefscl.isEmpty()) {
            Iterator it = this.f1864jyumaefscl.keySet().iterator();
            while (it.hasNext()) {
                ((gxszxtbevo) it.next()).iobyxmoadg(ppxfxbqfkfVarZoijcleaow);
            }
        }
        ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkfVarZoijcleaow.f1869iwizpuwonk;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.f1870jyumaefscl = ppxfxbqfkfVarZoijcleaow.f1870jyumaefscl;
        } else {
            this.f1866zdlpuopuiu = ppxfxbqfkfVarZoijcleaow.f1870jyumaefscl;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVarZoijcleaow.f1870jyumaefscl;
        if (ppxfxbqfkfVar2 != null) {
            ppxfxbqfkfVar2.f1869iwizpuwonk = ppxfxbqfkfVar;
        } else {
            this.f1865yggfygwlhe = ppxfxbqfkfVar;
        }
        ppxfxbqfkfVarZoijcleaow.f1870jyumaefscl = null;
        ppxfxbqfkfVarZoijcleaow.f1869iwizpuwonk = null;
        return ppxfxbqfkfVarZoijcleaow.f1871yggfygwlhe;
    }

    ppxfxbqfkf eablkybsjg(Object obj, Object obj2) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(obj, obj2);
        this.f1863iwizpuwonk++;
        ppxfxbqfkf ppxfxbqfkfVar2 = this.f1865yggfygwlhe;
        if (ppxfxbqfkfVar2 == null) {
            this.f1866zdlpuopuiu = ppxfxbqfkfVar;
            this.f1865yggfygwlhe = ppxfxbqfkfVar;
            return ppxfxbqfkfVar;
        }
        ppxfxbqfkfVar2.f1870jyumaefscl = ppxfxbqfkfVar;
        ppxfxbqfkfVar.f1869iwizpuwonk = ppxfxbqfkfVar2;
        this.f1865yggfygwlhe = ppxfxbqfkfVar;
        return ppxfxbqfkfVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        if (size() != zoijcleaowVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = zoijcleaowVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Object gxszxtbevo(Object obj, Object obj2) {
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaow(obj);
        if (ppxfxbqfkfVarZoijcleaow != null) {
            return ppxfxbqfkfVarZoijcleaow.f1871yggfygwlhe;
        }
        eablkybsjg(obj, obj2);
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Map.Entry iobyxmoadg() {
        return this.f1866zdlpuopuiu;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f1866zdlpuopuiu, this.f1865yggfygwlhe);
        this.f1864jyumaefscl.put(iobyxmoadgVar, Boolean.FALSE);
        return iobyxmoadgVar;
    }

    public wkgbmnqykc ppxfxbqfkf() {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        this.f1864jyumaefscl.put(wkgbmnqykcVar, Boolean.FALSE);
        return wkgbmnqykcVar;
    }

    public int size() {
        return this.f1863iwizpuwonk;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb3.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    public Map.Entry wkgbmnqykc() {
        return this.f1865yggfygwlhe;
    }

    protected ppxfxbqfkf zoijcleaow(Object obj) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f1866zdlpuopuiu;
        while (ppxfxbqfkfVar != null && !ppxfxbqfkfVar.f1872zdlpuopuiu.equals(obj)) {
            ppxfxbqfkfVar = ppxfxbqfkfVar.f1870jyumaefscl;
        }
        return ppxfxbqfkfVar;
    }
}
