package a01;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public enum ppxfxbqfkf {
    COMBO("combo"),
    RECOMMENDATIONS("feed"),
    PROMO_BANNER("banner"),
    NONE(DevicePublicKeyStringDef.NONE);


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f112pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f113yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f114zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(String serverValue) {
            Object next;
            zdlpuopuiu.btonecajqb(serverValue, "serverValue");
            Iterator<E> it = ppxfxbqfkf.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) next).lqeggnwhkg(), serverValue));
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) next;
            return ppxfxbqfkfVar == null ? ppxfxbqfkf.NONE : ppxfxbqfkfVar;
        }

        private iobyxmoadg() {
        }
    }

    ppxfxbqfkf(String str) {
        this.f114zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f112pmvmpeiblj;
    }

    public final String lqeggnwhkg() {
        return this.f114zdlpuopuiu;
    }
}
