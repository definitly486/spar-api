package cr;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import czzsidtyhn.uawqvzlxes;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;
import yfnezrywwk.jpowsppfya;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wflxmlrfwp {

    public static final class eablkybsjg implements oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f25539yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f25540zdlpuopuiu;

        public eablkybsjg(List list, tg.draadjrbmk draadjrbmkVar) {
            this.f25540zdlpuopuiu = list;
            this.f25539yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            if (!draadjrbmkVar.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            xq.zoijcleaow zoijcleaowVar = (xq.zoijcleaow) this.f25540zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(158213253);
            draadjrbmkVar.sopmlzcsov(836390349);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f25539yggfygwlhe) | draadjrbmkVar.ulzqkzuiru(zoijcleaowVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(this.f25539yggfygwlhe, zoijcleaowVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            nufgyqmvbu.wkgbmnqykc(zoijcleaowVar, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0, 0);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVar, 6);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ xq.zoijcleaow f25541yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f25542zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, xq.zoijcleaow zoijcleaowVar) {
            this.f25542zdlpuopuiu = draadjrbmkVar;
            this.f25541yggfygwlhe = zoijcleaowVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f25542zdlpuopuiu.invoke(this.f25541yggfygwlhe);
        }
    }

    public static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f25543yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f25544zdlpuopuiu;

        public ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f25544zdlpuopuiu = draadjrbmkVar;
            this.f25543yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f25544zdlpuopuiu.invoke(this.f25543yggfygwlhe.get(i13));
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f25545yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f25546zdlpuopuiu;

        public wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f25546zdlpuopuiu = draadjrbmkVar;
            this.f25545yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f25546zdlpuopuiu.invoke(this.f25545yggfygwlhe.get(i13));
        }
    }

    public static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f25547zdlpuopuiu = new zoijcleaow();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(List list, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(list, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void eablkybsjg(final List items, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        tg.draadjrbmk draadjrbmkVar3;
        final tg.draadjrbmk draadjrbmkVar4;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar5;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(items, "items");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-1724132563);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(items) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3) ? 32 : 16;
            }
            if ((i15 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1300064035);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: cr.dxjokdxxww
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wflxmlrfwp.gxszxtbevo((xq.zoijcleaow) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1724132563, i15, -1, "ru.myspar.catalog.impl.pager.presentation.compose.partners.CatalogPagerPartnersList (CatalogPagerPartnersList.kt:32)");
                }
                if (items.isEmpty()) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1647814793);
                    androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(iobyxmoadgVar, 0.0f, 1, null);
                    a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                    zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
                    if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                        androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                    }
                    draadjrbmkVarBtonecajqb.pkzmftpjix();
                    if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                        draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                    } else {
                        draadjrbmkVarBtonecajqb.yggfygwlhe();
                    }
                    draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, iobyxmoadgVar2.eablkybsjg());
                    String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.restaurants_empty_warning, draadjrbmkVarBtonecajqb, 0);
                    z zVar = z.f44180iobyxmoadg;
                    int i17 = z.f44181zoijcleaow;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    w6.btonecajqb(strPpxfxbqfkf, wkgbmnqykcVarWkgbmnqykc, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).wkgbmnqykc(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).iobyxmoadg()), draadjrbmkVar5, 0, 0, 65528);
                    draadjrbmkVar5.cqumvgiudr();
                    draadjrbmkVar5.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1647330108);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 0.0f, 13, null);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1300070097);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(items) | ((i15 & 112) == 32);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: cr.btonecajqb
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wflxmlrfwp.lqeggnwhkg(items, draadjrbmkVar4, (jpowsppfya) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarOxmwwwfdhm, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6, 510);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar4 = draadjrbmkVar3;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cr.gtknphoqwx
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wflxmlrfwp.dxjokdxxww(items, draadjrbmkVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        draadjrbmkVar3 = draadjrbmkVar;
        if ((i15 & 19) == 18) {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1300064035);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: cr.dxjokdxxww
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wflxmlrfwp.gxszxtbevo((xq.zoijcleaow) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1724132563, i15, -1, "ru.myspar.catalog.impl.pager.presentation.compose.partners.CatalogPagerPartnersList (CatalogPagerPartnersList.kt:32)");
            }
            if (items.isEmpty()) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1647330108);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm2 = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 0.0f, 13, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1300070097);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(items) | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: cr.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wflxmlrfwp.lqeggnwhkg(items, draadjrbmkVar4, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: cr.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wflxmlrfwp.lqeggnwhkg(items, draadjrbmkVar4, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarOxmwwwfdhm2, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6, 510);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1647814793);
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar4, 0.0f, 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar5 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar5.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo2);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar6 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar6.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar6.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar6.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar6.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar6.wkgbmnqykc());
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg.wkgbmnqykc(iobyxmoadgVar4, iobyxmoadgVar5.eablkybsjg());
                String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.restaurants_empty_warning, draadjrbmkVarBtonecajqb, 0);
                z zVar2 = z.f44180iobyxmoadg;
                int i18 = z.f44181zoijcleaow;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(strPpxfxbqfkf2, wkgbmnqykcVarWkgbmnqykc2, y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i18).wkgbmnqykc(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i18).iobyxmoadg()), draadjrbmkVar5, 0, 0, 65528);
                draadjrbmkVar5.cqumvgiudr();
                draadjrbmkVar5.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        } else {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1300064035);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: cr.dxjokdxxww
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wflxmlrfwp.gxszxtbevo((xq.zoijcleaow) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1724132563, i15, -1, "ru.myspar.catalog.impl.pager.presentation.compose.partners.CatalogPagerPartnersList (CatalogPagerPartnersList.kt:32)");
            }
            if (items.isEmpty()) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1647330108);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm3 = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 0.0f, 13, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1300070097);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(items) | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: cr.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wflxmlrfwp.lqeggnwhkg(items, draadjrbmkVar4, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: cr.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wflxmlrfwp.lqeggnwhkg(items, draadjrbmkVar4, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarOxmwwwfdhm3, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6, 510);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1647814793);
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar7 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar7, 0.0f, 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar8 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar8.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo3);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar9 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar9.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar9.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar9.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar9.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar9.wkgbmnqykc());
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg.wkgbmnqykc(iobyxmoadgVar7, iobyxmoadgVar8.eablkybsjg());
                String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.restaurants_empty_warning, draadjrbmkVarBtonecajqb, 0);
                z zVar3 = z.f44180iobyxmoadg;
                int i19 = z.f44181zoijcleaow;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(strPpxfxbqfkf3, wkgbmnqykcVarWkgbmnqykc3, y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i19).wkgbmnqykc(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i19).iobyxmoadg()), draadjrbmkVar5, 0, 0, 65528);
                draadjrbmkVar5.cqumvgiudr();
                draadjrbmkVar5.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cr.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wflxmlrfwp.dxjokdxxww(items, draadjrbmkVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(xq.zoijcleaow it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(List list, tg.draadjrbmk draadjrbmkVar, jpowsppfya LazyColumn) {
        zdlpuopuiu.btonecajqb(LazyColumn, "$this$LazyColumn");
        LazyColumn.nufgyqmvbu(list.size(), new ppxfxbqfkf(new tg.draadjrbmk() { // from class: cr.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wflxmlrfwp.nufgyqmvbu((xq.zoijcleaow) obj);
            }
        }, list), new wkgbmnqykc(zoijcleaow.f25547zdlpuopuiu, list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new eablkybsjg(list, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nufgyqmvbu(xq.zoijcleaow it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.wkgbmnqykc();
    }
}
