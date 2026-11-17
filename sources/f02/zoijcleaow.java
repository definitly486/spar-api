package f02;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f32540iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final LinearLayout f32541ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f32542wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f32543zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, MaterialButton materialButton, LinearLayout linearLayout2, MaterialTextView materialTextView) {
        this.f32540iobyxmoadg = linearLayout;
        this.f32543zoijcleaow = materialButton;
        this.f32541ppxfxbqfkf = linearLayout2;
        this.f32542wkgbmnqykc = materialTextView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = e02.iobyxmoadg.btnContinue;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i14 = e02.iobyxmoadg.tvTitle;
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
        return this.f32540iobyxmoadg;
    }
}
