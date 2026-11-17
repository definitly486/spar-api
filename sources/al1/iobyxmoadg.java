package al1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zk1.iobyxmoadg f2185ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zk1.zoijcleaow f2186zoijcleaow;

    /* JADX INFO: renamed from: al1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0054iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f2187iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f2189yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f2190zdlpuopuiu;

        C0054iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f2189yggfygwlhe = obj;
            this.f2187iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(zk1.zoijcleaow qrsRepository, zk1.iobyxmoadg qrStatusesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(qrsRepository, "qrsRepository");
        zdlpuopuiu.btonecajqb(qrStatusesRepository, "qrStatusesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f2186zoijcleaow = qrsRepository;
        this.f2185ppxfxbqfkf = qrStatusesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        C0054iobyxmoadg c0054iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0054iobyxmoadg) {
            c0054iobyxmoadg = (C0054iobyxmoadg) gxszxtbevoVar;
            int i13 = c0054iobyxmoadg.f2187iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0054iobyxmoadg.f2187iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0054iobyxmoadg = new C0054iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0054iobyxmoadg = new C0054iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c0054iobyxmoadg.f2189yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0054iobyxmoadg.f2187iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) c0054iobyxmoadg.f2190zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        zk1.zoijcleaow zoijcleaowVar = this.f2186zoijcleaow;
        c0054iobyxmoadg.f2190zdlpuopuiu = this;
        c0054iobyxmoadg.f2187iwizpuwonk = 1;
        if (zoijcleaowVar.iobyxmoadg(c0054iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        zk1.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f2185ppxfxbqfkf;
        c0054iobyxmoadg.f2190zdlpuopuiu = null;
        c0054iobyxmoadg.f2187iwizpuwonk = 2;
        if (iobyxmoadgVar2.iobyxmoadg(c0054iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
