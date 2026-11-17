package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f66098eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f66099iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f66100ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f66101wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RecyclerView f66102zoijcleaow;

    private x(View view, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f66099iobyxmoadg = view;
        this.f66102zoijcleaow = recyclerView;
        this.f66100ppxfxbqfkf = materialTextView;
        this.f66101wkgbmnqykc = materialTextView2;
        this.f66098eablkybsjg = materialTextView3;
    }

    public static x iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.recycler;
        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (recyclerView != null) {
            i13 = pm.eablkybsjg.tvCounter;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = pm.eablkybsjg.tvDescription;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    i13 = pm.eablkybsjg.tvPromosTitle;
                    MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView3 != null) {
                        return new x(view, recyclerView, materialTextView, materialTextView2, materialTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static x zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_promos, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f66099iobyxmoadg;
    }
}
