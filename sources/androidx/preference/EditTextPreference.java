package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private String f12353sflfametgt;

    public interface iobyxmoadg {
    }

    public static final class zoijcleaow implements Preference.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static zoijcleaow f12355iobyxmoadg;

        private zoijcleaow() {
        }

        public static zoijcleaow zoijcleaow() {
            if (f12355iobyxmoadg == null) {
                f12355iobyxmoadg = new zoijcleaow();
            }
            return f12355iobyxmoadg;
        }

        @Override // androidx.preference.Preference.eablkybsjg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public CharSequence iobyxmoadg(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.iwxlajgraz()) ? editTextPreference.lqeggnwhkg().getString(ojitshcjhn.not_set) : editTextPreference.iwxlajgraz();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.EditTextPreference, i13, i14);
        int i15 = vdvldrhtss.EditTextPreference_useSimpleSummaryProvider;
        if (i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, i15, i15, false)) {
            ydmasvzmpa(zoijcleaow.zoijcleaow());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    iobyxmoadg auzgnhcxok() {
        return null;
    }

    @Override // androidx.preference.Preference
    protected Object dsvhmnatus(TypedArray typedArray, int i13) {
        return typedArray.getString(i13);
    }

    public void dvvnrvtcbc(String str) {
        boolean zOipsdeybqn = oipsdeybqn();
        this.f12353sflfametgt = str;
        crxdokpmqz(str);
        boolean zOipsdeybqn2 = oipsdeybqn();
        if (zOipsdeybqn2 != zOipsdeybqn) {
            wwaezpbzkn(zOipsdeybqn2);
        }
        lmojexxdyd();
    }

    public String iwxlajgraz() {
        return this.f12353sflfametgt;
    }

    @Override // androidx.preference.Preference
    protected void kegysxyocb(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.kegysxyocb(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.kegysxyocb(savedState.getSuperState());
        dvvnrvtcbc(savedState.f12354zdlpuopuiu);
    }

    @Override // androidx.preference.Preference
    public boolean oipsdeybqn() {
        return TextUtils.isEmpty(this.f12353sflfametgt) || super.oipsdeybqn();
    }

    @Override // androidx.preference.Preference
    protected Parcelable tzroggbefp() {
        Parcelable parcelableTzroggbefp = super.tzroggbefp();
        if (cdpycssgdh()) {
            return parcelableTzroggbefp;
        }
        SavedState savedState = new SavedState(parcelableTzroggbefp);
        savedState.f12354zdlpuopuiu = iwxlajgraz();
        return savedState;
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        String f12354zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f12354zdlpuopuiu = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f12354zdlpuopuiu);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.editTextPreferenceStyle, R.attr.editTextPreferenceStyle));
    }
}
