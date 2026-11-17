package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Parcelable f8577zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final AbsSavedState f8576yggfygwlhe = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new iobyxmoadg();

    class iobyxmoadg implements Parcelable.ClassLoaderCreator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public AbsSavedState[] newArray(int i13) {
            return new AbsSavedState[i13];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f8576yggfygwlhe;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f8577zdlpuopuiu, i13);
    }

    public final Parcelable zoijcleaow() {
        return this.f8577zdlpuopuiu;
    }

    private AbsSavedState() {
        this.f8577zdlpuopuiu = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f8577zdlpuopuiu = parcelable == f8576yggfygwlhe ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f8577zdlpuopuiu = parcelable == null ? f8576yggfygwlhe : parcelable;
    }
}
