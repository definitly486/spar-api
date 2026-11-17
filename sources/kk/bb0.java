package kk;

import java.util.List;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class bb0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ List f55964jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f55965yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f55966zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(npi.spay.uo uoVar, List list, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f55965yggfygwlhe = uoVar;
        this.f55964jyumaefscl = list;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new bb0(this.f55965yggfygwlhe, this.f55964jyumaefscl, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new bb0(this.f55965yggfygwlhe, this.f55964jyumaefscl, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f55966zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            va vaVar = this.f55965yggfygwlhe.f70586esjtqupxsv;
            if (vaVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("emissionsAuth");
                vaVar = null;
            }
            List list = this.f55964jyumaefscl;
            androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = this.f55965yggfygwlhe.requireActivity();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(oxmwwwfdhmVarRequireActivity, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
            this.f55966zdlpuopuiu = 1;
            obj = vaVar.iobyxmoadg(list, (RedirectActivity) oxmwwwfdhmVarRequireActivity, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        ((dvvnrvtcbc) this.f55965yggfygwlhe.hcddaimhww()).agtfadlqog((sh0) obj);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
