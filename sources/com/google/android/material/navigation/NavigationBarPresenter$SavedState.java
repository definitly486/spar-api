package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes2.dex */
class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<NavigationBarPresenter$SavedState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    ParcelableSparseArray f23011yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    int f23012zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public NavigationBarPresenter$SavedState createFromParcel(Parcel parcel) {
            return new NavigationBarPresenter$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public NavigationBarPresenter$SavedState[] newArray(int i13) {
            return new NavigationBarPresenter$SavedState[i13];
        }
    }

    NavigationBarPresenter$SavedState(Parcel parcel) {
        this.f23012zdlpuopuiu = parcel.readInt();
        this.f23011yggfygwlhe = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f23012zdlpuopuiu);
        parcel.writeParcelable(this.f23011yggfygwlhe, 0);
    }
}
