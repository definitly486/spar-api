package nb2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class zynmafqrjb extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final zynmafqrjb f69641zdlpuopuiu = new zynmafqrjb();

    public zynmafqrjb() {
        super(1);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(this, *args)");
        return str;
    }
}
