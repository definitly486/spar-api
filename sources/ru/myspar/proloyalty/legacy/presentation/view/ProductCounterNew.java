package ru.myspar.proloyalty.legacy.presentation.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b31.agtfadlqog;
import b31.ojitshcjhn;
import b31.wkgbmnqykc;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p41.dxjokdxxww;
import p41.nufgyqmvbu;
import p41.ppxfxbqfkf;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.legacy.presentation.view.ProductCounterNew;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;
import z41.jrbgnlbqoe;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001U\b\u0007\u0018\u0000 82\u00020\u0001:\u0001YB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001eJ)\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u001c2\b\b\u0001\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010*\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u0011*\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\f2\u0006\u00103\u001a\u000202¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b7\u0010\u000eJ\r\u00108\u001a\u00020\f¢\u0006\u0004\b8\u0010\u0018R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010H\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010L\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/ProductCounterNew;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "setAmountText", "(Lru/myspar/proloyalty/common/view/counter/model/CounterModel;)V", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "measureType", "", "quantity", "", "productLimitText", "yadqdtsiqt", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureType;DLjava/lang/String;)V", "lmojexxdyd", "()V", "newAmount", "cdpycssgdh", "(D)Lgg/wwaezpbzkn;", "Landroid/content/res/TypedArray;", "zynmafqrjb", "(Landroid/content/res/TypedArray;)V", "setTextStyles", "setTextColors", "Landroid/widget/TextView;", "view", "res", "jpowsppfya", "(Landroid/widget/TextView;Landroid/content/res/TypedArray;I)V", "setActionPadding", "Landroid/view/View;", "imageView", "size", "iozdgvuglv", "(Landroid/view/View;I)V", "", "hkdspvbjdz", "(Ljava/lang/CharSequence;)Ljava/lang/Double;", "default", "istkbnxepw", "(Ljava/lang/CharSequence;D)D", "", "enabled", "setEnabled", "(Z)V", "pmvmpeiblj", "setCounterModel", "lereixgezr", "Lkotlin/Function1;", "zdlpuopuiu", "Ltg/draadjrbmk;", "getOnCountChangeListener", "()Ltg/draadjrbmk;", "setOnCountChangeListener", "(Ltg/draadjrbmk;)V", "onCountChangeListener", "Lkotlin/Function0;", "yggfygwlhe", "Ltg/iobyxmoadg;", "getOnIncreaseClickListener", "()Ltg/iobyxmoadg;", "setOnIncreaseClickListener", "(Ltg/iobyxmoadg;)V", "onIncreaseClickListener", "jyumaefscl", "getOnDecreaseClickListener", "setOnDecreaseClickListener", "onDecreaseClickListener", "Lz41/jrbgnlbqoe;", "iwizpuwonk", "Lz41/jrbgnlbqoe;", "binding", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "cqumvgiudr", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "colorsModel", "ru/myspar/proloyalty/legacy/presentation/view/ProductCounterNew$zoijcleaow", "esjtqupxsv", "Lru/myspar/proloyalty/legacy/presentation/view/ProductCounterNew$zoijcleaow;", "amountTextChangedListener", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductCounterNew extends ConstraintLayout {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final int f97571pmvmpeiblj = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private ColorsUiModel colorsModel;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final zoijcleaow amountTextChangedListener;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final jrbgnlbqoe binding;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg onDecreaseClickListener;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg onIncreaseClickListener;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onCountChangeListener;

    public static final class zoijcleaow implements TextWatcher {
        zoijcleaow() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            if (charSequence == null || kcexrzcfyt.zfvoamnweg(charSequence)) {
                ProductCounterNew.this.pmvmpeiblj(false);
                return;
            }
            if (ProductCounterNew.this.hkdspvbjdz(charSequence) == null) {
                ProductCounterNew.this.binding.f128182zoijcleaow.setSelection(charSequence.length());
                ProductCounterNew.this.pmvmpeiblj(false);
            } else {
                ProductCounterNew.this.binding.f128182zoijcleaow.setSelection(charSequence.length());
                ProductCounterNew.this.cdpycssgdh(ProductCounterNew.this.istkbnxepw(charSequence, 0.0d));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductCounterNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wwaezpbzkn cdpycssgdh(double newAmount) {
        draadjrbmk draadjrbmkVar = this.onCountChangeListener;
        if (draadjrbmkVar == null) {
            return null;
        }
        draadjrbmkVar.invoke(Double.valueOf(newAmount));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hcddaimhww(ProductCounterNew productCounterNew, jrbgnlbqoe jrbgnlbqoeVar, TextView textView, int i13, KeyEvent keyEvent) {
        if (i13 == 6) {
            productCounterNew.cdpycssgdh(productCounterNew.istkbnxepw(textView.getText(), 0.0d));
        }
        jrbgnlbqoeVar.f128182zoijcleaow.clearFocus();
        zdlpuopuiu.lqeggnwhkg(textView);
        nufgyqmvbu.iobyxmoadg(textView);
        return i13 == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Double hkdspvbjdz(CharSequence charSequence) {
        String strPkzmftpjix = kcexrzcfyt.pkzmftpjix(String.valueOf(charSequence), ',', '.', false, 4, null);
        int length = strPkzmftpjix.length() - 1;
        int i13 = 0;
        boolean z13 = false;
        while (i13 <= length) {
            boolean z14 = zdlpuopuiu.draadjrbmk(strPkzmftpjix.charAt(!z13 ? i13 : length), 32) <= 0;
            if (z13) {
                if (!z14) {
                    break;
                }
                length--;
            } else if (z14) {
                i13++;
            } else {
                z13 = true;
            }
        }
        return kcexrzcfyt.agtfadlqog(strPkzmftpjix.subSequence(i13, length + 1).toString());
    }

    private final void iozdgvuglv(View imageView, int size) {
        imageView.setLayoutParams(new ConstraintLayout.zoijcleaow(size, size));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double istkbnxepw(CharSequence charSequence, double d13) {
        try {
            String strPkzmftpjix = kcexrzcfyt.pkzmftpjix(String.valueOf(charSequence), ',', '.', false, 4, null);
            int length = strPkzmftpjix.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length) {
                boolean z14 = zdlpuopuiu.draadjrbmk(strPkzmftpjix.charAt(!z13 ? i13 : length), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    }
                    length--;
                } else if (z14) {
                    i13++;
                } else {
                    z13 = true;
                }
            }
            return Double.parseDouble(strPkzmftpjix.subSequence(i13, length + 1).toString());
        } catch (NumberFormatException unused) {
            return d13;
        }
    }

    private final void jpowsppfya(TextView view, TypedArray attrs, int res) {
        view.setTextSize(0, attrs.getDimension(res, view.getTextSize()));
    }

    private final void lmojexxdyd() {
        final jrbgnlbqoe jrbgnlbqoeVar = this.binding;
        jrbgnlbqoeVar.f128181wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: bc1.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductCounterNew.wwaezpbzkn(this.f15766zdlpuopuiu, view);
            }
        });
        jrbgnlbqoeVar.f128180ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: bc1.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductCounterNew.ylkuphrtab(this.f15741zdlpuopuiu, view);
            }
        });
        jrbgnlbqoeVar.f128182zoijcleaow.addTextChangedListener(this.amountTextChangedListener);
        jrbgnlbqoeVar.f128182zoijcleaow.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: bc1.ojitshcjhn
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                ProductCounterNew.pkzmftpjix(this.f15759iobyxmoadg, jrbgnlbqoeVar, view, z13);
            }
        });
        jrbgnlbqoeVar.f128182zoijcleaow.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bc1.rgvfuqvkyq
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                return ProductCounterNew.hcddaimhww(this.f15764zdlpuopuiu, jrbgnlbqoeVar, textView, i13, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pkzmftpjix(ProductCounterNew productCounterNew, jrbgnlbqoe jrbgnlbqoeVar, View view, boolean z13) {
        if (z13) {
            AppCompatEditText appCompatEditText = jrbgnlbqoeVar.f128182zoijcleaow;
            Editable text = appCompatEditText.getText();
            appCompatEditText.setSelection(text != null ? text.length() : 0);
            jrbgnlbqoeVar.f128182zoijcleaow.selectAll();
            return;
        }
        double dIstkbnxepw = productCounterNew.istkbnxepw(jrbgnlbqoeVar.f128182zoijcleaow.getText(), 0.0d);
        jrbgnlbqoeVar.f128182zoijcleaow.setSelection(0);
        zdlpuopuiu.lqeggnwhkg(view);
        nufgyqmvbu.iobyxmoadg(view);
        productCounterNew.cdpycssgdh(dIstkbnxepw);
    }

    private final void setActionPadding(TypedArray attrs) {
        jrbgnlbqoe jrbgnlbqoeVar = this.binding;
        AppCompatImageView ivDecrease = jrbgnlbqoeVar.f128180ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivDecrease, "ivDecrease");
        ivDecrease.setPaddingRelative(attrs.getDimensionPixelSize(ojitshcjhn.ProductCounterNew_actionIconOutsidePadding, jrbgnlbqoeVar.f128180ppxfxbqfkf.getPaddingStart()), ivDecrease.getPaddingTop(), attrs.getDimensionPixelSize(ojitshcjhn.ProductCounterNew_actionIconInsidePadding, jrbgnlbqoeVar.f128180ppxfxbqfkf.getPaddingEnd()), ivDecrease.getPaddingBottom());
        if (attrs.hasValue(ojitshcjhn.ProductCounterNew_actionIconSize)) {
            int dimensionPixelSize = attrs.getDimensionPixelSize(ojitshcjhn.ProductCounterNew_actionIconSize, 0);
            AppCompatImageView ivIncrease = this.binding.f128181wkgbmnqykc;
            zdlpuopuiu.dxjokdxxww(ivIncrease, "ivIncrease");
            iozdgvuglv(ivIncrease, dimensionPixelSize);
            AppCompatImageView ivDecrease2 = this.binding.f128180ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(ivDecrease2, "ivDecrease");
            iozdgvuglv(ivDecrease2, dimensionPixelSize);
        }
        AppCompatImageView ivIncrease2 = jrbgnlbqoeVar.f128181wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivIncrease2, "ivIncrease");
        ivIncrease2.setPaddingRelative(attrs.getDimensionPixelSize(ojitshcjhn.ProductCounterNew_actionIconInsidePadding, jrbgnlbqoeVar.f128181wkgbmnqykc.getPaddingStart()), ivIncrease2.getPaddingTop(), attrs.getDimensionPixelSize(ojitshcjhn.ProductCounterNew_actionIconOutsidePadding, jrbgnlbqoeVar.f128181wkgbmnqykc.getPaddingEnd()), ivIncrease2.getPaddingBottom());
    }

    private final void setAmountText(CounterModel model) {
        String strEablkybsjg = ks0.iobyxmoadg.eablkybsjg(model);
        String string = getContext().getString(ks0.zoijcleaow.iobyxmoadg(model.getMeasureType()));
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        AppCompatEditText appCompatEditText = this.binding.f128182zoijcleaow;
        appCompatEditText.removeTextChangedListener(this.amountTextChangedListener);
        appCompatEditText.setText(strEablkybsjg);
        appCompatEditText.addTextChangedListener(this.amountTextChangedListener);
        this.binding.f128178gxszxtbevo.setText(string);
    }

    private final void setTextColors(TypedArray attrs) {
        if (attrs.hasValue(ojitshcjhn.ProductCounterNew_customTextColor)) {
            ColorStateList colorStateListEablkybsjg = i1.nufgyqmvbu.eablkybsjg(attrs.getResources(), wkgbmnqykc.counter_text_color, getContext().getTheme());
            this.binding.f128182zoijcleaow.setTextColor(colorStateListEablkybsjg);
            this.binding.f128178gxszxtbevo.setTextColor(colorStateListEablkybsjg);
            this.binding.f128177eablkybsjg.setTextColor(colorStateListEablkybsjg);
        }
    }

    private final void setTextStyles(TypedArray attrs) {
        int i13 = attrs.getInt(ojitshcjhn.ProductCounterNew_amountType, 0);
        if (i13 == 0) {
            this.binding.f128182zoijcleaow.setTextAppearance(getContext(), agtfadlqog.Emphasis_Heading5);
            AppCompatEditText appCompatEditText = this.binding.f128182zoijcleaow;
            Context context = getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            appCompatEditText.setTextColor(ppxfxbqfkf.ppxfxbqfkf(context, da.zoijcleaow.colorOnSurface));
            this.binding.f128182zoijcleaow.setGravity(16);
            this.binding.f128178gxszxtbevo.setTextAppearance(getContext(), agtfadlqog.Emphasis_Heading5);
            MaterialTextView materialTextView = this.binding.f128178gxszxtbevo;
            Context context2 = getContext();
            zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
            materialTextView.setTextColor(ppxfxbqfkf.ppxfxbqfkf(context2, da.zoijcleaow.colorOnSurface));
            this.binding.f128178gxszxtbevo.setGravity(16);
            return;
        }
        if (i13 != 1) {
            return;
        }
        this.binding.f128182zoijcleaow.setTextAppearance(getContext(), agtfadlqog.Regular_Heading6);
        AppCompatEditText appCompatEditText2 = this.binding.f128182zoijcleaow;
        Context context3 = getContext();
        zdlpuopuiu.dxjokdxxww(context3, "getContext(...)");
        appCompatEditText2.setTextColor(ppxfxbqfkf.ppxfxbqfkf(context3, da.zoijcleaow.colorOnSurface));
        this.binding.f128182zoijcleaow.setGravity(16);
        this.binding.f128178gxszxtbevo.setTextAppearance(getContext(), agtfadlqog.Regular_Heading6);
        MaterialTextView materialTextView2 = this.binding.f128178gxszxtbevo;
        Context context4 = getContext();
        zdlpuopuiu.dxjokdxxww(context4, "getContext(...)");
        materialTextView2.setTextColor(ppxfxbqfkf.ppxfxbqfkf(context4, da.zoijcleaow.colorOnSurface));
        this.binding.f128178gxszxtbevo.setGravity(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wwaezpbzkn(ProductCounterNew productCounterNew, View view) {
        tg.iobyxmoadg iobyxmoadgVar = productCounterNew.onIncreaseClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    private final void yadqdtsiqt(MeasureType measureType, double quantity, String productLimitText) {
        Integer numValueOf;
        MaterialTextView materialTextView = this.binding.f128177eablkybsjg;
        if (productLimitText == null) {
            zdlpuopuiu.lqeggnwhkg(materialTextView);
            materialTextView.setVisibility(8);
            return;
        }
        String strWflxmlrfwp = measureType.getRatio() == 1.0d ? t11.iobyxmoadg.f109303iobyxmoadg.wflxmlrfwp(Double.valueOf(quantity)) : t11.iobyxmoadg.f109303iobyxmoadg.nufgyqmvbu(Double.valueOf(quantity));
        if (measureType instanceof MeasureType.AMOUNT) {
            numValueOf = Integer.valueOf(lqeggnwhkg.proloyalty_amount_template);
        } else {
            if (!(measureType instanceof MeasureType.WEIGHT)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(lqeggnwhkg.proloyalty_weight_template);
        }
        String string = materialTextView.getContext().getString(numValueOf.intValue(), strWflxmlrfwp);
        if (string == null) {
            string = "";
        }
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
        materialTextView.setText(materialTextView.getContext().getString(lqeggnwhkg.proloyalty_product_daily_limit_format, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(ProductCounterNew productCounterNew, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        productCounterNew.zynmafqrjb(use);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ylkuphrtab(ProductCounterNew productCounterNew, View view) {
        tg.iobyxmoadg iobyxmoadgVar = productCounterNew.onDecreaseClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    private final void zynmafqrjb(TypedArray attrs) {
        if (attrs.hasValue(ojitshcjhn.ProductCounterNew_amountTextSize)) {
            AppCompatEditText etAmount = this.binding.f128182zoijcleaow;
            zdlpuopuiu.dxjokdxxww(etAmount, "etAmount");
            jpowsppfya(etAmount, attrs, ojitshcjhn.ProductCounterNew_amountTextSize);
        }
        if (attrs.hasValue(ojitshcjhn.ProductCounterNew_actionIconOutsidePadding) && attrs.hasValue(ojitshcjhn.ProductCounterNew_actionIconInsidePadding)) {
            setActionPadding(attrs);
        }
        setTextStyles(attrs);
        setTextColors(attrs);
    }

    public final draadjrbmk getOnCountChangeListener() {
        return this.onCountChangeListener;
    }

    public final tg.iobyxmoadg getOnDecreaseClickListener() {
        return this.onDecreaseClickListener;
    }

    public final tg.iobyxmoadg getOnIncreaseClickListener() {
        return this.onIncreaseClickListener;
    }

    public final void lereixgezr() {
        this.onCountChangeListener = null;
        this.onIncreaseClickListener = null;
        this.onDecreaseClickListener = null;
    }

    public final void pmvmpeiblj(boolean enabled) {
        this.binding.f128180ppxfxbqfkf.setEnabled(enabled);
        if (this.colorsModel == null) {
            this.binding.f128180ppxfxbqfkf.setAlpha(enabled ? 1.0f : 0.4f);
        }
    }

    public final void setCounterModel(CounterModel model) {
        zdlpuopuiu.btonecajqb(model, "model");
        setAmountText(model);
        yadqdtsiqt(model.getMeasureType(), model.getQuantity(), model.getProductLimitText());
        pmvmpeiblj(!(model.getQuantity() <= model.getMeasureType().getMinAvailable()));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        jrbgnlbqoe jrbgnlbqoeVar = this.binding;
        jrbgnlbqoeVar.f128182zoijcleaow.setEnabled(enabled);
        jrbgnlbqoeVar.f128178gxszxtbevo.setEnabled(enabled);
        jrbgnlbqoeVar.f128177eablkybsjg.setEnabled(enabled);
    }

    public final void setOnCountChangeListener(draadjrbmk draadjrbmkVar) {
        this.onCountChangeListener = draadjrbmkVar;
    }

    public final void setOnDecreaseClickListener(tg.iobyxmoadg iobyxmoadgVar) {
        this.onDecreaseClickListener = iobyxmoadgVar;
    }

    public final void setOnIncreaseClickListener(tg.iobyxmoadg iobyxmoadgVar) {
        this.onIncreaseClickListener = iobyxmoadgVar;
    }

    public /* synthetic */ ProductCounterNew(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCounterNew(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        jrbgnlbqoe jrbgnlbqoeVarZoijcleaow = jrbgnlbqoe.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(jrbgnlbqoeVarZoijcleaow, "inflate(...)");
        this.binding = jrbgnlbqoeVarZoijcleaow;
        this.amountTextChangedListener = new zoijcleaow();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ojitshcjhn.ProductCounterNew);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        dxjokdxxww.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: bc1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductCounterNew.yggfygwlhe(this.f15749zdlpuopuiu, (TypedArray) obj);
            }
        });
        setBackgroundColor(0);
        lmojexxdyd();
        setClipChildren(false);
        setClipToPadding(false);
    }
}
