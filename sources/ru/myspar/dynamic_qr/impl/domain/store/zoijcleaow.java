package ru.myspar.dynamic_qr.impl.domain.store;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, false, false, new DynamicQrCodeStore$QrCodeType.Dynamic(((gxszxtbevo.zoijcleaow) msg).iobyxmoadg()), null, 11, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, false, false, new DynamicQrCodeStore$QrCodeType.Expired(((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg()), null, 11, null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return State.ppxfxbqfkf(state, false, false, new DynamicQrCodeStore$QrCodeType.Static(((gxszxtbevo.eablkybsjg) msg).iobyxmoadg()), null, 11, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), false, null, null, 14, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, false, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), 7, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
