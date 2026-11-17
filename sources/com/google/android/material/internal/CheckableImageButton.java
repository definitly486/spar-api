package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final int[] f22865lereixgezr = {R.attr.state_checked};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f22866cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f22867esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f22868iwizpuwonk;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f22869jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void ppxfxbqfkf(Parcel parcel) {
            this.f22869jyumaefscl = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f22869jyumaefscl ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            ppxfxbqfkf(parcel);
        }
    }

    class iobyxmoadg extends v1.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // v1.iobyxmoadg
        public void gxszxtbevo(View view, AccessibilityEvent accessibilityEvent) {
            super.gxszxtbevo(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.rlfsiqarku(CheckableImageButton.this.iobyxmoadg());
            zdlpuopuiuVar.czzsidtyhn(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.imageButtonStyle);
    }

    public boolean iobyxmoadg() {
        return this.f22866cqumvgiudr;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f22868iwizpuwonk;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i13) {
        if (!this.f22868iwizpuwonk) {
            return super.onCreateDrawableState(i13);
        }
        int[] iArr = f22865lereixgezr;
        return View.mergeDrawableStates(super.onCreateDrawableState(i13 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.zoijcleaow());
        setChecked(savedState.f22869jyumaefscl);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22869jyumaefscl = this.f22868iwizpuwonk;
        return savedState;
    }

    public void setCheckable(boolean z13) {
        if (this.f22866cqumvgiudr != z13) {
            this.f22866cqumvgiudr = z13;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z13) {
        if (!this.f22866cqumvgiudr || this.f22868iwizpuwonk == z13) {
            return;
        }
        this.f22868iwizpuwonk = z13;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z13) {
        this.f22867esjtqupxsv = z13;
    }

    @Override // android.view.View
    public void setPressed(boolean z13) {
        if (this.f22867esjtqupxsv) {
            super.setPressed(z13);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f22868iwizpuwonk);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f22866cqumvgiudr = true;
        this.f22867esjtqupxsv = true;
        jhduphickx.oipsdeybqn(this, new iobyxmoadg());
    }
}
