package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set;

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
import at0.rgvfuqvkyq;
import bi1.nufgyqmvbu;
import com.google.android.material.button.MaterialButton;
import czzsidtyhn.tbqsvytpvh;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zoijcleaow f99332cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final df.zoijcleaow f99333iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iwxlajgraz f99334jyumaefscl;

    static final class iobyxmoadg implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f99335yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f99336zdlpuopuiu;

        iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            this.f99336zdlpuopuiu = nufgyqmvbuVar;
            this.f99335yggfygwlhe = gxszxtbevoVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f99349iobyxmoadg);
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
                jyumaefscl.ntlheqmsrt(2106258916, i13, -1, "ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.ProductsFromBannerViewImpl.configureActionBar.<anonymous> (ProductsFromBannerViewImpl.kt:140)");
            }
            if (this.f99336zdlpuopuiu.gtknphoqwx()) {
                int i14 = b31.gxszxtbevo.ic_echeck_purchase_list;
                draadjrbmkVar.sopmlzcsov(1393813633);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f99335yggfygwlhe);
                final gxszxtbevo gxszxtbevoVar = this.f99335yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gxszxtbevo.iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                n31.zoijcleaow.zoijcleaow(i14, (tg.iobyxmoadg) objYadqdtsiqt, null, false, 0L, draadjrbmkVar, 0, 28);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow extends df.wkgbmnqykc {
        zoijcleaow(gxszxtbevo gxszxtbevoVar, androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo gxszxtbevoVar2) {
            super(gxszxtbevoVar2);
            this.f27903iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar.f99333iwizpuwonk);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        iwxlajgraz iwxlajgrazVarPpxfxbqfkf = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
        this.f99334jyumaefscl = iwxlajgrazVarPpxfxbqfkf;
        this.f99333iwizpuwonk = rgvfuqvkyq.wkgbmnqykc(false, iwxlajgrazVarPpxfxbqfkf, false, false, true, js0.zoijcleaow.LOCAL_SCREEN_CHANGES, new tg.draadjrbmk() { // from class: bi1.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.iwizpuwonk(this.f16381zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: bi1.btonecajqb
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.cqumvgiudr(this.f16379zdlpuopuiu, (HintUiModel) obj, (ProductUiModel) obj2);
            }
        }, new tg.draadjrbmk() { // from class: bi1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.esjtqupxsv(this.f16383zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.draadjrbmk() { // from class: bi1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.lereixgezr(this.f16380zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.draadjrbmk() { // from class: bi1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.pmvmpeiblj(this.f16402zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: bi1.agtfadlqog
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.zynmafqrjb(this.f16378zdlpuopuiu, (String) obj, (ProductCardEvent) obj2);
            }
        });
        zoijcleaow zoijcleaowVar = new zoijcleaow(this, mt0.zoijcleaow.iobyxmoadg());
        this.f99332cqumvgiudr = zoijcleaowVar;
        vh1.iobyxmoadg iobyxmoadgVar = (vh1.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f116827nufgyqmvbu.setOnClickListener(new View.OnClickListener() { // from class: bi1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.yggfygwlhe(this.f16397zdlpuopuiu, view);
            }
        });
        MaterialButton materialButton = iobyxmoadgVar.f116833zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(materialButton);
        zdlpuopuiu(materialButton);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: bi1.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.jyumaefscl(this.f16400zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f116819btonecajqb.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        RecyclerView rvProducts = iobyxmoadgVar.f116819btonecajqb;
        zdlpuopuiu.dxjokdxxww(rvProducts, "rvProducts");
        r41.zoijcleaow.ppxfxbqfkf(rvProducts, zoijcleaowVar, iobyxmoadgVar);
        iobyxmoadgVar.f116819btonecajqb.btonecajqb(c31.zoijcleaow.f18695lqeggnwhkg.iobyxmoadg(wkgbmnqykc()));
    }

    private final void cdpycssgdh(ImageView imageView, Boolean bool) {
        imageView.setVisibility(bool != null ? 0 : 8);
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            imageView.setImageResource(b31.gxszxtbevo.ic_rounded_checkbox_true);
            imageView.setImageTintList(null);
        } else {
            imageView.setImageResource(b31.gxszxtbevo.ic_rounded_checkbox_false);
            p41.nufgyqmvbu.gxszxtbevo(imageView, b31.ppxfxbqfkf.colorSpecialSurface6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(gxszxtbevo gxszxtbevoVar, HintUiModel hint, ProductUiModel product) {
        zdlpuopuiu.btonecajqb(hint, "hint");
        zdlpuopuiu.btonecajqb(product, "product");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.dxjokdxxww(hint, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName())));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.gxszxtbevo(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iozdgvuglv(TextView textView, String str) {
        textView.setVisibility(str == null || kcexrzcfyt.zfvoamnweg(str) ? 8 : 0);
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwizpuwonk(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.gtknphoqwx(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f99346iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f99353iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.C2374ppxfxbqfkf(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void oxmwwwfdhm(vh1.iobyxmoadg iobyxmoadgVar, nufgyqmvbu nufgyqmvbuVar) {
        ComposeView cvActionBar = iobyxmoadgVar.f116832wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, null, null, false, new tg.iobyxmoadg() { // from class: bi1.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo.kcexrzcfyt(this.f16401zdlpuopuiu);
            }
        }, null, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(2106258916, true, new iobyxmoadg(nufgyqmvbuVar, this)), 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(gxszxtbevo gxszxtbevoVar, ProductUiModel productUiModel) {
        zdlpuopuiu.btonecajqb(productUiModel, "productUiModel");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.zoijcleaow(productUiModel.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yadqdtsiqt(vh1.iobyxmoadg iobyxmoadgVar, nufgyqmvbu nufgyqmvbuVar) {
        iobyxmoadgVar.f116820draadjrbmk.setText(nufgyqmvbuVar.lqeggnwhkg());
        iobyxmoadgVar.f116831wflxmlrfwp.setText(nufgyqmvbuVar.nufgyqmvbu());
        iobyxmoadgVar.f116823gtknphoqwx.setText(nufgyqmvbuVar.ppxfxbqfkf());
        TextView textView = iobyxmoadgVar.f116823gtknphoqwx;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.nufgyqmvbu.f99351iobyxmoadg);
    }

    private final void zdlpuopuiu(MaterialButton materialButton) {
        int i13 = materialButton.getContext().getResources().getDisplayMetrics().widthPixels / 2;
        ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
        Context context = materialButton.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        materialButton.setMinWidth(i13 - zoijcleaowVar.eablkybsjg(context, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(gxszxtbevo gxszxtbevoVar, String productId, ProductCardEvent productCardEvent) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.btonecajqb(productId, productCardEvent));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(vh1.iobyxmoadg binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        oxmwwwfdhm(binding, model);
        this.f99334jyumaefscl.setValue(Boolean.valueOf(model.draadjrbmk() == null));
        ComposeView clLoading = binding.f116829ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.btonecajqb());
        binding.f116818agtfadlqog.setText(model.wkgbmnqykc());
        ImageView imageView = binding.f116824gxszxtbevo;
        String strZoijcleaow = model.zoijcleaow();
        if (strZoijcleaow == null || kcexrzcfyt.zfvoamnweg(strZoijcleaow)) {
            zdlpuopuiu.lqeggnwhkg(imageView);
            imageView.setVisibility(8);
        } else {
            zdlpuopuiu.lqeggnwhkg(imageView);
            imageView.setVisibility(0);
            p41.eablkybsjg.zoijcleaow(imageView, model.zoijcleaow());
        }
        TextView tvTotalProductsCount = binding.f116828ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(tvTotalProductsCount, "tvTotalProductsCount");
        iozdgvuglv(tvTotalProductsCount, model.gxszxtbevo());
        ImageView ivToggleAllProducts = binding.f116827nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivToggleAllProducts, "ivToggleAllProducts");
        cdpycssgdh(ivToggleAllProducts, model.draadjrbmk());
        this.f99332cqumvgiudr.wkgbmnqykc(model.eablkybsjg());
        yadqdtsiqt(binding, model);
        MaterialButton materialButton = binding.f116833zoijcleaow;
        materialButton.setEnabled(model.dxjokdxxww());
        materialButton.setText(model.iobyxmoadg());
    }

    public final void vdvldrhtss(int i13) {
        ppxfxbqfkf(new ppxfxbqfkf.lqeggnwhkg(i13));
    }
}
