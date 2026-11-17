package lg;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface lqeggnwhkg extends btonecajqb.zoijcleaow {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final zoijcleaow f62508dxjokdxxww = zoijcleaow.f62509zdlpuopuiu;

    public static final class iobyxmoadg {
        public static btonecajqb.zoijcleaow iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, btonecajqb.ppxfxbqfkf key) {
            btonecajqb.zoijcleaow zoijcleaowVarZoijcleaow;
            zdlpuopuiu.btonecajqb(key, "key");
            if (!(key instanceof lg.zoijcleaow)) {
                if (lqeggnwhkg.f62508dxjokdxxww != key) {
                    return null;
                }
                zdlpuopuiu.nufgyqmvbu(lqeggnwhkgVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return lqeggnwhkgVar;
            }
            lg.zoijcleaow zoijcleaowVar = (lg.zoijcleaow) key;
            if (!zoijcleaowVar.iobyxmoadg(lqeggnwhkgVar.getKey()) || (zoijcleaowVarZoijcleaow = zoijcleaowVar.zoijcleaow(lqeggnwhkgVar)) == null) {
                return null;
            }
            return zoijcleaowVarZoijcleaow;
        }

        public static btonecajqb zoijcleaow(lqeggnwhkg lqeggnwhkgVar, btonecajqb.ppxfxbqfkf key) {
            zdlpuopuiu.btonecajqb(key, "key");
            if (!(key instanceof lg.zoijcleaow)) {
                return lqeggnwhkg.f62508dxjokdxxww == key ? gtknphoqwx.f62507zdlpuopuiu : lqeggnwhkgVar;
            }
            lg.zoijcleaow zoijcleaowVar = (lg.zoijcleaow) key;
            return (!zoijcleaowVar.iobyxmoadg(lqeggnwhkgVar.getKey()) || zoijcleaowVar.zoijcleaow(lqeggnwhkgVar) == null) ? lqeggnwhkgVar : gtknphoqwx.f62507zdlpuopuiu;
        }
    }

    public static final class zoijcleaow implements btonecajqb.ppxfxbqfkf {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        static final /* synthetic */ zoijcleaow f62509zdlpuopuiu = new zoijcleaow();

        private zoijcleaow() {
        }
    }

    void btonecajqb(gxszxtbevo gxszxtbevoVar);

    gxszxtbevo ojitshcjhn(gxszxtbevo gxszxtbevoVar);
}
