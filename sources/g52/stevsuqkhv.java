package g52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import igdgnonuha.z;
import java.util.List;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;

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
            return Boolean.valueOf(obj instanceof o62.iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f36313cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f36314esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f36315istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f36316iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f36317jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f36318lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f36319pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f36320yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ o62.iobyxmoadg f36321zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f36322zynmafqrjb;

        ppxfxbqfkf(o62.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, tg.draadjrbmk draadjrbmkVar2, tg.rgvfuqvkyq rgvfuqvkyqVar2, ef.iobyxmoadg iobyxmoadgVar2) {
            this.f36321zdlpuopuiu = iobyxmoadgVar;
            this.f36320yggfygwlhe = z13;
            this.f36317jyumaefscl = i13;
            this.f36316iwizpuwonk = draadjrbmkVar;
            this.f36313cqumvgiudr = rgvfuqvkyqVar;
            this.f36314esjtqupxsv = vdvldrhtssVar;
            this.f36318lereixgezr = vdvldrhtssVar2;
            this.f36319pmvmpeiblj = draadjrbmkVar2;
            this.f36322zynmafqrjb = rgvfuqvkyqVar2;
            this.f36315istkbnxepw = iobyxmoadgVar2;
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
        public static final gg.wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, o62.iobyxmoadg iobyxmoadgVar) {
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(549104875, i13, -1, "ru.myspar.specialbanner.impl.presentation.adapters.delegate.specialBannerProductListAdapterDelegate.<anonymous>.<anonymous>.<anonymous> (SpecialBannerProductListAdapterDelegate.kt:39)");
            }
            if (!this.f36321zdlpuopuiu.dxjokdxxww().isEmpty()) {
                draadjrbmkVar.sopmlzcsov(1508416817);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f36321zdlpuopuiu);
                o62.iobyxmoadg iobyxmoadgVar = this.f36321zdlpuopuiu;
                ef.iobyxmoadg iobyxmoadgVar2 = this.f36315istkbnxepw;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    ColorsUiModel colorsUiModelLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
                    objYadqdtsiqt = colorsUiModelLqeggnwhkg != null ? oipsdeybqn.dxjokdxxww(bfopjjpdmp.zoijcleaow(colorsUiModelLqeggnwhkg.wypolnanlu(iobyxmoadgVar2.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY))) : null;
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                oipsdeybqn oipsdeybqnVar = (oipsdeybqn) objYadqdtsiqt;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1508424061);
                boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f36321zdlpuopuiu);
                o62.iobyxmoadg iobyxmoadgVar3 = this.f36321zdlpuopuiu;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = Boolean.valueOf(iobyxmoadgVar3.dxjokdxxww().size() > 3);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                boolean zBooleanValue = ((Boolean) objYadqdtsiqt2).booleanValue();
                draadjrbmkVar.stevsuqkhv();
                final AnalyticsLocation.ItemFeed itemFeed = new AnalyticsLocation.ItemFeed(this.f36321zdlpuopuiu.getItemId(), this.f36321zdlpuopuiu.gtknphoqwx());
                String strGtknphoqwx = this.f36321zdlpuopuiu.gtknphoqwx();
                boolean z13 = !mj.kcexrzcfyt.zfvoamnweg(this.f36321zdlpuopuiu.gtknphoqwx());
                String strEablkybsjg = this.f36321zdlpuopuiu.eablkybsjg();
                boolean z14 = !mj.kcexrzcfyt.zfvoamnweg(this.f36321zdlpuopuiu.eablkybsjg()) && this.f36321zdlpuopuiu.nufgyqmvbu().lqeggnwhkg();
                draadjrbmkVar.sopmlzcsov(1508439863);
                long jBtonecajqb = oipsdeybqnVar == null ? z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, z.f44181zoijcleaow).btonecajqb() : oipsdeybqnVar.iwizpuwonk();
                draadjrbmkVar.stevsuqkhv();
                List listDxjokdxxww = this.f36321zdlpuopuiu.dxjokdxxww();
                czzsidtyhn.ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(!zBooleanValue ? 16 : 0), 0.0f, 2, null);
                boolean z15 = this.f36320yggfygwlhe;
                int i14 = this.f36317jyumaefscl;
                draadjrbmkVar.sopmlzcsov(1508470738);
                boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(this.f36316iwizpuwonk) | draadjrbmkVar.lmojexxdyd(this.f36321zdlpuopuiu);
                final tg.draadjrbmk draadjrbmkVar2 = this.f36316iwizpuwonk;
                final o62.iobyxmoadg iobyxmoadgVar4 = this.f36321zdlpuopuiu;
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: g52.kegysxyocb
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return stevsuqkhv.ppxfxbqfkf.gtknphoqwx(draadjrbmkVar2, iobyxmoadgVar4);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.iobyxmoadg iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1508454781);
                boolean zUlzqkzuiru4 = draadjrbmkVar.ulzqkzuiru(this.f36313cqumvgiudr) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.rgvfuqvkyq rgvfuqvkyqVar = this.f36313cqumvgiudr;
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: g52.tzroggbefp
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return stevsuqkhv.ppxfxbqfkf.wflxmlrfwp(rgvfuqvkyqVar, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt4;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1508457648);
                boolean zUlzqkzuiru5 = draadjrbmkVar.ulzqkzuiru(this.f36314esjtqupxsv) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.vdvldrhtss vdvldrhtssVar = this.f36314esjtqupxsv;
                Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.rgvfuqvkyq() { // from class: g52.mbcevpiqjq
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return stevsuqkhv.ppxfxbqfkf.agtfadlqog(vdvldrhtssVar, itemFeed, (ProductUiModel) obj, (HintUiModel) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar2 = (tg.rgvfuqvkyq) objYadqdtsiqt5;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1508473159);
                boolean zUlzqkzuiru6 = draadjrbmkVar.ulzqkzuiru(this.f36318lereixgezr) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.vdvldrhtss vdvldrhtssVar2 = this.f36318lereixgezr;
                Object objYadqdtsiqt6 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru6 || objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new tg.rgvfuqvkyq() { // from class: g52.ntlheqmsrt
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return stevsuqkhv.ppxfxbqfkf.ojitshcjhn(vdvldrhtssVar2, itemFeed, (ProductUiModel) obj, (ProductCardEvent) obj2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt6);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar3 = (tg.rgvfuqvkyq) objYadqdtsiqt6;
                draadjrbmkVar.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar4 = this.f36319pmvmpeiblj;
                draadjrbmkVar.sopmlzcsov(1508480398);
                boolean zUlzqkzuiru7 = draadjrbmkVar.ulzqkzuiru(this.f36322zynmafqrjb) | draadjrbmkVar.lmojexxdyd(itemFeed);
                final tg.rgvfuqvkyq rgvfuqvkyqVar4 = this.f36322zynmafqrjb;
                Object objYadqdtsiqt7 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru7 || objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt7 = new tg.draadjrbmk() { // from class: g52.ulzqkzuiru
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return stevsuqkhv.ppxfxbqfkf.btonecajqb(rgvfuqvkyqVar4, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt7);
                }
                draadjrbmkVar.stevsuqkhv();
                hu.vdvldrhtss.dxjokdxxww(strGtknphoqwx, z13, strEablkybsjg, z14, null, 0L, jBtonecajqb, z15, i14, listDxjokdxxww, zBooleanValue, zBooleanValue, ydmasvzmpaVarLqeggnwhkg, 16, iobyxmoadgVar5, draadjrbmkVar3, rgvfuqvkyqVar2, rgvfuqvkyqVar3, draadjrbmkVar4, (tg.draadjrbmk) objYadqdtsiqt7, draadjrbmkVar, 0, 3072, 48);
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36323zdlpuopuiu = new zoijcleaow();

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
    public static final b60.iobyxmoadg eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b60.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = b60.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(final boolean z13, final int i13, final tg.draadjrbmk draadjrbmkVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.vdvldrhtss vdvldrhtssVar, final tg.vdvldrhtss vdvldrhtssVar2, final tg.draadjrbmk draadjrbmkVar2, final tg.rgvfuqvkyq rgvfuqvkyqVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.wypolnanlu
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
        ((b60.iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).f15357zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(549104875, true, new ppxfxbqfkf((o62.iobyxmoadg) iobyxmoadgVar.eablkybsjg(), z13, i13, draadjrbmkVar, rgvfuqvkyqVar, vdvldrhtssVar, vdvldrhtssVar2, draadjrbmkVar2, rgvfuqvkyqVar2, iobyxmoadgVar)));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk onProductsMoreClicked, final tg.rgvfuqvkyq onProductClicked, final tg.vdvldrhtss onHintClicked, final tg.vdvldrhtss onProductChanged, final tg.draadjrbmk onAddToPurchaseListClicked, final tg.rgvfuqvkyq onFavoriteClicked, final boolean z13, final int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductsMoreClicked, "onProductsMoreClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductChanged, "onProductChanged");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddToPurchaseListClicked, "onAddToPurchaseListClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFavoriteClicked, "onFavoriteClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.cllcsxoeiz
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return stevsuqkhv.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.dsvhmnatus
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return stevsuqkhv.gxszxtbevo(z13, i13, onProductsMoreClicked, onProductClicked, onHintClicked, onProductChanged, onAddToPurchaseListClicked, onFavoriteClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36323zdlpuopuiu);
    }
}
