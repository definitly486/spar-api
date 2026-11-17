package zz0;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public enum iobyxmoadg {
    PURCHASE_RATING("purchaseRating"),
    NONE(DevicePublicKeyStringDef.NONE);


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f131706zdlpuopuiu;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f131702esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C3368iobyxmoadg f131705yggfygwlhe = new C3368iobyxmoadg(null);

    /* JADX INFO: renamed from: zz0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3368iobyxmoadg {
        public /* synthetic */ C3368iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = iobyxmoadg.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kcexrzcfyt.cqumvgiudr(((iobyxmoadg) next).lqeggnwhkg(), value, true));
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) next;
            return iobyxmoadgVar == null ? iobyxmoadg.NONE : iobyxmoadgVar;
        }

        private C3368iobyxmoadg() {
        }
    }

    iobyxmoadg(String str) {
        this.f131706zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f131702esjtqupxsv;
    }

    public final String lqeggnwhkg() {
        return this.f131706zdlpuopuiu;
    }
}
