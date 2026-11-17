package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class zdlpuopuiu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TimePicker f128562eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f128563gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128564iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f128565lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f128566ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f128567wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128568zoijcleaow;

    private zdlpuopuiu(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout2, TimePicker timePicker, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f128564iobyxmoadg = constraintLayout;
        this.f128568zoijcleaow = materialButton;
        this.f128566ppxfxbqfkf = materialButton2;
        this.f128567wkgbmnqykc = constraintLayout2;
        this.f128562eablkybsjg = timePicker;
        this.f128563gxszxtbevo = materialTextView;
        this.f128565lqeggnwhkg = materialTextView2;
    }

    public static zdlpuopuiu iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnCancel;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.btnOk;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i13 = vk0.wkgbmnqykc.timePicker;
                TimePicker timePicker = (TimePicker) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (timePicker != null) {
                    i13 = vk0.wkgbmnqykc.tvErrorMessage;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = vk0.wkgbmnqykc.tvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new zdlpuopuiu(constraintLayout, materialButton, materialButton2, constraintLayout, timePicker, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zdlpuopuiu ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.dialog_spinner_timepicker_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128564iobyxmoadg;
    }
}
