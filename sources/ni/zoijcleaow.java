package ni;

import java.util.List;
import jh.lmojexxdyd;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow extends lqeggnwhkg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f70115zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(List value, tg.draadjrbmk computeType) {
        super(value);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(computeType, "computeType");
        this.f70115zoijcleaow = computeType;
    }

    @Override // ni.lqeggnwhkg
    public kegysxyocb iobyxmoadg(lmojexxdyd module) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        kegysxyocb kegysxyocbVar = (kegysxyocb) this.f70115zoijcleaow.invoke(module);
        if (!gh.dxjokdxxww.ikoacuggdj(kegysxyocbVar) && !gh.dxjokdxxww.opjhrmiecq(kegysxyocbVar)) {
            gh.dxjokdxxww.igdgnonuha(kegysxyocbVar);
        }
        return kegysxyocbVar;
    }
}
