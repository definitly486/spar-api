package wy0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.draadjrbmk;
import mj.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements u11.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f120728iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // u11.ppxfxbqfkf
    public String iobyxmoadg(String smsMessage) {
        zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
        draadjrbmk draadjrbmkVarNufgyqmvbu = rgvfuqvkyq.nufgyqmvbu(new rgvfuqvkyq("[0-9]{4,6}"), smsMessage, 0, 2, null);
        String value = draadjrbmkVarNufgyqmvbu != null ? draadjrbmkVarNufgyqmvbu.getValue() : null;
        return value == null ? "" : value;
    }
}
