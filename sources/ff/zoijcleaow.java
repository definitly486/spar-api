package ff;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import lm.gxszxtbevo;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cqumvgiudr f33543iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f33544zoijcleaow;

    public zoijcleaow(cqumvgiudr contentType, eablkybsjg serializer) {
        zdlpuopuiu.btonecajqb(contentType, "contentType");
        zdlpuopuiu.btonecajqb(serializer, "serializer");
        this.f33543iobyxmoadg = contentType;
        this.f33544zoijcleaow = serializer;
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public gxszxtbevo ppxfxbqfkf(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, lm.zdlpuopuiu retrofit) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(parameterAnnotations, "parameterAnnotations");
        zdlpuopuiu.btonecajqb(methodAnnotations, "methodAnnotations");
        zdlpuopuiu.btonecajqb(retrofit, "retrofit");
        return new wkgbmnqykc(this.f33543iobyxmoadg, this.f33544zoijcleaow.ppxfxbqfkf(type), this.f33544zoijcleaow);
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public gxszxtbevo wkgbmnqykc(Type type, Annotation[] annotations, lm.zdlpuopuiu retrofit) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(annotations, "annotations");
        zdlpuopuiu.btonecajqb(retrofit, "retrofit");
        return new iobyxmoadg(this.f33544zoijcleaow.ppxfxbqfkf(type), this.f33544zoijcleaow);
    }
}
