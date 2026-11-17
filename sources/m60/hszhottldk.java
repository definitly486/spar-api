package m60;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class hszhottldk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f65563iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f65564ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FrameLayout f65565zoijcleaow;

    private hszhottldk(FrameLayout frameLayout, FrameLayout frameLayout2, MaterialTextView materialTextView) {
        this.f65563iobyxmoadg = frameLayout;
        this.f65565zoijcleaow = frameLayout2;
        this.f65564ppxfxbqfkf = materialTextView;
    }

    public static hszhottldk iobyxmoadg(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i13 = pm.eablkybsjg.tvWarning;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            return new hszhottldk(frameLayout, frameLayout, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f65563iobyxmoadg;
    }
}
