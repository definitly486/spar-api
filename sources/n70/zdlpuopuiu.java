package n70;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.widget.Toast;
import com.pandulapeter.beagle.common.configuration.Text;
import com.pandulapeter.beagle.modules.LifecycleLogListModule;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pj.ageimvtcrz;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.components.address.api.model.UserAddress;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class zdlpuopuiu implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final n70.zoijcleaow f69263cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final yggfygwlhe f69264cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ca2.wkgbmnqykc f69265esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private tg.draadjrbmk f69266hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final n70.wkgbmnqykc f69267iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final ConnectivityManager f69268istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gxszxtbevo f69269iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final cqumvgiudr f69270jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f69271lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final bv.ppxfxbqfkf f69272lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private auzgnhcxok f69273pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final na0.zoijcleaow f69274pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final bv.wkgbmnqykc f69275wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final jyumaefscl f69276yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final cllcsxoeiz f69277yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private auzgnhcxok f69278ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f69279zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final ye0.iobyxmoadg f69280zynmafqrjb;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69282zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69282zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ye0.iobyxmoadg iobyxmoadgVar = zdlpuopuiu.this.f69280zynmafqrjb;
                ze0.iobyxmoadg.C3301iobyxmoadg c3301iobyxmoadg = ze0.iobyxmoadg.C3301iobyxmoadg.f129802ppxfxbqfkf;
                AnalyticsPage.MainScreen mainScreen = AnalyticsPage.MainScreen.f84306iwizpuwonk;
                this.f69282zdlpuopuiu = 1;
                if (iobyxmoadgVar.lqeggnwhkg(c3301iobyxmoadg, mainScreen, this) == objGxszxtbevo) {
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
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69284zdlpuopuiu;

        /* JADX INFO: renamed from: n70.zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1486iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ User f69285yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f69286zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1486iobyxmoadg(User user, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f69285yggfygwlhe = user;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C1486iobyxmoadg(this.f69285yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f69286zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                p002if.iobyxmoadg.C1000iobyxmoadg.dxjokdxxww(hf.iobyxmoadg.f40131iobyxmoadg, new Text.CharSequence(String.valueOf(this.f69285yggfygwlhe)), false, false, 0L, null, 30, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C1486iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69284zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ca2.ppxfxbqfkf ppxfxbqfkfVar = zdlpuopuiu.this.f69271lereixgezr;
            this.f69284zdlpuopuiu = 1;
            obj = ppxfxbqfkfVar.lqeggnwhkg(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ageimvtcrz ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
            C1486iobyxmoadg c1486iobyxmoadg = new C1486iobyxmoadg((User) obj, null);
            this.f69284zdlpuopuiu = 2;
            if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, c1486iobyxmoadg, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69288zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ String f69289yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f69290zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f69289yggfygwlhe = str;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f69289yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f69290zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                p002if.iobyxmoadg.C1000iobyxmoadg.dxjokdxxww(hf.iobyxmoadg.f40131iobyxmoadg, new Text.CharSequence(this.f69289yggfygwlhe), true, false, 0L, null, 28, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69288zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            na0.zoijcleaow zoijcleaowVar = zdlpuopuiu.this.f69274pmvmpeiblj;
            this.f69288zdlpuopuiu = 1;
            obj = zoijcleaowVar.rgvfuqvkyq(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            StringBuilder sb3 = new StringBuilder();
            for (gg.vdvldrhtss vdvldrhtssVar : (List) obj) {
                sb3.append(vdvldrhtssVar.lqeggnwhkg() + " default = " + vdvldrhtssVar.nufgyqmvbu() + "\n\n");
            }
            String string = sb3.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
            ageimvtcrz ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(string, null);
            this.f69288zdlpuopuiu = 2;
            if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f69292jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f69293yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f69294zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ UserAddress.Delivery f69295jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f69296yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f69297zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, UserAddress.Delivery delivery, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f69296yggfygwlhe = zdlpuopuiuVar;
                this.f69295jyumaefscl = delivery;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f69296yggfygwlhe, this.f69295jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f69297zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    bv.ppxfxbqfkf ppxfxbqfkfVar = this.f69296yggfygwlhe.f69272lmojexxdyd;
                    bv.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new bv.ppxfxbqfkf.zoijcleaow(this.f69295jyumaefscl.getShopId(), bv.ppxfxbqfkf.iobyxmoadg.DELIVERY);
                    this.f69297zdlpuopuiu = 1;
                    if (ppxfxbqfkfVar.zoijcleaow(zoijcleaowVar, this) == objGxszxtbevo) {
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
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f69298yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f69299zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f69298yggfygwlhe = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f69298yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f69299zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu zdlpuopuiuVar = this.f69298yggfygwlhe;
                zdlpuopuiuVar.wypolnanlu(zdlpuopuiuVar.lereixgezr(), "Все адреса пользователя удалены!");
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ UserAddress.PickUp f69300jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f69301yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f69302zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(zdlpuopuiu zdlpuopuiuVar, UserAddress.PickUp pickUp, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f69301yggfygwlhe = zdlpuopuiuVar;
                this.f69300jyumaefscl = pickUp;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f69301yggfygwlhe, this.f69300jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f69302zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    bv.ppxfxbqfkf ppxfxbqfkfVar = this.f69301yggfygwlhe.f69272lmojexxdyd;
                    bv.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new bv.ppxfxbqfkf.zoijcleaow(this.f69300jyumaefscl.getShopId(), bv.ppxfxbqfkf.iobyxmoadg.PICKUP);
                    this.f69302zdlpuopuiu = 1;
                    if (ppxfxbqfkfVar.zoijcleaow(zoijcleaowVar, this) == objGxszxtbevo) {
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
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = zdlpuopuiu.this.new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f69292jyumaefscl = obj;
            return wkgbmnqykcVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00be A[LOOP:0: B:26:0x00b8->B:28:0x00be, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:31:0x00e2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00f7 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            cllcsxoeiz cllcsxoeizVar;
            Object objZoijcleaow;
            cllcsxoeiz cllcsxoeizVar2;
            ru.myspar.components.address.api.model.iobyxmoadg iobyxmoadgVar;
            zdlpuopuiu zdlpuopuiuVar;
            ArrayList arrayList;
            Iterator it;
            ageimvtcrz ageimvtcrzVarPpxfxbqfkf;
            ppxfxbqfkf ppxfxbqfkfVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69293yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    cllcsxoeizVar = (cllcsxoeiz) this.f69292jyumaefscl;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    objZoijcleaow = obj;
                } else if (i13 == 2) {
                    iobyxmoadgVar = (ru.myspar.components.address.api.model.iobyxmoadg) this.f69294zdlpuopuiu;
                    cllcsxoeizVar2 = (cllcsxoeiz) this.f69292jyumaefscl;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    List listWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
                    zdlpuopuiuVar = zdlpuopuiu.this;
                    arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
                    it = listWkgbmnqykc.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar2, null, null, new zoijcleaow(zdlpuopuiuVar, (UserAddress.PickUp) it.next(), null), 3, null));
                    }
                    this.f69292jyumaefscl = null;
                    this.f69294zdlpuopuiu = null;
                    this.f69293yggfygwlhe = 3;
                    if (pj.gxszxtbevo.iobyxmoadg(arrayList, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
                    ppxfxbqfkfVar = new ppxfxbqfkf(zdlpuopuiu.this, null);
                    this.f69293yggfygwlhe = 4;
                    if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, ppxfxbqfkfVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (i13 == 3) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
                    ppxfxbqfkfVar = new ppxfxbqfkf(zdlpuopuiu.this, null);
                    this.f69293yggfygwlhe = 4;
                    if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, ppxfxbqfkfVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeizVar = (cllcsxoeiz) this.f69292jyumaefscl;
            bv.wkgbmnqykc wkgbmnqykcVar = zdlpuopuiu.this.f69275wwaezpbzkn;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            this.f69292jyumaefscl = cllcsxoeizVar;
            this.f69293yggfygwlhe = 1;
            objZoijcleaow = wkgbmnqykcVar.zoijcleaow(wwaezpbzknVar, this);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ru.myspar.components.address.api.model.iobyxmoadg iobyxmoadgVar2 = (ru.myspar.components.address.api.model.iobyxmoadg) objZoijcleaow;
            List listPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf();
            zdlpuopuiu zdlpuopuiuVar2 = zdlpuopuiu.this;
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
            Iterator it2 = listPpxfxbqfkf.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new iobyxmoadg(zdlpuopuiuVar2, (UserAddress.Delivery) it2.next(), null), 3, null));
                arrayList2 = arrayList3;
            }
            this.f69292jyumaefscl = cllcsxoeizVar;
            this.f69294zdlpuopuiu = iobyxmoadgVar2;
            this.f69293yggfygwlhe = 2;
            if (pj.gxszxtbevo.iobyxmoadg(arrayList2, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cllcsxoeizVar2 = cllcsxoeizVar;
            iobyxmoadgVar = iobyxmoadgVar2;
            List listWkgbmnqykc2 = iobyxmoadgVar.wkgbmnqykc();
            zdlpuopuiuVar = zdlpuopuiu.this;
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc2, 10));
            it = listWkgbmnqykc2.iterator();
            while (it.hasNext()) {
                arrayList.add(pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar2, null, null, new zoijcleaow(zdlpuopuiuVar, (UserAddress.PickUp) it.next(), null), 3, null));
            }
            this.f69292jyumaefscl = null;
            this.f69294zdlpuopuiu = null;
            this.f69293yggfygwlhe = 3;
            if (pj.gxszxtbevo.iobyxmoadg(arrayList, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
            ppxfxbqfkfVar = new ppxfxbqfkf(zdlpuopuiu.this, null);
            this.f69293yggfygwlhe = 4;
            if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, ppxfxbqfkfVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69304zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ User f69305yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f69306zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(User user, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f69305yggfygwlhe = user;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f69305yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f69306zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                hf.iobyxmoadg iobyxmoadgVar = hf.iobyxmoadg.f40131iobyxmoadg;
                User user = this.f69305yggfygwlhe;
                p002if.iobyxmoadg.C1000iobyxmoadg.dxjokdxxww(iobyxmoadgVar, new Text.CharSequence(String.valueOf(user != null ? user.getTesterFunctions() : null)), false, false, 0L, null, 30, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69304zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ca2.ppxfxbqfkf ppxfxbqfkfVar = zdlpuopuiu.this.f69271lereixgezr;
            this.f69304zdlpuopuiu = 1;
            obj = ppxfxbqfkfVar.lqeggnwhkg(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ageimvtcrz ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg((User) obj, null);
            this.f69304zdlpuopuiu = 2;
            if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zdlpuopuiu(Context context, cllcsxoeiz coroutineScope, cqumvgiudr serverSelectionModuleFactory, gxszxtbevo clearLogsModuleFactory, yggfygwlhe pushHelperModuleFactory, ca2.wkgbmnqykc userSharedPreferences, ca2.ppxfxbqfkf userRepository, na0.zoijcleaow remoteConfigSource, ye0.iobyxmoadg loymaxPopupsObserver, ConnectivityManager connectivityManager, n70.zoijcleaow apiVersionSelectionModulesFactory, jyumaefscl pushTokenManagerHelperFactory, n70.wkgbmnqykc bitrixSelectionModuleFactory, bv.ppxfxbqfkf deleteAddressUseCase, bv.wkgbmnqykc getAddressesUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serverSelectionModuleFactory, "serverSelectionModuleFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearLogsModuleFactory, "clearLogsModuleFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pushHelperModuleFactory, "pushHelperModuleFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteConfigSource, "remoteConfigSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loymaxPopupsObserver, "loymaxPopupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectivityManager, "connectivityManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiVersionSelectionModulesFactory, "apiVersionSelectionModulesFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pushTokenManagerHelperFactory, "pushTokenManagerHelperFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bitrixSelectionModuleFactory, "bitrixSelectionModuleFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAddressUseCase, "deleteAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getAddressesUseCase, "getAddressesUseCase");
        this.f69279zdlpuopuiu = context;
        this.f69277yggfygwlhe = coroutineScope;
        this.f69270jyumaefscl = serverSelectionModuleFactory;
        this.f69269iwizpuwonk = clearLogsModuleFactory;
        this.f69264cqumvgiudr = pushHelperModuleFactory;
        this.f69265esjtqupxsv = userSharedPreferences;
        this.f69271lereixgezr = userRepository;
        this.f69274pmvmpeiblj = remoteConfigSource;
        this.f69280zynmafqrjb = loymaxPopupsObserver;
        this.f69268istkbnxepw = connectivityManager;
        this.f69263cdpycssgdh = apiVersionSelectionModulesFactory;
        this.f69276yadqdtsiqt = pushTokenManagerHelperFactory;
        this.f69267iozdgvuglv = bitrixSelectionModuleFactory;
        this.f69272lmojexxdyd = deleteAddressUseCase;
        this.f69275wwaezpbzkn = getAddressesUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cdpycssgdh() throws DomainException {
        throw new DomainException("Проверочный краш из дебаг панели", c42.iobyxmoadg.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cllcsxoeiz() {
        q30.iobyxmoadg.f77790iobyxmoadg.zoijcleaow(new DomainException("Проверочный краш из дебаг панели", null, 2, null));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hcddaimhww(zdlpuopuiu zdlpuopuiuVar) {
        ms.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.f69273pkzmftpjix);
        zdlpuopuiuVar.f69273pkzmftpjix = pj.gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar.f69277yggfygwlhe, ikoacuggdj.zoijcleaow(), null, zdlpuopuiuVar.new ppxfxbqfkf(null), 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hkdspvbjdz(zdlpuopuiu zdlpuopuiuVar) {
        if (zdlpuopuiuVar.f69265esjtqupxsv.nufgyqmvbu()) {
            pj.gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar.f69277yggfygwlhe, null, null, zdlpuopuiuVar.new eablkybsjg(null), 3, null);
        } else {
            zdlpuopuiuVar.wypolnanlu(zdlpuopuiuVar.f69279zdlpuopuiu, "Вы не авторизированы!");
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iozdgvuglv(zdlpuopuiu zdlpuopuiuVar) {
        ConnectivityManager connectivityManager = zdlpuopuiuVar.f69268istkbnxepw;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        zdlpuopuiuVar.wypolnanlu(zdlpuopuiuVar.f69279zdlpuopuiu, mj.kcexrzcfyt.btonecajqb("\n                        cellular = " + (networkCapabilities != null ? networkCapabilities.hasTransport(0) : false) + ",\n                        wifi = " + (networkCapabilities != null ? networkCapabilities.hasTransport(1) : false) + "\n                    "));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Text istkbnxepw(boolean z13) {
        return com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Замедл.аним.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jpowsppfya(zdlpuopuiu zdlpuopuiuVar) {
        ms.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.f69278ylkuphrtab);
        zdlpuopuiuVar.f69278ylkuphrtab = pj.gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar.f69277yggfygwlhe, ikoacuggdj.zoijcleaow(), null, zdlpuopuiuVar.new wkgbmnqykc(null), 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lmojexxdyd(boolean z13) {
        i42.iobyxmoadg.f41970iobyxmoadg.iobyxmoadg(z13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        ms.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.f69278ylkuphrtab);
        zdlpuopuiuVar.f69278ylkuphrtab = pj.gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar.f69277yggfygwlhe, ikoacuggdj.zoijcleaow(), null, zdlpuopuiuVar.new zoijcleaow(null), 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wwaezpbzkn(zdlpuopuiu zdlpuopuiuVar) {
        c60.zoijcleaow.zoijcleaow(zdlpuopuiuVar.f69279zdlpuopuiu, null, String.valueOf(zdlpuopuiuVar.f69265esjtqupxsv.lqeggnwhkg()), 1, null);
        zdlpuopuiuVar.wypolnanlu(zdlpuopuiuVar.f69279zdlpuopuiu, "Auth Токен скопирован");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wypolnanlu(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(zdlpuopuiu zdlpuopuiuVar) {
        Context context = zdlpuopuiuVar.f69279zdlpuopuiu;
        NetworkInfo activeNetworkInfo = zdlpuopuiuVar.f69268istkbnxepw.getActiveNetworkInfo();
        zdlpuopuiuVar.wypolnanlu(context, String.valueOf(activeNetworkInfo != null ? activeNetworkInfo.isConnected() : false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ylkuphrtab(zdlpuopuiu zdlpuopuiuVar) {
        ms.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.f69278ylkuphrtab);
        zdlpuopuiuVar.f69278ylkuphrtab = pj.gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar.f69277yggfygwlhe, ikoacuggdj.zoijcleaow(), null, zdlpuopuiuVar.new iobyxmoadg(null), 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(zdlpuopuiu zdlpuopuiuVar, boolean z13) {
        tg.draadjrbmk draadjrbmkVar = zdlpuopuiuVar.f69266hcddaimhww;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Boolean.valueOf(z13));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void dsvhmnatus(tg.draadjrbmk listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        this.f69266hcddaimhww = listener;
    }

    public final Context lereixgezr() {
        return this.f69279zdlpuopuiu;
    }

    @Override // tg.iobyxmoadg
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public jf.iobyxmoadg[] invoke() {
        xx.iobyxmoadg iobyxmoadgVar = xx.iobyxmoadg.f123319iobyxmoadg;
        nf.lqeggnwhkg lqeggnwhkgVar = new nf.lqeggnwhkg("Мой SPAR", iobyxmoadgVar.vdvldrhtss(), iobyxmoadgVar.yggfygwlhe() + " v" + iobyxmoadgVar.skhdrjzrfn() + " (" + iobyxmoadgVar.dvvnrvtcbc() + ")");
        nf.zoijcleaow zoijcleaowVar = new nf.zoijcleaow(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("О приложении"), false, null, null, false, null, 62, null);
        nf.wkgbmnqykc wkgbmnqykcVar = new nf.wkgbmnqykc(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Параметры разработчика"), false, null, null, false, null, 62, null);
        nf.draadjrbmk draadjrbmkVar = new nf.draadjrbmk(null, null, 3, null);
        nf.rgvfuqvkyq.zoijcleaow zoijcleaowVar2 = nf.rgvfuqvkyq.zoijcleaow.SECTION_HEADER;
        nf.rgvfuqvkyq rgvfuqvkyqVar = new nf.rgvfuqvkyq((CharSequence) "Общие", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null);
        nf.ojitshcjhn ojitshcjhnVar = new nf.ojitshcjhn("Счетчик запросов", false, false, false, false, null, new tg.draadjrbmk() { // from class: n70.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zdlpuopuiu.zynmafqrjb(this.f69250zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, 62, null);
        nf.dxjokdxxww dxjokdxxwwVar = new nf.dxjokdxxww(null, null, null, null, null, false, false, false, null, null, 1023, null);
        nf.iobyxmoadg iobyxmoadgVar2 = new nf.iobyxmoadg(new tg.draadjrbmk() { // from class: n70.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zdlpuopuiu.istkbnxepw(((Boolean) obj).booleanValue());
            }
        }, 0.0f, false, false, false, null, 62, null);
        nf.ojitshcjhn ojitshcjhnVar2 = new nf.ojitshcjhn("LeakCanary", false, false, false, false, null, new tg.draadjrbmk() { // from class: n70.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zdlpuopuiu.lmojexxdyd(((Boolean) obj).booleanValue());
            }
        }, 62, null);
        nf.wflxmlrfwp wflxmlrfwpVar = new nf.wflxmlrfwp(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Инструменты захвата экрана"), com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Сделать скриншот"), com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Запись экрана"), com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Открыть галерею"), false, 16, null);
        nf.gxszxtbevo gxszxtbevoVar = new nf.gxszxtbevo(null, 1, null);
        nf.rgvfuqvkyq rgvfuqvkyqVar2 = new nf.rgvfuqvkyq((CharSequence) "Уведомления", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null);
        jf.iobyxmoadg iobyxmoadgVarInvoke = this.f69264cqumvgiudr.invoke(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Отправить PUSH уведомление"));
        jf.iobyxmoadg iobyxmoadgVarInvoke2 = this.f69276yadqdtsiqt.invoke("Тестирование пуш-токена");
        nf.gxszxtbevo gxszxtbevoVar2 = new nf.gxszxtbevo(null, 1, null);
        nf.rgvfuqvkyq rgvfuqvkyqVar3 = new nf.rgvfuqvkyq((CharSequence) "Версия Bitrix", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null);
        jf.iobyxmoadg iobyxmoadgVarBtonecajqb = this.f69267iozdgvuglv.invoke();
        nf.gxszxtbevo gxszxtbevoVar3 = new nf.gxszxtbevo(null, 1, null);
        nf.rgvfuqvkyq rgvfuqvkyqVar4 = new nf.rgvfuqvkyq((CharSequence) "Сервер", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null);
        jf.iobyxmoadg iobyxmoadgVarAgtfadlqog = this.f69270jyumaefscl.invoke();
        nf.gxszxtbevo gxszxtbevoVar4 = new nf.gxszxtbevo(null, 1, null);
        nf.rgvfuqvkyq rgvfuqvkyqVar5 = new nf.rgvfuqvkyq((CharSequence) "Версия АПИ", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null);
        jf.iobyxmoadg iobyxmoadgVarWflxmlrfwp = this.f69263cdpycssgdh.invoke();
        nf.gxszxtbevo gxszxtbevoVar5 = new nf.gxszxtbevo(null, 1, null);
        nf.rgvfuqvkyq rgvfuqvkyqVar6 = new nf.rgvfuqvkyq((CharSequence) "Логи", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null);
        jf.iobyxmoadg iobyxmoadgVarInvoke3 = this.f69269iwizpuwonk.invoke(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Очистить логи"));
        nf.gtknphoqwx gtknphoqwxVar = new nf.gtknphoqwx(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Сетевые запросы"), 0, null, false, 14, null);
        nf.btonecajqb btonecajqbVar = new nf.btonecajqb(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Логи"), 0, null, null, false, false, 62, null);
        LifecycleLogListModule lifecycleLogListModule = new LifecycleLogListModule(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Жизненный цикл"), null, false, 0, null, false, 62, null);
        nf.gxszxtbevo gxszxtbevoVar6 = new nf.gxszxtbevo(null, 1, null);
        nf.rgvfuqvkyq rgvfuqvkyqVar7 = new nf.rgvfuqvkyq((CharSequence) "Токены", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null);
        Text.CharSequence charSequenceIobyxmoadg = com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Скопировать Auth токен");
        nf.rgvfuqvkyq.zoijcleaow zoijcleaowVar3 = nf.rgvfuqvkyq.zoijcleaow.BUTTON;
        return new jf.iobyxmoadg[]{lqeggnwhkgVar, zoijcleaowVar, wkgbmnqykcVar, draadjrbmkVar, rgvfuqvkyqVar, ojitshcjhnVar, dxjokdxxwwVar, iobyxmoadgVar2, ojitshcjhnVar2, wflxmlrfwpVar, gxszxtbevoVar, rgvfuqvkyqVar2, iobyxmoadgVarInvoke, iobyxmoadgVarInvoke2, gxszxtbevoVar2, rgvfuqvkyqVar3, iobyxmoadgVarBtonecajqb, gxszxtbevoVar3, rgvfuqvkyqVar4, iobyxmoadgVarAgtfadlqog, gxszxtbevoVar4, rgvfuqvkyqVar5, iobyxmoadgVarWflxmlrfwp, gxszxtbevoVar5, rgvfuqvkyqVar6, iobyxmoadgVarInvoke3, gtknphoqwxVar, btonecajqbVar, lifecycleLogListModule, gxszxtbevoVar6, rgvfuqvkyqVar7, new nf.rgvfuqvkyq((Text) charSequenceIobyxmoadg, zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.wwaezpbzkn(this.f69254zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.gxszxtbevo(null, 1, null), new nf.rgvfuqvkyq((CharSequence) "Информация о текущем User", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("User объект"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.ylkuphrtab(this.f69255zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Посмотреть ф-и тестировщика"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.pkzmftpjix(this.f69252zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Посмотреть фича тогглы (возможна задержка)"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.hcddaimhww(this.f69249zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Удалить все адреса пользователя"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.jpowsppfya(this.f69251zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.gxszxtbevo(null, 1, null), new nf.rgvfuqvkyq((CharSequence) "Другие", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null), new nf.eablkybsjg(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Информация об устройстве"), false, false, false, false, false, false, false, 254, null), new nf.ppxfxbqfkf(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Сообщить об ошибке"), null, null, false, null, 30, null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Loymax app_open эвент"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.hkdspvbjdz(this.f69237zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.gxszxtbevo(null, 1, null), new nf.rgvfuqvkyq((CharSequence) "Crashlytics", zoijcleaowVar2, (Integer) null, false, (String) null, (tg.iobyxmoadg) null, 60, (kotlin.jvm.internal.gtknphoqwx) null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Отправить non-fatal crash в Crashlytics"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.cllcsxoeiz();
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Отправить fatal crash в Crashlytics"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.cdpycssgdh();
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.gxszxtbevo(null, 1, null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Проверить что есть соединение с интернетом"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.yadqdtsiqt(this.f69236zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null), new nf.rgvfuqvkyq((Text) com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Проверить что текущая сеть может передавать данные по WIFI или моб. сети"), zoijcleaowVar3, (Integer) null, false, (String) null, new tg.iobyxmoadg() { // from class: n70.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.iozdgvuglv(this.f69256zdlpuopuiu);
            }
        }, 28, (kotlin.jvm.internal.gtknphoqwx) null)};
    }
}
