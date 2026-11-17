package z41;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class lrnfpwlwnk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128253iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f128254ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f128255zoijcleaow;

    private lrnfpwlwnk(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialTextView materialTextView) {
        this.f128253iobyxmoadg = constraintLayout;
        this.f128255zoijcleaow = appCompatImageView;
        this.f128254ppxfxbqfkf = materialTextView;
    }

    public static lrnfpwlwnk iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.ivWarning;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = vk0.wkgbmnqykc.tvTimeLeft;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new lrnfpwlwnk((ConstraintLayout) view, appCompatImageView, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128253iobyxmoadg;
    }
}
