package dr;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.oxmwwwfdhm;
import ydmasvzmpa.iwizpuwonk;
import ydmasvzmpa.ntlheqmsrt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ojitshcjhn {

    static final class iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ oq.iobyxmoadg f29337yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f29338zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, oq.iobyxmoadg iobyxmoadgVar) {
            this.f29338zdlpuopuiu = draadjrbmkVar;
            this.f29337yggfygwlhe = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f29338zdlpuopuiu.invoke(this.f29337yggfygwlhe);
        }
    }

    public static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f29339zdlpuopuiu;

        public ppxfxbqfkf(List list) {
            this.f29339zdlpuopuiu = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            this.f29339zdlpuopuiu.get(i13);
            return null;
        }
    }

    public static final class wkgbmnqykc implements oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f29340yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f29341zdlpuopuiu;

        public wkgbmnqykc(List list, tg.draadjrbmk draadjrbmkVar) {
            this.f29341zdlpuopuiu = list;
            this.f29340yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((iwizpuwonk) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(iwizpuwonk iwizpuwonkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (draadjrbmkVar.ulzqkzuiru(iwizpuwonkVar) ? 4 : 2);
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
                jyumaefscl.ntlheqmsrt(-1942245546, i15, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
            }
            oq.iobyxmoadg iobyxmoadgVar = (oq.iobyxmoadg) this.f29341zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(1655295339);
            int i16 = i13 % 2;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "ivImage", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(i16 == 0 ? 0 : 8), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(i16 == 0 ? 8 : 0), w0.nufgyqmvbu.lqeggnwhkg(16), 2, null);
            draadjrbmkVar.sopmlzcsov(330508819);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f29340yggfygwlhe) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(this.f29340yggfygwlhe, iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            btonecajqb.eablkybsjg(iobyxmoadgVar, wkgbmnqykcVarOxmwwwfdhm, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0, 0);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f29342yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f29343zdlpuopuiu;

        public zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, List list) {
            this.f29343zdlpuopuiu = rgvfuqvkyqVar;
            this.f29342yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f29343zdlpuopuiu.invoke(Integer.valueOf(i13), this.f29342yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(List list, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(list, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void eablkybsjg(final List models, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        tg.draadjrbmk draadjrbmkVar3;
        final tg.draadjrbmk draadjrbmkVar4;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt;
        final tg.draadjrbmk draadjrbmkVar5;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar6;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(models, "models");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(1094506122);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(models) ? 4 : 2) | i13;
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
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-844206141);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: dr.gtknphoqwx
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return ojitshcjhn.gxszxtbevo((oq.iobyxmoadg) obj);
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
                    jyumaefscl.ntlheqmsrt(1094506122, i15, -1, "ru.myspar.catalog.impl.pager.presentation.compose.spar.CatalogPagerSparList (CatalogPagerSparList.kt:27)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.gxszxtbevo(l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "rvCatalogItems", null, null, false, 14, null), 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 0.0f, 13, null);
                ydmasvzmpa.zoijcleaow.iobyxmoadg iobyxmoadgVar = new ydmasvzmpa.zoijcleaow.iobyxmoadg(2);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-844198093);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(models) | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: dr.draadjrbmk
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ojitshcjhn.lqeggnwhkg(models, draadjrbmkVar4, (ntlheqmsrt) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar5 = draadjrbmkVar4;
                draadjrbmkVar6 = draadjrbmkVarBtonecajqb;
                ydmasvzmpa.dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar, wkgbmnqykcVarOxmwwwfdhm, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0, 0, 1020);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar5 = draadjrbmkVar3;
                draadjrbmkVar6 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar6.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: dr.wflxmlrfwp
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ojitshcjhn.dxjokdxxww(models, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        draadjrbmkVar3 = draadjrbmkVar;
        if ((i15 & 19) == 18) {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-844206141);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: dr.gtknphoqwx
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ojitshcjhn.gxszxtbevo((oq.iobyxmoadg) obj);
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
                jyumaefscl.ntlheqmsrt(1094506122, i15, -1, "ru.myspar.catalog.impl.pager.presentation.compose.spar.CatalogPagerSparList (CatalogPagerSparList.kt:27)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm2 = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.gxszxtbevo(l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "rvCatalogItems", null, null, false, 14, null), 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 0.0f, 13, null);
            ydmasvzmpa.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new ydmasvzmpa.zoijcleaow.iobyxmoadg(2);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-844198093);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(models) | ((i15 & 112) == 32);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: dr.draadjrbmk
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ojitshcjhn.lqeggnwhkg(models, draadjrbmkVar4, (ntlheqmsrt) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: dr.draadjrbmk
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ojitshcjhn.lqeggnwhkg(models, draadjrbmkVar4, (ntlheqmsrt) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar5 = draadjrbmkVar4;
            draadjrbmkVar6 = draadjrbmkVarBtonecajqb;
            ydmasvzmpa.dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar2, wkgbmnqykcVarOxmwwwfdhm2, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0, 0, 1020);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        } else {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-844206141);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: dr.gtknphoqwx
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ojitshcjhn.gxszxtbevo((oq.iobyxmoadg) obj);
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
                jyumaefscl.ntlheqmsrt(1094506122, i15, -1, "ru.myspar.catalog.impl.pager.presentation.compose.spar.CatalogPagerSparList (CatalogPagerSparList.kt:27)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm3 = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.gxszxtbevo(l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "rvCatalogItems", null, null, false, 14, null), 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 0.0f, 13, null);
            ydmasvzmpa.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new ydmasvzmpa.zoijcleaow.iobyxmoadg(2);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-844198093);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(models) | ((i15 & 112) == 32);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: dr.draadjrbmk
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ojitshcjhn.lqeggnwhkg(models, draadjrbmkVar4, (ntlheqmsrt) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: dr.draadjrbmk
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ojitshcjhn.lqeggnwhkg(models, draadjrbmkVar4, (ntlheqmsrt) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar5 = draadjrbmkVar4;
            draadjrbmkVar6 = draadjrbmkVarBtonecajqb;
            ydmasvzmpa.dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar3, wkgbmnqykcVarOxmwwwfdhm3, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0, 0, 1020);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0VarWflxmlrfwp = draadjrbmkVar6.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: dr.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.dxjokdxxww(models, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(oq.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(List list, tg.draadjrbmk draadjrbmkVar, ntlheqmsrt LazyVerticalGrid) {
        zdlpuopuiu.btonecajqb(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyVerticalGrid.lqeggnwhkg(list.size(), new zoijcleaow(new tg.rgvfuqvkyq() { // from class: dr.agtfadlqog
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ojitshcjhn.nufgyqmvbu(((Integer) obj).intValue(), (oq.iobyxmoadg) obj2);
            }
        }, list), null, new ppxfxbqfkf(list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1942245546, true, new wkgbmnqykc(list, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nufgyqmvbu(int i13, oq.iobyxmoadg item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item.getItemId();
    }
}
