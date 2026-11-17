package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agtfadlqog extends wflxmlrfwp implements jh.agtfadlqog {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final xrmfcynszj f66948iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final jh.wflxmlrfwp f66949jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected agtfadlqog(jh.wflxmlrfwp wflxmlrfwpVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, xrmfcynszj xrmfcynszjVar) {
        super(nufgyqmvbuVar, gxszxtbevoVar);
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(0);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(1);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(2);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(3);
        }
        this.f66949jyumaefscl = wflxmlrfwpVar;
        this.f66948iwizpuwonk = xrmfcynszjVar;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 3:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getOriginal";
        } else if (i13 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i13 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // mh.wflxmlrfwp, jh.wflxmlrfwp
    /* JADX INFO: renamed from: igdgnonuha, reason: merged with bridge method [inline-methods] */
    public jh.rgvfuqvkyq iobyxmoadg() {
        jh.rgvfuqvkyq rgvfuqvkyqVar = (jh.rgvfuqvkyq) super.iobyxmoadg();
        if (rgvfuqvkyqVar == null) {
            metgxyhuhe(4);
        }
        return rgvfuqvkyqVar;
    }

    @Override // jh.rgvfuqvkyq
    public xrmfcynszj lqeggnwhkg() {
        xrmfcynszj xrmfcynszjVar = this.f66948iwizpuwonk;
        if (xrmfcynszjVar == null) {
            metgxyhuhe(6);
        }
        return xrmfcynszjVar;
    }

    @Override // jh.wflxmlrfwp
    public jh.wflxmlrfwp zoijcleaow() {
        jh.wflxmlrfwp wflxmlrfwpVar = this.f66949jyumaefscl;
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(5);
        }
        return wflxmlrfwpVar;
    }
}
