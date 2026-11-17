package kh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;
import jh.xrmfcynszj;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kegysxyocb f55490iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final xrmfcynszj f55491ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f55492zoijcleaow;

    public wkgbmnqykc(kegysxyocb kegysxyocbVar, Map map, xrmfcynszj xrmfcynszjVar) {
        if (kegysxyocbVar == null) {
            ppxfxbqfkf(0);
        }
        if (map == null) {
            ppxfxbqfkf(1);
        }
        if (xrmfcynszjVar == null) {
            ppxfxbqfkf(2);
        }
        this.f55490iobyxmoadg = kegysxyocbVar;
        this.f55492zoijcleaow = map;
        this.f55491ppxfxbqfkf = xrmfcynszjVar;
    }

    private static /* synthetic */ void ppxfxbqfkf(int i13) {
        String str = (i13 == 3 || i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 3 || i13 == 4 || i13 == 5) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "valueArguments";
        } else if (i13 == 2) {
            objArr[0] = AdRevenueConstants.SOURCE_KEY;
        } else if (i13 == 3 || i13 == 4 || i13 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i13 == 3) {
            objArr[1] = "getType";
        } else if (i13 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kh.ppxfxbqfkf
    public kegysxyocb getType() {
        kegysxyocb kegysxyocbVar = this.f55490iobyxmoadg;
        if (kegysxyocbVar == null) {
            ppxfxbqfkf(3);
        }
        return kegysxyocbVar;
    }

    @Override // kh.ppxfxbqfkf
    public ii.ppxfxbqfkf gxszxtbevo() {
        return ppxfxbqfkf.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // kh.ppxfxbqfkf
    public xrmfcynszj lqeggnwhkg() {
        xrmfcynszj xrmfcynszjVar = this.f55491ppxfxbqfkf;
        if (xrmfcynszjVar == null) {
            ppxfxbqfkf(5);
        }
        return xrmfcynszjVar;
    }

    public String toString() {
        return ki.agtfadlqog.f55536nufgyqmvbu.wypolnanlu(this, null);
    }

    @Override // kh.ppxfxbqfkf
    public Map zoijcleaow() {
        Map map = this.f55492zoijcleaow;
        if (map == null) {
            ppxfxbqfkf(4);
        }
        return map;
    }
}
