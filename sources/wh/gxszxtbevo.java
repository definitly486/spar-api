package wh;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo implements si.gtknphoqwx {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f119775gxszxtbevo = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gxszxtbevo.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.dxjokdxxww f119776eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cdpycssgdh f119777ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lmojexxdyd f119778wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vh.gtknphoqwx f119779zoijcleaow;

    public gxszxtbevo(vh.gtknphoqwx c13, zh.yggfygwlhe jPackage, cdpycssgdh packageFragment) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jPackage, "jPackage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageFragment, "packageFragment");
        this.f119779zoijcleaow = c13;
        this.f119777ppxfxbqfkf = packageFragment;
        this.f119778wkgbmnqykc = new lmojexxdyd(c13, jPackage, packageFragment);
        this.f119776eablkybsjg = c13.eablkybsjg().wkgbmnqykc(new eablkybsjg(this));
    }

    private final si.gtknphoqwx[] btonecajqb() {
        return (si.gtknphoqwx[]) yi.wflxmlrfwp.iobyxmoadg(this.f119776eablkybsjg, this, f119775gxszxtbevo[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final si.gtknphoqwx[] gtknphoqwx(gxszxtbevo gxszxtbevoVar) {
        Collection collectionValues = gxszxtbevoVar.f119777ppxfxbqfkf.mhtqkkgtqm().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            si.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = gxszxtbevoVar.f119779zoijcleaow.iobyxmoadg().zoijcleaow().ppxfxbqfkf(gxszxtbevoVar.f119777ppxfxbqfkf, (bi.cqumvgiudr) it.next());
            if (gtknphoqwxVarPpxfxbqfkf != null) {
                arrayList.add(gtknphoqwxVarPpxfxbqfkf);
            }
        }
        return (si.gtknphoqwx[]) ij.iobyxmoadg.zoijcleaow(arrayList).toArray(new si.gtknphoqwx[0]);
    }

    public void draadjrbmk(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        qh.iobyxmoadg.zoijcleaow(this.f119779zoijcleaow.iobyxmoadg().draadjrbmk(), location, this.f119777ppxfxbqfkf, name);
    }

    public final lmojexxdyd dxjokdxxww() {
        return this.f119778wkgbmnqykc;
    }

    @Override // si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        draadjrbmk(name, location);
        jh.eablkybsjg eablkybsjgVarEablkybsjg = this.f119778wkgbmnqykc.eablkybsjg(name, location);
        if (eablkybsjgVarEablkybsjg != null) {
            return eablkybsjgVarEablkybsjg;
        }
        jh.nufgyqmvbu nufgyqmvbuVar = null;
        for (si.gtknphoqwx gtknphoqwxVar : btonecajqb()) {
            jh.nufgyqmvbu nufgyqmvbuVarEablkybsjg = gtknphoqwxVar.eablkybsjg(name, location);
            if (nufgyqmvbuVarEablkybsjg != null) {
                if (!(nufgyqmvbuVarEablkybsjg instanceof jh.dxjokdxxww) || !((jh.istkbnxepw) nufgyqmvbuVarEablkybsjg).czzsidtyhn()) {
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
    public Collection gxszxtbevo(si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        lmojexxdyd lmojexxdydVar = this.f119778wkgbmnqykc;
        si.gtknphoqwx[] gtknphoqwxVarArrBtonecajqb = btonecajqb();
        Collection collectionGxszxtbevo = lmojexxdydVar.gxszxtbevo(kindFilter, nameFilter);
        for (si.gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArrBtonecajqb) {
            collectionGxszxtbevo = ij.iobyxmoadg.iobyxmoadg(collectionGxszxtbevo, gtknphoqwxVar.gxszxtbevo(kindFilter, nameFilter));
        }
        return collectionGxszxtbevo == null ? ikoacuggdj.eablkybsjg() : collectionGxszxtbevo;
    }

    @Override // si.gtknphoqwx
    public Set iobyxmoadg() {
        si.gtknphoqwx[] gtknphoqwxVarArrBtonecajqb = btonecajqb();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (si.gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArrBtonecajqb) {
            hg.jyumaefscl.istkbnxepw(linkedHashSet, gtknphoqwxVar.iobyxmoadg());
        }
        linkedHashSet.addAll(this.f119778wkgbmnqykc.iobyxmoadg());
        return linkedHashSet;
    }

    @Override // si.gtknphoqwx
    public Set lqeggnwhkg() {
        Set setIobyxmoadg = si.wflxmlrfwp.iobyxmoadg(hg.agtfadlqog.crxdokpmqz(btonecajqb()));
        if (setIobyxmoadg == null) {
            return null;
        }
        setIobyxmoadg.addAll(this.f119778wkgbmnqykc.lqeggnwhkg());
        return setIobyxmoadg;
    }

    @Override // si.gtknphoqwx
    public Set ppxfxbqfkf() {
        si.gtknphoqwx[] gtknphoqwxVarArrBtonecajqb = btonecajqb();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (si.gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArrBtonecajqb) {
            hg.jyumaefscl.istkbnxepw(linkedHashSet, gtknphoqwxVar.ppxfxbqfkf());
        }
        linkedHashSet.addAll(this.f119778wkgbmnqykc.ppxfxbqfkf());
        return linkedHashSet;
    }

    public String toString() {
        return "scope for " + this.f119777ppxfxbqfkf;
    }

    @Override // si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        draadjrbmk(name, location);
        lmojexxdyd lmojexxdydVar = this.f119778wkgbmnqykc;
        si.gtknphoqwx[] gtknphoqwxVarArrBtonecajqb = btonecajqb();
        Collection collectionWkgbmnqykc = lmojexxdydVar.wkgbmnqykc(name, location);
        for (si.gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArrBtonecajqb) {
            collectionWkgbmnqykc = ij.iobyxmoadg.iobyxmoadg(collectionWkgbmnqykc, gtknphoqwxVar.wkgbmnqykc(name, location));
        }
        return collectionWkgbmnqykc == null ? ikoacuggdj.eablkybsjg() : collectionWkgbmnqykc;
    }

    @Override // si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        draadjrbmk(name, location);
        lmojexxdyd lmojexxdydVar = this.f119778wkgbmnqykc;
        si.gtknphoqwx[] gtknphoqwxVarArrBtonecajqb = btonecajqb();
        Collection collectionZoijcleaow = lmojexxdydVar.zoijcleaow(name, location);
        for (si.gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArrBtonecajqb) {
            collectionZoijcleaow = ij.iobyxmoadg.iobyxmoadg(collectionZoijcleaow, gtknphoqwxVar.zoijcleaow(name, location));
        }
        return collectionZoijcleaow == null ? ikoacuggdj.eablkybsjg() : collectionZoijcleaow;
    }
}
