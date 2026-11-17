package yl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Iterator;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
abstract class agtfadlqog {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final agtfadlqog f125609zdlpuopuiu = new gtknphoqwx("Initial", 0);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final agtfadlqog f125607yggfygwlhe = new agtfadlqog("BeforeHtml", 1) { // from class: yl.agtfadlqog.oxmwwwfdhm
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            wflxmlrfwpVar.vdvldrhtss("html");
            wflxmlrfwpVar.j(agtfadlqog.f125596jyumaefscl);
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.draadjrbmk()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
                return true;
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("html")) {
                wflxmlrfwpVar.uwvvkdfqfp(ylkuphrtabVar.eablkybsjg());
                wflxmlrfwpVar.j(agtfadlqog.f125596jyumaefscl);
                return true;
            }
            if ((!ylkuphrtabVar.agtfadlqog() || !wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.wkgbmnqykc().pkzmftpjix(), lereixgezr.f125617eablkybsjg)) && ylkuphrtabVar.agtfadlqog()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
        }
    };

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final agtfadlqog f125596jyumaefscl = new agtfadlqog("BeforeHead", 2) { // from class: yl.agtfadlqog.kcexrzcfyt
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
                return true;
            }
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (ylkuphrtabVar.draadjrbmk()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("html")) {
                return agtfadlqog.f125598lereixgezr.ojitshcjhn(ylkuphrtabVar, wflxmlrfwpVar);
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("head")) {
                wflxmlrfwpVar.g(wflxmlrfwpVar.uwvvkdfqfp(ylkuphrtabVar.eablkybsjg()));
                wflxmlrfwpVar.j(agtfadlqog.f125594iwizpuwonk);
                return true;
            }
            if (ylkuphrtabVar.agtfadlqog() && wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.wkgbmnqykc().pkzmftpjix(), lereixgezr.f125617eablkybsjg)) {
                wflxmlrfwpVar.vdvldrhtss("head");
                return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
            }
            if (ylkuphrtabVar.agtfadlqog()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            wflxmlrfwpVar.vdvldrhtss("head");
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }
    };

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final agtfadlqog f125594iwizpuwonk = new agtfadlqog("InHead", 3) { // from class: yl.agtfadlqog.zdlpuopuiu
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, dsvhmnatus dsvhmnatusVar) {
            dsvhmnatusVar.rgvfuqvkyq("head");
            return dsvhmnatusVar.ojitshcjhn(ylkuphrtabVar);
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
                return true;
            }
            int i13 = vdvldrhtss.f125650iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()];
            if (i13 == 1) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
            } else {
                if (i13 == 2) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                if (i13 == 3) {
                    ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
                    String strPkzmftpjix = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
                    if (strPkzmftpjix.equals("html")) {
                        return agtfadlqog.f125598lereixgezr.ojitshcjhn(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125623iobyxmoadg)) {
                        xl.wflxmlrfwp wflxmlrfwpVarYfnezrywwk = wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                        if (strPkzmftpjix.equals("base") && wflxmlrfwpVarYfnezrywwk.jyumaefscl("href")) {
                            wflxmlrfwpVar.auzgnhcxok(wflxmlrfwpVarYfnezrywwk);
                        }
                    } else if (strPkzmftpjix.equals("meta")) {
                        wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                    } else if (strPkzmftpjix.equals("title") || wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125648zoijcleaow)) {
                        agtfadlqog.wkgbmnqykc(nufgyqmvbuVarEablkybsjg, wflxmlrfwpVar, wflxmlrfwpVar.jyumaefscl(nufgyqmvbuVarEablkybsjg).rgvfuqvkyq());
                    } else if (strPkzmftpjix.equals("noscript")) {
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                        wflxmlrfwpVar.j(agtfadlqog.f125587cqumvgiudr);
                    } else if (strPkzmftpjix.equals("script")) {
                        wflxmlrfwpVar.f125747ppxfxbqfkf.cqumvgiudr(cllcsxoeiz.f125661esjtqupxsv);
                        wflxmlrfwpVar.uawqvzlxes();
                        wflxmlrfwpVar.j(agtfadlqog.f125601pmvmpeiblj);
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    } else {
                        if (strPkzmftpjix.equals("head")) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                            return false;
                        }
                        if (!strPkzmftpjix.equals("template")) {
                            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                        }
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                        wflxmlrfwpVar.oipsdeybqn();
                        wflxmlrfwpVar.hcddaimhww(false);
                        agtfadlqog agtfadlqogVar = agtfadlqog.f125590hcddaimhww;
                        wflxmlrfwpVar.j(agtfadlqogVar);
                        wflxmlrfwpVar.ixidwrxhsl(agtfadlqogVar);
                    }
                } else {
                    if (i13 != 4) {
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    String strPkzmftpjix2 = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
                    if (strPkzmftpjix2.equals("head")) {
                        wflxmlrfwpVar.agtfadlqog();
                        wflxmlrfwpVar.j(agtfadlqog.f125589esjtqupxsv);
                    } else {
                        if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125638ppxfxbqfkf)) {
                            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                        }
                        if (!strPkzmftpjix2.equals("template")) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                            return false;
                        }
                        if (wflxmlrfwpVar.dvvnrvtcbc(strPkzmftpjix2)) {
                            wflxmlrfwpVar.dsvhmnatus(true);
                            if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix2)) {
                                wflxmlrfwpVar.pkzmftpjix(this);
                            }
                            wflxmlrfwpVar.hszhottldk(strPkzmftpjix2);
                            wflxmlrfwpVar.pmvmpeiblj();
                            wflxmlrfwpVar.fyldjkxazc();
                            wflxmlrfwpVar.c();
                        } else {
                            wflxmlrfwpVar.pkzmftpjix(this);
                        }
                    }
                }
            }
            return true;
        }
    };

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final agtfadlqog f125587cqumvgiudr = new agtfadlqog("InHeadNoscript", 4) { // from class: yl.agtfadlqog.yggfygwlhe
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            wflxmlrfwpVar.pkzmftpjix(this);
            wflxmlrfwpVar.metgxyhuhe(new ylkuphrtab.ppxfxbqfkf().yggfygwlhe(ylkuphrtabVar.toString()));
            return true;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.draadjrbmk()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return true;
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("html")) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
            }
            if (ylkuphrtabVar.agtfadlqog() && ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("noscript")) {
                wflxmlrfwpVar.agtfadlqog();
                wflxmlrfwpVar.j(agtfadlqog.f125594iwizpuwonk);
                return true;
            }
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar) || ylkuphrtabVar.gtknphoqwx() || (ylkuphrtabVar.ojitshcjhn() && wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.eablkybsjg().pkzmftpjix(), lereixgezr.f125620gxszxtbevo))) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
            }
            if (ylkuphrtabVar.agtfadlqog() && ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("br")) {
                return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
            }
            if ((!ylkuphrtabVar.ojitshcjhn() || !wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.eablkybsjg().pkzmftpjix(), lereixgezr.f125646ylkuphrtab)) && !ylkuphrtabVar.agtfadlqog()) {
                return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
            }
            wflxmlrfwpVar.pkzmftpjix(this);
            return false;
        }
    };

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final agtfadlqog f125589esjtqupxsv = new agtfadlqog("AfterHead", 5) { // from class: yl.agtfadlqog.jyumaefscl
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            wflxmlrfwpVar.vdvldrhtss("body");
            wflxmlrfwpVar.hcddaimhww(true);
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
                return true;
            }
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (ylkuphrtabVar.draadjrbmk()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return true;
            }
            if (!ylkuphrtabVar.ojitshcjhn()) {
                if (!ylkuphrtabVar.agtfadlqog()) {
                    rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    return true;
                }
                String strPkzmftpjix = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
                if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125642wkgbmnqykc)) {
                    rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    return true;
                }
                if (strPkzmftpjix.equals("template")) {
                    wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                    return true;
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
            String strPkzmftpjix2 = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
            if (strPkzmftpjix2.equals("html")) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
            }
            if (strPkzmftpjix2.equals("body")) {
                wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                wflxmlrfwpVar.hcddaimhww(false);
                wflxmlrfwpVar.j(agtfadlqog.f125598lereixgezr);
                return true;
            }
            if (strPkzmftpjix2.equals("frameset")) {
                wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                wflxmlrfwpVar.j(agtfadlqog.f125591hkdspvbjdz);
                return true;
            }
            if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125632lqeggnwhkg)) {
                if (strPkzmftpjix2.equals("head")) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                return true;
            }
            wflxmlrfwpVar.pkzmftpjix(this);
            xl.wflxmlrfwp wflxmlrfwpVarNtlheqmsrt = wflxmlrfwpVar.ntlheqmsrt();
            wflxmlrfwpVar.oxmwwwfdhm(wflxmlrfwpVarNtlheqmsrt);
            wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
            wflxmlrfwpVar.rhgxfdycjh(wflxmlrfwpVarNtlheqmsrt);
            return true;
        }
    };

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final agtfadlqog f125598lereixgezr = new agtfadlqog("InBody", 6) { // from class: yl.agtfadlqog.iwizpuwonk
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v2, types: [int] */
        /* JADX WARN: Type inference failed for: r10v3, types: [int] */
        /* JADX WARN: Type inference failed for: r18v0, types: [yl.dsvhmnatus, yl.wflxmlrfwp] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r6v3, types: [int] */
        private boolean kcexrzcfyt(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            xl.wflxmlrfwp wflxmlrfwpVar2;
            xl.wflxmlrfwp wflxmlrfwpVar3;
            String str = ylkuphrtabVar.wkgbmnqykc().f125859eablkybsjg;
            ?? r13 = 1;
            if (wflxmlrfwpVar.zoijcleaow().lmojexxdyd().equals(str) && !wflxmlrfwpVar.lrnfpwlwnk(wflxmlrfwpVar.zoijcleaow())) {
                wflxmlrfwpVar.agtfadlqog();
                return true;
            }
            boolean z13 = false;
            int i13 = 0;
            while (i13 < 8) {
                i13++;
                int size = wflxmlrfwpVar.f125836zdlpuopuiu.size() - r13;
                while (true) {
                    wflxmlrfwpVar2 = null;
                    if (size < 0 || (wflxmlrfwpVar3 = (xl.wflxmlrfwp) wflxmlrfwpVar.f125836zdlpuopuiu.get(size)) == null) {
                        wflxmlrfwpVar3 = null;
                        break;
                    }
                    if (wflxmlrfwpVar3.lmojexxdyd().equals(str)) {
                        break;
                    }
                    size--;
                }
                if (wflxmlrfwpVar3 == null) {
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                if (!wflxmlrfwpVar.igdgnonuha(wflxmlrfwpVar3)) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    wflxmlrfwpVar.ezmngbhpjk(wflxmlrfwpVar3);
                    return r13;
                }
                if (!wflxmlrfwpVar.ribwqtqdhb(wflxmlrfwpVar3.lmojexxdyd())) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return z13;
                }
                if (wflxmlrfwpVar.zoijcleaow() != wflxmlrfwpVar3) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                }
                ArrayList arrayListSopmlzcsov = wflxmlrfwpVar.sopmlzcsov();
                int iLastIndexOf = arrayListSopmlzcsov.lastIndexOf(wflxmlrfwpVar3);
                if (iLastIndexOf != -1) {
                    while (true) {
                        iLastIndexOf++;
                        if (iLastIndexOf >= arrayListSopmlzcsov.size()) {
                            break;
                        }
                        xl.wflxmlrfwp wflxmlrfwpVar4 = (xl.wflxmlrfwp) arrayListSopmlzcsov.get(iLastIndexOf);
                        if (yl.wflxmlrfwp.tbqsvytpvh(wflxmlrfwpVar4)) {
                            wflxmlrfwpVar2 = wflxmlrfwpVar4;
                            break;
                        }
                    }
                }
                if (wflxmlrfwpVar2 == null) {
                    while (wflxmlrfwpVar.zoijcleaow() != wflxmlrfwpVar3) {
                        wflxmlrfwpVar.agtfadlqog();
                    }
                    wflxmlrfwpVar.agtfadlqog();
                    wflxmlrfwpVar.ezmngbhpjk(wflxmlrfwpVar3);
                    return r13;
                }
                xl.wflxmlrfwp wflxmlrfwpVarCqumvgiudr = wflxmlrfwpVar.cqumvgiudr(wflxmlrfwpVar3);
                if (wflxmlrfwpVarCqumvgiudr == null) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return r13;
                }
                int iIpoelvxyzq = wflxmlrfwpVar.ipoelvxyzq(wflxmlrfwpVar3);
                ?? r14 = z13;
                xl.wflxmlrfwp wflxmlrfwpVarHkdspvbjdz = wflxmlrfwpVar2;
                xl.wflxmlrfwp wflxmlrfwpVar5 = wflxmlrfwpVarHkdspvbjdz;
                while (true) {
                    r14 += r13 == true ? 1 : 0;
                    wflxmlrfwpVarHkdspvbjdz = !wflxmlrfwpVar.igdgnonuha(wflxmlrfwpVarHkdspvbjdz) ? wflxmlrfwpVarHkdspvbjdz.hkdspvbjdz() : wflxmlrfwpVar.cqumvgiudr(wflxmlrfwpVarHkdspvbjdz);
                    if (wflxmlrfwpVarHkdspvbjdz != null) {
                        if (wflxmlrfwpVarHkdspvbjdz == wflxmlrfwpVar3) {
                            break;
                        }
                        if (r14 > 3 && wflxmlrfwpVar.lrnfpwlwnk(wflxmlrfwpVarHkdspvbjdz)) {
                            wflxmlrfwpVar.ezmngbhpjk(wflxmlrfwpVarHkdspvbjdz);
                            break;
                        }
                        if (wflxmlrfwpVar.lrnfpwlwnk(wflxmlrfwpVarHkdspvbjdz)) {
                            xl.wflxmlrfwp wflxmlrfwpVar6 = new xl.wflxmlrfwp(wflxmlrfwpVar.yggfygwlhe(wflxmlrfwpVarHkdspvbjdz.istkbnxepw(), wflxmlrfwpVarHkdspvbjdz.lmojexxdyd(), wflxmlrfwpVar.eablkybsjg(), yl.vdvldrhtss.f125806wkgbmnqykc), wflxmlrfwpVar.stevsuqkhv());
                            wflxmlrfwpVar.eslsurpljm(wflxmlrfwpVarHkdspvbjdz, wflxmlrfwpVar6);
                            wflxmlrfwpVar.a(wflxmlrfwpVarHkdspvbjdz, wflxmlrfwpVar6);
                            if (wflxmlrfwpVar5 == wflxmlrfwpVar2) {
                                r13 = 1;
                                iIpoelvxyzq = wflxmlrfwpVar.ipoelvxyzq(wflxmlrfwpVar6) + 1;
                            } else {
                                r13 = 1;
                            }
                            wflxmlrfwpVar6.uwvvkdfqfp(wflxmlrfwpVar5);
                            wflxmlrfwpVarHkdspvbjdz = wflxmlrfwpVar6;
                            wflxmlrfwpVar5 = wflxmlrfwpVarHkdspvbjdz;
                            z13 = false;
                        } else {
                            wflxmlrfwpVar.rhgxfdycjh(wflxmlrfwpVarHkdspvbjdz);
                        }
                    } else {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        break;
                    }
                }
                wflxmlrfwpVarCqumvgiudr.uwvvkdfqfp(wflxmlrfwpVar5);
                xl.wflxmlrfwp wflxmlrfwpVar7 = new xl.wflxmlrfwp(wflxmlrfwpVar3.n(), wflxmlrfwpVar.stevsuqkhv());
                wflxmlrfwpVar7.eablkybsjg().wkgbmnqykc(wflxmlrfwpVar3.eablkybsjg());
                Iterator it = wflxmlrfwpVar2.agtfadlqog().iterator();
                while (it.hasNext()) {
                    wflxmlrfwpVar7.uwvvkdfqfp((xl.zdlpuopuiu) it.next());
                }
                wflxmlrfwpVar2.uwvvkdfqfp(wflxmlrfwpVar7);
                wflxmlrfwpVar.ezmngbhpjk(wflxmlrfwpVar3);
                wflxmlrfwpVar.jrbgnlbqoe(wflxmlrfwpVar7, iIpoelvxyzq);
                wflxmlrfwpVar.rhgxfdycjh(wflxmlrfwpVar3);
                wflxmlrfwpVar.bfopjjpdmp(wflxmlrfwpVar2, wflxmlrfwpVar7);
                r13 = r13;
            }
            return r13;
        }

        private boolean vdvldrhtss(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            ylkuphrtab.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = ylkuphrtabVar.wkgbmnqykc();
            String strPkzmftpjix = lqeggnwhkgVarWkgbmnqykc.pkzmftpjix();
            strPkzmftpjix.hashCode();
            switch (strPkzmftpjix) {
                case "template":
                    wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                    return true;
                case "p":
                    if (!wflxmlrfwpVar.crxdokpmqz(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        wflxmlrfwpVar.vdvldrhtss(strPkzmftpjix);
                        return wflxmlrfwpVar.ojitshcjhn(lqeggnwhkgVarWkgbmnqykc);
                    }
                    wflxmlrfwpVar.cllcsxoeiz(strPkzmftpjix);
                    if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    wflxmlrfwpVar.hszhottldk(strPkzmftpjix);
                    return true;
                case "br":
                    wflxmlrfwpVar.pkzmftpjix(this);
                    wflxmlrfwpVar.vdvldrhtss("br");
                    return false;
                case "dd":
                case "dt":
                    if (!wflxmlrfwpVar.ribwqtqdhb(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    wflxmlrfwpVar.cllcsxoeiz(strPkzmftpjix);
                    if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    wflxmlrfwpVar.hszhottldk(strPkzmftpjix);
                    return true;
                case "h1":
                case "h2":
                case "h3":
                case "h4":
                case "h5":
                case "h6":
                    String[] strArr = lereixgezr.f125616dxjokdxxww;
                    if (!wflxmlrfwpVar.jhduphickx(strArr)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    wflxmlrfwpVar.cllcsxoeiz(strPkzmftpjix);
                    if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    wflxmlrfwpVar.fiwbwshyhd(strArr);
                    return true;
                case "li":
                    if (!wflxmlrfwpVar.jlmebxxoox(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    wflxmlrfwpVar.cllcsxoeiz(strPkzmftpjix);
                    if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    wflxmlrfwpVar.hszhottldk(strPkzmftpjix);
                    return true;
                case "body":
                    if (!wflxmlrfwpVar.ribwqtqdhb("body")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    if (wflxmlrfwpVar.lxfrhoxuzk(lereixgezr.f125640vdvldrhtss)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    wflxmlrfwpVar.iwizpuwonk(wflxmlrfwpVar.mbcevpiqjq("body"), false);
                    wflxmlrfwpVar.j(agtfadlqog.f125595jpowsppfya);
                    return true;
                case "form":
                    if (!wflxmlrfwpVar.dvvnrvtcbc("template")) {
                        xl.oxmwwwfdhm oxmwwwfdhmVarTzroggbefp = wflxmlrfwpVar.tzroggbefp();
                        wflxmlrfwpVar.e(null);
                        if (oxmwwwfdhmVarTzroggbefp == null || !wflxmlrfwpVar.ribwqtqdhb(strPkzmftpjix)) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                            return false;
                        }
                        wflxmlrfwpVar.hkdspvbjdz();
                        if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                        }
                        wflxmlrfwpVar.rhgxfdycjh(oxmwwwfdhmVarTzroggbefp);
                    } else {
                        if (!wflxmlrfwpVar.ribwqtqdhb(strPkzmftpjix)) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                            return false;
                        }
                        wflxmlrfwpVar.hkdspvbjdz();
                        if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                        }
                        wflxmlrfwpVar.hszhottldk(strPkzmftpjix);
                    }
                    return true;
                case "html":
                    if (!wflxmlrfwpVar.dvvnrvtcbc("body")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    if (wflxmlrfwpVar.lxfrhoxuzk(lereixgezr.f125640vdvldrhtss)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    wflxmlrfwpVar.j(agtfadlqog.f125595jpowsppfya);
                    return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                case "span":
                case "sarcasm":
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                default:
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125635oxmwwwfdhm)) {
                        return kcexrzcfyt(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125639rgvfuqvkyq)) {
                        if (!wflxmlrfwpVar.ribwqtqdhb(strPkzmftpjix)) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                            return false;
                        }
                        wflxmlrfwpVar.hkdspvbjdz();
                        if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                        }
                        wflxmlrfwpVar.hszhottldk(strPkzmftpjix);
                    } else {
                        if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125615draadjrbmk)) {
                            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                        }
                        if (!wflxmlrfwpVar.ribwqtqdhb(ExternalMetricsManagerImpl.NAME)) {
                            if (!wflxmlrfwpVar.ribwqtqdhb(strPkzmftpjix)) {
                                wflxmlrfwpVar.pkzmftpjix(this);
                                return false;
                            }
                            wflxmlrfwpVar.hkdspvbjdz();
                            if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                                wflxmlrfwpVar.pkzmftpjix(this);
                            }
                            wflxmlrfwpVar.hszhottldk(strPkzmftpjix);
                            wflxmlrfwpVar.pmvmpeiblj();
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:347:0x0558  */
        /* JADX WARN: Code duplicated, block: B:376:0x05e7  */
        private boolean zdlpuopuiu(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
            String strPkzmftpjix = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
            strPkzmftpjix.hashCode();
            switch (strPkzmftpjix) {
                case "frameset":
                    wflxmlrfwpVar.pkzmftpjix(this);
                    ArrayList arrayListSopmlzcsov = wflxmlrfwpVar.sopmlzcsov();
                    if (arrayListSopmlzcsov.size() == 1) {
                        return false;
                    }
                    if ((arrayListSopmlzcsov.size() > 2 && !((xl.wflxmlrfwp) arrayListSopmlzcsov.get(1)).lereixgezr("body")) || !wflxmlrfwpVar.jpowsppfya()) {
                        return false;
                    }
                    xl.wflxmlrfwp wflxmlrfwpVar2 = (xl.wflxmlrfwp) arrayListSopmlzcsov.get(1);
                    if (wflxmlrfwpVar2.hkdspvbjdz() != null) {
                        wflxmlrfwpVar2.mbcevpiqjq();
                    }
                    while (arrayListSopmlzcsov.size() > 1) {
                        arrayListSopmlzcsov.remove(arrayListSopmlzcsov.size() - 1);
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.j(agtfadlqog.f125591hkdspvbjdz);
                    return true;
                case "button":
                    if (wflxmlrfwpVar.crxdokpmqz("button")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        wflxmlrfwpVar.rgvfuqvkyq("button");
                        wflxmlrfwpVar.ojitshcjhn(nufgyqmvbuVarEablkybsjg);
                    } else {
                        wflxmlrfwpVar.fmlbqenlif();
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                        wflxmlrfwpVar.hcddaimhww(false);
                    }
                    return true;
                case "iframe":
                    wflxmlrfwpVar.hcddaimhww(false);
                    agtfadlqog.wkgbmnqykc(nufgyqmvbuVarEablkybsjg, wflxmlrfwpVar, wflxmlrfwpVar.jyumaefscl(nufgyqmvbuVarEablkybsjg).rgvfuqvkyq());
                    return true;
                case "keygen":
                case "br":
                case "img":
                case "wbr":
                case "area":
                case "embed":
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.hcddaimhww(false);
                    return true;
                case "option":
                case "optgroup":
                    if (wflxmlrfwpVar.ppxfxbqfkf("option")) {
                        wflxmlrfwpVar.rgvfuqvkyq("option");
                    }
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "textarea":
                    wflxmlrfwpVar.hcddaimhww(false);
                    agtfadlqog.wkgbmnqykc(nufgyqmvbuVarEablkybsjg, wflxmlrfwpVar, wflxmlrfwpVar.jyumaefscl(nufgyqmvbuVarEablkybsjg).rgvfuqvkyq());
                    return true;
                case "select":
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.hcddaimhww(false);
                    if (!nufgyqmvbuVarEablkybsjg.f125861gxszxtbevo) {
                        agtfadlqog agtfadlqogVarH = wflxmlrfwpVar.h();
                        if (agtfadlqogVarH.equals(agtfadlqog.f125610zynmafqrjb) || agtfadlqogVarH.equals(agtfadlqog.f125585cdpycssgdh) || agtfadlqogVarH.equals(agtfadlqog.f125592iozdgvuglv) || agtfadlqogVarH.equals(agtfadlqog.f125599lmojexxdyd) || agtfadlqogVarH.equals(agtfadlqog.f125604wwaezpbzkn)) {
                            wflxmlrfwpVar.j(agtfadlqog.f125600pkzmftpjix);
                        } else {
                            wflxmlrfwpVar.j(agtfadlqog.f125608ylkuphrtab);
                        }
                    }
                    return true;
                case "strike":
                case "strong":
                case "b":
                case "i":
                case "s":
                case "u":
                case "em":
                case "tt":
                case "big":
                case "code":
                case "font":
                case "small":
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.mhtqkkgtqm(wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg));
                    return true;
                case "a":
                    if (wflxmlrfwpVar.wypolnanlu("a") != null) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        wflxmlrfwpVar.rgvfuqvkyq("a");
                        xl.wflxmlrfwp wflxmlrfwpVarMbcevpiqjq = wflxmlrfwpVar.mbcevpiqjq("a");
                        if (wflxmlrfwpVarMbcevpiqjq != null) {
                            wflxmlrfwpVar.ezmngbhpjk(wflxmlrfwpVarMbcevpiqjq);
                            wflxmlrfwpVar.rhgxfdycjh(wflxmlrfwpVarMbcevpiqjq);
                        }
                    }
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.mhtqkkgtqm(wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg));
                    return true;
                case "dd":
                case "dt":
                    wflxmlrfwpVar.hcddaimhww(false);
                    ArrayList arrayListSopmlzcsov2 = wflxmlrfwpVar.sopmlzcsov();
                    int size = arrayListSopmlzcsov2.size();
                    int i13 = size - 1;
                    int i14 = i13 >= 24 ? size - 25 : 0;
                    while (i13 >= i14) {
                        xl.wflxmlrfwp wflxmlrfwpVar3 = (xl.wflxmlrfwp) arrayListSopmlzcsov2.get(i13);
                        if (wl.kcexrzcfyt.lqeggnwhkg(wflxmlrfwpVar3.lmojexxdyd(), lereixgezr.f125619gtknphoqwx)) {
                            wflxmlrfwpVar.rgvfuqvkyq(wflxmlrfwpVar3.lmojexxdyd());
                        } else if (!yl.wflxmlrfwp.tbqsvytpvh(wflxmlrfwpVar3) || wl.kcexrzcfyt.lqeggnwhkg(wflxmlrfwpVar3.lmojexxdyd(), lereixgezr.f125612btonecajqb)) {
                            i13--;
                        }
                        if (wflxmlrfwpVar.crxdokpmqz("p")) {
                            wflxmlrfwpVar.rgvfuqvkyq("p");
                        }
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                        return true;
                    }
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "h1":
                case "h2":
                case "h3":
                case "h4":
                case "h5":
                case "h6":
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    if (wl.kcexrzcfyt.lqeggnwhkg(wflxmlrfwpVar.zoijcleaow().lmojexxdyd(), lereixgezr.f125616dxjokdxxww)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        wflxmlrfwpVar.agtfadlqog();
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "hr":
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.hcddaimhww(false);
                    return true;
                case "li":
                    wflxmlrfwpVar.hcddaimhww(false);
                    ArrayList arrayListSopmlzcsov3 = wflxmlrfwpVar.sopmlzcsov();
                    for (int size2 = arrayListSopmlzcsov3.size() - 1; size2 > 0; size2--) {
                        xl.wflxmlrfwp wflxmlrfwpVar4 = (xl.wflxmlrfwp) arrayListSopmlzcsov3.get(size2);
                        if (wflxmlrfwpVar4.lereixgezr("li")) {
                            wflxmlrfwpVar.rgvfuqvkyq("li");
                        } else if (!yl.wflxmlrfwp.tbqsvytpvh(wflxmlrfwpVar4) || wl.kcexrzcfyt.lqeggnwhkg(wflxmlrfwpVar4.lmojexxdyd(), lereixgezr.f125612btonecajqb)) {
                        }
                        if (wflxmlrfwpVar.crxdokpmqz("p")) {
                            wflxmlrfwpVar.rgvfuqvkyq("p");
                        }
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                        return true;
                    }
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "rb":
                case "rtc":
                    if (wflxmlrfwpVar.ribwqtqdhb("ruby")) {
                        wflxmlrfwpVar.hkdspvbjdz();
                        if (!wflxmlrfwpVar.ppxfxbqfkf("ruby")) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                        }
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "rp":
                case "rt":
                    if (wflxmlrfwpVar.ribwqtqdhb("ruby")) {
                        wflxmlrfwpVar.cllcsxoeiz("rtc");
                        if (!wflxmlrfwpVar.ppxfxbqfkf("rtc") && !wflxmlrfwpVar.ppxfxbqfkf("ruby")) {
                            wflxmlrfwpVar.pkzmftpjix(this);
                        }
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "pre":
                case "listing":
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.f125750zoijcleaow.rhgxfdycjh("\n");
                    wflxmlrfwpVar.hcddaimhww(false);
                    return true;
                case "svg":
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.ydmasvzmpa(nufgyqmvbuVarEablkybsjg, "http://www.w3.org/2000/svg");
                    return true;
                case "xmp":
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.hcddaimhww(false);
                    agtfadlqog.wkgbmnqykc(nufgyqmvbuVarEablkybsjg, wflxmlrfwpVar, wflxmlrfwpVar.jyumaefscl(nufgyqmvbuVarEablkybsjg).rgvfuqvkyq());
                    return true;
                case "body":
                    wflxmlrfwpVar.pkzmftpjix(this);
                    ArrayList arrayListSopmlzcsov4 = wflxmlrfwpVar.sopmlzcsov();
                    if (arrayListSopmlzcsov4.size() == 1) {
                        return false;
                    }
                    if ((arrayListSopmlzcsov4.size() > 2 && !((xl.wflxmlrfwp) arrayListSopmlzcsov4.get(1)).lereixgezr("body")) || wflxmlrfwpVar.dvvnrvtcbc("template")) {
                        return false;
                    }
                    wflxmlrfwpVar.hcddaimhww(false);
                    xl.wflxmlrfwp wflxmlrfwpVarMbcevpiqjq2 = wflxmlrfwpVar.mbcevpiqjq("body");
                    if (wflxmlrfwpVarMbcevpiqjq2 != null) {
                        agtfadlqog.agtfadlqog(nufgyqmvbuVarEablkybsjg, wflxmlrfwpVarMbcevpiqjq2);
                    }
                    return true;
                case "form":
                    if (wflxmlrfwpVar.tzroggbefp() != null && !wflxmlrfwpVar.dvvnrvtcbc("template")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.iozdgvuglv("p");
                    }
                    wflxmlrfwpVar.sflfametgt(nufgyqmvbuVarEablkybsjg, true, true);
                    return true;
                case "html":
                    wflxmlrfwpVar.pkzmftpjix(this);
                    if (wflxmlrfwpVar.dvvnrvtcbc("template")) {
                        return false;
                    }
                    if (wflxmlrfwpVar.sopmlzcsov().size() > 0) {
                        agtfadlqog.agtfadlqog(nufgyqmvbuVarEablkybsjg, (xl.wflxmlrfwp) wflxmlrfwpVar.sopmlzcsov().get(0));
                    }
                    return true;
                case "math":
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.ydmasvzmpa(nufgyqmvbuVarEablkybsjg, "http://www.w3.org/1998/Math/MathML");
                    return true;
                case "nobr":
                    wflxmlrfwpVar.fmlbqenlif();
                    if (wflxmlrfwpVar.ribwqtqdhb("nobr")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        wflxmlrfwpVar.rgvfuqvkyq("nobr");
                        wflxmlrfwpVar.fmlbqenlif();
                    }
                    wflxmlrfwpVar.mhtqkkgtqm(wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg));
                    return true;
                case "span":
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "image":
                    if (wflxmlrfwpVar.mbcevpiqjq("svg") == null) {
                        return wflxmlrfwpVar.ojitshcjhn(nufgyqmvbuVarEablkybsjg.wwaezpbzkn("img"));
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    return true;
                case "input":
                    wflxmlrfwpVar.fmlbqenlif();
                    if (!wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg).ppxfxbqfkf("type").equalsIgnoreCase("hidden")) {
                        wflxmlrfwpVar.hcddaimhww(false);
                    }
                    return true;
                case "table":
                    if (wflxmlrfwpVar.kegysxyocb().F() != xl.gxszxtbevo.zoijcleaow.quirks && wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.hcddaimhww(false);
                    wflxmlrfwpVar.j(agtfadlqog.f125610zynmafqrjb);
                    return true;
                case "plaintext":
                    if (wflxmlrfwpVar.crxdokpmqz("p")) {
                        wflxmlrfwpVar.rgvfuqvkyq("p");
                    }
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.f125747ppxfxbqfkf.cqumvgiudr(cllcsxoeiz.f125682lereixgezr);
                    return true;
                case "noembed":
                    agtfadlqog.wkgbmnqykc(nufgyqmvbuVarEablkybsjg, wflxmlrfwpVar, wflxmlrfwpVar.jyumaefscl(nufgyqmvbuVarEablkybsjg).rgvfuqvkyq());
                    return true;
                default:
                    yl.kcexrzcfyt kcexrzcfytVarJyumaefscl = wflxmlrfwpVar.jyumaefscl(nufgyqmvbuVarEablkybsjg);
                    cllcsxoeiz cllcsxoeizVarRgvfuqvkyq = kcexrzcfytVarJyumaefscl.rgvfuqvkyq();
                    if (cllcsxoeizVarRgvfuqvkyq != null) {
                        agtfadlqog.wkgbmnqykc(nufgyqmvbuVarEablkybsjg, wflxmlrfwpVar, cllcsxoeizVarRgvfuqvkyq);
                    } else if (!kcexrzcfytVarJyumaefscl.lqeggnwhkg()) {
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    } else if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125633nufgyqmvbu)) {
                        if (wflxmlrfwpVar.crxdokpmqz("p")) {
                            wflxmlrfwpVar.rgvfuqvkyq("p");
                        }
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    } else {
                        if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125632lqeggnwhkg)) {
                            return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                        }
                        if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125615draadjrbmk)) {
                            wflxmlrfwpVar.fmlbqenlif();
                            wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                            wflxmlrfwpVar.oipsdeybqn();
                            wflxmlrfwpVar.hcddaimhww(false);
                        } else if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125641wflxmlrfwp)) {
                            wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                        } else {
                            if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125634ojitshcjhn)) {
                                wflxmlrfwpVar.pkzmftpjix(this);
                                return false;
                            }
                            wflxmlrfwpVar.fmlbqenlif();
                            wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                        }
                    }
                    return true;
            }
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            switch (vdvldrhtss.f125650iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()]) {
                case 1:
                    wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                    return true;
                case 2:
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                case 3:
                    return zdlpuopuiu(ylkuphrtabVar, wflxmlrfwpVar);
                case 4:
                    return vdvldrhtss(ylkuphrtabVar, wflxmlrfwpVar);
                case 5:
                    ylkuphrtab.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ylkuphrtabVar.iobyxmoadg();
                    if (ppxfxbqfkfVarIobyxmoadg.jyumaefscl().equals(agtfadlqog.f125597kegysxyocb)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    if (wflxmlrfwpVar.jpowsppfya() && agtfadlqog.draadjrbmk(ppxfxbqfkfVarIobyxmoadg)) {
                        wflxmlrfwpVar.fmlbqenlif();
                        wflxmlrfwpVar.metgxyhuhe(ppxfxbqfkfVarIobyxmoadg);
                        return true;
                    }
                    wflxmlrfwpVar.fmlbqenlif();
                    wflxmlrfwpVar.metgxyhuhe(ppxfxbqfkfVarIobyxmoadg);
                    wflxmlrfwpVar.hcddaimhww(false);
                    return true;
                case 6:
                    if (wflxmlrfwpVar.i() > 0) {
                        return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125590hcddaimhww);
                    }
                    if (!wflxmlrfwpVar.lxfrhoxuzk(lereixgezr.f125640vdvldrhtss)) {
                        return true;
                    }
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return true;
                default:
                    vl.zoijcleaow.wflxmlrfwp("Unexpected state: " + ylkuphrtabVar.f125844iobyxmoadg);
                    return true;
            }
        }

        boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            String str = ylkuphrtabVar.wkgbmnqykc().f125859eablkybsjg;
            ArrayList arrayListSopmlzcsov = wflxmlrfwpVar.sopmlzcsov();
            if (wflxmlrfwpVar.mbcevpiqjq(str) == null) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            for (int size = arrayListSopmlzcsov.size() - 1; size >= 0; size--) {
                xl.wflxmlrfwp wflxmlrfwpVar2 = (xl.wflxmlrfwp) arrayListSopmlzcsov.get(size);
                if (wflxmlrfwpVar2.lereixgezr(str)) {
                    wflxmlrfwpVar.cllcsxoeiz(str);
                    if (!wflxmlrfwpVar.ppxfxbqfkf(str)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    wflxmlrfwpVar.hszhottldk(str);
                    break;
                }
                if (yl.wflxmlrfwp.tbqsvytpvh(wflxmlrfwpVar2)) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
            }
            return true;
        }
    };

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final agtfadlqog f125601pmvmpeiblj = new agtfadlqog("Text", 7) { // from class: yl.agtfadlqog.cqumvgiudr
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.btonecajqb()) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
                return true;
            }
            if (!ylkuphrtabVar.wflxmlrfwp()) {
                if (!ylkuphrtabVar.agtfadlqog()) {
                    return true;
                }
                wflxmlrfwpVar.agtfadlqog();
                wflxmlrfwpVar.j(wflxmlrfwpVar.wizcaqwiak());
                return true;
            }
            wflxmlrfwpVar.pkzmftpjix(this);
            wflxmlrfwpVar.agtfadlqog();
            wflxmlrfwpVar.j(wflxmlrfwpVar.wizcaqwiak());
            if (wflxmlrfwpVar.h() == agtfadlqog.f125601pmvmpeiblj) {
                wflxmlrfwpVar.j(agtfadlqog.f125598lereixgezr);
            }
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }
    };

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final agtfadlqog f125610zynmafqrjb = new agtfadlqog("InTable", 8) { // from class: yl.agtfadlqog.esjtqupxsv
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.btonecajqb() && wl.kcexrzcfyt.lqeggnwhkg(wflxmlrfwpVar.zoijcleaow().lmojexxdyd(), lereixgezr.f125637pmvmpeiblj)) {
                wflxmlrfwpVar.d();
                wflxmlrfwpVar.uawqvzlxes();
                wflxmlrfwpVar.j(agtfadlqog.f125593istkbnxepw);
                return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
            }
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (ylkuphrtabVar.draadjrbmk()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (!ylkuphrtabVar.ojitshcjhn()) {
                if (!ylkuphrtabVar.agtfadlqog()) {
                    if (!ylkuphrtabVar.wflxmlrfwp()) {
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    if (wflxmlrfwpVar.ppxfxbqfkf("html")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    return true;
                }
                String strPkzmftpjix = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
                if (strPkzmftpjix.equals("table")) {
                    if (!wflxmlrfwpVar.xrmfcynszj(strPkzmftpjix)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    wflxmlrfwpVar.hszhottldk("table");
                    wflxmlrfwpVar.c();
                } else {
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125630lereixgezr)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    if (!strPkzmftpjix.equals("template")) {
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                }
                return true;
            }
            ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
            String strPkzmftpjix2 = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
            if (strPkzmftpjix2.equals("caption")) {
                wflxmlrfwpVar.cdpycssgdh();
                wflxmlrfwpVar.oipsdeybqn();
                wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                wflxmlrfwpVar.j(agtfadlqog.f125585cdpycssgdh);
            } else if (strPkzmftpjix2.equals("colgroup")) {
                wflxmlrfwpVar.cdpycssgdh();
                wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                wflxmlrfwpVar.j(agtfadlqog.f125606yadqdtsiqt);
            } else {
                if (strPkzmftpjix2.equals("col")) {
                    wflxmlrfwpVar.cdpycssgdh();
                    wflxmlrfwpVar.vdvldrhtss("colgroup");
                    return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                }
                if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125629kcexrzcfyt)) {
                    wflxmlrfwpVar.cdpycssgdh();
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.j(agtfadlqog.f125592iozdgvuglv);
                } else {
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125647zdlpuopuiu)) {
                        wflxmlrfwpVar.cdpycssgdh();
                        wflxmlrfwpVar.vdvldrhtss("tbody");
                        return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                    }
                    if (strPkzmftpjix2.equals("table")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        if (!wflxmlrfwpVar.xrmfcynszj(strPkzmftpjix2)) {
                            return false;
                        }
                        wflxmlrfwpVar.hszhottldk(strPkzmftpjix2);
                        if (wflxmlrfwpVar.c()) {
                            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                        }
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                        return true;
                    }
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125645yggfygwlhe)) {
                        return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                    }
                    if (strPkzmftpjix2.equals("input")) {
                        if (!nufgyqmvbuVarEablkybsjg.yadqdtsiqt() || !nufgyqmvbuVarEablkybsjg.f125862lqeggnwhkg.ojitshcjhn("type").equalsIgnoreCase("hidden")) {
                            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                        }
                        wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                    } else {
                        if (!strPkzmftpjix2.equals("form")) {
                            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                        }
                        wflxmlrfwpVar.pkzmftpjix(this);
                        if (wflxmlrfwpVar.tzroggbefp() != null || wflxmlrfwpVar.dvvnrvtcbc("template")) {
                            return false;
                        }
                        wflxmlrfwpVar.sflfametgt(nufgyqmvbuVarEablkybsjg, false, false);
                    }
                }
            }
            return true;
        }

        boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            wflxmlrfwpVar.pkzmftpjix(this);
            wflxmlrfwpVar.f(true);
            wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
            wflxmlrfwpVar.f(false);
            return true;
        }
    };

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final agtfadlqog f125593istkbnxepw = new agtfadlqog("InTableText", 9) { // from class: yl.agtfadlqog.iobyxmoadg
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.f125844iobyxmoadg == ylkuphrtab.btonecajqb.Character) {
                ylkuphrtab.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ylkuphrtabVar.iobyxmoadg();
                if (ppxfxbqfkfVarIobyxmoadg.jyumaefscl().equals(agtfadlqog.f125597kegysxyocb)) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                wflxmlrfwpVar.esjtqupxsv(ppxfxbqfkfVarIobyxmoadg);
                return true;
            }
            if (wflxmlrfwpVar.ulzqkzuiru().size() > 0) {
                ylkuphrtab ylkuphrtabVar2 = wflxmlrfwpVar.f125745lqeggnwhkg;
                for (ylkuphrtab.ppxfxbqfkf ppxfxbqfkfVar : wflxmlrfwpVar.ulzqkzuiru()) {
                    wflxmlrfwpVar.f125745lqeggnwhkg = ppxfxbqfkfVar;
                    if (agtfadlqog.draadjrbmk(ppxfxbqfkfVar)) {
                        wflxmlrfwpVar.metgxyhuhe(ppxfxbqfkfVar);
                    } else {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        if (wl.kcexrzcfyt.lqeggnwhkg(wflxmlrfwpVar.zoijcleaow().lmojexxdyd(), lereixgezr.f125637pmvmpeiblj)) {
                            wflxmlrfwpVar.f(true);
                            wflxmlrfwpVar.grlcpdaxtj(ppxfxbqfkfVar, agtfadlqog.f125598lereixgezr);
                            wflxmlrfwpVar.f(false);
                        } else {
                            wflxmlrfwpVar.grlcpdaxtj(ppxfxbqfkfVar, agtfadlqog.f125598lereixgezr);
                        }
                    }
                }
                wflxmlrfwpVar.f125745lqeggnwhkg = ylkuphrtabVar2;
                wflxmlrfwpVar.d();
            }
            wflxmlrfwpVar.j(wflxmlrfwpVar.wizcaqwiak());
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }
    };

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final agtfadlqog f125585cdpycssgdh = new agtfadlqog("InCaption", 10) { // from class: yl.agtfadlqog.zoijcleaow
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.agtfadlqog() && ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("caption")) {
                if (!wflxmlrfwpVar.xrmfcynszj("caption")) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                wflxmlrfwpVar.hkdspvbjdz();
                if (!wflxmlrfwpVar.ppxfxbqfkf("caption")) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                }
                wflxmlrfwpVar.hszhottldk("caption");
                wflxmlrfwpVar.pmvmpeiblj();
                wflxmlrfwpVar.j(agtfadlqog.f125610zynmafqrjb);
                return true;
            }
            if ((!ylkuphrtabVar.ojitshcjhn() || !wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.eablkybsjg().pkzmftpjix(), lereixgezr.f125618esjtqupxsv)) && (!ylkuphrtabVar.agtfadlqog() || !ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("table"))) {
                if (!ylkuphrtabVar.agtfadlqog() || !wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.wkgbmnqykc().pkzmftpjix(), lereixgezr.f125636pkzmftpjix)) {
                    return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (!wflxmlrfwpVar.xrmfcynszj("caption")) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            wflxmlrfwpVar.dsvhmnatus(false);
            if (!wflxmlrfwpVar.ppxfxbqfkf("caption")) {
                wflxmlrfwpVar.pkzmftpjix(this);
            }
            wflxmlrfwpVar.hszhottldk("caption");
            wflxmlrfwpVar.pmvmpeiblj();
            agtfadlqog agtfadlqogVar = agtfadlqog.f125610zynmafqrjb;
            wflxmlrfwpVar.j(agtfadlqogVar);
            agtfadlqogVar.ojitshcjhn(ylkuphrtabVar, wflxmlrfwpVar);
            return true;
        }
    };

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final agtfadlqog f125606yadqdtsiqt = new agtfadlqog("InColumnGroup", 11) { // from class: yl.agtfadlqog.ppxfxbqfkf
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (!wflxmlrfwpVar.ppxfxbqfkf("colgroup")) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            wflxmlrfwpVar.agtfadlqog();
            wflxmlrfwpVar.j(agtfadlqog.f125610zynmafqrjb);
            wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
            return true;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
                return true;
            }
            int i13 = vdvldrhtss.f125650iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()];
            if (i13 == 1) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
            } else if (i13 == 2) {
                wflxmlrfwpVar.pkzmftpjix(this);
            } else if (i13 == 3) {
                ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
                String strPkzmftpjix = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
                strPkzmftpjix.hashCode();
                switch (strPkzmftpjix) {
                    case "template":
                        wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                        break;
                    case "col":
                        wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                        break;
                    case "html":
                        return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
                    default:
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
            } else {
                if (i13 != 4) {
                    if (i13 == 6 && wflxmlrfwpVar.ppxfxbqfkf("html")) {
                        return true;
                    }
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                String strPkzmftpjix2 = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
                strPkzmftpjix2.hashCode();
                if (strPkzmftpjix2.equals("template")) {
                    wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                } else {
                    if (!strPkzmftpjix2.equals("colgroup")) {
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix2)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    wflxmlrfwpVar.agtfadlqog();
                    wflxmlrfwpVar.j(agtfadlqog.f125610zynmafqrjb);
                }
            }
            return true;
        }
    };

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final agtfadlqog f125592iozdgvuglv = new agtfadlqog("InTableBody", 12) { // from class: yl.agtfadlqog.wkgbmnqykc
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125610zynmafqrjb);
        }

        private boolean vdvldrhtss(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (!wflxmlrfwpVar.xrmfcynszj("tbody") && !wflxmlrfwpVar.xrmfcynszj("thead") && !wflxmlrfwpVar.ribwqtqdhb("tfoot")) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            wflxmlrfwpVar.istkbnxepw();
            wflxmlrfwpVar.rgvfuqvkyq(wflxmlrfwpVar.zoijcleaow().lmojexxdyd());
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            int i13 = vdvldrhtss.f125650iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()];
            if (i13 == 3) {
                ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
                String strPkzmftpjix = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
                if (strPkzmftpjix.equals("tr")) {
                    wflxmlrfwpVar.istkbnxepw();
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.j(agtfadlqog.f125599lmojexxdyd);
                    return true;
                }
                if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125628jyumaefscl)) {
                    return wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125649zynmafqrjb) ? vdvldrhtss(ylkuphrtabVar, wflxmlrfwpVar) : rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                wflxmlrfwpVar.vdvldrhtss("tr");
                return wflxmlrfwpVar.ojitshcjhn(nufgyqmvbuVarEablkybsjg);
            }
            if (i13 != 4) {
                return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
            }
            String strPkzmftpjix2 = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
            if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125643wwaezpbzkn)) {
                if (strPkzmftpjix2.equals("table")) {
                    return vdvldrhtss(ylkuphrtabVar, wflxmlrfwpVar);
                }
                if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125625istkbnxepw)) {
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (!wflxmlrfwpVar.xrmfcynszj(strPkzmftpjix2)) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            wflxmlrfwpVar.istkbnxepw();
            wflxmlrfwpVar.agtfadlqog();
            wflxmlrfwpVar.j(agtfadlqog.f125610zynmafqrjb);
            return true;
        }
    };

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final agtfadlqog f125599lmojexxdyd = new agtfadlqog("InRow", 13) { // from class: yl.agtfadlqog.eablkybsjg
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125610zynmafqrjb);
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.ojitshcjhn()) {
                ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
                String strPkzmftpjix = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
                if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125628jyumaefscl)) {
                    wflxmlrfwpVar.yadqdtsiqt();
                    wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    wflxmlrfwpVar.j(agtfadlqog.f125604wwaezpbzkn);
                    wflxmlrfwpVar.oipsdeybqn();
                    return true;
                }
                if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125613cdpycssgdh)) {
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                if (!wflxmlrfwpVar.xrmfcynszj("tr")) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                wflxmlrfwpVar.yadqdtsiqt();
                wflxmlrfwpVar.agtfadlqog();
                wflxmlrfwpVar.j(agtfadlqog.f125592iozdgvuglv);
                return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
            }
            if (!ylkuphrtabVar.agtfadlqog()) {
                return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
            }
            String strPkzmftpjix2 = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
            if (strPkzmftpjix2.equals("tr")) {
                if (!wflxmlrfwpVar.xrmfcynszj(strPkzmftpjix2)) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                wflxmlrfwpVar.yadqdtsiqt();
                wflxmlrfwpVar.agtfadlqog();
                wflxmlrfwpVar.j(agtfadlqog.f125592iozdgvuglv);
                return true;
            }
            if (strPkzmftpjix2.equals("table")) {
                if (!wflxmlrfwpVar.xrmfcynszj("tr")) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                wflxmlrfwpVar.yadqdtsiqt();
                wflxmlrfwpVar.agtfadlqog();
                wflxmlrfwpVar.j(agtfadlqog.f125592iozdgvuglv);
                return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
            }
            if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125629kcexrzcfyt)) {
                if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix2, lereixgezr.f125644yadqdtsiqt)) {
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (!wflxmlrfwpVar.xrmfcynszj(strPkzmftpjix2)) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (!wflxmlrfwpVar.xrmfcynszj("tr")) {
                return false;
            }
            wflxmlrfwpVar.yadqdtsiqt();
            wflxmlrfwpVar.agtfadlqog();
            wflxmlrfwpVar.j(agtfadlqog.f125592iozdgvuglv);
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }
    };

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final agtfadlqog f125604wwaezpbzkn = new agtfadlqog("InCell", 14) { // from class: yl.agtfadlqog.gxszxtbevo
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
        }

        private void vdvldrhtss(yl.wflxmlrfwp wflxmlrfwpVar) {
            if (wflxmlrfwpVar.xrmfcynszj("td")) {
                wflxmlrfwpVar.rgvfuqvkyq("td");
            } else {
                wflxmlrfwpVar.rgvfuqvkyq("th");
            }
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (!ylkuphrtabVar.agtfadlqog()) {
                if (!ylkuphrtabVar.ojitshcjhn() || !wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.eablkybsjg().pkzmftpjix(), lereixgezr.f125618esjtqupxsv)) {
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                if (wflxmlrfwpVar.xrmfcynszj("td") || wflxmlrfwpVar.xrmfcynszj("th")) {
                    vdvldrhtss(wflxmlrfwpVar);
                    return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            String strPkzmftpjix = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
            if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125628jyumaefscl)) {
                if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125626iwizpuwonk)) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125614cqumvgiudr)) {
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                }
                if (wflxmlrfwpVar.xrmfcynszj(strPkzmftpjix)) {
                    vdvldrhtss(wflxmlrfwpVar);
                    return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (!wflxmlrfwpVar.xrmfcynszj(strPkzmftpjix)) {
                wflxmlrfwpVar.pkzmftpjix(this);
                wflxmlrfwpVar.j(agtfadlqog.f125599lmojexxdyd);
                return false;
            }
            wflxmlrfwpVar.hkdspvbjdz();
            if (!wflxmlrfwpVar.ppxfxbqfkf(strPkzmftpjix)) {
                wflxmlrfwpVar.pkzmftpjix(this);
            }
            wflxmlrfwpVar.hszhottldk(strPkzmftpjix);
            wflxmlrfwpVar.pmvmpeiblj();
            wflxmlrfwpVar.j(agtfadlqog.f125599lmojexxdyd);
            return true;
        }
    };

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final agtfadlqog f125608ylkuphrtab = new agtfadlqog("InSelect", 15) { // from class: yl.agtfadlqog.lqeggnwhkg
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        private boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            wflxmlrfwpVar.pkzmftpjix(this);
            return false;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            switch (vdvldrhtss.f125650iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()]) {
                case 1:
                    wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                    return true;
                case 2:
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                case 3:
                    ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
                    String strPkzmftpjix = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
                    if (strPkzmftpjix.equals("html")) {
                        return wflxmlrfwpVar.grlcpdaxtj(nufgyqmvbuVarEablkybsjg, agtfadlqog.f125598lereixgezr);
                    }
                    if (strPkzmftpjix.equals("option")) {
                        if (wflxmlrfwpVar.ppxfxbqfkf("option")) {
                            wflxmlrfwpVar.rgvfuqvkyq("option");
                        }
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    } else {
                        if (!strPkzmftpjix.equals("optgroup")) {
                            if (strPkzmftpjix.equals("select")) {
                                wflxmlrfwpVar.pkzmftpjix(this);
                                return wflxmlrfwpVar.rgvfuqvkyq("select");
                            }
                            if (!wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125624iozdgvuglv)) {
                                return (strPkzmftpjix.equals("script") || strPkzmftpjix.equals("template")) ? wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk) : rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                            }
                            wflxmlrfwpVar.pkzmftpjix(this);
                            if (!wflxmlrfwpVar.ikoacuggdj("select")) {
                                return false;
                            }
                            wflxmlrfwpVar.rgvfuqvkyq("select");
                            return wflxmlrfwpVar.ojitshcjhn(nufgyqmvbuVarEablkybsjg);
                        }
                        if (wflxmlrfwpVar.ppxfxbqfkf("option")) {
                            wflxmlrfwpVar.rgvfuqvkyq("option");
                        }
                        if (wflxmlrfwpVar.ppxfxbqfkf("optgroup")) {
                            wflxmlrfwpVar.rgvfuqvkyq("optgroup");
                        }
                        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                    }
                    return true;
                case 4:
                    String strPkzmftpjix2 = ylkuphrtabVar.wkgbmnqykc().pkzmftpjix();
                    strPkzmftpjix2.hashCode();
                    switch (strPkzmftpjix2) {
                        case "template":
                            return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                        case "option":
                            if (wflxmlrfwpVar.ppxfxbqfkf("option")) {
                                wflxmlrfwpVar.agtfadlqog();
                            } else {
                                wflxmlrfwpVar.pkzmftpjix(this);
                            }
                            return true;
                        case "select":
                            if (!wflxmlrfwpVar.ikoacuggdj(strPkzmftpjix2)) {
                                wflxmlrfwpVar.pkzmftpjix(this);
                                return false;
                            }
                            wflxmlrfwpVar.hszhottldk(strPkzmftpjix2);
                            wflxmlrfwpVar.c();
                            return true;
                        case "optgroup":
                            if (wflxmlrfwpVar.ppxfxbqfkf("option") && wflxmlrfwpVar.cqumvgiudr(wflxmlrfwpVar.zoijcleaow()) != null && wflxmlrfwpVar.cqumvgiudr(wflxmlrfwpVar.zoijcleaow()).lereixgezr("optgroup")) {
                                wflxmlrfwpVar.rgvfuqvkyq("option");
                            }
                            if (wflxmlrfwpVar.ppxfxbqfkf("optgroup")) {
                                wflxmlrfwpVar.agtfadlqog();
                            } else {
                                wflxmlrfwpVar.pkzmftpjix(this);
                            }
                            return true;
                        default:
                            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                case 5:
                    ylkuphrtab.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ylkuphrtabVar.iobyxmoadg();
                    if (ppxfxbqfkfVarIobyxmoadg.jyumaefscl().equals(agtfadlqog.f125597kegysxyocb)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    wflxmlrfwpVar.metgxyhuhe(ppxfxbqfkfVarIobyxmoadg);
                    return true;
                case 6:
                    if (!wflxmlrfwpVar.ppxfxbqfkf("html")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    return true;
                default:
                    return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
            }
        }
    };

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final agtfadlqog f125600pkzmftpjix = new agtfadlqog("InSelectInTable", 16) { // from class: yl.agtfadlqog.nufgyqmvbu
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.ojitshcjhn() && wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.eablkybsjg().pkzmftpjix(), lereixgezr.f125631lmojexxdyd)) {
                wflxmlrfwpVar.pkzmftpjix(this);
                wflxmlrfwpVar.hszhottldk("select");
                wflxmlrfwpVar.c();
                return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
            }
            if (!ylkuphrtabVar.agtfadlqog() || !wl.kcexrzcfyt.lqeggnwhkg(ylkuphrtabVar.wkgbmnqykc().pkzmftpjix(), lereixgezr.f125631lmojexxdyd)) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125608ylkuphrtab);
            }
            wflxmlrfwpVar.pkzmftpjix(this);
            if (!wflxmlrfwpVar.xrmfcynszj(ylkuphrtabVar.wkgbmnqykc().pkzmftpjix())) {
                return false;
            }
            wflxmlrfwpVar.hszhottldk("select");
            wflxmlrfwpVar.c();
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }
    };

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final agtfadlqog f125590hcddaimhww = new agtfadlqog("InTemplate", 17) { // from class: yl.agtfadlqog.dxjokdxxww
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            switch (vdvldrhtss.f125650iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
                    return true;
                case 3:
                    String strPkzmftpjix = ylkuphrtabVar.eablkybsjg().pkzmftpjix();
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125621hcddaimhww)) {
                        wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                        return true;
                    }
                    if (wl.kcexrzcfyt.lqeggnwhkg(strPkzmftpjix, lereixgezr.f125627jpowsppfya)) {
                        wflxmlrfwpVar.fyldjkxazc();
                        agtfadlqog agtfadlqogVar = agtfadlqog.f125610zynmafqrjb;
                        wflxmlrfwpVar.ixidwrxhsl(agtfadlqogVar);
                        wflxmlrfwpVar.j(agtfadlqogVar);
                        return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                    }
                    if (strPkzmftpjix.equals("col")) {
                        wflxmlrfwpVar.fyldjkxazc();
                        agtfadlqog agtfadlqogVar2 = agtfadlqog.f125606yadqdtsiqt;
                        wflxmlrfwpVar.ixidwrxhsl(agtfadlqogVar2);
                        wflxmlrfwpVar.j(agtfadlqogVar2);
                        return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                    }
                    if (strPkzmftpjix.equals("tr")) {
                        wflxmlrfwpVar.fyldjkxazc();
                        agtfadlqog agtfadlqogVar3 = agtfadlqog.f125592iozdgvuglv;
                        wflxmlrfwpVar.ixidwrxhsl(agtfadlqogVar3);
                        wflxmlrfwpVar.j(agtfadlqogVar3);
                        return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                    }
                    if (strPkzmftpjix.equals("td") || strPkzmftpjix.equals("th")) {
                        wflxmlrfwpVar.fyldjkxazc();
                        agtfadlqog agtfadlqogVar4 = agtfadlqog.f125599lmojexxdyd;
                        wflxmlrfwpVar.ixidwrxhsl(agtfadlqogVar4);
                        wflxmlrfwpVar.j(agtfadlqogVar4);
                        return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                    }
                    wflxmlrfwpVar.fyldjkxazc();
                    agtfadlqog agtfadlqogVar5 = agtfadlqog.f125598lereixgezr;
                    wflxmlrfwpVar.ixidwrxhsl(agtfadlqogVar5);
                    wflxmlrfwpVar.j(agtfadlqogVar5);
                    return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                case 4:
                    if (ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("template")) {
                        wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
                        return true;
                    }
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                case 6:
                    if (!wflxmlrfwpVar.dvvnrvtcbc("template")) {
                        return true;
                    }
                    wflxmlrfwpVar.pkzmftpjix(this);
                    wflxmlrfwpVar.hszhottldk("template");
                    wflxmlrfwpVar.pmvmpeiblj();
                    wflxmlrfwpVar.fyldjkxazc();
                    wflxmlrfwpVar.c();
                    if (wflxmlrfwpVar.h() == agtfadlqog.f125590hcddaimhww || wflxmlrfwpVar.i() >= 12) {
                        return true;
                    }
                    return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                default:
                    vl.zoijcleaow.wflxmlrfwp("Unexpected state: " + ylkuphrtabVar.f125844iobyxmoadg);
                    return true;
            }
        }
    };

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final agtfadlqog f125595jpowsppfya = new agtfadlqog("AfterBody", 18) { // from class: yl.agtfadlqog.btonecajqb
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            xl.wflxmlrfwp wflxmlrfwpVarMbcevpiqjq = wflxmlrfwpVar.mbcevpiqjq("html");
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                if (wflxmlrfwpVarMbcevpiqjq != null) {
                    wflxmlrfwpVar.rlfsiqarku(ylkuphrtabVar.iobyxmoadg(), wflxmlrfwpVarMbcevpiqjq);
                    return true;
                }
                wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
                return true;
            }
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (ylkuphrtabVar.draadjrbmk()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("html")) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
            }
            if (!ylkuphrtabVar.agtfadlqog() || !ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("html")) {
                if (ylkuphrtabVar.wflxmlrfwp()) {
                    return true;
                }
                wflxmlrfwpVar.pkzmftpjix(this);
                wflxmlrfwpVar.b();
                return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
            }
            if (wflxmlrfwpVar.iyctptxqzt()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (wflxmlrfwpVarMbcevpiqjq != null) {
                wflxmlrfwpVar.iwizpuwonk(wflxmlrfwpVarMbcevpiqjq, false);
            }
            wflxmlrfwpVar.j(agtfadlqog.f125588dsvhmnatus);
            return true;
        }
    };

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final agtfadlqog f125591hkdspvbjdz = new agtfadlqog("InFrameset", 19) { // from class: yl.agtfadlqog.draadjrbmk
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
            } else if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
            } else {
                if (ylkuphrtabVar.draadjrbmk()) {
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return false;
                }
                if (ylkuphrtabVar.ojitshcjhn()) {
                    ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
                    String strPkzmftpjix = nufgyqmvbuVarEablkybsjg.pkzmftpjix();
                    strPkzmftpjix.hashCode();
                    switch (strPkzmftpjix) {
                        case "frameset":
                            wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVarEablkybsjg);
                            break;
                        case "html":
                            return wflxmlrfwpVar.grlcpdaxtj(nufgyqmvbuVarEablkybsjg, agtfadlqog.f125598lereixgezr);
                        case "frame":
                            wflxmlrfwpVar.yfnezrywwk(nufgyqmvbuVarEablkybsjg);
                            break;
                        case "noframes":
                            return wflxmlrfwpVar.grlcpdaxtj(nufgyqmvbuVarEablkybsjg, agtfadlqog.f125594iwizpuwonk);
                        default:
                            wflxmlrfwpVar.pkzmftpjix(this);
                            return false;
                    }
                } else if (ylkuphrtabVar.agtfadlqog() && ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("frameset")) {
                    if (wflxmlrfwpVar.ppxfxbqfkf("html")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    wflxmlrfwpVar.agtfadlqog();
                    if (!wflxmlrfwpVar.iyctptxqzt() && !wflxmlrfwpVar.ppxfxbqfkf("frameset")) {
                        wflxmlrfwpVar.j(agtfadlqog.f125586cllcsxoeiz);
                    }
                } else {
                    if (!ylkuphrtabVar.wflxmlrfwp()) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                        return false;
                    }
                    if (!wflxmlrfwpVar.ppxfxbqfkf("html")) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                }
            }
            return true;
        }
    };

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    public static final agtfadlqog f125586cllcsxoeiz = new agtfadlqog("AfterFrameset", 20) { // from class: yl.agtfadlqog.wflxmlrfwp
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.metgxyhuhe(ylkuphrtabVar.iobyxmoadg());
                return true;
            }
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (ylkuphrtabVar.draadjrbmk()) {
                wflxmlrfwpVar.pkzmftpjix(this);
                return false;
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("html")) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
            }
            if (ylkuphrtabVar.agtfadlqog() && ylkuphrtabVar.wkgbmnqykc().pkzmftpjix().equals("html")) {
                wflxmlrfwpVar.j(agtfadlqog.f125605wypolnanlu);
                return true;
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("noframes")) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
            }
            if (ylkuphrtabVar.wflxmlrfwp()) {
                return true;
            }
            wflxmlrfwpVar.pkzmftpjix(this);
            return false;
        }
    };

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    public static final agtfadlqog f125588dsvhmnatus = new agtfadlqog("AfterAfterBody", 21) { // from class: yl.agtfadlqog.agtfadlqog
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (ylkuphrtabVar.draadjrbmk() || (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("html"))) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
            }
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                wflxmlrfwpVar.rlfsiqarku(ylkuphrtabVar.iobyxmoadg(), wflxmlrfwpVar.kegysxyocb());
                return true;
            }
            if (ylkuphrtabVar.wflxmlrfwp()) {
                return true;
            }
            wflxmlrfwpVar.pkzmftpjix(this);
            wflxmlrfwpVar.b();
            return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
        }
    };

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    public static final agtfadlqog f125605wypolnanlu = new agtfadlqog("AfterAfterFrameset", 22) { // from class: yl.agtfadlqog.ojitshcjhn
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                return true;
            }
            if (ylkuphrtabVar.draadjrbmk() || agtfadlqog.draadjrbmk(ylkuphrtabVar) || (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("html"))) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125598lereixgezr);
            }
            if (ylkuphrtabVar.wflxmlrfwp()) {
                return true;
            }
            if (ylkuphrtabVar.ojitshcjhn() && ylkuphrtabVar.eablkybsjg().pkzmftpjix().equals("noframes")) {
                return wflxmlrfwpVar.grlcpdaxtj(ylkuphrtabVar, agtfadlqog.f125594iwizpuwonk);
            }
            wflxmlrfwpVar.pkzmftpjix(this);
            return false;
        }
    };

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    public static final agtfadlqog f125602stevsuqkhv = new agtfadlqog("ForeignContent", 23) { // from class: yl.agtfadlqog.rgvfuqvkyq
        {
            gtknphoqwx gtknphoqwxVar = null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            switch (vdvldrhtss.f125650iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()]) {
                case 1:
                    wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
                    return true;
                case 2:
                    wflxmlrfwpVar.pkzmftpjix(this);
                    return true;
                case 3:
                    ylkuphrtab.nufgyqmvbu nufgyqmvbuVarEablkybsjg = ylkuphrtabVar.eablkybsjg();
                    if (wl.kcexrzcfyt.gxszxtbevo(nufgyqmvbuVarEablkybsjg.f125859eablkybsjg, lereixgezr.f125622hkdspvbjdz)) {
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    if (nufgyqmvbuVarEablkybsjg.f125859eablkybsjg.equals("font") && (nufgyqmvbuVarEablkybsjg.cdpycssgdh("color") || nufgyqmvbuVarEablkybsjg.cdpycssgdh("face") || nufgyqmvbuVarEablkybsjg.cdpycssgdh("size"))) {
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    String strGtknphoqwx = wflxmlrfwpVar.zoijcleaow().n().gtknphoqwx();
                    wflxmlrfwpVar.ydmasvzmpa(nufgyqmvbuVarEablkybsjg, strGtknphoqwx);
                    cllcsxoeiz cllcsxoeizVarRgvfuqvkyq = wflxmlrfwpVar.yggfygwlhe(nufgyqmvbuVarEablkybsjg.f125867wkgbmnqykc.nufgyqmvbu(), nufgyqmvbuVarEablkybsjg.f125859eablkybsjg, strGtknphoqwx, wflxmlrfwpVar.f125746nufgyqmvbu).rgvfuqvkyq();
                    if (cllcsxoeizVarRgvfuqvkyq != null) {
                        if (nufgyqmvbuVarEablkybsjg.f125859eablkybsjg.equals("script")) {
                            wflxmlrfwpVar.f125747ppxfxbqfkf.cqumvgiudr(cllcsxoeiz.f125661esjtqupxsv);
                        } else {
                            wflxmlrfwpVar.f125747ppxfxbqfkf.cqumvgiudr(cllcsxoeizVarRgvfuqvkyq);
                        }
                        wflxmlrfwpVar.uawqvzlxes();
                        wflxmlrfwpVar.j(agtfadlqog.f125601pmvmpeiblj);
                    }
                    return true;
                case 4:
                    ylkuphrtab.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = ylkuphrtabVar.wkgbmnqykc();
                    if (lqeggnwhkgVarWkgbmnqykc.f125859eablkybsjg.equals("br") || lqeggnwhkgVarWkgbmnqykc.f125859eablkybsjg.equals("p")) {
                        return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                    }
                    if (lqeggnwhkgVarWkgbmnqykc.f125859eablkybsjg.equals("script") && wflxmlrfwpVar.wkgbmnqykc("script", "http://www.w3.org/2000/svg")) {
                        wflxmlrfwpVar.agtfadlqog();
                        return true;
                    }
                    ArrayList arrayListSopmlzcsov = wflxmlrfwpVar.sopmlzcsov();
                    if (arrayListSopmlzcsov.isEmpty()) {
                        vl.zoijcleaow.wflxmlrfwp("Stack unexpectedly empty");
                    }
                    int size = arrayListSopmlzcsov.size() - 1;
                    xl.wflxmlrfwp wflxmlrfwpVar2 = (xl.wflxmlrfwp) arrayListSopmlzcsov.get(size);
                    if (!wflxmlrfwpVar2.lereixgezr(lqeggnwhkgVarWkgbmnqykc.f125859eablkybsjg)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    }
                    while (size != 0) {
                        if (wflxmlrfwpVar2.lereixgezr(lqeggnwhkgVarWkgbmnqykc.f125859eablkybsjg)) {
                            wflxmlrfwpVar.ageimvtcrz(wflxmlrfwpVar2.lmojexxdyd());
                            return true;
                        }
                        size--;
                        wflxmlrfwpVar2 = (xl.wflxmlrfwp) arrayListSopmlzcsov.get(size);
                        if (wflxmlrfwpVar2.n().gtknphoqwx().equals("http://www.w3.org/1999/xhtml")) {
                            return rgvfuqvkyq(ylkuphrtabVar, wflxmlrfwpVar);
                        }
                    }
                    return true;
                case 5:
                    ylkuphrtab.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ylkuphrtabVar.iobyxmoadg();
                    if (ppxfxbqfkfVarIobyxmoadg.jyumaefscl().equals(agtfadlqog.f125597kegysxyocb)) {
                        wflxmlrfwpVar.pkzmftpjix(this);
                    } else if (agtfadlqog.draadjrbmk(ppxfxbqfkfVarIobyxmoadg)) {
                        wflxmlrfwpVar.metgxyhuhe(ppxfxbqfkfVarIobyxmoadg);
                    } else {
                        wflxmlrfwpVar.metgxyhuhe(ppxfxbqfkfVarIobyxmoadg);
                        wflxmlrfwpVar.hcddaimhww(false);
                    }
                    return true;
                case 6:
                    return true;
                default:
                    vl.zoijcleaow.wflxmlrfwp("Unexpected state: " + ylkuphrtabVar.f125844iobyxmoadg);
                    return true;
            }
        }

        boolean rgvfuqvkyq(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            return wflxmlrfwpVar.h().ojitshcjhn(ylkuphrtabVar, wflxmlrfwpVar);
        }
    };

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final /* synthetic */ agtfadlqog[] f125603tzroggbefp = iobyxmoadg();

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final String f125597kegysxyocb = String.valueOf((char) 0);

    final enum gtknphoqwx extends agtfadlqog {
        gtknphoqwx(String str, int i13) {
            super(str, i13, null);
        }

        @Override // yl.agtfadlqog
        boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar) {
            if (agtfadlqog.draadjrbmk(ylkuphrtabVar)) {
                return true;
            }
            if (ylkuphrtabVar.gtknphoqwx()) {
                wflxmlrfwpVar.czzsidtyhn(ylkuphrtabVar.zoijcleaow());
            } else {
                if (!ylkuphrtabVar.draadjrbmk()) {
                    wflxmlrfwpVar.kegysxyocb().G(xl.gxszxtbevo.zoijcleaow.quirks);
                    wflxmlrfwpVar.j(agtfadlqog.f125607yggfygwlhe);
                    return wflxmlrfwpVar.ojitshcjhn(ylkuphrtabVar);
                }
                ylkuphrtab.eablkybsjg eablkybsjgVarPpxfxbqfkf = ylkuphrtabVar.ppxfxbqfkf();
                xl.lqeggnwhkg lqeggnwhkgVar = new xl.lqeggnwhkg(wflxmlrfwpVar.f125746nufgyqmvbu.wkgbmnqykc(eablkybsjgVarPpxfxbqfkf.zdlpuopuiu()), eablkybsjgVarPpxfxbqfkf.jyumaefscl(), eablkybsjgVarPpxfxbqfkf.iwizpuwonk());
                lqeggnwhkgVar.zfvoamnweg(eablkybsjgVarPpxfxbqfkf.yggfygwlhe());
                wflxmlrfwpVar.kegysxyocb().uwvvkdfqfp(lqeggnwhkgVar);
                wflxmlrfwpVar.draadjrbmk(lqeggnwhkgVar);
                if (eablkybsjgVarPpxfxbqfkf.cqumvgiudr() || !lqeggnwhkgVar.ydmasvzmpa().equals("html") || lqeggnwhkgVar.sflfametgt().equalsIgnoreCase("HTML")) {
                    wflxmlrfwpVar.kegysxyocb().G(xl.gxszxtbevo.zoijcleaow.quirks);
                }
                wflxmlrfwpVar.j(agtfadlqog.f125607yggfygwlhe);
            }
            return true;
        }
    }

    static final class lereixgezr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final String[] f125623iobyxmoadg = {"base", "basefont", "bgsound", "command", "link"};

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final String[] f125648zoijcleaow = {"noframes", "style"};

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final String[] f125638ppxfxbqfkf = {"body", "br", "html"};

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        static final String[] f125642wkgbmnqykc = {"body", "br", "html"};

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        static final String[] f125617eablkybsjg = {"body", "br", "head", "html"};

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        static final String[] f125620gxszxtbevo = {"basefont", "bgsound", "link", "meta", "noframes", "style"};

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        static final String[] f125632lqeggnwhkg = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        static final String[] f125633nufgyqmvbu = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        static final String[] f125616dxjokdxxww = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        static final String[] f125612btonecajqb = {"address", "div", "p"};

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        static final String[] f125619gtknphoqwx = {"dd", "dt"};

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        static final String[] f125615draadjrbmk = {"applet", "marquee", "object"};

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        static final String[] f125641wflxmlrfwp = {"param", AdRevenueConstants.SOURCE_KEY, "track"};

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        static final String[] f125611agtfadlqog = {"action", ExternalMetricsManagerImpl.NAME, "prompt"};

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        static final String[] f125634ojitshcjhn = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        static final String[] f125639rgvfuqvkyq = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        static final String[] f125640vdvldrhtss = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        static final String[] f125635oxmwwwfdhm = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        static final String[] f125629kcexrzcfyt = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        static final String[] f125647zdlpuopuiu = {"td", "th", "tr"};

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        static final String[] f125645yggfygwlhe = {"script", "style", "template"};

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        static final String[] f125628jyumaefscl = {"td", "th"};

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        static final String[] f125626iwizpuwonk = {"body", "caption", "col", "colgroup", "html"};

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        static final String[] f125614cqumvgiudr = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        static final String[] f125618esjtqupxsv = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        static final String[] f125630lereixgezr = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        static final String[] f125637pmvmpeiblj = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        static final String[] f125649zynmafqrjb = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        static final String[] f125625istkbnxepw = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        static final String[] f125613cdpycssgdh = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        static final String[] f125644yadqdtsiqt = {"body", "caption", "col", "colgroup", "html", "td", "th"};

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        static final String[] f125624iozdgvuglv = {"input", "keygen", "textarea"};

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        static final String[] f125631lmojexxdyd = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        static final String[] f125643wwaezpbzkn = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        static final String[] f125646ylkuphrtab = {"head", "noscript"};

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        static final String[] f125636pkzmftpjix = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        static final String[] f125621hcddaimhww = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        static final String[] f125627jpowsppfya = {"caption", "colgroup", "tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        static final String[] f125622hkdspvbjdz = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
    }

    static /* synthetic */ class vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f125650iobyxmoadg;

        static {
            int[] iArr = new int[ylkuphrtab.btonecajqb.values().length];
            f125650iobyxmoadg = iArr;
            try {
                iArr[ylkuphrtab.btonecajqb.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125650iobyxmoadg[ylkuphrtab.btonecajqb.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125650iobyxmoadg[ylkuphrtab.btonecajqb.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125650iobyxmoadg[ylkuphrtab.btonecajqb.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125650iobyxmoadg[ylkuphrtab.btonecajqb.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125650iobyxmoadg[ylkuphrtab.btonecajqb.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private agtfadlqog(String str, int i13) {
        super(str, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void agtfadlqog(ylkuphrtab.nufgyqmvbu nufgyqmvbuVar, xl.wflxmlrfwp wflxmlrfwpVar) {
        if (nufgyqmvbuVar.yadqdtsiqt()) {
            for (xl.iobyxmoadg iobyxmoadgVar : nufgyqmvbuVar.f125862lqeggnwhkg) {
                xl.zoijcleaow zoijcleaowVarEablkybsjg = wflxmlrfwpVar.eablkybsjg();
                if (!zoijcleaowVarEablkybsjg.oxmwwwfdhm(iobyxmoadgVar.getKey())) {
                    xl.esjtqupxsv.iobyxmoadg iobyxmoadgVarVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
                    zoijcleaowVarEablkybsjg.zynmafqrjb(iobyxmoadgVar);
                    if (nufgyqmvbuVar.f125857draadjrbmk) {
                        zoijcleaowVarEablkybsjg.yadqdtsiqt(iobyxmoadgVar.getKey(), iobyxmoadgVarVdvldrhtss);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean draadjrbmk(ylkuphrtab ylkuphrtabVar) {
        if (ylkuphrtabVar.btonecajqb()) {
            return wl.kcexrzcfyt.btonecajqb(ylkuphrtabVar.iobyxmoadg().jyumaefscl());
        }
        return false;
    }

    private static /* synthetic */ agtfadlqog[] iobyxmoadg() {
        return new agtfadlqog[]{f125609zdlpuopuiu, f125607yggfygwlhe, f125596jyumaefscl, f125594iwizpuwonk, f125587cqumvgiudr, f125589esjtqupxsv, f125598lereixgezr, f125601pmvmpeiblj, f125610zynmafqrjb, f125593istkbnxepw, f125585cdpycssgdh, f125606yadqdtsiqt, f125592iozdgvuglv, f125599lmojexxdyd, f125604wwaezpbzkn, f125608ylkuphrtab, f125600pkzmftpjix, f125590hcddaimhww, f125595jpowsppfya, f125591hkdspvbjdz, f125586cllcsxoeiz, f125588dsvhmnatus, f125605wypolnanlu, f125602stevsuqkhv};
    }

    public static agtfadlqog valueOf(String str) {
        return (agtfadlqog) Enum.valueOf(agtfadlqog.class, str);
    }

    public static agtfadlqog[] values() {
        return (agtfadlqog[]) f125603tzroggbefp.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wkgbmnqykc(ylkuphrtab.nufgyqmvbu nufgyqmvbuVar, yl.wflxmlrfwp wflxmlrfwpVar, cllcsxoeiz cllcsxoeizVar) {
        if (cllcsxoeizVar != null) {
            wflxmlrfwpVar.f125747ppxfxbqfkf.cqumvgiudr(cllcsxoeizVar);
        }
        wflxmlrfwpVar.uawqvzlxes();
        wflxmlrfwpVar.j(f125601pmvmpeiblj);
        wflxmlrfwpVar.uwvvkdfqfp(nufgyqmvbuVar);
    }

    abstract boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar, yl.wflxmlrfwp wflxmlrfwpVar);

    /* synthetic */ agtfadlqog(String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, i13);
    }
}
