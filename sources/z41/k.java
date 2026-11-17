package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128205iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f128206ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SwitchCompat f128207zoijcleaow;

    private k(ConstraintLayout constraintLayout, SwitchCompat switchCompat, MaterialTextView materialTextView) {
        this.f128205iobyxmoadg = constraintLayout;
        this.f128207zoijcleaow = switchCompat;
        this.f128206ppxfxbqfkf = materialTextView;
    }

    public static k iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.checked_sw;
        SwitchCompat switchCompat = (SwitchCompat) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (switchCompat != null) {
            i13 = vk0.wkgbmnqykc.tvTitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new k((ConstraintLayout) view, switchCompat, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static k ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.view_switchable_text_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128205iobyxmoadg;
    }
}
