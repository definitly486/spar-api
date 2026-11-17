package modern.payments.ecomAndroid.presentation.base;

import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.jvm.internal.gtknphoqwx;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.fragment.MerchantAnalyticalEvent;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000e\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0084@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0084@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "ActionEvent", "Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;)V", "Lkotlin/Function1;", "Llg/gxszxtbevo;", "Lgg/wwaezpbzkn;", "", "block", "onIO", "(Ltg/draadjrbmk;Llg/gxszxtbevo;)Ljava/lang/Object;", "onUI", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "event", "handleViewState", "(Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;)V", "handleEvent", "(Ljava/lang/Object;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "handleAnalyticalEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;)V", "closeSdk", "()V", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lsj/zynmafqrjb;", "_viewState", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "viewState", "Lsj/wypolnanlu;", "getViewState", "()Lsj/wypolnanlu;", "LifecycleEvent", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseViewModel<ActionEvent> extends ntlheqmsrt {
    private final zynmafqrjb _viewState;
    private final ConfigRepository configRepository;
    private final Reducer reducer;
    private final wypolnanlu viewState;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "", "()V", "OnCreate", "OnDestroy", "OnPause", "OnResume", "OnStart", "OnStop", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnCreate;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnDestroy;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnPause;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnResume;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnStart;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnStop;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class LifecycleEvent {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnCreate;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnCreate extends LifecycleEvent {
            public static final OnCreate INSTANCE = new OnCreate();

            private OnCreate() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnCreate);
            }

            public int hashCode() {
                return 739409480;
            }

            public String toString() {
                return "OnCreate";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnDestroy;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnDestroy extends LifecycleEvent {
            public static final OnDestroy INSTANCE = new OnDestroy();

            private OnDestroy() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnDestroy);
            }

            public int hashCode() {
                return 1975675950;
            }

            public String toString() {
                return "OnDestroy";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnPause;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnPause extends LifecycleEvent {
            public static final OnPause INSTANCE = new OnPause();

            private OnPause() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnPause);
            }

            public int hashCode() {
                return 1697935146;
            }

            public String toString() {
                return "OnPause";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnResume;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnResume extends LifecycleEvent {
            public static final OnResume INSTANCE = new OnResume();

            private OnResume() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnResume);
            }

            public int hashCode() {
                return 1157277049;
            }

            public String toString() {
                return "OnResume";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnStart;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnStart extends LifecycleEvent {
            public static final OnStart INSTANCE = new OnStart();

            private OnStart() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnStart);
            }

            public int hashCode() {
                return 1701252502;
            }

            public String toString() {
                return "OnStart";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent$OnStop;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnStop extends LifecycleEvent {
            public static final OnStop INSTANCE = new OnStop();

            private OnStop() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnStop);
            }

            public int hashCode() {
                return 886163534;
            }

            public String toString() {
                return "OnStop";
            }
        }

        public /* synthetic */ LifecycleEvent(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private LifecycleEvent() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.base.BaseViewModel$onIO$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"ActionEvent", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.base.BaseViewModel$onIO$2", f = "BaseViewModel.kt", l = {33}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ tg.draadjrbmk $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$block = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass2(this.$block, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                tg.draadjrbmk draadjrbmkVar = this.$block;
                this.label = 1;
                if (draadjrbmkVar.invoke(this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.base.BaseViewModel$onUI$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"ActionEvent", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.base.BaseViewModel$onUI$2", f = "BaseViewModel.kt", l = {42}, m = "invokeSuspend")
    static final class C40662 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ tg.draadjrbmk $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40662(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo<? super C40662> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$block = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new C40662(this.$block, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                tg.draadjrbmk draadjrbmkVar = this.$block;
                this.label = 1;
                if (draadjrbmkVar.invoke(this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40662) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public BaseViewModel(ConfigRepository configRepository, Reducer reducer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        this.configRepository = configRepository;
        this.reducer = reducer;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(null);
        this._viewState = zynmafqrjbVarIobyxmoadg;
        this.viewState = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
    }

    protected final void closeSdk() {
        this.reducer.invoke(new Action.HandleCloseAction(ulzqkzuiru.iobyxmoadg(this)));
    }

    public final wypolnanlu getViewState() {
        return this.viewState;
    }

    public void handleAnalyticalEvent(MerchantAnalyticalEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
    }

    public void handleEvent(ActionEvent event) {
    }

    public void handleViewState(LifecycleEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this._viewState.setValue(event);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, LifecycleEvent.OnCreate.INSTANCE) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, LifecycleEvent.OnDestroy.INSTANCE) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, LifecycleEvent.OnPause.INSTANCE) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, LifecycleEvent.OnResume.INSTANCE) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, LifecycleEvent.OnStart.INSTANCE)) {
            return;
        }
        kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, LifecycleEvent.OnStop.INSTANCE);
    }

    protected final Object onIO(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(ikoacuggdj.zoijcleaow(), new AnonymousClass2(draadjrbmkVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    protected final Object onUI(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(ikoacuggdj.ppxfxbqfkf(), new C40662(draadjrbmkVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }
}
