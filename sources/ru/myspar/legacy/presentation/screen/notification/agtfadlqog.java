package ru.myspar.legacy.presentation.screen.notification;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog extends vx.eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private auzgnhcxok f89278agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ra2.lqeggnwhkg f89279btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private pc0.iobyxmoadg f89280draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final oc0.iobyxmoadg f89281dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lo.zoijcleaow f89282gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final v20.zoijcleaow f89283lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final c20.dxjokdxxww f89284nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private ppxfxbqfkf f89285ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private pc0.iobyxmoadg f89286wflxmlrfwp;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89288zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f89289yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f89290zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(agtfadlqog agtfadlqogVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f89289yggfygwlhe = agtfadlqogVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f89289yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f89290zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f89289yggfygwlhe.jpowsppfya(true);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f89291zdlpuopuiu;

            ppxfxbqfkf(agtfadlqog agtfadlqogVar) {
                this.f89291zdlpuopuiu = agtfadlqogVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object value;
                zynmafqrjb zynmafqrjbVarOjitshcjhn = this.f89291zdlpuopuiu.ojitshcjhn();
                agtfadlqog agtfadlqogVar = this.f89291zdlpuopuiu;
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, draadjrbmk.zoijcleaow(draadjrbmkVar, false, agtfadlqogVar.wypolnanlu(), false, false, 13, null)));
                this.f89291zdlpuopuiu.jpowsppfya(false);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public static final class wkgbmnqykc implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f89292yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f89293zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ agtfadlqog f89294yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f89295zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.notification.agtfadlqog$eablkybsjg$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2045iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                    Object f89297jyumaefscl;

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f89298yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f89299zdlpuopuiu;

                    public C2045iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f89299zdlpuopuiu = obj;
                        this.f89298yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, agtfadlqog agtfadlqogVar) {
                    this.f89295zdlpuopuiu = nufgyqmvbuVar;
                    this.f89294yggfygwlhe = agtfadlqogVar;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0084 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2045iobyxmoadg c2045iobyxmoadg;
                    sj.nufgyqmvbu nufgyqmvbuVar;
                    Object objZoijcleaow;
                    sj.nufgyqmvbu nufgyqmvbuVar2;
                    if (gxszxtbevoVar instanceof C2045iobyxmoadg) {
                        c2045iobyxmoadg = (C2045iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2045iobyxmoadg.f89298yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2045iobyxmoadg.f89298yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2045iobyxmoadg = new C2045iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2045iobyxmoadg = new C2045iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2045iobyxmoadg.f89299zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2045iobyxmoadg.f89298yggfygwlhe;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            nufgyqmvbuVar2 = (sj.nufgyqmvbu) c2045iobyxmoadg.f89297jyumaefscl;
                            zdlpuopuiu.zoijcleaow(obj2);
                        } else {
                            if (i14 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zdlpuopuiu.zoijcleaow(obj2);
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbuVar = this.f89295zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        agtfadlqog agtfadlqogVar = this.f89294yggfygwlhe;
                        c2045iobyxmoadg.f89297jyumaefscl = nufgyqmvbuVar;
                        c2045iobyxmoadg.f89298yggfygwlhe = 1;
                        Object objNtlheqmsrt = agtfadlqogVar.ntlheqmsrt(c2045iobyxmoadg);
                        if (objNtlheqmsrt == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        obj2 = objNtlheqmsrt;
                        nufgyqmvbuVar2 = nufgyqmvbuVar;
                    } else {
                        objZoijcleaow = draadjrbmk.zoijcleaow((draadjrbmk) this.f89294yggfygwlhe.ojitshcjhn().getValue(), false, this.f89294yggfygwlhe.wypolnanlu(), true, true, 1, null);
                    }
                    c2045iobyxmoadg.f89297jyumaefscl = null;
                    c2045iobyxmoadg.f89298yggfygwlhe = 2;
                    if (nufgyqmvbuVar.emit(objZoijcleaow, c2045iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                    Object obj3 = obj2;
                    nufgyqmvbuVar = nufgyqmvbuVar2;
                    objZoijcleaow = obj3;
                    c2045iobyxmoadg.f89297jyumaefscl = null;
                    c2045iobyxmoadg.f89298yggfygwlhe = 2;
                    if (nufgyqmvbuVar.emit(objZoijcleaow, c2045iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar) {
                this.f89293zdlpuopuiu = lqeggnwhkgVar;
                this.f89292yggfygwlhe = agtfadlqogVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f89293zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f89292yggfygwlhe), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f89300jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f89301yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f89302zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(agtfadlqog agtfadlqogVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f89300jyumaefscl = agtfadlqogVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f89300jyumaefscl, gxszxtbevoVar);
                zoijcleaowVar.f89301yggfygwlhe = obj;
                return zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f89302zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f89300jyumaefscl.zdlpuopuiu((Throwable) this.f89301yggfygwlhe);
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true);
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return agtfadlqog.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89288zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.zdlpuopuiu.gxszxtbevo(new wkgbmnqykc(sj.dxjokdxxww.tzroggbefp(agtfadlqog.this.f89284nufgyqmvbu.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new iobyxmoadg(agtfadlqog.this, null)), agtfadlqog.this), 0L, new zoijcleaow(agtfadlqog.this, null), 1, null);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(agtfadlqog.this);
                this.f89288zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(ppxfxbqfkfVar, this) == objGxszxtbevo) {
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

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f89304esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f89305iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f89306jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f89307yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f89308zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f89305iwizpuwonk = obj;
            this.f89304esjtqupxsv |= Integer.MIN_VALUE;
            return agtfadlqog.this.kegysxyocb(this);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89310zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return agtfadlqog.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f89310zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            agtfadlqog.this.mbcevpiqjq();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89312zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return agtfadlqog.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object value;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89312zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    agtfadlqog.this.jpowsppfya(true);
                    agtfadlqog agtfadlqogVar = agtfadlqog.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    this.f89312zdlpuopuiu = 1;
                    obj = agtfadlqogVar.ntlheqmsrt(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((draadjrbmk) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            agtfadlqog agtfadlqogVar2 = agtfadlqog.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                draadjrbmk draadjrbmkVar = (draadjrbmk) objWkgbmnqykc;
                zynmafqrjb zynmafqrjbVarOjitshcjhn = agtfadlqogVar2.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, draadjrbmkVar));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                agtfadlqogVar2.zdlpuopuiu(thDxjokdxxww);
            }
            agtfadlqog.this.jpowsppfya(false);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f89313iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f89315yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f89316zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f89315yggfygwlhe = obj;
            this.f89313iwizpuwonk |= Integer.MIN_VALUE;
            return agtfadlqog.this.ntlheqmsrt(this);
        }
    }

    public enum ppxfxbqfkf {
        PROMOS(0),
        ORDERS(1);


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f89317cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f89321zdlpuopuiu;

        ppxfxbqfkf(int i13) {
            this.f89321zdlpuopuiu = i13;
        }

        public final int wkgbmnqykc() {
            return this.f89321zdlpuopuiu;
        }
    }

    public /* synthetic */ class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f89322iobyxmoadg;

        static {
            int[] iArr = new int[ppxfxbqfkf.values().length];
            try {
                iArr[ppxfxbqfkf.PROMOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ppxfxbqfkf.ORDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f89322iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f89323yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89324zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f89324zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f89323yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f89323yggfygwlhe = th2;
            return zoijcleaowVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtfadlqog(v20.zoijcleaow loadPushesUseCase, c20.dxjokdxxww subscribeToLoggedInUseCase, u10.ppxfxbqfkf changeNotificationObserver, oc0.iobyxmoadg uiMapper, ra2.lqeggnwhkg resetAllUnreadUserCouponsUseCase, lo.zoijcleaow analyticsTracker) {
        super(new draadjrbmk(false, null, false, false, 15, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadPushesUseCase, "loadPushesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeNotificationObserver, "changeNotificationObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiMapper, "uiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resetAllUnreadUserCouponsUseCase, "resetAllUnreadUserCouponsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f89283lqeggnwhkg = loadPushesUseCase;
        this.f89284nufgyqmvbu = subscribeToLoggedInUseCase;
        this.f89281dxjokdxxww = uiMapper;
        this.f89279btonecajqb = resetAllUnreadUserCouponsUseCase;
        this.f89282gtknphoqwx = analyticsTracker;
        ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.PROMOS;
        this.f89280draadjrbmk = new pc0.iobyxmoadg(ppxfxbqfkfVar.wkgbmnqykc(), null, 2, null);
        this.f89286wflxmlrfwp = new pc0.iobyxmoadg(ppxfxbqfkf.ORDERS.wkgbmnqykc(), null, 2, null);
        this.f89285ojitshcjhn = ppxfxbqfkfVar;
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(changeNotificationObserver.btonecajqb(), new iobyxmoadg(null)), new zoijcleaow(null)), agtfadlqog());
        stevsuqkhv();
    }

    private final AnalyticsPage cllcsxoeiz() {
        return this.f89285ojitshcjhn == ppxfxbqfkf.PROMOS ? AnalyticsPage.NotificationsAdv.f84314iwizpuwonk : AnalyticsPage.NotificationSys.f84311iwizpuwonk;
    }

    private final void crxdokpmqz(pc0.zoijcleaow zoijcleaowVar) {
        String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        String strEablkybsjg = zoijcleaowVar.eablkybsjg();
        NavigationPayload navigationPayloadWkgbmnqykc = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(strIobyxmoadg).wkgbmnqykc();
        NavigationPayload navigationPayloadZoijcleaow = navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : strEablkybsjg, (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : new AnalyticsPayload(cllcsxoeiz(), null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, "promo") && strEablkybsjg.length() > 0) {
            okpsazkaxt(zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.gxszxtbevo(), strEablkybsjg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, f40.zoijcleaow.DEEPLINK.dxjokdxxww()) && strEablkybsjg.length() > 0) {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadZoijcleaow);
            yggfygwlhe(new wflxmlrfwp.ppxfxbqfkf(zoijcleaowVar));
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, f40.zoijcleaow.BASKET.dxjokdxxww())) {
                d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadZoijcleaow);
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, "promocopy")) {
                yggfygwlhe(new wflxmlrfwp.iobyxmoadg(strEablkybsjg));
            } else if (strEablkybsjg.length() > 0) {
                d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadZoijcleaow);
            } else {
                okpsazkaxt(zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.gxszxtbevo(), zoijcleaowVar.zoijcleaow());
            }
        }
    }

    private final Object ikoacuggdj(lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f89279btonecajqb.zoijcleaow(new ra2.lqeggnwhkg.iobyxmoadg(false, true, 1 == true ? 1 : 0, null), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final draadjrbmk jhduphickx(List list) {
        int i13 = wkgbmnqykc.f89322iobyxmoadg[this.f89285ojitshcjhn.ordinal()];
        if (i13 == 1) {
            this.f89280draadjrbmk = pc0.iobyxmoadg.zoijcleaow(this.f89280draadjrbmk, 0, list, 1, null);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f89286wflxmlrfwp = pc0.iobyxmoadg.zoijcleaow(this.f89286wflxmlrfwp, 0, list, 1, null);
        }
        return draadjrbmk.zoijcleaow((draadjrbmk) ojitshcjhn().getValue(), false, wypolnanlu(), list.isEmpty(), false, 1, null);
    }

    private final void jlmebxxoox() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f89285ojitshcjhn;
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.ORDERS;
        if (ppxfxbqfkfVar == ppxfxbqfkfVar2) {
            return;
        }
        this.f89285ojitshcjhn = ppxfxbqfkfVar2;
        mbcevpiqjq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jpowsppfya(boolean z13) {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, draadjrbmk.zoijcleaow((draadjrbmk) value, z13, null, false, false, 14, null)));
    }

    private final void jztzpxfvev(AnalyticsPage analyticsPage) {
        this.f89282gtknphoqwx.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(cllcsxoeiz(), analyticsPage, null, null, null, 28, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final Object kegysxyocb(lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        agtfadlqog agtfadlqogVar;
        ?? r13;
        List list;
        int i13;
        agtfadlqog agtfadlqogVar2;
        List list2;
        ?? r14;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i14 = gxszxtbevoVar2.f89304esjtqupxsv;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f89304esjtqupxsv = i14 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f89305iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = gxszxtbevoVar2.f89304esjtqupxsv;
        if (i15 != 0) {
            if (i15 == 1) {
                int i16 = gxszxtbevoVar2.f89306jyumaefscl;
                agtfadlqogVar = (agtfadlqog) gxszxtbevoVar2.f89308zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                r13 = i16;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = gxszxtbevoVar2.f89306jyumaefscl;
                list2 = (List) gxszxtbevoVar2.f89307yggfygwlhe;
                agtfadlqogVar2 = (agtfadlqog) gxszxtbevoVar2.f89308zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            agtfadlqogVar = agtfadlqogVar2;
            list = list2;
            r14 = i13;
            return agtfadlqogVar.f89281dxjokdxxww.zoijcleaow(list, r14 != 0);
        }
        zdlpuopuiu.zoijcleaow(obj);
        ?? r15 = this.f89285ojitshcjhn == ppxfxbqfkf.ORDERS ? 1 : 0;
        v20.zoijcleaow zoijcleaowVar = this.f89283lqeggnwhkg;
        v20.zoijcleaow.iobyxmoadg iobyxmoadgVar = new v20.zoijcleaow.iobyxmoadg(r15);
        gxszxtbevoVar2.f89308zdlpuopuiu = this;
        gxszxtbevoVar2.f89306jyumaefscl = r15;
        gxszxtbevoVar2.f89304esjtqupxsv = 1;
        Object objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar, gxszxtbevoVar2);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        agtfadlqogVar = this;
        r13 = r15;
        obj = objZoijcleaow;
        list = (List) obj;
        r14 = r13;
        if (agtfadlqogVar.f89285ojitshcjhn == ppxfxbqfkf.PROMOS) {
            gxszxtbevoVar2.f89308zdlpuopuiu = agtfadlqogVar;
            gxszxtbevoVar2.f89307yggfygwlhe = list;
            gxszxtbevoVar2.f89306jyumaefscl = r13 == true ? 1 : 0;
            gxszxtbevoVar2.f89304esjtqupxsv = 2;
            if (agtfadlqogVar.ikoacuggdj(gxszxtbevoVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            i13 = r13 == true ? 1 : 0;
            agtfadlqogVar2 = agtfadlqogVar;
            list2 = list;
            agtfadlqogVar = agtfadlqogVar2;
            list = list2;
            r14 = i13;
        }
        return agtfadlqogVar.f89281dxjokdxxww.zoijcleaow(list, r14 != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mbcevpiqjq() {
        auzgnhcxok auzgnhcxokVar = this.f89278agtfadlqog;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f89278agtfadlqog = pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ntlheqmsrt(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        agtfadlqog agtfadlqogVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f89313iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f89313iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objKegysxyocb = nufgyqmvbuVar.f89315yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f89313iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objKegysxyocb);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                nufgyqmvbuVar.f89316zdlpuopuiu = this;
                nufgyqmvbuVar.f89313iwizpuwonk = 1;
                objKegysxyocb = kegysxyocb(nufgyqmvbuVar);
                if (objKegysxyocb == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                agtfadlqogVar = this;
            } catch (Throwable th2) {
                th = th2;
                agtfadlqogVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            agtfadlqogVar = (agtfadlqog) nufgyqmvbuVar.f89316zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objKegysxyocb);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(agtfadlqogVar.jhduphickx((List) objKegysxyocb));
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            return objWkgbmnqykc;
        }
        agtfadlqogVar.zdlpuopuiu(thDxjokdxxww);
        return draadjrbmk.zoijcleaow((draadjrbmk) agtfadlqogVar.ojitshcjhn().getValue(), false, agtfadlqogVar.wypolnanlu(), true, false, 1, null);
    }

    private final void okpsazkaxt(String str, String str2, String str3) {
        jztzpxfvev(new AnalyticsPage.NotificationDetail(str, str2));
        yggfygwlhe(new wflxmlrfwp.zoijcleaow(str2, str3));
    }

    private final void ribwqtqdhb(int i13) {
        if (i13 == ppxfxbqfkf.PROMOS.wkgbmnqykc()) {
            vipkmwdibw();
        } else {
            if (i13 != ppxfxbqfkf.ORDERS.wkgbmnqykc()) {
                throw new IllegalArgumentException("Page not found");
            }
            jlmebxxoox();
        }
    }

    private final void stevsuqkhv() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new eablkybsjg(null), 3, null);
    }

    private final void ulzqkzuiru() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    private final void vipkmwdibw() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f89285ojitshcjhn;
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.PROMOS;
        if (ppxfxbqfkfVar == ppxfxbqfkfVar2) {
            return;
        }
        this.f89285ojitshcjhn = ppxfxbqfkfVar2;
        mbcevpiqjq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List wypolnanlu() {
        return jyumaefscl.rgvfuqvkyq(this.f89280draadjrbmk, this.f89286wflxmlrfwp);
    }

    public final void sopmlzcsov(gtknphoqwx event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof gtknphoqwx.ppxfxbqfkf) {
            ribwqtqdhb(((gtknphoqwx.ppxfxbqfkf) event).iobyxmoadg());
        } else if (event instanceof gtknphoqwx.iobyxmoadg) {
            ulzqkzuiru();
        } else {
            if (!(event instanceof gtknphoqwx.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(((gtknphoqwx.zoijcleaow) event).iobyxmoadg());
        }
    }
}
