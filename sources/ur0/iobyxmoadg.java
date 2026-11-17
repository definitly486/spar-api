package ur0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.pmvmpeiblj;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f114244iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pmvmpeiblj f114245ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f114246zoijcleaow;

    /* JADX INFO: renamed from: ur0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2831iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f114247yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f114248zdlpuopuiu;

        /* JADX INFO: renamed from: ur0.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2832iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ String f114249yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f114250zdlpuopuiu;

            /* JADX INFO: renamed from: ur0.iobyxmoadg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2833iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f114252yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f114253zdlpuopuiu;

                public C2833iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f114253zdlpuopuiu = obj;
                    this.f114252yggfygwlhe |= Integer.MIN_VALUE;
                    return C2832iobyxmoadg.this.emit(null, this);
                }
            }

            public C2832iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, String str) {
                this.f114250zdlpuopuiu = nufgyqmvbuVar;
                this.f114249yggfygwlhe = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C2833iobyxmoadg c2833iobyxmoadg;
                if (gxszxtbevoVar instanceof C2833iobyxmoadg) {
                    c2833iobyxmoadg = (C2833iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2833iobyxmoadg.f114252yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2833iobyxmoadg.f114252yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2833iobyxmoadg = new C2833iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2833iobyxmoadg = new C2833iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2833iobyxmoadg.f114253zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2833iobyxmoadg.f114252yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f114250zdlpuopuiu;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) obj).iobyxmoadg(), this.f114249yggfygwlhe)) {
                        c2833iobyxmoadg.f114252yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2833iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public C2831iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, String str) {
            this.f114248zdlpuopuiu = lqeggnwhkgVar;
            this.f114247yggfygwlhe = str;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f114248zdlpuopuiu.collect(new C2832iobyxmoadg(nufgyqmvbuVar, this.f114247yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f114254iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f114255jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f114257zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, List list, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f114255jyumaefscl = str;
            this.f114254iwizpuwonk = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f114255jyumaefscl, this.f114254iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f114257zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                pmvmpeiblj pmvmpeibljVar = iobyxmoadg.this.f114244iobyxmoadg;
                ur0.zoijcleaow zoijcleaowVar = new ur0.zoijcleaow(this.f114255jyumaefscl, this.f114254iwizpuwonk);
                this.f114257zdlpuopuiu = 1;
                if (pmvmpeibljVar.emit(zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg() {
        pmvmpeiblj pmvmpeibljVarZoijcleaow = sj.wwaezpbzkn.zoijcleaow(0, 0, null, 7, null);
        this.f114244iobyxmoadg = pmvmpeibljVarZoijcleaow;
        this.f114246zoijcleaow = pmvmpeibljVarZoijcleaow;
        this.f114245ppxfxbqfkf = sj.wwaezpbzkn.zoijcleaow(0, 0, null, 7, null);
    }

    public final Object eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        Object objEmit = this.f114245ppxfxbqfkf.emit(ppxfxbqfkfVar, gxszxtbevoVar);
        return objEmit == mg.zoijcleaow.gxszxtbevo() ? objEmit : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object ppxfxbqfkf(String str, List list, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.pmvmpeiblj(new C2831iobyxmoadg(dxjokdxxww.tzroggbefp(this.f114245ppxfxbqfkf, new zoijcleaow(str, list, null)), str), gxszxtbevoVar);
    }

    public final lqeggnwhkg wkgbmnqykc() {
        return this.f114246zoijcleaow;
    }

    public final Object zoijcleaow(String str, String str2, gxszxtbevo gxszxtbevoVar) {
        return ppxfxbqfkf(str, jyumaefscl.eablkybsjg(str2), gxszxtbevoVar);
    }
}
