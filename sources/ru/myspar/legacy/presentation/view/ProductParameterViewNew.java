package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import c60.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.t;
import ru.myspar.legacy.presentation.view.ProductParameterViewNew;
import s40.agtfadlqog;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/myspar/legacy/presentation/view/ProductParameterViewNew;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm60/t;", "zdlpuopuiu", "Lm60/t;", "binding", "", "label", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductParameterViewNew extends ConstraintLayout {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final t binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductParameterViewNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(ProductParameterViewNew productParameterViewNew, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        productParameterViewNew.setLabel(use.getString(agtfadlqog.ProductParameterViewNew_label));
        productParameterViewNew.setValue(use.getString(agtfadlqog.ProductParameterViewNew_value));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final String getLabel() {
        return this.binding.f65989zoijcleaow.getText().toString();
    }

    public final String getValue() {
        return this.binding.f65988ppxfxbqfkf.getText().toString();
    }

    public final void setLabel(String str) {
        this.binding.f65989zoijcleaow.setText(str);
    }

    public final void setValue(String str) {
        this.binding.f65988ppxfxbqfkf.setText(str);
    }

    public /* synthetic */ ProductParameterViewNew(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductParameterViewNew(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        t tVarPpxfxbqfkf = t.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(tVarPpxfxbqfkf, "inflate(...)");
        this.binding = tVarPpxfxbqfkf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agtfadlqog.ProductParameterViewNew);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        nufgyqmvbu.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ge0.yadqdtsiqt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductParameterViewNew.draadjrbmk(this.f37011zdlpuopuiu, (TypedArray) obj);
            }
        });
        tVarPpxfxbqfkf.f65988ppxfxbqfkf.setHyphenationFrequency(2);
    }
}
