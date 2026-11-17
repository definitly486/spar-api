package l7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo extends lqeggnwhkg {
    public gxszxtbevo(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public Integer dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        return Integer.valueOf(oxmwwwfdhm(iobyxmoadgVar, f13));
    }

    int oxmwwwfdhm(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        Integer num;
        if (iobyxmoadgVar.f118920zoijcleaow == null || iobyxmoadgVar.f118916ppxfxbqfkf == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61722eablkybsjg;
        return (ppxfxbqfkfVar == null || (num = (Integer) ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar.f118913lqeggnwhkg, iobyxmoadgVar.f118914nufgyqmvbu.floatValue(), (Integer) iobyxmoadgVar.f118920zoijcleaow, (Integer) iobyxmoadgVar.f118916ppxfxbqfkf, f13, eablkybsjg(), gxszxtbevo())) == null) ? v7.dxjokdxxww.btonecajqb(iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.eablkybsjg(), f13) : num.intValue();
    }

    public int vdvldrhtss() {
        return oxmwwwfdhm(zoijcleaow(), wkgbmnqykc());
    }
}
