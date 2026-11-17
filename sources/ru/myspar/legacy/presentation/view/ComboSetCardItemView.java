package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import c60.nufgyqmvbu;
import c60.wkgbmnqykc;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.c;
import mo.zoijcleaow;
import pm.dxjokdxxww;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.legacy.presentation.view.ComboSetCardItemView;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00112\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lru/myspar/legacy/presentation/view/ComboSetCardItemView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "T", "", "", "btonecajqb", "(Ljava/util/Collection;)Z", "Lqu/iobyxmoadg;", "uiModel", "Lgg/wwaezpbzkn;", "setComboSetUiModel", "(Lqu/iobyxmoadg;)V", "Lkotlin/Function2;", "Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "Lmo/zoijcleaow;", "action", "setActionClickedCardProductCombo", "(Ltg/rgvfuqvkyq;)V", "Lkotlin/Function1;", "setActionClickedBtnShowAllCombo", "(Ltg/draadjrbmk;)V", "setActionClickedBtnAddComboToCart", "Lm60/c;", "zynmafqrjb", "Lm60/c;", "binding", "istkbnxepw", "Lqu/iobyxmoadg;", "comboSet", "cdpycssgdh", "Ltg/rgvfuqvkyq;", "onClickedCardProductCombo", "yadqdtsiqt", "Ltg/draadjrbmk;", "onClickedBtnShowAllCombo", "iozdgvuglv", "onClickedBtnAddComboToCart", "lmojexxdyd", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComboSetCardItemView extends MaterialCardView {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final iobyxmoadg f89936lmojexxdyd = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f89937wwaezpbzkn = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private rgvfuqvkyq onClickedCardProductCombo;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onClickedBtnAddComboToCart;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private qu.iobyxmoadg comboSet;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onClickedBtnShowAllCombo;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final c binding;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComboSetCardItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(ComboSetCardItemView comboSetCardItemView, View view) {
        draadjrbmk draadjrbmkVar;
        qu.iobyxmoadg iobyxmoadgVar = comboSetCardItemView.comboSet;
        if (iobyxmoadgVar == null || (draadjrbmkVar = comboSetCardItemView.onClickedBtnAddComboToCart) == null) {
            return;
        }
        draadjrbmkVar.invoke(iobyxmoadgVar);
    }

    private final boolean btonecajqb(Collection collection) {
        return collection.size() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(ComboSetCardItemView comboSetCardItemView, View view) {
        rgvfuqvkyq rgvfuqvkyqVar;
        qu.iobyxmoadg iobyxmoadgVar = comboSetCardItemView.comboSet;
        if (iobyxmoadgVar == null || (rgvfuqvkyqVar = comboSetCardItemView.onClickedCardProductCombo) == null) {
            return;
        }
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.dxjokdxxww().zoijcleaow(), new zoijcleaow(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ComboSetCardItemView comboSetCardItemView, View view) {
        rgvfuqvkyq rgvfuqvkyqVar;
        qu.iobyxmoadg iobyxmoadgVar = comboSetCardItemView.comboSet;
        if (iobyxmoadgVar == null || (rgvfuqvkyqVar = comboSetCardItemView.onClickedCardProductCombo) == null) {
            return;
        }
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.dxjokdxxww().iobyxmoadg(), new zoijcleaow(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(ComboSetCardItemView comboSetCardItemView, View view) {
        draadjrbmk draadjrbmkVar;
        qu.iobyxmoadg iobyxmoadgVar = comboSetCardItemView.comboSet;
        if (iobyxmoadgVar == null || (draadjrbmkVar = comboSetCardItemView.onClickedBtnShowAllCombo) == null) {
            return;
        }
        draadjrbmkVar.invoke(iobyxmoadgVar);
    }

    public final void setActionClickedBtnAddComboToCart(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onClickedBtnAddComboToCart = action;
    }

    public final void setActionClickedBtnShowAllCombo(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onClickedBtnShowAllCombo = action;
    }

    public final void setActionClickedCardProductCombo(rgvfuqvkyq action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onClickedCardProductCombo = action;
    }

    public final void setComboSetUiModel(qu.iobyxmoadg uiModel) {
        zdlpuopuiu.btonecajqb(uiModel, "uiModel");
        this.comboSet = uiModel;
        ComboSetProduct comboSetProductIobyxmoadg = uiModel.dxjokdxxww().iobyxmoadg();
        ImageView ivProductImage = this.binding.f65398wkgbmnqykc.f65514zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivProductImage, "ivProductImage");
        wkgbmnqykc.zoijcleaow(ivProductImage, comboSetProductIobyxmoadg.getImageUrl());
        ProductPriceView productPriceView = this.binding.f65396nufgyqmvbu;
        productPriceView.setPrice(comboSetProductIobyxmoadg.getPrice());
        productPriceView.setMeasure(comboSetProductIobyxmoadg.getMeasure());
        productPriceView.setMeasureEnabled(true);
        ComboSetProduct comboSetProductZoijcleaow = uiModel.dxjokdxxww().zoijcleaow();
        ImageView ivProductImage2 = this.binding.f65391eablkybsjg.f65514zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivProductImage2, "ivProductImage");
        wkgbmnqykc.zoijcleaow(ivProductImage2, comboSetProductZoijcleaow.getImageUrl());
        ProductPriceView productPriceView2 = this.binding.f65390dxjokdxxww;
        productPriceView2.setPrice(comboSetProductZoijcleaow.getPrice());
        productPriceView2.setMeasure(comboSetProductZoijcleaow.getMeasure());
        productPriceView2.setMeasureEnabled(true);
        this.binding.f65389btonecajqb.setText(getContext().getString(dxjokdxxww.discount_percent_format, String.valueOf(uiModel.ppxfxbqfkf())));
        ProductPriceView productPriceView3 = this.binding.f65395lqeggnwhkg;
        productPriceView3.setPrice(uiModel.lqeggnwhkg());
        productPriceView3.setMeasureEnabled(false);
        MaterialTextView materialTextView = this.binding.f65392gtknphoqwx;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
        Context context = materialTextView.getContext();
        int i13 = dxjokdxxww.price_with_currency_format;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(uiModel.gxszxtbevo())}, 1));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        materialTextView.setText(context.getString(i13, str));
        MaterialButton btnShowAll = this.binding.f65397ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnShowAll, "btnShowAll");
        btnShowAll.setVisibility(btonecajqb(uiModel.nufgyqmvbu()) && btonecajqb(uiModel.btonecajqb()) ? 4 : 0);
    }

    public /* synthetic */ ComboSetCardItemView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboSetCardItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        c cVarPpxfxbqfkf = c.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(cVarPpxfxbqfkf, "inflate(...)");
        this.binding = cVarPpxfxbqfkf;
        setBackgroundColor(0);
        cVarPpxfxbqfkf.f65398wkgbmnqykc.getRoot().setOnClickListener(new View.OnClickListener() { // from class: ge0.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComboSetCardItemView.gtknphoqwx(this.f37009zdlpuopuiu, view);
            }
        });
        cVarPpxfxbqfkf.f65391eablkybsjg.getRoot().setOnClickListener(new View.OnClickListener() { // from class: ge0.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComboSetCardItemView.draadjrbmk(this.f36982zdlpuopuiu, view);
            }
        });
        cVarPpxfxbqfkf.f65397ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ge0.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComboSetCardItemView.wflxmlrfwp(this.f36985zdlpuopuiu, view);
            }
        });
        cVarPpxfxbqfkf.f65399zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ge0.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComboSetCardItemView.agtfadlqog(this.f36998zdlpuopuiu, view);
            }
        });
    }
}
