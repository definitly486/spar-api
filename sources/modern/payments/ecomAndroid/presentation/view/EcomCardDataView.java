package modern.payments.ecomAndroid.presentation.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.viewModel.CardInputMode;
import modern.payments.ecomAndroid.presentation.viewModel.InputError;
import modern.payments.ecomAndroid.util.CoilImpl;
import modern.payments.ecomAndroid.util.extension.ImageViewExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import modern.payments.ecomAndroid.util.view.CardNumberFormatTextWatcher;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomCardViewDataBinding;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 O2\u00020\u0001:\u0003OPQB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n*\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\fJ\u0013\u0010\u001c\u001a\u00020\n*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJc\u0010&\u001a\u00020%2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001e2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u0010\fJ\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010\fJ\u0015\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\n¢\u0006\u0004\b5\u0010\fJ\u0017\u00108\u001a\u0004\u0018\u00010\n2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0014¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010:H\u0014¢\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgg/wwaezpbzkn;", "restoreKeyboardState", "()V", "Lmodern/payments/ecomandroid/databinding/EcomCardViewDataBinding;", "animateToExpanded", "(Lmodern/payments/ecomandroid/databinding/EcomCardViewDataBinding;)V", "", "cardMask", "animateToCollapsed", "(Lmodern/payments/ecomandroid/databinding/EcomCardViewDataBinding;Ljava/lang/String;)V", "showDateError", "Lcom/google/android/material/textfield/TextInputEditText;", "toKeyboardViewNumber", "(Lcom/google/android/material/textfield/TextInputEditText;)I", "toKeyboardView", "(I)Lcom/google/android/material/textfield/TextInputEditText;", "setupInitialState", "Landroid/widget/EditText;", "requestFocusEndLine", "(Landroid/widget/EditText;)V", "Lkotlin/Function1;", "doOnCardNumberModified", "Landroid/view/View;", "doOnShortCardClickListener", "Lkotlin/Function2;", "doOnDateChange", "doOnCVVChange", "Landroid/text/TextWatcher;", "setupViewTextWatchers", "(Ltg/draadjrbmk;Ltg/draadjrbmk;Ltg/rgvfuqvkyq;Ltg/draadjrbmk;)Landroid/text/TextWatcher;", "Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "state", "setInputMode", "(Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;)V", ImagesContract.URL, "setCardIcon", "(Ljava/lang/String;)V", "showIcon", "hideIcon", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "error", "showError", "(Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;)V", "hideError", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "preferences", "applyUIPreferences", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;)Lgg/wwaezpbzkn;", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "binding", "Lmodern/payments/ecomandroid/databinding/EcomCardViewDataBinding;", "_inputMode", "Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "", "_isCollapsedState", "Z", "Lmodern/payments/ecomAndroid/util/view/CardDateFormatTextWatcher;", "cardDateFormatter", "Lmodern/payments/ecomAndroid/util/view/CardDateFormatTextWatcher;", "Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$KeyboardStatus;", "_keyboardState", "Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$KeyboardStatus;", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "coilImpl", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "Companion", "KeyboardStatus", "SavedState", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomCardDataView extends CardView {
    private static final long ANIM_DELAY = 300;
    private CardInputMode _inputMode;
    private boolean _isCollapsedState;
    private KeyboardStatus _keyboardState;
    private final EcomCardViewDataBinding binding;
    private CardDateFormatTextWatcher cardDateFormatter;
    private CoilImpl coilImpl;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$KeyboardStatus;", "", "open", "", "view", "", "(ZI)V", "getOpen", "()Z", "getView", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class KeyboardStatus {
        private final boolean open;
        private final int view;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyboardStatus() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }

        public static /* synthetic */ KeyboardStatus copy$default(KeyboardStatus keyboardStatus, boolean z13, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z13 = keyboardStatus.open;
            }
            if ((i14 & 2) != 0) {
                i13 = keyboardStatus.view;
            }
            return keyboardStatus.copy(z13, i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getOpen() {
            return this.open;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getView() {
            return this.view;
        }

        public final KeyboardStatus copy(boolean open, int view) {
            return new KeyboardStatus(open, view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KeyboardStatus)) {
                return false;
            }
            KeyboardStatus keyboardStatus = (KeyboardStatus) other;
            return this.open == keyboardStatus.open && this.view == keyboardStatus.view;
        }

        public final boolean getOpen() {
            return this.open;
        }

        public final int getView() {
            return this.view;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.open) * 31) + Integer.hashCode(this.view);
        }

        public String toString() {
            return "KeyboardStatus(open=" + this.open + ", view=" + this.view + ')';
        }

        public KeyboardStatus(boolean z13, int i13) {
            this.open = z13;
            this.view = i13;
        }

        public /* synthetic */ KeyboardStatus(boolean z13, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
            this((i14 & 1) != 0 ? false : z13, (i14 & 2) != 0 ? -1 : i13);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardInputMode.values().length];
            try {
                iArr[CardInputMode.CARD_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardInputMode.EXPIRED_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardInputMode.CVV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomCardDataView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void animateToCollapsed(final EcomCardViewDataBinding ecomCardViewDataBinding, final String str) {
        ecomCardViewDataBinding.ecomCvdMotionLayout.ydmasvzmpa(R.id.expand, R.id.intermediate);
        ecomCardViewDataBinding.ecomCvdMotionLayout.bfopjjpdmp();
        ecomCardViewDataBinding.ecomCvdMotionLayout.postDelayed(new Runnable() { // from class: modern.payments.ecomAndroid.presentation.view.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                EcomCardDataView.animateToCollapsed$lambda$10(str, ecomCardViewDataBinding, this);
            }
        }, ANIM_DELAY);
    }

    static /* synthetic */ void animateToCollapsed$default(EcomCardDataView ecomCardDataView, EcomCardViewDataBinding ecomCardViewDataBinding, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        ecomCardDataView.animateToCollapsed(ecomCardViewDataBinding, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToCollapsed$lambda$10(String str, EcomCardViewDataBinding this_animateToCollapsed, EcomCardDataView this$0) {
        zdlpuopuiu.btonecajqb(this_animateToCollapsed, "$this_animateToCollapsed");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        if (str != null) {
            this_animateToCollapsed.ecomCvdCardNumberShortText.setText(this$0.getContext().getString(R.string.ecom_card_number_mask, str));
        }
        this_animateToCollapsed.ecomCvdMotionLayout.ydmasvzmpa(R.id.intermediate, R.id.collapse);
        this_animateToCollapsed.ecomCvdMotionLayout.bfopjjpdmp();
        int i13 = WhenMappings.$EnumSwitchMapping$0[this$0._inputMode.ordinal()];
        KeyboardStatus keyboardStatusCopy = null;
        if (i13 == 2) {
            this_animateToCollapsed.ecomCvdCardDateEditText.setEnabled(true);
            this_animateToCollapsed.ecomCvdCardDateEditText.requestFocus();
            TextInputEditText ecomCvdCardDateEditText = this_animateToCollapsed.ecomCvdCardDateEditText;
            zdlpuopuiu.dxjokdxxww(ecomCvdCardDateEditText, "ecomCvdCardDateEditText");
            ViewExtensionsKt.showDelayedKeyboard(this$0, ecomCvdCardDateEditText);
            KeyboardStatus keyboardStatus = this$0._keyboardState;
            if (keyboardStatus != null) {
                TextInputEditText ecomCvdCardDateEditText2 = this_animateToCollapsed.ecomCvdCardDateEditText;
                zdlpuopuiu.dxjokdxxww(ecomCvdCardDateEditText2, "ecomCvdCardDateEditText");
                keyboardStatusCopy = keyboardStatus.copy(true, this$0.toKeyboardViewNumber(ecomCvdCardDateEditText2));
            }
            this$0._keyboardState = keyboardStatusCopy;
            this_animateToCollapsed.ecomCvdCardCvcEditText.setEnabled(false);
            return;
        }
        if (i13 != 3) {
            return;
        }
        this_animateToCollapsed.ecomCvdCardCvcEditText.setEnabled(true);
        this_animateToCollapsed.ecomCvdCardDateEditText.setEnabled(false);
        this_animateToCollapsed.ecomCvdCardCvcEditText.requestFocus();
        TextInputEditText ecomCvdCardCvcEditText = this_animateToCollapsed.ecomCvdCardCvcEditText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardCvcEditText, "ecomCvdCardCvcEditText");
        ViewExtensionsKt.showDelayedKeyboard(this$0, ecomCvdCardCvcEditText);
        KeyboardStatus keyboardStatus2 = this$0._keyboardState;
        if (keyboardStatus2 != null) {
            TextInputEditText ecomCvdCardCvcEditText2 = this_animateToCollapsed.ecomCvdCardCvcEditText;
            zdlpuopuiu.dxjokdxxww(ecomCvdCardCvcEditText2, "ecomCvdCardCvcEditText");
            keyboardStatusCopy = keyboardStatus2.copy(true, this$0.toKeyboardViewNumber(ecomCvdCardCvcEditText2));
        }
        this$0._keyboardState = keyboardStatusCopy;
    }

    private final void animateToExpanded(EcomCardViewDataBinding ecomCardViewDataBinding) {
        ecomCardViewDataBinding.ecomCvdMotionLayout.ydmasvzmpa(R.id.collapse, R.id.expand);
        ecomCardViewDataBinding.ecomCvdMotionLayout.bfopjjpdmp();
    }

    private final void requestFocusEndLine(EditText editText) {
        editText.requestFocus();
        editText.setSelection(editText.length());
    }

    private final void restoreKeyboardState() {
        TextInputEditText keyboardView;
        KeyboardStatus keyboardStatus = this._keyboardState;
        if (keyboardStatus == null || !keyboardStatus.getOpen() || (keyboardView = toKeyboardView(keyboardStatus.getView())) == null) {
            return;
        }
        ViewExtensionsKt.showDelayedKeyboard(this, keyboardView);
    }

    private final void setupInitialState() {
        KeyboardStatus keyboardStatusCopy;
        EcomCardViewDataBinding ecomCardViewDataBinding = this.binding;
        TextInputLayout ecomCvdCardCvvLayout = ecomCardViewDataBinding.ecomCvdCardCvvLayout;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardCvvLayout, "ecomCvdCardCvvLayout");
        ecomCvdCardCvvLayout.setVisibility(4);
        TextInputEditText ecomCvdCardNumberEditText = ecomCardViewDataBinding.ecomCvdCardNumberEditText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardNumberEditText, "ecomCvdCardNumberEditText");
        ViewExtensionsKt.showDelayedKeyboard(this, ecomCvdCardNumberEditText);
        KeyboardStatus keyboardStatus = this._keyboardState;
        if (keyboardStatus != null) {
            TextInputEditText ecomCvdCardNumberEditText2 = ecomCardViewDataBinding.ecomCvdCardNumberEditText;
            zdlpuopuiu.dxjokdxxww(ecomCvdCardNumberEditText2, "ecomCvdCardNumberEditText");
            keyboardStatusCopy = keyboardStatus.copy(true, toKeyboardViewNumber(ecomCvdCardNumberEditText2));
        } else {
            keyboardStatusCopy = null;
        }
        this._keyboardState = keyboardStatusCopy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViewTextWatchers$lambda$5$lambda$2(EcomCardViewDataBinding this_with, draadjrbmk doOnShortCardClickListener, EcomCardDataView this$0, View view) {
        zdlpuopuiu.btonecajqb(this_with, "$this_with");
        zdlpuopuiu.btonecajqb(doOnShortCardClickListener, "$doOnShortCardClickListener");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        TextInputEditText textInputEditText = this_with.ecomCvdCardNumberEditText;
        Editable text = textInputEditText.getText();
        if (text != null) {
            text.clear();
        }
        zdlpuopuiu.lqeggnwhkg(textInputEditText);
        ViewExtensionsKt.showDelayedKeyboard(textInputEditText, textInputEditText);
        KeyboardStatus keyboardStatus = this$0._keyboardState;
        this$0._keyboardState = keyboardStatus != null ? keyboardStatus.copy(true, this$0.toKeyboardViewNumber(textInputEditText)) : null;
        Editable text2 = this_with.ecomCvdCardDateEditText.getText();
        if (text2 != null) {
            text2.clear();
        }
        Editable text3 = this_with.ecomCvdCardCvcEditText.getText();
        if (text3 != null) {
            text3.clear();
        }
        zdlpuopuiu.lqeggnwhkg(view);
        doOnShortCardClickListener.invoke(view);
    }

    private final void showDateError() {
        CardDateFormatTextWatcher cardDateFormatTextWatcher = this.cardDateFormatter;
        if (cardDateFormatTextWatcher != null) {
            this.binding.ecomCvdCardDateEditText.removeTextChangedListener(cardDateFormatTextWatcher);
        }
        SpannableString spannableString = new SpannableString(String.valueOf(this.binding.ecomCvdCardDateEditText.getText()));
        vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(2, Integer.valueOf(spannableString.length()));
        int iIntValue = ((Number) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).intValue();
        int iIntValue2 = ((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).intValue();
        spannableString.setSpan(new ForegroundColorSpan(getContext().getColor(R.color.ecom_red_color)), iIntValue, iIntValue2, 33);
        spannableString.setSpan(new CardDateFormatTextWatcher.DrawDividerSpan(), 1, 2, 33);
        this.binding.ecomCvdCardDateEditText.setText(spannableString);
        this.binding.ecomCvdCardDateEditText.setSelection(iIntValue2);
        CardDateFormatTextWatcher cardDateFormatTextWatcher2 = this.cardDateFormatter;
        if (cardDateFormatTextWatcher2 != null) {
            this.binding.ecomCvdCardDateEditText.addTextChangedListener(cardDateFormatTextWatcher2);
        }
    }

    private final TextInputEditText toKeyboardView(int i13) {
        if (i13 == 0) {
            return this.binding.ecomCvdCardNumberEditText;
        }
        if (i13 == 1) {
            return this.binding.ecomCvdCardDateEditText;
        }
        if (i13 != 2) {
            return null;
        }
        return this.binding.ecomCvdCardCvcEditText;
    }

    private final int toKeyboardViewNumber(TextInputEditText textInputEditText) {
        if (zdlpuopuiu.eablkybsjg(textInputEditText, this.binding.ecomCvdCardNumberEditText)) {
            return 0;
        }
        if (zdlpuopuiu.eablkybsjg(textInputEditText, this.binding.ecomCvdCardDateEditText)) {
            return 1;
        }
        return zdlpuopuiu.eablkybsjg(textInputEditText, this.binding.ecomCvdCardCvcEditText) ? 2 : -1;
    }

    public final wwaezpbzkn applyUIPreferences(UIPreferencesRepository preferences) {
        zdlpuopuiu.btonecajqb(preferences, "preferences");
        EcomCardViewDataBinding ecomCardViewDataBinding = this.binding;
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = preferences.getUIColorPreferences();
        if (uIColorPreferences != null) {
            setBackgroundTintList(ColorStateList.valueOf(uIColorPreferences.getInputBG()));
            TextInputLayout textInputLayout = ecomCardViewDataBinding.ecomCvdCardNumberLayout;
            textInputLayout.setHintTextAppearance(R.style.EcomCardNumberHint);
            textInputLayout.setBackgroundTintList(ColorStateList.valueOf(uIColorPreferences.getInputBG()));
            textInputLayout.setBoxBackgroundColor(uIColorPreferences.getInputBG());
            textInputLayout.setHintTextColor(ColorStateList.valueOf(uIColorPreferences.getTextSecondary()));
            textInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(uIColorPreferences.getTextSecondary()));
            ecomCardViewDataBinding.ecomCvdCardNumberHint.setTextColor(uIColorPreferences.getTextSecondary());
            TextInputLayout textInputLayout2 = ecomCardViewDataBinding.ecomCvdCardCvvLayout;
            textInputLayout2.setBackgroundTintList(ColorStateList.valueOf(uIColorPreferences.getInputBG()));
            textInputLayout2.setBoxBackgroundColor(uIColorPreferences.getInputBG());
            textInputLayout2.setHintTextColor(ColorStateList.valueOf(uIColorPreferences.getTextSecondary()));
            textInputLayout2.setDefaultHintTextColor(ColorStateList.valueOf(uIColorPreferences.getTextSecondary()));
            TextInputLayout textInputLayout3 = ecomCardViewDataBinding.ecomCvdCardDateLayout;
            textInputLayout3.setBackgroundTintList(ColorStateList.valueOf(uIColorPreferences.getInputBG()));
            textInputLayout3.setBoxBackgroundColor(uIColorPreferences.getInputBG());
            textInputLayout3.setHintTextColor(ColorStateList.valueOf(uIColorPreferences.getTextSecondary()));
            textInputLayout3.setDefaultHintTextColor(ColorStateList.valueOf(uIColorPreferences.getTextSecondary()));
            ecomCardViewDataBinding.ecomCvdMotionLayout.setBackgroundTintList(ColorStateList.valueOf(uIColorPreferences.getInputBG()));
        }
        UIPreferencesRepository.FontParams uIFontParams = preferences.getUIFontParams(UIPreferencesRepository.Font.BODY);
        if (uIFontParams == null) {
            return null;
        }
        TextInputEditText ecomCvdCardNumberEditText = ecomCardViewDataBinding.ecomCvdCardNumberEditText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardNumberEditText, "ecomCvdCardNumberEditText");
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = preferences.getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomCvdCardNumberEditText, uIFontParams, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextPrimary()) : null);
        TextInputEditText ecomCvdCardCvcEditText = ecomCardViewDataBinding.ecomCvdCardCvcEditText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardCvcEditText, "ecomCvdCardCvcEditText");
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences3 = preferences.getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomCvdCardCvcEditText, uIFontParams, uIColorPreferences3 != null ? Integer.valueOf(uIColorPreferences3.getTextPrimary()) : null);
        TextInputEditText ecomCvdCardDateEditText = ecomCardViewDataBinding.ecomCvdCardDateEditText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardDateEditText, "ecomCvdCardDateEditText");
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences4 = preferences.getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomCvdCardDateEditText, uIFontParams, uIColorPreferences4 != null ? Integer.valueOf(uIColorPreferences4.getTextPrimary()) : null);
        TextView ecomCvdCardNumberShortText = ecomCardViewDataBinding.ecomCvdCardNumberShortText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardNumberShortText, "ecomCvdCardNumberShortText");
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences5 = preferences.getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomCvdCardNumberShortText, uIFontParams, uIColorPreferences5 != null ? Integer.valueOf(uIColorPreferences5.getTextPrimary()) : null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void hideError() {
        setBackgroundResource(R.drawable.ecom_card_view_background);
    }

    public final void hideIcon() {
        this.binding.ecomCvdCardIconImageView.setAlpha(0.0f);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this._inputMode = savedState.getInputMode();
        setInputMode(savedState.getInputMode());
        this._isCollapsedState = savedState.getIsCollapsed();
        this._keyboardState = savedState.getKeyboardStatus();
        restoreKeyboardState();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setInputMode(this._inputMode);
        return savedState;
    }

    public final void setCardIcon(String url) {
        zdlpuopuiu.btonecajqb(url, "url");
        this.binding.ecomCvdCardIconImageView.setImageDrawable(null);
        AppCompatImageView ecomCvdCardIconImageView = this.binding.ecomCvdCardIconImageView;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardIconImageView, "ecomCvdCardIconImageView");
        ImageViewExtensionsKt.loadImageAsync$default(ecomCvdCardIconImageView, this.coilImpl, url, null, 4, null);
    }

    public final void setInputMode(CardInputMode state) {
        zdlpuopuiu.btonecajqb(state, "state");
        EcomCardViewDataBinding ecomCardViewDataBinding = this.binding;
        int i13 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i13 == 1) {
            if (this._inputMode == CardInputMode.CARD_NUMBER) {
                setupInitialState();
            } else {
                animateToExpanded(ecomCardViewDataBinding);
            }
            TextInputEditText ecomCvdCardNumberEditText = ecomCardViewDataBinding.ecomCvdCardNumberEditText;
            zdlpuopuiu.dxjokdxxww(ecomCvdCardNumberEditText, "ecomCvdCardNumberEditText");
            requestFocusEndLine(ecomCvdCardNumberEditText);
        } else if (i13 == 2) {
            TextInputLayout ecomCvdCardCvvLayout = ecomCardViewDataBinding.ecomCvdCardCvvLayout;
            zdlpuopuiu.dxjokdxxww(ecomCvdCardCvvLayout, "ecomCvdCardCvvLayout");
            ecomCvdCardCvvLayout.setVisibility(4);
            ecomCardViewDataBinding.ecomCvdCardDateEditText.setEnabled(true);
            String strZ = kcexrzcfyt.z(String.valueOf(ecomCardViewDataBinding.ecomCvdCardNumberEditText.getText()), 4);
            ecomCardViewDataBinding.ecomCvdCardNumberShortText.setText(strZ);
            animateToCollapsed(ecomCardViewDataBinding, strZ);
            ecomCardViewDataBinding.ecomCvdCardCvcEditText.setEnabled(false);
            TextInputEditText ecomCvdCardDateEditText = ecomCardViewDataBinding.ecomCvdCardDateEditText;
            zdlpuopuiu.dxjokdxxww(ecomCvdCardDateEditText, "ecomCvdCardDateEditText");
            requestFocusEndLine(ecomCvdCardDateEditText);
        } else if (i13 == 3) {
            String strZ2 = kcexrzcfyt.z(String.valueOf(ecomCardViewDataBinding.ecomCvdCardNumberEditText.getText()), 4);
            ecomCardViewDataBinding.ecomCvdCardNumberShortText.setText(strZ2);
            animateToCollapsed(ecomCardViewDataBinding, strZ2);
            ecomCardViewDataBinding.ecomCvdCardCvcEditText.setEnabled(true);
            Editable text = ecomCardViewDataBinding.ecomCvdCardCvcEditText.getText();
            if (text != null) {
                text.clear();
            }
            ecomCardViewDataBinding.ecomCvdCardCvcEditText.requestFocus();
            ecomCardViewDataBinding.ecomCvdCardDateEditText.setEnabled(false);
        }
        TextInputEditText textInputEditText = ecomCardViewDataBinding.ecomCvdCardCvcEditText;
        textInputEditText.setGravity((state == CardInputMode.CVV || textInputEditText.length() > 0) ? 80 : 16);
        this._inputMode = state;
    }

    public final TextWatcher setupViewTextWatchers(draadjrbmk doOnCardNumberModified, final draadjrbmk doOnShortCardClickListener, rgvfuqvkyq doOnDateChange, final draadjrbmk doOnCVVChange) {
        zdlpuopuiu.btonecajqb(doOnCardNumberModified, "doOnCardNumberModified");
        zdlpuopuiu.btonecajqb(doOnShortCardClickListener, "doOnShortCardClickListener");
        zdlpuopuiu.btonecajqb(doOnDateChange, "doOnDateChange");
        zdlpuopuiu.btonecajqb(doOnCVVChange, "doOnCVVChange");
        final EcomCardViewDataBinding ecomCardViewDataBinding = this.binding;
        TextInputEditText ecomCvdCardNumberEditText = ecomCardViewDataBinding.ecomCvdCardNumberEditText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardNumberEditText, "ecomCvdCardNumberEditText");
        CardNumberFormatTextWatcher cardNumberFormatTextWatcher = new CardNumberFormatTextWatcher(ecomCvdCardNumberEditText, doOnCardNumberModified);
        cardNumberFormatTextWatcher.setMaxLength(16);
        ecomCardViewDataBinding.ecomCvdCardNumberEditText.addTextChangedListener(cardNumberFormatTextWatcher);
        ecomCardViewDataBinding.ecomCvdCardNumberShortText.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.view.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomCardDataView.setupViewTextWatchers$lambda$5$lambda$2(ecomCardViewDataBinding, doOnShortCardClickListener, this, view);
            }
        });
        TextInputEditText textInputEditText = ecomCardViewDataBinding.ecomCvdCardDateEditText;
        CardDateFormatTextWatcher cardDateFormatTextWatcher = new CardDateFormatTextWatcher(doOnDateChange);
        this.cardDateFormatter = cardDateFormatTextWatcher;
        textInputEditText.addTextChangedListener(cardDateFormatTextWatcher);
        TextInputEditText ecomCvdCardCvcEditText = ecomCardViewDataBinding.ecomCvdCardCvcEditText;
        zdlpuopuiu.dxjokdxxww(ecomCvdCardCvcEditText, "ecomCvdCardCvcEditText");
        TextWatcher textWatcher = new TextWatcher() { // from class: modern.payments.ecomAndroid.presentation.view.EcomCardDataView$setupViewTextWatchers$lambda$5$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s13) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                doOnCVVChange.invoke(String.valueOf(text));
            }
        };
        ecomCvdCardCvcEditText.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public final void showError(InputError error) {
        zdlpuopuiu.btonecajqb(error, "error");
        setBackgroundResource(R.drawable.ecom_card_view_background_error);
        if (error instanceof InputError.IncorrectYear) {
            showDateError();
        }
    }

    public final void showIcon() {
        this.binding.ecomCvdCardIconImageView.setAlpha(1.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomCardDataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "Landroid/os/Parcel;", AdRevenueConstants.SOURCE_KEY, "(Landroid/os/Parcel;)V", "out", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "inputMode", "Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "getInputMode", "()Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "setInputMode", "(Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;)V", "", "isCollapsed", "Z", "()Z", "setCollapsed", "(Z)V", "Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$KeyboardStatus;", "keyboardStatus", "Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$KeyboardStatus;", "getKeyboardStatus", "()Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$KeyboardStatus;", "setKeyboardStatus", "(Lmodern/payments/ecomAndroid/presentation/view/EcomCardDataView$KeyboardStatus;)V", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class SavedState extends View.BaseSavedState {
        private CardInputMode inputMode;
        private boolean isCollapsed;
        private KeyboardStatus keyboardStatus;
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: modern.payments.ecomAndroid.presentation.view.EcomCardDataView$SavedState$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public EcomCardDataView.SavedState createFromParcel(Parcel source) {
                zdlpuopuiu.btonecajqb(source, "source");
                return new EcomCardDataView.SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            public EcomCardDataView.SavedState[] newArray(int size) {
                return new EcomCardDataView.SavedState[size];
            }
        };

        /* JADX WARN: Multi-variable type inference failed */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.inputMode = CardInputMode.CARD_NUMBER;
            this.keyboardStatus = new KeyboardStatus(false, 0 == true ? 1 : 0, 2, null);
        }

        public final CardInputMode getInputMode() {
            return this.inputMode;
        }

        public final KeyboardStatus getKeyboardStatus() {
            return this.keyboardStatus;
        }

        /* JADX INFO: renamed from: isCollapsed, reason: from getter */
        public final boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        public final void setCollapsed(boolean z13) {
            this.isCollapsed = z13;
        }

        public final void setInputMode(CardInputMode cardInputMode) {
            zdlpuopuiu.btonecajqb(cardInputMode, "<set-?>");
            this.inputMode = cardInputMode;
        }

        public final void setKeyboardStatus(KeyboardStatus keyboardStatus) {
            zdlpuopuiu.btonecajqb(keyboardStatus, "<set-?>");
            this.keyboardStatus = keyboardStatus;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zdlpuopuiu.btonecajqb(out, "out");
            super.writeToParcel(out, flags);
            out.writeInt(this.inputMode.ordinal());
            out.writeInt(this.isCollapsed ? 1 : 0);
            out.writeInt(this.keyboardStatus.getOpen() ? 1 : 0);
            out.writeInt(this.keyboardStatus.getView());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SavedState(Parcel source) {
            CardInputMode cardInputMode;
            super(source);
            zdlpuopuiu.btonecajqb(source, "source");
            this.inputMode = CardInputMode.CARD_NUMBER;
            this.keyboardStatus = new KeyboardStatus(0 == true ? 1 : 0, 0 == true ? 1 : 0, 2, null);
            try {
                cardInputMode = (CardInputMode) CardInputMode.getEntries().get(source.readInt());
            } catch (Exception unused) {
                cardInputMode = CardInputMode.CARD_NUMBER;
            }
            this.inputMode = cardInputMode;
            this.isCollapsed = source.readInt() != 0;
            this.keyboardStatus = new KeyboardStatus(source.readInt() != 0, source.readInt());
        }
    }

    public /* synthetic */ EcomCardDataView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomCardDataView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        EcomCardViewDataBinding ecomCardViewDataBindingInflate = EcomCardViewDataBinding.inflate(LayoutInflater.from(context), this);
        zdlpuopuiu.dxjokdxxww(ecomCardViewDataBindingInflate, "inflate(...)");
        this.binding = ecomCardViewDataBindingInflate;
        this._inputMode = CardInputMode.CARD_NUMBER;
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        this.coilImpl = paymentFlowSubcomponent$ecomAndroid_release != null ? paymentFlowSubcomponent$ecomAndroid_release.getCoil() : null;
        setupInitialState();
    }
}
