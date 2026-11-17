package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class zynmafqrjb extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hw1.zoijcleaow f75004ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f75005zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f75006cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f75008jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f75009yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75010zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75008jyumaefscl = obj;
            this.f75006cqumvgiudr |= Integer.MIN_VALUE;
            return zynmafqrjb.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zynmafqrjb(iw1.iobyxmoadg userRepository, hw1.zoijcleaow userLogoutObserver, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userLogoutObserver, "userLogoutObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75005zoijcleaow = userRepository;
        this.f75004ppxfxbqfkf = userLogoutObserver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        iw1.iobyxmoadg iobyxmoadgVar2;
        zynmafqrjb zynmafqrjbVar;
        zynmafqrjb zynmafqrjbVar2;
        hw1.zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f75006cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f75006cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f75008jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f75006cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = this.f75005zoijcleaow;
            if (iobyxmoadgVar2.rgvfuqvkyq()) {
                iobyxmoadgVar.f75010zdlpuopuiu = this;
                iobyxmoadgVar.f75009yggfygwlhe = iobyxmoadgVar2;
                iobyxmoadgVar.f75006cqumvgiudr = 1;
                if (iobyxmoadgVar2.ppxfxbqfkf(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zynmafqrjbVar = this;
                iobyxmoadgVar.f75010zdlpuopuiu = zynmafqrjbVar;
                iobyxmoadgVar.f75009yggfygwlhe = null;
                iobyxmoadgVar.f75006cqumvgiudr = 2;
                if (iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zynmafqrjbVar2 = zynmafqrjbVar;
                zoijcleaowVar = zynmafqrjbVar2.f75004ppxfxbqfkf;
                iobyxmoadgVar.f75010zdlpuopuiu = null;
                iobyxmoadgVar.f75006cqumvgiudr = 3;
                if (zoijcleaowVar.gtknphoqwx(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else if (i14 == 1) {
            iobyxmoadgVar2 = (iw1.iobyxmoadg) iobyxmoadgVar.f75009yggfygwlhe;
            zynmafqrjbVar = (zynmafqrjb) iobyxmoadgVar.f75010zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar.f75010zdlpuopuiu = zynmafqrjbVar;
            iobyxmoadgVar.f75009yggfygwlhe = null;
            iobyxmoadgVar.f75006cqumvgiudr = 2;
            if (iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zynmafqrjbVar2 = zynmafqrjbVar;
            zoijcleaowVar = zynmafqrjbVar2.f75004ppxfxbqfkf;
            iobyxmoadgVar.f75010zdlpuopuiu = null;
            iobyxmoadgVar.f75006cqumvgiudr = 3;
            if (zoijcleaowVar.gtknphoqwx(iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else if (i14 == 2) {
            zynmafqrjbVar2 = (zynmafqrjb) iobyxmoadgVar.f75010zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaowVar = zynmafqrjbVar2.f75004ppxfxbqfkf;
            iobyxmoadgVar.f75010zdlpuopuiu = null;
            iobyxmoadgVar.f75006cqumvgiudr = 3;
            if (zoijcleaowVar.gtknphoqwx(iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
