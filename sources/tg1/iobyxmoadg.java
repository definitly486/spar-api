package tg1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import sg1.eablkybsjg;
import sg1.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f110473eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f110474gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f110475iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f110476ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialCardView f110477wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f110478zoijcleaow;

    private iobyxmoadg(MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, MaterialCardView materialCardView2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f110475iobyxmoadg = materialCardView;
        this.f110478zoijcleaow = materialButton;
        this.f110476ppxfxbqfkf = materialButton2;
        this.f110477wkgbmnqykc = materialCardView2;
        this.f110473eablkybsjg = materialTextView;
        this.f110474gxszxtbevo = materialTextView2;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = eablkybsjg.btnClose;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = eablkybsjg.btnStay;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i13 = eablkybsjg.tvMessage;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = eablkybsjg.tvTitle;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        return new iobyxmoadg(materialCardView, materialButton, materialButton2, materialCardView, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static iobyxmoadg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(gxszxtbevo.dialog_change_payment_variant_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f110475iobyxmoadg;
    }
}
