package z41;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;

/* JADX INFO: loaded from: classes5.dex */
public final class istkbnxepw implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final TextView f128115agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialButton f128116btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final TextView f128117draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ImageView f128118dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f128119eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final RecyclerView f128120gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ComposeView f128121gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128122iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Group f128123lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final xrmfcynszj f128124nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final TextView f128125ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f128126ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final MaterialDivider f128127rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final TextView f128128wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f128129wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Group f128130zoijcleaow;

    private istkbnxepw(ConstraintLayout constraintLayout, Group group, View view, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, Group group2, xrmfcynszj xrmfcynszjVar, ImageView imageView, MaterialButton materialButton2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, MaterialDivider materialDivider) {
        this.f128122iobyxmoadg = constraintLayout;
        this.f128130zoijcleaow = group;
        this.f128126ppxfxbqfkf = view;
        this.f128129wkgbmnqykc = materialButton;
        this.f128119eablkybsjg = composeView;
        this.f128121gxszxtbevo = composeView2;
        this.f128123lqeggnwhkg = group2;
        this.f128124nufgyqmvbu = xrmfcynszjVar;
        this.f128118dxjokdxxww = imageView;
        this.f128116btonecajqb = materialButton2;
        this.f128120gtknphoqwx = recyclerView;
        this.f128117draadjrbmk = textView;
        this.f128128wflxmlrfwp = textView2;
        this.f128115agtfadlqog = textView3;
        this.f128125ojitshcjhn = textView4;
        this.f128127rgvfuqvkyq = materialDivider;
    }

    public static istkbnxepw iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        int i13 = vk0.wkgbmnqykc.addReviewGroup;
        Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (group != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.bottomBarBackground))) != null) {
            i13 = vk0.wkgbmnqykc.btnStubAction;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = vk0.wkgbmnqykc.clLoading;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null) {
                    i13 = vk0.wkgbmnqykc.cvActionBar;
                    ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView2 != null) {
                        i13 = vk0.wkgbmnqykc.groupEmptyReviewsStub;
                        Group group2 = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (group2 != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.includeReviewHeader))) != null) {
                            xrmfcynszj xrmfcynszjVarIobyxmoadg = xrmfcynszj.iobyxmoadg(viewIobyxmoadg2);
                            i13 = vk0.wkgbmnqykc.ivStub;
                            ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (imageView != null) {
                                i13 = vk0.wkgbmnqykc.mbtEditReview;
                                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialButton2 != null) {
                                    i13 = vk0.wkgbmnqykc.rvReviews;
                                    RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (recyclerView != null) {
                                        i13 = vk0.wkgbmnqykc.tvReviewListStubDescription;
                                        TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (textView != null) {
                                            i13 = vk0.wkgbmnqykc.tvReviewListStubTitle;
                                            TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (textView2 != null) {
                                                i13 = vk0.wkgbmnqykc.tvStubDescription;
                                                TextView textView3 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (textView3 != null) {
                                                    i13 = vk0.wkgbmnqykc.tvStubTitle;
                                                    TextView textView4 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (textView4 != null) {
                                                        i13 = vk0.wkgbmnqykc.vDivider;
                                                        MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialDivider != null) {
                                                            return new istkbnxepw((ConstraintLayout) view, group, viewIobyxmoadg, materialButton, composeView, composeView2, group2, xrmfcynszjVarIobyxmoadg, imageView, materialButton2, recyclerView, textView, textView2, textView3, textView4, materialDivider);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128122iobyxmoadg;
    }
}
