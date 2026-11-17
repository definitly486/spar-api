package fr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final DatePicker f34893eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f34894gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f34895iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f34896ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f34897wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f34898zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout2, DatePicker datePicker, MaterialTextView materialTextView) {
        this.f34895iobyxmoadg = constraintLayout;
        this.f34898zoijcleaow = materialButton;
        this.f34896ppxfxbqfkf = materialButton2;
        this.f34897wkgbmnqykc = constraintLayout2;
        this.f34893eablkybsjg = datePicker;
        this.f34894gxszxtbevo = materialTextView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = br0.iobyxmoadg.btnCancel;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = br0.iobyxmoadg.btnOk;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i13 = br0.iobyxmoadg.datePicker;
                DatePicker datePicker = (DatePicker) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (datePicker != null) {
                    i13 = br0.iobyxmoadg.tvTitle;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        return new iobyxmoadg(constraintLayout, materialButton, materialButton2, constraintLayout, datePicker, materialTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static iobyxmoadg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(br0.zoijcleaow.dialog_spinner_datepicker_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f34895iobyxmoadg;
    }
}
