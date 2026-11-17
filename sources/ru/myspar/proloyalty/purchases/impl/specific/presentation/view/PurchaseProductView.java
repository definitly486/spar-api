package ru.myspar.proloyalty.purchases.impl.specific.presentation.view;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import b31.gtknphoqwx;
import b31.gxszxtbevo;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ms0.wkgbmnqykc;
import p41.eablkybsjg;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.legacy.presentation.view.BuyButtonNew;
import ru.myspar.proloyalty.legacy.presentation.view.MeasureTypeToggle;
import ru.myspar.proloyalty.legacy.presentation.view.ProductCounterNew;
import ru.myspar.proloyalty.purchases.impl.specific.presentation.view.PurchaseProductView;
import tg.draadjrbmk;
import ti1.nufgyqmvbu;
import z41.fmlbqenlif;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u001f\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010\u000eJ\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010\u000eR\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R*\u00107\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010;\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010H\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00102\u001a\u0004\bF\u00104\"\u0004\bG\u00106R*\u0010L\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00102\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R0\u0010P\u001a\u0010\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\f\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR*\u0010T\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00102\u001a\u0004\bR\u00104\"\u0004\bS\u00106R*\u0010W\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106¨\u0006X"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/specific/presentation/view/PurchaseProductView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpj1/ppxfxbqfkf;", "product", "Lgg/wwaezpbzkn;", "setProduct", "(Lpj1/ppxfxbqfkf;)V", "cdpycssgdh", "()V", "setAvailable", "setProductQuantityAndMeasureType", "", "favorite", "setFavorite", "(Z)V", "setRating", "", ImagesContract.URL, "setProductPhoto", "(Ljava/lang/String;)V", "setProductInfo", "Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", CommonUrlParts.MODEL, "setCounterModel", "(Lru/myspar/proloyalty/common/view/counter/model/CounterModel;)V", "setPriceInfo", "setOldPrice", "setTotalPrice", "setPricePerUnitInfo", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "isProductWithZeroPrice", "zynmafqrjb", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Z)V", "setAvailableToBuy", "setCountry", "Lz41/fmlbqenlif;", "jyumaefscl", "Lz41/fmlbqenlif;", "binding", "Lkotlin/Function0;", "iwizpuwonk", "Ltg/iobyxmoadg;", "getOnProductCardClicked", "()Ltg/iobyxmoadg;", "setOnProductCardClicked", "(Ltg/iobyxmoadg;)V", "onProductCardClicked", "cqumvgiudr", "getOnFavoriteClicked", "setOnFavoriteClicked", "onFavoriteClicked", "Lkotlin/Function1;", "Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "esjtqupxsv", "Ltg/draadjrbmk;", "getOnHintClicked", "()Ltg/draadjrbmk;", "setOnHintClicked", "(Ltg/draadjrbmk;)V", "onHintClicked", "lereixgezr", "getOnBuyButtonClicked", "setOnBuyButtonClicked", "onBuyButtonClicked", "pmvmpeiblj", "getChangeMeasureListener", "setChangeMeasureListener", "changeMeasureListener", "", "getInputCountListener", "setInputCountListener", "inputCountListener", "istkbnxepw", "getIncreaseListener", "setIncreaseListener", "increaseListener", "getDecreaseListener", "setDecreaseListener", "decreaseListener", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseProductView extends ru.myspar.proloyalty.purchases.impl.specific.presentation.view.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg decreaseListener;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg onFavoriteClicked;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onHintClicked;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg increaseListener;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg onProductCardClicked;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final fmlbqenlif binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg onBuyButtonClicked;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg changeMeasureListener;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk inputCountListener;

    public static final class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ PurchaseProductView f99900jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99901yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99902zdlpuopuiu;

        public iobyxmoadg(jpowsppfya jpowsppfyaVar, long j13, PurchaseProductView purchaseProductView) {
            this.f99902zdlpuopuiu = jpowsppfyaVar;
            this.f99901yggfygwlhe = j13;
            this.f99900jyumaefscl = purchaseProductView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99902zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99901yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            tg.iobyxmoadg onProductCardClicked = this.f99900jyumaefscl.getOnProductCardClicked();
            if (onProductCardClicked != null) {
                onProductCardClicked.invoke();
            }
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ PurchaseProductView f99903jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99904yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99905zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, PurchaseProductView purchaseProductView) {
            this.f99905zdlpuopuiu = jpowsppfyaVar;
            this.f99904yggfygwlhe = j13;
            this.f99903jyumaefscl = purchaseProductView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99905zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99904yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            tg.iobyxmoadg onFavoriteClicked = this.f99903jyumaefscl.getOnFavoriteClicked();
            if (onFavoriteClicked != null) {
                onFavoriteClicked.invoke();
            }
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ PurchaseProductView f99906jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f99907yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f99908zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, PurchaseProductView purchaseProductView) {
            this.f99908zdlpuopuiu = jpowsppfyaVar;
            this.f99907yggfygwlhe = j13;
            this.f99906jyumaefscl = purchaseProductView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f99908zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f99907yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            tg.iobyxmoadg onBuyButtonClicked = this.f99906jyumaefscl.getOnBuyButtonClicked();
            if (onBuyButtonClicked != null) {
                onBuyButtonClicked.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchaseProductView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(PurchaseProductView purchaseProductView) {
        tg.iobyxmoadg iobyxmoadgVar = purchaseProductView.changeMeasureListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(PurchaseProductView purchaseProductView) {
        tg.iobyxmoadg iobyxmoadgVar = purchaseProductView.increaseListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(PurchaseProductView purchaseProductView, HintUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = purchaseProductView.onHintClicked;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(PurchaseProductView purchaseProductView) {
        tg.iobyxmoadg iobyxmoadgVar = purchaseProductView.decreaseListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(PurchaseProductView purchaseProductView, double d13) {
        draadjrbmk draadjrbmkVar = purchaseProductView.inputCountListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Double.valueOf(d13));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void setAvailableToBuy(pj1.ppxfxbqfkf product) {
        fmlbqenlif fmlbqenlifVar = this.binding;
        boolean isAvailableToBuy = product.wkgbmnqykc().getIsAvailableToBuy();
        fmlbqenlifVar.f128001ppxfxbqfkf.setText(product.wkgbmnqykc().getAvailableToBuyMessage());
        fmlbqenlifVar.f128000oxmwwwfdhm.setText(product.wkgbmnqykc().getNotAvailableToBuyMessage());
        MaterialButton tvProductNotAvailable = fmlbqenlifVar.f128000oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(tvProductNotAvailable, "tvProductNotAvailable");
        tvProductNotAvailable.setVisibility(!isAvailableToBuy ? 0 : 8);
        BuyButtonNew btnBuy = fmlbqenlifVar.f128001ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnBuy, "btnBuy");
        btnBuy.setVisibility(isAvailableToBuy ? 0 : 8);
        fmlbqenlifVar.f128005wkgbmnqykc.setEnabled(isAvailableToBuy);
        if (isAvailableToBuy) {
            setCounterModel(product.lqeggnwhkg());
        }
    }

    private final void setCounterModel(CounterModel model) {
        this.binding.f128005wkgbmnqykc.setCounterModel(model);
    }

    private final void setCountry(pj1.ppxfxbqfkf product) {
        fmlbqenlif fmlbqenlifVar = this.binding;
        MaterialTextView materialTextView = fmlbqenlifVar.f127987cqumvgiudr;
        StringBuilder sb3 = new StringBuilder();
        String strZoijcleaow = product.getCountryFlagEmoji();
        if (strZoijcleaow != null && !kcexrzcfyt.zfvoamnweg(strZoijcleaow)) {
            sb3.append(product.getCountryFlagEmoji());
            sb3.append(" ");
        }
        sb3.append(dxjokdxxww.zoijcleaow(product.getCountry(), product.oxmwwwfdhm(), null, 4, null));
        materialTextView.setText(sb3.toString());
        MaterialTextView tvWineCountryAndRegion = fmlbqenlifVar.f127987cqumvgiudr;
        zdlpuopuiu.dxjokdxxww(tvWineCountryAndRegion, "tvWineCountryAndRegion");
        tvWineCountryAndRegion.setVisibility(!kcexrzcfyt.zfvoamnweg(product.getCountry()) || !kcexrzcfyt.zfvoamnweg(product.oxmwwwfdhm()) ? 0 : 8);
    }

    private final void setOldPrice(CounterModel model) {
        Price priceGxszxtbevo = ks0.iobyxmoadg.gxszxtbevo(model);
        MaterialTextView materialTextView = this.binding.f128003vdvldrhtss;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
        Context context = materialTextView.getContext();
        int i13 = nufgyqmvbu.proloyalty_total_price;
        String strEablkybsjg = priceGxszxtbevo != null ? priceGxszxtbevo.eablkybsjg() : null;
        if (strEablkybsjg == null) {
            strEablkybsjg = "";
        }
        materialTextView.setText(context.getString(i13, strEablkybsjg));
    }

    private final void setPriceInfo(pj1.ppxfxbqfkf product) {
        Group groupPrice = this.binding.f127997lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(groupPrice, "groupPrice");
        groupPrice.setVisibility(!product.jyumaefscl() ? 0 : 8);
        setOldPrice(product.lqeggnwhkg());
        setTotalPrice(product.lqeggnwhkg());
    }

    private final void setPricePerUnitInfo(pj1.ppxfxbqfkf product) {
        MeasureType currentMeasure = product.gtknphoqwx().getCurrentMeasure();
        String string = getContext().getString((product.zdlpuopuiu() && (currentMeasure instanceof MeasureType.WEIGHT)) ? nufgyqmvbu.proloyalty_product_units_disp_per_100_format : nufgyqmvbu.proloyalty_product_units_format, getContext().getString(ks0.zoijcleaow.ppxfxbqfkf(currentMeasure, product.zdlpuopuiu())));
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        ks0.ppxfxbqfkf ppxfxbqfkfVar = ks0.ppxfxbqfkf.f60512iobyxmoadg;
        Price priceWkgbmnqykc = ks0.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, ppxfxbqfkfVar.zoijcleaow(product.gtknphoqwx().getCurrentMeasure(), Double.valueOf(product.ojitshcjhn()), product.eablkybsjg(), Boolean.valueOf(product.zdlpuopuiu())), 0, false, 6, null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getContext().getString(nufgyqmvbu.proloyalty_product_units_format_for, string));
        if (product.gtknphoqwx().nufgyqmvbu() && (currentMeasure instanceof MeasureType.AMOUNT)) {
            sb3.append(" ");
            Context context = getContext();
            int i13 = nufgyqmvbu.proloyalty_product_units_approx_weight;
            t11.iobyxmoadg iobyxmoadgVar = t11.iobyxmoadg.f109303iobyxmoadg;
            Double dEablkybsjg = product.eablkybsjg();
            sb3.append(context.getString(i13, iobyxmoadgVar.gtknphoqwx(Double.valueOf(dEablkybsjg != null ? dEablkybsjg.doubleValue() : 0.0d))));
        }
        String price = priceWkgbmnqykc.getPrice();
        String priceFractional = priceWkgbmnqykc.getPriceFractional();
        String string2 = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
        this.binding.f127988draadjrbmk.setData(new mr0.iobyxmoadg(price, priceFractional, string2));
    }

    private final void setProductInfo(pj1.ppxfxbqfkf product) {
        fmlbqenlif fmlbqenlifVar = this.binding;
        ComposeView composeView = fmlbqenlifVar.f127990eablkybsjg;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(!product.btonecajqb().isEmpty() && !product.jyumaefscl() ? 0 : 8);
        wkgbmnqykc.ppxfxbqfkf(composeView, product.btonecajqb(), null, null, new draadjrbmk() { // from class: bk1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PurchaseProductView.istkbnxepw(this.f16645zdlpuopuiu, (HintUiModel) obj);
            }
        }, 6, null);
        fmlbqenlifVar.f128002rgvfuqvkyq.setText(product.draadjrbmk());
        MaterialTextView tvOldPrice = fmlbqenlifVar.f128003vdvldrhtss;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility(product.dxjokdxxww() && !product.jyumaefscl() ? 0 : 8);
        TextView textView = fmlbqenlifVar.f127999ojitshcjhn;
        zdlpuopuiu.lqeggnwhkg(textView);
        textView.setVisibility(product.dxjokdxxww() && !product.jyumaefscl() ? 0 : 8);
        if (product.dxjokdxxww()) {
            textView.setText(textView.getContext().getString(nufgyqmvbu.proloyalty_discount_badge, product.nufgyqmvbu()));
        }
    }

    private final void setProductPhoto(String url) {
        ShapeableImageView ivPhoto = this.binding.f127989dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        eablkybsjg.ppxfxbqfkf(ivPhoto, url, gxszxtbevo.placeholder);
    }

    private final void setRating(pj1.ppxfxbqfkf product) {
        fmlbqenlif fmlbqenlifVar = this.binding;
        if (product.vdvldrhtss() == null) {
            Group reviewsGroup = fmlbqenlifVar.f127985agtfadlqog;
            zdlpuopuiu.dxjokdxxww(reviewsGroup, "reviewsGroup");
            reviewsGroup.setVisibility(8);
            Group ratingGroup = fmlbqenlifVar.f128004wflxmlrfwp;
            zdlpuopuiu.dxjokdxxww(ratingGroup, "ratingGroup");
            ratingGroup.setVisibility(4);
            Group reviewsGroup2 = fmlbqenlifVar.f127985agtfadlqog;
            zdlpuopuiu.dxjokdxxww(reviewsGroup2, "reviewsGroup");
            reviewsGroup2.setVisibility(8);
            return;
        }
        Group ratingGroup2 = fmlbqenlifVar.f128004wflxmlrfwp;
        zdlpuopuiu.dxjokdxxww(ratingGroup2, "ratingGroup");
        ratingGroup2.setVisibility(0);
        fmlbqenlifVar.f127996kcexrzcfyt.setText(product.vdvldrhtss().toString());
        if (product.kcexrzcfyt() == 0) {
            Group reviewsGroup3 = fmlbqenlifVar.f127985agtfadlqog;
            zdlpuopuiu.dxjokdxxww(reviewsGroup3, "reviewsGroup");
            reviewsGroup3.setVisibility(8);
        } else {
            Group reviewsGroup4 = fmlbqenlifVar.f127985agtfadlqog;
            zdlpuopuiu.dxjokdxxww(reviewsGroup4, "reviewsGroup");
            reviewsGroup4.setVisibility(0);
            fmlbqenlifVar.f128007zdlpuopuiu.setText(getContext().getResources().getQuantityString(gtknphoqwx.plural_reviews, product.kcexrzcfyt(), Integer.valueOf(product.kcexrzcfyt())));
        }
    }

    private final void setTotalPrice(CounterModel model) {
        Price priceNufgyqmvbu = ks0.iobyxmoadg.nufgyqmvbu(model);
        this.binding.f128006yggfygwlhe.setText(priceNufgyqmvbu.getPrice());
        this.binding.f127994iwizpuwonk.setText(priceNufgyqmvbu.getPriceFractional());
    }

    private final void zynmafqrjb(MeasureTypeModel measureTypeModel, boolean isProductWithZeroPrice) {
        MeasureTypeToggle measureTypeToggle = this.binding.f127991gtknphoqwx;
        zdlpuopuiu.lqeggnwhkg(measureTypeToggle);
        measureTypeToggle.setVisibility(measureTypeModel.nufgyqmvbu() && !isProductWithZeroPrice ? 0 : 8);
        measureTypeToggle.wkgbmnqykc(measureTypeModel.getUnits(), measureTypeModel.getCurrentMeasure());
    }

    public final void cdpycssgdh() {
        fmlbqenlif fmlbqenlifVar = this.binding;
        BuyButtonNew btnBuy = fmlbqenlifVar.f128001ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnBuy, "btnBuy");
        btnBuy.setVisibility(8);
        MaterialButton tvProductNotAvailable = fmlbqenlifVar.f128000oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(tvProductNotAvailable, "tvProductNotAvailable");
        tvProductNotAvailable.setVisibility(8);
        ProductCounterNew counter = fmlbqenlifVar.f128005wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(counter, "counter");
        counter.setVisibility(8);
        MeasureTypeToggle mttMeasure = fmlbqenlifVar.f127991gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(mttMeasure, "mttMeasure");
        mttMeasure.setVisibility(8);
    }

    public final tg.iobyxmoadg getChangeMeasureListener() {
        return this.changeMeasureListener;
    }

    public final tg.iobyxmoadg getDecreaseListener() {
        return this.decreaseListener;
    }

    public final tg.iobyxmoadg getIncreaseListener() {
        return this.increaseListener;
    }

    public final draadjrbmk getInputCountListener() {
        return this.inputCountListener;
    }

    public final tg.iobyxmoadg getOnBuyButtonClicked() {
        return this.onBuyButtonClicked;
    }

    public final tg.iobyxmoadg getOnFavoriteClicked() {
        return this.onFavoriteClicked;
    }

    public final draadjrbmk getOnHintClicked() {
        return this.onHintClicked;
    }

    public final tg.iobyxmoadg getOnProductCardClicked() {
        return this.onProductCardClicked;
    }

    public final void setAvailable(pj1.ppxfxbqfkf product) {
        zdlpuopuiu.btonecajqb(product, "product");
        ProductCounterNew counter = this.binding.f128005wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(counter, "counter");
        counter.setVisibility(0);
        setAvailableToBuy(product);
        zynmafqrjb(product.gtknphoqwx(), product.jyumaefscl());
    }

    public final void setChangeMeasureListener(tg.iobyxmoadg iobyxmoadgVar) {
        this.changeMeasureListener = iobyxmoadgVar;
    }

    public final void setDecreaseListener(tg.iobyxmoadg iobyxmoadgVar) {
        this.decreaseListener = iobyxmoadgVar;
    }

    public final void setFavorite(boolean favorite) {
        this.binding.f127998nufgyqmvbu.setImageResource(favorite ? gxszxtbevo.ic_heart : gxszxtbevo.ic_heart_off);
    }

    public final void setIncreaseListener(tg.iobyxmoadg iobyxmoadgVar) {
        this.increaseListener = iobyxmoadgVar;
    }

    public final void setInputCountListener(draadjrbmk draadjrbmkVar) {
        this.inputCountListener = draadjrbmkVar;
    }

    public final void setOnBuyButtonClicked(tg.iobyxmoadg iobyxmoadgVar) {
        this.onBuyButtonClicked = iobyxmoadgVar;
    }

    public final void setOnFavoriteClicked(tg.iobyxmoadg iobyxmoadgVar) {
        this.onFavoriteClicked = iobyxmoadgVar;
    }

    public final void setOnHintClicked(draadjrbmk draadjrbmkVar) {
        this.onHintClicked = draadjrbmkVar;
    }

    public final void setOnProductCardClicked(tg.iobyxmoadg iobyxmoadgVar) {
        this.onProductCardClicked = iobyxmoadgVar;
    }

    public final void setProduct(pj1.ppxfxbqfkf product) {
        zdlpuopuiu.btonecajqb(product, "product");
        setProductPhoto(product.wflxmlrfwp());
        setRating(product);
        setProductInfo(product);
        zynmafqrjb(product.gtknphoqwx(), product.jyumaefscl());
        setPriceInfo(product);
        setPricePerUnitInfo(product);
        setAvailableToBuy(product);
        setFavorite(product.yggfygwlhe());
        setCountry(product);
        setCounterModel(product.lqeggnwhkg());
    }

    public final void setProductQuantityAndMeasureType(pj1.ppxfxbqfkf product) {
        zdlpuopuiu.btonecajqb(product, "product");
        zynmafqrjb(product.gtknphoqwx(), product.jyumaefscl());
        setCounterModel(product.lqeggnwhkg());
        setPriceInfo(product);
        setPricePerUnitInfo(product);
    }

    public /* synthetic */ PurchaseProductView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseProductView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        fmlbqenlif fmlbqenlifVarZoijcleaow = fmlbqenlif.zoijcleaow(p41.dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(fmlbqenlifVarZoijcleaow, "inflate(...)");
        this.binding = fmlbqenlifVarZoijcleaow;
        setBackgroundColor(p41.ppxfxbqfkf.ppxfxbqfkf(context, da.zoijcleaow.colorSurface));
        ShapeableImageView ivPhoto = fmlbqenlifVarZoijcleaow.f127989dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        ivPhoto.setOnClickListener(new iobyxmoadg(new jpowsppfya(), 400L, this));
        BuyButtonNew btnBuy = fmlbqenlifVarZoijcleaow.f128001ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnBuy, "btnBuy");
        btnBuy.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
        AppCompatImageView ivFavorite = fmlbqenlifVarZoijcleaow.f127998nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivFavorite, "ivFavorite");
        ivFavorite.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, this));
        ProductCounterNew productCounterNew = fmlbqenlifVarZoijcleaow.f128005wkgbmnqykc;
        productCounterNew.setOnIncreaseClickListener(new tg.iobyxmoadg() { // from class: bk1.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchaseProductView.esjtqupxsv(this.f16648zdlpuopuiu);
            }
        });
        productCounterNew.setOnDecreaseClickListener(new tg.iobyxmoadg() { // from class: bk1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchaseProductView.lereixgezr(this.f16646zdlpuopuiu);
            }
        });
        productCounterNew.setOnCountChangeListener(new draadjrbmk() { // from class: bk1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PurchaseProductView.pmvmpeiblj(this.f16647zdlpuopuiu, ((Double) obj).doubleValue());
            }
        });
        fmlbqenlifVarZoijcleaow.f127991gtknphoqwx.setListener(new tg.iobyxmoadg() { // from class: bk1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchaseProductView.cqumvgiudr(this.f16644zdlpuopuiu);
            }
        });
    }
}
