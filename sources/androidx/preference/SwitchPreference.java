package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private CharSequence f12476sflfametgt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private final iobyxmoadg f12477ydmasvzmpa;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private CharSequence f12478zfvoamnweg;

    private class iobyxmoadg implements CompoundButton.OnCheckedChangeListener {
        iobyxmoadg() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
            if (SwitchPreference.this.iobyxmoadg(Boolean.valueOf(z13))) {
                SwitchPreference.this.zeieaojujs(z13);
            } else {
                compoundButton.setChecked(!z13);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12477ydmasvzmpa = new iobyxmoadg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.SwitchPreference, i13, i14);
        roivzttewh(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreference_summaryOn, vdvldrhtss.SwitchPreference_android_summaryOn));
        tbqsvytpvh(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreference_summaryOff, vdvldrhtss.SwitchPreference_android_summaryOff));
        dvvnrvtcbc(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreference_switchTextOn, vdvldrhtss.SwitchPreference_android_switchTextOn));
        iwxlajgraz(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreference_switchTextOff, vdvldrhtss.SwitchPreference_android_switchTextOff));
        nuxfzjnpeb(i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreference_disableDependentsState, vdvldrhtss.SwitchPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void igdgnonuha(View view) {
        if (((AccessibilityManager) lqeggnwhkg().getSystemService("accessibility")).isEnabled()) {
            skhdrjzrfn(view.findViewById(R.id.switch_widget));
            uawqvzlxes(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void skhdrjzrfn(View view) {
        boolean z13 = view instanceof Switch;
        if (z13) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12485metgxyhuhe);
        }
        if (z13) {
            Switch r13 = (Switch) view;
            r13.setTextOn(this.f12476sflfametgt);
            r13.setTextOff(this.f12478zfvoamnweg);
            r13.setOnCheckedChangeListener(this.f12477ydmasvzmpa);
        }
    }

    public void dvvnrvtcbc(CharSequence charSequence) {
        this.f12476sflfametgt = charSequence;
        lmojexxdyd();
    }

    @Override // androidx.preference.Preference
    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        super.hcddaimhww(nufgyqmvbuVar);
        skhdrjzrfn(nufgyqmvbuVar.zoijcleaow(R.id.switch_widget));
        auzgnhcxok(nufgyqmvbuVar);
    }

    public void iwxlajgraz(CharSequence charSequence) {
        this.f12478zfvoamnweg = charSequence;
        lmojexxdyd();
    }

    @Override // androidx.preference.Preference
    protected void ntlheqmsrt(View view) {
        super.ntlheqmsrt(view);
        igdgnonuha(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.switchPreferenceStyle, R.attr.switchPreferenceStyle));
    }
}
