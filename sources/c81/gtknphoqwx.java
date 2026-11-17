package c81;

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

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final TextView f19220btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final View f19221draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final TextView f19222dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LottieAnimationView f19223eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final TextView f19224gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Space f19225gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f19226iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Space f19227lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final TextView f19228nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Group f19229ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ImageView f19230wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Button f19231zoijcleaow;

    private gtknphoqwx(MaterialCardView materialCardView, Button button, Group group, ImageView imageView, LottieAnimationView lottieAnimationView, Space space, Space space2, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.f19226iobyxmoadg = materialCardView;
        this.f19231zoijcleaow = button;
        this.f19229ppxfxbqfkf = group;
        this.f19230wkgbmnqykc = imageView;
        this.f19223eablkybsjg = lottieAnimationView;
        this.f19225gxszxtbevo = space;
        this.f19227lqeggnwhkg = space2;
        this.f19228nufgyqmvbu = textView;
        this.f19222dxjokdxxww = textView2;
        this.f19220btonecajqb = textView3;
        this.f19224gtknphoqwx = textView4;
        this.f19221draadjrbmk = view;
    }

    public static gtknphoqwx iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = u71.wkgbmnqykc.btnAction;
        Button button = (Button) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (button != null) {
            i13 = u71.wkgbmnqykc.groupTicket;
            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (group != null) {
                i13 = u71.wkgbmnqykc.ivIcon;
                ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (imageView != null) {
                    i13 = u71.wkgbmnqykc.lavTicket;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (lottieAnimationView != null) {
                        i13 = u71.wkgbmnqykc.spaceTicketBottom;
                        Space space = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (space != null) {
                            i13 = u71.wkgbmnqykc.spaceTicketTop;
                            Space space2 = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (space2 != null) {
                                i13 = u71.wkgbmnqykc.tvSubtitle;
                                TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (textView != null) {
                                    i13 = u71.wkgbmnqykc.tvTicketTitle;
                                    TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (textView2 != null) {
                                        i13 = u71.wkgbmnqykc.tvTicketValue;
                                        TextView textView3 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (textView3 != null) {
                                            i13 = u71.wkgbmnqykc.tvTitle;
                                            TextView textView4 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (textView4 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = u71.wkgbmnqykc.viewTicketBg))) != null) {
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
        View viewInflate = layoutInflater.inflate(u71.eablkybsjg.item_evropolis_stickers_card_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f19226iobyxmoadg;
    }
}
