package pf0;

import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public enum zoijcleaow {
    PRODUCT_TYPE("product"),
    IMAGE_TYPE("image"),
    TEXT_TYPE("text"),
    PROMO_CODE_TYPE("promocode"),
    APP_UPDATE_TYPE("app_update");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f76552zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f76551zynmafqrjb = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f76550yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = zoijcleaow.wkgbmnqykc().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (zdlpuopuiu.eablkybsjg(((zoijcleaow) next).lqeggnwhkg(), value)) {
                    return (zoijcleaow) next;
                }
            }
            next = null;
            return (zoijcleaow) next;
        }

        private iobyxmoadg() {
        }
    }

    zoijcleaow(String str) {
        this.f76552zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f76551zynmafqrjb;
    }

    public final String lqeggnwhkg() {
        return this.f76552zdlpuopuiu;
    }
}
