package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class lereixgezr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f114182iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final TextView f114183ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f114184wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f114185zoijcleaow;

    private lereixgezr(MaterialCardView materialCardView, ImageView imageView, TextView textView, TextView textView2) {
        this.f114182iobyxmoadg = materialCardView;
        this.f114185zoijcleaow = imageView;
        this.f114183ppxfxbqfkf = textView;
        this.f114184wkgbmnqykc = textView2;
    }

    public static lereixgezr iobyxmoadg(View view) {
        int i13 = mq1.iobyxmoadg.ivIcon;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = mq1.iobyxmoadg.tvSubtitle;
            TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (textView != null) {
                i13 = mq1.iobyxmoadg.tvTitle;
                TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView2 != null) {
                    return new lereixgezr((MaterialCardView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static lereixgezr ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_timer_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f114182iobyxmoadg;
    }
}
