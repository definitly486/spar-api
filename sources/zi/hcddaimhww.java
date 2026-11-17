package zi;

/* JADX INFO: loaded from: classes3.dex */
public final class hcddaimhww extends ylkuphrtab implements fyldjkxazc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final kegysxyocb f130037cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ylkuphrtab f130038iwizpuwonk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcddaimhww(ylkuphrtab origin, kegysxyocb enhancement) {
        super(origin.eslsurpljm(), origin.krqnebusok());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(origin, "origin");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enhancement, "enhancement");
        this.f130038iwizpuwonk = origin;
        this.f130037cqumvgiudr = enhancement;
    }

    @Override // zi.ylkuphrtab
    public String a(ki.agtfadlqog renderer, ki.iwizpuwonk options) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(renderer, "renderer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(options, "options");
        return options.eablkybsjg() ? renderer.ntlheqmsrt(metgxyhuhe()) : wizcaqwiak().a(renderer, options);
    }

    @Override // zi.fyldjkxazc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ylkuphrtab wizcaqwiak() {
        return this.f130038iwizpuwonk;
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public hcddaimhww ixidwrxhsl(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        kegysxyocb kegysxyocbVarIobyxmoadg = kotlinTypeRefiner.iobyxmoadg(wizcaqwiak());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new hcddaimhww((ylkuphrtab) kegysxyocbVarIobyxmoadg, kotlinTypeRefiner.iobyxmoadg(metgxyhuhe()));
    }

    @Override // zi.grlcpdaxtj
    public grlcpdaxtj fmlbqenlif(boolean z13) {
        return ipoelvxyzq.wkgbmnqykc(wizcaqwiak().fmlbqenlif(z13), metgxyhuhe().jrbgnlbqoe().fmlbqenlif(z13));
    }

    @Override // zi.fyldjkxazc
    public kegysxyocb metgxyhuhe() {
        return this.f130037cqumvgiudr;
    }

    @Override // zi.grlcpdaxtj
    public grlcpdaxtj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return ipoelvxyzq.wkgbmnqykc(wizcaqwiak().rhgxfdycjh(newAttributes), metgxyhuhe());
    }

    @Override // zi.ylkuphrtab
    public String toString() {
        return "[@EnhancedForWarnings(" + metgxyhuhe() + ")] " + wizcaqwiak();
    }

    @Override // zi.ylkuphrtab
    public ikoacuggdj yzdjzghtvl() {
        return wizcaqwiak().yzdjzghtvl();
    }
}
