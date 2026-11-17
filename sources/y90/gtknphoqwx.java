package y90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final TextView f124190btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final View f124191draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final TextView f124192dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LottieAnimationView f124193eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final TextView f124194gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Space f124195gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f124196iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Space f124197lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final TextView f124198nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Group f124199ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ImageView f124200wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Button f124201zoijcleaow;

    private gtknphoqwx(MaterialCardView materialCardView, Button button, Group group, ImageView imageView, LottieAnimationView lottieAnimationView, Space space, Space space2, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.f124196iobyxmoadg = materialCardView;
        this.f124201zoijcleaow = button;
        this.f124199ppxfxbqfkf = group;
        this.f124200wkgbmnqykc = imageView;
        this.f124193eablkybsjg = lottieAnimationView;
        this.f124195gxszxtbevo = space;
        this.f124197lqeggnwhkg = space2;
        this.f124198nufgyqmvbu = textView;
        this.f124192dxjokdxxww = textView2;
        this.f124190btonecajqb = textView3;
        this.f124194gtknphoqwx = textView4;
        this.f124191draadjrbmk = view;
    }

    public static gtknphoqwx iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = q90.wkgbmnqykc.btnAction;
        Button button = (Button) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (button != null) {
            i13 = q90.wkgbmnqykc.groupTicket;
            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (group != null) {
                i13 = q90.wkgbmnqykc.ivIcon;
                ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (imageView != null) {
                    i13 = q90.wkgbmnqykc.lavTicket;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (lottieAnimationView != null) {
                        i13 = q90.wkgbmnqykc.spaceTicketBottom;
                        Space space = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (space != null) {
                            i13 = q90.wkgbmnqykc.spaceTicketTop;
                            Space space2 = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (space2 != null) {
                                i13 = q90.wkgbmnqykc.tvSubtitle;
                                TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (textView != null) {
                                    i13 = q90.wkgbmnqykc.tvTicketTitle;
                                    TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (textView2 != null) {
                                        i13 = q90.wkgbmnqykc.tvTicketValue;
                                        TextView textView3 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (textView3 != null) {
                                            i13 = q90.wkgbmnqykc.tvTitle;
                                            TextView textView4 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (textView4 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = q90.wkgbmnqykc.viewTicketBg))) != null) {
                                                return new gtknphoqwx((MaterialCardView) view, button, group, imageView, lottieAnimationView, space, space2, textView, textView2, textView3, textView4, viewIobyxmoadg);
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

    public static gtknphoqwx ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(q90.eablkybsjg.item_evropolis_stickers_card, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f124196iobyxmoadg;
    }
}
