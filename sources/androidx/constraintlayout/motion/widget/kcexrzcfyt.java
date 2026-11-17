package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class kcexrzcfyt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    ArrayList f7814eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MotionLayout f7816iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private HashSet f7817ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ArrayList f7819zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f7818wkgbmnqykc = "ViewTransitionController";

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    ArrayList f7815gxszxtbevo = new ArrayList();

    class iobyxmoadg implements androidx.constraintlayout.widget.dxjokdxxww.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ oxmwwwfdhm f7821iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ boolean f7822ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ int f7823wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f7824zoijcleaow;

        iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar, int i13, boolean z13, int i14) {
            this.f7821iobyxmoadg = oxmwwwfdhmVar;
            this.f7824zoijcleaow = i13;
            this.f7822ppxfxbqfkf = z13;
            this.f7823wkgbmnqykc = i14;
        }
    }

    public kcexrzcfyt(MotionLayout motionLayout) {
        this.f7816iobyxmoadg = motionLayout;
    }

    private void dxjokdxxww(oxmwwwfdhm oxmwwwfdhmVar, View... viewArr) {
        int currentState = this.f7816iobyxmoadg.getCurrentState();
        if (oxmwwwfdhmVar.f7886eablkybsjg == 2) {
            oxmwwwfdhmVar.ppxfxbqfkf(this, this.f7816iobyxmoadg, currentState, null, viewArr);
            return;
        }
        if (currentState != -1) {
            androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVarVipkmwdibw = this.f7816iobyxmoadg.vipkmwdibw(currentState);
            if (wkgbmnqykcVarVipkmwdibw == null) {
                return;
            }
            oxmwwwfdhmVar.ppxfxbqfkf(this, this.f7816iobyxmoadg, currentState, wkgbmnqykcVarVipkmwdibw, viewArr);
            return;
        }
        Log.w(this.f7818wkgbmnqykc, "No support for ViewTransition within transition yet. Currently: " + this.f7816iobyxmoadg.toString());
    }

    private void eablkybsjg(oxmwwwfdhm oxmwwwfdhmVar, boolean z13) {
        ConstraintLayout.getSharedValues().iobyxmoadg(oxmwwwfdhmVar.nufgyqmvbu(), new iobyxmoadg(oxmwwwfdhmVar, oxmwwwfdhmVar.nufgyqmvbu(), z13, oxmwwwfdhmVar.lqeggnwhkg()));
    }

    void gxszxtbevo(oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        this.f7815gxszxtbevo.add(zoijcleaowVar);
    }

    public void iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f7819zoijcleaow.add(oxmwwwfdhmVar);
        this.f7817ppxfxbqfkf = null;
        if (oxmwwwfdhmVar.dxjokdxxww() == 4) {
            eablkybsjg(oxmwwwfdhmVar, true);
        } else if (oxmwwwfdhmVar.dxjokdxxww() == 5) {
            eablkybsjg(oxmwwwfdhmVar, false);
        }
    }

    void lqeggnwhkg(MotionEvent motionEvent) {
        int currentState = this.f7816iobyxmoadg.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f7817ppxfxbqfkf == null) {
            this.f7817ppxfxbqfkf = new HashSet();
            for (oxmwwwfdhm oxmwwwfdhmVar : this.f7819zoijcleaow) {
                int childCount = this.f7816iobyxmoadg.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.f7816iobyxmoadg.getChildAt(i13);
                    if (oxmwwwfdhmVar.gtknphoqwx(childAt)) {
                        childAt.getId();
                        this.f7817ppxfxbqfkf.add(childAt);
                    }
                }
            }
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f7814eablkybsjg;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f7814eablkybsjg.iterator();
            while (it.hasNext()) {
                ((oxmwwwfdhm.zoijcleaow) it.next()).wkgbmnqykc(action, x13, y13);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVarVipkmwdibw = this.f7816iobyxmoadg.vipkmwdibw(currentState);
            for (oxmwwwfdhm oxmwwwfdhmVar2 : this.f7819zoijcleaow) {
                if (oxmwwwfdhmVar2.wflxmlrfwp(action)) {
                    for (View view : this.f7817ppxfxbqfkf) {
                        if (oxmwwwfdhmVar2.gtknphoqwx(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x13, (int) y13)) {
                                oxmwwwfdhmVar2.ppxfxbqfkf(this, this.f7816iobyxmoadg, currentState, wkgbmnqykcVarVipkmwdibw, view);
                            }
                        }
                    }
                }
            }
        }
    }

    void nufgyqmvbu(int i13, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        oxmwwwfdhm oxmwwwfdhmVar = null;
        for (oxmwwwfdhm oxmwwwfdhmVar2 : this.f7819zoijcleaow) {
            if (oxmwwwfdhmVar2.eablkybsjg() == i13) {
                for (View view : viewArr) {
                    if (oxmwwwfdhmVar2.wkgbmnqykc(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    dxjokdxxww(oxmwwwfdhmVar2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                oxmwwwfdhmVar = oxmwwwfdhmVar2;
            }
        }
        if (oxmwwwfdhmVar == null) {
            Log.e(this.f7818wkgbmnqykc, " Could not find ViewTransition");
        }
    }

    void ppxfxbqfkf() {
        ArrayList arrayList = this.f7814eablkybsjg;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((oxmwwwfdhm.zoijcleaow) it.next()).iobyxmoadg();
        }
        this.f7814eablkybsjg.removeAll(this.f7815gxszxtbevo);
        this.f7815gxszxtbevo.clear();
        if (this.f7814eablkybsjg.isEmpty()) {
            this.f7814eablkybsjg = null;
        }
    }

    void wkgbmnqykc() {
        this.f7816iobyxmoadg.invalidate();
    }

    void zoijcleaow(oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        if (this.f7814eablkybsjg == null) {
            this.f7814eablkybsjg = new ArrayList();
        }
        this.f7814eablkybsjg.add(zoijcleaowVar);
    }
}
