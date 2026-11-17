package cn0;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bn0.ppxfxbqfkf;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f20219iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final TextView f20220ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f20221wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f20222zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, MaterialButton materialButton, TextView textView, TextView textView2) {
        this.f20219iobyxmoadg = constraintLayout;
        this.f20222zoijcleaow = materialButton;
        this.f20220ppxfxbqfkf = textView;
        this.f20221wkgbmnqykc = textView2;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = ppxfxbqfkf.btnMain;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = ppxfxbqfkf.tvDescription;
            TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (textView != null) {
                i13 = ppxfxbqfkf.tvTitle;
                TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView2 != null) {
                    return new iobyxmoadg((ConstraintLayout) view, materialButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f20219iobyxmoadg;
    }
}
