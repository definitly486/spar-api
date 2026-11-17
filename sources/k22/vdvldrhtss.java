package k22;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class vdvldrhtss implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53631iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f53632zoijcleaow;

    private vdvldrhtss(ConstraintLayout constraintLayout, MaterialTextView materialTextView) {
        this.f53631iobyxmoadg = constraintLayout;
        this.f53632zoijcleaow = materialTextView;
    }

    public static vdvldrhtss iobyxmoadg(View view) {
        int i13 = s12.zoijcleaow.tvMessage;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            return new vdvldrhtss((ConstraintLayout) view, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53631iobyxmoadg;
    }
}
