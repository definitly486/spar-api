package spay.sdk;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jc2.iobyxmoadg;
import kk.a3;
import kk.al;
import kk.av;
import kk.b9;
import kk.cr;
import kk.crxdokpmqz;
import kk.dc0;
import kk.ei0;
import kk.f4;
import kk.f8;
import kk.fj;
import kk.g8;
import kk.ge;
import kk.gz;
import kk.ia0;
import kk.j7;
import kk.j8;
import kk.ka;
import kk.kb;
import kk.kq;
import kk.m60;
import kk.md0;
import kk.na;
import kk.nb;
import kk.nu;
import kk.ob;
import kk.or;
import kk.pd;
import kk.qc;
import kk.rm;
import kk.rs;
import kk.s80;
import kk.sb;
import kk.sx;
import kk.uc0;
import kk.wc0;
import kk.we;
import kk.y60;
import kk.ya0;
import kk.yp;
import kk.z1;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import mj.kcexrzcfyt;
import npi.spay.Bn;
import npi.spay.Dn;
import pj.cllcsxoeiz;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.response.SPaySdkConfig;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends draadjrbmk implements rgvfuqvkyq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m60 f107833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9 f107834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ka f107835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gxszxtbevo gxszxtbevoVar, b9 b9Var, m60 m60Var, ka kaVar) {
        super(2, gxszxtbevoVar);
        this.f107833a = m60Var;
        this.f107834b = b9Var;
        this.f107835c = kaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
        return new a(gxszxtbevoVar, this.f107834b, this.f107833a, this.f107835c);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((cllcsxoeiz) obj, (gxszxtbevo) obj2)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ef  */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Integer numVdvldrhtss;
        Integer numVdvldrhtss2;
        List<String> listWflxmlrfwp;
        Object next;
        y60 gzVar;
        SPaySdkConfig.FeatureToggle featureToggle;
        zoijcleaow.gxszxtbevo();
        zdlpuopuiu.zoijcleaow(obj);
        m60 m60Var = this.f107833a;
        b9 b9Var = this.f107834b;
        ka kaVar = this.f107835c;
        wc0 wc0Var = b9Var.f55927gtknphoqwx;
        s80 s80Var = (s80) m60Var;
        SPaySdkConfig config = s80Var.f58531ppxfxbqfkf;
        if (config == null) {
            throw Bn.f70538zdlpuopuiu;
        }
        wc0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(config, "config");
        if (config.getVersionInfo() != null) {
            wc0Var.f59127iobyxmoadg = new we();
        }
        wc0Var.f59130zoijcleaow = new cr();
        byte b13 = 1;
        if (!config.getFeaturesToggle().isEmpty()) {
            for (uc0 uc0Var : wc0Var.f59129wkgbmnqykc.keySet()) {
                Map map = wc0Var.f59129wkgbmnqykc;
                String str = uc0Var.f58838zdlpuopuiu;
                Iterator<T> it = config.getFeaturesToggle().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    featureToggle = (SPaySdkConfig.FeatureToggle) next;
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(featureToggle != null ? featureToggle.getName() : null, str));
                SPaySdkConfig.FeatureToggle featureToggle2 = (SPaySdkConfig.FeatureToggle) next;
                if (featureToggle2 == null || !featureToggle2.getValue()) {
                    gzVar = null;
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "refreshToken")) {
                    gzVar = new kb();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "bnpl")) {
                    gzVar = new sb();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "compoundWallet")) {
                    gzVar = new or();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "cardBalance")) {
                    gzVar = new rs();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "bnpl")) {
                    gzVar = new z1();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "sbp")) {
                    gzVar = new ge();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "newCreditCard")) {
                    gzVar = new a3();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "newDebitCard")) {
                    gzVar = new f4();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "retries")) {
                    gzVar = new pd();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "spasiboBonuses")) {
                    gzVar = new ya0();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "spasiboBonusesPayment") ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "spasiboBonusesPaymentv2")) {
                    ia0 ia0Var = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "spasiboBonusesPayment") ? dc0.f56257iobyxmoadg : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "spasiboBonusesPaymentv2") ? md0.f57633iobyxmoadg : null;
                    ei0 ei0Var = wc0Var.f59128ppxfxbqfkf;
                    if (ei0Var == null) {
                        ei0Var = new ei0();
                        wc0Var.f59128ppxfxbqfkf = ei0Var;
                    }
                    ei0Var.zoijcleaow(ia0Var);
                    gzVar = wc0Var.f59128ppxfxbqfkf;
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "sortListCards")) {
                    gzVar = new av();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "useCachedCardsList")) {
                    gzVar = new f8();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "ssl")) {
                    gzVar = new na();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "dynatrace")) {
                    gzVar = new j7();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "clickStream")) {
                    gzVar = new j8();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "localSessionId")) {
                    gzVar = new al();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "seamlessAuth")) {
                    gzVar = new rm();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "payBinding")) {
                    gzVar = new kk.zdlpuopuiu();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "phoneNumberAuth")) {
                    gzVar = new nu();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "appAuth")) {
                    gzVar = new sx();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "phoneNumberAuthSsl")) {
                    gzVar = new gz();
                } else {
                    gzVar = null;
                }
                map.put(uc0Var, gzVar);
            }
        }
        wc0 wc0Var2 = b9Var.f55927gtknphoqwx;
        uc0 tag = uc0.BNPL;
        wc0Var2.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        y60 y60Var = (y60) wc0Var2.f59129wkgbmnqykc.get(tag);
        if (y60Var != null) {
            SPaySdkInitConfig sPaySdkInitConfig = ((nb) kaVar).f57752iobyxmoadg;
            if (sPaySdkInitConfig == null) {
                throw Dn.f70543zdlpuopuiu;
            }
            y60Var.zoijcleaow(new g8(sPaySdkInitConfig.getEnableBnpl()));
        }
        wc0 wc0Var3 = b9Var.f55927gtknphoqwx;
        uc0 tag2 = uc0.COMPOUND_WALLET;
        wc0Var3.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag2, "tag");
        y60 y60Var2 = (y60) wc0Var3.f59129wkgbmnqykc.get(tag2);
        if (y60Var2 != null) {
            y60Var2.zoijcleaow(new kq());
        }
        we weVar = b9Var.f55927gtknphoqwx.f59127iobyxmoadg;
        if (weVar != null) {
            SPaySdkConfig sPaySdkConfig = s80Var.f58531ppxfxbqfkf;
            if (sPaySdkConfig == null) {
                throw Bn.f70538zdlpuopuiu;
            }
            SPaySdkConfig.VersionInfo versionInfo = sPaySdkConfig.getVersionInfo();
            if (versionInfo == null || (listWflxmlrfwp = versionInfo.getDeprecated()) == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            weVar.zoijcleaow(new qc(listWflxmlrfwp));
            SPaySdkConfig sPaySdkConfig2 = s80Var.f58531ppxfxbqfkf;
            if (sPaySdkConfig2 == null) {
                throw Bn.f70538zdlpuopuiu;
            }
            SPaySdkConfig.VersionInfo versionInfo2 = sPaySdkConfig2.getVersionInfo();
            String active = versionInfo2 != null ? versionInfo2.getActive() : null;
            if (active == null) {
                active = "";
            }
            weVar.zoijcleaow(new ob(active));
        }
        kk.jyumaefscl onDebug = kk.jyumaefscl.f57237zdlpuopuiu;
        crxdokpmqz onRelease = new crxdokpmqz(kaVar);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDebug, "onDebug");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onRelease, "onRelease");
        boolean zBooleanValue = ((Boolean) onRelease.invoke()).booleanValue();
        cr crVar = b9Var.f55927gtknphoqwx.f59130zoijcleaow;
        if (crVar != null) {
            crVar.zoijcleaow(new yp(zBooleanValue));
        }
        SPaySdkConfig sPaySdkConfig3 = s80Var.f58531ppxfxbqfkf;
        if (sPaySdkConfig3 == null) {
            throw Bn.f70538zdlpuopuiu;
        }
        String v13 = sPaySdkConfig3.getVersion();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(v13, "v1");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("3.0.6", "v2");
        List listIxidwrxhsl = kcexrzcfyt.ixidwrxhsl(v13, new String[]{"."}, false, 0, 6, null);
        List listIxidwrxhsl2 = kcexrzcfyt.ixidwrxhsl("3.0.6", new String[]{"."}, false, 0, 6, null);
        int iMax = Math.max(listIxidwrxhsl.size(), listIxidwrxhsl2.size());
        int i13 = 0;
        while (true) {
            if (i13 >= iMax) {
                b13 = 0;
                break;
            }
            String str2 = (String) jyumaefscl.lrnfpwlwnk(listIxidwrxhsl, i13);
            int iIntValue = (str2 == null || (numVdvldrhtss2 = kcexrzcfyt.vdvldrhtss(str2)) == null) ? 0 : numVdvldrhtss2.intValue();
            String str3 = (String) jyumaefscl.lrnfpwlwnk(listIxidwrxhsl2, i13);
            int iIntValue2 = (str3 == null || (numVdvldrhtss = kcexrzcfyt.vdvldrhtss(str3)) == null) ? 0 : numVdvldrhtss.intValue();
            if (iIntValue < iIntValue2) {
                b13 = -1;
                break;
            }
            if (iIntValue > iIntValue2) {
                break;
            }
            i13++;
        }
        if (b13 > 0) {
            fj fjVar = b9Var.f55948vdvldrhtss;
            int i14 = R.string.spay_update_sdk_version_error_message;
            SPaySdkConfig sPaySdkConfig4 = s80Var.f58531ppxfxbqfkf;
            if (sPaySdkConfig4 == null) {
                throw Bn.f70538zdlpuopuiu;
            }
            iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPaySdk").zoijcleaow(fjVar.iobyxmoadg(i14, sPaySdkConfig4.getVersion()), new Object[0]);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
