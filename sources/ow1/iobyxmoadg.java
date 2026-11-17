package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74915zoijcleaow;

    /* JADX INFO: renamed from: ow1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1630iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f74916jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f74918zdlpuopuiu;

        C1630iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74918zdlpuopuiu = obj;
            this.f74916jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74915zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        C1630iobyxmoadg c1630iobyxmoadg;
        if (gxszxtbevoVar instanceof C1630iobyxmoadg) {
            c1630iobyxmoadg = (C1630iobyxmoadg) gxszxtbevoVar;
            int i13 = c1630iobyxmoadg.f74916jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1630iobyxmoadg.f74916jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1630iobyxmoadg = new C1630iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1630iobyxmoadg = new C1630iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1630iobyxmoadg.f74918zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1630iobyxmoadg.f74916jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iw1.iobyxmoadg iobyxmoadgVar = this.f74915zoijcleaow;
            if (iobyxmoadgVar.rgvfuqvkyq()) {
                c1630iobyxmoadg.f74916jyumaefscl = 1;
                if (iobyxmoadgVar.lereixgezr(c1630iobyxmoadg) == objGxszxtbevo) {
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
