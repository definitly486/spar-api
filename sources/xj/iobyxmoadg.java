package xj;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes3.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f122606iobyxmoadg;

    /* JADX INFO: renamed from: xj.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class RunnableC3085iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f122607yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ btonecajqb f122608zdlpuopuiu;

        public RunnableC3085iobyxmoadg(btonecajqb btonecajqbVar, iobyxmoadg iobyxmoadgVar) {
            this.f122608zdlpuopuiu = btonecajqbVar;
            this.f122607yggfygwlhe = iobyxmoadgVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f122608zdlpuopuiu.gxszxtbevo(this.f122607yggfygwlhe, wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f122609zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(3, iobyxmoadg.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((iobyxmoadg) obj, (btonecajqb) obj2, obj3);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar, Object obj) {
            iobyxmoadgVar.ppxfxbqfkf(btonecajqbVar, obj);
        }
    }

    public iobyxmoadg(long j13) {
        this.f122606iobyxmoadg = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ppxfxbqfkf(btonecajqb btonecajqbVar, Object obj) {
        if (this.f122606iobyxmoadg <= 0) {
            btonecajqbVar.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            return;
        }
        RunnableC3085iobyxmoadg runnableC3085iobyxmoadg = new RunnableC3085iobyxmoadg(btonecajqbVar, this);
        zdlpuopuiu.nufgyqmvbu(btonecajqbVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) btonecajqbVar;
        lg.btonecajqb context = dxjokdxxwwVar.getContext();
        dxjokdxxwwVar.agtfadlqog(crxdokpmqz.wkgbmnqykc(context).hkdspvbjdz(this.f122606iobyxmoadg, runnableC3085iobyxmoadg, context));
    }

    public final wkgbmnqykc zoijcleaow() {
        zoijcleaow zoijcleaowVar = zoijcleaow.f122609zdlpuopuiu;
        zdlpuopuiu.nufgyqmvbu(zoijcleaowVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new eablkybsjg(this, (tg.vdvldrhtss) mbcevpiqjq.eablkybsjg(zoijcleaowVar, 3), null, 4, null);
    }
}
