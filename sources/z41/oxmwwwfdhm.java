package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class oxmwwwfdhm implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128312btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128313draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final RecyclerView f128314dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f128315eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128316gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialCardView f128317gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128318iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatImageView f128319lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ConstraintLayout f128320nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128321ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f128322wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f128323wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128324zoijcleaow;

    private oxmwwwfdhm(MaterialCardView materialCardView, MaterialButton materialButton, AppCompatImageView appCompatImageView, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f128318iobyxmoadg = materialCardView;
        this.f128324zoijcleaow = materialButton;
        this.f128321ppxfxbqfkf = appCompatImageView;
        this.f128323wkgbmnqykc = materialButton2;
        this.f128315eablkybsjg = materialButton3;
        this.f128317gxszxtbevo = materialCardView2;
        this.f128319lqeggnwhkg = appCompatImageView2;
        this.f128320nufgyqmvbu = constraintLayout;
        this.f128314dxjokdxxww = recyclerView;
        this.f128312btonecajqb = materialTextView;
        this.f128316gtknphoqwx = materialTextView2;
        this.f128313draadjrbmk = materialTextView3;
        this.f128322wflxmlrfwp = materialTextView4;
    }

    public static oxmwwwfdhm iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnCall;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.btnClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = vk0.wkgbmnqykc.btnInList;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = vk0.wkgbmnqykc.btnRoute;
                    MaterialButton materialButton3 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialButton3 != null) {
                        MaterialCardView materialCardView = (MaterialCardView) view;
                        i13 = vk0.wkgbmnqykc.ivClock;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView2 != null) {
                            i13 = vk0.wkgbmnqykc.relativeLayout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (constraintLayout != null) {
                                i13 = vk0.wkgbmnqykc.rvServices;
                                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (recyclerView != null) {
                                    i13 = vk0.wkgbmnqykc.tvAddress;
                                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView != null) {
                                        i13 = vk0.wkgbmnqykc.tvHours;
                                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView2 != null) {
                                            i13 = vk0.wkgbmnqykc.tvServices;
                                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView3 != null) {
                                                i13 = vk0.wkgbmnqykc.tvType;
                                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView4 != null) {
                                                    return new oxmwwwfdhm(materialCardView, materialButton, appCompatImageView, materialButton2, materialButton3, materialCardView, appCompatImageView2, constraintLayout, recyclerView, materialTextView, materialTextView2, materialTextView3, materialTextView4);
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

    public static oxmwwwfdhm ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.dialog_shop_details_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128318iobyxmoadg;
    }
}
