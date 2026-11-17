package yi1;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f125426iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f125427ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f125428wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f125429zoijcleaow;

    private iobyxmoadg(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, View view) {
        this.f125426iobyxmoadg = linearLayout;
        this.f125429zoijcleaow = materialButton;
        this.f125427ppxfxbqfkf = materialButton2;
        this.f125428wkgbmnqykc = view;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = ti1.eablkybsjg.btnDelete;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = ti1.eablkybsjg.btnMove;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = ti1.eablkybsjg.vCurtain))) != null) {
                return new iobyxmoadg((LinearLayout) view, materialButton, materialButton2, viewIobyxmoadg);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f125426iobyxmoadg;
    }
}
