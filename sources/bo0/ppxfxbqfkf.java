package bo0;

import android.content.Context;
import android.content.SharedPreferences;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gk.jyumaefscl;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.wflxmlrfwp;
import tg.rgvfuqvkyq;
import xn0.UserBalanceEntity;
import yn0.CardsReplacementRequest;
import zn0.CardActivationInfoResponse;
import zn0.PersonalCardDataDtoResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements bo0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wn0.iobyxmoadg f16874iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SharedPreferences f16875ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gk.zoijcleaow f16876zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f16878jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f16879yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f16880zdlpuopuiu;

        eablkybsjg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            ppxfxbqfkfVar.f16875ppxfxbqfkf.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void yggfygwlhe(zdlpuopuiu zdlpuopuiuVar, ppxfxbqfkf ppxfxbqfkfVar, SharedPreferences sharedPreferences, String str) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("CardSharedPreferencesUserBalance", str)) {
                UserBalanceEntity userBalanceEntityBtonecajqb = ppxfxbqfkfVar.btonecajqb();
                zdlpuopuiuVar.eablkybsjg(userBalanceEntityBtonecajqb != null ? ao0.zoijcleaow.zoijcleaow(userBalanceEntityBtonecajqb) : null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = ppxfxbqfkf.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f16878jyumaefscl = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zdlpuopuiu zdlpuopuiuVar;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f16879yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f16880zdlpuopuiu;
                    zdlpuopuiuVar = (zdlpuopuiu) this.f16878jyumaefscl;
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
            final zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) this.f16878jyumaefscl;
            final ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: bo0.wkgbmnqykc
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    ppxfxbqfkf.eablkybsjg.yggfygwlhe(zdlpuopuiuVar2, ppxfxbqfkfVar, sharedPreferences, str);
                }
            };
            ppxfxbqfkf.this.f16875ppxfxbqfkf.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
            UserBalanceEntity userBalanceEntityBtonecajqb = ppxfxbqfkf.this.btonecajqb();
            UserBalance userBalanceZoijcleaow = userBalanceEntityBtonecajqb != null ? ao0.zoijcleaow.zoijcleaow(userBalanceEntityBtonecajqb) : null;
            this.f16878jyumaefscl = zdlpuopuiuVar2;
            this.f16880zdlpuopuiu = onSharedPreferenceChangeListener2;
            this.f16879yggfygwlhe = 1;
            if (zdlpuopuiuVar2.gxszxtbevo(userBalanceZoijcleaow, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zdlpuopuiuVar = zdlpuopuiuVar2;
            onSharedPreferenceChangeListener = onSharedPreferenceChangeListener2;
            final ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.this;
            tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: bo0.eablkybsjg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ppxfxbqfkf.eablkybsjg.jyumaefscl(ppxfxbqfkfVar2, onSharedPreferenceChangeListener);
                }
            };
            this.f16878jyumaefscl = null;
            this.f16880zdlpuopuiu = null;
            this.f16879yggfygwlhe = 2;
            if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f16881jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f16883zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f16883zdlpuopuiu = obj;
            this.f16881jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.eablkybsjg(null, this);
        }
    }

    /* JADX INFO: renamed from: bo0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C0303ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f16884jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f16886zdlpuopuiu;

        C0303ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f16886zdlpuopuiu = obj;
            this.f16884jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f16887jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f16889zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f16889zdlpuopuiu = obj;
            this.f16887jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.zoijcleaow(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f16890iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f16892yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f16893zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f16892yggfygwlhe = obj;
            this.f16890iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.gxszxtbevo(this);
        }
    }

    public ppxfxbqfkf(wn0.iobyxmoadg api, Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(api, "api");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f16874iobyxmoadg = api;
        this.f16876zoijcleaow = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: bo0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.gtknphoqwx((gk.eablkybsjg) obj);
            }
        }, 1, null);
        this.f16875ppxfxbqfkf = context.getSharedPreferences("CardSharedPreferences", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserBalanceEntity btonecajqb() {
        Object objWkgbmnqykc;
        String string = this.f16875ppxfxbqfkf.getString("CardSharedPreferencesUserBalance", null);
        if (string == null) {
            return null;
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            gk.zoijcleaow zoijcleaowVar = this.f16876zoijcleaow;
            zoijcleaowVar.iobyxmoadg();
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((UserBalanceEntity) zoijcleaowVar.ppxfxbqfkf(UserBalanceEntity.INSTANCE.serializer(), string));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        return (UserBalanceEntity) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
    }

    private final void draadjrbmk(UserBalanceEntity userBalanceEntity) {
        String strZoijcleaow;
        SharedPreferences preferences = this.f16875ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            if (userBalanceEntity != null) {
                gk.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = gk.zoijcleaow.f37751wkgbmnqykc;
                iobyxmoadgVar2.iobyxmoadg();
                strZoijcleaow = iobyxmoadgVar2.zoijcleaow(UserBalanceEntity.INSTANCE.serializer(), userBalanceEntity);
            } else {
                strZoijcleaow = null;
            }
            kcexrzcfyt.wkgbmnqykc(editorEdit.putString("CardSharedPreferencesUserBalance", strZoijcleaow));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(gk.eablkybsjg Json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bo0.iobyxmoadg
    public Object eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f16881jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f16881jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f16883zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f16881jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            wn0.iobyxmoadg iobyxmoadgVar2 = this.f16874iobyxmoadg;
            CardsReplacementRequest cardsReplacementRequest = new CardsReplacementRequest(str);
            iobyxmoadgVar.f16881jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc(cardsReplacementRequest, iobyxmoadgVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bo0.iobyxmoadg
    public Object gxszxtbevo(gxszxtbevo gxszxtbevoVar) throws ao0.iobyxmoadg {
        zoijcleaow zoijcleaowVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f16890iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f16890iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = zoijcleaowVar.f16892yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f16890iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            wn0.iobyxmoadg iobyxmoadgVar = this.f16874iobyxmoadg;
            zoijcleaowVar.f16893zdlpuopuiu = this;
            zoijcleaowVar.f16890iwizpuwonk = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(zoijcleaowVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f16893zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        UserBalance userBalanceGxszxtbevo = ao0.zoijcleaow.gxszxtbevo((List) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
        ppxfxbqfkfVar.draadjrbmk(ao0.zoijcleaow.nufgyqmvbu(userBalanceGxszxtbevo));
        return userBalanceGxszxtbevo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bo0.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        C0303ppxfxbqfkf c0303ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C0303ppxfxbqfkf) {
            c0303ppxfxbqfkf = (C0303ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c0303ppxfxbqfkf.f16884jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0303ppxfxbqfkf.f16884jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0303ppxfxbqfkf = new C0303ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c0303ppxfxbqfkf = new C0303ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0303ppxfxbqfkf.f16886zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0303ppxfxbqfkf.f16884jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            wn0.iobyxmoadg iobyxmoadgVar = this.f16874iobyxmoadg;
            c0303ppxfxbqfkf.f16884jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(c0303ppxfxbqfkf);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((CardActivationInfoResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null)).getIsNeedActivateCard());
    }

    @Override // bo0.iobyxmoadg
    public UserBalance ppxfxbqfkf() {
        UserBalanceEntity userBalanceEntityBtonecajqb = btonecajqb();
        if (userBalanceEntityBtonecajqb != null) {
            return ao0.zoijcleaow.zoijcleaow(userBalanceEntityBtonecajqb);
        }
        return null;
    }

    @Override // bo0.iobyxmoadg
    public lqeggnwhkg wkgbmnqykc() {
        return wflxmlrfwp.zoijcleaow(dxjokdxxww.eablkybsjg(new eablkybsjg(null)), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bo0.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f16887jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f16887jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f16889zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f16887jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            wn0.iobyxmoadg iobyxmoadgVar = this.f16874iobyxmoadg;
            wkgbmnqykcVar.f16887jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(wkgbmnqykcVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ao0.zoijcleaow.eablkybsjg((PersonalCardDataDtoResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
