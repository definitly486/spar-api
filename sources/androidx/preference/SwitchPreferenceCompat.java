package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private CharSequence f12480sflfametgt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private final iobyxmoadg f12481ydmasvzmpa;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private CharSequence f12482zfvoamnweg;

    private class iobyxmoadg implements CompoundButton.OnCheckedChangeListener {
        iobyxmoadg() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
            if (SwitchPreferenceCompat.this.iobyxmoadg(Boolean.valueOf(z13))) {
                SwitchPreferenceCompat.this.zeieaojujs(z13);
            } else {
                compoundButton.setChecked(!z13);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12481ydmasvzmpa = new iobyxmoadg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.SwitchPreferenceCompat, i13, i14);
        roivzttewh(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreferenceCompat_summaryOn, vdvldrhtss.SwitchPreferenceCompat_android_summaryOn));
        tbqsvytpvh(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreferenceCompat_summaryOff, vdvldrhtss.SwitchPreferenceCompat_android_summaryOff));
        dvvnrvtcbc(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreferenceCompat_switchTextOn, vdvldrhtss.SwitchPreferenceCompat_android_switchTextOn));
        iwxlajgraz(i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreferenceCompat_switchTextOff, vdvldrhtss.SwitchPreferenceCompat_android_switchTextOff));
        nuxfzjnpeb(i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.SwitchPreferenceCompat_disableDependentsState, vdvldrhtss.SwitchPreferenceCompat_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void igdgnonuha(View view) {
        if (((AccessibilityManager) lqeggnwhkg().getSystemService("accessibility")).isEnabled()) {
            skhdrjzrfn(view.findViewById(draadjrbmk.switchWidget));
            uawqvzlxes(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void skhdrjzrfn(View view) {
        boolean z13 = view instanceof SwitchCompat;
        if (z13) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12485metgxyhuhe);
        }
        if (z13) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f12480sflfametgt);
            switchCompat.setTextOff(this.f12482zfvoamnweg);
            switchCompat.setOnCheckedChangeListener(this.f12481ydmasvzmpa);
        }
    }

    public void dvvnrvtcbc(CharSequence charSequence) {
        this.f12480sflfametgt = charSequence;
        lmojexxdyd();
    }

    @Override // androidx.preference.Preference
    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        super.hcddaimhww(nufgyqmvbuVar);
        skhdrjzrfn(nufgyqmvbuVar.zoijcleaow(draadjrbmk.switchWidget));
        auzgnhcxok(nufgyqmvbuVar);
    }

    public void iwxlajgraz(CharSequence charSequence) {
        this.f12482zfvoamnweg = charSequence;
        lmojexxdyd();
    }

    @Override // androidx.preference.Preference
    protected void ntlheqmsrt(View view) {
        super.ntlheqmsrt(view);
        igdgnonuha(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dxjokdxxww.switchPreferenceCompatStyle);
    }
}
