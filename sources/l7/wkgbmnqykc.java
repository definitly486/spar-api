package l7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc extends lqeggnwhkg {
    public wkgbmnqykc(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public Float dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        return Float.valueOf(oxmwwwfdhm(iobyxmoadgVar, f13));
    }

    float oxmwwwfdhm(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        Float f14;
        if (iobyxmoadgVar.f118920zoijcleaow == null || iobyxmoadgVar.f118916ppxfxbqfkf == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61722eablkybsjg;
        return (ppxfxbqfkfVar == null || (f14 = (Float) ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar.f118913lqeggnwhkg, iobyxmoadgVar.f118914nufgyqmvbu.floatValue(), (Float) iobyxmoadgVar.f118920zoijcleaow, (Float) iobyxmoadgVar.f118916ppxfxbqfkf, f13, eablkybsjg(), gxszxtbevo())) == null) ? v7.dxjokdxxww.dxjokdxxww(iobyxmoadgVar.lqeggnwhkg(), iobyxmoadgVar.wkgbmnqykc(), f13) : f14.floatValue();
    }

    public float vdvldrhtss() {
        return oxmwwwfdhm(zoijcleaow(), wkgbmnqykc());
    }
}
