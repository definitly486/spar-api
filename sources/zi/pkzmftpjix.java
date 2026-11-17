package zi;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class pkzmftpjix extends ylkuphrtab implements iwizpuwonk {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f130110cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static boolean f130111esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f130112iwizpuwonk;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkzmftpjix(ikoacuggdj lowerBound, ikoacuggdj upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lowerBound, "lowerBound");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upperBound, "upperBound");
    }

    private final void c() {
        if (!f130111esjtqupxsv || this.f130112iwizpuwonk) {
            return;
        }
        this.f130112iwizpuwonk = true;
        jpowsppfya.zoijcleaow(eslsurpljm());
        jpowsppfya.zoijcleaow(krqnebusok());
        kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eslsurpljm(), krqnebusok());
        aj.eablkybsjg.f2055iobyxmoadg.zoijcleaow(eslsurpljm(), krqnebusok());
    }

    @Override // zi.ylkuphrtab
    public String a(ki.agtfadlqog renderer, ki.iwizpuwonk options) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(renderer, "renderer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(options, "options");
        if (!options.dxjokdxxww()) {
            return renderer.kegysxyocb(renderer.ntlheqmsrt(eslsurpljm()), renderer.ntlheqmsrt(krqnebusok()), ej.wkgbmnqykc.agtfadlqog(this));
        }
        return '(' + renderer.ntlheqmsrt(eslsurpljm()) + ".." + renderer.ntlheqmsrt(krqnebusok()) + ')';
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ylkuphrtab ixidwrxhsl(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        kegysxyocb kegysxyocbVarIobyxmoadg = kotlinTypeRefiner.iobyxmoadg(eslsurpljm());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        kegysxyocb kegysxyocbVarIobyxmoadg2 = kotlinTypeRefiner.iobyxmoadg(krqnebusok());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new pkzmftpjix((ikoacuggdj) kegysxyocbVarIobyxmoadg, (ikoacuggdj) kegysxyocbVarIobyxmoadg2);
    }

    @Override // zi.grlcpdaxtj
    public grlcpdaxtj fmlbqenlif(boolean z13) {
        return ntlheqmsrt.eablkybsjg(eslsurpljm().fmlbqenlif(z13), krqnebusok().fmlbqenlif(z13));
    }

    @Override // zi.iwizpuwonk
    public boolean igdgnonuha() {
        return (eslsurpljm().grlcpdaxtj().ylkuphrtab() instanceof jh.yfnezrywwk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eslsurpljm().grlcpdaxtj(), krqnebusok().grlcpdaxtj());
    }

    @Override // zi.grlcpdaxtj
    public grlcpdaxtj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return ntlheqmsrt.eablkybsjg(eslsurpljm().rhgxfdycjh(newAttributes), krqnebusok().rhgxfdycjh(newAttributes));
    }

    @Override // zi.ylkuphrtab
    public String toString() {
        return '(' + eslsurpljm() + ".." + krqnebusok() + ')';
    }

    @Override // zi.iwizpuwonk
    public kegysxyocb uawqvzlxes(kegysxyocb replacement) {
        grlcpdaxtj grlcpdaxtjVarEablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(replacement, "replacement");
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = replacement.jrbgnlbqoe();
        if (grlcpdaxtjVarJrbgnlbqoe instanceof ylkuphrtab) {
            grlcpdaxtjVarEablkybsjg = grlcpdaxtjVarJrbgnlbqoe;
        } else {
            if (!(grlcpdaxtjVarJrbgnlbqoe instanceof ikoacuggdj)) {
                throw new NoWhenBranchMatchedException();
            }
            ikoacuggdj ikoacuggdjVar = (ikoacuggdj) grlcpdaxtjVarJrbgnlbqoe;
            grlcpdaxtjVarEablkybsjg = ntlheqmsrt.eablkybsjg(ikoacuggdjVar, ikoacuggdjVar.fmlbqenlif(true));
        }
        return ipoelvxyzq.zoijcleaow(grlcpdaxtjVarEablkybsjg, grlcpdaxtjVarJrbgnlbqoe);
    }

    @Override // zi.ylkuphrtab
    public ikoacuggdj yzdjzghtvl() {
        c();
        return eslsurpljm();
    }
}
