package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jh.bfopjjpdmp;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public class lmojexxdyd extends btonecajqb {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private jh.cdpycssgdh f67101cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private zeieaojujs f67102iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final boolean f67103istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private List f67104lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Collection f67105wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private jh.yggfygwlhe f67106yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final yi.agtfadlqog f67107ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final jh.gxszxtbevo f67108zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmojexxdyd(jh.wflxmlrfwp wflxmlrfwpVar, jh.gxszxtbevo gxszxtbevoVar, boolean z13, boolean z14, ii.gxszxtbevo gxszxtbevoVar2, xrmfcynszj xrmfcynszjVar, yi.agtfadlqog agtfadlqogVar) {
        super(agtfadlqogVar, wflxmlrfwpVar, gxszxtbevoVar2, xrmfcynszjVar, z14);
        if (wflxmlrfwpVar == null) {
            igdgnonuha(0);
        }
        if (gxszxtbevoVar == null) {
            igdgnonuha(1);
        }
        if (gxszxtbevoVar2 == null) {
            igdgnonuha(2);
        }
        if (xrmfcynszjVar == null) {
            igdgnonuha(3);
        }
        if (agtfadlqogVar == null) {
            igdgnonuha(4);
        }
        this.f67105wwaezpbzkn = new ArrayList();
        this.f67107ylkuphrtab = agtfadlqogVar;
        this.f67108zynmafqrjb = gxszxtbevoVar;
        this.f67103istkbnxepw = z13;
    }

    private static /* synthetic */ void igdgnonuha(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i14 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 3:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void ageimvtcrz() {
        this.f67102iozdgvuglv = new zi.yggfygwlhe(this, this.f67104lmojexxdyd, this.f67105wwaezpbzkn, this.f67107ylkuphrtab);
        Iterator it = gtknphoqwx().iterator();
        while (it.hasNext()) {
            ((dxjokdxxww) ((jh.lereixgezr) it.next())).j(ojitshcjhn());
        }
    }

    @Override // jh.nufgyqmvbu
    public zeieaojujs btonecajqb() {
        zeieaojujs zeieaojujsVar = this.f67102iozdgvuglv;
        if (zeieaojujsVar == null) {
            igdgnonuha(11);
        }
        return zeieaojujsVar;
    }

    @Override // jh.eablkybsjg
    public jh.wkgbmnqykc cdpycssgdh() {
        return null;
    }

    @Override // jh.istkbnxepw
    public boolean czzsidtyhn() {
        return false;
    }

    @Override // jh.eablkybsjg
    public Collection esjtqupxsv() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            igdgnonuha(19);
        }
        return listEmptyList;
    }

    @Override // jh.eablkybsjg
    /* JADX INFO: renamed from: fyldjkxazc, reason: merged with bridge method [inline-methods] */
    public Set gtknphoqwx() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            igdgnonuha(13);
        }
        return setEmptySet;
    }

    @Override // kh.iobyxmoadg
    public kh.nufgyqmvbu getAnnotations() {
        kh.nufgyqmvbu nufgyqmvbuVarZoijcleaow = kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
        if (nufgyqmvbuVarZoijcleaow == null) {
            igdgnonuha(5);
        }
        return nufgyqmvbuVarZoijcleaow;
    }

    @Override // jh.eablkybsjg
    public jh.gxszxtbevo getKind() {
        jh.gxszxtbevo gxszxtbevoVar = this.f67108zynmafqrjb;
        if (gxszxtbevoVar == null) {
            igdgnonuha(8);
        }
        return gxszxtbevoVar;
    }

    @Override // jh.eablkybsjg, jh.istkbnxepw
    public jh.yggfygwlhe getVisibility() {
        jh.yggfygwlhe yggfygwlheVar = this.f67106yadqdtsiqt;
        if (yggfygwlheVar == null) {
            igdgnonuha(10);
        }
        return yggfygwlheVar;
    }

    public void grlcpdaxtj(List list) {
        if (list == null) {
            igdgnonuha(14);
        }
        if (this.f67104lmojexxdyd == null) {
            this.f67104lmojexxdyd = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    @Override // jh.eablkybsjg
    public boolean hszhottldk() {
        return false;
    }

    @Override // jh.eablkybsjg
    public boolean ikoacuggdj() {
        return false;
    }

    public void ipoelvxyzq(jh.cdpycssgdh cdpycssgdhVar) {
        if (cdpycssgdhVar == null) {
            igdgnonuha(6);
        }
        this.f67101cdpycssgdh = cdpycssgdhVar;
    }

    @Override // jh.eablkybsjg
    public boolean isInline() {
        return false;
    }

    @Override // jh.eablkybsjg
    public boolean jlmebxxoox() {
        return false;
    }

    @Override // jh.eablkybsjg
    public boolean kcexrzcfyt() {
        return false;
    }

    @Override // jh.dxjokdxxww
    public boolean lereixgezr() {
        return this.f67103istkbnxepw;
    }

    public void mhtqkkgtqm(jh.yggfygwlhe yggfygwlheVar) {
        if (yggfygwlheVar == null) {
            igdgnonuha(9);
        }
        this.f67106yadqdtsiqt = yggfygwlheVar;
    }

    @Override // jh.eablkybsjg, jh.dxjokdxxww
    public List rgvfuqvkyq() {
        List list = this.f67104lmojexxdyd;
        if (list == null) {
            igdgnonuha(15);
        }
        return list;
    }

    public String toString() {
        return wflxmlrfwp.uawqvzlxes(this);
    }

    @Override // jh.eablkybsjg
    public bfopjjpdmp tzroggbefp() {
        return null;
    }

    @Override // mh.lereixgezr
    public si.gtknphoqwx uawqvzlxes(aj.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null) {
            igdgnonuha(16);
        }
        si.gtknphoqwx.zoijcleaow zoijcleaowVar = si.gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        if (zoijcleaowVar == null) {
            igdgnonuha(17);
        }
        return zoijcleaowVar;
    }

    @Override // jh.istkbnxepw
    public boolean ulzqkzuiru() {
        return false;
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx uwvvkdfqfp() {
        si.gtknphoqwx.zoijcleaow zoijcleaowVar = si.gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        if (zoijcleaowVar == null) {
            igdgnonuha(18);
        }
        return zoijcleaowVar;
    }

    @Override // jh.eablkybsjg, jh.istkbnxepw
    public jh.cdpycssgdh vdvldrhtss() {
        jh.cdpycssgdh cdpycssgdhVar = this.f67101cdpycssgdh;
        if (cdpycssgdhVar == null) {
            igdgnonuha(7);
        }
        return cdpycssgdhVar;
    }

    @Override // jh.eablkybsjg
    public jh.eablkybsjg yfnezrywwk() {
        return null;
    }
}
