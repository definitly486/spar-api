package d1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo implements wkgbmnqykc {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int f26605gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public int f26607lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    rgvfuqvkyq f26610wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public wkgbmnqykc f26606iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f26611zoijcleaow = false;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public boolean f26609ppxfxbqfkf = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    iobyxmoadg f26603eablkybsjg = iobyxmoadg.UNKNOWN;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    int f26608nufgyqmvbu = 1;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    lqeggnwhkg f26602dxjokdxxww = null;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public boolean f26600btonecajqb = false;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    List f26604gtknphoqwx = new ArrayList();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    List f26601draadjrbmk = new ArrayList();

    enum iobyxmoadg {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public gxszxtbevo(rgvfuqvkyq rgvfuqvkyqVar) {
        this.f26610wkgbmnqykc = rgvfuqvkyqVar;
    }

    @Override // d1.wkgbmnqykc
    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        Iterator it = this.f26601draadjrbmk.iterator();
        while (it.hasNext()) {
            if (!((gxszxtbevo) it.next()).f26600btonecajqb) {
                return;
            }
        }
        this.f26609ppxfxbqfkf = true;
        wkgbmnqykc wkgbmnqykcVar2 = this.f26606iobyxmoadg;
        if (wkgbmnqykcVar2 != null) {
            wkgbmnqykcVar2.iobyxmoadg(this);
        }
        if (this.f26611zoijcleaow) {
            this.f26610wkgbmnqykc.iobyxmoadg(this);
            return;
        }
        gxszxtbevo gxszxtbevoVar = null;
        int i13 = 0;
        for (gxszxtbevo gxszxtbevoVar2 : this.f26601draadjrbmk) {
            if (!(gxszxtbevoVar2 instanceof lqeggnwhkg)) {
                i13++;
                gxszxtbevoVar = gxszxtbevoVar2;
            }
        }
        if (gxszxtbevoVar != null && i13 == 1 && gxszxtbevoVar.f26600btonecajqb) {
            lqeggnwhkg lqeggnwhkgVar = this.f26602dxjokdxxww;
            if (lqeggnwhkgVar != null) {
                if (!lqeggnwhkgVar.f26600btonecajqb) {
                    return;
                } else {
                    this.f26605gxszxtbevo = this.f26608nufgyqmvbu * lqeggnwhkgVar.f26607lqeggnwhkg;
                }
            }
            wkgbmnqykc(gxszxtbevoVar.f26607lqeggnwhkg + this.f26605gxszxtbevo);
        }
        wkgbmnqykc wkgbmnqykcVar3 = this.f26606iobyxmoadg;
        if (wkgbmnqykcVar3 != null) {
            wkgbmnqykcVar3.iobyxmoadg(this);
        }
    }

    public void ppxfxbqfkf() {
        this.f26601draadjrbmk.clear();
        this.f26604gtknphoqwx.clear();
        this.f26600btonecajqb = false;
        this.f26607lqeggnwhkg = 0;
        this.f26609ppxfxbqfkf = false;
        this.f26611zoijcleaow = false;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f26610wkgbmnqykc.f26650zoijcleaow.jyumaefscl());
        sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb3.append(this.f26603eablkybsjg);
        sb3.append("(");
        sb3.append(this.f26600btonecajqb ? Integer.valueOf(this.f26607lqeggnwhkg) : "unresolved");
        sb3.append(") <t=");
        sb3.append(this.f26601draadjrbmk.size());
        sb3.append(":d=");
        sb3.append(this.f26604gtknphoqwx.size());
        sb3.append(">");
        return sb3.toString();
    }

    public void wkgbmnqykc(int i13) {
        if (this.f26600btonecajqb) {
            return;
        }
        this.f26600btonecajqb = true;
        this.f26607lqeggnwhkg = i13;
        for (wkgbmnqykc wkgbmnqykcVar : this.f26604gtknphoqwx) {
            wkgbmnqykcVar.iobyxmoadg(wkgbmnqykcVar);
        }
    }

    public void zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        this.f26604gtknphoqwx.add(wkgbmnqykcVar);
        if (this.f26600btonecajqb) {
            wkgbmnqykcVar.iobyxmoadg(wkgbmnqykcVar);
        }
    }
}
