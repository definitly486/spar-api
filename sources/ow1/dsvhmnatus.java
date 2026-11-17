package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class dsvhmnatus extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74891zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74892iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f74893zoijcleaow;

        public iobyxmoadg(String pushToken, String deviceId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pushToken, "pushToken");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceId, "deviceId");
            this.f74892iobyxmoadg = pushToken;
            this.f74893zoijcleaow = deviceId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74892iobyxmoadg, iobyxmoadgVar.f74892iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74893zoijcleaow, iobyxmoadgVar.f74893zoijcleaow);
        }

        public int hashCode() {
            return (this.f74892iobyxmoadg.hashCode() * 31) + this.f74893zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74893zoijcleaow;
        }

        public String toString() {
            return "Params(pushToken=" + this.f74892iobyxmoadg + ", deviceId=" + this.f74893zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f74892iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f74894jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f74896zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74896zdlpuopuiu = obj;
            this.f74894jyumaefscl |= Integer.MIN_VALUE;
            return dsvhmnatus.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsvhmnatus(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74891zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f74894jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f74894jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f74896zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f74894jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iw1.iobyxmoadg iobyxmoadgVar2 = this.f74891zoijcleaow;
            if (iobyxmoadgVar2.rgvfuqvkyq()) {
                String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
                String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                zoijcleaowVar.f74894jyumaefscl = 1;
                if (iobyxmoadgVar2.cdpycssgdh(strZoijcleaow, strIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
