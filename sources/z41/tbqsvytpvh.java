package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class tbqsvytpvh implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f128401eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128402iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128403ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f128404wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f128405zoijcleaow;

    private tbqsvytpvh(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f128402iobyxmoadg = constraintLayout;
        this.f128405zoijcleaow = appCompatImageView;
        this.f128403ppxfxbqfkf = appCompatImageView2;
        this.f128404wkgbmnqykc = materialTextView;
        this.f128401eablkybsjg = materialTextView2;
    }

    public static tbqsvytpvh iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = vk0.wkgbmnqykc.ivIcon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView2 != null) {
                i13 = vk0.wkgbmnqykc.tvDescription;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = vk0.wkgbmnqykc.tvTitle;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        return new tbqsvytpvh((ConstraintLayout) view, appCompatImageView, appCompatImageView2, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static tbqsvytpvh ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.popup_sticker_promotion_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128402iobyxmoadg;
    }
}
