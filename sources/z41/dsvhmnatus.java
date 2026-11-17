package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class dsvhmnatus implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f127913eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f127914gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f127915iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f127916ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f127917wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f127918zoijcleaow;

    private dsvhmnatus(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f127915iobyxmoadg = constraintLayout;
        this.f127918zoijcleaow = appCompatImageView;
        this.f127916ppxfxbqfkf = appCompatImageView2;
        this.f127917wkgbmnqykc = appCompatImageView3;
        this.f127913eablkybsjg = materialTextView;
        this.f127914gxszxtbevo = materialTextView2;
    }

    public static dsvhmnatus iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.ivDelete;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = vk0.wkgbmnqykc.ivDots;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView2 != null) {
                i13 = vk0.wkgbmnqykc.ivLogo;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView3 != null) {
                    i13 = vk0.wkgbmnqykc.tvDate;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = vk0.wkgbmnqykc.tvEndCardNumber;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new dsvhmnatus((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static dsvhmnatus ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_bank_card_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f127915iobyxmoadg;
    }
}
