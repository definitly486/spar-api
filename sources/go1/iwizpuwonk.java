package go1;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.ScanWindowView;

/* JADX INFO: loaded from: classes6.dex */
public final class iwizpuwonk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38046iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f38047ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ScanWindowView f38048zoijcleaow;

    private iwizpuwonk(ConstraintLayout constraintLayout, ScanWindowView scanWindowView, MaterialTextView materialTextView) {
        this.f38046iobyxmoadg = constraintLayout;
        this.f38048zoijcleaow = scanWindowView;
        this.f38047ppxfxbqfkf = materialTextView;
    }

    public static iwizpuwonk iobyxmoadg(View view) {
        int i13 = on1.zoijcleaow.scanWindowView;
        ScanWindowView scanWindowView = (ScanWindowView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (scanWindowView != null) {
            i13 = on1.zoijcleaow.tvTitle;
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
        return this.f38046iobyxmoadg;
    }
}
