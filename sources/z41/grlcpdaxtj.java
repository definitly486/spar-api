package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes5.dex */
public final class grlcpdaxtj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f128019iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ImageView f128020ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f128021wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardView f128022zoijcleaow;

    private grlcpdaxtj(View view, CardView cardView, ImageView imageView, TextView textView) {
        this.f128019iobyxmoadg = view;
        this.f128022zoijcleaow = cardView;
        this.f128020ppxfxbqfkf = imageView;
        this.f128021wkgbmnqykc = textView;
    }

    public static grlcpdaxtj iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.cardView;
        CardView cardView = (CardView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (cardView != null) {
            i13 = vk0.wkgbmnqykc.ivButtonImage;
            ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (imageView != null) {
                i13 = vk0.wkgbmnqykc.tvBadge;
                TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    return new grlcpdaxtj(view, cardView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static grlcpdaxtj zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(vk0.eablkybsjg.view_myspar_button_proloyalty, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f128019iobyxmoadg;
    }
}
