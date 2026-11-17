package mh;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import jh.vipkmwdibw;
import jh.xrmfcynszj;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.mhtqkkgtqm;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf extends wflxmlrfwp implements vipkmwdibw {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(kh.nufgyqmvbu nufgyqmvbuVar) {
        super(nufgyqmvbuVar, ii.nufgyqmvbu.f44463dxjokdxxww);
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(0);
        }
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 2:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i13) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // jh.iobyxmoadg
    public List dxjokdxxww() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            metgxyhuhe(7);
        }
        return listEmptyList;
    }

    @Override // jh.iobyxmoadg
    public Collection eablkybsjg() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            metgxyhuhe(8);
        }
        return setEmptySet;
    }

    @Override // jh.iobyxmoadg
    public zi.kegysxyocb getReturnType() {
        return getType();
    }

    @Override // jh.opjhrmiecq
    public zi.kegysxyocb getType() {
        zi.kegysxyocb type = getValue().getType();
        if (type == null) {
            metgxyhuhe(6);
        }
        return type;
    }

    @Override // jh.iobyxmoadg
    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            metgxyhuhe(5);
        }
        return listEmptyList;
    }

    @Override // jh.vdvldrhtss, jh.istkbnxepw
    public jh.yggfygwlhe getVisibility() {
        jh.yggfygwlhe yggfygwlheVar = jh.zdlpuopuiu.f51356gxszxtbevo;
        if (yggfygwlheVar == null) {
            metgxyhuhe(9);
        }
        return yggfygwlheVar;
    }

    @Override // jh.iobyxmoadg
    public vipkmwdibw hcddaimhww() {
        return null;
    }

    @Override // jh.iobyxmoadg
    public vipkmwdibw hkdspvbjdz() {
        return null;
    }

    @Override // mh.wflxmlrfwp, jh.wflxmlrfwp
    /* JADX INFO: renamed from: igdgnonuha, reason: merged with bridge method [inline-methods] */
    public jh.ntlheqmsrt iobyxmoadg() {
        return this;
    }

    @Override // jh.iobyxmoadg
    public boolean jztzpxfvev() {
        return false;
    }

    @Override // jh.rgvfuqvkyq
    public xrmfcynszj lqeggnwhkg() {
        xrmfcynszj xrmfcynszjVar = xrmfcynszj.f51348iobyxmoadg;
        if (xrmfcynszjVar == null) {
            metgxyhuhe(11);
        }
        return xrmfcynszjVar;
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return ojitshcjhnVar.iobyxmoadg(this, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(kh.nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar) {
        super(nufgyqmvbuVar, gxszxtbevoVar);
        if (nufgyqmvbuVar == null) {
            metgxyhuhe(1);
        }
        if (gxszxtbevoVar == null) {
            metgxyhuhe(2);
        }
    }

    @Override // jh.rlfsiqarku
    public vipkmwdibw ppxfxbqfkf(wizcaqwiak wizcaqwiakVar) {
        if (wizcaqwiakVar == null) {
            metgxyhuhe(3);
        }
        if (wizcaqwiakVar.gtknphoqwx()) {
            return this;
        }
        zi.kegysxyocb kegysxyocbVarRgvfuqvkyq = zoijcleaow() instanceof jh.eablkybsjg ? wizcaqwiakVar.rgvfuqvkyq(getType(), mhtqkkgtqm.OUT_VARIANCE) : wizcaqwiakVar.rgvfuqvkyq(getType(), mhtqkkgtqm.INVARIANT);
        if (kegysxyocbVarRgvfuqvkyq == null) {
            return null;
        }
        return kegysxyocbVarRgvfuqvkyq == getType() ? this : new cllcsxoeiz(zoijcleaow(), new ti.dxjokdxxww(kegysxyocbVarRgvfuqvkyq), getAnnotations());
    }
}
