package wl1;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f120202iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final LinearLayout f120203ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f120204wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f120205zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, MaterialButton materialButton, LinearLayout linearLayout2, MaterialTextView materialTextView) {
        this.f120202iobyxmoadg = linearLayout;
        this.f120205zoijcleaow = materialButton;
        this.f120203ppxfxbqfkf = linearLayout2;
        this.f120204wkgbmnqykc = materialTextView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = vl1.iobyxmoadg.btnContinue;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i14 = vl1.iobyxmoadg.tvTitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i14);
            if (materialTextView != null) {
                return new zoijcleaow(linearLayout, materialButton, linearLayout, materialTextView);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120202iobyxmoadg;
    }
}
