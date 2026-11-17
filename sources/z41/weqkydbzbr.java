package z41;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class weqkydbzbr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128437iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f128438zoijcleaow;

    private weqkydbzbr(ConstraintLayout constraintLayout, MaterialTextView materialTextView) {
        this.f128437iobyxmoadg = constraintLayout;
        this.f128438zoijcleaow = materialTextView;
    }

    public static weqkydbzbr iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.tvMessage;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            return new weqkydbzbr((ConstraintLayout) view, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128437iobyxmoadg;
    }
}
