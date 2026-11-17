package ru.myspar.legacy.presentation.view;

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
import c60.lqeggnwhkg;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import i1.nufgyqmvbu;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.r;
import mj.kcexrzcfyt;
import pm.dxjokdxxww;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.legacy.presentation.view.ProductCounterNew;
import s40.agtfadlqog;
import s40.wflxmlrfwp;
import s40.wkgbmnqykc;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001U\b\u0007\u0018\u0000 82\u00020\u0001:\u0001YB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001eJ)\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u001c2\b\b\u0001\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010*\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u0011*\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\f2\u0006\u00103\u001a\u000202¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b7\u0010\u000eJ\r\u00108\u001a\u00020\f¢\u0006\u0004\b8\u0010\u0018R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010H\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010L\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lru/myspar/legacy/presentation/view/ProductCounterNew;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/myspar/common/view/counter/model/CounterModel;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "setAmountText", "(Lru/myspar/common/view/counter/model/CounterModel;)V", "Lru/myspar/core/models/measure_type/MeasureType;", "measureType", "", "quantity", "", "productLimitText", "yadqdtsiqt", "(Lru/myspar/core/models/measure_type/MeasureType;DLjava/lang/String;)V", "lmojexxdyd", "()V", "newAmount", "cdpycssgdh", "(D)Lgg/wwaezpbzkn;", "Landroid/content/res/TypedArray;", "zynmafqrjb", "(Landroid/content/res/TypedArray;)V", "setTextStyles", "setTextColors", "Landroid/widget/TextView;", "view", "res", "jpowsppfya", "(Landroid/widget/TextView;Landroid/content/res/TypedArray;I)V", "setActionPadding", "Landroid/view/View;", "imageView", "size", "iozdgvuglv", "(Landroid/view/View;I)V", "", "hkdspvbjdz", "(Ljava/lang/CharSequence;)Ljava/lang/Double;", "default", "istkbnxepw", "(Ljava/lang/CharSequence;D)D", "", "enabled", "setEnabled", "(Z)V", "pmvmpeiblj", "setCounterModel", "lereixgezr", "Lkotlin/Function1;", "zdlpuopuiu", "Ltg/draadjrbmk;", "getOnCountChangeListener", "()Ltg/draadjrbmk;", "setOnCountChangeListener", "(Ltg/draadjrbmk;)V", "onCountChangeListener", "Lkotlin/Function0;", "yggfygwlhe", "Ltg/iobyxmoadg;", "getOnIncreaseClickListener", "()Ltg/iobyxmoadg;", "setOnIncreaseClickListener", "(Ltg/iobyxmoadg;)V", "onIncreaseClickListener", "jyumaefscl", "getOnDecreaseClickListener", "setOnDecreaseClickListener", "onDecreaseClickListener", "Lm60/r;", "iwizpuwonk", "Lm60/r;", "binding", "Lru/myspar/core/domain/models/ColorsUiModel;", "cqumvgiudr", "Lru/myspar/core/domain/models/ColorsUiModel;", "colorsModel", "ru/myspar/legacy/presentation/view/ProductCounterNew$zoijcleaow", "esjtqupxsv", "Lru/myspar/legacy/presentation/view/ProductCounterNew$zoijcleaow;", "amountTextChangedListener", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductCounterNew extends ConstraintLayout {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final int f89957pmvmpeiblj = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private ColorsUiModel colorsModel;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final zoijcleaow amountTextChangedListener;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final r binding;

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
                ProductCounterNew.this.binding.f65921zoijcleaow.setSelection(charSequence.length());
                ProductCounterNew.this.pmvmpeiblj(false);
            } else {
                ProductCounterNew.this.binding.f65921zoijcleaow.setSelection(charSequence.length());
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
    public static final boolean hcddaimhww(ProductCounterNew productCounterNew, r rVar, TextView textView, int i13, KeyEvent keyEvent) {
        if (i13 == 6) {
            productCounterNew.cdpycssgdh(productCounterNew.istkbnxepw(textView.getText(), 0.0d));
        }
        rVar.f65921zoijcleaow.clearFocus();
        zdlpuopuiu.lqeggnwhkg(textView);
        lqeggnwhkg.iobyxmoadg(textView);
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
        final r rVar = this.binding;
        rVar.f65920wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: ge0.pmvmpeiblj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductCounterNew.wwaezpbzkn(this.f37004zdlpuopuiu, view);
            }
        });
        rVar.f65919ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ge0.zynmafqrjb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductCounterNew.ylkuphrtab(this.f37026zdlpuopuiu, view);
            }
        });
        rVar.f65921zoijcleaow.addTextChangedListener(this.amountTextChangedListener);
        rVar.f65921zoijcleaow.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ge0.istkbnxepw
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                ProductCounterNew.pkzmftpjix(this.f36988iobyxmoadg, rVar, view, z13);
            }
        });
        rVar.f65921zoijcleaow.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ge0.cdpycssgdh
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                return ProductCounterNew.hcddaimhww(this.f36978zdlpuopuiu, rVar, textView, i13, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pkzmftpjix(ProductCounterNew productCounterNew, r rVar, View view, boolean z13) {
        if (z13) {
            AppCompatEditText appCompatEditText = rVar.f65921zoijcleaow;
            Editable text = appCompatEditText.getText();
            appCompatEditText.setSelection(text != null ? text.length() : 0);
            rVar.f65921zoijcleaow.selectAll();
            return;
        }
        double dIstkbnxepw = productCounterNew.istkbnxepw(rVar.f65921zoijcleaow.getText(), 0.0d);
        rVar.f65921zoijcleaow.setSelection(0);
        zdlpuopuiu.lqeggnwhkg(view);
        lqeggnwhkg.iobyxmoadg(view);
        productCounterNew.cdpycssgdh(dIstkbnxepw);
    }

    private final void setActionPadding(TypedArray attrs) {
        r rVar = this.binding;
        AppCompatImageView ivDecrease = rVar.f65919ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivDecrease, "ivDecrease");
        ivDecrease.setPaddingRelative(attrs.getDimensionPixelSize(agtfadlqog.ProductCounterNew_actionIconOutsidePadding, rVar.f65919ppxfxbqfkf.getPaddingStart()), ivDecrease.getPaddingTop(), attrs.getDimensionPixelSize(agtfadlqog.ProductCounterNew_actionIconInsidePadding, rVar.f65919ppxfxbqfkf.getPaddingEnd()), ivDecrease.getPaddingBottom());
        if (attrs.hasValue(agtfadlqog.ProductCounterNew_actionIconSize)) {
            int dimensionPixelSize = attrs.getDimensionPixelSize(agtfadlqog.ProductCounterNew_actionIconSize, 0);
            AppCompatImageView ivIncrease = this.binding.f65920wkgbmnqykc;
            zdlpuopuiu.dxjokdxxww(ivIncrease, "ivIncrease");
            iozdgvuglv(ivIncrease, dimensionPixelSize);
            AppCompatImageView ivDecrease2 = this.binding.f65919ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(ivDecrease2, "ivDecrease");
            iozdgvuglv(ivDecrease2, dimensionPixelSize);
        }
        AppCompatImageView ivIncrease2 = rVar.f65920wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivIncrease2, "ivIncrease");
        ivIncrease2.setPaddingRelative(attrs.getDimensionPixelSize(agtfadlqog.ProductCounterNew_actionIconInsidePadding, rVar.f65920wkgbmnqykc.getPaddingStart()), ivIncrease2.getPaddingTop(), attrs.getDimensionPixelSize(agtfadlqog.ProductCounterNew_actionIconOutsidePadding, rVar.f65920wkgbmnqykc.getPaddingEnd()), ivIncrease2.getPaddingBottom());
    }

    private final void setAmountText(CounterModel model) {
        String strEablkybsjg = rt.iobyxmoadg.eablkybsjg(model);
        String string = getContext().getString(rt.zoijcleaow.iobyxmoadg(model.getMeasureType()));
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        AppCompatEditText appCompatEditText = this.binding.f65921zoijcleaow;
        appCompatEditText.removeTextChangedListener(this.amountTextChangedListener);
        appCompatEditText.setText(strEablkybsjg);
        appCompatEditText.addTextChangedListener(this.amountTextChangedListener);
        this.binding.f65917gxszxtbevo.setText(string);
    }

    private final void setTextColors(TypedArray attrs) {
        if (attrs.hasValue(agtfadlqog.ProductCounterNew_customTextColor)) {
            ColorStateList colorStateListEablkybsjg = nufgyqmvbu.eablkybsjg(attrs.getResources(), wkgbmnqykc.counter_text_color, getContext().getTheme());
            this.binding.f65921zoijcleaow.setTextColor(colorStateListEablkybsjg);
            this.binding.f65917gxszxtbevo.setTextColor(colorStateListEablkybsjg);
            this.binding.f65916eablkybsjg.setTextColor(colorStateListEablkybsjg);
        }
    }

    private final void setTextStyles(TypedArray attrs) {
        int i13 = attrs.getInt(agtfadlqog.ProductCounterNew_amountType, 0);
        if (i13 == 0) {
            this.binding.f65921zoijcleaow.setTextAppearance(getContext(), wflxmlrfwp.Emphasis_Heading5);
            AppCompatEditText appCompatEditText = this.binding.f65921zoijcleaow;
            Context context = getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            appCompatEditText.setTextColor(c60.zoijcleaow.ppxfxbqfkf(context, da.zoijcleaow.colorOnSurface));
            this.binding.f65921zoijcleaow.setGravity(16);
            this.binding.f65917gxszxtbevo.setTextAppearance(getContext(), wflxmlrfwp.Emphasis_Heading5);
            MaterialTextView materialTextView = this.binding.f65917gxszxtbevo;
            Context context2 = getContext();
            zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
            materialTextView.setTextColor(c60.zoijcleaow.ppxfxbqfkf(context2, da.zoijcleaow.colorOnSurface));
            this.binding.f65917gxszxtbevo.setGravity(16);
            return;
        }
        if (i13 != 1) {
            return;
        }
        this.binding.f65921zoijcleaow.setTextAppearance(getContext(), wflxmlrfwp.Regular_Heading6);
        AppCompatEditText appCompatEditText2 = this.binding.f65921zoijcleaow;
        Context context3 = getContext();
        zdlpuopuiu.dxjokdxxww(context3, "getContext(...)");
        appCompatEditText2.setTextColor(c60.zoijcleaow.ppxfxbqfkf(context3, da.zoijcleaow.colorOnSurface));
        this.binding.f65921zoijcleaow.setGravity(16);
        this.binding.f65917gxszxtbevo.setTextAppearance(getContext(), wflxmlrfwp.Regular_Heading6);
        MaterialTextView materialTextView2 = this.binding.f65917gxszxtbevo;
        Context context4 = getContext();
        zdlpuopuiu.dxjokdxxww(context4, "getContext(...)");
        materialTextView2.setTextColor(c60.zoijcleaow.ppxfxbqfkf(context4, da.zoijcleaow.colorOnSurface));
        this.binding.f65917gxszxtbevo.setGravity(16);
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
        MaterialTextView materialTextView = this.binding.f65916eablkybsjg;
        if (productLimitText == null) {
            zdlpuopuiu.lqeggnwhkg(materialTextView);
            materialTextView.setVisibility(8);
            return;
        }
        String strWflxmlrfwp = measureType.getRatio() == 1.0d ? n30.iobyxmoadg.f68492iobyxmoadg.wflxmlrfwp(Double.valueOf(quantity)) : n30.iobyxmoadg.f68492iobyxmoadg.nufgyqmvbu(Double.valueOf(quantity));
        if (measureType instanceof MeasureType.AMOUNT) {
            numValueOf = Integer.valueOf(dxjokdxxww.amount_template);
        } else {
            if (!(measureType instanceof MeasureType.WEIGHT)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(dxjokdxxww.weight_template);
        }
        String string = materialTextView.getContext().getString(numValueOf.intValue(), strWflxmlrfwp);
        if (string == null) {
            string = "";
        }
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
        materialTextView.setText(materialTextView.getContext().getString(dxjokdxxww.product_daily_limit_format, string));
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
        if (attrs.hasValue(agtfadlqog.ProductCounterNew_amountTextSize)) {
            AppCompatEditText etAmount = this.binding.f65921zoijcleaow;
            zdlpuopuiu.dxjokdxxww(etAmount, "etAmount");
            jpowsppfya(etAmount, attrs, agtfadlqog.ProductCounterNew_amountTextSize);
        }
        if (attrs.hasValue(agtfadlqog.ProductCounterNew_actionIconOutsidePadding) && attrs.hasValue(agtfadlqog.ProductCounterNew_actionIconInsidePadding)) {
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
        this.binding.f65919ppxfxbqfkf.setEnabled(enabled);
        if (this.colorsModel == null) {
            this.binding.f65919ppxfxbqfkf.setAlpha(enabled ? 1.0f : 0.4f);
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
        r rVar = this.binding;
        rVar.f65921zoijcleaow.setEnabled(enabled);
        rVar.f65917gxszxtbevo.setEnabled(enabled);
        rVar.f65916eablkybsjg.setEnabled(enabled);
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
        r rVarZoijcleaow = r.zoijcleaow(c60.nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(rVarZoijcleaow, "inflate(...)");
        this.binding = rVarZoijcleaow;
        this.amountTextChangedListener = new zoijcleaow();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agtfadlqog.ProductCounterNew);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        c60.nufgyqmvbu.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ge0.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductCounterNew.yggfygwlhe(this.f36997zdlpuopuiu, (TypedArray) obj);
            }
        });
        setBackgroundColor(0);
        lmojexxdyd();
        setClipChildren(false);
        setClipToPadding(false);
    }
}
