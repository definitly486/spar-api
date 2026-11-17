package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ratingbar.RatingBarView;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f66176btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f66177dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RatingBarView f66178eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f66179gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f66180iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f66181lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f66182nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Group f66183ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LinearLayout f66184wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f66185zoijcleaow;

    private z(View view, AppCompatImageView appCompatImageView, Group group, LinearLayout linearLayout, RatingBarView ratingBarView, TextView textView, TextView textView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f66180iobyxmoadg = view;
        this.f66185zoijcleaow = appCompatImageView;
        this.f66183ppxfxbqfkf = group;
        this.f66184wkgbmnqykc = linearLayout;
        this.f66178eablkybsjg = ratingBarView;
        this.f66179gxszxtbevo = textView;
        this.f66181lqeggnwhkg = textView2;
        this.f66182nufgyqmvbu = materialTextView;
        this.f66177dxjokdxxww = materialTextView2;
        this.f66176btonecajqb = materialTextView3;
    }

    public static z iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.ivArrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = pm.eablkybsjg.llAnswerBlock;
            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (group != null) {
                i13 = pm.eablkybsjg.llReview;
                LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (linearLayout != null) {
                    i13 = pm.eablkybsjg.ratingBar;
                    RatingBarView ratingBarView = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (ratingBarView != null) {
                        i13 = pm.eablkybsjg.tvAnswer;
                        TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textView != null) {
                            i13 = pm.eablkybsjg.tvAnswerTitle;
                            TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textView2 != null) {
                                i13 = pm.eablkybsjg.tvComment;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = pm.eablkybsjg.tvDate;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = pm.eablkybsjg.tvName;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            return new z(view, appCompatImageView, group, linearLayout, ratingBarView, textView, textView2, materialTextView, materialTextView2, materialTextView3);
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

    public static z zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_rating_details_item_layout, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f66180iobyxmoadg;
    }
}
