package modern.payments.ecomAndroid.util.event;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\u0007R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/util/event/Event;", "T", "", "content", "<init>", "(Ljava/lang/Object;)V", "getEventOrNull", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lgg/wwaezpbzkn;", "block", "process", "(Ltg/draadjrbmk;)V", "peek", "peekOrNull", "Ljava/lang/Object;", "", "hasBeenHandled", "Z", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Event<T> {
    private final T content;
    private boolean hasBeenHandled;

    public Event(T t13) {
        this.content = t13;
    }

    public final T getEventOrNull() {
        if (this.hasBeenHandled) {
            return null;
        }
        this.hasBeenHandled = true;
        return this.content;
    }

    public final T peek() {
        return this.content;
    }

    public final T peekOrNull() {
        if (this.hasBeenHandled) {
            return null;
        }
        return this.content;
    }

    public final void process(draadjrbmk block) {
        zdlpuopuiu.btonecajqb(block, "block");
        if (this.hasBeenHandled) {
            return;
        }
        this.hasBeenHandled = true;
        block.invoke(this.content);
    }
}
