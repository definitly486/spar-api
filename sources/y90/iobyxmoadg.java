package y90;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f124204eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f124205iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f124206ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f124207wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f124208zoijcleaow;

    private iobyxmoadg(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, View view, RecyclerView recyclerView) {
        this.f124205iobyxmoadg = linearLayout;
        this.f124208zoijcleaow = materialButton;
        this.f124206ppxfxbqfkf = materialButton2;
        this.f124207wkgbmnqykc = view;
        this.f124204eablkybsjg = recyclerView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = q90.wkgbmnqykc.buttonPrimary;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = q90.wkgbmnqykc.buttonSecondary;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = q90.wkgbmnqykc.curtain))) != null) {
                i13 = q90.wkgbmnqykc.recycler;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    return new iobyxmoadg((LinearLayout) view, materialButton, materialButton2, viewIobyxmoadg, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f124205iobyxmoadg;
    }
}
