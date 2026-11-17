package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f7990cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f7991istkbnxepw;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private c1.iobyxmoadg f7992yadqdtsiqt;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void kcexrzcfyt(c1.eablkybsjg eablkybsjgVar, int i13, boolean z13) {
        this.f7990cdpycssgdh = i13;
        if (z13) {
            int i14 = this.f7991istkbnxepw;
            if (i14 == 5) {
                this.f7990cdpycssgdh = 1;
            } else if (i14 == 6) {
                this.f7990cdpycssgdh = 0;
            }
        } else {
            int i15 = this.f7991istkbnxepw;
            if (i15 == 5) {
                this.f7990cdpycssgdh = 0;
            } else if (i15 == 6) {
                this.f7990cdpycssgdh = 1;
            }
        }
        if (eablkybsjgVar instanceof c1.iobyxmoadg) {
            ((c1.iobyxmoadg) eablkybsjgVar).K(this.f7990cdpycssgdh);
        }
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    protected void btonecajqb(AttributeSet attributeSet) {
        super.btonecajqb(attributeSet);
        this.f7992yadqdtsiqt = new c1.iobyxmoadg();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nufgyqmvbu.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f7992yadqdtsiqt.J(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_barrierMargin) {
                    this.f7992yadqdtsiqt.L(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8281iwizpuwonk = this.f7992yadqdtsiqt;
        oxmwwwfdhm();
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    public void draadjrbmk(c1.eablkybsjg eablkybsjgVar, boolean z13) {
        kcexrzcfyt(eablkybsjgVar, this.f7991istkbnxepw, z13);
    }

    public boolean getAllowsGoneWidget() {
        return this.f7992yadqdtsiqt.E();
    }

    public int getMargin() {
        return this.f7992yadqdtsiqt.G();
    }

    public int getType() {
        return this.f7991istkbnxepw;
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    public void gtknphoqwx(wkgbmnqykc.iobyxmoadg iobyxmoadgVar, c1.btonecajqb btonecajqbVar, ConstraintLayout.zoijcleaow zoijcleaowVar, SparseArray sparseArray) {
        super.gtknphoqwx(iobyxmoadgVar, btonecajqbVar, zoijcleaowVar, sparseArray);
        if (btonecajqbVar instanceof c1.iobyxmoadg) {
            c1.iobyxmoadg iobyxmoadgVar2 = (c1.iobyxmoadg) btonecajqbVar;
            kcexrzcfyt(iobyxmoadgVar2, iobyxmoadgVar.f8169eablkybsjg.f8256rlfsiqarku, ((c1.gxszxtbevo) btonecajqbVar.hkdspvbjdz()).a0());
            iobyxmoadgVar2.J(iobyxmoadgVar.f8169eablkybsjg.f8211bfopjjpdmp);
            iobyxmoadgVar2.L(iobyxmoadgVar.f8169eablkybsjg.f8217czzsidtyhn);
        }
    }

    public void setAllowsGoneWidget(boolean z13) {
        this.f7992yadqdtsiqt.J(z13);
    }

    public void setDpMargin(int i13) {
        this.f7992yadqdtsiqt.L((int) ((i13 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i13) {
        this.f7992yadqdtsiqt.L(i13);
    }

    public void setType(int i13) {
        this.f7991istkbnxepw = i13;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
