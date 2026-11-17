package xr;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import yfnezrywwk.jpowsppfya;

/* JADX INFO: loaded from: classes4.dex */
public abstract class btonecajqb {

    public static final class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f123083zdlpuopuiu = new iobyxmoadg();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f123084yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f123085zdlpuopuiu;

        public ppxfxbqfkf(draadjrbmk draadjrbmkVar, List list) {
            this.f123085zdlpuopuiu = draadjrbmkVar;
            this.f123084yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f123085zdlpuopuiu.invoke(this.f123084yggfygwlhe.get(i13));
        }
    }

    public static final class wkgbmnqykc implements oxmwwwfdhm {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f123086zdlpuopuiu;

        public wkgbmnqykc(List list) {
            this.f123086zdlpuopuiu = list;
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
            bs.eablkybsjg eablkybsjgVar2 = (bs.eablkybsjg) this.f123086zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-232734203);
            gxszxtbevo.zoijcleaow(eablkybsjgVar2, null, draadjrbmkVar, 0, 2);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f123087yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f123088zdlpuopuiu;

        public zoijcleaow(draadjrbmk draadjrbmkVar, List list) {
            this.f123088zdlpuopuiu = draadjrbmkVar;
            this.f123087yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f123088zdlpuopuiu.invoke(this.f123087yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(List list, jpowsppfya LazyRow) {
        zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        LazyRow.nufgyqmvbu(list.size(), new zoijcleaow(new draadjrbmk() { // from class: xr.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return btonecajqb.gxszxtbevo((bs.eablkybsjg) obj);
            }
        }, list), new ppxfxbqfkf(iobyxmoadg.f123083zdlpuopuiu, list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new wkgbmnqykc(list)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(bs.eablkybsjg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(List list, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(list, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final List userReviews, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(userReviews, "userReviews");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-712658766);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(userReviews) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i15 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-712658766, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.reviews.UserReviewsList (UserReviewsList.kt:18)");
                }
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8));
                ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-656645669);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(userReviews);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: xr.lqeggnwhkg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return btonecajqb.eablkybsjg(userReviews, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarLqeggnwhkg, false, gxszxtbevoVarRgvfuqvkyq, null, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 24960, 490);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: xr.nufgyqmvbu
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return btonecajqb.lqeggnwhkg(userReviews, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 19) == 18) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-712658766, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.reviews.UserReviewsList (UserReviewsList.kt:18)");
            }
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8));
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg2 = esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-656645669);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(userReviews);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new draadjrbmk() { // from class: xr.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.eablkybsjg(userReviews, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: xr.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.eablkybsjg(userReviews, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarLqeggnwhkg2, false, gxszxtbevoVarRgvfuqvkyq2, null, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 24960, 490);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-712658766, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.reviews.UserReviewsList (UserReviewsList.kt:18)");
            }
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8));
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg3 = esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-656645669);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(userReviews);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new draadjrbmk() { // from class: xr.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.eablkybsjg(userReviews, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: xr.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.eablkybsjg(userReviews, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarLqeggnwhkg3, false, gxszxtbevoVarRgvfuqvkyq3, null, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 24960, 490);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: xr.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.lqeggnwhkg(userReviews, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
