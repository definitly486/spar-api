package ra2;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserState;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f82415ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f82416zoijcleaow;

    public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ btonecajqb f82417iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f82418jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f82419yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82420zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, btonecajqb btonecajqbVar) {
            super(3, gxszxtbevoVar);
            this.f82417iwizpuwonk = btonecajqbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f82420zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f82419yggfygwlhe;
                sj.lqeggnwhkg zoijcleaowVar = ((Boolean) this.f82418jyumaefscl).booleanValue() ? new zoijcleaow(this.f82417iwizpuwonk.f82416zoijcleaow.zoijcleaow()) : sj.dxjokdxxww.pkzmftpjix(UserState.NotAuthorized.f104653zdlpuopuiu);
                this.f82420zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f82417iwizpuwonk);
            iobyxmoadgVar.f82419yggfygwlhe = nufgyqmvbuVar;
            iobyxmoadgVar.f82418jyumaefscl = obj;
            return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f82421zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f82422zdlpuopuiu;

            /* JADX INFO: renamed from: ra2.btonecajqb$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1843iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f82424yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f82425zdlpuopuiu;

                public C1843iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f82425zdlpuopuiu = obj;
                    this.f82424yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f82422zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1843iobyxmoadg c1843iobyxmoadg;
                if (gxszxtbevoVar instanceof C1843iobyxmoadg) {
                    c1843iobyxmoadg = (C1843iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1843iobyxmoadg.f82424yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1843iobyxmoadg.f82424yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1843iobyxmoadg = new C1843iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1843iobyxmoadg = new C1843iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1843iobyxmoadg.f82425zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1843iobyxmoadg.f82424yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f82422zdlpuopuiu;
                    User user = (User) obj;
                    Object authorized = user != null ? new UserState.Authorized(user) : UserState.NotAuthorized.f104653zdlpuopuiu;
                    c1843iobyxmoadg.f82424yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(authorized, c1843iobyxmoadg) == objGxszxtbevo) {
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

        public zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f82421zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f82421zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(ca2.ppxfxbqfkf userRepository, ca2.wkgbmnqykc userSharedPreferences, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f82416zoijcleaow = userRepository;
        this.f82415ppxfxbqfkf = userSharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return sj.dxjokdxxww.ikoacuggdj(this.f82415ppxfxbqfkf.eablkybsjg(), new iobyxmoadg(null, this));
    }
}
