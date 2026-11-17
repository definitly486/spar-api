package go1;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class vdvldrhtss implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38098iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f38099zoijcleaow;

    private vdvldrhtss(ConstraintLayout constraintLayout, MaterialTextView materialTextView) {
        this.f38098iobyxmoadg = constraintLayout;
        this.f38099zoijcleaow = materialTextView;
    }

    public static vdvldrhtss iobyxmoadg(View view) {
        int i13 = on1.zoijcleaow.tvMessage;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            return new vdvldrhtss((ConstraintLayout) view, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38098iobyxmoadg;
    }
}
