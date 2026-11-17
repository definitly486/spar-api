package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class rlfsiqarku implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f128371eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128372iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128373ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f128374wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialDivider f128375zoijcleaow;

    private rlfsiqarku(ConstraintLayout constraintLayout, MaterialDivider materialDivider, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f128372iobyxmoadg = constraintLayout;
        this.f128375zoijcleaow = materialDivider;
        this.f128373ppxfxbqfkf = appCompatImageView;
        this.f128374wkgbmnqykc = materialTextView;
        this.f128371eablkybsjg = materialTextView2;
    }

    public static rlfsiqarku iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.dividerSavedCardQuestion;
        MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialDivider != null) {
            i13 = vk0.wkgbmnqykc.ivExpand;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = vk0.wkgbmnqykc.tvAnswer;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = vk0.wkgbmnqykc.tvQuestion;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        return new rlfsiqarku((ConstraintLayout) view, materialDivider, appCompatImageView, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static rlfsiqarku ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_saved_cards_question_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128372iobyxmoadg;
    }
}
