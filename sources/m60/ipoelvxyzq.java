package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ipoelvxyzq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f65602eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65603iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65604ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f65605wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageButton f65606zoijcleaow;

    private ipoelvxyzq(ConstraintLayout constraintLayout, ImageButton imageButton, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f65603iobyxmoadg = constraintLayout;
        this.f65606zoijcleaow = imageButton;
        this.f65604ppxfxbqfkf = appCompatImageView;
        this.f65605wkgbmnqykc = materialTextView;
        this.f65602eablkybsjg = materialTextView2;
    }

    public static ipoelvxyzq iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnClose;
        ImageButton imageButton = (ImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageButton != null) {
            i13 = pm.eablkybsjg.ivMail;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = pm.eablkybsjg.tvEmail;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = pm.eablkybsjg.tvMailDescription;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        return new ipoelvxyzq((ConstraintLayout) view, imageButton, appCompatImageView, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ipoelvxyzq ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.popup_digital_checks_mail, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65603iobyxmoadg;
    }
}
