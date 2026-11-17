package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomRvItemSbpBankBinding implements iobyxmoadg {
    public final LinearLayout ecomSbpBankContainer;
    public final ImageView ecomSbpBankIcon;
    public final TextView ecomSbpBankName;
    private final CardView rootView;

    private EcomRvItemSbpBankBinding(CardView cardView, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = cardView;
        this.ecomSbpBankContainer = linearLayout;
        this.ecomSbpBankIcon = imageView;
        this.ecomSbpBankName = textView;
    }

    public static EcomRvItemSbpBankBinding bind(View view) {
        int i13 = R.id.ecom_sbp_bank_container;
        LinearLayout linearLayout = (LinearLayout) zoijcleaow.iobyxmoadg(view, i13);
        if (linearLayout != null) {
            i13 = R.id.ecom_sbp_bank_icon;
            ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
            if (imageView != null) {
                i13 = R.id.ecom_sbp_bank_name;
                TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    return new EcomRvItemSbpBankBinding((CardView) view, linearLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomRvItemSbpBankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomRvItemSbpBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_rv_item_sbp_bank, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public CardView getRoot() {
        return this.rootView;
    }
}
