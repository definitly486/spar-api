package modern.payments.ecomAndroid.domain.useCase.base;

import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import pj.ikoacuggdj;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001a\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H¦B¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCaseWithoutParams;", "T", "", "Lpj/pkzmftpjix;", "dispatcher", "invoke", "(Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorEntity", "Lmodern/payments/ecomAndroid/domain/State$Error;", "handleFailureResponse", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "getDefaultException", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;)Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lgg/wwaezpbzkn;", "retry", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BaseUseCaseWithoutParams<T> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T> Object handleFailureResponse(BaseUseCaseWithoutParams<T> baseUseCaseWithoutParams, ErrorEntity errorEntity, gxszxtbevo<? super State.Error> gxszxtbevoVar) {
            return errorEntity instanceof ErrorEntity.HttpError.NoInternet ? new State.Error.NoInternet(errorEntity, false, new AnonymousClass2(baseUseCaseWithoutParams, null), 2, null) : baseUseCaseWithoutParams.getDefaultException(errorEntity);
        }

        public static /* synthetic */ Object invoke$default(BaseUseCaseWithoutParams baseUseCaseWithoutParams, pkzmftpjix pkzmftpjixVar, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i13 & 1) != 0) {
                pkzmftpjixVar = ikoacuggdj.zoijcleaow();
            }
            return baseUseCaseWithoutParams.invoke(pkzmftpjixVar, gxszxtbevoVar);
        }

        public static <T> Object retry(BaseUseCaseWithoutParams<T> baseUseCaseWithoutParams, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            Object objInvoke$default = invoke$default(baseUseCaseWithoutParams, null, gxszxtbevoVar, 1, null);
            return objInvoke$default == zoijcleaow.gxszxtbevo() ? objInvoke$default : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.base.BaseUseCaseWithoutParams$handleFailureResponse$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lgg/wwaezpbzkn;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.base.BaseUseCaseWithoutParams$handleFailureResponse$2", f = "BaseUseCaseWithoutParams.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements tg.draadjrbmk {
        int label;
        final /* synthetic */ BaseUseCaseWithoutParams<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BaseUseCaseWithoutParams<T> baseUseCaseWithoutParams, gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.this$0 = baseUseCaseWithoutParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo<wwaezpbzkn> create(gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass2(this.this$0, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                BaseUseCaseWithoutParams<T> baseUseCaseWithoutParams = this.this$0;
                this.label = 1;
                if (baseUseCaseWithoutParams.retry(this) == objGxszxtbevo) {
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

        @Override // tg.draadjrbmk
        public final Object invoke(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass2) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    State.Error.DefaultException getDefaultException(ErrorEntity errorEntity);

    Object handleFailureResponse(ErrorEntity errorEntity, gxszxtbevo<? super State.Error> gxszxtbevoVar);

    Object invoke(pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super T> gxszxtbevoVar);

    Object retry(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);
}
