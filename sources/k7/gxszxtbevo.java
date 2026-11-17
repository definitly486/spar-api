package k7;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo implements wflxmlrfwp, l7.iobyxmoadg.zoijcleaow, gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final l7.iobyxmoadg f53985eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final q7.zoijcleaow f53986gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Path f53987iobyxmoadg = new Path();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zoijcleaow f53988lqeggnwhkg = new zoijcleaow();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f53989nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hcddaimhww f53990ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final l7.iobyxmoadg f53991wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f53992zoijcleaow;

    public gxszxtbevo(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.zoijcleaow zoijcleaowVar2) {
        this.f53992zoijcleaow = zoijcleaowVar2.zoijcleaow();
        this.f53990ppxfxbqfkf = hcddaimhwwVar;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = zoijcleaowVar2.wkgbmnqykc().eablkybsjg();
        this.f53991wkgbmnqykc = iobyxmoadgVarEablkybsjg;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = zoijcleaowVar2.ppxfxbqfkf().eablkybsjg();
        this.f53985eablkybsjg = iobyxmoadgVarEablkybsjg2;
        this.f53986gxszxtbevo = zoijcleaowVar2;
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg2);
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
        iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
    }

    private void lqeggnwhkg() {
        this.f53989nufgyqmvbu = false;
        this.f53990ppxfxbqfkf.invalidateSelf();
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f53992zoijcleaow;
    }

    @Override // k7.wflxmlrfwp
    public Path gxszxtbevo() {
        if (this.f53989nufgyqmvbu) {
            return this.f53987iobyxmoadg;
        }
        this.f53987iobyxmoadg.reset();
        if (this.f53986gxszxtbevo.eablkybsjg()) {
            this.f53989nufgyqmvbu = true;
            return this.f53987iobyxmoadg;
        }
        PointF pointF = (PointF) this.f53991wkgbmnqykc.nufgyqmvbu();
        float f13 = pointF.x / 2.0f;
        float f14 = pointF.y / 2.0f;
        float f15 = f13 * 0.55228f;
        float f16 = 0.55228f * f14;
        this.f53987iobyxmoadg.reset();
        if (this.f53986gxszxtbevo.gxszxtbevo()) {
            float f17 = -f14;
            this.f53987iobyxmoadg.moveTo(0.0f, f17);
            float f18 = 0.0f - f15;
            float f19 = -f13;
            float f23 = 0.0f - f16;
            this.f53987iobyxmoadg.cubicTo(f18, f17, f19, f23, f19, 0.0f);
            float f24 = f16 + 0.0f;
            this.f53987iobyxmoadg.cubicTo(f19, f24, f18, f14, 0.0f, f14);
            float f25 = f15 + 0.0f;
            this.f53987iobyxmoadg.cubicTo(f25, f14, f13, f24, f13, 0.0f);
            this.f53987iobyxmoadg.cubicTo(f13, f23, f25, f17, 0.0f, f17);
        } else {
            float f26 = -f14;
            this.f53987iobyxmoadg.moveTo(0.0f, f26);
            float f27 = f15 + 0.0f;
            float f28 = 0.0f - f16;
            this.f53987iobyxmoadg.cubicTo(f27, f26, f13, f28, f13, 0.0f);
            float f29 = f16 + 0.0f;
            this.f53987iobyxmoadg.cubicTo(f13, f29, f27, f14, 0.0f, f14);
            float f33 = 0.0f - f15;
            float f34 = -f13;
            this.f53987iobyxmoadg.cubicTo(f33, f14, f34, f29, f34, 0.0f);
            this.f53987iobyxmoadg.cubicTo(f34, f28, f33, f26, 0.0f, f26);
        }
        PointF pointF2 = (PointF) this.f53985eablkybsjg.nufgyqmvbu();
        this.f53987iobyxmoadg.offset(pointF2.x, pointF2.y);
        this.f53987iobyxmoadg.close();
        this.f53988lqeggnwhkg.zoijcleaow(this.f53987iobyxmoadg);
        this.f53989nufgyqmvbu = true;
        return this.f53987iobyxmoadg;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        lqeggnwhkg();
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        if (obj == dsvhmnatus.f20365gtknphoqwx) {
            this.f53991wkgbmnqykc.ojitshcjhn(ppxfxbqfkfVar);
        } else if (obj == dsvhmnatus.f20355agtfadlqog) {
            this.f53985eablkybsjg.ojitshcjhn(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(i13);
            if (ppxfxbqfkfVar instanceof yggfygwlhe) {
                yggfygwlhe yggfygwlheVar = (yggfygwlhe) ppxfxbqfkfVar;
                if (yggfygwlheVar.gtknphoqwx() == q7.zdlpuopuiu.iobyxmoadg.SIMULTANEOUSLY) {
                    this.f53988lqeggnwhkg.iobyxmoadg(yggfygwlheVar);
                    yggfygwlheVar.ppxfxbqfkf(this);
                }
            }
        }
    }
}
