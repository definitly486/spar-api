package l7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class draadjrbmk extends lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final w7.wkgbmnqykc f61717dxjokdxxww;

    public draadjrbmk(List list) {
        super(list);
        this.f61717dxjokdxxww = new w7.wkgbmnqykc();
    }

    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public w7.wkgbmnqykc dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        Object obj;
        w7.wkgbmnqykc wkgbmnqykcVar;
        Object obj2 = iobyxmoadgVar.f118920zoijcleaow;
        if (obj2 == null || (obj = iobyxmoadgVar.f118916ppxfxbqfkf) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        w7.wkgbmnqykc wkgbmnqykcVar2 = (w7.wkgbmnqykc) obj2;
        w7.wkgbmnqykc wkgbmnqykcVar3 = (w7.wkgbmnqykc) obj;
        w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61722eablkybsjg;
        if (ppxfxbqfkfVar != null && (wkgbmnqykcVar = (w7.wkgbmnqykc) ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar.f118913lqeggnwhkg, iobyxmoadgVar.f118914nufgyqmvbu.floatValue(), wkgbmnqykcVar2, wkgbmnqykcVar3, f13, eablkybsjg(), gxszxtbevo())) != null) {
            return wkgbmnqykcVar;
        }
        this.f61717dxjokdxxww.wkgbmnqykc(v7.dxjokdxxww.dxjokdxxww(wkgbmnqykcVar2.zoijcleaow(), wkgbmnqykcVar3.zoijcleaow(), f13), v7.dxjokdxxww.dxjokdxxww(wkgbmnqykcVar2.ppxfxbqfkf(), wkgbmnqykcVar3.ppxfxbqfkf(), f13));
        return this.f61717dxjokdxxww;
    }
}
