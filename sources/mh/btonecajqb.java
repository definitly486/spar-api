package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb extends iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final jh.wflxmlrfwp f66950esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final xrmfcynszj f66951lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f66952pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected btonecajqb(yi.agtfadlqog agtfadlqogVar, jh.wflxmlrfwp wflxmlrfwpVar, ii.gxszxtbevo gxszxtbevoVar, xrmfcynszj xrmfcynszjVar, boolean z13) {
        super(agtfadlqogVar, gxszxtbevoVar);
        if (agtfadlqogVar == null) {
            igdgnonuha(0);
        }
        if (wflxmlrfwpVar == null) {
            igdgnonuha(1);
        }
        if (gxszxtbevoVar == null) {
            igdgnonuha(2);
        }
        if (xrmfcynszjVar == null) {
            igdgnonuha(3);
        }
        this.f66950esjtqupxsv = wflxmlrfwpVar;
        this.f66951lereixgezr = xrmfcynszjVar;
        this.f66952pmvmpeiblj = z13;
    }

    private static /* synthetic */ void igdgnonuha(int i13) {
        String str = (i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i13 == 2) {
            objArr[0] = ExternalMetricsManagerImpl.NAME;
        } else if (i13 == 3) {
            objArr[0] = AdRevenueConstants.SOURCE_KEY;
        } else if (i13 == 4 || i13 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 4 && i13 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean isExternal() {
        return this.f66952pmvmpeiblj;
    }

    @Override // jh.rgvfuqvkyq
    public xrmfcynszj lqeggnwhkg() {
        xrmfcynszj xrmfcynszjVar = this.f66951lereixgezr;
        if (xrmfcynszjVar == null) {
            igdgnonuha(5);
        }
        return xrmfcynszjVar;
    }

    @Override // jh.eablkybsjg, jh.agtfadlqog, jh.wflxmlrfwp
    public jh.wflxmlrfwp zoijcleaow() {
        jh.wflxmlrfwp wflxmlrfwpVar = this.f66950esjtqupxsv;
        if (wflxmlrfwpVar == null) {
            igdgnonuha(4);
        }
        return wflxmlrfwpVar;
    }
}
