package fa2;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import ru.myspar.user.models.User;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements qa2.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final da2.iobyxmoadg f33367iobyxmoadg;

    /* JADX INFO: renamed from: fa2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0733iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f33368jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f33370zdlpuopuiu;

        C0733iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33370zdlpuopuiu = obj;
            this.f33368jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lqeggnwhkg(this);
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f33371zdlpuopuiu;

        /* JADX INFO: renamed from: fa2.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0734iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f33372zdlpuopuiu;

            /* JADX INFO: renamed from: fa2.iobyxmoadg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0735iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f33374yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f33375zdlpuopuiu;

                public C0735iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f33375zdlpuopuiu = obj;
                    this.f33374yggfygwlhe |= Integer.MIN_VALUE;
                    return C0734iobyxmoadg.this.emit(null, this);
                }
            }

            public C0734iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f33372zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C0735iobyxmoadg c0735iobyxmoadg;
                if (gxszxtbevoVar instanceof C0735iobyxmoadg) {
                    c0735iobyxmoadg = (C0735iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0735iobyxmoadg.f33374yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0735iobyxmoadg.f33374yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0735iobyxmoadg = new C0735iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0735iobyxmoadg = new C0735iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0735iobyxmoadg.f33375zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0735iobyxmoadg.f33374yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f33372zdlpuopuiu;
                    ha2.ppxfxbqfkf ppxfxbqfkfVar = (ha2.ppxfxbqfkf) obj;
                    User userIobyxmoadg = ppxfxbqfkfVar != null ? ga2.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar) : null;
                    c0735iobyxmoadg.f33374yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(userIobyxmoadg, c0735iobyxmoadg) == objGxszxtbevo) {
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

        public ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
            this.f33371zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f33371zdlpuopuiu.collect(new C0734iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ User f33376jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33378zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(User user, gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f33376jyumaefscl = user;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f33376jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f33378zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            da2.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f33367iobyxmoadg;
            this.f33378zdlpuopuiu = 1;
            if (iobyxmoadgVar.gxszxtbevo(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            da2.iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this.f33367iobyxmoadg;
            ha2.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ga2.iobyxmoadg.iobyxmoadg(this.f33376jyumaefscl);
            this.f33378zdlpuopuiu = 2;
            if (iobyxmoadgVar2.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(da2.iobyxmoadg userDao) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userDao, "userDao");
        this.f33367iobyxmoadg = userDao;
    }

    @Override // qa2.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = this.f33367iobyxmoadg.gxszxtbevo(gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.iobyxmoadg
    public Object lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        C0733iobyxmoadg c0733iobyxmoadg;
        if (gxszxtbevoVar instanceof C0733iobyxmoadg) {
            c0733iobyxmoadg = (C0733iobyxmoadg) gxszxtbevoVar;
            int i13 = c0733iobyxmoadg.f33368jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0733iobyxmoadg.f33368jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0733iobyxmoadg = new C0733iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0733iobyxmoadg = new C0733iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = c0733iobyxmoadg.f33370zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0733iobyxmoadg.f33368jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            da2.iobyxmoadg iobyxmoadgVar = this.f33367iobyxmoadg;
            c0733iobyxmoadg.f33368jyumaefscl = 1;
            objLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(c0733iobyxmoadg);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        ha2.ppxfxbqfkf ppxfxbqfkfVar = (ha2.ppxfxbqfkf) objLqeggnwhkg;
        if (ppxfxbqfkfVar != null) {
            return ga2.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar);
        }
        return null;
    }

    @Override // qa2.iobyxmoadg
    public Object ppxfxbqfkf(User user, gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = this.f33367iobyxmoadg.wkgbmnqykc(new zoijcleaow(user, null), gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // qa2.iobyxmoadg
    public lqeggnwhkg zoijcleaow() {
        return new ppxfxbqfkf(this.f33367iobyxmoadg.nufgyqmvbu());
    }
}
