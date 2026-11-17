package modern.payments.ecomAndroid.presentation.viewModel;

import androidx.lifecycle.ulzqkzuiru;
import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.tracker.util.logging.LogFileManager;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomLoggerViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "Lmodern/payments/ecomAndroid/presentation/viewModel/LoggerEvent;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/tracker/util/logging/LogFileManager;", "logFileManager", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "screenState", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/tracker/util/logging/LogFileManager;Lmodern/payments/ecomAndroid/domain/StateHandler;)V", "Lgg/wwaezpbzkn;", "getLogFileInfo", "()V", "event", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/viewModel/LoggerEvent;)V", "Lmodern/payments/tracker/util/logging/LogFileManager;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "Lsj/zynmafqrjb;", "", "_logContent", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "logContent", "Lsj/wypolnanlu;", "getLogContent", "()Lsj/wypolnanlu;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomLoggerViewModel extends BaseViewModel<LoggerEvent> {
    private final zynmafqrjb _logContent;
    private final wypolnanlu logContent;
    private final LogFileManager logFileManager;
    private final StateHandler screenState;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomLoggerViewModel$getLogFileInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomLoggerViewModel$getLogFileInfo$1", f = "EcomLoggerViewModel.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        Object L$0;
        int label;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomLoggerViewModel.this.new AnonymousClass1(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zynmafqrjb zynmafqrjbVar;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zynmafqrjb zynmafqrjbVar2 = EcomLoggerViewModel.this._logContent;
                LogFileManager logFileManager = EcomLoggerViewModel.this.logFileManager;
                this.L$0 = zynmafqrjbVar2;
                this.label = 1;
                Object currentLogFileContent = logFileManager.getCurrentLogFileContent(this);
                if (currentLogFileContent == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zynmafqrjbVar = zynmafqrjbVar2;
                obj = currentLogFileContent;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zynmafqrjbVar = (zynmafqrjb) this.L$0;
                zdlpuopuiu.zoijcleaow(obj);
            }
            zynmafqrjbVar.setValue(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomLoggerViewModel(ConfigRepository configRepository, Reducer reducer, LogFileManager logFileManager, StateHandler screenState) {
        super(configRepository, reducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logFileManager, "logFileManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screenState, "screenState");
        this.logFileManager = logFileManager;
        this.screenState = screenState;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(null);
        this._logContent = zynmafqrjbVarIobyxmoadg;
        this.logContent = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        getLogFileInfo();
    }

    private final void getLogFileInfo() {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final wypolnanlu getLogContent() {
        return this.logContent;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(LoggerEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof LoggerEvent.CloseDialog) {
            StateHandler stateHandler = this.screenState;
            State previousState = stateHandler.getPreviousState();
            stateHandler.setState(new State.Loading.JustASecond(null, 1, null));
            stateHandler.setState(previousState);
        }
    }
}
