package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.myspar.legacy.presentation.view.NotificationLayoutView;

/* JADX INFO: loaded from: classes4.dex */
public final class uwvvkdfqfp implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f66035iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final NotificationLayoutView f66036zoijcleaow;

    private uwvvkdfqfp(FrameLayout frameLayout, NotificationLayoutView notificationLayoutView) {
        this.f66035iobyxmoadg = frameLayout;
        this.f66036zoijcleaow = notificationLayoutView;
    }

    public static uwvvkdfqfp iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.nlNotifications;
        NotificationLayoutView notificationLayoutView = (NotificationLayoutView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (notificationLayoutView != null) {
            return new uwvvkdfqfp((FrameLayout) view, notificationLayoutView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static uwvvkdfqfp ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_notifications_page, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f66035iobyxmoadg;
    }
}
