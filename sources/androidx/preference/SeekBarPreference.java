package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    boolean f12459bfopjjpdmp;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private int f12460czzsidtyhn;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private final View.OnKeyListener f12461iyctptxqzt;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    int f12462metgxyhuhe;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private boolean f12463oipsdeybqn;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f12464opjhrmiecq;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    int f12465rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private TextView f12466sflfametgt;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private int f12467uwvvkdfqfp;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    SeekBar f12468ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    boolean f12469yfnezrywwk;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    boolean f12470zfvoamnweg;

    class iobyxmoadg implements SeekBar.OnSeekBarChangeListener {
        iobyxmoadg() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i13, boolean z13) {
            if (z13) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f12459bfopjjpdmp || !seekBarPreference.f12469yfnezrywwk) {
                    seekBarPreference.tbqsvytpvh(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.roivzttewh(i13 + seekBarPreference2.f12465rlfsiqarku);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f12469yfnezrywwk = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f12469yfnezrywwk = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f12465rlfsiqarku != seekBarPreference.f12462metgxyhuhe) {
                seekBarPreference.tbqsvytpvh(seekBar);
            }
        }
    }

    class zoijcleaow implements View.OnKeyListener {
        zoijcleaow() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i13, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f12470zfvoamnweg && (i13 == 21 || i13 == 22)) || i13 == 23 || i13 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f12468ydmasvzmpa;
            if (seekBar != null) {
                return seekBar.onKeyDown(i13, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12464opjhrmiecq = new iobyxmoadg();
        this.f12461iyctptxqzt = new zoijcleaow();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.SeekBarPreference, i13, i14);
        this.f12465rlfsiqarku = typedArrayObtainStyledAttributes.getInt(vdvldrhtss.SeekBarPreference_min, 0);
        lrnfpwlwnk(typedArrayObtainStyledAttributes.getInt(vdvldrhtss.SeekBarPreference_android_max, 100));
        zeieaojujs(typedArrayObtainStyledAttributes.getInt(vdvldrhtss.SeekBarPreference_seekBarIncrement, 0));
        this.f12470zfvoamnweg = typedArrayObtainStyledAttributes.getBoolean(vdvldrhtss.SeekBarPreference_adjustable, true);
        this.f12463oipsdeybqn = typedArrayObtainStyledAttributes.getBoolean(vdvldrhtss.SeekBarPreference_showSeekBarValue, false);
        this.f12459bfopjjpdmp = typedArrayObtainStyledAttributes.getBoolean(vdvldrhtss.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void nuxfzjnpeb(int i13, boolean z13) {
        int i14 = this.f12465rlfsiqarku;
        if (i13 < i14) {
            i13 = i14;
        }
        int i15 = this.f12460czzsidtyhn;
        if (i13 > i15) {
            i13 = i15;
        }
        if (i13 != this.f12462metgxyhuhe) {
            this.f12462metgxyhuhe = i13;
            roivzttewh(i13);
            sopmlzcsov(i13);
            if (z13) {
                lmojexxdyd();
            }
        }
    }

    @Override // androidx.preference.Preference
    protected Object dsvhmnatus(TypedArray typedArray, int i13) {
        return Integer.valueOf(typedArray.getInt(i13, 0));
    }

    @Override // androidx.preference.Preference
    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        super.hcddaimhww(nufgyqmvbuVar);
        nufgyqmvbuVar.itemView.setOnKeyListener(this.f12461iyctptxqzt);
        this.f12468ydmasvzmpa = (SeekBar) nufgyqmvbuVar.zoijcleaow(draadjrbmk.seekbar);
        TextView textView = (TextView) nufgyqmvbuVar.zoijcleaow(draadjrbmk.seekbar_value);
        this.f12466sflfametgt = textView;
        if (this.f12463oipsdeybqn) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f12466sflfametgt = null;
        }
        SeekBar seekBar = this.f12468ydmasvzmpa;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f12464opjhrmiecq);
        this.f12468ydmasvzmpa.setMax(this.f12460czzsidtyhn - this.f12465rlfsiqarku);
        int i13 = this.f12467uwvvkdfqfp;
        if (i13 != 0) {
            this.f12468ydmasvzmpa.setKeyProgressIncrement(i13);
        } else {
            this.f12467uwvvkdfqfp = this.f12468ydmasvzmpa.getKeyProgressIncrement();
        }
        this.f12468ydmasvzmpa.setProgress(this.f12462metgxyhuhe - this.f12465rlfsiqarku);
        roivzttewh(this.f12462metgxyhuhe);
        this.f12468ydmasvzmpa.setEnabled(istkbnxepw());
    }

    @Override // androidx.preference.Preference
    protected void kegysxyocb(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.kegysxyocb(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.kegysxyocb(savedState.getSuperState());
        this.f12462metgxyhuhe = savedState.f12473zdlpuopuiu;
        this.f12465rlfsiqarku = savedState.f12472yggfygwlhe;
        this.f12460czzsidtyhn = savedState.f12471jyumaefscl;
        lmojexxdyd();
    }

    public final void lrnfpwlwnk(int i13) {
        int i14 = this.f12465rlfsiqarku;
        if (i13 < i14) {
            i13 = i14;
        }
        if (i13 != this.f12460czzsidtyhn) {
            this.f12460czzsidtyhn = i13;
            lmojexxdyd();
        }
    }

    void roivzttewh(int i13) {
        TextView textView = this.f12466sflfametgt;
        if (textView != null) {
            textView.setText(String.valueOf(i13));
        }
    }

    void tbqsvytpvh(SeekBar seekBar) {
        int progress = this.f12465rlfsiqarku + seekBar.getProgress();
        if (progress != this.f12462metgxyhuhe) {
            if (iobyxmoadg(Integer.valueOf(progress))) {
                nuxfzjnpeb(progress, false);
            } else {
                seekBar.setProgress(this.f12462metgxyhuhe - this.f12465rlfsiqarku);
                roivzttewh(this.f12462metgxyhuhe);
            }
        }
    }

    @Override // androidx.preference.Preference
    protected Parcelable tzroggbefp() {
        Parcelable parcelableTzroggbefp = super.tzroggbefp();
        if (cdpycssgdh()) {
            return parcelableTzroggbefp;
        }
        SavedState savedState = new SavedState(parcelableTzroggbefp);
        savedState.f12473zdlpuopuiu = this.f12462metgxyhuhe;
        savedState.f12472yggfygwlhe = this.f12465rlfsiqarku;
        savedState.f12471jyumaefscl = this.f12460czzsidtyhn;
        return savedState;
    }

    public final void zeieaojujs(int i13) {
        if (i13 != this.f12467uwvvkdfqfp) {
            this.f12467uwvvkdfqfp = Math.min(this.f12460czzsidtyhn - this.f12465rlfsiqarku, Math.abs(i13));
            lmojexxdyd();
        }
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f12471jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f12472yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f12473zdlpuopuiu;

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
            this.f12473zdlpuopuiu = parcel.readInt();
            this.f12472yggfygwlhe = parcel.readInt();
            this.f12471jyumaefscl = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f12473zdlpuopuiu);
            parcel.writeInt(this.f12472yggfygwlhe);
            parcel.writeInt(this.f12471jyumaefscl);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dxjokdxxww.seekBarPreferenceStyle);
    }
}
