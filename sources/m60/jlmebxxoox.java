package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;

/* JADX INFO: loaded from: classes4.dex */
public final class jlmebxxoox implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AppCompatCheckBox f65653iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatCheckBox f65654zoijcleaow;

    private jlmebxxoox(AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2) {
        this.f65653iobyxmoadg = appCompatCheckBox;
        this.f65654zoijcleaow = appCompatCheckBox2;
    }

    public static jlmebxxoox iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view;
        return new jlmebxxoox(appCompatCheckBox, appCompatCheckBox);
    }

    public static jlmebxxoox ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_filter, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public AppCompatCheckBox getRoot() {
        return this.f65653iobyxmoadg;
    }
}
