package qb2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import gg.wwaezpbzkn;
import ru.rustore.sdk.review.errors.RuStoreReviewStartException;
import ru.rustore.sdk.review.model.ReviewInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class zynmafqrjb extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f78478yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ yadqdtsiqt f78479zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zynmafqrjb(yadqdtsiqt yadqdtsiqtVar, ReviewInfo reviewInfo) {
        super(1);
        this.f78479zdlpuopuiu = yadqdtsiqtVar;
        this.f78478yggfygwlhe = reviewInfo;
    }

    public static final void lqeggnwhkg(pb2.eablkybsjg emitter, ru.rustore.sdk.activitylauncher.iobyxmoadg launcherResult, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(emitter, "$emitter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(launcherResult, "launcherResult");
        if (launcherResult instanceof ru.rustore.sdk.activitylauncher.iobyxmoadg.wkgbmnqykc ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(launcherResult, ru.rustore.sdk.activitylauncher.iobyxmoadg.eablkybsjg.f104812ppxfxbqfkf) ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(launcherResult, ru.rustore.sdk.activitylauncher.iobyxmoadg.gxszxtbevo.f104813ppxfxbqfkf) ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(launcherResult, ru.rustore.sdk.activitylauncher.iobyxmoadg.C2540iobyxmoadg.f104814ppxfxbqfkf)) {
            emitter.ppxfxbqfkf(new RuStoreReviewStartException());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(launcherResult, ru.rustore.sdk.activitylauncher.iobyxmoadg.zoijcleaow.f104817ppxfxbqfkf) ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(launcherResult, ru.rustore.sdk.activitylauncher.iobyxmoadg.ppxfxbqfkf.f104815ppxfxbqfkf)) {
            emitter.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    @Override // tg.draadjrbmk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iobyxmoadg((pb2.eablkybsjg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void iobyxmoadg(final pb2.eablkybsjg emitter) {
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(emitter, "emitter");
        yadqdtsiqt yadqdtsiqtVar = this.f78479zdlpuopuiu;
        ReviewInfo reviewInfo = this.f78478yggfygwlhe;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            Context context = yadqdtsiqtVar.f78474iobyxmoadg;
            Intent intent = new Intent("ru.vk.store.RequestAppReview");
            intent.putExtra("KEY_APPLICATION_ID", yadqdtsiqtVar.f78475zoijcleaow);
            intent.putExtras(reviewInfo.toBundle$sdk_public_review_release());
            ru.rustore.sdk.activitylauncher.ppxfxbqfkf.iobyxmoadg(context, intent, new ib2.zoijcleaow() { // from class: qb2.pmvmpeiblj
                @Override // ib2.zoijcleaow
                public final void iobyxmoadg(ru.rustore.sdk.activitylauncher.iobyxmoadg iobyxmoadgVar2, Bundle bundle) {
                    zynmafqrjb.lqeggnwhkg(emitter, iobyxmoadgVar2, bundle);
                }
            });
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            emitter.ppxfxbqfkf(thDxjokdxxww);
        }
    }
}
