package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f65834iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RecyclerView f65835zoijcleaow;

    private o(View view, RecyclerView recyclerView) {
        this.f65834iobyxmoadg = view;
        this.f65835zoijcleaow = recyclerView;
    }

    public static o iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.rvNotification;
        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (recyclerView != null) {
            return new o(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static o zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_notifications, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f65834iobyxmoadg;
    }
}
