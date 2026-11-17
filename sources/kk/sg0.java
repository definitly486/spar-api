package kk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class sg0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58555zdlpuopuiu;

    public sg0(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        sg0 sg0Var = new sg0(gxszxtbevoVar);
        sg0Var.f58555zdlpuopuiu = obj;
        return sg0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        sg0 sg0Var = new sg0((lg.gxszxtbevo) obj2);
        sg0Var.f58555zdlpuopuiu = (String) obj;
        return sg0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        String str = (String) this.f58555zdlpuopuiu;
        Pattern patternCompile = Pattern.compile("(|^)\\d{5}");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(patternCompile, "compile(\"(|^)\\\\d{$OTP_CODE_LENGTH}\")");
        Matcher matcher = patternCompile.matcher(str);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(matcher, "pattern.matcher(it)");
        if (matcher.find()) {
            return new hg(matcher.group(0));
        }
        return null;
    }
}
