package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f65801iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ImageView f65802ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f65803wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardView f65804zoijcleaow;

    private n(View view, CardView cardView, ImageView imageView, TextView textView) {
        this.f65801iobyxmoadg = view;
        this.f65804zoijcleaow = cardView;
        this.f65802ppxfxbqfkf = imageView;
        this.f65803wkgbmnqykc = textView;
    }

    public static n iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.cardView;
        CardView cardView = (CardView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (cardView != null) {
            i13 = pm.eablkybsjg.ivButtonImage;
            ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (imageView != null) {
                i13 = pm.eablkybsjg.tvBadge;
                TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    return new n(view, cardView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static n zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_myspar_button, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f65801iobyxmoadg;
    }
}
