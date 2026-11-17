package ow1;

import java.time.LocalDate;
import ru.myspar.proloyalty.user.domain.model.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class lereixgezr extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f74932ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74933zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f74934iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f74936yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74937zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74936yggfygwlhe = obj;
            this.f74934iwizpuwonk |= Integer.MIN_VALUE;
            return lereixgezr.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lereixgezr(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74933zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iw1.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f74934iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f74934iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f74936yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f74934iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iw1.iobyxmoadg iobyxmoadgVar2 = this.f74933zoijcleaow;
            if (!iobyxmoadgVar2.rgvfuqvkyq()) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            iw1.iobyxmoadg iobyxmoadgVar3 = this.f74933zoijcleaow;
            zoijcleaowVar.f74937zdlpuopuiu = iobyxmoadgVar2;
            zoijcleaowVar.f74934iwizpuwonk = 1;
            Object objZoijcleaow = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objZoijcleaow;
            iobyxmoadgVar = iobyxmoadgVar2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iw1.iobyxmoadg) zoijcleaowVar.f74937zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        UserInfo userInfo = (UserInfo) obj;
        if (userInfo != null && !userInfo.getIsEReceiptAccepted() && iobyxmoadgVar.yggfygwlhe() <= 2) {
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDateCqumvgiudr = iobyxmoadgVar.cqumvgiudr();
            if (localDateCqumvgiudr == null) {
                localDateCqumvgiudr = localDateNow;
            }
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(localDateNow.compareTo(localDateCqumvgiudr) >= 0);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
    }
}
