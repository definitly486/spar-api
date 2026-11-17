package uj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final istkbnxepw f113647iobyxmoadg = new istkbnxepw("CLOSED");

    public static final Object ppxfxbqfkf(lereixgezr lereixgezrVar, long j13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        while (true) {
            if (lereixgezrVar.f113652jyumaefscl >= j13 && !lereixgezrVar.gtknphoqwx()) {
                return pmvmpeiblj.iobyxmoadg(lereixgezrVar);
            }
            Object objLqeggnwhkg = lereixgezrVar.lqeggnwhkg();
            if (objLqeggnwhkg == f113647iobyxmoadg) {
                return pmvmpeiblj.iobyxmoadg(f113647iobyxmoadg);
            }
            lereixgezr lereixgezrVar2 = (lereixgezr) ((zoijcleaow) objLqeggnwhkg);
            if (lereixgezrVar2 == null) {
                lereixgezrVar2 = (lereixgezr) rgvfuqvkyqVar.invoke(Long.valueOf(lereixgezrVar.f113652jyumaefscl + 1), lereixgezrVar);
                if (lereixgezrVar.ojitshcjhn(lereixgezrVar2)) {
                    if (lereixgezrVar.gtknphoqwx()) {
                        lereixgezrVar.agtfadlqog();
                    }
                }
            }
            lereixgezrVar = lereixgezrVar2;
        }
    }

    public static final zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar) {
        while (true) {
            Object objLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
            if (objLqeggnwhkg == f113647iobyxmoadg) {
                return zoijcleaowVar;
            }
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) objLqeggnwhkg;
            if (zoijcleaowVar2 != null) {
                zoijcleaowVar = zoijcleaowVar2;
            } else if (zoijcleaowVar.wflxmlrfwp()) {
                return zoijcleaowVar;
            }
        }
    }
}
