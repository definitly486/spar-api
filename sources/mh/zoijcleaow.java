package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import jh.czzsidtyhn;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.mhtqkkgtqm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow extends nufgyqmvbu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(yi.agtfadlqog agtfadlqogVar, jh.wflxmlrfwp wflxmlrfwpVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, mhtqkkgtqm mhtqkkgtqmVar, boolean z13, int i13, xrmfcynszj xrmfcynszjVar, czzsidtyhn czzsidtyhnVar) {
        super(agtfadlqogVar, wflxmlrfwpVar, nufgyqmvbuVar, gxszxtbevoVar, mhtqkkgtqmVar, z13, i13, xrmfcynszjVar, czzsidtyhnVar);
        if (agtfadlqogVar == null) {
            metgxyhuhe(0);
        }
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(1);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(2);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(3);
        }
        if (mhtqkkgtqmVar == null) {
            metgxyhuhe(4);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(5);
        }
        if (czzsidtyhnVar == null) {
            metgxyhuhe(6);
        }
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // mh.wflxmlrfwp
    public String toString() {
        String str = "";
        String str2 = cqumvgiudr() ? "reified " : "";
        if (draadjrbmk() != mhtqkkgtqm.INVARIANT) {
            str = draadjrbmk() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
