package ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import mj.kcexrzcfyt;
import ow1.lmojexxdyd;
import ow1.wypolnanlu;
import ow1.zdlpuopuiu;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f92442btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private auzgnhcxok f92443dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zdlpuopuiu f92444eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lmojexxdyd f92445gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final wypolnanlu f92446lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ow1.ppxfxbqfkf f92447nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f92448ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u11.ppxfxbqfkf f92449wkgbmnqykc;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final C2150iobyxmoadg f92438gtknphoqwx = new C2150iobyxmoadg(null);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final int f92437draadjrbmk = 8;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final int f92441wflxmlrfwp = bn0.eablkybsjg.proloyalty_delete_account_send_code;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final int f92436agtfadlqog = bn0.eablkybsjg.proloyalty_delete_account;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final int f92439ojitshcjhn = bn0.eablkybsjg.proloyalty_delete_account_phone_hint;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final int f92440rgvfuqvkyq = bn0.eablkybsjg.proloyalty_delete_account_phone_after_sms_request_hint;

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f92451esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f92452iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f92453jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f92454yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92455zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92452iwizpuwonk = obj;
            this.f92451esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.fiwbwshyhd(null, this);
        }
    }

    static final class dxjokdxxww extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f92456jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f92457yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92458zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(jpowsppfya jpowsppfyaVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f92457yggfygwlhe = jpowsppfyaVar;
            this.f92456jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f92457yggfygwlhe, this.f92456jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92458zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            jpowsppfya jpowsppfyaVar = this.f92457yggfygwlhe;
            long j13 = jpowsppfyaVar.f60024zdlpuopuiu - 1000;
            jpowsppfyaVar.f60024zdlpuopuiu = j13;
            this.f92456jyumaefscl.iyctptxqzt(this.f92456jyumaefscl.tbqsvytpvh(j13));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f92459jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf f92460yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92461zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92460yggfygwlhe = ppxfxbqfkfVar;
            this.f92459jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f92460yggfygwlhe, this.f92459jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92461zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf ppxfxbqfkfVar = this.f92460yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.iobyxmoadg.f92483iobyxmoadg)) {
                    this.f92459jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.iobyxmoadg.f92487iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.C2151ppxfxbqfkf.f92484iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f92459jyumaefscl;
                    String strNufgyqmvbu = iobyxmoadg.zfvoamnweg(iobyxmoadgVar).getSmsCode();
                    this.f92461zdlpuopuiu = 1;
                    if (iobyxmoadgVar.uawqvzlxes(strNufgyqmvbu, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.zoijcleaow.f92486iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar2 = this.f92459jyumaefscl;
                    this.f92461zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.nuxfzjnpeb(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.wkgbmnqykc) {
                    this.f92459jyumaefscl.auzgnhcxok(((ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.wkgbmnqykc) this.f92460yggfygwlhe).iobyxmoadg());
                } else {
                    if (!(ppxfxbqfkfVar instanceof ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.eablkybsjg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f92459jyumaefscl.dvvnrvtcbc(((ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.eablkybsjg) this.f92460yggfygwlhe).iobyxmoadg());
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92462iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92464yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92465zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92464yggfygwlhe = obj;
            this.f92462iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.nuxfzjnpeb(this);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2150iobyxmoadg {
        public /* synthetic */ C2150iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return iobyxmoadg.f92441wflxmlrfwp;
        }

        public final int zoijcleaow() {
            return iobyxmoadg.f92439ojitshcjhn;
        }

        private C2150iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f92466cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f92468jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f92469yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92470zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92468jyumaefscl = obj;
            this.f92466cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.roivzttewh(this);
        }
    }

    static final class nufgyqmvbu extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92472zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new nufgyqmvbu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92472zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.wizcaqwiak();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92474zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f92474zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.hszhottldk();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f92475jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ fn0.iobyxmoadg f92476yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92477zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(fn0.iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92476yggfygwlhe = iobyxmoadgVar;
            this.f92475jyumaefscl = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f92476yggfygwlhe, this.f92475jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92477zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!(this.f92476yggfygwlhe instanceof fn0.iobyxmoadg.C0760iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f92475jyumaefscl;
                this.f92477zdlpuopuiu = 1;
                if (iobyxmoadgVar.roivzttewh(this) == objGxszxtbevo) {
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f92478iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f92480yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f92481zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f92480yggfygwlhe = obj;
            this.f92478iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.weqkydbzbr(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, u11.ppxfxbqfkf smsCodeValidator, zdlpuopuiu getUserInfoUseCase, lmojexxdyd signupUseCase, wypolnanlu verifyUseCase, ow1.ppxfxbqfkf deleteUserUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(smsCodeValidator, "smsCodeValidator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signupUseCase, "signupUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(verifyUseCase, "verifyUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteUserUseCase, "deleteUserUseCase");
        this.f92448ppxfxbqfkf = dispatchersProvider;
        this.f92449wkgbmnqykc = smsCodeValidator;
        this.f92444eablkybsjg = getUserInfoUseCase;
        this.f92445gxszxtbevo = signupUseCase;
        this.f92446lqeggnwhkg = verifyUseCase;
        this.f92447nufgyqmvbu = deleteUserUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auzgnhcxok(String str) throws IOException {
        iwxlajgraz(false);
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.wkgbmnqykc(kcexrzcfyt.y(sb3.toString(), 6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dvvnrvtcbc(String str) {
        String strIobyxmoadg = this.f92449wkgbmnqykc.iobyxmoadg(str);
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.lqeggnwhkg(strIobyxmoadg));
        crxdokpmqz(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.ppxfxbqfkf(strIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fiwbwshyhd(String str, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar2;
        Object obj;
        iobyxmoadg iobyxmoadgVar3;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f92451esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f92451esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object objZoijcleaow = btonecajqbVar.f92452iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f92451esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) btonecajqbVar.f92455zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                } catch (Throwable th2) {
                    th = th2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = btonecajqbVar.f92454yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) btonecajqbVar.f92455zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2 = iobyxmoadgVar3;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar2.iwxlajgraz(true);
                iobyxmoadgVar2.skhdrjzrfn(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
            wypolnanlu wypolnanluVar = this.f92446lqeggnwhkg;
            nw1.btonecajqb btonecajqbVar2 = new nw1.btonecajqb(((State) jlmebxxoox()).getPhoneNumber(), ((State) jlmebxxoox()).getSmsHash(), str);
            btonecajqbVar.f92455zdlpuopuiu = this;
            btonecajqbVar.f92451esjtqupxsv = 1;
            objZoijcleaow = wypolnanluVar.zoijcleaow(btonecajqbVar2, btonecajqbVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } catch (Throwable th3) {
            th = th3;
            iobyxmoadgVar = this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((wypolnanlu.iobyxmoadg) objZoijcleaow);
        Object obj2 = objWkgbmnqykc;
        iobyxmoadgVar2 = iobyxmoadgVar;
        obj = obj2;
        if (gg.kcexrzcfyt.agtfadlqog(obj)) {
            btonecajqbVar.f92455zdlpuopuiu = iobyxmoadgVar2;
            btonecajqbVar.f92454yggfygwlhe = obj;
            btonecajqbVar.f92453jyumaefscl = obj;
            btonecajqbVar.f92451esjtqupxsv = 2;
            if (iobyxmoadgVar2.weqkydbzbr(btonecajqbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar3 = iobyxmoadgVar2;
            iobyxmoadgVar2 = iobyxmoadgVar3;
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar2.iwxlajgraz(true);
            iobyxmoadgVar2.skhdrjzrfn(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hszhottldk() {
        auzgnhcxok auzgnhcxokVar = this.f92443dxjokdxxww;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha(nw1.dxjokdxxww dxjokdxxwwVar) {
        Object objWkgbmnqykc;
        this.f92442btonecajqb = true;
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.gxszxtbevo(f92436agtfadlqog, f92440rgvfuqvkyq, dxjokdxxwwVar.iobyxmoadg()));
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            lxfrhoxuzk(TimeUnit.SECONDS.toMillis(dxjokdxxwwVar.zoijcleaow()));
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            skhdrjzrfn(thDxjokdxxww);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwxlajgraz(boolean z13) {
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.C2149eablkybsjg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iyctptxqzt(String str) {
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.iobyxmoadg(str));
    }

    private final void lxfrhoxuzk(long j13) {
        jpowsppfya jpowsppfyaVar = new jpowsppfya();
        jpowsppfyaVar.f60024zdlpuopuiu = j13;
        this.f92443dxjokdxxww = q11.btonecajqb.wkgbmnqykc(sopmlzcsov(), (104 & 2) != 0 ? 0L : 0L, (104 & 4) != 0 ? 1000L : 1000L, (104 & 8) != 0 ? null : null, vg.iobyxmoadg.wkgbmnqykc(j13 / 1000.0f), (104 & 32) != 0 ? new q11.btonecajqb.iobyxmoadg(null) : null, (104 & 64) != 0 ? new q11.btonecajqb.zoijcleaow(null) : null, (104 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new q11.btonecajqb.ppxfxbqfkf(null) : new nufgyqmvbu(null), (104 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new q11.btonecajqb.wkgbmnqykc(null) : new dxjokdxxww(jpowsppfyaVar, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object nuxfzjnpeb(lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f92462iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f92462iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f92464yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f92462iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            crxdokpmqz(ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.C2152wkgbmnqykc.f92489iobyxmoadg);
            ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                lmojexxdyd lmojexxdydVar = this.f92445gxszxtbevo;
                String strLqeggnwhkg = ((State) jlmebxxoox()).getPhoneNumber();
                gxszxtbevoVar2.f92465zdlpuopuiu = this;
                gxszxtbevoVar2.f92462iwizpuwonk = 1;
                objZoijcleaow = lmojexxdydVar.zoijcleaow(strLqeggnwhkg, gxszxtbevoVar2);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2.f92465zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((nw1.dxjokdxxww) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.igdgnonuha((nw1.dxjokdxxww) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.skhdrjzrfn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object roivzttewh(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        int i13;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i14 = lqeggnwhkgVar.f92466cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f92466cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object obj = lqeggnwhkgVar.f92468jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = lqeggnwhkgVar.f92466cqumvgiudr;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            int i16 = f92441wflxmlrfwp;
            zdlpuopuiu zdlpuopuiuVar = this.f92444eablkybsjg;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            lqeggnwhkgVar.f92470zdlpuopuiu = this;
            lqeggnwhkgVar.f92469yggfygwlhe = i16;
            lqeggnwhkgVar.f92466cqumvgiudr = 1;
            Object objZoijcleaow = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar, lqeggnwhkgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            i13 = i16;
            obj = objZoijcleaow;
            iobyxmoadgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = lqeggnwhkgVar.f92469yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f92470zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        UserInfo userInfo = (UserInfo) obj;
        String phone = userInfo != null ? userInfo.getPhone() : null;
        if (phone == null) {
            phone = "";
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.ppxfxbqfkf(i13, phone));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn(Throwable th2) {
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
        crxdokpmqz(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.zoijcleaow(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tbqsvytpvh(long j13) {
        long j14 = j13 / 1000;
        long j15 = 60;
        String strValueOf = String.valueOf(j14 / j15);
        String strValueOf2 = String.valueOf(j14 % j15);
        return kcexrzcfyt.tbqsvytpvh(strValueOf, 2, '0') + StringUtils.PROCESS_POSTFIX_DELIMITER + kcexrzcfyt.tbqsvytpvh(strValueOf2, 2, '0');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uawqvzlxes(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(true));
        boolean z13 = str.length() == 0;
        if (z13 && !this.f92442btonecajqb) {
            Object objNuxfzjnpeb = nuxfzjnpeb(gxszxtbevoVar);
            return objNuxfzjnpeb == mg.zoijcleaow.gxszxtbevo() ? objNuxfzjnpeb : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (z13) {
            iwxlajgraz(true);
        } else if (!z13) {
            iwxlajgraz(false);
            Object objFiwbwshyhd = fiwbwshyhd(str, gxszxtbevoVar);
            return objFiwbwshyhd == mg.zoijcleaow.gxszxtbevo() ? objFiwbwshyhd : wwaezpbzkn.f37140iobyxmoadg;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object weqkydbzbr(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f92478iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f92478iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f92480yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f92478iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                ow1.ppxfxbqfkf ppxfxbqfkfVar = this.f92447nufgyqmvbu;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaowVar.f92481zdlpuopuiu = this;
                zoijcleaowVar.f92478iwizpuwonk = 1;
                if (ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f92481zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.skhdrjzrfn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak() {
        ulzqkzuiru(ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg.nufgyqmvbu.f92431iobyxmoadg);
        hszhottldk();
    }

    public static final /* synthetic */ State zfvoamnweg(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(null), 3, null);
        super.iobyxmoadg();
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: lrnfpwlwnk, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(fn0.iobyxmoadg action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: zeieaojujs, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(intent, this, null), 3, null);
    }
}
