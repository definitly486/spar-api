package j10;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
public enum iobyxmoadg {
    PURCHASE_RATING("purchaseRating"),
    NONE(DevicePublicKeyStringDef.NONE);


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f50515zdlpuopuiu;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f50511esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C1080iobyxmoadg f50514yggfygwlhe = new C1080iobyxmoadg(null);

    /* JADX INFO: renamed from: j10.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1080iobyxmoadg {
        public /* synthetic */ C1080iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
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

        private C1080iobyxmoadg() {
        }
    }

    iobyxmoadg(String str) {
        this.f50515zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f50511esjtqupxsv;
    }

    public final String lqeggnwhkg() {
        return this.f50515zdlpuopuiu;
    }
}
