package at;

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

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f14449iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pmvmpeiblj f14450ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f14451zoijcleaow;

    /* JADX INFO: renamed from: at.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0231iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f14452yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f14453zdlpuopuiu;

        /* JADX INFO: renamed from: at.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0232iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ String f14454yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f14455zdlpuopuiu;

            /* JADX INFO: renamed from: at.iobyxmoadg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0233iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f14457yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f14458zdlpuopuiu;

                public C0233iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f14458zdlpuopuiu = obj;
                    this.f14457yggfygwlhe |= Integer.MIN_VALUE;
                    return C0232iobyxmoadg.this.emit(null, this);
                }
            }

            public C0232iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, String str) {
                this.f14455zdlpuopuiu = nufgyqmvbuVar;
                this.f14454yggfygwlhe = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C0233iobyxmoadg c0233iobyxmoadg;
                if (gxszxtbevoVar instanceof C0233iobyxmoadg) {
                    c0233iobyxmoadg = (C0233iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0233iobyxmoadg.f14457yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0233iobyxmoadg.f14457yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0233iobyxmoadg = new C0233iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0233iobyxmoadg = new C0233iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0233iobyxmoadg.f14458zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0233iobyxmoadg.f14457yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f14455zdlpuopuiu;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) obj).iobyxmoadg(), this.f14454yggfygwlhe)) {
                        c0233iobyxmoadg.f14457yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0233iobyxmoadg) == objGxszxtbevo) {
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

        public C0231iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, String str) {
            this.f14453zdlpuopuiu = lqeggnwhkgVar;
            this.f14452yggfygwlhe = str;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f14453zdlpuopuiu.collect(new C0232iobyxmoadg(nufgyqmvbuVar, this.f14452yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f14459iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f14460jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14462zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, List list, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14460jyumaefscl = str;
            this.f14459iwizpuwonk = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f14460jyumaefscl, this.f14459iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14462zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                pmvmpeiblj pmvmpeibljVar = iobyxmoadg.this.f14449iobyxmoadg;
                at.zoijcleaow zoijcleaowVar = new at.zoijcleaow(this.f14460jyumaefscl, this.f14459iwizpuwonk);
                this.f14462zdlpuopuiu = 1;
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
        this.f14449iobyxmoadg = pmvmpeibljVarZoijcleaow;
        this.f14451zoijcleaow = pmvmpeibljVarZoijcleaow;
        this.f14450ppxfxbqfkf = sj.wwaezpbzkn.zoijcleaow(0, 0, null, 7, null);
    }

    public final Object eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        Object objEmit = this.f14450ppxfxbqfkf.emit(ppxfxbqfkfVar, gxszxtbevoVar);
        return objEmit == mg.zoijcleaow.gxszxtbevo() ? objEmit : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object ppxfxbqfkf(String str, List list, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.pmvmpeiblj(new C0231iobyxmoadg(dxjokdxxww.tzroggbefp(this.f14450ppxfxbqfkf, new zoijcleaow(str, list, null)), str), gxszxtbevoVar);
    }

    public final lqeggnwhkg wkgbmnqykc() {
        return this.f14451zoijcleaow;
    }

    public final Object zoijcleaow(String str, String str2, gxszxtbevo gxszxtbevoVar) {
        return ppxfxbqfkf(str, jyumaefscl.eablkybsjg(str2), gxszxtbevoVar);
    }
}
