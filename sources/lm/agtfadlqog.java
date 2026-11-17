package lm;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import lk.yadqdtsiqt;

/* JADX INFO: loaded from: classes3.dex */
final class agtfadlqog extends gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final gxszxtbevo.iobyxmoadg f63407iobyxmoadg = new agtfadlqog();

    static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final gxszxtbevo f63408iobyxmoadg;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            this.f63408iobyxmoadg = gxszxtbevoVar;
        }

        @Override // lm.gxszxtbevo
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Optional convert(yadqdtsiqt yadqdtsiqtVar) {
            return Optional.ofNullable(this.f63408iobyxmoadg.convert(yadqdtsiqtVar));
        }
    }

    agtfadlqog() {
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public gxszxtbevo wkgbmnqykc(Type type, Annotation[] annotationArr, zdlpuopuiu zdlpuopuiuVar) {
        if (gxszxtbevo.iobyxmoadg.zoijcleaow(type) != Optional.class) {
            return null;
        }
        return new iobyxmoadg(zdlpuopuiuVar.nufgyqmvbu(gxszxtbevo.iobyxmoadg.iobyxmoadg(0, (ParameterizedType) type), annotationArr));
    }
}
