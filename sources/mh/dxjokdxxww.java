package mh;

import io.appmetrica.analytics.impl.C4007z9;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import jh.vipkmwdibw;
import jh.xrmfcynszj;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public class dxjokdxxww extends kcexrzcfyt implements jh.wkgbmnqykc {

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    protected final boolean f66967crxdokpmqz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected dxjokdxxww(jh.eablkybsjg eablkybsjgVar, jh.draadjrbmk draadjrbmkVar, kh.nufgyqmvbu nufgyqmvbuVar, boolean z13, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar) {
        super(eablkybsjgVar, draadjrbmkVar, nufgyqmvbuVar, ii.nufgyqmvbu.f44461btonecajqb, iobyxmoadgVar, xrmfcynszjVar);
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
        this.f66967crxdokpmqz = z13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str;
        int i14;
        if (i13 != 21 && i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 21 && i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i14 = 2;
                    break;
                default:
                    i14 = 3;
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 5:
            case 8:
            case C4007z9.F /* 25 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case C4007z9.G /* 26 */:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i13 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 21 && i13 != 27) {
            switch (i13) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    private List n() {
        jh.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow();
        if (eablkybsjgVarZoijcleaow.sopmlzcsov().isEmpty()) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                metgxyhuhe(16);
            }
            return listEmptyList;
        }
        List listSopmlzcsov = eablkybsjgVarZoijcleaow.sopmlzcsov();
        if (listSopmlzcsov == null) {
            metgxyhuhe(15);
        }
        return listSopmlzcsov;
    }

    public static dxjokdxxww q(jh.eablkybsjg eablkybsjgVar, kh.nufgyqmvbu nufgyqmvbuVar, boolean z13, xrmfcynszj xrmfcynszjVar) {
        if (eablkybsjgVar == null) {
            metgxyhuhe(4);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(5);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(6);
        }
        return new dxjokdxxww(eablkybsjgVar, null, nufgyqmvbuVar, z13, jh.zoijcleaow.iobyxmoadg.DECLARATION, xrmfcynszjVar);
    }

    @Override // mh.kcexrzcfyt, jh.lereixgezr, jh.zoijcleaow, jh.iobyxmoadg
    public Collection eablkybsjg() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            metgxyhuhe(21);
        }
        return setEmptySet;
    }

    @Override // jh.draadjrbmk
    public jh.eablkybsjg jhduphickx() {
        jh.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow();
        if (eablkybsjgVarZoijcleaow == null) {
            metgxyhuhe(18);
        }
        return eablkybsjgVarZoijcleaow;
    }

    public vipkmwdibw o() {
        jh.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow();
        if (!eablkybsjgVarZoijcleaow.lereixgezr()) {
            return null;
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = eablkybsjgVarZoijcleaow.zoijcleaow();
        if (wflxmlrfwpVarZoijcleaow instanceof jh.eablkybsjg) {
            return ((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow).fiwbwshyhd();
        }
        return null;
    }

    @Override // jh.zoijcleaow
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public jh.wkgbmnqykc crxdokpmqz(jh.wflxmlrfwp wflxmlrfwpVar, jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, boolean z13) {
        jh.wkgbmnqykc wkgbmnqykcVar = (jh.wkgbmnqykc) super.ageimvtcrz(wflxmlrfwpVar, cdpycssgdhVar, yggfygwlheVar, iobyxmoadgVar, z13);
        if (wkgbmnqykcVar == null) {
            metgxyhuhe(27);
        }
        return wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mh.kcexrzcfyt
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww fyldjkxazc(jh.wflxmlrfwp wflxmlrfwpVar, jh.lereixgezr lereixgezrVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, ii.gxszxtbevo gxszxtbevoVar, kh.nufgyqmvbu nufgyqmvbuVar, xrmfcynszj xrmfcynszjVar) {
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(23);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(24);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(25);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(26);
        }
        jh.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = jh.zoijcleaow.iobyxmoadg.DECLARATION;
        if (iobyxmoadgVar == iobyxmoadgVar2 || iobyxmoadgVar == jh.zoijcleaow.iobyxmoadg.SYNTHESIZED) {
            return new dxjokdxxww((jh.eablkybsjg) wflxmlrfwpVar, this, nufgyqmvbuVar, this.f66967crxdokpmqz, iobyxmoadgVar2, xrmfcynszjVar);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + wflxmlrfwpVar + "\nkind: " + iobyxmoadgVar);
    }

    @Override // mh.agtfadlqog, jh.wflxmlrfwp
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public jh.eablkybsjg zoijcleaow() {
        jh.eablkybsjg eablkybsjgVar = (jh.eablkybsjg) super.zoijcleaow();
        if (eablkybsjgVar == null) {
            metgxyhuhe(17);
        }
        return eablkybsjgVar;
    }

    @Override // mh.kcexrzcfyt, jh.zoijcleaow
    public void skhdrjzrfn(Collection collection) {
        if (collection == null) {
            metgxyhuhe(22);
        }
    }

    public dxjokdxxww t(List list, jh.yggfygwlhe yggfygwlheVar) {
        if (list == null) {
            metgxyhuhe(13);
        }
        if (yggfygwlheVar == null) {
            metgxyhuhe(14);
        }
        u(list, yggfygwlheVar, zoijcleaow().rgvfuqvkyq());
        return this;
    }

    @Override // mh.kcexrzcfyt, jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return ojitshcjhnVar.lqeggnwhkg(this, obj);
    }

    public dxjokdxxww u(List list, jh.yggfygwlhe yggfygwlheVar, List list2) {
        if (list == null) {
            metgxyhuhe(10);
        }
        if (yggfygwlheVar == null) {
            metgxyhuhe(11);
        }
        if (list2 == null) {
            metgxyhuhe(12);
        }
        super.fmlbqenlif(null, o(), n(), list2, list, null, jh.cdpycssgdh.FINAL, yggfygwlheVar);
        return this;
    }

    @Override // jh.draadjrbmk
    public boolean vipkmwdibw() {
        return this.f66967crxdokpmqz;
    }

    @Override // mh.kcexrzcfyt, jh.lereixgezr, jh.rlfsiqarku
    public jh.wkgbmnqykc ppxfxbqfkf(wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar == null) {
            metgxyhuhe(20);
        }
        return (jh.wkgbmnqykc) super.ppxfxbqfkf(wizcaqwiakVar);
    }

    @Override // mh.agtfadlqog, mh.wflxmlrfwp, jh.wflxmlrfwp
    public jh.wkgbmnqykc iobyxmoadg() {
        jh.wkgbmnqykc wkgbmnqykcVar = (jh.wkgbmnqykc) super.iobyxmoadg();
        if (wkgbmnqykcVar == null) {
            metgxyhuhe(19);
        }
        return wkgbmnqykcVar;
    }
}
