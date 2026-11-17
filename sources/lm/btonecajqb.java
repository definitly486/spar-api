package lm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import lk.cdpycssgdh;

/* JADX INFO: loaded from: classes3.dex */
abstract class btonecajqb extends yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f63409iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f63410ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lk.eablkybsjg.iobyxmoadg f63411zoijcleaow;

    static final class iobyxmoadg extends btonecajqb {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final lm.ppxfxbqfkf f63412wkgbmnqykc;

        iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar, lk.eablkybsjg.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar, lm.ppxfxbqfkf ppxfxbqfkfVar) {
            super(oxmwwwfdhmVar, iobyxmoadgVar, gxszxtbevoVar);
            this.f63412wkgbmnqykc = ppxfxbqfkfVar;
        }

        @Override // lm.btonecajqb
        protected Object ppxfxbqfkf(lm.zoijcleaow zoijcleaowVar, Object[] objArr) {
            return this.f63412wkgbmnqykc.zoijcleaow(zoijcleaowVar);
        }
    }

    static final class ppxfxbqfkf extends btonecajqb {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final lm.ppxfxbqfkf f63413wkgbmnqykc;

        ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar, lk.eablkybsjg.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar, lm.ppxfxbqfkf ppxfxbqfkfVar) {
            super(oxmwwwfdhmVar, iobyxmoadgVar, gxszxtbevoVar);
            this.f63413wkgbmnqykc = ppxfxbqfkfVar;
        }

        @Override // lm.btonecajqb
        protected Object ppxfxbqfkf(lm.zoijcleaow zoijcleaowVar, Object[] objArr) {
            lm.zoijcleaow zoijcleaowVar2 = (lm.zoijcleaow) this.f63413wkgbmnqykc.zoijcleaow(zoijcleaowVar);
            lg.gxszxtbevo gxszxtbevoVar = (lg.gxszxtbevo) objArr[objArr.length - 1];
            try {
                return draadjrbmk.ppxfxbqfkf(zoijcleaowVar2, gxszxtbevoVar);
            } catch (Exception e13) {
                return draadjrbmk.wkgbmnqykc(e13, gxszxtbevoVar);
            }
        }
    }

    static final class zoijcleaow extends btonecajqb {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f63414eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final lm.ppxfxbqfkf f63415wkgbmnqykc;

        zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar, lk.eablkybsjg.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar, lm.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
            super(oxmwwwfdhmVar, iobyxmoadgVar, gxszxtbevoVar);
            this.f63415wkgbmnqykc = ppxfxbqfkfVar;
            this.f63414eablkybsjg = z13;
        }

        @Override // lm.btonecajqb
        protected Object ppxfxbqfkf(lm.zoijcleaow zoijcleaowVar, Object[] objArr) {
            lm.zoijcleaow zoijcleaowVar2 = (lm.zoijcleaow) this.f63415wkgbmnqykc.zoijcleaow(zoijcleaowVar);
            lg.gxszxtbevo gxszxtbevoVar = (lg.gxszxtbevo) objArr[objArr.length - 1];
            try {
                return this.f63414eablkybsjg ? draadjrbmk.zoijcleaow(zoijcleaowVar2, gxszxtbevoVar) : draadjrbmk.iobyxmoadg(zoijcleaowVar2, gxszxtbevoVar);
            } catch (Exception e13) {
                return draadjrbmk.wkgbmnqykc(e13, gxszxtbevoVar);
            }
        }
    }

    btonecajqb(oxmwwwfdhm oxmwwwfdhmVar, lk.eablkybsjg.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        this.f63409iobyxmoadg = oxmwwwfdhmVar;
        this.f63411zoijcleaow = iobyxmoadgVar;
        this.f63410ppxfxbqfkf = gxszxtbevoVar;
    }

    private static gxszxtbevo eablkybsjg(zdlpuopuiu zdlpuopuiuVar, Method method, Type type) {
        try {
            return zdlpuopuiuVar.nufgyqmvbu(type, method.getAnnotations());
        } catch (RuntimeException e13) {
            throw cqumvgiudr.agtfadlqog(method, e13, "Unable to create converter for %s", type);
        }
    }

    static btonecajqb gxszxtbevo(zdlpuopuiu zdlpuopuiuVar, Method method, oxmwwwfdhm oxmwwwfdhmVar) {
        Type genericReturnType;
        boolean z13;
        boolean z14 = oxmwwwfdhmVar.f63517gtknphoqwx;
        Annotation[] annotations = method.getAnnotations();
        if (z14) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeGxszxtbevo = cqumvgiudr.gxszxtbevo(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (cqumvgiudr.nufgyqmvbu(typeGxszxtbevo) == kcexrzcfyt.class && (typeGxszxtbevo instanceof ParameterizedType)) {
                typeGxszxtbevo = cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) typeGxszxtbevo);
                z13 = true;
            } else {
                z13 = false;
            }
            genericReturnType = new cqumvgiudr.zoijcleaow(null, lm.zoijcleaow.class, typeGxszxtbevo);
            annotations = iwizpuwonk.iobyxmoadg(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z13 = false;
        }
        lm.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = wkgbmnqykc(zdlpuopuiuVar, method, genericReturnType, annotations);
        Type typeIobyxmoadg = ppxfxbqfkfVarWkgbmnqykc.iobyxmoadg();
        if (typeIobyxmoadg == cdpycssgdh.class) {
            throw cqumvgiudr.wflxmlrfwp(method, "'" + cqumvgiudr.nufgyqmvbu(typeIobyxmoadg).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeIobyxmoadg == kcexrzcfyt.class) {
            throw cqumvgiudr.wflxmlrfwp(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (oxmwwwfdhmVar.f63522ppxfxbqfkf.equals("HEAD") && !Void.class.equals(typeIobyxmoadg)) {
            throw cqumvgiudr.wflxmlrfwp(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        gxszxtbevo gxszxtbevoVarEablkybsjg = eablkybsjg(zdlpuopuiuVar, method, typeIobyxmoadg);
        lk.eablkybsjg.iobyxmoadg iobyxmoadgVar = zdlpuopuiuVar.f63591zoijcleaow;
        if (z14) {
            return z13 ? new ppxfxbqfkf(oxmwwwfdhmVar, iobyxmoadgVar, gxszxtbevoVarEablkybsjg, ppxfxbqfkfVarWkgbmnqykc) : new zoijcleaow(oxmwwwfdhmVar, iobyxmoadgVar, gxszxtbevoVarEablkybsjg, ppxfxbqfkfVarWkgbmnqykc, false);
        }
        return new iobyxmoadg(oxmwwwfdhmVar, iobyxmoadgVar, gxszxtbevoVarEablkybsjg, ppxfxbqfkfVarWkgbmnqykc);
    }

    private static lm.ppxfxbqfkf wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return zdlpuopuiuVar.iobyxmoadg(type, annotationArr);
        } catch (RuntimeException e13) {
            throw cqumvgiudr.agtfadlqog(method, e13, "Unable to create call adapter for %s", type);
        }
    }

    @Override // lm.yggfygwlhe
    final Object iobyxmoadg(Object[] objArr) {
        return ppxfxbqfkf(new wflxmlrfwp(this.f63409iobyxmoadg, objArr, this.f63411zoijcleaow, this.f63410ppxfxbqfkf), objArr);
    }

    protected abstract Object ppxfxbqfkf(lm.zoijcleaow zoijcleaowVar, Object[] objArr);
}
