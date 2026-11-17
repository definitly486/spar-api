package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private CharSequence f12484czzsidtyhn;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    protected boolean f12485metgxyhuhe;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private CharSequence f12486rlfsiqarku;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f12487uwvvkdfqfp;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private boolean f12488yfnezrywwk;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
    }

    protected void auzgnhcxok(nufgyqmvbu nufgyqmvbuVar) {
        uawqvzlxes(nufgyqmvbuVar.zoijcleaow(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected Object dsvhmnatus(TypedArray typedArray, int i13) {
        return Boolean.valueOf(typedArray.getBoolean(i13, false));
    }

    @Override // androidx.preference.Preference
    protected void jpowsppfya() {
        super.jpowsppfya();
        boolean z13 = !lrnfpwlwnk();
        if (iobyxmoadg(Boolean.valueOf(z13))) {
            zeieaojujs(z13);
        }
    }

    @Override // androidx.preference.Preference
    protected void kegysxyocb(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.kegysxyocb(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.kegysxyocb(savedState.getSuperState());
        zeieaojujs(savedState.f12489zdlpuopuiu);
    }

    public boolean lrnfpwlwnk() {
        return this.f12485metgxyhuhe;
    }

    public void nuxfzjnpeb(boolean z13) {
        this.f12488yfnezrywwk = z13;
    }

    @Override // androidx.preference.Preference
    public boolean oipsdeybqn() {
        boolean z13;
        if (this.f12488yfnezrywwk) {
            z13 = this.f12485metgxyhuhe;
        } else {
            z13 = !this.f12485metgxyhuhe;
        }
        return z13 || super.oipsdeybqn();
    }

    public void roivzttewh(CharSequence charSequence) {
        this.f12486rlfsiqarku = charSequence;
        if (lrnfpwlwnk()) {
            lmojexxdyd();
        }
    }

    public void tbqsvytpvh(CharSequence charSequence) {
        this.f12484czzsidtyhn = charSequence;
        if (lrnfpwlwnk()) {
            return;
        }
        lmojexxdyd();
    }

    @Override // androidx.preference.Preference
    protected Parcelable tzroggbefp() {
        Parcelable parcelableTzroggbefp = super.tzroggbefp();
        if (cdpycssgdh()) {
            return parcelableTzroggbefp;
        }
        SavedState savedState = new SavedState(parcelableTzroggbefp);
        savedState.f12489zdlpuopuiu = lrnfpwlwnk();
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    protected void uawqvzlxes(View view) {
        boolean z13;
        int i13;
        CharSequence charSequenceIwizpuwonk;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f12485metgxyhuhe || TextUtils.isEmpty(this.f12486rlfsiqarku)) {
                if (this.f12485metgxyhuhe || TextUtils.isEmpty(this.f12484czzsidtyhn)) {
                    z13 = true;
                } else {
                    textView.setText(this.f12484czzsidtyhn);
                }
                if (z13) {
                    charSequenceIwizpuwonk = iwizpuwonk();
                    if (!TextUtils.isEmpty(charSequenceIwizpuwonk)) {
                        textView.setText(charSequenceIwizpuwonk);
                        z13 = false;
                    }
                }
                i13 = z13 ? 8 : 0;
                if (i13 != textView.getVisibility()) {
                    textView.setVisibility(i13);
                }
            }
            textView.setText(this.f12486rlfsiqarku);
            z13 = false;
            if (z13) {
                charSequenceIwizpuwonk = iwizpuwonk();
                if (!TextUtils.isEmpty(charSequenceIwizpuwonk)) {
                    textView.setText(charSequenceIwizpuwonk);
                    z13 = false;
                }
            }
            if (z13) {
            }
            if (i13 != textView.getVisibility()) {
                textView.setVisibility(i13);
            }
        }
    }

    public void zeieaojujs(boolean z13) {
        boolean z14 = this.f12485metgxyhuhe != z13;
        if (z14 || !this.f12487uwvvkdfqfp) {
            this.f12485metgxyhuhe = z13;
            this.f12487uwvvkdfqfp = true;
            ulzqkzuiru(z13);
            if (z14) {
                wwaezpbzkn(oipsdeybqn());
                lmojexxdyd();
            }
        }
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f12489zdlpuopuiu;

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
            this.f12489zdlpuopuiu = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f12489zdlpuopuiu ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
