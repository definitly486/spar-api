package uh;

import gg.vdvldrhtss;
import gj.kcexrzcfyt;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.List;
import java.util.Map;
import jh.cdpycssgdh;
import jh.jztzpxfvev;
import jh.lereixgezr;
import jh.vipkmwdibw;
import jh.wflxmlrfwp;
import jh.xrmfcynszj;
import jh.yggfygwlhe;
import mh.dsvhmnatus;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg extends dsvhmnatus implements uh.iobyxmoadg {

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    public static final jh.iobyxmoadg.InterfaceC1104iobyxmoadg f113559ribwqtqdhb = new iobyxmoadg();

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    public static final jh.iobyxmoadg.InterfaceC1104iobyxmoadg f113560vipkmwdibw = new zoijcleaow();

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private ppxfxbqfkf f113561crxdokpmqz;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final boolean f113562jlmebxxoox;

    static class iobyxmoadg implements jh.iobyxmoadg.InterfaceC1104iobyxmoadg {
        iobyxmoadg() {
        }
    }

    private enum ppxfxbqfkf {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final boolean f113568yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final boolean f113569zdlpuopuiu;

        ppxfxbqfkf(boolean z13, boolean z14) {
            this.f113569zdlpuopuiu = z13;
            this.f113568yggfygwlhe = z14;
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static ppxfxbqfkf wkgbmnqykc(boolean z13, boolean z14) {
            ppxfxbqfkf ppxfxbqfkfVar;
            if (z13) {
                ppxfxbqfkfVar = z14 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                ppxfxbqfkfVar = z14 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (ppxfxbqfkfVar == null) {
                iobyxmoadg(0);
            }
            return ppxfxbqfkfVar;
        }
    }

    static class zoijcleaow implements jh.iobyxmoadg.InterfaceC1104iobyxmoadg {
        zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected eablkybsjg(wflxmlrfwp wflxmlrfwpVar, jztzpxfvev jztzpxfvevVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar, boolean z13) {
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
        this.f113561crxdokpmqz = null;
        this.f113562jlmebxxoox = z13;
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 13 || i13 == 18 || i13 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 13 || i13 == 18 || i13 == 21) ? 2 : 3];
        switch (i13) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i13 == 13) {
            objArr[1] = "initialize";
        } else if (i13 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i13 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i13) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 13 && i13 != 18 && i13 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static eablkybsjg s(wflxmlrfwp wflxmlrfwpVar, kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, xrmfcynszj xrmfcynszjVar, boolean z13) {
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(5);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(6);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(7);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(8);
        }
        return new eablkybsjg(wflxmlrfwpVar, null, nufgyqmvbuVar, gxszxtbevoVar, jh.zoijcleaow.iobyxmoadg.DECLARATION, xrmfcynszjVar, z13);
    }

    @Override // mh.kcexrzcfyt
    public boolean jrbgnlbqoe() {
        return this.f113561crxdokpmqz.f113569zdlpuopuiu;
    }

    @Override // mh.kcexrzcfyt, jh.iobyxmoadg
    public boolean jztzpxfvev() {
        return this.f113561crxdokpmqz.f113568yggfygwlhe;
    }

    @Override // mh.dsvhmnatus
    public dsvhmnatus r(vipkmwdibw vipkmwdibwVar, vipkmwdibw vipkmwdibwVar2, List list, List list2, List list3, kegysxyocb kegysxyocbVar, cdpycssgdh cdpycssgdhVar, yggfygwlhe yggfygwlheVar, Map map) {
        if (list == null) {
            metgxyhuhe(9);
        }
        if (list2 == null) {
            metgxyhuhe(10);
        }
        if (list3 == null) {
            metgxyhuhe(11);
        }
        if (yggfygwlheVar == null) {
            metgxyhuhe(12);
        }
        dsvhmnatus dsvhmnatusVarR = super.r(vipkmwdibwVar, vipkmwdibwVar2, list, list2, list3, kegysxyocbVar, cdpycssgdhVar, yggfygwlheVar, map);
        i(kcexrzcfyt.f37556iobyxmoadg.iobyxmoadg(dsvhmnatusVarR).iobyxmoadg());
        if (dsvhmnatusVarR == null) {
            metgxyhuhe(13);
        }
        return dsvhmnatusVarR;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mh.dsvhmnatus, mh.kcexrzcfyt
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public eablkybsjg fyldjkxazc(wflxmlrfwp wflxmlrfwpVar, lereixgezr lereixgezrVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, ii.gxszxtbevo gxszxtbevoVar, kh.nufgyqmvbu nufgyqmvbuVar, xrmfcynszj xrmfcynszjVar) {
        if (wflxmlrfwpVar == null) {
            metgxyhuhe(14);
        }
        if (iobyxmoadgVar == null) {
            metgxyhuhe(15);
        }
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(16);
        }
        if (xrmfcynszjVar == null) {
            metgxyhuhe(17);
        }
        jztzpxfvev jztzpxfvevVar = (jztzpxfvev) lereixgezrVar;
        if (gxszxtbevoVar == null) {
            gxszxtbevoVar = getName();
        }
        eablkybsjg eablkybsjgVar = new eablkybsjg(wflxmlrfwpVar, jztzpxfvevVar, nufgyqmvbuVar, gxszxtbevoVar, iobyxmoadgVar, xrmfcynszjVar, this.f113562jlmebxxoox);
        eablkybsjgVar.v(jrbgnlbqoe(), jztzpxfvev());
        return eablkybsjgVar;
    }

    @Override // uh.iobyxmoadg
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public eablkybsjg xrmfcynszj(kegysxyocb kegysxyocbVar, List list, kegysxyocb kegysxyocbVar2, vdvldrhtss vdvldrhtssVar) {
        if (list == null) {
            metgxyhuhe(19);
        }
        if (kegysxyocbVar2 == null) {
            metgxyhuhe(20);
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) yggfygwlhe().ppxfxbqfkf(nufgyqmvbu.iobyxmoadg(list, dxjokdxxww(), this)).wkgbmnqykc(kegysxyocbVar2).agtfadlqog(kegysxyocbVar == null ? null : li.nufgyqmvbu.dxjokdxxww(this, kegysxyocbVar, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow())).iobyxmoadg().wflxmlrfwp().build();
        if (vdvldrhtssVar != null) {
            eablkybsjgVar.yzdjzghtvl((jh.iobyxmoadg.InterfaceC1104iobyxmoadg) vdvldrhtssVar.lqeggnwhkg(), vdvldrhtssVar.nufgyqmvbu());
        }
        if (eablkybsjgVar == null) {
            metgxyhuhe(21);
        }
        return eablkybsjgVar;
    }

    public void v(boolean z13, boolean z14) {
        this.f113561crxdokpmqz = ppxfxbqfkf.wkgbmnqykc(z13, z14);
    }
}
