package cn1;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f20236iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f20237ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f20238wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RecyclerView f20239zoijcleaow;

    private ppxfxbqfkf(LinearLayout linearLayout, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f20236iobyxmoadg = linearLayout;
        this.f20239zoijcleaow = recyclerView;
        this.f20237ppxfxbqfkf = materialTextView;
        this.f20238wkgbmnqykc = materialTextView2;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = bn1.iobyxmoadg.rvBankingApps;
        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (recyclerView != null) {
            i13 = bn1.iobyxmoadg.tvMessage;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = bn1.iobyxmoadg.tvTitle;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    return new ppxfxbqfkf((LinearLayout) view, recyclerView, materialTextView, materialTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f20236iobyxmoadg;
    }
}
