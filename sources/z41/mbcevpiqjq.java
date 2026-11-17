package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.legacy.presentation.view.myspar.MySparFeature;

/* JADX INFO: loaded from: classes5.dex */
public final class mbcevpiqjq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MySparFeature f128258iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MySparFeature f128259zoijcleaow;

    private mbcevpiqjq(MySparFeature mySparFeature, MySparFeature mySparFeature2) {
        this.f128258iobyxmoadg = mySparFeature;
        this.f128259zoijcleaow = mySparFeature2;
    }

    public static mbcevpiqjq iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MySparFeature mySparFeature = (MySparFeature) view;
        return new mbcevpiqjq(mySparFeature, mySparFeature);
    }

    public static mbcevpiqjq ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_my_spar_button_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MySparFeature getRoot() {
        return this.f128258iobyxmoadg;
    }
}
