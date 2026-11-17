package k22;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class jyumaefscl implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53582iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageButton f53583ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f53584wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f53585zoijcleaow;

    private jyumaefscl(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, MaterialTextView materialTextView) {
        this.f53582iobyxmoadg = constraintLayout;
        this.f53585zoijcleaow = materialButton;
        this.f53583ppxfxbqfkf = appCompatImageButton;
        this.f53584wkgbmnqykc = materialTextView;
    }

    public static jyumaefscl iobyxmoadg(View view) {
        int i13 = s12.zoijcleaow.btnMyPurchases;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = s12.zoijcleaow.btnToggleFlash;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageButton != null) {
                i13 = s12.zoijcleaow.tvWelcome;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    return new jyumaefscl((ConstraintLayout) view, materialButton, appCompatImageButton, materialTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53582iobyxmoadg;
    }
}
