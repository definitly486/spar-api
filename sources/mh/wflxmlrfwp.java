package mh;

import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wflxmlrfwp extends kh.zoijcleaow implements jh.wflxmlrfwp {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ii.gxszxtbevo f67174yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar) {
        super(nufgyqmvbuVar);
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(0);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(1);
        }
        this.f67174yggfygwlhe = gxszxtbevoVar;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i13 == 2) {
            objArr[1] = "getName";
        } else if (i13 == 3) {
            objArr[1] = "getOriginal";
        } else if (i13 == 5 || i13 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i13 != 2 && i13 != 3) {
            if (i13 == 4) {
                objArr[2] = "toString";
            } else if (i13 != 5 && i13 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String uawqvzlxes(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(4);
        }
        try {
            String str = ki.agtfadlqog.f55532gtknphoqwx.dsvhmnatus(wflxmlrfwpVar) + "[" + wflxmlrfwpVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(wflxmlrfwpVar)) + "]";
            if (str == null) {
                metgxyhuhe(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = wflxmlrfwpVar.getClass().getSimpleName() + " " + wflxmlrfwpVar.getName();
            if (str2 == null) {
                metgxyhuhe(6);
            }
            return str2;
        }
    }

    @Override // jh.ylkuphrtab
    public ii.gxszxtbevo getName() {
        ii.gxszxtbevo gxszxtbevoVar = this.f67174yggfygwlhe;
        if (gxszxtbevoVar == null) {
            metgxyhuhe(2);
        }
        return gxszxtbevoVar;
    }

    public jh.wflxmlrfwp iobyxmoadg() {
        return this;
    }

    public String toString() {
        return uawqvzlxes(this);
    }
}
