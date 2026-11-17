package modern.payments.ecomAndroid.presentation.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomCompositeLayoutSbpSearchBinding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/EcomSbpSearchCompositeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "preferences", "Lgg/wwaezpbzkn;", "applyUIPreferences", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;)Lgg/wwaezpbzkn;", "Lmodern/payments/ecomandroid/databinding/EcomCompositeLayoutSbpSearchBinding;", "binding", "Lmodern/payments/ecomandroid/databinding/EcomCompositeLayoutSbpSearchBinding;", "Lcom/google/android/material/textfield/TextInputEditText;", "searchEditText", "Lcom/google/android/material/textfield/TextInputEditText;", "getSearchEditText", "()Lcom/google/android/material/textfield/TextInputEditText;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomSbpSearchCompositeView extends LinearLayout {
    private final EcomCompositeLayoutSbpSearchBinding binding;
    private final TextInputEditText searchEditText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomSbpSearchCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final wwaezpbzkn applyUIPreferences(UIPreferencesRepository preferences) {
        zdlpuopuiu.btonecajqb(preferences, "preferences");
        EcomCompositeLayoutSbpSearchBinding ecomCompositeLayoutSbpSearchBinding = this.binding;
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = preferences.getUIColorPreferences();
        if (uIColorPreferences != null) {
            ecomCompositeLayoutSbpSearchBinding.getRoot().setBackgroundTintList(ColorStateList.valueOf(uIColorPreferences.getInputBG()));
            ecomCompositeLayoutSbpSearchBinding.ecomEclssSearchInput.setHintTextColor(uIColorPreferences.getTextSecondary());
        }
        UIPreferencesRepository.FontParams uIFontParams = preferences.getUIFontParams(UIPreferencesRepository.Font.CAPTION);
        if (uIFontParams == null) {
            return null;
        }
        TextInputEditText ecomEclssSearchInput = ecomCompositeLayoutSbpSearchBinding.ecomEclssSearchInput;
        zdlpuopuiu.dxjokdxxww(ecomEclssSearchInput, "ecomEclssSearchInput");
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = preferences.getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEclssSearchInput, uIFontParams, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextPrimary()) : null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final TextInputEditText getSearchEditText() {
        return this.searchEditText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomSbpSearchCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ EcomSbpSearchCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomSbpSearchCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        EcomCompositeLayoutSbpSearchBinding ecomCompositeLayoutSbpSearchBindingInflate = EcomCompositeLayoutSbpSearchBinding.inflate(LayoutInflater.from(context), this, true);
        zdlpuopuiu.dxjokdxxww(ecomCompositeLayoutSbpSearchBindingInflate, "inflate(...)");
        this.binding = ecomCompositeLayoutSbpSearchBindingInflate;
        TextInputEditText ecomEclssSearchInput = ecomCompositeLayoutSbpSearchBindingInflate.ecomEclssSearchInput;
        zdlpuopuiu.dxjokdxxww(ecomEclssSearchInput, "ecomEclssSearchInput");
        this.searchEditText = ecomEclssSearchInput;
    }
}
