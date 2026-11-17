package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import jh.bfopjjpdmp;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public class gtknphoqwx extends btonecajqb {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final zeieaojujs f66977cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private Set f66978iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final jh.gxszxtbevo f66979istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private jh.wkgbmnqykc f66980lmojexxdyd;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private si.gtknphoqwx f66981yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final jh.cdpycssgdh f66982zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(jh.wflxmlrfwp wflxmlrfwpVar, ii.gxszxtbevo gxszxtbevoVar, jh.cdpycssgdh cdpycssgdhVar, jh.gxszxtbevo gxszxtbevoVar2, Collection collection, xrmfcynszj xrmfcynszjVar, boolean z13, yi.agtfadlqog agtfadlqogVar) {
        super(agtfadlqogVar, wflxmlrfwpVar, gxszxtbevoVar, xrmfcynszjVar, z13);
        if (wflxmlrfwpVar == null) {
            igdgnonuha(0);
        }
        if (gxszxtbevoVar == null) {
            igdgnonuha(1);
        }
        if (cdpycssgdhVar == null) {
            igdgnonuha(2);
        }
        if (gxszxtbevoVar2 == null) {
            igdgnonuha(3);
        }
        if (collection == null) {
            igdgnonuha(4);
        }
        if (xrmfcynszjVar == null) {
            igdgnonuha(5);
        }
        if (agtfadlqogVar == null) {
            igdgnonuha(6);
        }
        this.f66982zynmafqrjb = cdpycssgdhVar;
        this.f66979istkbnxepw = gxszxtbevoVar2;
        this.f66977cdpycssgdh = new zi.yggfygwlhe(this, Collections.emptyList(), collection, agtfadlqogVar);
    }

    private static /* synthetic */ void igdgnonuha(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i14 = 2;
                break;
            case 12:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final void ageimvtcrz(si.gtknphoqwx gtknphoqwxVar, Set set, jh.wkgbmnqykc wkgbmnqykcVar) {
        if (gtknphoqwxVar == null) {
            igdgnonuha(7);
        }
        if (set == null) {
            igdgnonuha(8);
        }
        this.f66981yadqdtsiqt = gtknphoqwxVar;
        this.f66978iozdgvuglv = set;
        this.f66980lmojexxdyd = wkgbmnqykcVar;
    }

    @Override // jh.nufgyqmvbu
    public zeieaojujs btonecajqb() {
        zeieaojujs zeieaojujsVar = this.f66977cdpycssgdh;
        if (zeieaojujsVar == null) {
            igdgnonuha(10);
        }
        return zeieaojujsVar;
    }

    @Override // jh.eablkybsjg
    public jh.wkgbmnqykc cdpycssgdh() {
        return this.f66980lmojexxdyd;
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

    @Override // kh.iobyxmoadg
    public kh.nufgyqmvbu getAnnotations() {
        kh.nufgyqmvbu nufgyqmvbuVarZoijcleaow = kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
        if (nufgyqmvbuVarZoijcleaow == null) {
            igdgnonuha(9);
        }
        return nufgyqmvbuVarZoijcleaow;
    }

    @Override // jh.eablkybsjg
    public jh.gxszxtbevo getKind() {
        jh.gxszxtbevo gxszxtbevoVar = this.f66979istkbnxepw;
        if (gxszxtbevoVar == null) {
            igdgnonuha(15);
        }
        return gxszxtbevoVar;
    }

    @Override // jh.eablkybsjg, jh.istkbnxepw
    public jh.yggfygwlhe getVisibility() {
        jh.yggfygwlhe yggfygwlheVar = jh.zdlpuopuiu.f51354eablkybsjg;
        if (yggfygwlheVar == null) {
            igdgnonuha(17);
        }
        return yggfygwlheVar;
    }

    @Override // jh.eablkybsjg
    public Collection gtknphoqwx() {
        Set set = this.f66978iozdgvuglv;
        if (set == null) {
            igdgnonuha(11);
        }
        return set;
    }

    @Override // jh.eablkybsjg
    public boolean hszhottldk() {
        return false;
    }

    @Override // jh.eablkybsjg
    public boolean ikoacuggdj() {
        return false;
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
        return false;
    }

    @Override // jh.eablkybsjg, jh.dxjokdxxww
    public List rgvfuqvkyq() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            igdgnonuha(18);
        }
        return listEmptyList;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // jh.eablkybsjg
    public bfopjjpdmp tzroggbefp() {
        return null;
    }

    @Override // mh.lereixgezr
    public si.gtknphoqwx uawqvzlxes(aj.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null) {
            igdgnonuha(12);
        }
        si.gtknphoqwx gtknphoqwxVar = this.f66981yadqdtsiqt;
        if (gtknphoqwxVar == null) {
            igdgnonuha(13);
        }
        return gtknphoqwxVar;
    }

    @Override // jh.istkbnxepw
    public boolean ulzqkzuiru() {
        return false;
    }

    @Override // jh.eablkybsjg
    public si.gtknphoqwx uwvvkdfqfp() {
        si.gtknphoqwx.zoijcleaow zoijcleaowVar = si.gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        if (zoijcleaowVar == null) {
            igdgnonuha(14);
        }
        return zoijcleaowVar;
    }

    @Override // jh.eablkybsjg, jh.istkbnxepw
    public jh.cdpycssgdh vdvldrhtss() {
        jh.cdpycssgdh cdpycssgdhVar = this.f66982zynmafqrjb;
        if (cdpycssgdhVar == null) {
            igdgnonuha(16);
        }
        return cdpycssgdhVar;
    }

    @Override // jh.eablkybsjg
    public jh.eablkybsjg yfnezrywwk() {
        return null;
    }
}
