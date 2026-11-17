package ixidwrxhsl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo extends hg.dxjokdxxww implements Map, ug.eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f49986cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f49987esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Object f49988iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private zdlpuopuiu f49989jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private fmlbqenlif.eablkybsjg f49990yggfygwlhe = new fmlbqenlif.eablkybsjg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private wkgbmnqykc f49991zdlpuopuiu;

    public gxszxtbevo(wkgbmnqykc wkgbmnqykcVar) {
        this.f49991zdlpuopuiu = wkgbmnqykcVar;
        this.f49989jyumaefscl = this.f49991zdlpuopuiu.vdvldrhtss();
        this.f49987esjtqupxsv = this.f49991zdlpuopuiu.size();
    }

    public void agtfadlqog(int i13) {
        this.f49987esjtqupxsv = i13;
        this.f49986cqumvgiudr++;
    }

    public final fmlbqenlif.eablkybsjg btonecajqb() {
        return this.f49990yggfygwlhe;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zdlpuopuiu zdlpuopuiuVarIobyxmoadg = zdlpuopuiu.f50009eablkybsjg.iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zdlpuopuiuVarIobyxmoadg, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f49989jyumaefscl = zdlpuopuiuVarIobyxmoadg;
        agtfadlqog(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f49989jyumaefscl.gtknphoqwx(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final void draadjrbmk(Object obj) {
        this.f49988iwizpuwonk = obj;
    }

    public final zdlpuopuiu dxjokdxxww() {
        return this.f49989jyumaefscl;
    }

    public wkgbmnqykc eablkybsjg() {
        wkgbmnqykc wkgbmnqykcVar;
        if (this.f49989jyumaefscl == this.f49991zdlpuopuiu.vdvldrhtss()) {
            wkgbmnqykcVar = this.f49991zdlpuopuiu;
        } else {
            this.f49990yggfygwlhe = new fmlbqenlif.eablkybsjg();
            wkgbmnqykcVar = new wkgbmnqykc(this.f49989jyumaefscl, size());
        }
        this.f49991zdlpuopuiu = wkgbmnqykcVar;
        return wkgbmnqykcVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f49989jyumaefscl.ojitshcjhn(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final void gtknphoqwx(int i13) {
        this.f49986cqumvgiudr = i13;
    }

    public final int gxszxtbevo() {
        return this.f49986cqumvgiudr;
    }

    @Override // hg.dxjokdxxww
    public Set iobyxmoadg() {
        return new nufgyqmvbu(this);
    }

    @Override // hg.dxjokdxxww
    public int ppxfxbqfkf() {
        return this.f49987esjtqupxsv;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f49988iwizpuwonk = null;
        this.f49989jyumaefscl = this.f49989jyumaefscl.cdpycssgdh(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f49988iwizpuwonk;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        wkgbmnqykc wkgbmnqykcVarEablkybsjg = map instanceof wkgbmnqykc ? (wkgbmnqykc) map : null;
        if (wkgbmnqykcVarEablkybsjg == null) {
            gxszxtbevo gxszxtbevoVar = map instanceof gxszxtbevo ? (gxszxtbevo) map : null;
            wkgbmnqykcVarEablkybsjg = gxszxtbevoVar != null ? gxszxtbevoVar.eablkybsjg() : null;
        }
        if (wkgbmnqykcVarEablkybsjg == null) {
            super.putAll(map);
            return;
        }
        fmlbqenlif.zoijcleaow zoijcleaowVar = new fmlbqenlif.zoijcleaow(0, 1, null);
        int size = size();
        zdlpuopuiu zdlpuopuiuVar = this.f49989jyumaefscl;
        zdlpuopuiu zdlpuopuiuVarVdvldrhtss = wkgbmnqykcVarEablkybsjg.vdvldrhtss();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zdlpuopuiuVarVdvldrhtss, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f49989jyumaefscl = zdlpuopuiuVar.yadqdtsiqt(zdlpuopuiuVarVdvldrhtss, 0, zoijcleaowVar, this);
        int size2 = (wkgbmnqykcVarEablkybsjg.size() + size) - zoijcleaowVar.iobyxmoadg();
        if (size != size2) {
            agtfadlqog(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f49988iwizpuwonk = null;
        zdlpuopuiu zdlpuopuiuVarLmojexxdyd = this.f49989jyumaefscl.lmojexxdyd(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (zdlpuopuiuVarLmojexxdyd == null) {
            zdlpuopuiuVarLmojexxdyd = zdlpuopuiu.f50009eablkybsjg.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zdlpuopuiuVarLmojexxdyd, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f49989jyumaefscl = zdlpuopuiuVarLmojexxdyd;
        return this.f49988iwizpuwonk;
    }

    protected final void wflxmlrfwp(fmlbqenlif.eablkybsjg eablkybsjgVar) {
        this.f49990yggfygwlhe = eablkybsjgVar;
    }

    @Override // hg.dxjokdxxww
    public Collection wkgbmnqykc() {
        return new draadjrbmk(this);
    }

    @Override // hg.dxjokdxxww
    public Set zoijcleaow() {
        return new btonecajqb(this);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        zdlpuopuiu zdlpuopuiuVarWwaezpbzkn = this.f49989jyumaefscl.wwaezpbzkn(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (zdlpuopuiuVarWwaezpbzkn == null) {
            zdlpuopuiuVarWwaezpbzkn = zdlpuopuiu.f50009eablkybsjg.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zdlpuopuiuVarWwaezpbzkn, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f49989jyumaefscl = zdlpuopuiuVarWwaezpbzkn;
        return size != size();
    }
}
