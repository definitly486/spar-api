package si;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jh.rlfsiqarku;
import zi.igdgnonuha;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public final class zdlpuopuiu implements gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Map f106765eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gg.gtknphoqwx f106766gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f106767ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wizcaqwiak f106768wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f106769zoijcleaow;

    public zdlpuopuiu(gtknphoqwx workerScope, wizcaqwiak givenSubstitutor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerScope, "workerScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(givenSubstitutor, "givenSubstitutor");
        this.f106769zoijcleaow = workerScope;
        this.f106767ppxfxbqfkf = gg.draadjrbmk.zoijcleaow(new oxmwwwfdhm(givenSubstitutor));
        igdgnonuha igdgnonuhaVarBtonecajqb = givenSubstitutor.btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(igdgnonuhaVarBtonecajqb, "getSubstitution(...)");
        this.f106768wkgbmnqykc = mi.eablkybsjg.nufgyqmvbu(igdgnonuhaVarBtonecajqb, false, 1, null).ppxfxbqfkf();
        this.f106766gxszxtbevo = gg.draadjrbmk.zoijcleaow(new kcexrzcfyt(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wizcaqwiak agtfadlqog(wizcaqwiak wizcaqwiakVar) {
        return wizcaqwiakVar.btonecajqb().ppxfxbqfkf();
    }

    private final Collection draadjrbmk(Collection collection) {
        if (this.f106768wkgbmnqykc.gtknphoqwx() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetLqeggnwhkg = jj.iobyxmoadg.lqeggnwhkg(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetLqeggnwhkg.add(wflxmlrfwp((jh.wflxmlrfwp) it.next()));
        }
        return linkedHashSetLqeggnwhkg;
    }

    private final Collection gtknphoqwx() {
        return (Collection) this.f106766gxszxtbevo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection nufgyqmvbu(zdlpuopuiu zdlpuopuiuVar) {
        return zdlpuopuiuVar.draadjrbmk(agtfadlqog.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.f106769zoijcleaow, null, null, 3, null));
    }

    private final jh.wflxmlrfwp wflxmlrfwp(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (this.f106768wkgbmnqykc.gtknphoqwx()) {
            return wflxmlrfwpVar;
        }
        if (this.f106765eablkybsjg == null) {
            this.f106765eablkybsjg = new HashMap();
        }
        Map map = this.f106765eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(map);
        Object objPpxfxbqfkf = map.get(wflxmlrfwpVar);
        if (objPpxfxbqfkf == null) {
            if (!(wflxmlrfwpVar instanceof rlfsiqarku)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + wflxmlrfwpVar).toString());
            }
            objPpxfxbqfkf = ((rlfsiqarku) wflxmlrfwpVar).ppxfxbqfkf(this.f106768wkgbmnqykc);
            if (objPpxfxbqfkf == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + wflxmlrfwpVar + " substitution fails");
            }
            map.put(wflxmlrfwpVar, objPpxfxbqfkf);
        }
        jh.wflxmlrfwp wflxmlrfwpVar2 = (jh.wflxmlrfwp) objPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return wflxmlrfwpVar2;
    }

    @Override // si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        jh.nufgyqmvbu nufgyqmvbuVarEablkybsjg = this.f106769zoijcleaow.eablkybsjg(name, location);
        if (nufgyqmvbuVarEablkybsjg != null) {
            return (jh.nufgyqmvbu) wflxmlrfwp(nufgyqmvbuVarEablkybsjg);
        }
        return null;
    }

    @Override // si.agtfadlqog
    public Collection gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return gtknphoqwx();
    }

    @Override // si.gtknphoqwx
    public Set iobyxmoadg() {
        return this.f106769zoijcleaow.iobyxmoadg();
    }

    @Override // si.gtknphoqwx
    public Set lqeggnwhkg() {
        return this.f106769zoijcleaow.lqeggnwhkg();
    }

    @Override // si.gtknphoqwx
    public Set ppxfxbqfkf() {
        return this.f106769zoijcleaow.ppxfxbqfkf();
    }

    @Override // si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return draadjrbmk(this.f106769zoijcleaow.wkgbmnqykc(name, location));
    }

    @Override // si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return draadjrbmk(this.f106769zoijcleaow.zoijcleaow(name, location));
    }
}
