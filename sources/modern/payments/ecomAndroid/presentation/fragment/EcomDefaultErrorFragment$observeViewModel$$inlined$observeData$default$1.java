package modern.payments.ecomAndroid.presentation.fragment;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.lmojexxdyd;
import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.p003ecomandroid.R;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeData$1"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1", f = "EcomDefaultErrorFragment.kt", l = {43}, m = "invokeSuspend")
public final class EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1 extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {
    final /* synthetic */ sj.lqeggnwhkg $flow;
    final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow $state;
    final /* synthetic */ Fragment $this_observeData;
    int label;
    final /* synthetic */ EcomDefaultErrorFragment this$0;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V", "modern/payments/ecomAndroid/util/extension/FragmentExtensionsKt$observeData$1$1"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1$1", f = "EcomDefaultErrorFragment.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ sj.lqeggnwhkg $flow;
        int label;
        final /* synthetic */ EcomDefaultErrorFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, EcomDefaultErrorFragment ecomDefaultErrorFragment) {
            super(2, gxszxtbevoVar);
            this.$flow = lqeggnwhkgVar;
            this.this$0 = ecomDefaultErrorFragment;
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
                if (lqeggnwhkgVar != null) {
                    final EcomDefaultErrorFragment ecomDefaultErrorFragment = this.this$0;
                    sj.nufgyqmvbu nufgyqmvbuVar = new sj.nufgyqmvbu() { // from class: modern.payments.ecomAndroid.presentation.fragment.EcomDefaultErrorFragment$observeViewModel$.inlined.observeData.default.1.1.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // sj.nufgyqmvbu
                        public final Object emit(T t13, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
                            int i14;
                            State.Error.DefaultException defaultException = (State.Error.DefaultException) t13;
                            TextView ecomLeTvErrorDescr = ecomDefaultErrorFragment.getBinding().ecomLeTvErrorDescr;
                            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ecomLeTvErrorDescr, "ecomLeTvErrorDescr");
                            boolean z13 = defaultException instanceof State.Error.DefaultException.WhilePayment;
                            ecomLeTvErrorDescr.setVisibility(z13 ? 0 : 8);
                            EcomButtonView ecomButtonView = ecomDefaultErrorFragment.getBinding().ecomLeEbvClose;
                            if (z13) {
                                i14 = R.string.ecom_efsf_to_payment_methods_text;
                            } else {
                                if (!(defaultException instanceof State.Error.DefaultException.WhileSessionId ? true : defaultException instanceof State.Error.DefaultException.WhileDeactivateBinding ? true : defaultException instanceof State.Error.DefaultException.UncaughtException)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i14 = R.string.ecom_close;
                            }
                            ecomButtonView.setText(i14);
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
    public EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, EcomDefaultErrorFragment ecomDefaultErrorFragment) {
        super(2, gxszxtbevoVar);
        this.$this_observeData = fragment;
        this.$state = zoijcleaowVar;
        this.$flow = lqeggnwhkgVar;
        this.this$0 = ecomDefaultErrorFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        return new EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1(this.$this_observeData, this.$state, this.$flow, gxszxtbevoVar, this.this$0);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.label;
        if (i13 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Fragment fragment = this.$this_observeData;
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
        return ((EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
