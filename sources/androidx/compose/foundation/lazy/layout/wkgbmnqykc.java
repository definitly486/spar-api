package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements x.ylkuphrtab {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f5232ppxfxbqfkf = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f5233zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f5234iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f5236yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f5237zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f5236yggfygwlhe = obj;
            this.f5234iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.draadjrbmk(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar;
        Throwable th2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f5234iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f5234iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f5236yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f5234iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!this.f5233zoijcleaow) {
                kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2 = new kotlin.jvm.internal.hkdspvbjdz();
                try {
                    iobyxmoadgVar.f5237zdlpuopuiu = hkdspvbjdzVar2;
                    iobyxmoadgVar.f5234iwizpuwonk = 1;
                    pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar), 1);
                    rgvfuqvkyqVar.lereixgezr();
                    hkdspvbjdzVar2.f60015zdlpuopuiu = rgvfuqvkyqVar;
                    this.f5232ppxfxbqfkf.add(rgvfuqvkyqVar);
                    Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
                    if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                        kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(iobyxmoadgVar);
                    }
                    if (objZdlpuopuiu == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    hkdspvbjdzVar = hkdspvbjdzVar2;
                    List list = this.f5232ppxfxbqfkf;
                    kotlin.jvm.internal.mbcevpiqjq.iobyxmoadg(list).remove(hkdspvbjdzVar.f60015zdlpuopuiu);
                } catch (Throwable th3) {
                    hkdspvbjdzVar = hkdspvbjdzVar2;
                    th2 = th3;
                    List list2 = this.f5232ppxfxbqfkf;
                    kotlin.jvm.internal.mbcevpiqjq.iobyxmoadg(list2).remove(hkdspvbjdzVar.f60015zdlpuopuiu);
                    throw th2;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hkdspvbjdzVar = (kotlin.jvm.internal.hkdspvbjdz) iobyxmoadgVar.f5237zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
                List list3 = this.f5232ppxfxbqfkf;
                kotlin.jvm.internal.mbcevpiqjq.iobyxmoadg(list3).remove(hkdspvbjdzVar.f60015zdlpuopuiu);
            } catch (Throwable th4) {
                th2 = th4;
                List list4 = this.f5232ppxfxbqfkf;
                kotlin.jvm.internal.mbcevpiqjq.iobyxmoadg(list4).remove(hkdspvbjdzVar.f60015zdlpuopuiu);
                throw th2;
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // x.ylkuphrtab
    public void yggfygwlhe(x.rgvfuqvkyq rgvfuqvkyqVar) {
        if (this.f5233zoijcleaow) {
            return;
        }
        this.f5233zoijcleaow = true;
        List list = this.f5232ppxfxbqfkf;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            lg.gxszxtbevo gxszxtbevoVar = (lg.gxszxtbevo) list.get(i13);
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
        this.f5232ppxfxbqfkf.clear();
    }
}
