package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65570iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f65571ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SwitchCompat f65572zoijcleaow;

    private i0(ConstraintLayout constraintLayout, SwitchCompat switchCompat, MaterialTextView materialTextView) {
        this.f65570iobyxmoadg = constraintLayout;
        this.f65572zoijcleaow = switchCompat;
        this.f65571ppxfxbqfkf = materialTextView;
    }

    public static i0 iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.checked_sw;
        SwitchCompat switchCompat = (SwitchCompat) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (switchCompat != null) {
            i13 = pm.eablkybsjg.tvTitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new i0((ConstraintLayout) view, switchCompat, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static i0 ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_switchable_text, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65570iobyxmoadg;
    }
}
