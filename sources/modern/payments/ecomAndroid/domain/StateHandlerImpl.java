package modern.payments.ecomAndroid.domain;

import android.util.Log;
import kotlin.Metadata;
import modern.payments.ecomAndroid.util.event.Event;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\nR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/StateHandlerImpl;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "<init>", "()V", "Lmodern/payments/ecomAndroid/domain/State;", "state", "Lgg/wwaezpbzkn;", "setState", "(Lmodern/payments/ecomAndroid/domain/State;)V", "getState", "()Lmodern/payments/ecomAndroid/domain/State;", "getPreviousState", "resetState", "Lsj/zynmafqrjb;", "Lmodern/payments/ecomAndroid/util/event/Event;", "_state", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "Lsj/wypolnanlu;", "()Lsj/wypolnanlu;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StateHandlerImpl implements StateHandler {
    private final zynmafqrjb _state;
    private final wypolnanlu state;

    public StateHandlerImpl() {
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(new Event(null));
        this._state = zynmafqrjbVarIobyxmoadg;
        this.state = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
    }

    @Override // modern.payments.ecomAndroid.domain.StateHandler
    public State getPreviousState() {
        return (State) ((Event) getState().getValue()).peek();
    }

    @Override // modern.payments.ecomAndroid.domain.StateHandler
    public wypolnanlu getState() {
        return this.state;
    }

    @Override // modern.payments.ecomAndroid.domain.StateHandler
    public State resetState() {
        setState(null);
        return getState();
    }

    @Override // modern.payments.ecomAndroid.domain.StateHandler
    public void setState(State state) {
        Log.d("StateHandler", String.valueOf(state));
        this._state.setValue(new Event(state));
    }

    @Override // modern.payments.ecomAndroid.domain.StateHandler
    public State getState() {
        return (State) ((Event) getState().getValue()).getEventOrNull();
    }
}
