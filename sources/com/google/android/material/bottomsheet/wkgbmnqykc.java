package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import v1.bfopjjpdmp;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes2.dex */
class wkgbmnqykc extends bfopjjpdmp.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f22261cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int[] f22262esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f22263iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final View f22264jyumaefscl;

    public wkgbmnqykc(View view) {
        super(0);
        this.f22262esjtqupxsv = new int[2];
        this.f22264jyumaefscl = view;
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public skhdrjzrfn eablkybsjg(skhdrjzrfn skhdrjzrfnVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bfopjjpdmp bfopjjpdmpVar = (bfopjjpdmp) it.next();
            if ((bfopjjpdmpVar.wkgbmnqykc() & skhdrjzrfn.draadjrbmk.wkgbmnqykc()) != 0) {
                this.f22264jyumaefscl.setTranslationY(ea.iobyxmoadg.ppxfxbqfkf(this.f22261cqumvgiudr, 0, bfopjjpdmpVar.ppxfxbqfkf()));
                break;
            }
        }
        return skhdrjzrfnVar;
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public bfopjjpdmp.iobyxmoadg gxszxtbevo(bfopjjpdmp bfopjjpdmpVar, bfopjjpdmp.iobyxmoadg iobyxmoadgVar) {
        this.f22264jyumaefscl.getLocationOnScreen(this.f22262esjtqupxsv);
        int i13 = this.f22263iwizpuwonk - this.f22262esjtqupxsv[1];
        this.f22261cqumvgiudr = i13;
        this.f22264jyumaefscl.setTranslationY(i13);
        return iobyxmoadgVar;
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public void ppxfxbqfkf(bfopjjpdmp bfopjjpdmpVar) {
        this.f22264jyumaefscl.setTranslationY(0.0f);
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public void wkgbmnqykc(bfopjjpdmp bfopjjpdmpVar) {
        this.f22264jyumaefscl.getLocationOnScreen(this.f22262esjtqupxsv);
        this.f22263iwizpuwonk = this.f22262esjtqupxsv[1];
    }
}
