package ph;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends nufgyqmvbu implements zh.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Annotation f76570ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(ii.gxszxtbevo gxszxtbevoVar, Annotation annotation) {
        super(gxszxtbevoVar, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotation, "annotation");
        this.f76570ppxfxbqfkf = annotation;
    }

    @Override // zh.ppxfxbqfkf
    public zh.iobyxmoadg iobyxmoadg() {
        return new lqeggnwhkg(this.f76570ppxfxbqfkf);
    }
}
