package si;

import hg.ikoacuggdj;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jh.istkbnxepw;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements gtknphoqwx {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f106770wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx[] f106771ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f106772zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gtknphoqwx iobyxmoadg(String debugName, Iterable scopes) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugName, "debugName");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scopes, "scopes");
            jj.gtknphoqwx gtknphoqwxVar = new jj.gtknphoqwx();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                gtknphoqwx gtknphoqwxVar2 = (gtknphoqwx) it.next();
                if (gtknphoqwxVar2 != gtknphoqwx.zoijcleaow.f106714zoijcleaow) {
                    if (gtknphoqwxVar2 instanceof zoijcleaow) {
                        hg.jyumaefscl.cdpycssgdh(gtknphoqwxVar, ((zoijcleaow) gtknphoqwxVar2).f106771ppxfxbqfkf);
                    } else {
                        gtknphoqwxVar.add(gtknphoqwxVar2);
                    }
                }
            }
            return zoijcleaow(debugName, gtknphoqwxVar);
        }

        public final gtknphoqwx zoijcleaow(String debugName, List scopes) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugName, "debugName");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scopes, "scopes");
            int size = scopes.size();
            if (size != 0) {
                return size != 1 ? new zoijcleaow(debugName, (gtknphoqwx[]) scopes.toArray(new gtknphoqwx[0]), null) : (gtknphoqwx) scopes.get(0);
            }
            return gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ zoijcleaow(String str, gtknphoqwx[] gtknphoqwxVarArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, gtknphoqwxVarArr);
    }

    @Override // si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        jh.nufgyqmvbu nufgyqmvbuVar = null;
        for (gtknphoqwx gtknphoqwxVar : this.f106771ppxfxbqfkf) {
            jh.nufgyqmvbu nufgyqmvbuVarEablkybsjg = gtknphoqwxVar.eablkybsjg(name, location);
            if (nufgyqmvbuVarEablkybsjg != null) {
                if (!(nufgyqmvbuVarEablkybsjg instanceof jh.dxjokdxxww) || !((istkbnxepw) nufgyqmvbuVarEablkybsjg).czzsidtyhn()) {
                    return nufgyqmvbuVarEablkybsjg;
                }
                if (nufgyqmvbuVar == null) {
                    nufgyqmvbuVar = nufgyqmvbuVarEablkybsjg;
                }
            }
        }
        return nufgyqmvbuVar;
    }

    @Override // si.agtfadlqog
    public Collection gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        gtknphoqwx[] gtknphoqwxVarArr = this.f106771ppxfxbqfkf;
        int length = gtknphoqwxVarArr.length;
        if (length == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        if (length == 1) {
            return gtknphoqwxVarArr[0].gxszxtbevo(kindFilter, nameFilter);
        }
        Collection collectionIobyxmoadg = null;
        for (gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArr) {
            collectionIobyxmoadg = ij.iobyxmoadg.iobyxmoadg(collectionIobyxmoadg, gtknphoqwxVar.gxszxtbevo(kindFilter, nameFilter));
        }
        return collectionIobyxmoadg == null ? ikoacuggdj.eablkybsjg() : collectionIobyxmoadg;
    }

    @Override // si.gtknphoqwx
    public Set iobyxmoadg() {
        gtknphoqwx[] gtknphoqwxVarArr = this.f106771ppxfxbqfkf;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArr) {
            hg.jyumaefscl.istkbnxepw(linkedHashSet, gtknphoqwxVar.iobyxmoadg());
        }
        return linkedHashSet;
    }

    @Override // si.gtknphoqwx
    public Set lqeggnwhkg() {
        return wflxmlrfwp.iobyxmoadg(hg.agtfadlqog.crxdokpmqz(this.f106771ppxfxbqfkf));
    }

    @Override // si.gtknphoqwx
    public Set ppxfxbqfkf() {
        gtknphoqwx[] gtknphoqwxVarArr = this.f106771ppxfxbqfkf;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArr) {
            hg.jyumaefscl.istkbnxepw(linkedHashSet, gtknphoqwxVar.ppxfxbqfkf());
        }
        return linkedHashSet;
    }

    public String toString() {
        return this.f106772zoijcleaow;
    }

    @Override // si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        gtknphoqwx[] gtknphoqwxVarArr = this.f106771ppxfxbqfkf;
        int length = gtknphoqwxVarArr.length;
        if (length == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        if (length == 1) {
            return gtknphoqwxVarArr[0].wkgbmnqykc(name, location);
        }
        Collection collectionIobyxmoadg = null;
        for (gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArr) {
            collectionIobyxmoadg = ij.iobyxmoadg.iobyxmoadg(collectionIobyxmoadg, gtknphoqwxVar.wkgbmnqykc(name, location));
        }
        return collectionIobyxmoadg == null ? ikoacuggdj.eablkybsjg() : collectionIobyxmoadg;
    }

    @Override // si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        gtknphoqwx[] gtknphoqwxVarArr = this.f106771ppxfxbqfkf;
        int length = gtknphoqwxVarArr.length;
        if (length == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        if (length == 1) {
            return gtknphoqwxVarArr[0].zoijcleaow(name, location);
        }
        Collection collectionIobyxmoadg = null;
        for (gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArr) {
            collectionIobyxmoadg = ij.iobyxmoadg.iobyxmoadg(collectionIobyxmoadg, gtknphoqwxVar.zoijcleaow(name, location));
        }
        return collectionIobyxmoadg == null ? ikoacuggdj.eablkybsjg() : collectionIobyxmoadg;
    }

    private zoijcleaow(String str, gtknphoqwx[] gtknphoqwxVarArr) {
        this.f106772zoijcleaow = str;
        this.f106771ppxfxbqfkf = gtknphoqwxVarArr;
    }
}
