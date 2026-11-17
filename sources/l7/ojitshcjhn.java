package l7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn extends lqeggnwhkg {

    class iobyxmoadg extends w7.ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ w7.ppxfxbqfkf f61739eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ o7.zoijcleaow f61740gxszxtbevo;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ w7.zoijcleaow f61742wkgbmnqykc;

        iobyxmoadg(w7.zoijcleaow zoijcleaowVar, w7.ppxfxbqfkf ppxfxbqfkfVar, o7.zoijcleaow zoijcleaowVar2) {
            this.f61742wkgbmnqykc = zoijcleaowVar;
            this.f61739eablkybsjg = ppxfxbqfkfVar;
            this.f61740gxszxtbevo = zoijcleaowVar2;
        }

        @Override // w7.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public o7.zoijcleaow iobyxmoadg(w7.zoijcleaow zoijcleaowVar) {
            this.f61742wkgbmnqykc.nufgyqmvbu(zoijcleaowVar.gxszxtbevo(), zoijcleaowVar.iobyxmoadg(), ((o7.zoijcleaow) zoijcleaowVar.lqeggnwhkg()).f72217iobyxmoadg, ((o7.zoijcleaow) zoijcleaowVar.zoijcleaow()).f72217iobyxmoadg, zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.eablkybsjg());
            String str = (String) this.f61739eablkybsjg.iobyxmoadg(this.f61742wkgbmnqykc);
            o7.zoijcleaow zoijcleaowVar2 = (o7.zoijcleaow) (zoijcleaowVar.ppxfxbqfkf() == 1.0f ? zoijcleaowVar.zoijcleaow() : zoijcleaowVar.lqeggnwhkg());
            this.f61740gxszxtbevo.iobyxmoadg(str, zoijcleaowVar2.f72223zoijcleaow, zoijcleaowVar2.f72220ppxfxbqfkf, zoijcleaowVar2.f72222wkgbmnqykc, zoijcleaowVar2.f72214eablkybsjg, zoijcleaowVar2.f72216gxszxtbevo, zoijcleaowVar2.f72218lqeggnwhkg, zoijcleaowVar2.f72219nufgyqmvbu, zoijcleaowVar2.f72213dxjokdxxww, zoijcleaowVar2.f72211btonecajqb, zoijcleaowVar2.f72215gtknphoqwx, zoijcleaowVar2.f72212draadjrbmk, zoijcleaowVar2.f72221wflxmlrfwp);
            return this.f61740gxszxtbevo;
        }
    }

    public ojitshcjhn(List list) {
        super(list);
    }

    public void oxmwwwfdhm(w7.ppxfxbqfkf ppxfxbqfkfVar) {
        super.ojitshcjhn(new iobyxmoadg(new w7.zoijcleaow(), ppxfxbqfkfVar, new o7.zoijcleaow()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public o7.zoijcleaow dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        Object obj;
        w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61722eablkybsjg;
        if (ppxfxbqfkfVar == null) {
            return (f13 != 1.0f || (obj = iobyxmoadgVar.f118916ppxfxbqfkf) == null) ? (o7.zoijcleaow) iobyxmoadgVar.f118920zoijcleaow : (o7.zoijcleaow) obj;
        }
        float f14 = iobyxmoadgVar.f118913lqeggnwhkg;
        Float f15 = iobyxmoadgVar.f118914nufgyqmvbu;
        float fFloatValue = f15 == null ? Float.MAX_VALUE : f15.floatValue();
        Object obj2 = iobyxmoadgVar.f118920zoijcleaow;
        o7.zoijcleaow zoijcleaowVar = (o7.zoijcleaow) obj2;
        Object obj3 = iobyxmoadgVar.f118916ppxfxbqfkf;
        return (o7.zoijcleaow) ppxfxbqfkfVar.zoijcleaow(f14, fFloatValue, zoijcleaowVar, obj3 == null ? (o7.zoijcleaow) obj2 : (o7.zoijcleaow) obj3, f13, wkgbmnqykc(), gxszxtbevo());
    }
}
