package hh1;

import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public enum eablkybsjg {
    PRODUCT_TYPE("product"),
    IMAGE_TYPE("image"),
    TEXT_TYPE("text"),
    PROMO_CODE_TYPE("promocode"),
    APP_UPDATE_TYPE("app_update");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f40366zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f40365zynmafqrjb = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f40364yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final eablkybsjg iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = eablkybsjg.wkgbmnqykc().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (zdlpuopuiu.eablkybsjg(((eablkybsjg) next).lqeggnwhkg(), value)) {
                    return (eablkybsjg) next;
                }
            }
            next = null;
            return (eablkybsjg) next;
        }

        private iobyxmoadg() {
        }
    }

    eablkybsjg(String str) {
        this.f40366zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f40365zynmafqrjb;
    }

    public final String lqeggnwhkg() {
        return this.f40366zdlpuopuiu;
    }
}
