package k22;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53628iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f53629ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f53630zoijcleaow;

    private rgvfuqvkyq(ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f53628iobyxmoadg = constraintLayout;
        this.f53630zoijcleaow = materialTextView;
        this.f53629ppxfxbqfkf = materialTextView2;
    }

    public static rgvfuqvkyq iobyxmoadg(View view) {
        int i13 = s12.zoijcleaow.tvHeader;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            i13 = s12.zoijcleaow.tvMessage;
            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView2 != null) {
                return new rgvfuqvkyq((ConstraintLayout) view, materialTextView, materialTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53628iobyxmoadg;
    }
}
