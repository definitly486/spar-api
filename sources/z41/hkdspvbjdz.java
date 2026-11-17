package z41;

import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class hkdspvbjdz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128077btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128078draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128079dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f128080eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128081gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Group f128082gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ScrollView f128083iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final ShapeableImageView f128084lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128085nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f128086ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final View f128087wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f128088wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128089zoijcleaow;

    private hkdspvbjdz(ScrollView scrollView, MaterialButton materialButton, Guideline guideline, Guideline guideline2, Guideline guideline3, Group group, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, View view) {
        this.f128083iobyxmoadg = scrollView;
        this.f128089zoijcleaow = materialButton;
        this.f128086ppxfxbqfkf = guideline;
        this.f128088wkgbmnqykc = guideline2;
        this.f128080eablkybsjg = guideline3;
        this.f128082gxszxtbevo = group;
        this.f128084lqeggnwhkg = shapeableImageView;
        this.f128085nufgyqmvbu = materialTextView;
        this.f128079dxjokdxxww = materialTextView2;
        this.f128077btonecajqb = materialTextView3;
        this.f128081gtknphoqwx = materialTextView4;
        this.f128078draadjrbmk = materialTextView5;
        this.f128087wflxmlrfwp = view;
    }

    public static hkdspvbjdz iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.btnUpdate;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.glBottom;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = vk0.wkgbmnqykc.glEnd;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null) {
                    i13 = vk0.wkgbmnqykc.glStart;
                    Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline3 != null) {
                        i13 = vk0.wkgbmnqykc.groupCard;
                        Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (group != null) {
                            i13 = vk0.wkgbmnqykc.ivQrCard;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (shapeableImageView != null) {
                                i13 = vk0.wkgbmnqykc.tvCard;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = vk0.wkgbmnqykc.tvCardCaption;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = vk0.wkgbmnqykc.tvInfo;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            i13 = vk0.wkgbmnqykc.tvMessage;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView4 != null) {
                                                i13 = vk0.wkgbmnqykc.tvTitle;
                                                MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView5 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.vCurtain))) != null) {
                                                    return new hkdspvbjdz((ScrollView) view, materialButton, guideline, guideline2, guideline3, group, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, viewIobyxmoadg);
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
    public ScrollView getRoot() {
        return this.f128083iobyxmoadg;
    }
}
