package ru.myspar.proloyalty.favorites.impl.presentation;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import czzsidtyhn.ydmasvzmpa;
import fiwbwshyhd.kcexrzcfyt;
import gg.wwaezpbzkn;
import igdgnonuha.s2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import m81.agtfadlqog;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.favorites.impl.domain.store.State;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f96355zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
            this.f96355zdlpuopuiu = draadjrbmkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar) {
            draadjrbmkVar.invoke(gtknphoqwx.iobyxmoadg.f96335iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            zoijcleaow((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-124026426, i13, -1, "ru.myspar.proloyalty.favorites.impl.presentation.FavoritesScreen.<anonymous> (FavoritesScreen.kt:50)");
            }
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(j81.ppxfxbqfkf.proloyalty_favorites, draadjrbmkVar, 0);
            draadjrbmkVar.sopmlzcsov(-1840373031);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f96355zdlpuopuiu);
            final tg.draadjrbmk draadjrbmkVar2 = this.f96355zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(draadjrbmkVar2);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            e31.eablkybsjg.nufgyqmvbu(null, strPpxfxbqfkf, null, false, (tg.iobyxmoadg) objYadqdtsiqt, null, false, null, draadjrbmkVar, 0, 237);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f96356jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ l81.nufgyqmvbu f96357yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ fiwbwshyhd.vdvldrhtss f96358zdlpuopuiu;

        public /* synthetic */ class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f96359iobyxmoadg;

            static {
                int[] iArr = new int[State.zoijcleaow.values().length];
                try {
                    iArr[State.zoijcleaow.NO_AUTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[State.zoijcleaow.EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[State.zoijcleaow.HIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f96359iobyxmoadg = iArr;
            }
        }

        zoijcleaow(fiwbwshyhd.vdvldrhtss vdvldrhtssVar, l81.nufgyqmvbu nufgyqmvbuVar, tg.draadjrbmk draadjrbmkVar) {
            this.f96358zdlpuopuiu = vdvldrhtssVar;
            this.f96357yggfygwlhe = nufgyqmvbuVar;
            this.f96356jyumaefscl = draadjrbmkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn agtfadlqog(tg.draadjrbmk draadjrbmkVar, ProductUiModel it) {
            zdlpuopuiu.btonecajqb(it, "it");
            draadjrbmkVar.invoke(new gtknphoqwx.wkgbmnqykc(it.getId()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn kcexrzcfyt(tg.draadjrbmk draadjrbmkVar, String it) {
            zdlpuopuiu.btonecajqb(it, "it");
            draadjrbmkVar.invoke(new gtknphoqwx.ppxfxbqfkf(it));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ojitshcjhn(tg.draadjrbmk draadjrbmkVar, String itemId, ProductCardEvent event) {
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            zdlpuopuiu.btonecajqb(event, "event");
            draadjrbmkVar.invoke(new gtknphoqwx.lqeggnwhkg(itemId, event));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn oxmwwwfdhm(tg.draadjrbmk draadjrbmkVar, ProductUiModel it) {
            zdlpuopuiu.btonecajqb(it, "it");
            draadjrbmkVar.invoke(new gtknphoqwx.nufgyqmvbu(it.getId()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn wflxmlrfwp(tg.draadjrbmk draadjrbmkVar) {
            draadjrbmkVar.invoke(gtknphoqwx.zoijcleaow.f96341iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn yggfygwlhe(tg.draadjrbmk draadjrbmkVar, HintUiModel hint, ProductUiModel product) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(product, "product");
            draadjrbmkVar.invoke(new gtknphoqwx.eablkybsjg(hint, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn zdlpuopuiu(tg.draadjrbmk draadjrbmkVar) {
            draadjrbmkVar.invoke(gtknphoqwx.gxszxtbevo.f96334iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void gtknphoqwx(ydmasvzmpa paddings, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            wflxmlrfwp wflxmlrfwpVar;
            zdlpuopuiu.btonecajqb(paddings, "paddings");
            if ((i13 & 6) == 0) {
                i14 = i13 | (draadjrbmkVar.ulzqkzuiru(paddings) ? 4 : 2);
            } else {
                i14 = i13;
            }
            if ((i14 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(295723327, i14, -1, "ru.myspar.proloyalty.favorites.impl.presentation.FavoritesScreen.<anonymous> (FavoritesScreen.kt:56)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarDraadjrbmk = esjtqupxsv.draadjrbmk(cdpycssgdh.gxszxtbevo(fiwbwshyhd.wflxmlrfwp.wkgbmnqykc(iobyxmoadgVar, this.f96358zdlpuopuiu, false, 2, null), 0.0f, 1, null), paddings);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            a.eablkybsjg eablkybsjgVarEablkybsjg = iobyxmoadgVar2.eablkybsjg();
            l81.nufgyqmvbu nufgyqmvbuVar = this.f96357yggfygwlhe;
            final tg.draadjrbmk draadjrbmkVar2 = this.f96356jyumaefscl;
            fiwbwshyhd.vdvldrhtss vdvldrhtssVar = this.f96358zdlpuopuiu;
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(eablkybsjgVarEablkybsjg, false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarDraadjrbmk);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f4892iobyxmoadg;
            int i15 = iobyxmoadg.f96359iobyxmoadg[nufgyqmvbuVar.wkgbmnqykc().ordinal()];
            if (i15 == 1) {
                wflxmlrfwpVar = wflxmlrfwpVar2;
                draadjrbmkVar.sopmlzcsov(106064277);
                agtfadlqog.zoijcleaow(esjtqupxsv.rgvfuqvkyq(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar, iobyxmoadgVar2.eablkybsjg()), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), draadjrbmkVar, 0, 0);
                draadjrbmkVar.stevsuqkhv();
            } else if (i15 == 2) {
                wflxmlrfwpVar = wflxmlrfwpVar2;
                draadjrbmkVar.sopmlzcsov(106072320);
                draadjrbmkVar.sopmlzcsov(106074267);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.wkgbmnqykc
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.zoijcleaow.wflxmlrfwp(draadjrbmkVar2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                m81.draadjrbmk.zoijcleaow((tg.iobyxmoadg) objYadqdtsiqt, esjtqupxsv.rgvfuqvkyq(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar, iobyxmoadgVar2.eablkybsjg()), w0.nufgyqmvbu.lqeggnwhkg(48), 0.0f, 2, null), draadjrbmkVar, 0, 0);
                draadjrbmkVar.stevsuqkhv();
            } else {
                if (i15 != 3) {
                    draadjrbmkVar.sopmlzcsov(106063138);
                    draadjrbmkVar.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar.sopmlzcsov(-1006375229);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(iobyxmoadgVar, 0.0f, 1, null);
                int iIobyxmoadg = nufgyqmvbuVar.iobyxmoadg();
                List listPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
                List listZoijcleaow = nufgyqmvbuVar.zoijcleaow();
                if (!nufgyqmvbuVar.eablkybsjg()) {
                    listZoijcleaow = null;
                }
                draadjrbmkVar.sopmlzcsov(106096416);
                boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2);
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ppxfxbqfkf.zoijcleaow.kcexrzcfyt(draadjrbmkVar2, (String) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt2;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(106091477);
                boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2);
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.gxszxtbevo
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.zoijcleaow.zdlpuopuiu(draadjrbmkVar2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.iobyxmoadg iobyxmoadgVar4 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(106106723);
                boolean zUlzqkzuiru4 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2);
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new rgvfuqvkyq() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.lqeggnwhkg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ppxfxbqfkf.zoijcleaow.yggfygwlhe(draadjrbmkVar2, (HintUiModel) obj, (ProductUiModel) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) objYadqdtsiqt4;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(106093699);
                boolean zUlzqkzuiru5 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2);
                Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.nufgyqmvbu
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ppxfxbqfkf.zoijcleaow.agtfadlqog(draadjrbmkVar2, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                }
                tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt5;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(106101671);
                boolean zUlzqkzuiru6 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2);
                Object objYadqdtsiqt6 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru6 || objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new rgvfuqvkyq() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.dxjokdxxww
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ppxfxbqfkf.zoijcleaow.ojitshcjhn(draadjrbmkVar2, (String) obj, (ProductCardEvent) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt6);
                }
                rgvfuqvkyq rgvfuqvkyqVar2 = (rgvfuqvkyq) objYadqdtsiqt6;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(106098946);
                boolean zUlzqkzuiru7 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2);
                Object objYadqdtsiqt7 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru7 || objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt7 = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.favorites.impl.presentation.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ppxfxbqfkf.zoijcleaow.oxmwwwfdhm(draadjrbmkVar2, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt7);
                }
                tg.draadjrbmk draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt7;
                draadjrbmkVar.stevsuqkhv();
                wflxmlrfwpVar = wflxmlrfwpVar2;
                m81.dxjokdxxww.wkgbmnqykc(listPpxfxbqfkf, listZoijcleaow, iIobyxmoadg, draadjrbmkVar3, iobyxmoadgVar4, rgvfuqvkyqVar, draadjrbmkVar4, rgvfuqvkyqVar2, draadjrbmkVar5, wkgbmnqykcVarGxszxtbevo, draadjrbmkVar, 805306368, 0);
                draadjrbmkVar.stevsuqkhv();
            }
            if (nufgyqmvbuVar.gxszxtbevo()) {
                draadjrbmkVar.sopmlzcsov(-1005140964);
                o31.wkgbmnqykc.eablkybsjg(null, false, false, null, draadjrbmkVar, 0, 15);
                draadjrbmkVar.stevsuqkhv();
            } else {
                draadjrbmkVar.sopmlzcsov(-1005083118);
                fiwbwshyhd.dxjokdxxww.agtfadlqog(nufgyqmvbuVar.lqeggnwhkg(), vdvldrhtssVar, wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar, iobyxmoadgVar2.wflxmlrfwp()), 0L, 0L, false, draadjrbmkVar, fiwbwshyhd.vdvldrhtss.f33995btonecajqb << 3, 56);
                draadjrbmkVar.stevsuqkhv();
            }
            draadjrbmkVar.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            gtknphoqwx((ydmasvzmpa) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(l81.nufgyqmvbu nufgyqmvbuVar, tg.draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        ppxfxbqfkf(nufgyqmvbuVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final l81.nufgyqmvbu model, final tg.draadjrbmk onEvent, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(onEvent, "onEvent");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1127620481);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onEvent) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1127620481, i14, -1, "ru.myspar.proloyalty.favorites.impl.presentation.FavoritesScreen (FavoritesScreen.kt:39)");
            }
            boolean zLqeggnwhkg = model.lqeggnwhkg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(439771732);
            boolean z13 = (i14 & 112) == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: l81.gxszxtbevo
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ru.myspar.proloyalty.favorites.impl.presentation.ppxfxbqfkf.wkgbmnqykc(onEvent);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            s2.nufgyqmvbu(cdpycssgdh.gxszxtbevo(w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "ROOT_FAVORITES", null, null, false, 14, null), 0.0f, 1, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-124026426, true, new iobyxmoadg(onEvent), draadjrbmkVarBtonecajqb, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(295723327, true, new zoijcleaow(kcexrzcfyt.zoijcleaow(zLqeggnwhkg, (tg.iobyxmoadg) objYadqdtsiqt, 0.0f, 0.0f, draadjrbmkVarBtonecajqb, 0, 12), model, onEvent), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar2, 384, 12582912, 131066);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: l81.lqeggnwhkg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ru.myspar.proloyalty.favorites.impl.presentation.ppxfxbqfkf.eablkybsjg(model, onEvent, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(gtknphoqwx.dxjokdxxww.f96331iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
