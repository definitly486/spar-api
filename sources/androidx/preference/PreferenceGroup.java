package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.jztzpxfvev;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private final List f12445czzsidtyhn;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    final jztzpxfvev f12446metgxyhuhe;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private final Handler f12447rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private int f12448sflfametgt;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f12449uwvvkdfqfp;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private boolean f12450ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private int f12451yfnezrywwk;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private final Runnable f12452zfvoamnweg;

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f12446metgxyhuhe.clear();
            }
        }
    }

    public interface zoijcleaow {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12446metgxyhuhe = new jztzpxfvev();
        this.f12447rlfsiqarku = new Handler(Looper.getMainLooper());
        this.f12449uwvvkdfqfp = true;
        this.f12451yfnezrywwk = 0;
        this.f12450ydmasvzmpa = false;
        this.f12448sflfametgt = Integer.MAX_VALUE;
        this.f12452zfvoamnweg = new iobyxmoadg();
        this.f12445czzsidtyhn = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.PreferenceGroup, i13, i14);
        int i15 = vdvldrhtss.PreferenceGroup_orderingFromXml;
        this.f12449uwvvkdfqfp = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, i15, i15, true);
        if (typedArrayObtainStyledAttributes.hasValue(vdvldrhtss.PreferenceGroup_initialExpandedChildrenCount)) {
            int i16 = vdvldrhtss.PreferenceGroup_initialExpandedChildrenCount;
            auzgnhcxok(i1.gtknphoqwx.wkgbmnqykc(typedArrayObtainStyledAttributes, i16, i16, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void auzgnhcxok(int i13) {
        if (i13 != Integer.MAX_VALUE && !pmvmpeiblj()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f12448sflfametgt = i13;
    }

    @Override // androidx.preference.Preference
    public void cllcsxoeiz() {
        super.cllcsxoeiz();
        this.f12450ydmasvzmpa = false;
        int iRoivzttewh = roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            tbqsvytpvh(i13).cllcsxoeiz();
        }
    }

    @Override // androidx.preference.Preference
    protected void eablkybsjg(Bundle bundle) {
        super.eablkybsjg(bundle);
        int iRoivzttewh = roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            tbqsvytpvh(i13).eablkybsjg(bundle);
        }
    }

    void iwxlajgraz() {
        synchronized (this) {
            Collections.sort(this.f12445czzsidtyhn);
        }
    }

    @Override // androidx.preference.Preference
    protected void kegysxyocb(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.kegysxyocb(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f12448sflfametgt = savedState.f12453zdlpuopuiu;
        super.kegysxyocb(savedState.getSuperState());
    }

    public Preference lrnfpwlwnk(CharSequence charSequence) {
        Preference preferenceLrnfpwlwnk;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(wflxmlrfwp(), charSequence)) {
            return this;
        }
        int iRoivzttewh = roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            Preference preferenceTbqsvytpvh = tbqsvytpvh(i13);
            if (TextUtils.equals(preferenceTbqsvytpvh.wflxmlrfwp(), charSequence)) {
                return preferenceTbqsvytpvh;
            }
            if ((preferenceTbqsvytpvh instanceof PreferenceGroup) && (preferenceLrnfpwlwnk = ((PreferenceGroup) preferenceTbqsvytpvh).lrnfpwlwnk(charSequence)) != null) {
                return preferenceLrnfpwlwnk;
            }
        }
        return null;
    }

    public zoijcleaow nuxfzjnpeb() {
        return null;
    }

    @Override // androidx.preference.Preference
    public void pkzmftpjix() {
        super.pkzmftpjix();
        this.f12450ydmasvzmpa = true;
        int iRoivzttewh = roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            tbqsvytpvh(i13).pkzmftpjix();
        }
    }

    public int roivzttewh() {
        return this.f12445czzsidtyhn.size();
    }

    public Preference tbqsvytpvh(int i13) {
        return (Preference) this.f12445czzsidtyhn.get(i13);
    }

    @Override // androidx.preference.Preference
    protected Parcelable tzroggbefp() {
        return new SavedState(super.tzroggbefp(), this.f12448sflfametgt);
    }

    protected boolean uawqvzlxes() {
        return true;
    }

    @Override // androidx.preference.Preference
    protected void wkgbmnqykc(Bundle bundle) {
        super.wkgbmnqykc(bundle);
        int iRoivzttewh = roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            tbqsvytpvh(i13).wkgbmnqykc(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void wwaezpbzkn(boolean z13) {
        super.wwaezpbzkn(z13);
        int iRoivzttewh = roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            tbqsvytpvh(i13).stevsuqkhv(this, z13);
        }
    }

    public int zeieaojujs() {
        return this.f12448sflfametgt;
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f12453zdlpuopuiu;

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
            this.f12453zdlpuopuiu = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f12453zdlpuopuiu);
        }

        SavedState(Parcelable parcelable, int i13) {
            super(parcelable);
            this.f12453zdlpuopuiu = i13;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
