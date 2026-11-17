package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class wflxmlrfwp extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74969zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f74970iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f74972yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74973zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74972yggfygwlhe = obj;
            this.f74970iwizpuwonk |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74969zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        wflxmlrfwp wflxmlrfwpVar;
        boolean zBooleanValue;
        Object obj;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f74970iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f74970iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZynmafqrjb = iobyxmoadgVar.f74972yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f74970iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                wflxmlrfwpVar = (wflxmlrfwp) iobyxmoadgVar.f74973zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZynmafqrjb);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iobyxmoadgVar.f74973zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZynmafqrjb);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue);
        }
        gg.zdlpuopuiu.zoijcleaow(objZynmafqrjb);
        iw1.iobyxmoadg iobyxmoadgVar2 = this.f74969zoijcleaow;
        if (iobyxmoadgVar2.rgvfuqvkyq()) {
            iobyxmoadgVar.f74973zdlpuopuiu = this;
            iobyxmoadgVar.f74970iwizpuwonk = 1;
            objZynmafqrjb = iobyxmoadgVar2.zynmafqrjb(iobyxmoadgVar);
            if (objZynmafqrjb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wflxmlrfwpVar = this;
        } else {
            zBooleanValue = false;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue);
        boolean zBooleanValue2 = ((Boolean) objZynmafqrjb).booleanValue();
        iw1.iobyxmoadg iobyxmoadgVar3 = wflxmlrfwpVar.f74969zoijcleaow;
        iobyxmoadgVar.f74973zdlpuopuiu = objZynmafqrjb;
        iobyxmoadgVar.f74970iwizpuwonk = 2;
        if (iobyxmoadgVar3.jpowsppfya(zBooleanValue2, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        obj = objZynmafqrjb;
        zBooleanValue = ((Boolean) obj).booleanValue();
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue);
    }
}
