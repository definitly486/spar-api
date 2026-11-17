package ru.myspar.dynamic_qr.impl.domain.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ra2.dxjokdxxww;
import ru.myspar.user.models.UserCard;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final s80.zoijcleaow f88150eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final s80.iobyxmoadg f88151ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f88152wkgbmnqykc;

    /* JADX INFO: renamed from: ru.myspar.dynamic_qr.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2016iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f88153jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.dynamic_qr.impl.domain.store.ppxfxbqfkf f88154yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88155zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2016iobyxmoadg(ru.myspar.dynamic_qr.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88154yggfygwlhe = ppxfxbqfkfVar;
            this.f88153jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2016iobyxmoadg(this.f88154yggfygwlhe, this.f88153jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88155zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88154yggfygwlhe, ru.myspar.dynamic_qr.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f88169iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f88153jyumaefscl.uwvvkdfqfp();
                if (((Boolean) this.f88153jyumaefscl.f88150eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    this.f88153jyumaefscl.crxdokpmqz(eablkybsjg.zoijcleaow.f88144iobyxmoadg);
                }
                iobyxmoadg iobyxmoadgVar = this.f88153jyumaefscl;
                this.f88155zdlpuopuiu = 1;
                if (iobyxmoadgVar.rlfsiqarku(this) == objGxszxtbevo) {
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
            return ((C2016iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f88156cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f88158jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f88159yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f88160zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f88158jyumaefscl = obj;
            this.f88156cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(this);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f88162yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88163zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f88162yggfygwlhe = obj;
            return wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88163zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg((UserCard) this.f88162yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserCard userCard, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(userCard, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f88164jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.dynamic_qr.impl.domain.store.wkgbmnqykc f88165yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88166zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ru.myspar.dynamic_qr.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88165yggfygwlhe = wkgbmnqykcVar;
            this.f88164jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f88165yggfygwlhe, this.f88164jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88166zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88165yggfygwlhe, ru.myspar.dynamic_qr.impl.domain.store.wkgbmnqykc.iobyxmoadg.f88170iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (iobyxmoadg.okpsazkaxt(this.f88164jyumaefscl).getIsLoading()) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                iobyxmoadg iobyxmoadgVar = this.f88164jyumaefscl;
                this.f88166zdlpuopuiu = 1;
                if (iobyxmoadgVar.rlfsiqarku(this) == objGxszxtbevo) {
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(s80.iobyxmoadg getDynamicQrCodeUseCase, dxjokdxxww subscribeOnUserCardUseCase, s80.zoijcleaow isAutoBrightnessEnabledUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDynamicQrCodeUseCase, "getDynamicQrCodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeOnUserCardUseCase, "subscribeOnUserCardUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAutoBrightnessEnabledUseCase, "isAutoBrightnessEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f88151ppxfxbqfkf = getDynamicQrCodeUseCase;
        this.f88152wkgbmnqykc = subscribeOnUserCardUseCase;
        this.f88150eablkybsjg = isAutoBrightnessEnabledUseCase;
    }

    private final void czzsidtyhn(Throwable th2) {
        crxdokpmqz(new eablkybsjg.iobyxmoadg(th2));
    }

    public static final /* synthetic */ State okpsazkaxt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0068, B:31:0x006e, B:37:0x00a6, B:39:0x00aa, B:43:0x00c0, B:44:0x00c5), top: B:57:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0068, B:31:0x006e, B:37:0x00a6, B:39:0x00aa, B:43:0x00c0, B:44:0x00c5), top: B:57:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0068, B:31:0x006e, B:37:0x00a6, B:39:0x00aa, B:43:0x00c0, B:44:0x00c5), top: B:57:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0068, B:31:0x006e, B:37:0x00a6, B:39:0x00aa, B:43:0x00c0, B:44:0x00c5), top: B:57:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        s80.iobyxmoadg.zoijcleaow zoijcleaowVar;
        long jIobyxmoadg;
        s80.iobyxmoadg.zoijcleaow zoijcleaowVar2;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f88156cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f88156cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f88158jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f88156cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                s80.iobyxmoadg iobyxmoadgVar4 = this.f88151ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f88160zdlpuopuiu = this;
                ppxfxbqfkfVar.f88156cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar4.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
                zoijcleaowVar = (s80.iobyxmoadg.zoijcleaow) objZoijcleaow;
                if (zoijcleaowVar instanceof s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) {
                    iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.zoijcleaow(((s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) zoijcleaowVar).zoijcleaow()));
                    jIobyxmoadg = ((s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) zoijcleaowVar).iobyxmoadg();
                    ppxfxbqfkfVar.f88160zdlpuopuiu = iobyxmoadgVar2;
                    ppxfxbqfkfVar.f88159yggfygwlhe = zoijcleaowVar;
                    ppxfxbqfkfVar.f88156cqumvgiudr = 2;
                    if (crxdokpmqz.zoijcleaow(jIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar2 = zoijcleaowVar;
                    iobyxmoadgVar = iobyxmoadgVar2;
                    iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) zoijcleaowVar2).zoijcleaow().getQrcode()));
                } else {
                    if (zoijcleaowVar instanceof s80.iobyxmoadg.zoijcleaow.C2579iobyxmoadg) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.eablkybsjg(((s80.iobyxmoadg.zoijcleaow.C2579iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
                    iobyxmoadgVar = iobyxmoadgVar2;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else if (i14 == 1) {
            iobyxmoadgVar2 = (iobyxmoadg) ppxfxbqfkfVar.f88160zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                zoijcleaowVar = (s80.iobyxmoadg.zoijcleaow) objZoijcleaow;
                if (zoijcleaowVar instanceof s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) {
                    iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.zoijcleaow(((s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) zoijcleaowVar).zoijcleaow()));
                    jIobyxmoadg = ((s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) zoijcleaowVar).iobyxmoadg();
                    ppxfxbqfkfVar.f88160zdlpuopuiu = iobyxmoadgVar2;
                    ppxfxbqfkfVar.f88159yggfygwlhe = zoijcleaowVar;
                    ppxfxbqfkfVar.f88156cqumvgiudr = 2;
                    if (crxdokpmqz.zoijcleaow(jIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar2 = zoijcleaowVar;
                    iobyxmoadgVar = iobyxmoadgVar2;
                    iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) zoijcleaowVar2).zoijcleaow().getQrcode()));
                } else {
                    if (zoijcleaowVar instanceof s80.iobyxmoadg.zoijcleaow.C2579iobyxmoadg) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.eablkybsjg(((s80.iobyxmoadg.zoijcleaow.C2579iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
                    iobyxmoadgVar = iobyxmoadgVar2;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th3) {
                th = th3;
                iobyxmoadgVar = iobyxmoadgVar2;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar2 = (s80.iobyxmoadg.zoijcleaow) ppxfxbqfkfVar.f88159yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f88160zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((s80.iobyxmoadg.zoijcleaow.C2580zoijcleaow) zoijcleaowVar2).zoijcleaow().getQrcode()));
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th4) {
                th = th4;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok uwvvkdfqfp() {
        return sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f88152wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new wkgbmnqykc(null)), sopmlzcsov());
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.dynamic_qr.impl.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.dynamic_qr.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2016iobyxmoadg(action, this, null), 3, null);
    }
}
