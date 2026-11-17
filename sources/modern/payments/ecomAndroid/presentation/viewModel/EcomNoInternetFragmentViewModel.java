package modern.payments.ecomAndroid.presentation.viewModel;

import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.util.TryAgainListener;
import modern.payments.ecomAndroid.util.event.Event;
import modern.payments.ecomAndroid.util.media.MediaPlayer;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import pj.ikoacuggdj;
import sj.dxjokdxxww;
import sj.jpowsppfya;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.wypolnanlu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomNoInternetFragmentViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "screenState", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/util/media/MediaPlayer;", "mediaPlayer", "<init>", "(Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/util/media/MediaPlayer;)V", "Lgg/wwaezpbzkn;", "handleTryAgainBtnClick", "()V", "event", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/viewModel/NoInternetEvent;)V", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "handleViewState", "(Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;)V", "Lmodern/payments/ecomAndroid/util/media/MediaPlayer;", "", "isSoundPlayed", "Z", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/util/TryAgainListener;", "callback", "Lsj/wypolnanlu;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomNoInternetFragmentViewModel extends BaseViewModel<NoInternetEvent> {
    private final wypolnanlu callback;
    private boolean isSoundPlayed;
    private final MediaPlayer mediaPlayer;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$handleTryAgainBtnClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$handleTryAgainBtnClick$1", f = "EcomNoInternetFragmentViewModel.kt", l = {58}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomNoInternetFragmentViewModel.this.new AnonymousClass1(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                EcomNoInternetFragmentViewModel.this.isSoundPlayed = false;
                TryAgainListener tryAgainListener = (TryAgainListener) EcomNoInternetFragmentViewModel.this.callback.getValue();
                if (tryAgainListener != null) {
                    this.label = 1;
                    obj = tryAgainListener.onTryAgainClicked(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomNoInternetFragmentViewModel(StateHandler screenState, Reducer reducer, ConfigRepository configRepository, MediaPlayer mediaPlayer) {
        super(configRepository, reducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screenState, "screenState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mediaPlayer, "mediaPlayer");
        this.mediaPlayer = mediaPlayer;
        final wypolnanlu state = screenState.getState();
        final lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$1$2", f = "EcomNoInternetFragmentViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
                    if (gxszxtbevoVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        Object objPeek = ((Event) obj).peek();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(objPeek, anonymousClass1) == objGxszxtbevo) {
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

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = state.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        final lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$filterIsInstance$1$2", f = "EcomNoInternetFragmentViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
                    if (gxszxtbevoVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        if (obj instanceof State.Error.NoInternet) {
                            anonymousClass1.label = 1;
                            if (nufgyqmvbuVar.emit(obj, anonymousClass1) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
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

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = lqeggnwhkgVar.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        this.callback = dxjokdxxww.ribwqtqdhb(new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel$special$$inlined$map$2$2", f = "EcomNoInternetFragmentViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
                    if (gxszxtbevoVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        TryAgainListener tryAgainListener = new TryAgainListener(((State.Error.NoInternet) obj).getCaller());
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(tryAgainListener, anonymousClass1) == objGxszxtbevo) {
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

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = lqeggnwhkgVar2.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, ulzqkzuiru.iobyxmoadg(this), jpowsppfya.f106926iobyxmoadg.ppxfxbqfkf(), null);
    }

    private final void handleTryAgainBtnClick() {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new AnonymousClass1(null), 2, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleViewState(BaseViewModel.LifecycleEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        super.handleViewState(event);
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, BaseViewModel.LifecycleEvent.OnStart.INSTANCE) || this.isSoundPlayed) {
            return;
        }
        this.mediaPlayer.playUnsuccessfulSound();
        this.isSoundPlayed = true;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(NoInternetEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, NoInternetEvent.ToPaymentMethodsEvent.INSTANCE)) {
            closeSdk();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, NoInternetEvent.TryAgainEvent.INSTANCE)) {
            handleTryAgainBtnClick();
        }
    }
}
