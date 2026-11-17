package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hw1.zoijcleaow f74957ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74958zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f74959cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f74961jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f74962yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74963zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74961jyumaefscl = obj;
            this.f74959cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(iw1.iobyxmoadg userRepository, hw1.zoijcleaow userLogoutObserver, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userLogoutObserver, "userLogoutObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74958zoijcleaow = userRepository;
        this.f74957ppxfxbqfkf = userLogoutObserver;
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
        ppxfxbqfkf ppxfxbqfkfVar;
        ppxfxbqfkf ppxfxbqfkfVar2;
        hw1.zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f74959cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f74959cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f74961jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f74959cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = this.f74958zoijcleaow;
            if (iobyxmoadgVar2.rgvfuqvkyq()) {
                iobyxmoadgVar.f74963zdlpuopuiu = this;
                iobyxmoadgVar.f74962yggfygwlhe = iobyxmoadgVar2;
                iobyxmoadgVar.f74959cqumvgiudr = 1;
                if (iobyxmoadgVar2.sopmlzcsov(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = this;
                iobyxmoadgVar.f74963zdlpuopuiu = ppxfxbqfkfVar;
                iobyxmoadgVar.f74962yggfygwlhe = null;
                iobyxmoadgVar.f74959cqumvgiudr = 2;
                if (iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                zoijcleaowVar = ppxfxbqfkfVar2.f74957ppxfxbqfkf;
                iobyxmoadgVar.f74963zdlpuopuiu = null;
                iobyxmoadgVar.f74959cqumvgiudr = 3;
                if (zoijcleaowVar.btonecajqb(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else if (i14 == 1) {
            iobyxmoadgVar2 = (iw1.iobyxmoadg) iobyxmoadgVar.f74962yggfygwlhe;
            ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f74963zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar.f74963zdlpuopuiu = ppxfxbqfkfVar;
            iobyxmoadgVar.f74962yggfygwlhe = null;
            iobyxmoadgVar.f74959cqumvgiudr = 2;
            if (iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar2 = ppxfxbqfkfVar;
            zoijcleaowVar = ppxfxbqfkfVar2.f74957ppxfxbqfkf;
            iobyxmoadgVar.f74963zdlpuopuiu = null;
            iobyxmoadgVar.f74959cqumvgiudr = 3;
            if (zoijcleaowVar.btonecajqb(iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else if (i14 == 2) {
            ppxfxbqfkfVar2 = (ppxfxbqfkf) iobyxmoadgVar.f74963zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaowVar = ppxfxbqfkfVar2.f74957ppxfxbqfkf;
            iobyxmoadgVar.f74963zdlpuopuiu = null;
            iobyxmoadgVar.f74959cqumvgiudr = 3;
            if (zoijcleaowVar.btonecajqb(iobyxmoadgVar) == objGxszxtbevo) {
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
