package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.gtknphoqwx;
import androidx.constraintlayout.widget.nufgyqmvbu;
import androidx.constraintlayout.widget.wkgbmnqykc;
import c1.btonecajqb;
import c1.eablkybsjg;
import c1.lqeggnwhkg;
import c1.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends gtknphoqwx {

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private lqeggnwhkg f7529yadqdtsiqt;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.gtknphoqwx, androidx.constraintlayout.widget.zoijcleaow
    protected void btonecajqb(AttributeSet attributeSet) {
        super.btonecajqb(attributeSet);
        this.f7529yadqdtsiqt = new lqeggnwhkg();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nufgyqmvbu.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.ConstraintLayout_Layout_android_orientation) {
                    this.f7529yadqdtsiqt.N0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_padding) {
                    this.f7529yadqdtsiqt.S(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_paddingStart) {
                    this.f7529yadqdtsiqt.X(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f7529yadqdtsiqt.U(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f7529yadqdtsiqt.V(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_paddingTop) {
                    this.f7529yadqdtsiqt.Y(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_paddingRight) {
                    this.f7529yadqdtsiqt.W(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f7529yadqdtsiqt.T(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f7529yadqdtsiqt.S0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f7529yadqdtsiqt.H0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f7529yadqdtsiqt.R0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f7529yadqdtsiqt.B0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f7529yadqdtsiqt.J0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f7529yadqdtsiqt.D0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f7529yadqdtsiqt.L0(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f7529yadqdtsiqt.F0(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f7529yadqdtsiqt.A0(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f7529yadqdtsiqt.I0(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f7529yadqdtsiqt.C0(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f7529yadqdtsiqt.K0(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f7529yadqdtsiqt.P0(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f7529yadqdtsiqt.E0(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f7529yadqdtsiqt.O0(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f7529yadqdtsiqt.G0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f7529yadqdtsiqt.Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f7529yadqdtsiqt.M0(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8281iwizpuwonk = this.f7529yadqdtsiqt;
        oxmwwwfdhm();
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    public void draadjrbmk(eablkybsjg eablkybsjgVar, boolean z13) {
        this.f7529yadqdtsiqt.D(z13);
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    public void gtknphoqwx(wkgbmnqykc.iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar, ConstraintLayout.zoijcleaow zoijcleaowVar, SparseArray sparseArray) {
        super.gtknphoqwx(iobyxmoadgVar, btonecajqbVar, zoijcleaowVar, sparseArray);
        if (btonecajqbVar instanceof lqeggnwhkg) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) btonecajqbVar;
            int i13 = zoijcleaowVar.f8050ribwqtqdhb;
            if (i13 != -1) {
                lqeggnwhkgVar.N0(i13);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.gtknphoqwx
    public void kcexrzcfyt(wflxmlrfwp wflxmlrfwpVar, int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        if (wflxmlrfwpVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            wflxmlrfwpVar.M(mode, size, mode2, size2);
            setMeasuredDimension(wflxmlrfwpVar.H(), wflxmlrfwpVar.G());
        }
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow, android.view.View
    protected void onMeasure(int i13, int i14) {
        kcexrzcfyt(this.f7529yadqdtsiqt, i13, i14);
    }

    public void setFirstHorizontalBias(float f13) {
        this.f7529yadqdtsiqt.A0(f13);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i13) {
        this.f7529yadqdtsiqt.B0(i13);
        requestLayout();
    }

    public void setFirstVerticalBias(float f13) {
        this.f7529yadqdtsiqt.C0(f13);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i13) {
        this.f7529yadqdtsiqt.D0(i13);
        requestLayout();
    }

    public void setHorizontalAlign(int i13) {
        this.f7529yadqdtsiqt.E0(i13);
        requestLayout();
    }

    public void setHorizontalBias(float f13) {
        this.f7529yadqdtsiqt.F0(f13);
        requestLayout();
    }

    public void setHorizontalGap(int i13) {
        this.f7529yadqdtsiqt.G0(i13);
        requestLayout();
    }

    public void setHorizontalStyle(int i13) {
        this.f7529yadqdtsiqt.H0(i13);
        requestLayout();
    }

    public void setLastHorizontalBias(float f13) {
        this.f7529yadqdtsiqt.I0(f13);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i13) {
        this.f7529yadqdtsiqt.J0(i13);
        requestLayout();
    }

    public void setLastVerticalBias(float f13) {
        this.f7529yadqdtsiqt.K0(f13);
        requestLayout();
    }

    public void setLastVerticalStyle(int i13) {
        this.f7529yadqdtsiqt.L0(i13);
        requestLayout();
    }

    public void setMaxElementsWrap(int i13) {
        this.f7529yadqdtsiqt.M0(i13);
        requestLayout();
    }

    public void setOrientation(int i13) {
        this.f7529yadqdtsiqt.N0(i13);
        requestLayout();
    }

    public void setPadding(int i13) {
        this.f7529yadqdtsiqt.S(i13);
        requestLayout();
    }

    public void setPaddingBottom(int i13) {
        this.f7529yadqdtsiqt.T(i13);
        requestLayout();
    }

    public void setPaddingLeft(int i13) {
        this.f7529yadqdtsiqt.V(i13);
        requestLayout();
    }

    public void setPaddingRight(int i13) {
        this.f7529yadqdtsiqt.W(i13);
        requestLayout();
    }

    public void setPaddingTop(int i13) {
        this.f7529yadqdtsiqt.Y(i13);
        requestLayout();
    }

    public void setVerticalAlign(int i13) {
        this.f7529yadqdtsiqt.O0(i13);
        requestLayout();
    }

    public void setVerticalBias(float f13) {
        this.f7529yadqdtsiqt.P0(f13);
        requestLayout();
    }

    public void setVerticalGap(int i13) {
        this.f7529yadqdtsiqt.Q0(i13);
        requestLayout();
    }

    public void setVerticalStyle(int i13) {
        this.f7529yadqdtsiqt.R0(i13);
        requestLayout();
    }

    public void setWrapMode(int i13) {
        this.f7529yadqdtsiqt.S0(i13);
        requestLayout();
    }
}
