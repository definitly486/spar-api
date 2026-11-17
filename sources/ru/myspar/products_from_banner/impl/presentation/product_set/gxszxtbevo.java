package ru.myspar.products_from_banner.impl.presentation.product_set;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.nufgyqmvbu;
import c60.lqeggnwhkg;
import com.google.android.material.button.MaterialButton;
import czzsidtyhn.tbqsvytpvh;
import gg.wwaezpbzkn;
import gu.rgvfuqvkyq;
import kotlin.jvm.internal.zdlpuopuiu;
import lk0.dxjokdxxww;
import mj.kcexrzcfyt;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import tg.vdvldrhtss;
import v40.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zoijcleaow f91634cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final df.zoijcleaow f91635iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iwxlajgraz f91636jyumaefscl;

    static final class iobyxmoadg implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f91637yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f91638zdlpuopuiu;

        iobyxmoadg(dxjokdxxww dxjokdxxwwVar, gxszxtbevo gxszxtbevoVar) {
            this.f91638zdlpuopuiu = dxjokdxxwwVar;
            this.f91637yggfygwlhe = gxszxtbevoVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f91652iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            zoijcleaow((tbqsvytpvh) obj, (draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(tbqsvytpvh drawActionBar, draadjrbmk draadjrbmkVar, int i13) {
            zdlpuopuiu.btonecajqb(drawActionBar, "$this$drawActionBar");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1545256036, i13, -1, "ru.myspar.products_from_banner.impl.presentation.product_set.ProductsFromBannerViewImpl.configureActionBar.<anonymous> (ProductsFromBannerViewImpl.kt:140)");
            }
            if (this.f91638zdlpuopuiu.gtknphoqwx()) {
                int i14 = s40.gxszxtbevo.ic_echeck_purchase_list;
                draadjrbmkVar.sopmlzcsov(-2142604994);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f91637yggfygwlhe);
                final gxszxtbevo gxszxtbevoVar = this.f91637yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.products_from_banner.impl.presentation.product_set.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gxszxtbevo.iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                gtknphoqwx.zoijcleaow(i14, (tg.iobyxmoadg) objYadqdtsiqt, null, false, 0L, draadjrbmkVar, 0, 28);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow extends df.wkgbmnqykc {
        zoijcleaow(gxszxtbevo gxszxtbevoVar, nufgyqmvbu.gxszxtbevo gxszxtbevoVar2) {
            super(gxszxtbevoVar2);
            this.f27903iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar.f91635iwizpuwonk);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        iwxlajgraz iwxlajgrazVarPpxfxbqfkf = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
        this.f91636jyumaefscl = iwxlajgrazVarPpxfxbqfkf;
        this.f91635iwizpuwonk = rgvfuqvkyq.wkgbmnqykc(false, iwxlajgrazVarPpxfxbqfkf, false, false, true, qt.zoijcleaow.LOCAL_SCREEN_CHANGES, new tg.draadjrbmk() { // from class: lk0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.cqumvgiudr(this.f63270zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: lk0.gtknphoqwx
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.esjtqupxsv(this.f63286zdlpuopuiu, (HintUiModel) obj, (ProductUiModel) obj2);
            }
        }, new tg.draadjrbmk() { // from class: lk0.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.lereixgezr(this.f63271zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.draadjrbmk() { // from class: lk0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.pmvmpeiblj(this.f63294zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.draadjrbmk() { // from class: lk0.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.zynmafqrjb(this.f63269zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: lk0.ojitshcjhn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.istkbnxepw(this.f63288zdlpuopuiu, (String) obj, (ProductCardEvent) obj2);
            }
        });
        zoijcleaow zoijcleaowVar = new zoijcleaow(this, su.zoijcleaow.iobyxmoadg());
        this.f91634cqumvgiudr = zoijcleaowVar;
        fk0.iobyxmoadg iobyxmoadgVar = (fk0.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f34270nufgyqmvbu.setOnClickListener(new View.OnClickListener() { // from class: lk0.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.jyumaefscl(this.f63292zdlpuopuiu, view);
            }
        });
        MaterialButton materialButton = iobyxmoadgVar.f34276zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(materialButton);
        yggfygwlhe(materialButton);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: lk0.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.iwizpuwonk(this.f63293zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f34262btonecajqb.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        RecyclerView rvProducts = iobyxmoadgVar.f34262btonecajqb;
        zdlpuopuiu.dxjokdxxww(rvProducts, "rvProducts");
        e60.zoijcleaow.ppxfxbqfkf(rvProducts, zoijcleaowVar, iobyxmoadgVar);
        iobyxmoadgVar.f34262btonecajqb.btonecajqb(t40.zoijcleaow.f109665lqeggnwhkg.iobyxmoadg(wkgbmnqykc()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.draadjrbmk(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(gxszxtbevo gxszxtbevoVar, HintUiModel hint, ProductUiModel product) {
        zdlpuopuiu.btonecajqb(hint, "hint");
        zdlpuopuiu.btonecajqb(product, "product");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.btonecajqb(hint, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iozdgvuglv(fk0.iobyxmoadg iobyxmoadgVar, dxjokdxxww dxjokdxxwwVar) {
        iobyxmoadgVar.f34263draadjrbmk.setText(dxjokdxxwwVar.lqeggnwhkg());
        iobyxmoadgVar.f34274wflxmlrfwp.setText(dxjokdxxwwVar.nufgyqmvbu());
        iobyxmoadgVar.f34266gtknphoqwx.setText(dxjokdxxwwVar.ppxfxbqfkf());
        TextView textView = iobyxmoadgVar.f34266gtknphoqwx;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(gxszxtbevo gxszxtbevoVar, String productId, ProductCardEvent productCardEvent) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.gtknphoqwx(productId, productCardEvent));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f91648iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.nufgyqmvbu.f91654iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f91656iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.gxszxtbevo(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void lmojexxdyd(TextView textView, String str) {
        textView.setVisibility(str == null || kcexrzcfyt.zfvoamnweg(str) ? 8 : 0);
        textView.setText(str);
    }

    private final void oxmwwwfdhm(fk0.iobyxmoadg iobyxmoadgVar, dxjokdxxww dxjokdxxwwVar) {
        ComposeView cvActionBar = iobyxmoadgVar.f34275wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, null, null, false, new tg.iobyxmoadg() { // from class: lk0.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo.kcexrzcfyt(this.f63289zdlpuopuiu);
            }
        }, null, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1545256036, true, new iobyxmoadg(dxjokdxxwwVar, this)), 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.C2127ppxfxbqfkf(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yadqdtsiqt(ImageView imageView, Boolean bool) {
        imageView.setVisibility(bool != null ? 0 : 8);
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            imageView.setImageResource(s40.gxszxtbevo.ic_rounded_checkbox_true);
            imageView.setImageTintList(null);
        } else {
            imageView.setImageResource(s40.gxszxtbevo.ic_rounded_checkbox_false);
            lqeggnwhkg.gxszxtbevo(imageView, s40.ppxfxbqfkf.colorSpecialSurface6);
        }
    }

    private final void yggfygwlhe(MaterialButton materialButton) {
        int i13 = materialButton.getContext().getResources().getDisplayMetrics().widthPixels / 2;
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        Context context = materialButton.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        materialButton.setMinWidth(i13 - zoijcleaowVar.gxszxtbevo(context, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.zoijcleaow(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(fk0.iobyxmoadg binding, dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        oxmwwwfdhm(binding, model);
        this.f91636jyumaefscl.setValue(Boolean.valueOf(model.draadjrbmk() == null));
        ComposeView clLoading = binding.f34272ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.btonecajqb());
        binding.f34261agtfadlqog.setText(model.wkgbmnqykc());
        ImageView imageView = binding.f34267gxszxtbevo;
        String strZoijcleaow = model.zoijcleaow();
        if (strZoijcleaow == null || kcexrzcfyt.zfvoamnweg(strZoijcleaow)) {
            zdlpuopuiu.lqeggnwhkg(imageView);
            imageView.setVisibility(8);
        } else {
            zdlpuopuiu.lqeggnwhkg(imageView);
            imageView.setVisibility(0);
            c60.wkgbmnqykc.zoijcleaow(imageView, model.zoijcleaow());
        }
        TextView tvTotalProductsCount = binding.f34271ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(tvTotalProductsCount, "tvTotalProductsCount");
        lmojexxdyd(tvTotalProductsCount, model.gxszxtbevo());
        ImageView ivToggleAllProducts = binding.f34270nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivToggleAllProducts, "ivToggleAllProducts");
        yadqdtsiqt(ivToggleAllProducts, model.draadjrbmk());
        this.f91634cqumvgiudr.wkgbmnqykc(model.eablkybsjg());
        iozdgvuglv(binding, model);
        MaterialButton materialButton = binding.f34276zoijcleaow;
        materialButton.setEnabled(model.dxjokdxxww());
        materialButton.setText(model.iobyxmoadg());
    }

    public final void vdvldrhtss(int i13) {
        ppxfxbqfkf(new ppxfxbqfkf.lqeggnwhkg(i13));
    }

    public final void zdlpuopuiu() {
        ppxfxbqfkf(ppxfxbqfkf.dxjokdxxww.f91647iobyxmoadg);
    }
}
