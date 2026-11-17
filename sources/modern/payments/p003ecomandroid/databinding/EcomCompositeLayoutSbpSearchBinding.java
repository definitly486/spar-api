package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomCompositeLayoutSbpSearchBinding implements iobyxmoadg {
    public final ImageView ecomEclssSearchIcon;
    public final TextInputEditText ecomEclssSearchInput;
    private final LinearLayout rootView;

    private EcomCompositeLayoutSbpSearchBinding(LinearLayout linearLayout, ImageView imageView, TextInputEditText textInputEditText) {
        this.rootView = linearLayout;
        this.ecomEclssSearchIcon = imageView;
        this.ecomEclssSearchInput = textInputEditText;
    }

    public static EcomCompositeLayoutSbpSearchBinding bind(View view) {
        int i13 = R.id.ecomEclssSearchIcon;
        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = R.id.ecomEclssSearchInput;
            TextInputEditText textInputEditText = (TextInputEditText) zoijcleaow.iobyxmoadg(view, i13);
            if (textInputEditText != null) {
                return new EcomCompositeLayoutSbpSearchBinding((LinearLayout) view, imageView, textInputEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomCompositeLayoutSbpSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomCompositeLayoutSbpSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_composite_layout_sbp_search, viewGroup, false);
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
