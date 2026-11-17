package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private Set f12372oipsdeybqn;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private CharSequence[] f12373sflfametgt;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private CharSequence[] f12374zfvoamnweg;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12372oipsdeybqn = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.MultiSelectListPreference, i13, i14);
        this.f12373sflfametgt = i1.gtknphoqwx.ojitshcjhn(typedArrayObtainStyledAttributes, vdvldrhtss.MultiSelectListPreference_entries, vdvldrhtss.MultiSelectListPreference_android_entries);
        this.f12374zfvoamnweg = i1.gtknphoqwx.ojitshcjhn(typedArrayObtainStyledAttributes, vdvldrhtss.MultiSelectListPreference_entryValues, vdvldrhtss.MultiSelectListPreference_android_entryValues);
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence[] auzgnhcxok() {
        return this.f12373sflfametgt;
    }

    @Override // androidx.preference.Preference
    protected Object dsvhmnatus(TypedArray typedArray, int i13) {
        CharSequence[] textArray = typedArray.getTextArray(i13);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public Set dvvnrvtcbc() {
        return this.f12372oipsdeybqn;
    }

    public CharSequence[] iwxlajgraz() {
        return this.f12374zfvoamnweg;
    }

    @Override // androidx.preference.Preference
    protected void kegysxyocb(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.kegysxyocb(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.kegysxyocb(savedState.getSuperState());
        skhdrjzrfn(savedState.f12375zdlpuopuiu);
    }

    public void skhdrjzrfn(Set set) {
        this.f12372oipsdeybqn.clear();
        this.f12372oipsdeybqn.addAll(set);
        jlmebxxoox(set);
        lmojexxdyd();
    }

    @Override // androidx.preference.Preference
    protected Parcelable tzroggbefp() {
        Parcelable parcelableTzroggbefp = super.tzroggbefp();
        if (cdpycssgdh()) {
            return parcelableTzroggbefp;
        }
        SavedState savedState = new SavedState(parcelableTzroggbefp);
        savedState.f12375zdlpuopuiu = dvvnrvtcbc();
        return savedState;
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Set f12375zdlpuopuiu;

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
            int i13 = parcel.readInt();
            this.f12375zdlpuopuiu = new HashSet();
            String[] strArr = new String[i13];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f12375zdlpuopuiu, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f12375zdlpuopuiu.size());
            Set set = this.f12375zdlpuopuiu;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
