package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jh.jlmebxxoox;
import jh.xrmfcynszj;

/* JADX INFO: loaded from: classes3.dex */
public class jpowsppfya extends pkzmftpjix implements jlmebxxoox {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private zi.kegysxyocb f67042iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final jlmebxxoox f67043lmojexxdyd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jpowsppfya(jh.crxdokpmqz crxdokpmqzVar, kh.nufgyqmvbu nufgyqmvbuVar, jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar, boolean z13, boolean z14, boolean z15, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, jlmebxxoox jlmebxxooxVar, xrmfcynszj xrmfcynszjVar) {
        jlmebxxoox jlmebxxooxVar2;
        jpowsppfya jpowsppfyaVar;
        super(cdpycssgdhVar, yggfygwlheVar, crxdokpmqzVar, nufgyqmvbuVar, ii.gxszxtbevo.dxjokdxxww("<get-" + crxdokpmqzVar.getName() + ">"), z13, z14, z15, iobyxmoadgVar, xrmfcynszjVar);
        if (crxdokpmqzVar == null) {
            metgxyhuhe(0);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(1);
        }
        if (cdpycssgdhVar == null) {
            metgxyhuhe(2);
        }
        if (yggfygwlheVar == null) {
            metgxyhuhe(3);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(4);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(5);
        }
        if (jlmebxxooxVar != null) {
            jpowsppfyaVar = this;
            jlmebxxooxVar2 = jlmebxxooxVar;
        } else {
            jlmebxxooxVar2 = this;
            jpowsppfyaVar = jlmebxxooxVar2;
        }
        jpowsppfyaVar.f67043lmojexxdyd = jlmebxxooxVar2;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 6 || i13 == 7 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 6 || i13 == 7 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i13 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i13 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i13 != 6 && i13 != 7 && i13 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 6 && i13 != 7 && i13 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // jh.iobyxmoadg
    public List dxjokdxxww() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            metgxyhuhe(7);
        }
        return listEmptyList;
    }

    @Override // jh.lereixgezr, jh.zoijcleaow, jh.iobyxmoadg
    public Collection eablkybsjg() {
        Collection collectionAgeimvtcrz = super.ageimvtcrz(true);
        if (collectionAgeimvtcrz == null) {
            metgxyhuhe(6);
        }
        return collectionAgeimvtcrz;
    }

    @Override // jh.iobyxmoadg
    public zi.kegysxyocb getReturnType() {
        return this.f67042iozdgvuglv;
    }

    public void ixidwrxhsl(zi.kegysxyocb kegysxyocbVar) {
        if (kegysxyocbVar == null) {
            kegysxyocbVar = mbcevpiqjq().getType();
        }
        this.f67042iozdgvuglv = kegysxyocbVar;
    }

    @Override // mh.agtfadlqog, mh.wflxmlrfwp, jh.wflxmlrfwp
    /* JADX INFO: renamed from: mhtqkkgtqm, reason: merged with bridge method [inline-methods] */
    public jlmebxxoox iobyxmoadg() {
        jlmebxxoox jlmebxxooxVar = this.f67043lmojexxdyd;
        if (jlmebxxooxVar == null) {
            metgxyhuhe(8);
        }
        return jlmebxxooxVar;
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return ojitshcjhnVar.wkgbmnqykc(this, obj);
    }
}
