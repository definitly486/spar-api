package kh;

import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class ojitshcjhn implements nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f55416zdlpuopuiu;

    public ojitshcjhn(List delegates) {
        zdlpuopuiu.btonecajqb(delegates, "delegates");
        this.f55416zdlpuopuiu = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf ppxfxbqfkf(ii.ppxfxbqfkf ppxfxbqfkfVar, nufgyqmvbu it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.lqeggnwhkg(ppxfxbqfkfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj.btonecajqb wkgbmnqykc(nufgyqmvbu it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return jyumaefscl.ikoacuggdj(it);
    }

    @Override // kh.nufgyqmvbu
    public boolean isEmpty() {
        List list = this.f55416zdlpuopuiu;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((nufgyqmvbu) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return lj.wflxmlrfwp.wwaezpbzkn(jyumaefscl.ikoacuggdj(this.f55416zdlpuopuiu), agtfadlqog.f55387zdlpuopuiu).iterator();
    }

    @Override // kh.nufgyqmvbu
    public ppxfxbqfkf lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        return (ppxfxbqfkf) lj.wflxmlrfwp.lmojexxdyd(lj.wflxmlrfwp.stevsuqkhv(jyumaefscl.ikoacuggdj(this.f55416zdlpuopuiu), new wflxmlrfwp(fqName)));
    }

    @Override // kh.nufgyqmvbu
    public boolean wizcaqwiak(ii.ppxfxbqfkf fqName) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        Iterator it = jyumaefscl.ikoacuggdj(this.f55416zdlpuopuiu).iterator();
        while (it.hasNext()) {
            if (((nufgyqmvbu) it.next()).wizcaqwiak(fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ojitshcjhn(nufgyqmvbu... delegates) {
        this(hg.agtfadlqog.i(delegates));
        zdlpuopuiu.btonecajqb(delegates, "delegates");
    }
}
