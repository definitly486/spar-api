package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CardView f114158iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final TextView f114159ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f114160wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f114161zoijcleaow;

    private eablkybsjg(CardView cardView, ImageView imageView, TextView textView, TextView textView2) {
        this.f114158iobyxmoadg = cardView;
        this.f114161zoijcleaow = imageView;
        this.f114159ppxfxbqfkf = textView;
        this.f114160wkgbmnqykc = textView2;
    }

    public static eablkybsjg iobyxmoadg(View view) {
        int i13 = mq1.iobyxmoadg.ivIcon;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = mq1.iobyxmoadg.tvDocumentInfo;
            TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (textView != null) {
                i13 = mq1.iobyxmoadg.tvTitle;
                TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView2 != null) {
                    return new eablkybsjg((CardView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static eablkybsjg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_document_new_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f114158iobyxmoadg;
    }
}
