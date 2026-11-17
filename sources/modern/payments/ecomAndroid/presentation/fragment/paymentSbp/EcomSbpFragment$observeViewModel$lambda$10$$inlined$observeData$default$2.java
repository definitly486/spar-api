package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.lmojexxdyd;
import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import modern.payments.ecomAndroid.presentation.base.KeyboardState;
import modern.payments.ecomAndroid.util.extension.ContextExtensionsKt;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomFragmentSbpBinding;
import pj.cllcsxoeiz;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeData$1"}, k = 3, mv = {1, 9, 0})
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2", f = "EcomSbpFragment.kt", l = {43}, m = "invokeSuspend")
public final class EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2 extends draadjrbmk implements rgvfuqvkyq {
    final /* synthetic */ lqeggnwhkg $flow;
    final /* synthetic */ gtknphoqwx.zoijcleaow $state;
    final /* synthetic */ Fragment $this_observeData;
    final /* synthetic */ EcomFragmentSbpBinding $this_with$inlined;
    int label;
    final /* synthetic */ EcomSbpFragment this$0;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeData$1$1"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2$1", f = "EcomSbpFragment.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ lqeggnwhkg $flow;
        final /* synthetic */ EcomFragmentSbpBinding $this_with$inlined;
        int label;
        final /* synthetic */ EcomSbpFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, EcomSbpFragment ecomSbpFragment, EcomFragmentSbpBinding ecomFragmentSbpBinding) {
            super(2, gxszxtbevoVar);
            this.$flow = lqeggnwhkgVar;
            this.this$0 = ecomSbpFragment;
            this.$this_with$inlined = ecomFragmentSbpBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass1(this.$flow, gxszxtbevoVar, this.this$0, this.$this_with$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVar = this.$flow;
                if (lqeggnwhkgVar != null) {
                    final EcomSbpFragment ecomSbpFragment = this.this$0;
                    final EcomFragmentSbpBinding ecomFragmentSbpBinding = this.$this_with$inlined;
                    nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$lambda$10$.inlined.observeData.default.2.1.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // sj.nufgyqmvbu
                        public final Object emit(T t13, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
                            final KeyboardState keyboardState = (KeyboardState) t13;
                            if (keyboardState.getIsVisible()) {
                                View viewRequireView = ecomSbpFragment.requireView();
                                final EcomFragmentSbpBinding ecomFragmentSbpBinding2 = ecomFragmentSbpBinding;
                                final EcomSbpFragment ecomSbpFragment2 = ecomSbpFragment;
                                viewRequireView.post(new Runnable() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$1$3$1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ViewGroup.LayoutParams layoutParams = ecomFragmentSbpBinding2.ecomEfsbpRoot.getLayoutParams();
                                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        KeyboardState keyboardState2 = keyboardState;
                                        EcomSbpFragment ecomSbpFragment3 = ecomSbpFragment2;
                                        int keyBoardHeight = keyboardState2.getKeyBoardHeight();
                                        Context contextRequireContext = ecomSbpFragment3.requireContext();
                                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
                                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = keyBoardHeight - ContextExtensionsKt.getIntDimension(contextRequireContext, R.dimen.ecom_4dp);
                                    }
                                });
                            } else {
                                View viewRequireView2 = ecomSbpFragment.requireView();
                                final EcomFragmentSbpBinding ecomFragmentSbpBinding3 = ecomFragmentSbpBinding;
                                final EcomSbpFragment ecomSbpFragment3 = ecomSbpFragment;
                                viewRequireView2.post(new Runnable() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$observeViewModel$1$3$2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ViewGroup.LayoutParams layoutParams = ecomFragmentSbpBinding3.ecomEfsbpRoot.getLayoutParams();
                                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        KeyboardState keyboardState2 = keyboardState;
                                        EcomSbpFragment ecomSbpFragment4 = ecomSbpFragment3;
                                        int keyBoardHeight = keyboardState2.getKeyBoardHeight();
                                        Context contextRequireContext = ecomSbpFragment4.requireContext();
                                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
                                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = keyBoardHeight + ContextExtensionsKt.getIntDimension(contextRequireContext, R.dimen.ecom_16dp);
                                        ViewGroup.LayoutParams layoutParams2 = ecomFragmentSbpBinding3.ecomEfsbpRoot.getLayoutParams();
                                        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
                                        if (layoutParams3 != null) {
                                            layoutParams3.height = ecomFragmentSbpBinding3.ecomEfsbpRoot.getHeight() + keyboardState.getKeyBoardHeight();
                                        }
                                    }
                                });
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                    };
                    this.label = 1;
                    if (lqeggnwhkgVar.collect(nufgyqmvbuVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
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
    public EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, EcomSbpFragment ecomSbpFragment, EcomFragmentSbpBinding ecomFragmentSbpBinding) {
        super(2, gxszxtbevoVar);
        this.$this_observeData = fragment;
        this.$state = zoijcleaowVar;
        this.$flow = lqeggnwhkgVar;
        this.this$0 = ecomSbpFragment;
        this.$this_with$inlined = ecomFragmentSbpBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        return new EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2(this.$this_observeData, this.$state, this.$flow, gxszxtbevoVar, this.this$0, this.$this_with$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.label;
        if (i13 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Fragment fragment = this.$this_observeData;
            gtknphoqwx.zoijcleaow zoijcleaowVar = this.$state;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, null, this.this$0, this.$this_with$inlined);
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
        return ((EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
