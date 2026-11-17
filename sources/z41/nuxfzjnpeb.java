package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class nuxfzjnpeb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f128284eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f128285gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128286iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f128287lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f128288ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f128289wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialCardView f128290zoijcleaow;

    private nuxfzjnpeb(MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f128286iobyxmoadg = materialCardView;
        this.f128290zoijcleaow = materialCardView2;
        this.f128288ppxfxbqfkf = materialButton;
        this.f128289wkgbmnqykc = materialButton2;
        this.f128284eablkybsjg = materialButton3;
        this.f128285gxszxtbevo = materialTextView;
        this.f128287lqeggnwhkg = materialTextView2;
    }

    public static nuxfzjnpeb iobyxmoadg(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i13 = vk0.wkgbmnqykc.negativeButton;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.neutralButton;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null) {
                i13 = vk0.wkgbmnqykc.positiveButton;
                MaterialButton materialButton3 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton3 != null) {
                    i13 = vk0.wkgbmnqykc.tvMessage;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = vk0.wkgbmnqykc.tvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new nuxfzjnpeb(materialCardView, materialCardView, materialButton, materialButton2, materialButton3, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static nuxfzjnpeb ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.popup_order_edit_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128286iobyxmoadg;
    }
}
