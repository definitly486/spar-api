package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class yggfygwlhe implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f66145btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f66146draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final RecyclerView f66147dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f66148eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f66149gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialCardView f66150gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f66151iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatImageView f66152lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ConstraintLayout f66153nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f66154ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f66155wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f66156wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f66157zoijcleaow;

    private yggfygwlhe(MaterialCardView materialCardView, MaterialButton materialButton, AppCompatImageView appCompatImageView, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f66151iobyxmoadg = materialCardView;
        this.f66157zoijcleaow = materialButton;
        this.f66154ppxfxbqfkf = appCompatImageView;
        this.f66156wkgbmnqykc = materialButton2;
        this.f66148eablkybsjg = materialButton3;
        this.f66150gxszxtbevo = materialCardView2;
        this.f66152lqeggnwhkg = appCompatImageView2;
        this.f66153nufgyqmvbu = constraintLayout;
        this.f66147dxjokdxxww = recyclerView;
        this.f66145btonecajqb = materialTextView;
        this.f66149gtknphoqwx = materialTextView2;
        this.f66146draadjrbmk = materialTextView3;
        this.f66155wflxmlrfwp = materialTextView4;
    }

    public static yggfygwlhe iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnCall;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.btnClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = pm.eablkybsjg.btnInList;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = pm.eablkybsjg.btnRoute;
                    MaterialButton materialButton3 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialButton3 != null) {
                        MaterialCardView materialCardView = (MaterialCardView) view;
                        i13 = pm.eablkybsjg.ivClock;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView2 != null) {
                            i13 = pm.eablkybsjg.relativeLayout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (constraintLayout != null) {
                                i13 = pm.eablkybsjg.rvServices;
                                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (recyclerView != null) {
                                    i13 = pm.eablkybsjg.tvAddress;
                                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView != null) {
                                        i13 = pm.eablkybsjg.tvHours;
                                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView2 != null) {
                                            i13 = pm.eablkybsjg.tvServices;
                                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView3 != null) {
                                                i13 = pm.eablkybsjg.tvType;
                                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView4 != null) {
                                                    return new yggfygwlhe(materialCardView, materialButton, appCompatImageView, materialButton2, materialButton3, materialCardView, appCompatImageView2, constraintLayout, recyclerView, materialTextView, materialTextView2, materialTextView3, materialTextView4);
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

    public static yggfygwlhe ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.dialog_shop_details, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f66151iobyxmoadg;
    }
}
