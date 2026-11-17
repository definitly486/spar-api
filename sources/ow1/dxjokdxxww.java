package ow1;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74897zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f74898iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f74900yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74901zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74900yggfygwlhe = obj;
            this.f74898iwizpuwonk |= Integer.MIN_VALUE;
            return dxjokdxxww.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74897zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(nw1.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        dxjokdxxww dxjokdxxwwVar;
        Object obj;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f74898iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f74898iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objYadqdtsiqt = iobyxmoadgVar.f74900yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f74898iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar.f74901zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iobyxmoadgVar.f74901zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
            }
            return (nw1.gxszxtbevo) obj;
        }
        gg.zdlpuopuiu.zoijcleaow(objYadqdtsiqt);
        iw1.iobyxmoadg iobyxmoadgVar2 = this.f74897zoijcleaow;
        iobyxmoadgVar.f74901zdlpuopuiu = this;
        iobyxmoadgVar.f74898iwizpuwonk = 1;
        objYadqdtsiqt = iobyxmoadgVar2.yadqdtsiqt(ppxfxbqfkfVar, iobyxmoadgVar);
        if (objYadqdtsiqt == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        dxjokdxxwwVar = this;
        iw1.iobyxmoadg iobyxmoadgVar3 = dxjokdxxwwVar.f74897zoijcleaow;
        iobyxmoadgVar.f74901zdlpuopuiu = objYadqdtsiqt;
        iobyxmoadgVar.f74898iwizpuwonk = 2;
        if (iobyxmoadgVar3.hcddaimhww((nw1.gxszxtbevo) objYadqdtsiqt, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        obj = objYadqdtsiqt;
        return (nw1.gxszxtbevo) obj;
    }
}
