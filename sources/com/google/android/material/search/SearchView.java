package com.google.android.material.search;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.yggfygwlhe;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import na.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.zoijcleaow, zoijcleaow {

    public static class Behavior extends CoordinatorLayout.ppxfxbqfkf {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean draadjrbmk(CoordinatorLayout coordinatorLayout, View view, View view2) {
            yggfygwlhe.iobyxmoadg(view);
            return ylkuphrtab(coordinatorLayout, null, view2);
        }

        public boolean ylkuphrtab(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f23021iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        String f23022jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f23022jyumaefscl);
            parcel.writeInt(this.f23021iwizpuwonk);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23022jyumaefscl = parcel.readString();
            this.f23021iwizpuwonk = parcel.readInt();
        }
    }
}
