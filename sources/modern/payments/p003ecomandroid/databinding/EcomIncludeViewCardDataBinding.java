package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomIncludeViewCardDataBinding implements iobyxmoadg {
    public final TextInputLayout ecomCvdCardCvvLayout;
    public final TextInputEditText ecomVcdCardCvcEditText;
    public final TextInputEditText ecomVcdCardDateEditText;
    public final TextInputLayout ecomVcdCardDateLayout;
    public final TextView ecomVcdCardErrormMessageTextView;
    public final AppCompatImageView ecomVcdCardIconImageView;
    public final TextInputEditText ecomVcdCardNumberEditText;
    public final TextInputLayout ecomVcdCardNumberLayout;
    private final LinearLayout rootView;

    private EcomIncludeViewCardDataBinding(LinearLayout linearLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextView textView, AppCompatImageView appCompatImageView, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3) {
        this.rootView = linearLayout;
        this.ecomCvdCardCvvLayout = textInputLayout;
        this.ecomVcdCardCvcEditText = textInputEditText;
        this.ecomVcdCardDateEditText = textInputEditText2;
        this.ecomVcdCardDateLayout = textInputLayout2;
        this.ecomVcdCardErrormMessageTextView = textView;
        this.ecomVcdCardIconImageView = appCompatImageView;
        this.ecomVcdCardNumberEditText = textInputEditText3;
        this.ecomVcdCardNumberLayout = textInputLayout3;
    }

    public static EcomIncludeViewCardDataBinding bind(View view) {
        int i13 = R.id.ecomCvdCardCvvLayout;
        TextInputLayout textInputLayout = (TextInputLayout) zoijcleaow.iobyxmoadg(view, i13);
        if (textInputLayout != null) {
            i13 = R.id.ecom_vcd_card_cvc_edit_text;
            TextInputEditText textInputEditText = (TextInputEditText) zoijcleaow.iobyxmoadg(view, i13);
            if (textInputEditText != null) {
                i13 = R.id.ecom_vcd_card_date_edit_text;
                TextInputEditText textInputEditText2 = (TextInputEditText) zoijcleaow.iobyxmoadg(view, i13);
                if (textInputEditText2 != null) {
                    i13 = R.id.ecom_vcd_card_date_layout;
                    TextInputLayout textInputLayout2 = (TextInputLayout) zoijcleaow.iobyxmoadg(view, i13);
                    if (textInputLayout2 != null) {
                        i13 = R.id.ecom_vcd_card_errorm_message_text_view;
                        TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                        if (textView != null) {
                            i13 = R.id.ecom_vcd_card_icon_image_view;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(view, i13);
                            if (appCompatImageView != null) {
                                i13 = R.id.ecom_vcd_card_number_edit_text;
                                TextInputEditText textInputEditText3 = (TextInputEditText) zoijcleaow.iobyxmoadg(view, i13);
                                if (textInputEditText3 != null) {
                                    i13 = R.id.ecom_vcd_card_number_layout;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) zoijcleaow.iobyxmoadg(view, i13);
                                    if (textInputLayout3 != null) {
                                        return new EcomIncludeViewCardDataBinding((LinearLayout) view, textInputLayout, textInputEditText, textInputEditText2, textInputLayout2, textView, appCompatImageView, textInputEditText3, textInputLayout3);
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

    public static EcomIncludeViewCardDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomIncludeViewCardDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_include_view_card_data, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
