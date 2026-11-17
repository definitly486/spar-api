package c02;

import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f18223iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f18224ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f18225wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f18226zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f18223iobyxmoadg = constraintLayout;
        this.f18226zoijcleaow = materialButton;
        this.f18224ppxfxbqfkf = materialTextView;
        this.f18225wkgbmnqykc = materialTextView2;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = b02.iobyxmoadg.btnOk;
        MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = b02.iobyxmoadg.tvMessage;
            MaterialTextView materialTextView = (MaterialTextView) zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = b02.iobyxmoadg.tvTitle;
                MaterialTextView materialTextView2 = (MaterialTextView) zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    return new iobyxmoadg((ConstraintLayout) view, materialButton, materialTextView, materialTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static iobyxmoadg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(b02.zoijcleaow.dialog_rate_product_result, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f18223iobyxmoadg;
    }
}
