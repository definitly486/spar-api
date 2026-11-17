package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private boolean f12458oipsdeybqn;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.preferenceScreenStyle, R.attr.preferenceScreenStyle));
        this.f12458oipsdeybqn = true;
    }

    public boolean dvvnrvtcbc() {
        return this.f12458oipsdeybqn;
    }

    @Override // androidx.preference.Preference
    protected void jpowsppfya() {
        gxszxtbevo.zoijcleaow zoijcleaowVarWkgbmnqykc;
        if (draadjrbmk() != null || btonecajqb() != null || roivzttewh() == 0 || (zoijcleaowVarWkgbmnqykc = jyumaefscl().wkgbmnqykc()) == null) {
            return;
        }
        zoijcleaowVarWkgbmnqykc.draadjrbmk(this);
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean uawqvzlxes() {
        return false;
    }
}
