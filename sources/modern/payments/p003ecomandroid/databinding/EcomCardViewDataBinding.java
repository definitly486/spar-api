package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomCardViewDataBinding implements iobyxmoadg {
    public final TextInputEditText ecomCvdCardCvcEditText;
    public final TextInputLayout ecomCvdCardCvvLayout;
    public final TextInputEditText ecomCvdCardDateEditText;
    public final TextInputLayout ecomCvdCardDateLayout;
    public final AppCompatImageView ecomCvdCardIconImageView;
    public final TextInputEditText ecomCvdCardNumberEditText;
    public final TextView ecomCvdCardNumberHint;
    public final TextInputLayout ecomCvdCardNumberLayout;
    public final TextView ecomCvdCardNumberShortText;
    public final MotionLayout ecomCvdMotionLayout;
    private final View rootView;

    private EcomCardViewDataBinding(View view, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, AppCompatImageView appCompatImageView, TextInputEditText textInputEditText3, TextView textView, TextInputLayout textInputLayout3, TextView textView2, MotionLayout motionLayout) {
        this.rootView = view;
        this.ecomCvdCardCvcEditText = textInputEditText;
        this.ecomCvdCardCvvLayout = textInputLayout;
        this.ecomCvdCardDateEditText = textInputEditText2;
        this.ecomCvdCardDateLayout = textInputLayout2;
        this.ecomCvdCardIconImageView = appCompatImageView;
        this.ecomCvdCardNumberEditText = textInputEditText3;
        this.ecomCvdCardNumberHint = textView;
        this.ecomCvdCardNumberLayout = textInputLayout3;
        this.ecomCvdCardNumberShortText = textView2;
        this.ecomCvdMotionLayout = motionLayout;
    }

    public static EcomCardViewDataBinding bind(View view) {
        int i13 = R.id.ecomCvdCardCvcEditText;
        TextInputEditText textInputEditText = (TextInputEditText) zoijcleaow.iobyxmoadg(view, i13);
        if (textInputEditText != null) {
            i13 = R.id.ecomCvdCardCvvLayout;
            TextInputLayout textInputLayout = (TextInputLayout) zoijcleaow.iobyxmoadg(view, i13);
            if (textInputLayout != null) {
                i13 = R.id.ecomCvdCardDateEditText;
                TextInputEditText textInputEditText2 = (TextInputEditText) zoijcleaow.iobyxmoadg(view, i13);
                if (textInputEditText2 != null) {
                    i13 = R.id.ecomCvdCardDateLayout;
                    TextInputLayout textInputLayout2 = (TextInputLayout) zoijcleaow.iobyxmoadg(view, i13);
                    if (textInputLayout2 != null) {
                        i13 = R.id.ecomCvdCardIconImageView;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView != null) {
                            i13 = R.id.ecomCvdCardNumberEditText;
                            TextInputEditText textInputEditText3 = (TextInputEditText) zoijcleaow.iobyxmoadg(view, i13);
                            if (textInputEditText3 != null) {
                                i13 = R.id.ecomCvdCardNumberHint;
                                TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                                if (textView != null) {
                                    i13 = R.id.ecomCvdCardNumberLayout;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) zoijcleaow.iobyxmoadg(view, i13);
                                    if (textInputLayout3 != null) {
                                        i13 = R.id.ecomCvdCardNumberShortText;
                                        TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                                        if (textView2 != null) {
                                            i13 = R.id.ecomCvdMotionLayout;
                                            MotionLayout motionLayout = (MotionLayout) zoijcleaow.iobyxmoadg(view, i13);
                                            if (motionLayout != null) {
                                                return new EcomCardViewDataBinding(view, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, appCompatImageView, textInputEditText3, textView, textInputLayout3, textView2, motionLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomCardViewDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ecom_card_view_data, viewGroup);
        return bind(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.rootView;
    }
}
