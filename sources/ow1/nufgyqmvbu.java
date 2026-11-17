package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f74941ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74942zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f74943cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f74945jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f74946yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74947zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74945jyumaefscl = obj;
            this.f74943cqumvgiudr |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f74948iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f74948iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f74948iobyxmoadg == ((zoijcleaow) obj).f74948iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f74948iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f74948iobyxmoadg;
        }

        public String toString() {
            return "Params(isEReceiptAccepted=" + this.f74948iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74942zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar2;
        iw1.iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar3;
        int i13;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i14 = ppxfxbqfkfVar.f74943cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f74943cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f74945jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = ppxfxbqfkfVar.f74943cqumvgiudr;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iw1.iobyxmoadg iobyxmoadgVar2 = this.f74942zoijcleaow;
            if (iobyxmoadgVar2.rgvfuqvkyq()) {
                boolean zIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                ppxfxbqfkfVar.f74947zdlpuopuiu = zoijcleaowVar;
                ppxfxbqfkfVar.f74946yggfygwlhe = iobyxmoadgVar2;
                ppxfxbqfkfVar.f74943cqumvgiudr = 1;
                if (iobyxmoadgVar2.iozdgvuglv(zIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = zoijcleaowVar;
                iobyxmoadgVar = iobyxmoadgVar2;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i15 == 1) {
            iobyxmoadgVar = (iw1.iobyxmoadg) ppxfxbqfkfVar.f74946yggfygwlhe;
            zoijcleaowVar2 = (zoijcleaow) ppxfxbqfkfVar.f74947zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iw1.iobyxmoadg) ppxfxbqfkfVar.f74946yggfygwlhe;
            zoijcleaowVar3 = (zoijcleaow) ppxfxbqfkfVar.f74947zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        if (zoijcleaowVar3.iobyxmoadg()) {
            i13 = 3;
        } else {
            i13 = 0;
        }
        iobyxmoadgVar.lqeggnwhkg(i13);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
        boolean zIobyxmoadg2 = zoijcleaowVar2.iobyxmoadg();
        ppxfxbqfkfVar.f74947zdlpuopuiu = zoijcleaowVar2;
        ppxfxbqfkfVar.f74946yggfygwlhe = iobyxmoadgVar;
        ppxfxbqfkfVar.f74943cqumvgiudr = 2;
        if (iobyxmoadgVar.kegysxyocb(zIobyxmoadg2, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar3 = zoijcleaowVar2;
        if (zoijcleaowVar3.iobyxmoadg()) {
            i13 = 0;
        } else {
            i13 = 3;
        }
        iobyxmoadgVar.lqeggnwhkg(i13);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
