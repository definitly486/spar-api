package ws;

import android.os.Parcelable;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.dxjokdxxww;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.vdvldrhtss;
import pj.cllcsxoeiz;
import sj.nufgyqmvbu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow extends ntlheqmsrt {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final int f120553dxjokdxxww = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ws.ppxfxbqfkf f120554eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ws.ppxfxbqfkf f120555gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vs.zoijcleaow f120556iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ws.ppxfxbqfkf f120557lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final sj.lqeggnwhkg f120558nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f120559ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final a8.eablkybsjg f120560wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ns.iobyxmoadg f120561zoijcleaow;

    public static final class eablkybsjg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f120562yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f120563zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f120564yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f120565zdlpuopuiu;

            /* JADX INFO: renamed from: ws.zoijcleaow$eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C3027iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f120567yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f120568zdlpuopuiu;

                public C3027iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f120568zdlpuopuiu = obj;
                    this.f120567yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f120565zdlpuopuiu = nufgyqmvbuVar;
                this.f120564yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C3027iobyxmoadg c3027iobyxmoadg;
                if (gxszxtbevoVar instanceof C3027iobyxmoadg) {
                    c3027iobyxmoadg = (C3027iobyxmoadg) gxszxtbevoVar;
                    int i13 = c3027iobyxmoadg.f120567yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c3027iobyxmoadg.f120567yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c3027iobyxmoadg = new C3027iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c3027iobyxmoadg = new C3027iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c3027iobyxmoadg.f120568zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c3027iobyxmoadg.f120567yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f120565zdlpuopuiu;
                    Object objPkzmftpjix = this.f120564yggfygwlhe.pkzmftpjix((Parcelable) obj);
                    c3027iobyxmoadg.f120567yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(objPkzmftpjix, c3027iobyxmoadg) == objGxszxtbevo) {
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

        public eablkybsjg(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f120563zdlpuopuiu = lqeggnwhkgVar;
            this.f120562yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f120563zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f120562yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f120569yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f120570zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f120571yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f120572zdlpuopuiu;

            /* JADX INFO: renamed from: ws.zoijcleaow$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C3028iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f120574yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f120575zdlpuopuiu;

                public C3028iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f120575zdlpuopuiu = obj;
                    this.f120574yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f120572zdlpuopuiu = nufgyqmvbuVar;
                this.f120571yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C3028iobyxmoadg c3028iobyxmoadg;
                if (gxszxtbevoVar instanceof C3028iobyxmoadg) {
                    c3028iobyxmoadg = (C3028iobyxmoadg) gxszxtbevoVar;
                    int i13 = c3028iobyxmoadg.f120574yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c3028iobyxmoadg.f120574yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c3028iobyxmoadg = new C3028iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c3028iobyxmoadg = new C3028iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c3028iobyxmoadg.f120575zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c3028iobyxmoadg.f120574yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f120572zdlpuopuiu;
                    Object objCdpycssgdh = this.f120571yggfygwlhe.cdpycssgdh(obj);
                    c3028iobyxmoadg.f120574yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(objCdpycssgdh, c3028iobyxmoadg) == objGxszxtbevo) {
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

        public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f120570zdlpuopuiu = lqeggnwhkgVar;
            this.f120569yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f120570zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f120569yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements rgvfuqvkyq {
        iobyxmoadg(Object obj) {
            super(2, obj, zoijcleaow.class, "handleLabel", "handleLabel(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) this.receiver).lereixgezr(obj, gxszxtbevoVar);
        }
    }

    /* synthetic */ class lqeggnwhkg implements nufgyqmvbu, agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f120576zdlpuopuiu;

        lqeggnwhkg(draadjrbmk draadjrbmkVar) {
            this.f120576zdlpuopuiu = draadjrbmkVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objStevsuqkhv = zoijcleaow.stevsuqkhv(this.f120576zdlpuopuiu, obj, gxszxtbevoVar);
            return objStevsuqkhv == mg.zoijcleaow.gxszxtbevo() ? objStevsuqkhv : wwaezpbzkn.f37140iobyxmoadg;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof nufgyqmvbu) && (obj instanceof agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final dxjokdxxww zoijcleaow() {
            return new vdvldrhtss(2, this.f120576zdlpuopuiu, kotlin.jvm.internal.zdlpuopuiu.iobyxmoadg.class, "suspendConversion0", "subscribeUiLabel$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f120577jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120579zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f120577jyumaefscl = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(this.f120577jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f120579zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ws.ppxfxbqfkf ppxfxbqfkfVar = zoijcleaow.this.f120555gxszxtbevo;
                Object obj2 = this.f120577jyumaefscl;
                this.f120579zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.ppxfxbqfkf(obj2, this) == objGxszxtbevo) {
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

    public static final class wkgbmnqykc implements a8.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final /* synthetic */ a8.eablkybsjg f120580iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ xs.zoijcleaow f120581ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f120582wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ a8.eablkybsjg f120583zoijcleaow;

        wkgbmnqykc(a8.eablkybsjg eablkybsjgVar, xs.zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
            this.f120583zoijcleaow = eablkybsjgVar;
            this.f120581ppxfxbqfkf = zoijcleaowVar;
            this.f120582wkgbmnqykc = zoijcleaowVar2;
            this.f120580iobyxmoadg = eablkybsjgVar;
        }

        @Override // a8.eablkybsjg
        public void accept(Object intent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
            this.f120580iobyxmoadg.accept(intent);
        }

        @Override // a8.eablkybsjg
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public Parcelable getState() {
            return (Parcelable) this.f120580iobyxmoadg.getState();
        }

        @Override // a8.eablkybsjg
        public void init() {
            this.f120580iobyxmoadg.init();
        }

        @Override // a8.eablkybsjg
        public void iobyxmoadg() {
            this.f120583zoijcleaow.iobyxmoadg();
            this.f120581ppxfxbqfkf.eablkybsjg(this.f120582wkgbmnqykc.f120556iobyxmoadg.lqeggnwhkg());
        }

        @Override // a8.eablkybsjg
        public y7.iobyxmoadg ppxfxbqfkf(y7.ppxfxbqfkf observer) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observer, "observer");
            return this.f120580iobyxmoadg.ppxfxbqfkf(observer);
        }

        @Override // a8.eablkybsjg
        public y7.iobyxmoadg wkgbmnqykc(y7.ppxfxbqfkf observer) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observer, "observer");
            return this.f120580iobyxmoadg.wkgbmnqykc(observer);
        }

        @Override // a8.eablkybsjg
        public boolean zoijcleaow() {
            return this.f120580iobyxmoadg.zoijcleaow();
        }
    }

    /* JADX INFO: renamed from: ws.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C3029zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements rgvfuqvkyq {
        C3029zoijcleaow(Object obj) {
            super(2, obj, a8.eablkybsjg.class, "accept", "accept(Ljava/lang/Object;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.draadjrbmk((a8.eablkybsjg) this.f60022zdlpuopuiu, obj, gxszxtbevoVar);
        }
    }

    public zoijcleaow(vs.zoijcleaow storeFactory, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f120556iobyxmoadg = storeFactory;
        this.f120561zoijcleaow = dispatchersProvider;
        this.f120559ppxfxbqfkf = savedStateHandle;
        a8.eablkybsjg eablkybsjgVarPmvmpeiblj = pmvmpeiblj();
        this.f120560wkgbmnqykc = eablkybsjgVarPmvmpeiblj;
        int i13 = 15;
        gtknphoqwx gtknphoqwxVar = null;
        int i14 = 0;
        int i15 = 0;
        rj.iobyxmoadg iobyxmoadgVar = null;
        int i16 = 0;
        ws.ppxfxbqfkf ppxfxbqfkfVar = new ws.ppxfxbqfkf(i14, i15, iobyxmoadgVar, i16, i13, gtknphoqwxVar);
        this.f120554eablkybsjg = ppxfxbqfkfVar;
        ws.ppxfxbqfkf ppxfxbqfkfVar2 = new ws.ppxfxbqfkf(0, 0, null, 0, 15, null);
        this.f120555gxszxtbevo = ppxfxbqfkfVar2;
        this.f120557lqeggnwhkg = new ws.ppxfxbqfkf(i14, i15, iobyxmoadgVar, i16, i13, gtknphoqwxVar);
        this.f120558nufgyqmvbu = new eablkybsjg(e8.zoijcleaow.iobyxmoadg(eablkybsjgVarPmvmpeiblj), this);
        if (!eablkybsjgVarPmvmpeiblj.zoijcleaow()) {
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.mbcevpiqjq(e8.zoijcleaow.ppxfxbqfkf(eablkybsjgVarPmvmpeiblj, ulzqkzuiru.iobyxmoadg(this), 0, 2, null)), new iobyxmoadg(this)), ulzqkzuiru.iobyxmoadg(this));
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.wypolnanlu(new gxszxtbevo(ppxfxbqfkfVar2.wkgbmnqykc(), this), ppxfxbqfkfVar.wkgbmnqykc()), new C3029zoijcleaow(eablkybsjgVarPmvmpeiblj)), ulzqkzuiru.iobyxmoadg(this));
            eablkybsjgVarPmvmpeiblj.init();
        } else {
            throw new IllegalStateException(("Store " + eablkybsjgVarPmvmpeiblj.getClass().getName() + " is disposed! Please, check DI scope").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cdpycssgdh(Object obj) {
        return iwizpuwonk().invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object draadjrbmk(a8.eablkybsjg eablkybsjgVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjgVar.accept(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object pkzmftpjix(Parcelable parcelable) {
        return esjtqupxsv().invoke(parcelable);
    }

    private final a8.eablkybsjg pmvmpeiblj() {
        this.f120556iobyxmoadg.nufgyqmvbu(this.f120559ppxfxbqfkf);
        xs.zoijcleaow zoijcleaowVar = new xs.zoijcleaow(this.f120559ppxfxbqfkf);
        Parcelable parcelableZoijcleaow = zoijcleaowVar.zoijcleaow(this.f120556iobyxmoadg.lqeggnwhkg());
        if (parcelableZoijcleaow == null) {
            parcelableZoijcleaow = (Parcelable) this.f120556iobyxmoadg.dxjokdxxww();
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f120556iobyxmoadg.ppxfxbqfkf(parcelableZoijcleaow), zoijcleaowVar, this);
        zoijcleaowVar.ppxfxbqfkf(wkgbmnqykcVar, this.f120556iobyxmoadg.lqeggnwhkg(), new draadjrbmk() { // from class: ws.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.zynmafqrjb((zoijcleaow.wkgbmnqykc) obj);
            }
        });
        return wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object stevsuqkhv(draadjrbmk draadjrbmkVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmkVar.invoke(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Parcelable zynmafqrjb(wkgbmnqykc register) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(register, "$this$register");
        return register.getState();
    }

    public final Object cllcsxoeiz(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = this.f120557lqeggnwhkg.ppxfxbqfkf(obj, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final sj.lqeggnwhkg cqumvgiudr() {
        return this.f120558nufgyqmvbu;
    }

    protected abstract draadjrbmk esjtqupxsv();

    protected abstract draadjrbmk iwizpuwonk();

    public final Object jpowsppfya(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = this.f120554eablkybsjg.ppxfxbqfkf(obj, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void jyumaefscl(Object event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(event, null), 3, null);
    }

    protected abstract Object lereixgezr(Object obj, lg.gxszxtbevo gxszxtbevoVar);

    @Override // androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        this.f120560wkgbmnqykc.iobyxmoadg();
        super.onCleared();
    }

    public final Object wypolnanlu(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f120557lqeggnwhkg.wkgbmnqykc().collect(new lqeggnwhkg(draadjrbmkVar), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }
}
