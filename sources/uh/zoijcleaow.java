package uh;

import gg.vdvldrhtss;
import hg.jyumaefscl;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.List;
import jh.lereixgezr;
import jh.wflxmlrfwp;
import jh.xrmfcynszj;
import mh.dxjokdxxww;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow extends dxjokdxxww implements iobyxmoadg {

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private Boolean f113576jlmebxxoox;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private Boolean f113577ribwqtqdhb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected zoijcleaow(jh.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, kh.nufgyqmvbu nufgyqmvbuVar, boolean z13, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar) {
        super(eablkybsjgVar, zoijcleaowVar, nufgyqmvbuVar, z13, iobyxmoadgVar, xrmfcynszjVar);
        if (eablkybsjgVar == null) {
            metgxyhuhe(0);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(1);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(2);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(3);
        }
        this.f113576jlmebxxoox = null;
        this.f113577ribwqtqdhb = null;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 11 || i13 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 11 || i13 == 18) ? 2 : 3];
        switch (i13) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i13 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i13 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 11 && i13 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static zoijcleaow w(jh.eablkybsjg eablkybsjgVar, kh.nufgyqmvbu nufgyqmvbuVar, boolean z13, xrmfcynszj xrmfcynszjVar) {
        if (eablkybsjgVar == null) {
            metgxyhuhe(4);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(5);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(6);
        }
        return new zoijcleaow(eablkybsjgVar, null, nufgyqmvbuVar, z13, jh.zoijcleaow.iobyxmoadg.DECLARATION, xrmfcynszjVar);
    }

    @Override // mh.kcexrzcfyt
    public void b(boolean z13) {
        this.f113576jlmebxxoox = Boolean.valueOf(z13);
    }

    @Override // mh.kcexrzcfyt
    public void c(boolean z13) {
        this.f113577ribwqtqdhb = Boolean.valueOf(z13);
    }

    @Override // mh.kcexrzcfyt
    public boolean jrbgnlbqoe() {
        return this.f113576jlmebxxoox.booleanValue();
    }

    @Override // mh.kcexrzcfyt, jh.iobyxmoadg
    public boolean jztzpxfvev() {
        return this.f113577ribwqtqdhb.booleanValue();
    }

    protected zoijcleaow v(jh.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar, kh.nufgyqmvbu nufgyqmvbuVar) {
        if (eablkybsjgVar == null) {
            metgxyhuhe(12);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(13);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(14);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(15);
        }
        return new zoijcleaow(eablkybsjgVar, zoijcleaowVar, nufgyqmvbuVar, this.f66967crxdokpmqz, iobyxmoadgVar, xrmfcynszjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mh.dxjokdxxww
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public zoijcleaow fyldjkxazc(wflxmlrfwp wflxmlrfwpVar, lereixgezr lereixgezrVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, ii.gxszxtbevo gxszxtbevoVar, kh.nufgyqmvbu nufgyqmvbuVar, xrmfcynszj xrmfcynszjVar) {
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(7);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(8);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(9);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(10);
        }
        if (iobyxmoadgVar == jh.zoijcleaow.iobyxmoadg.DECLARATION || iobyxmoadgVar == jh.zoijcleaow.iobyxmoadg.SYNTHESIZED) {
            zoijcleaow zoijcleaowVarV = v((jh.eablkybsjg) wflxmlrfwpVar, (zoijcleaow) lereixgezrVar, iobyxmoadgVar, xrmfcynszjVar, nufgyqmvbuVar);
            zoijcleaowVarV.b(jrbgnlbqoe());
            zoijcleaowVarV.c(jztzpxfvev());
            return zoijcleaowVarV;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + wflxmlrfwpVar + "\nkind: " + iobyxmoadgVar);
    }

    @Override // uh.iobyxmoadg
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public zoijcleaow xrmfcynszj(kegysxyocb kegysxyocbVar, List list, kegysxyocb kegysxyocbVar2, vdvldrhtss vdvldrhtssVar) {
        if (list == null) {
            metgxyhuhe(16);
        }
        if (kegysxyocbVar2 == null) {
            metgxyhuhe(17);
        }
        zoijcleaow zoijcleaowVarFyldjkxazc = fyldjkxazc(zoijcleaow(), null, getKind(), null, getAnnotations(), lqeggnwhkg());
        zoijcleaowVarFyldjkxazc.fmlbqenlif(kegysxyocbVar == null ? null : li.nufgyqmvbu.dxjokdxxww(zoijcleaowVarFyldjkxazc, kegysxyocbVar, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow()), hcddaimhww(), jyumaefscl.wflxmlrfwp(), getTypeParameters(), nufgyqmvbu.iobyxmoadg(list, dxjokdxxww(), zoijcleaowVarFyldjkxazc), kegysxyocbVar2, vdvldrhtss(), getVisibility());
        if (vdvldrhtssVar != null) {
            zoijcleaowVarFyldjkxazc.yzdjzghtvl((jh.iobyxmoadg.InterfaceC1104iobyxmoadg) vdvldrhtssVar.lqeggnwhkg(), vdvldrhtssVar.nufgyqmvbu());
        }
        return zoijcleaowVarFyldjkxazc;
    }
}
