package zi;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends pmvmpeiblj {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ikoacuggdj f130045jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ikoacuggdj f130046yggfygwlhe;

    public iobyxmoadg(ikoacuggdj delegate, ikoacuggdj abbreviation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(abbreviation, "abbreviation");
        this.f130046yggfygwlhe = delegate;
        this.f130045jyumaefscl = abbreviation;
    }

    public final ikoacuggdj c() {
        return this.f130045jyumaefscl;
    }

    @Override // zi.ikoacuggdj
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg fmlbqenlif(boolean z13) {
        return new iobyxmoadg(krqnebusok().fmlbqenlif(z13), this.f130045jyumaefscl.fmlbqenlif(z13));
    }

    @Override // zi.pmvmpeiblj, zi.kegysxyocb
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public iobyxmoadg ixidwrxhsl(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        kegysxyocb kegysxyocbVarIobyxmoadg = kotlinTypeRefiner.iobyxmoadg(krqnebusok());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        kegysxyocb kegysxyocbVarIobyxmoadg2 = kotlinTypeRefiner.iobyxmoadg(this.f130045jyumaefscl);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new iobyxmoadg((ikoacuggdj) kegysxyocbVarIobyxmoadg, (ikoacuggdj) kegysxyocbVarIobyxmoadg2);
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: eslsurpljm */
    public ikoacuggdj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return new iobyxmoadg(krqnebusok().rhgxfdycjh(newAttributes), this.f130045jyumaefscl);
    }

    @Override // zi.pmvmpeiblj
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg b(ikoacuggdj delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        return new iobyxmoadg(delegate, this.f130045jyumaefscl);
    }

    @Override // zi.pmvmpeiblj
    protected ikoacuggdj krqnebusok() {
        return this.f130046yggfygwlhe;
    }

    public final ikoacuggdj lmojexxdyd() {
        return krqnebusok();
    }
}
