package bs0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vdvldrhtss {
    public static final rgvfuqvkyq iobyxmoadg(String address, String deliveryType, String deliveryPrice, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(deliveryType, "deliveryType");
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        if (z14) {
            return new rgvfuqvkyq.zoijcleaow(z15);
        }
        return new rgvfuqvkyq.iobyxmoadg(address, deliveryType, Integer.valueOf(z13 ? b31.gxszxtbevo.ic_address_delivery : b31.gxszxtbevo.ic_no_address), null, deliveryPrice, z13);
    }
}
