package s80;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlinx.coroutines.TimeoutCancellationException;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.data.common.MockConstants;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.f;
import pj.ntlheqmsrt;
import pj.pkzmftpjix;
import ru.myspar.dynamic_qr.impl.domain.models.DynamicQrCode;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.user.models.UserDynamicQrCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C2576iobyxmoadg f105697lqeggnwhkg = new C2576iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f105698nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final o40.zoijcleaow f105699eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pkzmftpjix f105700gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dt.zoijcleaow f105701ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final na0.iobyxmoadg f105702wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f105703zoijcleaow;

    /* JADX INFO: renamed from: s80.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2576iobyxmoadg {
        public /* synthetic */ C2576iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2576iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f105705jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f105706yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f105707zdlpuopuiu;

        /* JADX INFO: renamed from: s80.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        static final class C2577iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f105708yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f105709zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2577iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f105708yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C2577iobyxmoadg(this.f105708yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f105709zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f105708yggfygwlhe.f105703zoijcleaow;
                    this.f105709zdlpuopuiu = 1;
                    obj = ppxfxbqfkfVar.dxjokdxxww(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C2577iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: s80.iobyxmoadg$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        static final class C2578ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f105710yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f105711zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2578ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f105710yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C2578ppxfxbqfkf(this.f105710yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f105711zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    o40.zoijcleaow zoijcleaowVar = this.f105710yggfygwlhe.f105699eablkybsjg;
                    this.f105711zdlpuopuiu = 1;
                    obj = zoijcleaowVar.eablkybsjg(4, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C2578ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f105712yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f105713zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            wkgbmnqykc(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f105712yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new wkgbmnqykc(this.f105712yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f105713zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    na0.iobyxmoadg iobyxmoadgVar = this.f105712yggfygwlhe.f105702wkgbmnqykc;
                    this.f105713zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.wkgbmnqykc(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public /* synthetic */ class zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f105714iobyxmoadg;

            static {
                int[] iArr = new int[o40.wkgbmnqykc.values().length];
                try {
                    iArr[o40.wkgbmnqykc.GOOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o40.wkgbmnqykc.POOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o40.wkgbmnqykc.OFFLINE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f105714iobyxmoadg = iArr;
            }
        }

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f105705jyumaefscl = obj;
            return ppxfxbqfkfVar;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0111 A[Catch: all -> 0x010e, TryCatch #2 {all -> 0x010e, blocks: (B:45:0x00d9, B:47:0x00ed, B:50:0x00f8, B:54:0x0118, B:53:0x0111, B:42:0x00c7), top: B:81:0x00c7 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x012f  */
        /* JADX WARN: Code duplicated, block: B:62:0x0133  */
        /* JADX WARN: Code duplicated, block: B:64:0x013f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:67:0x014c  */
        /* JADX WARN: Code duplicated, block: B:73:0x015a  */
        /* JADX WARN: Code duplicated, block: B:74:0x015d  */
        /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            ntlheqmsrt ntlheqmsrtVarZoijcleaow;
            iobyxmoadg iobyxmoadgVar;
            Object objPpxfxbqfkf;
            ntlheqmsrt ntlheqmsrtVar;
            Throwable th2;
            Object objWkgbmnqykc2;
            Throwable thDxjokdxxww;
            r80.iobyxmoadg iobyxmoadgVar2;
            Object objLqeggnwhkg;
            long jDxjokdxxww;
            Object c2579iobyxmoadg;
            int i13;
            cllcsxoeiz cllcsxoeizVar;
            Object objPpxfxbqfkf2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = this.f105706yggfygwlhe;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        cllcsxoeizVar = (cllcsxoeiz) this.f105705jyumaefscl;
                        zdlpuopuiu.zoijcleaow(obj);
                        objPpxfxbqfkf2 = obj;
                    } else {
                        if (i14 == 2) {
                            iobyxmoadgVar = (iobyxmoadg) this.f105707zdlpuopuiu;
                            ntlheqmsrtVar = (ntlheqmsrt) this.f105705jyumaefscl;
                            try {
                                zdlpuopuiu.zoijcleaow(obj);
                                ntlheqmsrtVarZoijcleaow = ntlheqmsrtVar;
                                objPpxfxbqfkf = obj;
                                UserDynamicQrCode userDynamicQrCode = (UserDynamicQrCode) objPpxfxbqfkf;
                                jDxjokdxxww = iobyxmoadgVar.f105701ppxfxbqfkf.dxjokdxxww(userDynamicQrCode.getCodeExpiration());
                                if (jDxjokdxxww > 0 || kcexrzcfyt.zfvoamnweg(userDynamicQrCode.getQrCode())) {
                                    c2579iobyxmoadg = new zoijcleaow.C2579iobyxmoadg(r80.iobyxmoadg.INVALID_QR);
                                } else {
                                    c2579iobyxmoadg = new zoijcleaow.C2580zoijcleaow(new DynamicQrCode(userDynamicQrCode.getQrCode(), userDynamicQrCode.getDesc()), jDxjokdxxww * 1000);
                                }
                                objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(c2579iobyxmoadg);
                            } catch (Throwable th3) {
                                th2 = th3;
                                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                                objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                                ntlheqmsrtVarZoijcleaow = ntlheqmsrtVar;
                            }
                            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                            if (thDxjokdxxww == null) {
                                return objWkgbmnqykc2;
                            }
                            if (thDxjokdxxww instanceof TimeoutCancellationException) {
                                this.f105705jyumaefscl = null;
                                this.f105707zdlpuopuiu = null;
                                this.f105706yggfygwlhe = 3;
                                objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                                if (objLqeggnwhkg == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            } else {
                                iobyxmoadgVar2 = r80.iobyxmoadg.BACKEND;
                            }
                            return new zoijcleaow.C2579iobyxmoadg(iobyxmoadgVar2);
                        }
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj);
                        objLqeggnwhkg = obj;
                    }
                    i13 = zoijcleaow.f105714iobyxmoadg[((o40.wkgbmnqykc) objLqeggnwhkg).ordinal()];
                    if (i13 == 1) {
                        iobyxmoadgVar2 = r80.iobyxmoadg.BACKEND;
                    } else {
                        if (i13 == 2 && i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iobyxmoadgVar2 = r80.iobyxmoadg.INTERNET;
                    }
                    return new zoijcleaow.C2579iobyxmoadg(iobyxmoadgVar2);
                }
                zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeizVar = (cllcsxoeiz) this.f105705jyumaefscl;
                if (!iobyxmoadg.this.f105699eablkybsjg.isConnected()) {
                    return new zoijcleaow.C2579iobyxmoadg(r80.iobyxmoadg.INTERNET);
                }
                iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(iobyxmoadgVar4, null);
                this.f105705jyumaefscl = cllcsxoeizVar;
                this.f105706yggfygwlhe = 1;
                objPpxfxbqfkf2 = f.ppxfxbqfkf(MockConstants.TWO_SECONDS_DELAY, wkgbmnqykcVar, this);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objPpxfxbqfkf2).booleanValue()));
            } catch (Throwable th4) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th4));
            }
            rs.wkgbmnqykc wkgbmnqykcVar2 = rs.wkgbmnqykc.f83693iobyxmoadg;
            Throwable thDxjokdxxww2 = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww2 != null) {
                wkgbmnqykcVar2.gxszxtbevo(thDxjokdxxww2, new CrashlyticsKey[0]);
            }
            Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = boolIobyxmoadg;
            }
            if (!((Boolean) objWkgbmnqykc).booleanValue()) {
                return new zoijcleaow.C2579iobyxmoadg(r80.iobyxmoadg.FEATURE_TOGGLE);
            }
            ntlheqmsrtVarZoijcleaow = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new C2578ppxfxbqfkf(iobyxmoadg.this, null), 3, null);
            iobyxmoadgVar = iobyxmoadg.this;
            try {
                C2577iobyxmoadg c2577iobyxmoadg = new C2577iobyxmoadg(iobyxmoadgVar, null);
                this.f105705jyumaefscl = ntlheqmsrtVarZoijcleaow;
                this.f105707zdlpuopuiu = iobyxmoadgVar;
                this.f105706yggfygwlhe = 2;
                objPpxfxbqfkf = f.ppxfxbqfkf(MockConstants.TWO_SECONDS_DELAY, c2577iobyxmoadg, this);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                UserDynamicQrCode userDynamicQrCode2 = (UserDynamicQrCode) objPpxfxbqfkf;
                jDxjokdxxww = iobyxmoadgVar.f105701ppxfxbqfkf.dxjokdxxww(userDynamicQrCode2.getCodeExpiration());
                if (jDxjokdxxww > 0) {
                    c2579iobyxmoadg = new zoijcleaow.C2579iobyxmoadg(r80.iobyxmoadg.INVALID_QR);
                } else {
                    c2579iobyxmoadg = new zoijcleaow.C2579iobyxmoadg(r80.iobyxmoadg.INVALID_QR);
                }
                objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(c2579iobyxmoadg);
            } catch (Throwable th5) {
                th2 = th5;
                ntlheqmsrtVar = ntlheqmsrtVarZoijcleaow;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                ntlheqmsrtVarZoijcleaow = ntlheqmsrtVar;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
            if (thDxjokdxxww == null) {
                return objWkgbmnqykc2;
            }
            if (thDxjokdxxww instanceof TimeoutCancellationException) {
                this.f105705jyumaefscl = null;
                this.f105707zdlpuopuiu = null;
                this.f105706yggfygwlhe = 3;
                objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i13 = zoijcleaow.f105714iobyxmoadg[((o40.wkgbmnqykc) objLqeggnwhkg).ordinal()];
                if (i13 == 1) {
                    if (i13 == 2) {
                    }
                    iobyxmoadgVar2 = r80.iobyxmoadg.INTERNET;
                } else {
                    iobyxmoadgVar2 = r80.iobyxmoadg.BACKEND;
                }
            } else {
                iobyxmoadgVar2 = r80.iobyxmoadg.BACKEND;
            }
            return new zoijcleaow.C2579iobyxmoadg(iobyxmoadgVar2);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static abstract class zoijcleaow {

        /* JADX INFO: renamed from: s80.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2579iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final r80.iobyxmoadg f105715iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2579iobyxmoadg(r80.iobyxmoadg errorType) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorType, "errorType");
                this.f105715iobyxmoadg = errorType;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2579iobyxmoadg) && this.f105715iobyxmoadg == ((C2579iobyxmoadg) obj).f105715iobyxmoadg;
            }

            public int hashCode() {
                return this.f105715iobyxmoadg.hashCode();
            }

            public final r80.iobyxmoadg iobyxmoadg() {
                return this.f105715iobyxmoadg;
            }

            public String toString() {
                return "Error(errorType=" + this.f105715iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: s80.iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2580zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final DynamicQrCode f105716iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final long f105717zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2580zoijcleaow(DynamicQrCode model, long j13) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
                this.f105716iobyxmoadg = model;
                this.f105717zoijcleaow = j13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2580zoijcleaow)) {
                    return false;
                }
                C2580zoijcleaow c2580zoijcleaow = (C2580zoijcleaow) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f105716iobyxmoadg, c2580zoijcleaow.f105716iobyxmoadg) && this.f105717zoijcleaow == c2580zoijcleaow.f105717zoijcleaow;
            }

            public int hashCode() {
                return (this.f105716iobyxmoadg.hashCode() * 31) + Long.hashCode(this.f105717zoijcleaow);
            }

            public final long iobyxmoadg() {
                return this.f105717zoijcleaow;
            }

            public String toString() {
                return "Success(model=" + this.f105716iobyxmoadg + ", duration=" + this.f105717zoijcleaow + ")";
            }

            public final DynamicQrCode zoijcleaow() {
                return this.f105716iobyxmoadg;
            }
        }

        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ca2.ppxfxbqfkf userRepository, dt.zoijcleaow dateUtils, na0.iobyxmoadg featureManager, o40.zoijcleaow connectivityChecker, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectivityChecker, "connectivityChecker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f105703zoijcleaow = userRepository;
        this.f105701ppxfxbqfkf = dateUtils;
        this.f105702wkgbmnqykc = featureManager;
        this.f105699eablkybsjg = connectivityChecker;
        this.f105700gxszxtbevo = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f105700gxszxtbevo, new ppxfxbqfkf(null), gxszxtbevoVar);
    }
}
