package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.lmojexxdyd;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.jvm.internal.jyumaefscl;
import modern.payments.ecomAndroid.util.event.Event;
import pj.cllcsxoeiz;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeEvent$1"}, k = 3, mv = {1, 9, 0})
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1", f = "EcomSbpFragment.kt", l = {56}, m = "invokeSuspend")
public final class EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1 extends draadjrbmk implements rgvfuqvkyq {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ lqeggnwhkg $flow;
    final /* synthetic */ gtknphoqwx.zoijcleaow $state;
    final /* synthetic */ Fragment $this_observeEvent;
    int label;
    final /* synthetic */ EcomSbpFragment this$0;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeEvent$1$1"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1$1", f = "EcomSbpFragment.kt", l = {57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ lqeggnwhkg $flow;
        int label;
        final /* synthetic */ EcomSbpFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, Context context, EcomSbpFragment ecomSbpFragment) {
            super(2, gxszxtbevoVar);
            this.$flow = lqeggnwhkgVar;
            this.$context$inlined = context;
            this.this$0 = ecomSbpFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass1(this.$flow, gxszxtbevoVar, this.$context$inlined, this.this$0);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVar = this.$flow;
                final Context context = this.$context$inlined;
                final EcomSbpFragment ecomSbpFragment = this.this$0;
                nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$.inlined.observeEvent.default.1.1.1

                    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "data", "Lgg/wwaezpbzkn;", "invoke", "(Ljava/lang/Object;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeEvent$1$1$1$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    public static final class AnonymousClass2 extends jyumaefscl implements tg.draadjrbmk {
                        final /* synthetic */ Context $context$inlined;
                        final /* synthetic */ EcomSbpFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(Context context, EcomSbpFragment ecomSbpFragment) {
                            super(1);
                            this.$context$inlined = context;
                            this.this$0 = ecomSbpFragment;
                        }

                        @Override // tg.draadjrbmk
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m17invoke(obj);
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m17invoke(T t13) {
                            SbpFragmentViewAction sbpFragmentViewAction = (SbpFragmentViewAction) t13;
                            if (sbpFragmentViewAction instanceof SbpFragmentViewAction.TryToOpenBankApp) {
                                try {
                                    this.$context$inlined.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((SbpFragmentViewAction.TryToOpenBankApp) sbpFragmentViewAction).getUrl())));
                                    return;
                                } catch (Exception e13) {
                                    EcomSbpFragment.access$getViewModel(this.this$0).handleEvent((SbpScreenEvent) new SbpScreenEvent.TryToOpenBankAppFailedEvent(e13));
                                    return;
                                }
                            }
                            if (sbpFragmentViewAction instanceof SbpFragmentViewAction.TryToOpenBankWebApp) {
                                try {
                                    this.$context$inlined.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((SbpFragmentViewAction.TryToOpenBankWebApp) sbpFragmentViewAction).getUrl())));
                                    return;
                                } catch (Exception e14) {
                                    EcomSbpFragment.access$getViewModel(this.this$0).handleEvent((SbpScreenEvent) new SbpScreenEvent.TryToOpenBankWebAppFailedEvent(e14));
                                    return;
                                }
                            }
                            if (sbpFragmentViewAction instanceof SbpFragmentViewAction.TryToOpenNspkBankUri) {
                                try {
                                    this.$context$inlined.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((SbpFragmentViewAction.TryToOpenNspkBankUri) sbpFragmentViewAction).getUrl())));
                                } catch (Exception e15) {
                                    EcomSbpFragment.access$getViewModel(this.this$0).handleEvent((SbpScreenEvent) new SbpScreenEvent.TryToOpenNspkBankUriFailedEvent(e15));
                                }
                            }
                        }
                    }

                    @Override // sj.nufgyqmvbu
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, lg.gxszxtbevo gxszxtbevoVar) {
                        return emit((Event) obj2, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
                    }

                    public final Object emit(Event<? extends T> event, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
                        event.process(new AnonymousClass2(context, ecomSbpFragment));
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
    public EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, Context context, EcomSbpFragment ecomSbpFragment) {
        super(2, gxszxtbevoVar);
        this.$this_observeEvent = fragment;
        this.$state = zoijcleaowVar;
        this.$flow = lqeggnwhkgVar;
        this.$context$inlined = context;
        this.this$0 = ecomSbpFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        return new EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1(this.$this_observeEvent, this.$state, this.$flow, gxszxtbevoVar, this.$context$inlined, this.this$0);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.label;
        if (i13 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Fragment fragment = this.$this_observeEvent;
            gtknphoqwx.zoijcleaow zoijcleaowVar = this.$state;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, null, this.$context$inlined, this.this$0);
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
        return ((EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
