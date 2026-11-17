package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.ratingbar.RatingBarView;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f127826btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f127827dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RatingBarView f127828eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f127829gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f127830iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f127831lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f127832nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Group f127833ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LinearLayout f127834wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f127835zoijcleaow;

    private b(View view, AppCompatImageView appCompatImageView, Group group, LinearLayout linearLayout, RatingBarView ratingBarView, TextView textView, TextView textView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f127830iobyxmoadg = view;
        this.f127835zoijcleaow = appCompatImageView;
        this.f127833ppxfxbqfkf = group;
        this.f127834wkgbmnqykc = linearLayout;
        this.f127828eablkybsjg = ratingBarView;
        this.f127829gxszxtbevo = textView;
        this.f127831lqeggnwhkg = textView2;
        this.f127832nufgyqmvbu = materialTextView;
        this.f127827dxjokdxxww = materialTextView2;
        this.f127826btonecajqb = materialTextView3;
    }

    public static b iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.ivArrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = vk0.wkgbmnqykc.llAnswerBlock;
            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (group != null) {
                i13 = vk0.wkgbmnqykc.llReview;
                LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (linearLayout != null) {
                    i13 = vk0.wkgbmnqykc.ratingBar;
                    RatingBarView ratingBarView = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (ratingBarView != null) {
                        i13 = vk0.wkgbmnqykc.tvAnswer;
                        TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textView != null) {
                            i13 = vk0.wkgbmnqykc.tvAnswerTitle;
                            TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textView2 != null) {
                                i13 = vk0.wkgbmnqykc.tvComment;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = vk0.wkgbmnqykc.tvDate;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = vk0.wkgbmnqykc.tvName;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            return new b(view, appCompatImageView, group, linearLayout, ratingBarView, textView, textView2, materialTextView, materialTextView2, materialTextView3);
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

    public static b zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(vk0.eablkybsjg.view_rating_details_item_layout_proloyalty, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f127830iobyxmoadg;
    }
}
