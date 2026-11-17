package kk;

import npi.spay.Fn;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ b9 f56811jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ m60 f56812yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56813zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m60 m60Var, b9 b9Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56812yggfygwlhe = m60Var;
        this.f56811jyumaefscl = b9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new h0(this.f56812yggfygwlhe, this.f56811jyumaefscl, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new h0(this.f56812yggfygwlhe, this.f56811jyumaefscl, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56813zdlpuopuiu;
        gg.wwaezpbzkn wwaezpbzknVar = null;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            e eVar = new e(this.f56812yggfygwlhe, null);
            this.f56813zdlpuopuiu = 1;
            obj = pj.f.wkgbmnqykc(20000L, eVar, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        if (((gg.wwaezpbzkn) obj) != null) {
            ((ve) this.f56811jyumaefscl.f55949wflxmlrfwp).zoijcleaow(nd0.f57798iobyxmoadg);
            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (wwaezpbzknVar != null) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        throw Fn.f70545zdlpuopuiu;
    }
}
