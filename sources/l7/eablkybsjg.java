package l7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg extends lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final q7.wkgbmnqykc f61720dxjokdxxww;

    public eablkybsjg(List list) {
        super(list);
        int iMax = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            q7.wkgbmnqykc wkgbmnqykcVar = (q7.wkgbmnqykc) ((w7.iobyxmoadg) list.get(i13)).f118920zoijcleaow;
            if (wkgbmnqykcVar != null) {
                iMax = Math.max(iMax, wkgbmnqykcVar.gxszxtbevo());
            }
        }
        this.f61720dxjokdxxww = new q7.wkgbmnqykc(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public q7.wkgbmnqykc dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        this.f61720dxjokdxxww.lqeggnwhkg((q7.wkgbmnqykc) iobyxmoadgVar.f118920zoijcleaow, (q7.wkgbmnqykc) iobyxmoadgVar.f118916ppxfxbqfkf, f13);
        return this.f61720dxjokdxxww;
    }
}
