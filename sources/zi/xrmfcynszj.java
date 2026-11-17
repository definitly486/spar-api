package zi;

/* JADX INFO: loaded from: classes3.dex */
public final class xrmfcynszj extends pmvmpeiblj implements fyldjkxazc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kegysxyocb f130155jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ikoacuggdj f130156yggfygwlhe;

    public xrmfcynszj(ikoacuggdj delegate, kegysxyocb enhancement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enhancement, "enhancement");
        this.f130156yggfygwlhe = delegate;
        this.f130155jyumaefscl = enhancement;
    }

    @Override // zi.fyldjkxazc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ikoacuggdj wizcaqwiak() {
        return krqnebusok();
    }

    @Override // zi.pmvmpeiblj, zi.kegysxyocb
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public xrmfcynszj ixidwrxhsl(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        kegysxyocb kegysxyocbVarIobyxmoadg = kotlinTypeRefiner.iobyxmoadg(krqnebusok());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new xrmfcynszj((ikoacuggdj) kegysxyocbVarIobyxmoadg, kotlinTypeRefiner.iobyxmoadg(metgxyhuhe()));
    }

    @Override // zi.pmvmpeiblj
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xrmfcynszj b(ikoacuggdj delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        return new xrmfcynszj(delegate, metgxyhuhe());
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: eslsurpljm */
    public ikoacuggdj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        grlcpdaxtj grlcpdaxtjVarWkgbmnqykc = ipoelvxyzq.wkgbmnqykc(wizcaqwiak().rhgxfdycjh(newAttributes), metgxyhuhe());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(grlcpdaxtjVarWkgbmnqykc, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (ikoacuggdj) grlcpdaxtjVarWkgbmnqykc;
    }

    @Override // zi.pmvmpeiblj
    protected ikoacuggdj krqnebusok() {
        return this.f130156yggfygwlhe;
    }

    @Override // zi.fyldjkxazc
    public kegysxyocb metgxyhuhe() {
        return this.f130155jyumaefscl;
    }

    @Override // zi.ikoacuggdj
    public String toString() {
        return "[@EnhancedForWarnings(" + metgxyhuhe() + ")] " + wizcaqwiak();
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: yzdjzghtvl */
    public ikoacuggdj fmlbqenlif(boolean z13) {
        grlcpdaxtj grlcpdaxtjVarWkgbmnqykc = ipoelvxyzq.wkgbmnqykc(wizcaqwiak().fmlbqenlif(z13), metgxyhuhe().jrbgnlbqoe().fmlbqenlif(z13));
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(grlcpdaxtjVarWkgbmnqykc, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (ikoacuggdj) grlcpdaxtjVarWkgbmnqykc;
    }
}
