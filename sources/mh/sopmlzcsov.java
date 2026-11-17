package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collections;
import java.util.List;
import jh.vipkmwdibw;
import jh.weqkydbzbr;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sopmlzcsov extends agtfadlqog implements weqkydbzbr {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    protected zi.kegysxyocb f67150cqumvgiudr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sopmlzcsov(jh.wflxmlrfwp wflxmlrfwpVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, zi.kegysxyocb kegysxyocbVar, xrmfcynszj xrmfcynszjVar) {
        super(wflxmlrfwpVar, nufgyqmvbuVar, gxszxtbevoVar, xrmfcynszjVar);
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
        this.f67150cqumvgiudr = kegysxyocbVar;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // jh.iobyxmoadg
    public List dxjokdxxww() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            metgxyhuhe(6);
        }
        return listEmptyList;
    }

    public zi.kegysxyocb getReturnType() {
        zi.kegysxyocb type = getType();
        if (type == null) {
            metgxyhuhe(10);
        }
        return type;
    }

    @Override // jh.opjhrmiecq
    public zi.kegysxyocb getType() {
        zi.kegysxyocb kegysxyocbVar = this.f67150cqumvgiudr;
        if (kegysxyocbVar == null) {
            metgxyhuhe(4);
        }
        return kegysxyocbVar;
    }

    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            metgxyhuhe(8);
        }
        return listEmptyList;
    }

    public vipkmwdibw hcddaimhww() {
        return null;
    }

    public vipkmwdibw hkdspvbjdz() {
        return null;
    }

    @Override // jh.iobyxmoadg
    public boolean jztzpxfvev() {
        return false;
    }

    public void wizcaqwiak(zi.kegysxyocb kegysxyocbVar) {
        this.f67150cqumvgiudr = kegysxyocbVar;
    }
}
