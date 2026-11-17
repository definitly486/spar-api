package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f127818eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f127819gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f127820iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f127821ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialCardView f127822wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f127823zoijcleaow;

    private agtfadlqog(MaterialCardView materialCardView, MaterialButton materialButton, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f127820iobyxmoadg = materialCardView;
        this.f127823zoijcleaow = materialButton;
        this.f127821ppxfxbqfkf = constraintLayout;
        this.f127822wkgbmnqykc = materialCardView2;
        this.f127818eablkybsjg = materialTextView;
        this.f127819gxszxtbevo = materialTextView2;
    }

    public static agtfadlqog iobyxmoadg(View view) {
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
                        return new agtfadlqog(materialCardView, materialButton, constraintLayout, materialCardView, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static agtfadlqog ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.dialog_registration_form_sent_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f127820iobyxmoadg;
    }
}
