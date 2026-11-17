package ru.myspar.proloyalty.dynamic_qr.impl.domain.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import ow1.jpowsppfya;
import ow1.pkzmftpjix;
import ow1.zdlpuopuiu;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.qr.domain.model.QrModel;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserNews;
import ru.myspar.proloyalty.user.domain.model.UserState;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final pkzmftpjix f95925btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final yk1.iobyxmoadg f95926dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final al1.zoijcleaow f95927eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zdlpuopuiu f95928gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final jpowsppfya f95929lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final do0.gxszxtbevo f95930nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a71.iobyxmoadg f95931ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final al1.ppxfxbqfkf f95932wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95933yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95934zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95934zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f95933yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            agtfadlqog agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            agtfadlqogVar.f95933yggfygwlhe = th2;
            return agtfadlqogVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f95936yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95937zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            btonecajqb btonecajqbVar = iobyxmoadg.this.new btonecajqb(gxszxtbevoVar);
            btonecajqbVar.f95936yggfygwlhe = ((Boolean) obj).booleanValue();
            return btonecajqbVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95937zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.dynamic_qr.impl.domain.store.gxszxtbevo.iobyxmoadg(this.f95936yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class draadjrbmk implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f95938zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.iobyxmoadg$draadjrbmk$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2253iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f95939zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.iobyxmoadg$draadjrbmk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2254iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f95941yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f95942zdlpuopuiu;

                public C2254iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f95942zdlpuopuiu = obj;
                    this.f95941yggfygwlhe |= Integer.MIN_VALUE;
                    return C2253iobyxmoadg.this.emit(null, this);
                }
            }

            public C2253iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f95939zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2254iobyxmoadg c2254iobyxmoadg;
                if (gxszxtbevoVar instanceof C2254iobyxmoadg) {
                    c2254iobyxmoadg = (C2254iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2254iobyxmoadg.f95941yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2254iobyxmoadg.f95941yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2254iobyxmoadg = new C2254iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2254iobyxmoadg = new C2254iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2254iobyxmoadg.f95942zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2254iobyxmoadg.f95941yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f95939zdlpuopuiu;
                    if (obj instanceof UserState.NonAuth) {
                        c2254iobyxmoadg.f95941yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2254iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public draadjrbmk(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f95938zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f95938zdlpuopuiu.collect(new C2253iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f95943zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.iobyxmoadg$dxjokdxxww$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2255iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f95944zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.iobyxmoadg$dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2256iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f95946yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f95947zdlpuopuiu;

                public C2256iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f95947zdlpuopuiu = obj;
                    this.f95946yggfygwlhe |= Integer.MIN_VALUE;
                    return C2255iobyxmoadg.this.emit(null, this);
                }
            }

            public C2255iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f95944zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2256iobyxmoadg c2256iobyxmoadg;
                if (gxszxtbevoVar instanceof C2256iobyxmoadg) {
                    c2256iobyxmoadg = (C2256iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2256iobyxmoadg.f95946yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2256iobyxmoadg.f95946yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2256iobyxmoadg = new C2256iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2256iobyxmoadg = new C2256iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2256iobyxmoadg.f95947zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2256iobyxmoadg.f95946yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f95944zdlpuopuiu;
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((UserNews) obj).getHasActiveDiscount());
                    c2256iobyxmoadg.f95946yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c2256iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public dxjokdxxww(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f95943zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f95943zdlpuopuiu.collect(new C2255iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95949yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95950zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = iobyxmoadg.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f95949yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95950zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.dynamic_qr.impl.domain.store.gxszxtbevo.ppxfxbqfkf((DynamicQrCodeStore$QrType) this.f95949yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DynamicQrCodeStore$QrType dynamicQrCodeStore$QrType, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(dynamicQrCodeStore$QrType, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95951yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95952zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95952zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f95951yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gtknphoqwx gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            gtknphoqwxVar.f95951yggfygwlhe = th2;
            return gtknphoqwxVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95953yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95954zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95954zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f95953yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f95953yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2257iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95956zdlpuopuiu;

        C2257iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2257iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f95956zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f95956zdlpuopuiu = 1;
                if (iobyxmoadgVar.uwvvkdfqfp(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2257iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95958yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95959zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.this.new lqeggnwhkg(gxszxtbevoVar);
            lqeggnwhkgVar.f95958yggfygwlhe = obj;
            return lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95959zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.dynamic_qr.impl.domain.store.gxszxtbevo.wkgbmnqykc((UserBalance) this.f95958yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserBalance userBalance, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(userBalance, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95960yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95961zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95961zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f95960yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            nufgyqmvbu nufgyqmvbuVar2 = new nufgyqmvbu(gxszxtbevoVar);
            nufgyqmvbuVar2.f95960yggfygwlhe = th2;
            return nufgyqmvbuVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f95962iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95964yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95965zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95964yggfygwlhe = obj;
            this.f95962iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uwvvkdfqfp(this);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95967zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95967zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(ru.myspar.proloyalty.dynamic_qr.impl.domain.store.eablkybsjg.iobyxmoadg.f95917iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserState.NonAuth nonAuth, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(nonAuth, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f95968yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f95969zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2258iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f95970yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f95971zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.iobyxmoadg$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2259iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                Object f95973jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f95974yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f95975zdlpuopuiu;

                public C2259iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f95975zdlpuopuiu = obj;
                    this.f95974yggfygwlhe |= Integer.MIN_VALUE;
                    return C2258iobyxmoadg.this.emit(null, this);
                }
            }

            public C2258iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f95971zdlpuopuiu = nufgyqmvbuVar;
                this.f95970yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0061  */
            /* JADX WARN: Code duplicated, block: B:27:0x006c A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2259iobyxmoadg c2259iobyxmoadg;
                sj.nufgyqmvbu nufgyqmvbuVar;
                sj.nufgyqmvbu nufgyqmvbuVar2;
                Object code;
                if (gxszxtbevoVar instanceof C2259iobyxmoadg) {
                    c2259iobyxmoadg = (C2259iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2259iobyxmoadg.f95974yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2259iobyxmoadg.f95974yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2259iobyxmoadg = new C2259iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2259iobyxmoadg = new C2259iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2259iobyxmoadg.f95975zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2259iobyxmoadg.f95974yggfygwlhe;
                if (i14 != 0) {
                    if (i14 == 1) {
                        nufgyqmvbuVar2 = (sj.nufgyqmvbu) c2259iobyxmoadg.f95973jyumaefscl;
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj2);
                nufgyqmvbuVar = this.f95971zdlpuopuiu;
                QrModel qrModel = (QrModel) obj;
                if (qrModel != null) {
                    code = new DynamicQrCodeStore$QrType.Code(qrModel);
                } else {
                    iobyxmoadg iobyxmoadgVar = this.f95970yggfygwlhe;
                    c2259iobyxmoadg.f95973jyumaefscl = nufgyqmvbuVar;
                    c2259iobyxmoadg.f95974yggfygwlhe = 1;
                    Object objMetgxyhuhe = iobyxmoadgVar.metgxyhuhe(c2259iobyxmoadg);
                    if (objMetgxyhuhe == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    obj2 = objMetgxyhuhe;
                    nufgyqmvbuVar2 = nufgyqmvbuVar;
                }
                if (code != null) {
                    c2259iobyxmoadg.f95973jyumaefscl = null;
                    c2259iobyxmoadg.f95974yggfygwlhe = 2;
                    if (nufgyqmvbuVar.emit(code, c2259iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
                code = (DynamicQrCodeStore$QrType) obj2;
                nufgyqmvbuVar = nufgyqmvbuVar2;
                if (code != null) {
                    c2259iobyxmoadg.f95973jyumaefscl = null;
                    c2259iobyxmoadg.f95974yggfygwlhe = 2;
                    if (nufgyqmvbuVar.emit(code, c2259iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f95969zdlpuopuiu = lqeggnwhkgVar;
            this.f95968yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f95969zdlpuopuiu.collect(new C2258iobyxmoadg(nufgyqmvbuVar, this.f95968yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f95976jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f95978zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95978zdlpuopuiu = obj;
            this.f95976jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(a71.iobyxmoadg isAutoBrightnessEnabledUseCase, al1.ppxfxbqfkf refreshQrsUseCase, al1.zoijcleaow observeCurrentQrcodeUseCase, zdlpuopuiu getUserInfoUseCase, jpowsppfya subscribeUserStateUseCase, do0.gxszxtbevo subscribeUserBalanceUseCase, yk1.iobyxmoadg qrChangeStatusObserver, pkzmftpjix subscribeUserNewsUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAutoBrightnessEnabledUseCase, "isAutoBrightnessEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(refreshQrsUseCase, "refreshQrsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observeCurrentQrcodeUseCase, "observeCurrentQrcodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserStateUseCase, "subscribeUserStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserBalanceUseCase, "subscribeUserBalanceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qrChangeStatusObserver, "qrChangeStatusObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserNewsUseCase, "subscribeUserNewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f95931ppxfxbqfkf = isAutoBrightnessEnabledUseCase;
        this.f95932wkgbmnqykc = refreshQrsUseCase;
        this.f95927eablkybsjg = observeCurrentQrcodeUseCase;
        this.f95928gxszxtbevo = getUserInfoUseCase;
        this.f95929lqeggnwhkg = subscribeUserStateUseCase;
        this.f95930nufgyqmvbu = subscribeUserBalanceUseCase;
        this.f95926dxjokdxxww = qrChangeStatusObserver;
        this.f95925btonecajqb = subscribeUserNewsUseCase;
    }

    private final void czzsidtyhn(Throwable th2) {
        crxdokpmqz(new ru.myspar.proloyalty.dynamic_qr.impl.domain.store.eablkybsjg.ppxfxbqfkf(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object metgxyhuhe(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        String cardNumber;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f95976jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f95976jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f95978zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f95976jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            zdlpuopuiu zdlpuopuiuVar = this.f95928gxszxtbevo;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaowVar.f95976jyumaefscl = 1;
            objZoijcleaow = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        UserInfo userInfo = (UserInfo) objZoijcleaow;
        if (userInfo == null || (cardNumber = userInfo.getCardNumber()) == null) {
            return null;
        }
        return new DynamicQrCodeStore$QrType.Card(cardNumber);
    }

    private final void oipsdeybqn() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new draadjrbmk((sj.lqeggnwhkg) this.f95929lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)), new wflxmlrfwp(null)), new agtfadlqog(null)), sopmlzcsov());
    }

    private final QrModel.Dynamic okpsazkaxt(DynamicQrCodeStore$QrType dynamicQrCodeStore$QrType) {
        DynamicQrCodeStore$QrType.Code code = dynamicQrCodeStore$QrType instanceof DynamicQrCodeStore$QrType.Code ? (DynamicQrCodeStore$QrType.Code) dynamicQrCodeStore$QrType : null;
        QrModel qrModel = code != null ? code.getQrModel() : null;
        if (qrModel instanceof QrModel.Dynamic) {
            return (QrModel.Dynamic) qrModel;
        }
        return null;
    }

    private final void rlfsiqarku() {
        QrModel.Dynamic dynamicOkpsazkaxt;
        DynamicQrCodeStore$QrType qrType = ((State) jlmebxxoox()).getQrType();
        if (qrType == null || (dynamicOkpsazkaxt = okpsazkaxt(qrType)) == null) {
            return;
        }
        if (dynamicOkpsazkaxt.getStatus() == xk1.iobyxmoadg.ARCHIVED) {
            dynamicOkpsazkaxt = null;
        }
        if (dynamicOkpsazkaxt != null) {
            this.f95926dxjokdxxww.gtknphoqwx(dynamicOkpsazkaxt);
        }
    }

    private final void sflfametgt() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.lereixgezr((sj.lqeggnwhkg) this.f95930nufgyqmvbu.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)), new lqeggnwhkg(null)), new nufgyqmvbu(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uwvvkdfqfp(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f95962iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f95962iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f95964yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f95962iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (((State) jlmebxxoox()).getIsLoading()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ulzqkzuiru(new ru.myspar.proloyalty.dynamic_qr.impl.domain.store.gxszxtbevo.zoijcleaow(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                al1.ppxfxbqfkf ppxfxbqfkfVar2 = this.f95932wkgbmnqykc;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f95965zdlpuopuiu = this;
                ppxfxbqfkfVar.f95962iwizpuwonk = 1;
                if (ppxfxbqfkfVar2.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f95965zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.dynamic_qr.impl.domain.store.gxszxtbevo.zoijcleaow(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ydmasvzmpa() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new wkgbmnqykc(this.f95927eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), this), new eablkybsjg(null)), new gxszxtbevo(null)), sopmlzcsov());
    }

    private final void yfnezrywwk() {
        if (((Boolean) this.f95931ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            crxdokpmqz(ru.myspar.proloyalty.dynamic_qr.impl.domain.store.eablkybsjg.wkgbmnqykc.f95919iobyxmoadg);
        }
    }

    private final void zfvoamnweg() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.vdvldrhtss(new dxjokdxxww((sj.lqeggnwhkg) this.f95925btonecajqb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg))), new btonecajqb(null)), new gtknphoqwx(null)), sopmlzcsov());
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        rlfsiqarku();
        super.iobyxmoadg();
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.dynamic_qr.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.proloyalty.dynamic_qr.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f95981iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        yfnezrywwk();
        oipsdeybqn();
        sflfametgt();
        ydmasvzmpa();
        zfvoamnweg();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.zoijcleaow.f95985iobyxmoadg)) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2257iobyxmoadg(null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f95983iobyxmoadg)) {
            this.f95927eablkybsjg.nufgyqmvbu();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.C2260wkgbmnqykc.f95984iobyxmoadg)) {
            this.f95927eablkybsjg.lqeggnwhkg();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.dynamic_qr.impl.domain.store.wkgbmnqykc.iobyxmoadg.f95982iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(ru.myspar.proloyalty.dynamic_qr.impl.domain.store.eablkybsjg.zoijcleaow.f95920iobyxmoadg);
        }
    }
}
