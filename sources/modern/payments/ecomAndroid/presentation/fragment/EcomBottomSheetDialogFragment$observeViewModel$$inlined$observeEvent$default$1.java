package modern.payments.ecomAndroid.presentation.fragment;

import android.app.Dialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.lmojexxdyd;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.util.event.Event;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeEvent$1"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1", f = "EcomBottomSheetDialogFragment.kt", l = {56}, m = "invokeSuspend")
public final class EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1 extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {
    final /* synthetic */ sj.lqeggnwhkg $flow;
    final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow $state;
    final /* synthetic */ Fragment $this_observeEvent;
    int label;
    final /* synthetic */ EcomBottomSheetDialogFragment this$0;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeEvent$1$1"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1$1", f = "EcomBottomSheetDialogFragment.kt", l = {57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ sj.lqeggnwhkg $flow;
        int label;
        final /* synthetic */ EcomBottomSheetDialogFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment) {
            super(2, gxszxtbevoVar);
            this.$flow = lqeggnwhkgVar;
            this.this$0 = ecomBottomSheetDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass1(this.$flow, gxszxtbevoVar, this.this$0);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVar = this.$flow;
                final EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment = this.this$0;
                sj.nufgyqmvbu nufgyqmvbuVar = new sj.nufgyqmvbu() { // from class: modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment$observeViewModel$.inlined.observeEvent.default.1.1.1

                    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "data", "Lgg/wwaezpbzkn;", "invoke", "(Ljava/lang/Object;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeEvent$1$1$1$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    public static final class AnonymousClass2 extends jyumaefscl implements tg.draadjrbmk {
                        final /* synthetic */ EcomBottomSheetDialogFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment) {
                            super(1);
                            this.this$0 = ecomBottomSheetDialogFragment;
                        }

                        @Override // tg.draadjrbmk
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16invoke(obj);
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m16invoke(T t13) {
                            State state = (State) t13;
                            if (state instanceof State.Loading) {
                                this.this$0.showLoadingFragment();
                                return;
                            }
                            if (state instanceof State.Error) {
                                this.this$0.showErrorFragment((State.Error) state);
                                return;
                            }
                            if (state instanceof State.PaymentMethodScreen) {
                                this.this$0.showPaymentModeFragment();
                                return;
                            }
                            if (state instanceof State.AddNewCard) {
                                this.this$0.showEcomAddNewCardFragment();
                                return;
                            }
                            if (state instanceof State.SbpPay) {
                                this.this$0.showSbpFragment();
                                return;
                            }
                            if (state instanceof State.ThreeDSWebViewChallenge) {
                                this.this$0.showChallengeFragment();
                                return;
                            }
                            if (state instanceof State.ThreeDSMethodWebView) {
                                this.this$0.show3dsMethodFragment();
                                return;
                            }
                            if (state instanceof State.PaymentResult.Success) {
                                this.this$0.showSuccessfulFragment();
                                return;
                            }
                            if (state instanceof State.PaymentResult.Waiting) {
                                EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment = this.this$0;
                                Dialog dialogRequireDialog = ecomBottomSheetDialogFragment.requireDialog();
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dialogRequireDialog, "requireDialog(...)");
                                ecomBottomSheetDialogFragment.onCancel(dialogRequireDialog);
                                return;
                            }
                            if (state instanceof State.PaymentResult.Failure) {
                                this.this$0.showFailureFragment();
                                return;
                            }
                            if (state instanceof State.SPaySdk.StartPayment) {
                                this.this$0.invokeSPayPayment();
                            } else if (state == null) {
                                EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment2 = this.this$0;
                                Dialog dialogRequireDialog2 = ecomBottomSheetDialogFragment2.requireDialog();
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dialogRequireDialog2, "requireDialog(...)");
                                ecomBottomSheetDialogFragment2.onCancel(dialogRequireDialog2);
                            }
                        }
                    }

                    @Override // sj.nufgyqmvbu
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, lg.gxszxtbevo gxszxtbevoVar) {
                        return emit((Event) obj2, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
                    }

                    public final Object emit(Event<? extends T> event, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
                        event.process(new AnonymousClass2(ecomBottomSheetDialogFragment));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                };
                this.label = 1;
                if (lqeggnwhkgVar.collect(nufgyqmvbuVar, this) == objGxszxtbevo) {
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
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment) {
        super(2, gxszxtbevoVar);
        this.$this_observeEvent = fragment;
        this.$state = zoijcleaowVar;
        this.$flow = lqeggnwhkgVar;
        this.this$0 = ecomBottomSheetDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        return new EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1(this.$this_observeEvent, this.$state, this.$flow, gxszxtbevoVar, this.this$0);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.label;
        if (i13 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Fragment fragment = this.$this_observeEvent;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.$state;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, null, this.this$0);
            this.label = 1;
            if (lmojexxdyd.zoijcleaow(fragment, zoijcleaowVar, anonymousClass1, this) == objGxszxtbevo) {
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
        return ((EcomBottomSheetDialogFragment$observeViewModel$$inlined$observeEvent$default$1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
