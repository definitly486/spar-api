package c81;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f19234eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f19235iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f19236ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f19237wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f19238zoijcleaow;

    private iobyxmoadg(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, View view, RecyclerView recyclerView) {
        this.f19235iobyxmoadg = linearLayout;
        this.f19238zoijcleaow = materialButton;
        this.f19236ppxfxbqfkf = materialButton2;
        this.f19237wkgbmnqykc = view;
        this.f19234eablkybsjg = recyclerView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = u71.wkgbmnqykc.buttonPrimary;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = u71.wkgbmnqykc.buttonSecondary;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = u71.wkgbmnqykc.curtain))) != null) {
                i13 = u71.wkgbmnqykc.recycler;
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
        return this.f19235iobyxmoadg;
    }
}
