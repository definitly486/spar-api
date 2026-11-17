package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class sopmlzcsov implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f65977eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f65978gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65979iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65980ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f65981wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f65982zoijcleaow;

    private sopmlzcsov(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f65979iobyxmoadg = constraintLayout;
        this.f65982zoijcleaow = appCompatImageView;
        this.f65980ppxfxbqfkf = appCompatImageView2;
        this.f65981wkgbmnqykc = appCompatImageView3;
        this.f65977eablkybsjg = materialTextView;
        this.f65978gxszxtbevo = materialTextView2;
    }

    public static sopmlzcsov iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.ivDelete;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = pm.eablkybsjg.ivDots;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView2 != null) {
                i13 = pm.eablkybsjg.ivLogo;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView3 != null) {
                    i13 = pm.eablkybsjg.tvDate;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = pm.eablkybsjg.tvEndCardNumber;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new sopmlzcsov((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static sopmlzcsov ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_bank_card, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65979iobyxmoadg;
    }
}
