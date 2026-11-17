package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f127942iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RecyclerView f127943zoijcleaow;

    private e(View view, RecyclerView recyclerView) {
        this.f127942iobyxmoadg = view;
        this.f127943zoijcleaow = recyclerView;
    }

    public static e iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.rvDocuments;
        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (recyclerView != null) {
            return new e(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static e zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(vk0.eablkybsjg.view_special_banner_document_proloyalty, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f127942iobyxmoadg;
    }
}
