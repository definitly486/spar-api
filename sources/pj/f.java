package pj;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f76696cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f76697iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f76698jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f76699yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f76700zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76697iwizpuwonk = obj;
            this.f76696cqumvgiudr |= Integer.MIN_VALUE;
            return f.wkgbmnqykc(0L, null, this);
        }
    }

    public static final Object eablkybsjg(long j13, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(crxdokpmqz.eablkybsjg(j13), rgvfuqvkyqVar, gxszxtbevoVar);
    }

    public static final TimeoutCancellationException iobyxmoadg(long j13, sopmlzcsov sopmlzcsovVar, auzgnhcxok auzgnhcxokVar) {
        return new TimeoutCancellationException("Timed out waiting for " + j13 + " ms", auzgnhcxokVar);
    }

    public static final Object ppxfxbqfkf(long j13, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (j13 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objZoijcleaow = zoijcleaow(new e(j13, gxszxtbevoVar), rgvfuqvkyqVar);
        if (objZoijcleaow == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZoijcleaow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object wkgbmnqykc(long j13, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f76696cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f76696cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f76697iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f76696cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (j13 <= 0) {
                return null;
            }
            kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2 = new kotlin.jvm.internal.hkdspvbjdz();
            try {
                iobyxmoadgVar.f76699yggfygwlhe = rgvfuqvkyqVar;
                iobyxmoadgVar.f76698jyumaefscl = hkdspvbjdzVar2;
                iobyxmoadgVar.f76700zdlpuopuiu = j13;
                iobyxmoadgVar.f76696cqumvgiudr = 1;
                e eVar = new e(j13, iobyxmoadgVar);
                hkdspvbjdzVar2.f60015zdlpuopuiu = eVar;
                Object objZoijcleaow = zoijcleaow(eVar, rgvfuqvkyqVar);
                if (objZoijcleaow == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(iobyxmoadgVar);
                }
                return objZoijcleaow == objGxszxtbevo ? objGxszxtbevo : objZoijcleaow;
            } catch (TimeoutCancellationException e13) {
                e = e13;
                hkdspvbjdzVar = hkdspvbjdzVar2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hkdspvbjdzVar = (kotlin.jvm.internal.hkdspvbjdz) iobyxmoadgVar.f76698jyumaefscl;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
                return obj;
            } catch (TimeoutCancellationException e14) {
                e = e14;
            }
        }
        if (e.coroutine == hkdspvbjdzVar.f60015zdlpuopuiu) {
            return null;
        }
        throw e;
    }

    private static final Object zoijcleaow(e eVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        dvvnrvtcbc.nufgyqmvbu(eVar, crxdokpmqz.wkgbmnqykc(eVar.f113643iwizpuwonk.getContext()).hkdspvbjdz(eVar.f76685cqumvgiudr, eVar, eVar.getContext()));
        return vj.zoijcleaow.ppxfxbqfkf(eVar, eVar, rgvfuqvkyqVar);
    }
}
