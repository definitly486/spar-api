package ru.myspar.tipsorder.impl.domain.store;

import java.io.IOException;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p0.tzroggbefp;
import ru.myspar.tipsorder.impl.domain.model.TipValue;
import ru.myspar.tipsorder.impl.domain.model.TipsOrderParams;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final TipsOrderParams ppxfxbqfkf(TipsOrderParams tipsOrderParams, String str, tzroggbefp tzroggbefpVar) {
        TipValue tipValuePpxfxbqfkf;
        Map mapIwizpuwonk = hg.tzroggbefp.iwizpuwonk(tipsOrderParams.getTips());
        TipValue tipValue = (TipValue) mapIwizpuwonk.get(str);
        if (tipValue != null && (tipValuePpxfxbqfkf = TipValue.ppxfxbqfkf(tipValue, null, null, wkgbmnqykc(tzroggbefpVar), 0, 0, 27, null)) != null) {
            mapIwizpuwonk.put(str, tipValuePpxfxbqfkf);
        }
        return TipsOrderParams.ppxfxbqfkf(tipsOrderParams, mapIwizpuwonk, null, null, 6, null);
    }

    private final tzroggbefp wkgbmnqykc(tzroggbefp tzroggbefpVar) throws IOException {
        String strDraadjrbmk = tzroggbefpVar.draadjrbmk();
        StringBuilder sb3 = new StringBuilder();
        int length = strDraadjrbmk.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = strDraadjrbmk.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        Long lKcexrzcfyt = kcexrzcfyt.kcexrzcfyt(sb3.toString());
        String string = lKcexrzcfyt != null ? lKcexrzcfyt.toString() : null;
        if (string == null) {
            string = "";
        }
        return tzroggbefp.nufgyqmvbu(tzroggbefpVar, string, 0L, null, 6, null);
    }

    private final TipsOrderParams zoijcleaow(TipsOrderParams tipsOrderParams, String str) {
        return TipsOrderParams.ppxfxbqfkf(tipsOrderParams, null, null, str, 3, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return State.ppxfxbqfkf(state, null, false, ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), null, false, 27, null);
        }
        TipsOrderParams tipsOrderParamsPpxfxbqfkf = null;
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            TipsOrderParams tipsOrderParams = state.getTipsOrderParams();
            return State.ppxfxbqfkf(state, null, false, tipsOrderParams != null ? zoijcleaow(tipsOrderParams, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg()) : null, null, false, 27, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            TipsOrderParams tipsOrderParams2 = state.getTipsOrderParams();
            if (tipsOrderParams2 != null) {
                gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (gxszxtbevo.wkgbmnqykc) msg;
                tipsOrderParamsPpxfxbqfkf = ppxfxbqfkf(tipsOrderParams2, wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow());
            }
            return State.ppxfxbqfkf(state, null, false, tipsOrderParamsPpxfxbqfkf, null, false, 27, null);
        }
        if (msg instanceof gxszxtbevo.C2531gxszxtbevo) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.C2531gxszxtbevo) msg).iobyxmoadg(), null, null, false, 29, null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return State.ppxfxbqfkf(state, null, false, null, null, ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), 15, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, false, null, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), false, 23, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.iobyxmoadg.f104551iobyxmoadg)) {
            return State.ppxfxbqfkf(state, null, false, null, null, false, 19, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
