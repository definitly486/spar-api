package k10;

import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public enum ppxfxbqfkf {
    COMBO_ONLY("comboOnly"),
    FEED_ONLY("feedOnly"),
    COMBO_FIRST("comboFirst"),
    FEED_FIRST("feedFirst");


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f53451pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f53452yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f53453zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(String serverValue) {
            Object next;
            zdlpuopuiu.btonecajqb(serverValue, "serverValue");
            Iterator<E> it = ppxfxbqfkf.wkgbmnqykc().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) next).lqeggnwhkg(), serverValue)) {
                    return (ppxfxbqfkf) next;
                }
            }
            next = null;
            return (ppxfxbqfkf) next;
        }

        private iobyxmoadg() {
        }
    }

    ppxfxbqfkf(String str) {
        this.f53453zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f53451pmvmpeiblj;
    }

    public final String lqeggnwhkg() {
        return this.f53453zdlpuopuiu;
    }
}
