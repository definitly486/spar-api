package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private String f12361bfopjjpdmp;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private String f12362oipsdeybqn;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private boolean f12363opjhrmiecq;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private CharSequence[] f12364sflfametgt;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private CharSequence[] f12365zfvoamnweg;

    public static final class iobyxmoadg implements Preference.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static iobyxmoadg f12367iobyxmoadg;

        private iobyxmoadg() {
        }

        public static iobyxmoadg zoijcleaow() {
            if (f12367iobyxmoadg == null) {
                f12367iobyxmoadg = new iobyxmoadg();
            }
            return f12367iobyxmoadg;
        }

        @Override // androidx.preference.Preference.eablkybsjg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public CharSequence iobyxmoadg(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.dvvnrvtcbc()) ? listPreference.lqeggnwhkg().getString(ojitshcjhn.not_set) : listPreference.dvvnrvtcbc();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.ListPreference, i13, i14);
        this.f12364sflfametgt = i1.gtknphoqwx.ojitshcjhn(typedArrayObtainStyledAttributes, vdvldrhtss.ListPreference_entries, vdvldrhtss.ListPreference_android_entries);
        this.f12365zfvoamnweg = i1.gtknphoqwx.ojitshcjhn(typedArrayObtainStyledAttributes, vdvldrhtss.ListPreference_entryValues, vdvldrhtss.ListPreference_android_entryValues);
        int i15 = vdvldrhtss.ListPreference_useSimpleSummaryProvider;
        if (i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, i15, i15, false)) {
            ydmasvzmpa(iobyxmoadg.zoijcleaow());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, vdvldrhtss.Preference, i13, i14);
        this.f12361bfopjjpdmp = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes2, vdvldrhtss.Preference_summary, vdvldrhtss.Preference_android_summary);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int lxfrhoxuzk() {
        return auzgnhcxok(this.f12362oipsdeybqn);
    }

    public int auzgnhcxok(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f12365zfvoamnweg) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f12365zfvoamnweg[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference
    protected Object dsvhmnatus(TypedArray typedArray, int i13) {
        return typedArray.getString(i13);
    }

    public CharSequence dvvnrvtcbc() {
        CharSequence[] charSequenceArr;
        int iLxfrhoxuzk = lxfrhoxuzk();
        if (iLxfrhoxuzk < 0 || (charSequenceArr = this.f12364sflfametgt) == null) {
            return null;
        }
        return charSequenceArr[iLxfrhoxuzk];
    }

    public String igdgnonuha() {
        return this.f12362oipsdeybqn;
    }

    @Override // androidx.preference.Preference
    public CharSequence iwizpuwonk() {
        if (cqumvgiudr() != null) {
            return cqumvgiudr().iobyxmoadg(this);
        }
        CharSequence charSequenceDvvnrvtcbc = dvvnrvtcbc();
        CharSequence charSequenceIwizpuwonk = super.iwizpuwonk();
        String str = this.f12361bfopjjpdmp;
        if (str == null) {
            return charSequenceIwizpuwonk;
        }
        if (charSequenceDvvnrvtcbc == null) {
            charSequenceDvvnrvtcbc = "";
        }
        String str2 = String.format(str, charSequenceDvvnrvtcbc);
        if (TextUtils.equals(str2, charSequenceIwizpuwonk)) {
            return charSequenceIwizpuwonk;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    public CharSequence[] iwxlajgraz() {
        return this.f12364sflfametgt;
    }

    @Override // androidx.preference.Preference
    protected void kegysxyocb(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.kegysxyocb(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.kegysxyocb(savedState.getSuperState());
        wizcaqwiak(savedState.f12366zdlpuopuiu);
    }

    public CharSequence[] skhdrjzrfn() {
        return this.f12365zfvoamnweg;
    }

    @Override // androidx.preference.Preference
    protected Parcelable tzroggbefp() {
        Parcelable parcelableTzroggbefp = super.tzroggbefp();
        if (cdpycssgdh()) {
            return parcelableTzroggbefp;
        }
        SavedState savedState = new SavedState(parcelableTzroggbefp);
        savedState.f12366zdlpuopuiu = igdgnonuha();
        return savedState;
    }

    public void wizcaqwiak(String str) {
        boolean zEquals = TextUtils.equals(this.f12362oipsdeybqn, str);
        if (zEquals && this.f12363opjhrmiecq) {
            return;
        }
        this.f12362oipsdeybqn = str;
        this.f12363opjhrmiecq = true;
        crxdokpmqz(str);
        if (zEquals) {
            return;
        }
        lmojexxdyd();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        String f12366zdlpuopuiu;

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
            this.f12366zdlpuopuiu = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f12366zdlpuopuiu);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
