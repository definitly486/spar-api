package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class czzsidtyhn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f65420eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f65421gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65422iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final h f65423ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f65424wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FrameLayout f65425zoijcleaow;

    private czzsidtyhn(ConstraintLayout constraintLayout, FrameLayout frameLayout, h hVar, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f65422iobyxmoadg = constraintLayout;
        this.f65425zoijcleaow = frameLayout;
        this.f65423ppxfxbqfkf = hVar;
        this.f65424wkgbmnqykc = materialTextView;
        this.f65420eablkybsjg = materialTextView2;
        this.f65421gxszxtbevo = materialTextView3;
    }

    public static czzsidtyhn iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.flCopyPromoCode;
        FrameLayout frameLayout = (FrameLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (frameLayout != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.ivCopyPromoCode))) != null) {
            h hVarIobyxmoadg = h.iobyxmoadg(viewIobyxmoadg);
            i13 = pm.eablkybsjg.tvBody;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = pm.eablkybsjg.tvDateTime;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    i13 = pm.eablkybsjg.tvTitle;
                    MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView3 != null) {
                        return new czzsidtyhn((ConstraintLayout) view, frameLayout, hVarIobyxmoadg, materialTextView, materialTextView2, materialTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static czzsidtyhn ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_notification, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65422iobyxmoadg;
    }
}
