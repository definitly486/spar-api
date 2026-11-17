package ageimvtcrz;

import android.content.Context;
import android.view.ViewGroup;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends ViewGroup {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f1818cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final lqeggnwhkg f1819iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f1820jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f1821yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f1822zdlpuopuiu;

    public eablkybsjg(Context context) {
        super(context);
        this.f1822zdlpuopuiu = 5;
        ArrayList arrayList = new ArrayList();
        this.f1821yggfygwlhe = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1820jyumaefscl = arrayList2;
        this.f1819iwizpuwonk = new lqeggnwhkg();
        setClipChildren(false);
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(context);
        addView(dxjokdxxwwVar);
        arrayList.add(dxjokdxxwwVar);
        arrayList2.add(dxjokdxxwwVar);
        this.f1818cqumvgiudr = 1;
        setTag(a.gtknphoqwx.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.t();
        dxjokdxxww dxjokdxxwwVarZoijcleaow = this.f1819iwizpuwonk.zoijcleaow(gxszxtbevoVar);
        if (dxjokdxxwwVarZoijcleaow != null) {
            dxjokdxxwwVarZoijcleaow.wkgbmnqykc();
            this.f1819iwizpuwonk.ppxfxbqfkf(gxszxtbevoVar);
            this.f1820jyumaefscl.add(dxjokdxxwwVarZoijcleaow);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public final dxjokdxxww zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVarZoijcleaow = this.f1819iwizpuwonk.zoijcleaow(gxszxtbevoVar);
        if (dxjokdxxwwVarZoijcleaow != null) {
            return dxjokdxxwwVarZoijcleaow;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) jyumaefscl.jpowsppfya(this.f1820jyumaefscl);
        if (dxjokdxxwwVar == null) {
            if (this.f1818cqumvgiudr > jyumaefscl.ojitshcjhn(this.f1821yggfygwlhe)) {
                dxjokdxxwwVar = new dxjokdxxww(getContext());
                addView(dxjokdxxwwVar);
                this.f1821yggfygwlhe.add(dxjokdxxwwVar);
            } else {
                dxjokdxxwwVar = (dxjokdxxww) this.f1821yggfygwlhe.get(this.f1818cqumvgiudr);
                gxszxtbevo gxszxtbevoVarIobyxmoadg = this.f1819iwizpuwonk.iobyxmoadg(dxjokdxxwwVar);
                if (gxszxtbevoVarIobyxmoadg != null) {
                    gxszxtbevoVarIobyxmoadg.t();
                    this.f1819iwizpuwonk.ppxfxbqfkf(gxszxtbevoVarIobyxmoadg);
                    dxjokdxxwwVar.wkgbmnqykc();
                }
            }
            int i13 = this.f1818cqumvgiudr;
            if (i13 < this.f1822zdlpuopuiu - 1) {
                this.f1818cqumvgiudr = i13 + 1;
            } else {
                this.f1818cqumvgiudr = 0;
            }
        }
        this.f1819iwizpuwonk.wkgbmnqykc(gxszxtbevoVar, dxjokdxxwwVar);
        return dxjokdxxwwVar;
    }
}
