package pr0;

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

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow extends ntlheqmsrt {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final int f77194dxjokdxxww = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pr0.ppxfxbqfkf f77195eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pr0.ppxfxbqfkf f77196gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final or0.zoijcleaow f77197iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final pr0.ppxfxbqfkf f77198lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final sj.lqeggnwhkg f77199nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f77200ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final a8.eablkybsjg f77201wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dr0.iobyxmoadg f77202zoijcleaow;

    public static final class eablkybsjg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f77203yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f77204zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f77205yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f77206zdlpuopuiu;

            /* JADX INFO: renamed from: pr0.zoijcleaow$eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1710iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f77208yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f77209zdlpuopuiu;

                public C1710iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f77209zdlpuopuiu = obj;
                    this.f77208yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f77206zdlpuopuiu = nufgyqmvbuVar;
                this.f77205yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1710iobyxmoadg c1710iobyxmoadg;
                if (gxszxtbevoVar instanceof C1710iobyxmoadg) {
                    c1710iobyxmoadg = (C1710iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1710iobyxmoadg.f77208yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1710iobyxmoadg.f77208yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1710iobyxmoadg = new C1710iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1710iobyxmoadg = new C1710iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1710iobyxmoadg.f77209zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1710iobyxmoadg.f77208yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f77206zdlpuopuiu;
                    Object objPkzmftpjix = this.f77205yggfygwlhe.pkzmftpjix((Parcelable) obj);
                    c1710iobyxmoadg.f77208yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(objPkzmftpjix, c1710iobyxmoadg) == objGxszxtbevo) {
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
            this.f77204zdlpuopuiu = lqeggnwhkgVar;
            this.f77203yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f77204zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f77203yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f77210yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f77211zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f77212yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f77213zdlpuopuiu;

            /* JADX INFO: renamed from: pr0.zoijcleaow$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1711iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f77215yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f77216zdlpuopuiu;

                public C1711iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f77216zdlpuopuiu = obj;
                    this.f77215yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f77213zdlpuopuiu = nufgyqmvbuVar;
                this.f77212yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1711iobyxmoadg c1711iobyxmoadg;
                if (gxszxtbevoVar instanceof C1711iobyxmoadg) {
                    c1711iobyxmoadg = (C1711iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1711iobyxmoadg.f77215yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1711iobyxmoadg.f77215yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1711iobyxmoadg = new C1711iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1711iobyxmoadg = new C1711iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1711iobyxmoadg.f77216zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1711iobyxmoadg.f77215yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f77213zdlpuopuiu;
                    Object objCdpycssgdh = this.f77212yggfygwlhe.cdpycssgdh(obj);
                    c1711iobyxmoadg.f77215yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(objCdpycssgdh, c1711iobyxmoadg) == objGxszxtbevo) {
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
            this.f77211zdlpuopuiu = lqeggnwhkgVar;
            this.f77210yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f77211zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f77210yggfygwlhe), gxszxtbevoVar);
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
        final /* synthetic */ draadjrbmk f77217zdlpuopuiu;

        lqeggnwhkg(draadjrbmk draadjrbmkVar) {
            this.f77217zdlpuopuiu = draadjrbmkVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objStevsuqkhv = zoijcleaow.stevsuqkhv(this.f77217zdlpuopuiu, obj, gxszxtbevoVar);
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
            return new vdvldrhtss(2, this.f77217zdlpuopuiu, kotlin.jvm.internal.zdlpuopuiu.iobyxmoadg.class, "suspendConversion0", "subscribeUiLabel$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f77218jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f77220zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f77218jyumaefscl = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(this.f77218jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f77220zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                pr0.ppxfxbqfkf ppxfxbqfkfVar = zoijcleaow.this.f77196gxszxtbevo;
                Object obj2 = this.f77218jyumaefscl;
                this.f77220zdlpuopuiu = 1;
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
        private final /* synthetic */ a8.eablkybsjg f77221iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f77222ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ rr0.zoijcleaow f77223wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ a8.eablkybsjg f77224zoijcleaow;

        wkgbmnqykc(a8.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, rr0.zoijcleaow zoijcleaowVar2) {
            this.f77224zoijcleaow = eablkybsjgVar;
            this.f77222ppxfxbqfkf = zoijcleaowVar;
            this.f77223wkgbmnqykc = zoijcleaowVar2;
            this.f77221iobyxmoadg = eablkybsjgVar;
        }

        @Override // a8.eablkybsjg
        public void accept(Object intent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
            this.f77221iobyxmoadg.accept(intent);
        }

        @Override // a8.eablkybsjg
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public Parcelable getState() {
            return (Parcelable) this.f77221iobyxmoadg.getState();
        }

        @Override // a8.eablkybsjg
        public void init() {
            this.f77221iobyxmoadg.init();
        }

        @Override // a8.eablkybsjg
        public void iobyxmoadg() {
            this.f77224zoijcleaow.iobyxmoadg();
            if (this.f77222ppxfxbqfkf.f77197iobyxmoadg.nufgyqmvbu()) {
                this.f77223wkgbmnqykc.eablkybsjg(this.f77222ppxfxbqfkf.f77197iobyxmoadg.lqeggnwhkg());
            }
        }

        @Override // a8.eablkybsjg
        public y7.iobyxmoadg ppxfxbqfkf(y7.ppxfxbqfkf observer) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observer, "observer");
            return this.f77221iobyxmoadg.ppxfxbqfkf(observer);
        }

        @Override // a8.eablkybsjg
        public y7.iobyxmoadg wkgbmnqykc(y7.ppxfxbqfkf observer) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observer, "observer");
            return this.f77221iobyxmoadg.wkgbmnqykc(observer);
        }

        @Override // a8.eablkybsjg
        public boolean zoijcleaow() {
            return this.f77221iobyxmoadg.zoijcleaow();
        }
    }

    /* JADX INFO: renamed from: pr0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C1712zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements rgvfuqvkyq {
        C1712zoijcleaow(Object obj) {
            super(2, obj, a8.eablkybsjg.class, "accept", "accept(Ljava/lang/Object;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.draadjrbmk((a8.eablkybsjg) this.f60022zdlpuopuiu, obj, gxszxtbevoVar);
        }
    }

    public zoijcleaow(or0.zoijcleaow storeFactory, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f77197iobyxmoadg = storeFactory;
        this.f77202zoijcleaow = dispatchersProvider;
        this.f77200ppxfxbqfkf = savedStateHandle;
        a8.eablkybsjg eablkybsjgVarPmvmpeiblj = pmvmpeiblj();
        this.f77201wkgbmnqykc = eablkybsjgVarPmvmpeiblj;
        int i13 = 15;
        gtknphoqwx gtknphoqwxVar = null;
        int i14 = 0;
        int i15 = 0;
        rj.iobyxmoadg iobyxmoadgVar = null;
        int i16 = 0;
        pr0.ppxfxbqfkf ppxfxbqfkfVar = new pr0.ppxfxbqfkf(i14, i15, iobyxmoadgVar, i16, i13, gtknphoqwxVar);
        this.f77195eablkybsjg = ppxfxbqfkfVar;
        pr0.ppxfxbqfkf ppxfxbqfkfVar2 = new pr0.ppxfxbqfkf(0, 0, null, 0, 15, null);
        this.f77196gxszxtbevo = ppxfxbqfkfVar2;
        this.f77198lqeggnwhkg = new pr0.ppxfxbqfkf(i14, i15, iobyxmoadgVar, i16, i13, gtknphoqwxVar);
        this.f77199nufgyqmvbu = new eablkybsjg(e8.zoijcleaow.iobyxmoadg(eablkybsjgVarPmvmpeiblj), this);
        if (!eablkybsjgVarPmvmpeiblj.zoijcleaow()) {
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.mbcevpiqjq(e8.zoijcleaow.ppxfxbqfkf(eablkybsjgVarPmvmpeiblj, ulzqkzuiru.iobyxmoadg(this), 0, 2, null)), new iobyxmoadg(this)), ulzqkzuiru.iobyxmoadg(this));
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.wypolnanlu(new gxszxtbevo(ppxfxbqfkfVar2.wkgbmnqykc(), this), ppxfxbqfkfVar.wkgbmnqykc()), new C1712zoijcleaow(eablkybsjgVarPmvmpeiblj)), ulzqkzuiru.iobyxmoadg(this));
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
        Parcelable parcelableZoijcleaow;
        this.f77197iobyxmoadg.dxjokdxxww(this.f77200ppxfxbqfkf);
        rr0.zoijcleaow zoijcleaowVar = new rr0.zoijcleaow(this.f77200ppxfxbqfkf);
        boolean zNufgyqmvbu = this.f77197iobyxmoadg.nufgyqmvbu();
        Boolean boolValueOf = Boolean.valueOf(zNufgyqmvbu);
        if (!zNufgyqmvbu) {
            boolValueOf = null;
        }
        if (boolValueOf == null || (parcelableZoijcleaow = zoijcleaowVar.zoijcleaow(this.f77197iobyxmoadg.lqeggnwhkg())) == null) {
            parcelableZoijcleaow = (Parcelable) this.f77197iobyxmoadg.btonecajqb();
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f77197iobyxmoadg.ppxfxbqfkf(parcelableZoijcleaow), this, zoijcleaowVar);
        if (this.f77197iobyxmoadg.nufgyqmvbu()) {
            zoijcleaowVar.ppxfxbqfkf(wkgbmnqykcVar, this.f77197iobyxmoadg.lqeggnwhkg(), new draadjrbmk() { // from class: pr0.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return zoijcleaow.zynmafqrjb((zoijcleaow.wkgbmnqykc) obj);
                }
            });
        }
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
        Object objPpxfxbqfkf = this.f77198lqeggnwhkg.ppxfxbqfkf(obj, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final sj.lqeggnwhkg cqumvgiudr() {
        return this.f77199nufgyqmvbu;
    }

    protected abstract draadjrbmk esjtqupxsv();

    protected abstract draadjrbmk iwizpuwonk();

    public final Object jpowsppfya(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = this.f77195eablkybsjg.ppxfxbqfkf(obj, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void jyumaefscl(Object event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(event, null), 3, null);
    }

    protected abstract Object lereixgezr(Object obj, lg.gxszxtbevo gxszxtbevoVar);

    @Override // androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        this.f77201wkgbmnqykc.iobyxmoadg();
        super.onCleared();
    }

    public final Object wypolnanlu(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f77198lqeggnwhkg.wkgbmnqykc().collect(new lqeggnwhkg(draadjrbmkVar), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }
}
