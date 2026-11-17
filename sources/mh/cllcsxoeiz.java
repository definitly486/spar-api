package mh;

import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public class cllcsxoeiz extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ti.lqeggnwhkg f66954iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final jh.wflxmlrfwp f66955jyumaefscl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cllcsxoeiz(jh.wflxmlrfwp wflxmlrfwpVar, ti.lqeggnwhkg lqeggnwhkgVar, kh.nufgyqmvbu nufgyqmvbuVar) {
        this(wflxmlrfwpVar, lqeggnwhkgVar, nufgyqmvbuVar, ii.nufgyqmvbu.f44463dxjokdxxww);
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(0);
        }
        if (lqeggnwhkgVar == null) {
            metgxyhuhe(1);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(2);
        }
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 7 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 7 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i13 == 7) {
            objArr[1] = "getValue";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i13) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 7 && i13 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // jh.vipkmwdibw
    public ti.lqeggnwhkg getValue() {
        ti.lqeggnwhkg lqeggnwhkgVar = this.f66954iwizpuwonk;
        if (lqeggnwhkgVar == null) {
            metgxyhuhe(7);
        }
        return lqeggnwhkgVar;
    }

    @Override // jh.wflxmlrfwp
    public jh.wflxmlrfwp zoijcleaow() {
        jh.wflxmlrfwp wflxmlrfwpVar = this.f66955jyumaefscl;
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(8);
        }
        return wflxmlrfwpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllcsxoeiz(jh.wflxmlrfwp wflxmlrfwpVar, ti.lqeggnwhkg lqeggnwhkgVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar) {
        super(nufgyqmvbuVar, gxszxtbevoVar);
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(3);
        }
        if (lqeggnwhkgVar == null) {
            metgxyhuhe(4);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(5);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(6);
        }
        this.f66955jyumaefscl = wflxmlrfwpVar;
        this.f66954iwizpuwonk = lqeggnwhkgVar;
    }
}
