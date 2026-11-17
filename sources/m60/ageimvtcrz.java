package m60;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ageimvtcrz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65335iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f65336zoijcleaow;

    private ageimvtcrz(ConstraintLayout constraintLayout, MaterialTextView materialTextView) {
        this.f65335iobyxmoadg = constraintLayout;
        this.f65336zoijcleaow = materialTextView;
    }

    public static ageimvtcrz iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.tvMessage;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            return new ageimvtcrz((ConstraintLayout) view, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65335iobyxmoadg;
    }
}
