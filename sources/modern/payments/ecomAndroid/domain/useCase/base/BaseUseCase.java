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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦B¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCase;", "RequestBody", "", "params", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Ljava/lang/Object;Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorEntity", "Lmodern/payments/ecomAndroid/domain/State$Error;", "handleFailureResponse", "(Ljava/lang/Object;Lmodern/payments/ecomAndroid/data/api/ErrorEntity;Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "getDefaultException", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;)Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "retry", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BaseUseCase<RequestBody> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <RequestBody> Object handleFailureResponse(BaseUseCase<RequestBody> baseUseCase, RequestBody requestbody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super State.Error> gxszxtbevoVar) {
            if (errorEntity instanceof ErrorEntity.HttpError.NoInternet) {
                return new State.Error.NoInternet(errorEntity, false, new AnonymousClass2(baseUseCase, requestbody, pkzmftpjixVar, null), 2, null);
            }
            return errorEntity instanceof ErrorEntity.HttpError.ServiceUnavailable ? new State.Error.ServerUnavailable(errorEntity, false, 2, null) : baseUseCase.getDefaultException(errorEntity);
        }

        public static /* synthetic */ Object invoke$default(BaseUseCase baseUseCase, Object obj, pkzmftpjix pkzmftpjixVar, gxszxtbevo gxszxtbevoVar, int i13, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i13 & 2) != 0) {
                pkzmftpjixVar = ikoacuggdj.zoijcleaow();
            }
            return baseUseCase.invoke(obj, pkzmftpjixVar, gxszxtbevoVar);
        }

        public static <RequestBody> Object retry(BaseUseCase<RequestBody> baseUseCase, RequestBody requestbody, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            Object objInvoke = baseUseCase.invoke(requestbody, pkzmftpjixVar, gxszxtbevoVar);
            return objInvoke == zoijcleaow.gxszxtbevo() ? objInvoke : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase$handleFailureResponse$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"RequestBody", "Lgg/wwaezpbzkn;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase$handleFailureResponse$2", f = "BaseUseCase.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements tg.draadjrbmk {
        final /* synthetic */ pkzmftpjix $dispatcher;
        final /* synthetic */ RequestBody $params;
        int label;
        final /* synthetic */ BaseUseCase<RequestBody> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BaseUseCase<RequestBody> baseUseCase, RequestBody requestbody, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.this$0 = baseUseCase;
            this.$params = requestbody;
            this.$dispatcher = pkzmftpjixVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo<wwaezpbzkn> create(gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass2(this.this$0, this.$params, this.$dispatcher, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                BaseUseCase<RequestBody> baseUseCase = this.this$0;
                RequestBody requestbody = this.$params;
                pkzmftpjix pkzmftpjixVar = this.$dispatcher;
                this.label = 1;
                if (baseUseCase.retry(requestbody, pkzmftpjixVar, this) == objGxszxtbevo) {
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

    Object handleFailureResponse(RequestBody requestbody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super State.Error> gxszxtbevoVar);

    Object invoke(RequestBody requestbody, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object retry(RequestBody requestbody, pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);
}
