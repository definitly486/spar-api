package ra2;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserCard;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f82432zoijcleaow;

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f82433zdlpuopuiu;

        /* JADX INFO: renamed from: ra2.dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1844iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f82434zdlpuopuiu;

            /* JADX INFO: renamed from: ra2.dxjokdxxww$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1845iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f82436yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f82437zdlpuopuiu;

                public C1845iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f82437zdlpuopuiu = obj;
                    this.f82436yggfygwlhe |= Integer.MIN_VALUE;
                    return C1844iobyxmoadg.this.emit(null, this);
                }
            }

            public C1844iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f82434zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1845iobyxmoadg c1845iobyxmoadg;
                if (gxszxtbevoVar instanceof C1845iobyxmoadg) {
                    c1845iobyxmoadg = (C1845iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1845iobyxmoadg.f82436yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1845iobyxmoadg.f82436yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1845iobyxmoadg = new C1845iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1845iobyxmoadg = new C1845iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1845iobyxmoadg.f82437zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1845iobyxmoadg.f82436yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f82434zdlpuopuiu;
                    User user = (User) obj;
                    UserCard userCard = user != null ? user.getUserCard() : null;
                    c1845iobyxmoadg.f82436yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(userCard, c1845iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f82433zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f82433zdlpuopuiu.collect(new C1844iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f82432zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return sj.dxjokdxxww.vdvldrhtss(new iobyxmoadg(this.f82432zoijcleaow.zoijcleaow()));
    }
}
