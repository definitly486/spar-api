package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow extends View {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    protected boolean f8279cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    protected String f8280esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    protected c1.dxjokdxxww f8281iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected Context f8282jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected String f8283lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private View[] f8284pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected int f8285yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected int[] f8286zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    protected HashMap f8287zynmafqrjb;

    public zoijcleaow(Context context) {
        super(context);
        this.f8286zdlpuopuiu = new int[32];
        this.f8279cqumvgiudr = false;
        this.f8284pmvmpeiblj = null;
        this.f8287zynmafqrjb = new HashMap();
        this.f8282jyumaefscl = context;
        btonecajqb(null);
    }

    private int dxjokdxxww(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iNufgyqmvbu = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iNufgyqmvbu = ((Integer) designInformation).intValue();
            }
        }
        if (iNufgyqmvbu == 0 && constraintLayout != null) {
            iNufgyqmvbu = nufgyqmvbu(constraintLayout, str);
        }
        if (iNufgyqmvbu == 0) {
            try {
                iNufgyqmvbu = lqeggnwhkg.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iNufgyqmvbu == 0 ? this.f8282jyumaefscl.getResources().getIdentifier(str, "id", this.f8282jyumaefscl.getPackageName()) : iNufgyqmvbu;
    }

    private void iobyxmoadg(String str) {
        if (str == null || str.length() == 0 || this.f8282jyumaefscl == null) {
            return;
        }
        String strTrim = str.trim();
        int iDxjokdxxww = dxjokdxxww(strTrim);
        if (iDxjokdxxww != 0) {
            this.f8287zynmafqrjb.put(Integer.valueOf(iDxjokdxxww), strTrim);
            zoijcleaow(iDxjokdxxww);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private int[] lqeggnwhkg(String str) {
        String[] strArrSplit = str.split(StringUtils.COMMA);
        int[] iArr = new int[strArrSplit.length];
        int i13 = 0;
        for (String str2 : strArrSplit) {
            int iDxjokdxxww = dxjokdxxww(str2.trim());
            if (iDxjokdxxww != 0) {
                iArr[i13] = iDxjokdxxww;
                i13++;
            }
        }
        return i13 != strArrSplit.length ? Arrays.copyOf(iArr, i13) : iArr;
    }

    private int nufgyqmvbu(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f8282jyumaefscl.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private void ppxfxbqfkf(String str) {
        if (str == null || str.length() == 0 || this.f8282jyumaefscl == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.zoijcleaow) && strTrim.equals(((ConstraintLayout.zoijcleaow) layoutParams).f8019ikoacuggdj)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    zoijcleaow(childAt.getId());
                }
            }
        }
    }

    private void zoijcleaow(int i13) {
        if (i13 == getId()) {
            return;
        }
        int i14 = this.f8285yggfygwlhe + 1;
        int[] iArr = this.f8286zdlpuopuiu;
        if (i14 > iArr.length) {
            this.f8286zdlpuopuiu = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8286zdlpuopuiu;
        int i15 = this.f8285yggfygwlhe;
        iArr2[i15] = i13;
        this.f8285yggfygwlhe = i15 + 1;
    }

    public void agtfadlqog(ConstraintLayout constraintLayout) {
    }

    protected void btonecajqb(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nufgyqmvbu.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8280esjtqupxsv = string;
                    setIds(string);
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f8283lereixgezr = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void draadjrbmk(c1.eablkybsjg eablkybsjgVar, boolean z13) {
    }

    protected void eablkybsjg(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i13 = 0; i13 < this.f8285yggfygwlhe; i13++) {
            View viewById = constraintLayout.getViewById(this.f8286zdlpuopuiu[i13]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8286zdlpuopuiu, this.f8285yggfygwlhe);
    }

    public void gtknphoqwx(wkgbmnqykc.iobyxmoadg iobyxmoadgVar, c1.btonecajqb btonecajqbVar, ConstraintLayout.zoijcleaow zoijcleaowVar, SparseArray sparseArray) {
        wkgbmnqykc.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f8169eablkybsjg;
        int[] iArr = zoijcleaowVar2.f8272yfnezrywwk;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = zoijcleaowVar2.f8271ydmasvzmpa;
            if (str != null) {
                if (str.length() > 0) {
                    wkgbmnqykc.zoijcleaow zoijcleaowVar3 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar3.f8272yfnezrywwk = lqeggnwhkg(zoijcleaowVar3.f8271ydmasvzmpa);
                } else {
                    iobyxmoadgVar.f8169eablkybsjg.f8272yfnezrywwk = null;
                }
            }
        }
        if (btonecajqbVar == null) {
            return;
        }
        btonecajqbVar.ppxfxbqfkf();
        if (iobyxmoadgVar.f8169eablkybsjg.f8272yfnezrywwk == null) {
            return;
        }
        int i13 = 0;
        while (true) {
            int[] iArr2 = iobyxmoadgVar.f8169eablkybsjg.f8272yfnezrywwk;
            if (i13 >= iArr2.length) {
                return;
            }
            c1.eablkybsjg eablkybsjgVar = (c1.eablkybsjg) sparseArray.get(iArr2[i13]);
            if (eablkybsjgVar != null) {
                btonecajqbVar.iobyxmoadg(eablkybsjgVar);
            }
            i13++;
        }
    }

    protected void gxszxtbevo(ConstraintLayout constraintLayout) {
    }

    public void ojitshcjhn(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8280esjtqupxsv;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f8283lereixgezr;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        if (this.f8279cqumvgiudr) {
            super.onMeasure(i13, i14);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void oxmwwwfdhm() {
        if (this.f8281iwizpuwonk == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.zoijcleaow) {
            ((ConstraintLayout.zoijcleaow) layoutParams).f8040nuxfzjnpeb = (c1.eablkybsjg) this.f8281iwizpuwonk;
        }
    }

    public void rgvfuqvkyq(ConstraintLayout constraintLayout) {
        String str;
        int iNufgyqmvbu;
        if (isInEditMode()) {
            setIds(this.f8280esjtqupxsv);
        }
        c1.dxjokdxxww dxjokdxxwwVar = this.f8281iwizpuwonk;
        if (dxjokdxxwwVar == null) {
            return;
        }
        dxjokdxxwwVar.ppxfxbqfkf();
        for (int i13 = 0; i13 < this.f8285yggfygwlhe; i13++) {
            int i14 = this.f8286zdlpuopuiu[i13];
            View viewById = constraintLayout.getViewById(i14);
            if (viewById == null && (iNufgyqmvbu = nufgyqmvbu(constraintLayout, (str = (String) this.f8287zynmafqrjb.get(Integer.valueOf(i14))))) != 0) {
                this.f8286zdlpuopuiu[i13] = iNufgyqmvbu;
                this.f8287zynmafqrjb.put(Integer.valueOf(iNufgyqmvbu), str);
                viewById = constraintLayout.getViewById(iNufgyqmvbu);
            }
            if (viewById != null) {
                this.f8281iwizpuwonk.iobyxmoadg(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f8281iwizpuwonk.zoijcleaow(constraintLayout.mLayoutWidget);
    }

    protected void setIds(String str) {
        this.f8280esjtqupxsv = str;
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f8285yggfygwlhe = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i13);
            if (iIndexOf == -1) {
                iobyxmoadg(str.substring(i13));
                return;
            } else {
                iobyxmoadg(str.substring(i13, iIndexOf));
                i13 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f8283lereixgezr = str;
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f8285yggfygwlhe = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i13);
            if (iIndexOf == -1) {
                ppxfxbqfkf(str.substring(i13));
                return;
            } else {
                ppxfxbqfkf(str.substring(i13, iIndexOf));
                i13 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8280esjtqupxsv = null;
        this.f8285yggfygwlhe = 0;
        for (int i13 : iArr) {
            zoijcleaow(i13);
        }
    }

    @Override // android.view.View
    public void setTag(int i13, Object obj) {
        super.setTag(i13, obj);
        if (obj == null && this.f8280esjtqupxsv == null) {
            zoijcleaow(i13);
        }
    }

    public void vdvldrhtss(c1.gxszxtbevo gxszxtbevoVar, c1.dxjokdxxww dxjokdxxwwVar, SparseArray sparseArray) {
        dxjokdxxwwVar.ppxfxbqfkf();
        for (int i13 = 0; i13 < this.f8285yggfygwlhe; i13++) {
            dxjokdxxwwVar.iobyxmoadg((c1.eablkybsjg) sparseArray.get(this.f8286zdlpuopuiu[i13]));
        }
    }

    public void wflxmlrfwp(ConstraintLayout constraintLayout) {
    }

    protected void wkgbmnqykc() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        eablkybsjg((ConstraintLayout) parent);
    }

    public zoijcleaow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8286zdlpuopuiu = new int[32];
        this.f8279cqumvgiudr = false;
        this.f8284pmvmpeiblj = null;
        this.f8287zynmafqrjb = new HashMap();
        this.f8282jyumaefscl = context;
        btonecajqb(attributeSet);
    }
}
