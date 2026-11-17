package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.legacy.presentation.view.myspar.MySparFeature;

/* JADX INFO: loaded from: classes4.dex */
public final class ikoacuggdj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MySparFeature f65575iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MySparFeature f65576zoijcleaow;

    private ikoacuggdj(MySparFeature mySparFeature, MySparFeature mySparFeature2) {
        this.f65575iobyxmoadg = mySparFeature;
        this.f65576zoijcleaow = mySparFeature2;
    }

    public static ikoacuggdj iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MySparFeature mySparFeature = (MySparFeature) view;
        return new ikoacuggdj(mySparFeature, mySparFeature);
    }

    public static ikoacuggdj ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_my_spar_button, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MySparFeature getRoot() {
        return this.f65575iobyxmoadg;
    }
}
