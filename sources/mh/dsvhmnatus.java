package mh;

import io.appmetrica.analytics.impl.C4007z9;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh.jztzpxfvev;
import jh.vipkmwdibw;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public class dsvhmnatus extends kcexrzcfyt implements jztzpxfvev {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected dsvhmnatus(jh.wflxmlrfwp wflxmlrfwpVar, jztzpxfvev jztzpxfvevVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar) {
        super(wflxmlrfwpVar, jztzpxfvevVar, nufgyqmvbuVar, gxszxtbevoVar, iobyxmoadgVar, xrmfcynszjVar);
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(0);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(1);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(2);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(3);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(4);
        }
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 13 || i13 == 18 || i13 == 23 || i13 == 24 || i13 == 29 || i13 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 13 || i13 == 18 || i13 == 23 || i13 == 24 || i13 == 29 || i13 == 30) ? 2 : 3];
        switch (i13) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 3:
            case 8:
            case C4007z9.G /* 26 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case C4007z9.I /* 29 */:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case C4007z9.F /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i13 == 13 || i13 == 18 || i13 == 23) {
            objArr[1] = "initialize";
        } else if (i13 == 24) {
            objArr[1] = "getOriginal";
        } else if (i13 == 29) {
            objArr[1] = "copy";
        } else if (i13 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case C4007z9.I /* 29 */:
            case 30:
                break;
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 13 && i13 != 18 && i13 != 23 && i13 != 24 && i13 != 29 && i13 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static dsvhmnatus o(jh.wflxmlrfwp wflxmlrfwpVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar) {
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(5);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(6);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(7);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(8);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(9);
        }
        return new dsvhmnatus(wflxmlrfwpVar, null, nufgyqmvbuVar, gxszxtbevoVar, iobyxmoadgVar, xrmfcynszjVar);
    }

    @Override // mh.kcexrzcfyt
    protected kcexrzcfyt fyldjkxazc(jh.wflxmlrfwp wflxmlrfwpVar, jh.lereixgezr lereixgezrVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, ii.gxszxtbevo gxszxtbevoVar, kh.nufgyqmvbu nufgyqmvbuVar, xrmfcynszj xrmfcynszjVar) {
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(25);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(26);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(27);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(28);
        }
        jztzpxfvev jztzpxfvevVar = (jztzpxfvev) lereixgezrVar;
        if (gxszxtbevoVar == null) {
            gxszxtbevoVar = getName();
        }
        return new dsvhmnatus(wflxmlrfwpVar, jztzpxfvevVar, nufgyqmvbuVar, gxszxtbevoVar, iobyxmoadgVar, xrmfcynszjVar);
    }

    @Override // jh.zoijcleaow
    /* JADX INFO: renamed from: n */
    public jztzpxfvev crxdokpmqz(jh.wflxmlrfwp wflxmlrfwpVar, jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, boolean z13) {
        jztzpxfvev jztzpxfvevVar = (jztzpxfvev) super.ageimvtcrz(wflxmlrfwpVar, cdpycssgdhVar, yggfygwlheVar, iobyxmoadgVar, z13);
        if (jztzpxfvevVar == null) {
            metgxyhuhe(29);
        }
        return jztzpxfvevVar;
    }

    @Override // mh.agtfadlqog, mh.wflxmlrfwp, jh.wflxmlrfwp
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public jztzpxfvev iobyxmoadg() {
        jztzpxfvev jztzpxfvevVar = (jztzpxfvev) super.iobyxmoadg();
        if (jztzpxfvevVar == null) {
            metgxyhuhe(24);
        }
        return jztzpxfvevVar;
    }

    @Override // mh.kcexrzcfyt
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public dsvhmnatus fmlbqenlif(vipkmwdibw vipkmwdibwVar, vipkmwdibw vipkmwdibwVar2, List list, List list2, List list3, zi.kegysxyocb kegysxyocbVar, jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar) {
        if (list == null) {
            metgxyhuhe(14);
        }
        if (list2 == null) {
            metgxyhuhe(15);
        }
        if (list3 == null) {
            metgxyhuhe(16);
        }
        if (yggfygwlheVar == null) {
            metgxyhuhe(17);
        }
        dsvhmnatus dsvhmnatusVarR = r(vipkmwdibwVar, vipkmwdibwVar2, list, list2, list3, kegysxyocbVar, cdpycssgdhVar, yggfygwlheVar, null);
        if (dsvhmnatusVarR == null) {
            metgxyhuhe(18);
        }
        return dsvhmnatusVarR;
    }

    public dsvhmnatus r(vipkmwdibw vipkmwdibwVar, vipkmwdibw vipkmwdibwVar2, List list, List list2, List list3, zi.kegysxyocb kegysxyocbVar, jh.cdpycssgdh cdpycssgdhVar, jh.yggfygwlhe yggfygwlheVar, Map map) {
        if (list == null) {
            metgxyhuhe(19);
        }
        if (list2 == null) {
            metgxyhuhe(20);
        }
        if (list3 == null) {
            metgxyhuhe(21);
        }
        if (yggfygwlheVar == null) {
            metgxyhuhe(22);
        }
        super.fmlbqenlif(vipkmwdibwVar, vipkmwdibwVar2, list, list2, list3, kegysxyocbVar, cdpycssgdhVar, yggfygwlheVar);
        if (map != null && !map.isEmpty()) {
            this.f67062sopmlzcsov = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // mh.kcexrzcfyt, jh.lereixgezr, jh.jztzpxfvev
    public jh.lereixgezr.iobyxmoadg yggfygwlhe() {
        jh.lereixgezr.iobyxmoadg iobyxmoadgVarYggfygwlhe = super.yggfygwlhe();
        if (iobyxmoadgVarYggfygwlhe == null) {
            metgxyhuhe(30);
        }
        return iobyxmoadgVarYggfygwlhe;
    }
}
