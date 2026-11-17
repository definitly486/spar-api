package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes2.dex */
class SearchBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SearchBar$SavedState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    String f23019jyumaefscl;

    class iobyxmoadg implements Parcelable.ClassLoaderCreator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SearchBar$SavedState createFromParcel(Parcel parcel) {
            return new SearchBar$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public SearchBar$SavedState[] newArray(int i13) {
            return new SearchBar$SavedState[i13];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public SearchBar$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SearchBar$SavedState(parcel, classLoader);
        }
    }

    public SearchBar$SavedState(Parcel parcel) {
        this(parcel, null);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeString(this.f23019jyumaefscl);
    }

    public SearchBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f23019jyumaefscl = parcel.readString();
    }
}
