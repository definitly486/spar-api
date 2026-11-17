package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class rgvfuqvkyq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f128357eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f128358gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128359iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f128360ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialCardView f128361wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128362zoijcleaow;

    private rgvfuqvkyq(MaterialCardView materialCardView, MaterialButton materialButton, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f128359iobyxmoadg = materialCardView;
        this.f128362zoijcleaow = materialButton;
        this.f128360ppxfxbqfkf = constraintLayout;
        this.f128361wkgbmnqykc = materialCardView2;
        this.f128357eablkybsjg = materialTextView;
        this.f128358gxszxtbevo = materialTextView2;
    }

    public static rgvfuqvkyq iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnOk;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.f117483cl;
            ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (constraintLayout != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i13 = vk0.wkgbmnqykc.tvMessageSent;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = vk0.wkgbmnqykc.tvText;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        return new rgvfuqvkyq(materialCardView, materialButton, constraintLayout, materialCardView, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static rgvfuqvkyq ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.dialog_replacement_time_is_over_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128359iobyxmoadg;
    }
}
