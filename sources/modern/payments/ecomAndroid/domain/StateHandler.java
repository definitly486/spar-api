package modern.payments.ecomAndroid.domain;

import kotlin.Metadata;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\bR\"\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/domain/StateHandler;", "", "Lmodern/payments/ecomAndroid/domain/State;", "state", "Lgg/wwaezpbzkn;", "setState", "(Lmodern/payments/ecomAndroid/domain/State;)V", "getState", "()Lmodern/payments/ecomAndroid/domain/State;", "getPreviousState", "resetState", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/util/event/Event;", "()Lsj/wypolnanlu;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StateHandler {
    State getPreviousState();

    State getState();

    /* JADX INFO: renamed from: getState, reason: collision with other method in class */
    wypolnanlu mo15getState();

    State resetState();

    void setState(State state);
}
