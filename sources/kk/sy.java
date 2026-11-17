package kk;

import spay.sdk.domain.model.FakeBankAuthData;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class sy extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ xz f58589yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58590zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(xz xzVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58589yggfygwlhe = xzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new sy(this.f58589yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new sy(this.f58589yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58590zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            pn pnVar = this.f58589yggfygwlhe.f59355wkgbmnqykc;
            this.f58590zdlpuopuiu = 1;
            pj.ikoacuggdj.zoijcleaow();
            ContentResponse.Success success = ((auzgnhcxok) pnVar.f58103iobyxmoadg).f55865ppxfxbqfkf;
            if (success == null) {
                success = null;
            }
            obj = success != null ? (SessionIdResponseBody) success.getData() : null;
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) obj;
        this.f58589yggfygwlhe.f59350eablkybsjg.setValue(new FakeBankAuthData(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), sessionIdResponseBody != null ? sessionIdResponseBody.getState() : null, sessionIdResponseBody != null ? sessionIdResponseBody.getNonce() : null, "E9604229-C3CC-D584-070A-DE59D36A78C3", null, null, 48, null));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
