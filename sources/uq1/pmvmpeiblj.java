package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class pmvmpeiblj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f114195iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RecyclerView f114196zoijcleaow;

    private pmvmpeiblj(View view, RecyclerView recyclerView) {
        this.f114195iobyxmoadg = view;
        this.f114196zoijcleaow = recyclerView;
    }

    public static pmvmpeiblj iobyxmoadg(View view) {
        int i13 = mq1.iobyxmoadg.rvServices;
        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (recyclerView != null) {
            return new pmvmpeiblj(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static pmvmpeiblj zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(mq1.zoijcleaow.view_special_banner_shop_services_proloyalty, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f114195iobyxmoadg;
    }
}
