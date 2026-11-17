package qb2;

import android.content.Context;
import gg.wwaezpbzkn;
import ru.rustore.sdk.review.model.ReviewInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class jyumaefscl extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f78445yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ yadqdtsiqt f78446zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyumaefscl(yadqdtsiqt yadqdtsiqtVar, ReviewInfo reviewInfo) {
        super(1);
        this.f78446zdlpuopuiu = yadqdtsiqtVar;
        this.f78445yggfygwlhe = reviewInfo;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        Object objWkgbmnqykc;
        pb2.eablkybsjg emitter = (pb2.eablkybsjg) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(emitter, "emitter");
        yadqdtsiqt yadqdtsiqtVar = this.f78446zdlpuopuiu;
        ReviewInfo reviewInfo = this.f78445yggfygwlhe;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            Context context = yadqdtsiqtVar.f78474iobyxmoadg;
            String applicationId = yadqdtsiqtVar.f78475zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationId, "applicationId");
            yadqdtsiqt.iobyxmoadg(yadqdtsiqtVar, yadqdtsiqtVar.f78474iobyxmoadg, new kcexrzcfyt(emitter), new gxszxtbevo(context, reviewInfo, applicationId, new zdlpuopuiu(emitter), new yggfygwlhe(emitter)));
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
