package ow1;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/* JADX INFO: loaded from: classes6.dex */
public final class cqumvgiudr extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74884zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f74885cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f74887jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f74888yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74889zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74887jyumaefscl = obj;
            this.f74885cqumvgiudr |= Integer.MIN_VALUE;
            return cqumvgiudr.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqumvgiudr(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74884zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        LocalDate localDate;
        LocalDate localDate2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f74885cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f74885cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f74887jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f74885cqumvgiudr;
        boolean z13 = false;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iw1.iobyxmoadg iobyxmoadgVar2 = this.f74884zoijcleaow;
            if (!iobyxmoadgVar2.rgvfuqvkyq()) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDateZdlpuopuiu = iobyxmoadgVar2.zdlpuopuiu();
            if (localDateZdlpuopuiu == null) {
                localDateZdlpuopuiu = localDateNow;
            }
            iw1.iobyxmoadg iobyxmoadgVar3 = this.f74884zoijcleaow;
            iobyxmoadgVar.f74889zdlpuopuiu = localDateNow;
            iobyxmoadgVar.f74888yggfygwlhe = localDateZdlpuopuiu;
            iobyxmoadgVar.f74885cqumvgiudr = 1;
            Object objZynmafqrjb = iobyxmoadgVar3.zynmafqrjb(iobyxmoadgVar);
            if (objZynmafqrjb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            localDate = localDateZdlpuopuiu;
            obj = objZynmafqrjb;
            localDate2 = localDateNow;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localDate = (LocalDate) iobyxmoadgVar.f74888yggfygwlhe;
            localDate2 = (LocalDate) iobyxmoadgVar.f74889zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (localDate2.compareTo((ChronoLocalDate) localDate) >= 0 && !zBooleanValue) {
            z13 = true;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
