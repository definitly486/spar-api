package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private final iobyxmoadg f12340ydmasvzmpa;

    private class iobyxmoadg implements CompoundButton.OnCheckedChangeListener {
        iobyxmoadg() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
            if (CheckBoxPreference.this.iobyxmoadg(Boolean.valueOf(z13))) {
                CheckBoxPreference.this.zeieaojujs(z13);
            } else {
                compoundButton.setChecked(!z13);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    private void dvvnrvtcbc(View view) {
        if (((AccessibilityManager) lqeggnwhkg().getSystemService("accessibility")).isEnabled()) {
            iwxlajgraz(view.findViewById(R.id.checkbox));
            uawqvzlxes(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void iwxlajgraz(View view) {
        boolean z13 = view instanceof CompoundButton;
        if (z13) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12485metgxyhuhe);
        }
        if (z13) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f12340ydmasvzmpa);
        }
    }

    @Override // androidx.preference.Preference
    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        super.hcddaimhww(nufgyqmvbuVar);
        iwxlajgraz(nufgyqmvbuVar.zoijcleaow(R.id.checkbox));
        auzgnhcxok(nufgyqmvbuVar);
    }

    @Override // androidx.preference.Preference
    protected void ntlheqmsrt(View view) {
        super.ntlheqmsrt(view);
        dvvnrvtcbc(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12340ydmasvzmpa = new iobyxmoadg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.CheckBoxPreference, i13, i14);
        roivzttewh(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.CheckBoxPreference_summaryOn, vdvldrhtss.CheckBoxPreference_android_summaryOn));
        tbqsvytpvh(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.CheckBoxPreference_summaryOff, vdvldrhtss.CheckBoxPreference_android_summaryOff));
        nuxfzjnpeb(i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.CheckBoxPreference_disableDependentsState, vdvldrhtss.CheckBoxPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle));
    }
}
