package modern.payments.ecomAndroid.presentation.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/EcomButtonView;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$ButtonType;", "type", "getButtonTextColor", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$ButtonType;)Ljava/lang/Integer;", "Lgg/wwaezpbzkn;", "applyUIPreferences", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$ButtonType;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomButtonView extends MaterialButton {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UIPreferencesRepository.ButtonType.values().length];
            try {
                iArr[UIPreferencesRepository.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIPreferencesRepository.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UIPreferencesRepository.ButtonType.TRANSPARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomButtonView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final Integer getButtonTextColor(UIPreferencesRepository uiPreferencesRepository, UIPreferencesRepository.ButtonType type) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i13 == 1 || i13 == 2) {
            EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = uiPreferencesRepository.getUIColorPreferences();
            if (uIColorPreferences != null) {
                return Integer.valueOf(uIColorPreferences.getTextButton());
            }
            return null;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = uiPreferencesRepository.getUIColorPreferences();
        if (uIColorPreferences2 != null) {
            return Integer.valueOf(uIColorPreferences2.getTextPrimary());
        }
        return null;
    }

    public final void applyUIPreferences(UIPreferencesRepository uiPreferencesRepository, UIPreferencesRepository.ButtonType type) {
        ColorStateList colorStateListValueOf;
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        zdlpuopuiu.btonecajqb(type, "type");
        ViewExtensionsKt.setFontParams(this, uiPreferencesRepository.getUIFontParams(UIPreferencesRepository.Font.BODY), getButtonTextColor(uiPreferencesRepository, type));
        ViewExtensionsKt.setCornerParams(this, uiPreferencesRepository.getUIRadius());
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = uiPreferencesRepository.getUIColorPreferences();
        if (uIColorPreferences != null) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i13 == 1) {
                colorStateListValueOf = ColorStateList.valueOf(uIColorPreferences.getAccentSuccess());
            } else if (i13 == 2) {
                colorStateListValueOf = ColorStateList.valueOf(uIColorPreferences.getButtonSecondary());
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                colorStateListValueOf = ColorStateList.valueOf(uIColorPreferences.getMainBG());
            }
            setBackgroundTintList(colorStateListValueOf);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ EcomButtonView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomButtonView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
    }
}
