package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jh.vipkmwdibw;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pkzmftpjix extends agtfadlqog implements jh.sopmlzcsov {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private jh.yggfygwlhe f67142cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f67143cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f67144esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final jh.zoijcleaow.iobyxmoadg f67145istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final jh.cdpycssgdh f67146lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final jh.crxdokpmqz f67147pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private jh.lereixgezr f67148yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final boolean f67149zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkzmftpjix(jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar, jh.crxdokpmqz crxdokpmqzVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, boolean z13, boolean z14, boolean z15, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar) {
        super(crxdokpmqzVar.zoijcleaow(), nufgyqmvbuVar, gxszxtbevoVar, xrmfcynszjVar);
        if (cdpycssgdhVar == null) {
            metgxyhuhe(0);
        }
        if (yggfygwlheVar == null) {
            metgxyhuhe(1);
        }
        if (crxdokpmqzVar == null) {
            metgxyhuhe(2);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(3);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(4);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(5);
        }
        this.f67148yadqdtsiqt = null;
        this.f67146lereixgezr = cdpycssgdhVar;
        this.f67142cdpycssgdh = yggfygwlheVar;
        this.f67147pmvmpeiblj = crxdokpmqzVar;
        this.f67143cqumvgiudr = z13;
        this.f67144esjtqupxsv = z14;
        this.f67149zynmafqrjb = z15;
        this.f67145istkbnxepw = iobyxmoadgVar;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i14 = 2;
                break;
            case 7:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 5:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i13) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    protected Collection ageimvtcrz(boolean z13) {
        ArrayList arrayList = new ArrayList(0);
        for (jh.crxdokpmqz crxdokpmqzVar : mbcevpiqjq().eablkybsjg()) {
            jh.zoijcleaow zoijcleaowVarWkgbmnqykc = z13 ? crxdokpmqzVar.wkgbmnqykc() : crxdokpmqzVar.nufgyqmvbu();
            if (zoijcleaowVarWkgbmnqykc != null) {
                arrayList.add(zoijcleaowVarWkgbmnqykc);
            }
        }
        return arrayList;
    }

    @Override // jh.istkbnxepw
    public boolean czzsidtyhn() {
        return false;
    }

    @Override // jh.lereixgezr
    public boolean dvvnrvtcbc() {
        return false;
    }

    public void fyldjkxazc(boolean z13) {
        this.f67143cqumvgiudr = z13;
    }

    @Override // jh.zoijcleaow
    public jh.zoijcleaow.iobyxmoadg getKind() {
        jh.zoijcleaow.iobyxmoadg iobyxmoadgVar = this.f67145istkbnxepw;
        if (iobyxmoadgVar == null) {
            metgxyhuhe(6);
        }
        return iobyxmoadgVar;
    }

    @Override // jh.iobyxmoadg
    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            metgxyhuhe(9);
        }
        return listEmptyList;
    }

    @Override // jh.vdvldrhtss, jh.istkbnxepw
    public jh.yggfygwlhe getVisibility() {
        jh.yggfygwlhe yggfygwlheVar = this.f67142cdpycssgdh;
        if (yggfygwlheVar == null) {
            metgxyhuhe(11);
        }
        return yggfygwlheVar;
    }

    public void grlcpdaxtj(jh.yggfygwlhe yggfygwlheVar) {
        this.f67142cdpycssgdh = yggfygwlheVar;
    }

    @Override // jh.iobyxmoadg
    public vipkmwdibw hcddaimhww() {
        return mbcevpiqjq().hcddaimhww();
    }

    @Override // jh.iobyxmoadg
    public vipkmwdibw hkdspvbjdz() {
        return mbcevpiqjq().hkdspvbjdz();
    }

    @Override // jh.sopmlzcsov
    public boolean iozdgvuglv() {
        return this.f67143cqumvgiudr;
    }

    public void ipoelvxyzq(jh.lereixgezr lereixgezrVar) {
        this.f67148yadqdtsiqt = lereixgezrVar;
    }

    @Override // jh.istkbnxepw
    public boolean isExternal() {
        return this.f67144esjtqupxsv;
    }

    @Override // jh.lereixgezr
    public boolean isInfix() {
        return false;
    }

    @Override // jh.lereixgezr
    public boolean isInline() {
        return this.f67149zynmafqrjb;
    }

    @Override // jh.lereixgezr
    public boolean isOperator() {
        return false;
    }

    @Override // jh.lereixgezr
    public boolean isSuspend() {
        return false;
    }

    @Override // jh.lereixgezr
    public boolean istkbnxepw() {
        return false;
    }

    @Override // jh.iobyxmoadg
    public boolean jztzpxfvev() {
        return false;
    }

    @Override // jh.lereixgezr
    public boolean lxfrhoxuzk() {
        return false;
    }

    @Override // jh.sopmlzcsov
    public jh.crxdokpmqz mbcevpiqjq() {
        jh.crxdokpmqz crxdokpmqzVar = this.f67147pmvmpeiblj;
        if (crxdokpmqzVar == null) {
            metgxyhuhe(13);
        }
        return crxdokpmqzVar;
    }

    @Override // jh.lereixgezr
    public jh.lereixgezr oipsdeybqn() {
        return this.f67148yadqdtsiqt;
    }

    @Override // jh.iobyxmoadg
    public Object pmvmpeiblj(jh.iobyxmoadg.InterfaceC1104iobyxmoadg interfaceC1104iobyxmoadg) {
        return null;
    }

    @Override // jh.rlfsiqarku
    public jh.lereixgezr ppxfxbqfkf(wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar == null) {
            metgxyhuhe(7);
        }
        return this;
    }

    @Override // jh.zoijcleaow
    public void skhdrjzrfn(Collection collection) {
        if (collection == null) {
            metgxyhuhe(16);
        }
    }

    @Override // jh.istkbnxepw
    public boolean ulzqkzuiru() {
        return false;
    }

    @Override // jh.istkbnxepw
    public jh.cdpycssgdh vdvldrhtss() {
        jh.cdpycssgdh cdpycssgdhVar = this.f67146lereixgezr;
        if (cdpycssgdhVar == null) {
            metgxyhuhe(10);
        }
        return cdpycssgdhVar;
    }

    @Override // jh.zoijcleaow
    /* JADX INFO: renamed from: wizcaqwiak, reason: merged with bridge method [inline-methods] */
    public jh.sopmlzcsov crxdokpmqz(jh.wflxmlrfwp wflxmlrfwpVar, jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, boolean z13) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // jh.iobyxmoadg
    public List zeieaojujs() {
        List listZeieaojujs = mbcevpiqjq().zeieaojujs();
        if (listZeieaojujs == null) {
            metgxyhuhe(14);
        }
        return listZeieaojujs;
    }
}
