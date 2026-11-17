package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class crxdokpmqz extends sopmlzcsov {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f66962esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected yi.btonecajqb f66963lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    protected tg.iobyxmoadg f66964pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxdokpmqz(jh.wflxmlrfwp wflxmlrfwpVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, zi.kegysxyocb kegysxyocbVar, boolean z13, xrmfcynszj xrmfcynszjVar) {
        super(wflxmlrfwpVar, nufgyqmvbuVar, gxszxtbevoVar, kegysxyocbVar, xrmfcynszjVar);
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
        this.f66962esjtqupxsv = z13;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1) {
            objArr[0] = "annotations";
        } else if (i13 == 2) {
            objArr[0] = ExternalMetricsManagerImpl.NAME;
        } else if (i13 == 3) {
            objArr[0] = AdRevenueConstants.SOURCE_KEY;
        } else if (i13 == 4 || i13 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i13 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i13 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void ageimvtcrz(yi.btonecajqb btonecajqbVar, tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            metgxyhuhe(5);
        }
        this.f66964pmvmpeiblj = iobyxmoadgVar;
        if (btonecajqbVar == null) {
            btonecajqbVar = (yi.btonecajqb) iobyxmoadgVar.invoke();
        }
        this.f66963lereixgezr = btonecajqbVar;
    }

    public void fyldjkxazc(tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            metgxyhuhe(4);
        }
        ageimvtcrz(null, iobyxmoadgVar);
    }

    @Override // jh.weqkydbzbr
    public boolean jpowsppfya() {
        return this.f66962esjtqupxsv;
    }

    @Override // jh.weqkydbzbr
    public ni.lqeggnwhkg ydmasvzmpa() {
        yi.btonecajqb btonecajqbVar = this.f66963lereixgezr;
        if (btonecajqbVar != null) {
            return (ni.lqeggnwhkg) btonecajqbVar.invoke();
        }
        return null;
    }
}
