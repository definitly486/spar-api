package g00;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.draadjrbmk;
import mj.rgvfuqvkyq;
import o30.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f35773iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // o30.gxszxtbevo
    public String iobyxmoadg(String smsMessage) {
        zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
        draadjrbmk draadjrbmkVarNufgyqmvbu = rgvfuqvkyq.nufgyqmvbu(new rgvfuqvkyq("[0-9]{4,6}"), smsMessage, 0, 2, null);
        String value = draadjrbmkVarNufgyqmvbu != null ? draadjrbmkVarNufgyqmvbu.getValue() : null;
        return value == null ? "" : value;
    }
}
