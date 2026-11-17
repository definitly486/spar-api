package ai;

import zi.ageimvtcrz;
import zi.grlcpdaxtj;
import zi.ipoelvxyzq;
import zi.opjhrmiecq;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends zi.pmvmpeiblj implements zi.ribwqtqdhb {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zi.ikoacuggdj f1913yggfygwlhe;

    public btonecajqb(zi.ikoacuggdj delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f1913yggfygwlhe = delegate;
    }

    private final zi.ikoacuggdj c(zi.ikoacuggdj ikoacuggdjVar) {
        zi.ikoacuggdj ikoacuggdjVarFmlbqenlif = ikoacuggdjVar.fmlbqenlif(false);
        return !ej.wkgbmnqykc.esjtqupxsv(ikoacuggdjVar) ? ikoacuggdjVarFmlbqenlif : new btonecajqb(ikoacuggdjVarFmlbqenlif);
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public btonecajqb rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return new btonecajqb(krqnebusok().rhgxfdycjh(newAttributes));
    }

    @Override // zi.pmvmpeiblj
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public btonecajqb b(zi.ikoacuggdj delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        return new btonecajqb(delegate);
    }

    @Override // zi.iwizpuwonk
    public boolean igdgnonuha() {
        return true;
    }

    @Override // zi.pmvmpeiblj
    protected zi.ikoacuggdj krqnebusok() {
        return this.f1913yggfygwlhe;
    }

    @Override // zi.pmvmpeiblj, zi.kegysxyocb
    public boolean mhtqkkgtqm() {
        return false;
    }

    @Override // zi.iwizpuwonk
    public zi.kegysxyocb uawqvzlxes(zi.kegysxyocb replacement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(replacement, "replacement");
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = replacement.jrbgnlbqoe();
        if (!ej.wkgbmnqykc.esjtqupxsv(grlcpdaxtjVarJrbgnlbqoe) && !ageimvtcrz.draadjrbmk(grlcpdaxtjVarJrbgnlbqoe)) {
            return grlcpdaxtjVarJrbgnlbqoe;
        }
        if (grlcpdaxtjVarJrbgnlbqoe instanceof zi.ikoacuggdj) {
            return c((zi.ikoacuggdj) grlcpdaxtjVarJrbgnlbqoe);
        }
        if (grlcpdaxtjVarJrbgnlbqoe instanceof zi.ylkuphrtab) {
            zi.ylkuphrtab ylkuphrtabVar = (zi.ylkuphrtab) grlcpdaxtjVarJrbgnlbqoe;
            return ipoelvxyzq.wkgbmnqykc(zi.ntlheqmsrt.eablkybsjg(c(ylkuphrtabVar.eslsurpljm()), c(ylkuphrtabVar.krqnebusok())), ipoelvxyzq.iobyxmoadg(grlcpdaxtjVarJrbgnlbqoe));
        }
        throw new IllegalStateException(("Incorrect type: " + grlcpdaxtjVarJrbgnlbqoe).toString());
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: yzdjzghtvl */
    public zi.ikoacuggdj fmlbqenlif(boolean z13) {
        return z13 ? krqnebusok().fmlbqenlif(true) : this;
    }
}
