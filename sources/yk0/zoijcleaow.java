package yk0;

import j0.l;
import j0.m;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p0.tzroggbefp;
import ru.myspar.proloyalty.activation_card.impl.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final tzroggbefp zoijcleaow(tzroggbefp tzroggbefpVar) throws IOException {
        String strDraadjrbmk = tzroggbefpVar.draadjrbmk();
        StringBuilder sb3 = new StringBuilder();
        int length = strDraadjrbmk.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = strDraadjrbmk.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        return tzroggbefp.nufgyqmvbu(tzroggbefpVar, kcexrzcfyt.y(sb3.toString(), 16), 0L, null, 6, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        tzroggbefp tzroggbefpVarZoijcleaow;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, zoijcleaow(((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg()), false, null, false, false, 30, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, false, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), false, false, 27, null);
        }
        if (msg instanceof gxszxtbevo.C3199gxszxtbevo) {
            String strIobyxmoadg = ((gxszxtbevo.C3199gxszxtbevo) msg).iobyxmoadg();
            return State.ppxfxbqfkf(state, (strIobyxmoadg == null || (tzroggbefpVarZoijcleaow = zoijcleaow(new tzroggbefp(strIobyxmoadg, m.iobyxmoadg(strIobyxmoadg.length()), (l) null, 4, (gtknphoqwx) null))) == null) ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVarZoijcleaow, false, null, false, false, 30, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, false, null, false, false, 23, null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return State.ppxfxbqfkf(state, null, false, null, true, false, 23, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, null, false, null, false, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), 15, null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), null, false, false, 29, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
