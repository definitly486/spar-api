package ru.myspar.proloyalty.legacy.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b31.agtfadlqog;
import b31.ojitshcjhn;
import b31.wkgbmnqykc;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ks0.zoijcleaow;
import p41.dxjokdxxww;
import p41.ppxfxbqfkf;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.legacy.presentation.view.ProductPriceView;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;
import z41.rhgxfdycjh;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/ProductPriceView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Landroid/util/AttributeSet;)V", "", "price", "setPrice", "(D)V", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "setMeasure", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;)V", "setMeasureAndEnabled", "", "isEnabled", "setMeasureEnabled", "(Z)V", "", "unit", "setUnit", "(Ljava/lang/String;)V", "setUnitAndEnabled", "Lz41/rhgxfdycjh;", "jyumaefscl", "Lz41/rhgxfdycjh;", "binding", "lqeggnwhkg", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;)Ljava/lang/String;", "measureValue", "iwizpuwonk", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductPriceView extends ru.myspar.proloyalty.legacy.presentation.view.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final rhgxfdycjh binding;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final iobyxmoadg f97581iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f97580cqumvgiudr = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductPriceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void eablkybsjg(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ojitshcjhn.ProductPriceView);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        dxjokdxxww.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: bc1.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductPriceView.gxszxtbevo(this.f15761zdlpuopuiu, (TypedArray) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(ProductPriceView productPriceView, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        MaterialTextView tvMeasure = productPriceView.binding.f128365ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvMeasure, "tvMeasure");
        tvMeasure.setVisibility(use.getBoolean(ojitshcjhn.ProductPriceView_showMeasure, true) ? 0 : 8);
        int resourceId = use.getResourceId(ojitshcjhn.ProductPriceView_priceTextAppearance, agtfadlqog.Emphasis_Heading5);
        int resourceId2 = use.getResourceId(ojitshcjhn.ProductPriceView_priceDecimalTextAppearance, agtfadlqog.Emphasis_Heading7);
        int resourceId3 = use.getResourceId(ojitshcjhn.ProductPriceView_priceCurrencyTextAppearance, agtfadlqog.Emphasis_Heading5);
        int resourceId4 = use.getResourceId(ojitshcjhn.ProductPriceView_priceMeasureTextAppearance, agtfadlqog.Emphasis_Heading7);
        productPriceView.binding.f128366wkgbmnqykc.setTextAppearance(resourceId);
        productPriceView.binding.f128363eablkybsjg.setTextAppearance(resourceId2);
        productPriceView.binding.f128367zoijcleaow.setTextAppearance(resourceId3);
        productPriceView.binding.f128365ppxfxbqfkf.setTextAppearance(resourceId4);
        if (use.getBoolean(ojitshcjhn.ProductPriceView_darkThemeSupport, true)) {
            Context context = productPriceView.getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            int iPpxfxbqfkf = ppxfxbqfkf.ppxfxbqfkf(context, b31.ppxfxbqfkf.colorTextIcons1);
            productPriceView.binding.f128366wkgbmnqykc.setTextColor(iPpxfxbqfkf);
            productPriceView.binding.f128363eablkybsjg.setTextColor(iPpxfxbqfkf);
            productPriceView.binding.f128367zoijcleaow.setTextColor(iPpxfxbqfkf);
            MaterialTextView materialTextView = productPriceView.binding.f128365ppxfxbqfkf;
            Context context2 = productPriceView.getContext();
            zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
            materialTextView.setTextColor(ppxfxbqfkf.ppxfxbqfkf(context2, b31.ppxfxbqfkf.colorTextIcons3));
        } else {
            int color = productPriceView.getContext().getColor(wkgbmnqykc.black);
            productPriceView.binding.f128366wkgbmnqykc.setTextColor(color);
            productPriceView.binding.f128363eablkybsjg.setTextColor(color);
            productPriceView.binding.f128367zoijcleaow.setTextColor(color);
            productPriceView.binding.f128365ppxfxbqfkf.setTextColor(productPriceView.getContext().getColor(wkgbmnqykc.black_60));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final String lqeggnwhkg(MeasureTypeModel measureTypeModel) {
        if (measureTypeModel.nufgyqmvbu()) {
            String string = getContext().getString(lqeggnwhkg.proloyalty_measure_both_value);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
            return string;
        }
        String string2 = getContext().getString(zoijcleaow.iobyxmoadg(measureTypeModel.getCurrentMeasure()));
        zdlpuopuiu.dxjokdxxww(string2, "getString(...)");
        return string2;
    }

    public final void setMeasure(MeasureTypeModel measureTypeModel) {
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        this.binding.f128365ppxfxbqfkf.setText(lqeggnwhkg(measureTypeModel));
    }

    public final void setMeasureAndEnabled(MeasureTypeModel measureTypeModel) {
        setMeasureEnabled(measureTypeModel != null);
        this.binding.f128365ppxfxbqfkf.setText(measureTypeModel != null ? lqeggnwhkg(measureTypeModel) : null);
    }

    public final void setMeasureEnabled(boolean isEnabled) {
        MaterialTextView tvMeasure = this.binding.f128365ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvMeasure, "tvMeasure");
        tvMeasure.setVisibility(isEnabled ? 0 : 8);
    }

    public final void setPrice(double price) {
        Price priceWkgbmnqykc = ks0.ppxfxbqfkf.wkgbmnqykc(ks0.ppxfxbqfkf.f60512iobyxmoadg, price, 0, false, 6, null);
        this.binding.f128366wkgbmnqykc.setText(priceWkgbmnqykc.getPrice());
        this.binding.f128363eablkybsjg.setText(priceWkgbmnqykc.getPriceFractional());
    }

    public final void setUnit(String unit) {
        this.binding.f128365ppxfxbqfkf.setText(unit);
    }

    public final void setUnitAndEnabled(String unit) {
        setMeasureEnabled(unit != null);
        this.binding.f128365ppxfxbqfkf.setText(unit);
    }

    public /* synthetic */ ProductPriceView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductPriceView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        rhgxfdycjh rhgxfdycjhVarPpxfxbqfkf = rhgxfdycjh.ppxfxbqfkf(dxjokdxxww.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(rhgxfdycjhVarPpxfxbqfkf, "inflate(...)");
        this.binding = rhgxfdycjhVarPpxfxbqfkf;
        eablkybsjg(attributeSet);
    }
}
