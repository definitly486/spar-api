package fm;

import gm.btonecajqb;
import gm.draadjrbmk;
import gm.dxjokdxxww;
import gm.eablkybsjg;
import gm.nufgyqmvbu;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements eablkybsjg {
    @Override // gm.eablkybsjg
    public Object btonecajqb(btonecajqb btonecajqbVar) {
        if (btonecajqbVar == dxjokdxxww.lqeggnwhkg() || btonecajqbVar == dxjokdxxww.iobyxmoadg() || btonecajqbVar == dxjokdxxww.eablkybsjg()) {
            return null;
        }
        return btonecajqbVar.iobyxmoadg(this);
    }

    @Override // gm.eablkybsjg
    public draadjrbmk lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.lqeggnwhkg(this);
        }
        if (iobyxmoadg(nufgyqmvbuVar)) {
            return nufgyqmvbuVar.dxjokdxxww();
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.eablkybsjg
    public int ojitshcjhn(nufgyqmvbu nufgyqmvbuVar) {
        return lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(agtfadlqog(nufgyqmvbuVar), nufgyqmvbuVar);
    }
}
