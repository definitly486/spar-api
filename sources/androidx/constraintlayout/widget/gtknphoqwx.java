package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import c1.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx extends zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f8108cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f8109istkbnxepw;

    public gtknphoqwx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    protected void btonecajqb(AttributeSet attributeSet) {
        super.btonecajqb(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nufgyqmvbu.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.ConstraintLayout_Layout_android_visibility) {
                    this.f8109istkbnxepw = true;
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_elevation) {
                    this.f8108cdpycssgdh = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    protected void gxszxtbevo(ConstraintLayout constraintLayout) {
        eablkybsjg(constraintLayout);
    }

    public abstract void kcexrzcfyt(wflxmlrfwp wflxmlrfwpVar, int i13, int i14);

    @Override // androidx.constraintlayout.widget.zoijcleaow, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8109istkbnxepw || this.f8108cdpycssgdh) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i13 = 0; i13 < this.f8285yggfygwlhe; i13++) {
                    View viewById = constraintLayout.getViewById(this.f8286zdlpuopuiu[i13]);
                    if (viewById != null) {
                        if (this.f8109istkbnxepw) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f8108cdpycssgdh && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        wkgbmnqykc();
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        wkgbmnqykc();
    }
}
