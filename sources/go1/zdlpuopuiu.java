package go1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class zdlpuopuiu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f38117eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f38118gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38119iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f38120ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f38121wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageButton f38122zoijcleaow;

    private zdlpuopuiu(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, Guideline guideline, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f38119iobyxmoadg = constraintLayout;
        this.f38122zoijcleaow = appCompatImageButton;
        this.f38120ppxfxbqfkf = guideline;
        this.f38121wkgbmnqykc = appCompatImageView;
        this.f38117eablkybsjg = materialTextView;
        this.f38118gxszxtbevo = materialTextView2;
    }

    public static zdlpuopuiu iobyxmoadg(View view) {
        int i13 = on1.zoijcleaow.btnBack;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageButton != null) {
            i13 = on1.zoijcleaow.glEnd;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = on1.zoijcleaow.ivSwipe;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView != null) {
                    i13 = on1.zoijcleaow.tvDescription;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = on1.zoijcleaow.tvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new zdlpuopuiu((ConstraintLayout) view, appCompatImageButton, guideline, appCompatImageView, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zdlpuopuiu ppxfxbqfkf(LayoutInflater layoutInflater) {
        return wkgbmnqykc(layoutInflater, null, false);
    }

    public static zdlpuopuiu wkgbmnqykc(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(on1.ppxfxbqfkf.popup_window_scan_go_tutorial_option_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38119iobyxmoadg;
    }
}
