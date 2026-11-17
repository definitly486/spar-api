package ht;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dxjokdxxww {
    public static final nufgyqmvbu iobyxmoadg(String address, String deliveryType, String deliveryPrice, boolean z13) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(deliveryType, "deliveryType");
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        return new nufgyqmvbu(address, deliveryType, Integer.valueOf(z13 ? s40.gxszxtbevo.ic_address_delivery : s40.gxszxtbevo.ic_no_address), null, deliveryPrice, z13);
    }
}
