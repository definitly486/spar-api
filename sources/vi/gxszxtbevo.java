package vi;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends iobyxmoadg implements eablkybsjg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f116915zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(jh.lmojexxdyd module, jh.jpowsppfya notFoundClasses, ui.iobyxmoadg protocol) {
        super(protocol);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(protocol, "protocol");
        this.f116915zoijcleaow = new lqeggnwhkg(module, notFoundClasses);
    }

    @Override // vi.nufgyqmvbu
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public kh.ppxfxbqfkf iobyxmoadg(di.zoijcleaow proto, fi.ppxfxbqfkf nameResolver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        return this.f116915zoijcleaow.iobyxmoadg(proto, nameResolver);
    }

    @Override // vi.eablkybsjg
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public ni.lqeggnwhkg eablkybsjg(cllcsxoeiz container, di.agtfadlqog proto, zi.kegysxyocb expectedType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(expectedType, "expectedType");
        return null;
    }

    @Override // vi.eablkybsjg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public ni.lqeggnwhkg ppxfxbqfkf(cllcsxoeiz container, di.agtfadlqog proto, zi.kegysxyocb expectedType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(expectedType, "expectedType");
        di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf) fi.eablkybsjg.iobyxmoadg(proto, wflxmlrfwp().zoijcleaow());
        if (ppxfxbqfkfVar == null) {
            return null;
        }
        return this.f116915zoijcleaow.gxszxtbevo(expectedType, ppxfxbqfkfVar, container.zoijcleaow());
    }
}
