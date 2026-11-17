package m60;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class pkzmftpjix implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final TextView f65876agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialButton f65877btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final TextView f65878draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ImageView f65879dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f65880eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final RecyclerView f65881gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ComposeView f65882gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65883iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Group f65884lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final iyctptxqzt f65885nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final TextView f65886ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f65887ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final View f65888rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final TextView f65889wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f65890wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Group f65891zoijcleaow;

    private pkzmftpjix(ConstraintLayout constraintLayout, Group group, View view, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, Group group2, iyctptxqzt iyctptxqztVar, ImageView imageView, MaterialButton materialButton2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.f65883iobyxmoadg = constraintLayout;
        this.f65891zoijcleaow = group;
        this.f65887ppxfxbqfkf = view;
        this.f65890wkgbmnqykc = materialButton;
        this.f65880eablkybsjg = composeView;
        this.f65882gxszxtbevo = composeView2;
        this.f65884lqeggnwhkg = group2;
        this.f65885nufgyqmvbu = iyctptxqztVar;
        this.f65879dxjokdxxww = imageView;
        this.f65877btonecajqb = materialButton2;
        this.f65881gtknphoqwx = recyclerView;
        this.f65878draadjrbmk = textView;
        this.f65889wflxmlrfwp = textView2;
        this.f65876agtfadlqog = textView3;
        this.f65886ojitshcjhn = textView4;
        this.f65888rgvfuqvkyq = view2;
    }

    public static pkzmftpjix iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        View viewIobyxmoadg3;
        int i13 = pm.eablkybsjg.addReviewGroup;
        Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (group != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.bottomBarBackground))) != null) {
            i13 = pm.eablkybsjg.btnStubAction;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = pm.eablkybsjg.clLoading;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null) {
                    i13 = pm.eablkybsjg.cvActionBar;
                    ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView2 != null) {
                        i13 = pm.eablkybsjg.groupEmptyReviewsStub;
                        Group group2 = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (group2 != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.includeReviewHeader))) != null) {
                            iyctptxqzt iyctptxqztVarIobyxmoadg = iyctptxqzt.iobyxmoadg(viewIobyxmoadg2);
                            i13 = pm.eablkybsjg.ivStub;
                            ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (imageView != null) {
                                i13 = pm.eablkybsjg.mbtEditReview;
                                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialButton2 != null) {
                                    i13 = pm.eablkybsjg.rvReviews;
                                    RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (recyclerView != null) {
                                        i13 = pm.eablkybsjg.tvReviewListStubDescription;
                                        TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (textView != null) {
                                            i13 = pm.eablkybsjg.tvReviewListStubTitle;
                                            TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (textView2 != null) {
                                                i13 = pm.eablkybsjg.tvStubDescription;
                                                TextView textView3 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (textView3 != null) {
                                                    i13 = pm.eablkybsjg.tvStubTitle;
                                                    TextView textView4 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (textView4 != null && (viewIobyxmoadg3 = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.vDivider))) != null) {
                                                        return new pkzmftpjix((ConstraintLayout) view, group, viewIobyxmoadg, materialButton, composeView, composeView2, group2, iyctptxqztVarIobyxmoadg, imageView, materialButton2, recyclerView, textView, textView2, textView3, textView4, viewIobyxmoadg3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65883iobyxmoadg;
    }
}
