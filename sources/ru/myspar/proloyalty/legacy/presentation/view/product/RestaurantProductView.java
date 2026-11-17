package ru.myspar.proloyalty.legacy.presentation.view.product;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import b31.gxszxtbevo;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import ks0.ppxfxbqfkf;
import mj.kcexrzcfyt;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.legacy.presentation.view.BuyButtonNew;
import ru.myspar.proloyalty.legacy.presentation.view.product.RestaurantProductView;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;
import z41.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001EB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010\u0016J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010\u0016J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u0016R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00102R0\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R$\u0010D\u001a\u00020>2\u0006\u0010?\u001a\u00020>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/product/RestaurantProductView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgg/wwaezpbzkn;", "jyumaefscl", "()V", "", ImagesContract.URL, "setProductPhoto", "(Ljava/lang/String;)V", "pmvmpeiblj", "esjtqupxsv", "Lwb1/iobyxmoadg;", "product", "setProductInfo", "(Lwb1/iobyxmoadg;)V", "istkbnxepw", "(Lwb1/iobyxmoadg;)Ljava/lang/String;", "setPriceInfo", "", "totalPrice", "setTotalPrice", "(D)V", "amount", "yggfygwlhe", "(Lwb1/iobyxmoadg;D)D", "price", "Landroid/widget/TextView;", "priceTv", "priceDecimalTv", "zynmafqrjb", "(DLandroid/widget/TextView;Landroid/widget/TextView;)V", "setEnableDecreaseView", "setCounterListener", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "measureType", "iwizpuwonk", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureType;)D", "cqumvgiudr", "setProduct", "Lz41/d;", "Lz41/d;", "binding", "Lwb1/iobyxmoadg;", "currentProduct", "Lkotlin/Function1;", "Ltg/draadjrbmk;", "getOnBuyButtonClicked", "()Ltg/draadjrbmk;", "setOnBuyButtonClicked", "(Ltg/draadjrbmk;)V", "onBuyButtonClicked", "getQuantity", "()D", "quantity", "Lbc1/zoijcleaow;", "state", "getBuyButtonState", "()Lbc1/zoijcleaow;", "setBuyButtonState", "(Lbc1/zoijcleaow;)V", "buyButtonState", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RestaurantProductView extends iobyxmoadg {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f97622lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onBuyButtonClicked;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private wb1.iobyxmoadg currentProduct;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final d binding;

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ RestaurantProductView f97626jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f97627yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f97628zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, RestaurantProductView restaurantProductView) {
            this.f97628zdlpuopuiu = jpowsppfyaVar;
            this.f97627yggfygwlhe = j13;
            this.f97626jyumaefscl = restaurantProductView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f97628zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f97627yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            draadjrbmk onBuyButtonClicked = this.f97626jyumaefscl.getOnBuyButtonClicked();
            if (onBuyButtonClicked != null) {
                onBuyButtonClicked.invoke(Double.valueOf(this.f97626jyumaefscl.getQuantity()));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RestaurantProductView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final double cqumvgiudr(MeasureType measureType) {
        return measureType.getMinAvailable();
    }

    private final void esjtqupxsv(String url) {
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(getContext()).eablkybsjg().grlcpdaxtj(url).wizcaqwiak(this.binding.f127908wkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getQuantity() {
        return 0.0d;
    }

    private final String istkbnxepw(wb1.iobyxmoadg product) {
        MaterialTextView materialTextView = this.binding.f127901dxjokdxxww;
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility((product.gtknphoqwx() > 0.0d ? 1 : (product.gtknphoqwx() == 0.0d ? 0 : -1)) == 0 ? 8 : 0);
        String string = materialTextView.getContext().getString(lqeggnwhkg.proloyalty_avg_weight_gram_format, String.valueOf(vg.iobyxmoadg.ppxfxbqfkf(product.gtknphoqwx() * 1000.0d)));
        materialTextView.setText(string);
        zdlpuopuiu.dxjokdxxww(string, "with(...)");
        return string;
    }

    private final double iwizpuwonk(MeasureType measureType) {
        return measureType.getBasketDefault();
    }

    private final void jyumaefscl() {
        this.binding.f127907ppxfxbqfkf.lereixgezr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(RestaurantProductView restaurantProductView, wb1.iobyxmoadg iobyxmoadgVar, double d13) {
        restaurantProductView.setEnableDecreaseView(iobyxmoadgVar);
        restaurantProductView.setTotalPrice(restaurantProductView.yggfygwlhe(iobyxmoadgVar, d13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void pmvmpeiblj() {
        this.binding.f127908wkgbmnqykc.setImageResource(gxszxtbevo.placeholder);
    }

    private final void setCounterListener(final wb1.iobyxmoadg product) {
        this.binding.f127907ppxfxbqfkf.setOnCountChangeListener(new draadjrbmk() { // from class: fc1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RestaurantProductView.lereixgezr(this.f33412zdlpuopuiu, product, ((Double) obj).doubleValue());
            }
        });
    }

    private final void setEnableDecreaseView(wb1.iobyxmoadg product) {
        this.binding.f127907ppxfxbqfkf.pmvmpeiblj(!(getQuantity() <= cqumvgiudr(product.lqeggnwhkg().getCurrentMeasure())));
    }

    private final void setPriceInfo(wb1.iobyxmoadg product) {
        setTotalPrice(yggfygwlhe(product, iwizpuwonk(product.lqeggnwhkg().getCurrentMeasure())));
    }

    private final void setProductInfo(wb1.iobyxmoadg product) {
        this.binding.f127902eablkybsjg.setText(product.nufgyqmvbu());
        istkbnxepw(product);
    }

    private final void setProductPhoto(String url) {
        if (url == null || url.length() == 0) {
            pmvmpeiblj();
        } else {
            esjtqupxsv(url);
        }
    }

    private final void setTotalPrice(double totalPrice) {
        if (totalPrice > 0.009d) {
            MaterialTextView tvTotalPrice = this.binding.f127903gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(tvTotalPrice, "tvTotalPrice");
            zynmafqrjb(totalPrice, tvTotalPrice, this.binding.f127906nufgyqmvbu);
        }
    }

    private final double yggfygwlhe(wb1.iobyxmoadg product, double amount) {
        return ppxfxbqfkf.f60512iobyxmoadg.iobyxmoadg(amount, product.lqeggnwhkg().getCurrentMeasure(), Double.valueOf(product.btonecajqb()), null, product.draadjrbmk());
    }

    private final void zynmafqrjb(double price, TextView priceTv, TextView priceDecimalTv) {
        String strLqeggnwhkg = t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(price));
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(strLqeggnwhkg, StringUtils.COMMA, 0, false, 6, null);
        String strSubstring = strLqeggnwhkg.substring(0, iYdmasvzmpa);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        priceTv.setText(strSubstring);
        if (priceDecimalTv != null) {
            String strSubstring2 = strLqeggnwhkg.substring(iYdmasvzmpa + 1);
            zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
            priceDecimalTv.setText(strSubstring2);
        }
    }

    public final bc1.zoijcleaow getBuyButtonState() {
        return this.binding.f127909zoijcleaow.getButtonState();
    }

    public final draadjrbmk getOnBuyButtonClicked() {
        return this.onBuyButtonClicked;
    }

    public final void setBuyButtonState(bc1.zoijcleaow state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this.binding.f127909zoijcleaow.setButtonState(state);
    }

    public final void setOnBuyButtonClicked(draadjrbmk draadjrbmkVar) {
        this.onBuyButtonClicked = draadjrbmkVar;
    }

    public final void setProduct(wb1.iobyxmoadg product) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.currentProduct = product;
        jyumaefscl();
        setProductPhoto(product.dxjokdxxww());
        setProductInfo(product);
        setPriceInfo(product);
        setEnableDecreaseView(product);
        setCounterListener(product);
    }

    public /* synthetic */ RestaurantProductView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestaurantProductView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        d dVarPpxfxbqfkf = d.ppxfxbqfkf(dxjokdxxww.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(dVarPpxfxbqfkf, "inflate(...)");
        this.binding = dVarPpxfxbqfkf;
        BuyButtonNew btnBuy = dVarPpxfxbqfkf.f127909zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnBuy, "btnBuy");
        btnBuy.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
    }
}
