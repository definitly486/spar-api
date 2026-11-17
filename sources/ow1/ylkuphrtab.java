package ow1;

import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserState;

/* JADX INFO: loaded from: classes6.dex */
public final class ylkuphrtab extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iw1.iobyxmoadg f74996iobyxmoadg;

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f74997zdlpuopuiu;

        /* JADX INFO: renamed from: ow1.ylkuphrtab$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1631iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f74998zdlpuopuiu;

            /* JADX INFO: renamed from: ow1.ylkuphrtab$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1632iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f75000yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f75001zdlpuopuiu;

                public C1632iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f75001zdlpuopuiu = obj;
                    this.f75000yggfygwlhe |= Integer.MIN_VALUE;
                    return C1631iobyxmoadg.this.emit(null, this);
                }
            }

            public C1631iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f74998zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1632iobyxmoadg c1632iobyxmoadg;
                if (gxszxtbevoVar instanceof C1632iobyxmoadg) {
                    c1632iobyxmoadg = (C1632iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1632iobyxmoadg.f75000yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1632iobyxmoadg.f75000yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1632iobyxmoadg = new C1632iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1632iobyxmoadg = new C1632iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1632iobyxmoadg.f75001zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1632iobyxmoadg.f75000yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f74998zdlpuopuiu;
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((UserState) obj) instanceof UserState.IsAuth);
                    c1632iobyxmoadg.f75000yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c1632iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f74997zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f74997zdlpuopuiu.collect(new C1631iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public ylkuphrtab(iw1.iobyxmoadg userRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        this.f74996iobyxmoadg = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eablkybsjg(UserState it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        UserInfo userInfoAgeimvtcrz = it.ageimvtcrz();
        if (userInfoAgeimvtcrz != null) {
            return userInfoAgeimvtcrz.getPhone();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(gg.wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return sj.dxjokdxxww.vdvldrhtss(new iobyxmoadg(sj.dxjokdxxww.kcexrzcfyt(this.f74996iobyxmoadg.tzroggbefp(), new tg.draadjrbmk() { // from class: ow1.wwaezpbzkn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ylkuphrtab.eablkybsjg((UserState) obj);
            }
        })));
    }
}
