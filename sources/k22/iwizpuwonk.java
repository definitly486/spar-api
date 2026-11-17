package k22;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ScanWindowView;

/* JADX INFO: loaded from: classes6.dex */
public final class iwizpuwonk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53579iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f53580ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ScanWindowView f53581zoijcleaow;

    private iwizpuwonk(ConstraintLayout constraintLayout, ScanWindowView scanWindowView, MaterialTextView materialTextView) {
        this.f53579iobyxmoadg = constraintLayout;
        this.f53581zoijcleaow = scanWindowView;
        this.f53580ppxfxbqfkf = materialTextView;
    }

    public static iwizpuwonk iobyxmoadg(View view) {
        int i13 = s12.zoijcleaow.scanWindowView;
        ScanWindowView scanWindowView = (ScanWindowView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (scanWindowView != null) {
            i13 = s12.zoijcleaow.tvTitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new iwizpuwonk((ConstraintLayout) view, scanWindowView, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53579iobyxmoadg;
    }
}
