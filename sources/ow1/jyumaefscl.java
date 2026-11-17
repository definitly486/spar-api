package ow1;

import ru.myspar.proloyalty.user.domain.model.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class jyumaefscl extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pj.pkzmftpjix f74926ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74927zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f74928jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f74930zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74930zdlpuopuiu = obj;
            this.f74928jyumaefscl |= Integer.MIN_VALUE;
            return jyumaefscl.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyumaefscl(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74927zoijcleaow = userRepository;
        this.f74926ppxfxbqfkf = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f74928jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f74928jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f74930zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f74928jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            iw1.iobyxmoadg iobyxmoadgVar2 = this.f74927zoijcleaow;
            iobyxmoadgVar.f74928jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        UserInfo userInfo = (UserInfo) objZoijcleaow;
        if (userInfo != null) {
            return userInfo.getWebviewToken();
        }
        return null;
    }
}
