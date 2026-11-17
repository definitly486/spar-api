package dn0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j0.l;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.lmojexxdyd;
import ow1.wypolnanlu;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.auth.impl.domain.authbysms.store.State;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C0588iobyxmoadg f29196lqeggnwhkg = new C0588iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f29197nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final u11.ppxfxbqfkf f29198eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private auzgnhcxok f29199gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lmojexxdyd f29200ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wypolnanlu f29201wkgbmnqykc;

    static final class btonecajqb extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f29203zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f29203zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(dn0.gxszxtbevo.lqeggnwhkg.f29192iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new btonecajqb(gxszxtbevoVar).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class dxjokdxxww implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f29204yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f29205zdlpuopuiu;

        /* JADX INFO: renamed from: dn0.iobyxmoadg$dxjokdxxww$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0586iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f29206yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f29207zdlpuopuiu;

            /* JADX INFO: renamed from: dn0.iobyxmoadg$dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0587iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f29209yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f29210zdlpuopuiu;

                public C0587iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f29210zdlpuopuiu = obj;
                    this.f29209yggfygwlhe |= Integer.MIN_VALUE;
                    return C0586iobyxmoadg.this.emit(null, this);
                }
            }

            public C0586iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f29207zdlpuopuiu = nufgyqmvbuVar;
                this.f29206yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0587iobyxmoadg c0587iobyxmoadg;
                if (gxszxtbevoVar instanceof C0587iobyxmoadg) {
                    c0587iobyxmoadg = (C0587iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0587iobyxmoadg.f29209yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0587iobyxmoadg.f29209yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0587iobyxmoadg = new C0587iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0587iobyxmoadg = new C0587iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0587iobyxmoadg.f29210zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0587iobyxmoadg.f29209yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f29207zdlpuopuiu;
                    String strWeqkydbzbr = this.f29206yggfygwlhe.weqkydbzbr(((Number) obj).longValue());
                    c0587iobyxmoadg.f29209yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(strWeqkydbzbr, c0587iobyxmoadg) == objGxszxtbevo) {
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

        public dxjokdxxww(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f29205zdlpuopuiu = lqeggnwhkgVar;
            this.f29204yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f29205zdlpuopuiu.collect(new C0586iobyxmoadg(nufgyqmvbuVar, this.f29204yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f29211iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f29213yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f29214zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29213yggfygwlhe = obj;
            this.f29211iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lrnfpwlwnk(this);
        }
    }

    /* synthetic */ class gtknphoqwx extends kotlin.jvm.internal.iobyxmoadg implements rgvfuqvkyq {
        gtknphoqwx(Object obj) {
            super(2, obj, iobyxmoadg.class, "changeSmsRepeatRequestTimer", "changeSmsRepeatRequestTimer(Ljava/lang/String;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.iwxlajgraz((iobyxmoadg) this.f60022zdlpuopuiu, str, gxszxtbevoVar);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f29216esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f29217iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f29218jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f29219yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f29220zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29217iwizpuwonk = obj;
            this.f29216esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.roivzttewh(null, this);
        }
    }

    /* JADX INFO: renamed from: dn0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0588iobyxmoadg {
        public /* synthetic */ C0588iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0588iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f29221iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f29223yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f29224zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29223yggfygwlhe = obj;
            this.f29221iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uawqvzlxes(this);
        }
    }

    public static final class nufgyqmvbu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f29225zdlpuopuiu;

        /* JADX INFO: renamed from: dn0.iobyxmoadg$nufgyqmvbu$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0589iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f29226zdlpuopuiu;

            /* JADX INFO: renamed from: dn0.iobyxmoadg$nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0590iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f29228yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f29229zdlpuopuiu;

                public C0590iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f29229zdlpuopuiu = obj;
                    this.f29228yggfygwlhe |= Integer.MIN_VALUE;
                    return C0589iobyxmoadg.this.emit(null, this);
                }
            }

            public C0589iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f29226zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0590iobyxmoadg c0590iobyxmoadg;
                if (gxszxtbevoVar instanceof C0590iobyxmoadg) {
                    c0590iobyxmoadg = (C0590iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0590iobyxmoadg.f29228yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0590iobyxmoadg.f29228yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0590iobyxmoadg = new C0590iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0590iobyxmoadg = new C0590iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0590iobyxmoadg.f29229zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0590iobyxmoadg.f29228yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f29226zdlpuopuiu;
                    Long lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(((Number) obj).longValue() / 1000);
                    c0590iobyxmoadg.f29228yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(lEablkybsjg, c0590iobyxmoadg) == objGxszxtbevo) {
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

        public nufgyqmvbu(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f29225zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f29225zdlpuopuiu.collect(new C0589iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f29230jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ dn0.ppxfxbqfkf f29231yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f29232zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(dn0.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f29231yggfygwlhe = ppxfxbqfkfVar;
            this.f29230jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f29231yggfygwlhe, this.f29230jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f29232zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f29231yggfygwlhe, dn0.ppxfxbqfkf.iobyxmoadg.f29240iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f29230jyumaefscl;
                this.f29232zdlpuopuiu = 1;
                if (iobyxmoadgVar.lrnfpwlwnk(this) == objGxszxtbevo) {
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f29233jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ dn0.wkgbmnqykc f29234yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f29235zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(dn0.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f29234yggfygwlhe = wkgbmnqykcVar;
            this.f29233jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f29234yggfygwlhe, this.f29233jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f29235zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                dn0.wkgbmnqykc wkgbmnqykcVar = this.f29234yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, dn0.wkgbmnqykc.zoijcleaow.f29246iobyxmoadg)) {
                    this.f29233jyumaefscl.crxdokpmqz(dn0.eablkybsjg.iobyxmoadg.f29183iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, dn0.wkgbmnqykc.ppxfxbqfkf.f29244iobyxmoadg)) {
                    this.f29233jyumaefscl.zfvoamnweg();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, dn0.wkgbmnqykc.C0591wkgbmnqykc.f29245iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f29233jyumaefscl;
                    this.f29235zdlpuopuiu = 1;
                    if (iobyxmoadgVar.uawqvzlxes(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof dn0.wkgbmnqykc.eablkybsjg) {
                    iobyxmoadg iobyxmoadgVar2 = this.f29233jyumaefscl;
                    tzroggbefp tzroggbefpVarIobyxmoadg = ((dn0.wkgbmnqykc.eablkybsjg) this.f29234yggfygwlhe).iobyxmoadg();
                    this.f29235zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.zeieaojujs(tzroggbefpVarIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof dn0.wkgbmnqykc.gxszxtbevo) {
                    iobyxmoadg iobyxmoadgVar3 = this.f29233jyumaefscl;
                    String strIobyxmoadg = ((dn0.wkgbmnqykc.gxszxtbevo) this.f29234yggfygwlhe).iobyxmoadg();
                    this.f29235zdlpuopuiu = 3;
                    if (iobyxmoadgVar3.nuxfzjnpeb(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, dn0.wkgbmnqykc.iobyxmoadg.f29243iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar4 = this.f29233jyumaefscl;
                    String strDraadjrbmk = iobyxmoadg.ydmasvzmpa(iobyxmoadgVar4).getSmsCode().draadjrbmk();
                    this.f29235zdlpuopuiu = 4;
                    if (iobyxmoadgVar4.roivzttewh(strDraadjrbmk, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f29237zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f29237zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.dvvnrvtcbc();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, lmojexxdyd signupUseCase, wypolnanlu verifyUseCase, u11.ppxfxbqfkf smsCodeValidator) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signupUseCase, "signupUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(verifyUseCase, "verifyUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(smsCodeValidator, "smsCodeValidator");
        this.f29200ppxfxbqfkf = signupUseCase;
        this.f29201wkgbmnqykc = verifyUseCase;
        this.f29198eablkybsjg = smsCodeValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auzgnhcxok(long j13) {
        auzgnhcxok auzgnhcxokVar = this.f29199gxszxtbevo;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f29199gxszxtbevo = sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new dxjokdxxww(sj.dxjokdxxww.vdvldrhtss(new nufgyqmvbu(sj.dxjokdxxww.stevsuqkhv(q11.btonecajqb.nufgyqmvbu(j13, 0L, 2, null), new btonecajqb(null)))), this), new gtknphoqwx(this)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bfopjjpdmp(wypolnanlu.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (iobyxmoadgVar.zoijcleaow()) {
            zfvoamnweg();
        } else {
            crxdokpmqz(new dn0.eablkybsjg.ppxfxbqfkf(((State) jlmebxxoox()).getPhoneNumber(), iobyxmoadgVar.iobyxmoadg()));
        }
        ulzqkzuiru(new dn0.gxszxtbevo.eablkybsjg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dvvnrvtcbc() {
        auzgnhcxok auzgnhcxokVar = this.f29199gxszxtbevo;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object iwxlajgraz(iobyxmoadg iobyxmoadgVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.oipsdeybqn(str);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lrnfpwlwnk(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f29211iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f29211iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f29213yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f29211iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            eablkybsjgVar.f29214zdlpuopuiu = this;
            eablkybsjgVar.f29211iwizpuwonk = 1;
            if (crxdokpmqz.zoijcleaow(100L, eablkybsjgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f29214zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(dn0.eablkybsjg.C0584eablkybsjg.f29182iobyxmoadg);
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            iobyxmoadgVar.auzgnhcxok(TimeUnit.SECONDS.toMillis(Long.parseLong(((State) iobyxmoadgVar.jlmebxxoox()).getTimerValue())));
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.tbqsvytpvh(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object nuxfzjnpeb(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object objZeieaojujs = zeieaojujs(new tzroggbefp(mj.kcexrzcfyt.p(this.f29198eablkybsjg.iobyxmoadg(str)).toString(), 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null), gxszxtbevoVar);
        return objZeieaojujs == mg.zoijcleaow.gxszxtbevo() ? objZeieaojujs : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void oipsdeybqn(String str) {
        ulzqkzuiru(new dn0.gxszxtbevo.zoijcleaow(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object roivzttewh(String str, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar2;
        Object obj;
        iobyxmoadg iobyxmoadgVar3;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f29216esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f29216esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f29217iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f29216esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2.f29220zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                } catch (Throwable th2) {
                    th = th2;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = gxszxtbevoVar2.f29219yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) gxszxtbevoVar2.f29220zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2 = iobyxmoadgVar3;
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar2.tbqsvytpvh(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ulzqkzuiru(new dn0.gxszxtbevo.eablkybsjg(true));
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            wypolnanlu wypolnanluVar = this.f29201wkgbmnqykc;
            nw1.btonecajqb btonecajqbVar = new nw1.btonecajqb(((State) jlmebxxoox()).getPhoneNumber(), ((State) jlmebxxoox()).getHash(), str);
            gxszxtbevoVar2.f29220zdlpuopuiu = this;
            gxszxtbevoVar2.f29216esjtqupxsv = 1;
            objZoijcleaow = wypolnanluVar.zoijcleaow(btonecajqbVar, gxszxtbevoVar2);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } catch (Throwable th3) {
            th = th3;
            iobyxmoadgVar = this;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((wypolnanlu.iobyxmoadg) objZoijcleaow);
        Object obj2 = objWkgbmnqykc;
        iobyxmoadgVar2 = iobyxmoadgVar;
        obj = obj2;
        if (kcexrzcfyt.agtfadlqog(obj)) {
            gxszxtbevoVar2.f29220zdlpuopuiu = iobyxmoadgVar2;
            gxszxtbevoVar2.f29219yggfygwlhe = obj;
            gxszxtbevoVar2.f29218jyumaefscl = obj;
            gxszxtbevoVar2.f29216esjtqupxsv = 2;
            if (iobyxmoadgVar2.bfopjjpdmp((wypolnanlu.iobyxmoadg) obj, gxszxtbevoVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar3 = iobyxmoadgVar2;
            iobyxmoadgVar2 = iobyxmoadgVar3;
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar2.tbqsvytpvh(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uawqvzlxes(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f29221iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f29221iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZoijcleaow = lqeggnwhkgVar.f29223yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f29221iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new dn0.gxszxtbevo.ppxfxbqfkf(false));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                lmojexxdyd lmojexxdydVar = this.f29200ppxfxbqfkf;
                String phoneNumber = ((State) jlmebxxoox()).getPhoneNumber();
                lqeggnwhkgVar.f29224zdlpuopuiu = this;
                lqeggnwhkgVar.f29221iwizpuwonk = 1;
                objZoijcleaow = lmojexxdydVar.zoijcleaow(phoneNumber, lqeggnwhkgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f29224zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((nw1.dxjokdxxww) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            nw1.dxjokdxxww dxjokdxxwwVar = (nw1.dxjokdxxww) objWkgbmnqykc;
            iobyxmoadgVar.ulzqkzuiru(new dn0.gxszxtbevo.wkgbmnqykc(dxjokdxxwwVar.iobyxmoadg()));
            iobyxmoadgVar.auzgnhcxok(TimeUnit.SECONDS.toMillis(dxjokdxxwwVar.zoijcleaow()));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.tbqsvytpvh(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String weqkydbzbr(long j13) {
        long j14 = 60;
        String strValueOf = String.valueOf(j13 / j14);
        String strValueOf2 = String.valueOf(j13 % j14);
        return mj.kcexrzcfyt.tbqsvytpvh(strValueOf, 2, '0') + StringUtils.PROCESS_POSTFIX_DELIMITER + mj.kcexrzcfyt.tbqsvytpvh(strValueOf2, 2, '0');
    }

    public static final /* synthetic */ State ydmasvzmpa(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zeieaojujs(tzroggbefp tzroggbefpVar, lg.gxszxtbevo gxszxtbevoVar) {
        boolean zEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.draadjrbmk(), ((State) jlmebxxoox()).getSmsCode().draadjrbmk());
        ulzqkzuiru(new dn0.gxszxtbevo.C0585gxszxtbevo(tzroggbefpVar, false));
        boolean z13 = tzroggbefpVar.draadjrbmk().length() == 6;
        ulzqkzuiru(new dn0.gxszxtbevo.iobyxmoadg(z13));
        if (!z13 || zEablkybsjg) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objRoivzttewh = roivzttewh(tzroggbefpVar.draadjrbmk(), gxszxtbevoVar);
        return objRoivzttewh == mg.zoijcleaow.gxszxtbevo() ? objRoivzttewh : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg() {
        crxdokpmqz(dn0.eablkybsjg.zoijcleaow.f29187iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
        super.iobyxmoadg();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(dn0.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(dn0.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(action, this, null), 3, null);
    }

    public final void tbqsvytpvh(Throwable error) {
        Object objWkgbmnqykc;
        String string;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new dn0.gxszxtbevo.eablkybsjg(false));
        if (error instanceof DomainException) {
            String code = ((DomainException) error).getCode();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(code, "codeFailed")) {
                ulzqkzuiru(new dn0.gxszxtbevo.ppxfxbqfkf(true));
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(code, "manyRequestsCode")) {
                ulzqkzuiru(new dn0.gxszxtbevo.ppxfxbqfkf(true));
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    String message = error.getMessage();
                    if (message != null) {
                        StringBuilder sb3 = new StringBuilder();
                        int length = message.length();
                        for (int i13 = 0; i13 < length; i13++) {
                            char cCharAt = message.charAt(i13);
                            if (Character.isDigit(cCharAt)) {
                                sb3.append(cCharAt);
                            }
                        }
                        string = sb3.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = "";
                    }
                    auzgnhcxok(TimeUnit.SECONDS.toMillis(Long.parseLong(string)));
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
                if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                    ulzqkzuiru(dn0.gxszxtbevo.lqeggnwhkg.f29192iobyxmoadg);
                    dvvnrvtcbc();
                }
            }
        }
        crxdokpmqz(new dn0.eablkybsjg.wkgbmnqykc(error));
    }
}
