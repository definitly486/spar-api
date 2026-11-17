package zq1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import igdgnonuha.z;
import java.util.List;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes6.dex */
public abstract class stevsuqkhv {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof hs1.iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f131004cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f131005esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f131006istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f131007iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f131008jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f131009lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f131010pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f131011yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hs1.iobyxmoadg f131012zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f131013zynmafqrjb;

        ppxfxbqfkf(hs1.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, tg.draadjrbmk draadjrbmkVar2, tg.rgvfuqvkyq rgvfuqvkyqVar2, ef.iobyxmoadg iobyxmoadgVar2) {
            this.f131012zdlpuopuiu = iobyxmoadgVar;
            this.f131011yggfygwlhe = z13;
            this.f131008jyumaefscl = i13;
            this.f131007iwizpuwonk = draadjrbmkVar;
            this.f131004cqumvgiudr = rgvfuqvkyqVar;
            this.f131005esjtqupxsv = vdvldrhtssVar;
            this.f131009lereixgezr = vdvldrhtssVar2;
            this.f131010pmvmpeiblj = draadjrbmkVar2;
            this.f131013zynmafqrjb = rgvfuqvkyqVar2;
            this.f131006istkbnxepw = iobyxmoadgVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn agtfadlqog(tg.vdvldrhtss vdvldrhtssVar, AnalyticsLocation.ItemFeed itemFeed, ProductUiModel product, HintUiModel hint) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            vdvldrhtssVar.invoke(hint, new AnalyticElement.ProductItemElement(product.getId(), product.getName()), itemFeed);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn btonecajqb(tg.rgvfuqvkyq rgvfuqvkyqVar, AnalyticsLocation.ItemFeed itemFeed, ProductUiModel uiModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            rgvfuqvkyqVar.invoke(uiModel, itemFeed);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, hs1.iobyxmoadg iobyxmoadgVar) {
            draadjrbmkVar.invoke(iobyxmoadgVar);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn ojitshcjhn(tg.vdvldrhtss vdvldrhtssVar, AnalyticsLocation.ItemFeed itemFeed, ProductUiModel uiModel, ProductCardEvent event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            vdvldrhtssVar.invoke(uiModel, event, itemFeed);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn wflxmlrfwp(tg.rgvfuqvkyq rgvfuqvkyqVar, AnalyticsLocation.ItemFeed itemFeed, ProductUiModel it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            rgvfuqvkyqVar.invoke(it, itemFeed);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            lqeggnwhkg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void lqeggnwhkg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1200990534, i13, -1, "ru.myspar.proloyalty.specialbanner.impl.presentation.adapters.delegate.specialBannerProductListAdapterDelegate.<anonymous>.<anonymous>.<anonymous> (SpecialBannerProductListAdapterDelegate.kt:40)");
            }
            if (!this.f131012zdlpuopuiu.dxjokdxxww().isEmpty()) {
                draadjrbmkVar.sopmlzcsov(-1631553458);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f131012zdlpuopuiu);
                hs1.iobyxmoadg iobyxmoadgVar = this.f131012zdlpuopuiu;
                ef.iobyxmoadg iobyxmoadgVar2 = this.f131006istkbnxepw;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    ColorsUiModel colorsUiModelLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
                    objYadqdtsiqt = colorsUiModelLqeggnwhkg != null ? oipsdeybqn.dxjokdxxww(bfopjjpdmp.zoijcleaow(colorsUiModelLqeggnwhkg.xrmfcynszj(iobyxmoadgVar2.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY))) : null;
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                oipsdeybqn oipsdeybqnVar = (oipsdeybqn) objYadqdtsiqt;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-1631546214);
                boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f131012zdlpuopuiu);
                hs1.iobyxmoadg iobyxmoadgVar3 = this.f131012zdlpuopuiu;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                boolean z13 = false;
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = Boolean.valueOf(iobyxmoadgVar3.dxjokdxxww().size() > 3);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                boolean zBooleanValue = ((Boolean) objYadqdtsiqt2).booleanValue();
                draadjrbmkVar.stevsuqkhv();
                final AnalyticsLocation.ItemFeed itemFeed = new AnalyticsLocation.ItemFeed(this.f131012zdlpuopuiu.getItemId(), this.f131012zdlpuopuiu.gtknphoqwx());
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 7, null);
                String strGtknphoqwx = this.f131012zdlpuopuiu.gtknphoqwx();
                boolean z14 = !mj.kcexrzcfyt.zfvoamnweg(this.f131012zdlpuopuiu.gtknphoqwx());
                String strEablkybsjg = this.f131012zdlpuopuiu.eablkybsjg();
                if (!mj.kcexrzcfyt.zfvoamnweg(this.f131012zdlpuopuiu.eablkybsjg()) && this.f131012zdlpuopuiu.nufgyqmvbu().nufgyqmvbu()) {
                    z13 = true;
                }
                draadjrbmkVar.sopmlzcsov(-1631527852);
                long jBtonecajqb = oipsdeybqnVar == null ? z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, z.f44181zoijcleaow).btonecajqb() : oipsdeybqnVar.iwizpuwonk();
                draadjrbmkVar.stevsuqkhv();
                List listDxjokdxxww = this.f131012zdlpuopuiu.dxjokdxxww();
                boolean z15 = this.f131011yggfygwlhe;
                int i14 = this.f131008jyumaefscl;
                draadjrbmkVar.sopmlzcsov(-1631500305);
                boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(this.f131007iwizpuwonk) | draadjrbmkVar.lmojexxdyd(this.f131012zdlpuopuiu);
                final tg.draadjrbmk draadjrbmkVar2 = this.f131007iwizpuwonk;
                final hs1.iobyxmoadg iobyxmoadgVar4 = this.f131012zdlpuopuiu;
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: zq1.kegysxyocb
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return stevsuqkhv.ppxfxbqfkf.gtknphoqwx(draadjrbmkVar2, iobyxmoadgVar4);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.iobyxmoadg iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-1631516262);
                boolean zUlzqkzuiru4 = draadjrbmkVar.ulzqkzuiru(this.f131004cqumvgiudr) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.rgvfuqvkyq rgvfuqvkyqVar = this.f131004cqumvgiudr;
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: zq1.tzroggbefp
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return stevsuqkhv.ppxfxbqfkf.wflxmlrfwp(rgvfuqvkyqVar, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt4;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-1631513395);
                boolean zUlzqkzuiru5 = draadjrbmkVar.ulzqkzuiru(this.f131005esjtqupxsv) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.vdvldrhtss vdvldrhtssVar = this.f131005esjtqupxsv;
                Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.rgvfuqvkyq() { // from class: zq1.mbcevpiqjq
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return stevsuqkhv.ppxfxbqfkf.agtfadlqog(vdvldrhtssVar, itemFeed, (ProductUiModel) obj, (HintUiModel) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar2 = (tg.rgvfuqvkyq) objYadqdtsiqt5;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-1631497884);
                boolean zUlzqkzuiru6 = draadjrbmkVar.ulzqkzuiru(this.f131009lereixgezr) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.vdvldrhtss vdvldrhtssVar2 = this.f131009lereixgezr;
                Object objYadqdtsiqt6 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru6 || objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new tg.rgvfuqvkyq() { // from class: zq1.ntlheqmsrt
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return stevsuqkhv.ppxfxbqfkf.ojitshcjhn(vdvldrhtssVar2, itemFeed, (ProductUiModel) obj, (ProductCardEvent) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt6);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar3 = (tg.rgvfuqvkyq) objYadqdtsiqt6;
                draadjrbmkVar.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar4 = this.f131010pmvmpeiblj;
                draadjrbmkVar.sopmlzcsov(-1631490645);
                boolean zUlzqkzuiru7 = draadjrbmkVar.ulzqkzuiru(this.f131013zynmafqrjb) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.rgvfuqvkyq rgvfuqvkyqVar4 = this.f131013zynmafqrjb;
                Object objYadqdtsiqt7 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru7 || objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt7 = new tg.draadjrbmk() { // from class: zq1.ulzqkzuiru
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return stevsuqkhv.ppxfxbqfkf.btonecajqb(rgvfuqvkyqVar4, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt7);
                }
                draadjrbmkVar.stevsuqkhv();
                bt0.vdvldrhtss.dxjokdxxww(strGtknphoqwx, z14, strEablkybsjg, z13, wkgbmnqykcVarOxmwwwfdhm, 0L, jBtonecajqb, z15, i14, listDxjokdxxww, zBooleanValue, zBooleanValue, null, 0, iobyxmoadgVar5, draadjrbmkVar3, rgvfuqvkyqVar2, rgvfuqvkyqVar3, draadjrbmkVar4, (tg.draadjrbmk) objYadqdtsiqt7, draadjrbmkVar, 24576, 0, 12320);
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f131014zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o41.iobyxmoadg eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        o41.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = o41.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(final boolean z13, final int i13, final tg.draadjrbmk draadjrbmkVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.vdvldrhtss vdvldrhtssVar, final tg.vdvldrhtss vdvldrhtssVar2, final tg.draadjrbmk draadjrbmkVar2, final tg.rgvfuqvkyq rgvfuqvkyqVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: zq1.wypolnanlu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return stevsuqkhv.lqeggnwhkg(adapterDelegateViewBinding, z13, i13, draadjrbmkVar, rgvfuqvkyqVar, vdvldrhtssVar, vdvldrhtssVar2, draadjrbmkVar2, rgvfuqvkyqVar2, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, tg.draadjrbmk draadjrbmkVar2, tg.rgvfuqvkyq rgvfuqvkyqVar2, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((o41.iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).f72032zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1200990534, true, new ppxfxbqfkf((hs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg(), z13, i13, draadjrbmkVar, rgvfuqvkyqVar, vdvldrhtssVar, vdvldrhtssVar2, draadjrbmkVar2, rgvfuqvkyqVar2, iobyxmoadgVar)));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk onProductsMoreClicked, final tg.rgvfuqvkyq onProductClicked, final tg.vdvldrhtss onHintClicked, final tg.vdvldrhtss onProductChanged, final tg.draadjrbmk onAddToPurchaseListClicked, final tg.rgvfuqvkyq onFavoriteClicked, final boolean z13, final int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductsMoreClicked, "onProductsMoreClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductChanged, "onProductChanged");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddToPurchaseListClicked, "onAddToPurchaseListClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFavoriteClicked, "onFavoriteClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: zq1.cllcsxoeiz
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return stevsuqkhv.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: zq1.dsvhmnatus
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return stevsuqkhv.gxszxtbevo(z13, i13, onProductsMoreClicked, onProductClicked, onHintClicked, onProductChanged, onAddToPurchaseListClicked, onFavoriteClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f131014zdlpuopuiu);
    }
}
