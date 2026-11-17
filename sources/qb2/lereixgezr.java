package qb2;

import android.content.Context;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes6.dex */
public final class lereixgezr extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ yadqdtsiqt f78448zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lereixgezr(yadqdtsiqt yadqdtsiqtVar) {
        super(1);
        this.f78448zdlpuopuiu = yadqdtsiqtVar;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        Object objWkgbmnqykc;
        pb2.eablkybsjg emitter = (pb2.eablkybsjg) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(emitter, "emitter");
        yadqdtsiqt yadqdtsiqtVar = this.f78448zdlpuopuiu;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            Context context = yadqdtsiqtVar.f78474iobyxmoadg;
            String applicationId = yadqdtsiqtVar.f78475zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationId, "applicationId");
            yadqdtsiqt.iobyxmoadg(yadqdtsiqtVar, yadqdtsiqtVar.f78474iobyxmoadg, new iwizpuwonk(emitter), new gtknphoqwx(context, applicationId, new cqumvgiudr(emitter), new esjtqupxsv(emitter)));
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            emitter.ppxfxbqfkf(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
