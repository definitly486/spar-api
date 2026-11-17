package mh;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jh.iyctptxqzt;
import jh.ribwqtqdhb;
import jh.xrmfcynszj;
import zi.ikoacuggdj;

/* JADX INFO: loaded from: classes3.dex */
public class hkdspvbjdz extends pkzmftpjix implements ribwqtqdhb {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private iyctptxqzt f67017iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final ribwqtqdhb f67018lmojexxdyd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hkdspvbjdz(jh.crxdokpmqz crxdokpmqzVar, kh.nufgyqmvbu nufgyqmvbuVar, jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar, boolean z13, boolean z14, boolean z15, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, ribwqtqdhb ribwqtqdhbVar, xrmfcynszj xrmfcynszjVar) {
        ribwqtqdhb ribwqtqdhbVar2;
        hkdspvbjdz hkdspvbjdzVar;
        super(cdpycssgdhVar, yggfygwlheVar, crxdokpmqzVar, nufgyqmvbuVar, ii.gxszxtbevo.dxjokdxxww("<set-" + crxdokpmqzVar.getName() + ">"), z13, z14, z15, iobyxmoadgVar, xrmfcynszjVar);
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
        if (ribwqtqdhbVar != null) {
            hkdspvbjdzVar = this;
            ribwqtqdhbVar2 = ribwqtqdhbVar;
        } else {
            ribwqtqdhbVar2 = this;
            hkdspvbjdzVar = ribwqtqdhbVar2;
        }
        hkdspvbjdzVar.f67018lmojexxdyd = ribwqtqdhbVar2;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i13) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i13) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ntlheqmsrt mhtqkkgtqm(ribwqtqdhb ribwqtqdhbVar, zi.kegysxyocb kegysxyocbVar, kh.nufgyqmvbu nufgyqmvbuVar) {
        if (ribwqtqdhbVar == null) {
            metgxyhuhe(7);
        }
        if (kegysxyocbVar == null) {
            metgxyhuhe(8);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(9);
        }
        return new ntlheqmsrt(ribwqtqdhbVar, null, 0, nufgyqmvbuVar, ii.nufgyqmvbu.f44470ojitshcjhn, kegysxyocbVar, false, false, false, null, xrmfcynszj.f51348iobyxmoadg);
    }

    @Override // jh.iobyxmoadg
    public List dxjokdxxww() {
        iyctptxqzt iyctptxqztVar = this.f67017iozdgvuglv;
        if (iyctptxqztVar == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(iyctptxqztVar);
        if (listSingletonList == null) {
            metgxyhuhe(11);
        }
        return listSingletonList;
    }

    @Override // jh.lereixgezr, jh.zoijcleaow, jh.iobyxmoadg
    public Collection eablkybsjg() {
        Collection collectionAgeimvtcrz = super.ageimvtcrz(false);
        if (collectionAgeimvtcrz == null) {
            metgxyhuhe(10);
        }
        return collectionAgeimvtcrz;
    }

    @Override // jh.iobyxmoadg
    public zi.kegysxyocb getReturnType() {
        ikoacuggdj ikoacuggdjVarRibwqtqdhb = pi.eablkybsjg.wflxmlrfwp(this).ribwqtqdhb();
        if (ikoacuggdjVarRibwqtqdhb == null) {
            metgxyhuhe(12);
        }
        return ikoacuggdjVarRibwqtqdhb;
    }

    @Override // mh.agtfadlqog, mh.wflxmlrfwp, jh.wflxmlrfwp
    /* JADX INFO: renamed from: ixidwrxhsl, reason: merged with bridge method [inline-methods] */
    public ribwqtqdhb iobyxmoadg() {
        ribwqtqdhb ribwqtqdhbVar = this.f67018lmojexxdyd;
        if (ribwqtqdhbVar == null) {
            metgxyhuhe(13);
        }
        return ribwqtqdhbVar;
    }

    public void jrbgnlbqoe(iyctptxqzt iyctptxqztVar) {
        if (iyctptxqztVar == null) {
            metgxyhuhe(6);
        }
        this.f67017iozdgvuglv = iyctptxqztVar;
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return ojitshcjhnVar.dxjokdxxww(this, obj);
    }
}
